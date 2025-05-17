PROGRAM CampoMinadoWinAPI;

USES
  Windows, Messages;

CONST
  CELL_SIZE = 30;
  GRID_ROWS = 10;
  GRID_COLS = 10;
  NUM_MINES = 10;

TYPE
  TCell = RECORD
  hasMine: BOOLEAN;
  revealed: BOOLEAN;
  flagged: BOOLEAN;
  neighborMines: INTEGER;
    END;

VAR
  Cells: ARRAY[0..GRID_ROWS - 1, 0..GRID_COLS - 1] OF TCell;
  hwndMain: HWND;
  gameOver: BOOLEAN = FALSE;

  PROCEDURE InitGame;
  VAR
  i, j, placed, r, c, dr, dc: INTEGER;
  BEGIN
  // Zera o campo
  FOR i := 0 TO GRID_ROWS - 1 DO
    begin 
      FOR j := 0 TO GRID_COLS - 1 DO
        begin 
          Cells[i][j] := Default(TCell) 
        end 
    end;

  // Coloca minas aleatórias
  placed := 0;
  Randomize;
  WHILE placed < NUM_MINES DO
    BEGIN
      r := Random(GRID_ROWS);
      c := Random(GRID_COLS);
      IF NOT Cells[r][c].hasMine THEN
        BEGIN
          Cells[r][c].hasMine := TRUE;
          Inc(placed);
        END;
     END;

  // Conta minas vizinhas
  FOR r := 0 TO GRID_ROWS - 1 DO
    begin 
      FOR c := 0 TO GRID_COLS - 1 DO
        begin 
            IF NOT Cells[r][c].hasMine THEN
              begin 
                FOR dr := -1 TO 1 DO
                  begin 
                    FOR dc := -1 TO 1 DO
                      begin 
                        IF (dr <> 0) OR (dc <> 0) THEN
                          begin 
                            IF (r + dr >= 0) AND (r + dr < GRID_ROWS) AND
  (c + dc >= 0) AND (c + dc < GRID_COLS) THEN
                                begin 
                                    IF Cells[r + dr][c + dc].hasMine THEN
                                        begin 
                                        Inc(Cells[r][c].neighborMines) 
                                        end 
                                 end 
                            end 
                        end 
                     end 
                  end 
               end 
            end;
  END;      

  PROCEDURE RevealCell(r, c: INTEGER);
  VAR
  dr, dc: INTEGER;
  BEGIN
  IF (r < 0) OR (r >= GRID_ROWS) OR (c < 0) OR (c >= GRID_COLS) THEN
    begin 
      Exit 
     end;
  IF Cells[r][c].revealed OR Cells[r][c].flagged THEN
    begin 
      Exit 
     end;

  Cells[r][c].revealed := TRUE;

  IF Cells[r][c].hasMine THEN
    BEGIN
  gameOver := TRUE;
  MessageBox(0, 'Kaboom! Você perdeu.', 'Game Over', MB_ICONERROR);
  InvalidateRect(hwndMain, NIL, TRUE);
  Exit;
    END;

  IF Cells[r][c].neighborMines = 0 THEN
    begin 
      FOR dr := -1 TO 1 DO
        begin 
          FOR dc := -1 TO 1 DO
            begin 
              IF (dr <> 0) OR (dc <> 0) THEN
                begin 
                  RevealCell(r + dr, c + dc) 
                end 
             end 
          end 
      end;
  END;

  PROCEDURE DrawField(hdc: HDC);
  VAR
  r, c: INTEGER;
  rect: TRect;
  txt: STRING;
  brush: HBRUSH;
  BEGIN
  FOR r := 0 TO GRID_ROWS - 1 DO
    begin FOR c := 0 TO GRID_COLS - 1 DO
    BEGIN
  rect.Left := c * CELL_SIZE;
  rect.Top := r * CELL_SIZE;
  rect.Right := rect.Left + CELL_SIZE;
  rect.Bottom := rect.Top + CELL_SIZE;

  IF Cells[r][c].revealed THEN
    BEGIN
  FillRect(hdc, rect, GetStockObject(WHITE_BRUSH));
  Rectangle(hdc, rect.Left, rect.Top, rect.Right, rect.Bottom);
  IF Cells[r][c].hasMine THEN
    begin TextOut(hdc, rect.Left + 10, rect.Top + 8, 'X', 1) end
  ELSE
  IF Cells[r][c].neighborMines > 0 THEN
    BEGIN
  txt := IntToStr(Cells[r][c].neighborMines);
  TextOut(hdc, rect.Left + 10, rect.Top + 8, PCHAR(txt), Length(txt));
    END;
    END
  ELSE
    BEGIN
  brush := CreateSolidBrush(RGB(160, 160, 160));
  FillRect(hdc, rect, brush);
  DeleteObject(brush);
  Rectangle(hdc, rect.Left, rect.Top, rect.Right, rect.Bottom);
  IF Cells[r][c].flagged THEN
    begin TextOut(hdc, rect.Left + 10, rect.Top + 8, 'F', 1) end;
    END;
    END end;
  END;

  FUNCTION WndProc(hwnd: HWND; msg: UINT; wParam: WPARAM; lParam: LPARAM): LRESULT; STDCALL;
  VAR
  hdc: HDC;
  ps: PAINTSTRUCT;
  x, y, row, col: INTEGER;
  BEGIN
  CASE msg OF
  WM_PAINT:
    BEGIN
  hdc := BeginPaint(hwnd, ps);
  DrawField(hdc);
  EndPaint(hwnd, ps);
  Result := 0;
    END;

  WM_LBUTTONDOWN:
    begin IF NOT gameOver THEN
    BEGIN
  x := LOWORD(lParam);
  y := HIWORD(lParam);
  col := x DIV CELL_SIZE;
  row := y DIV CELL_SIZE;
  RevealCell(row, col);
  InvalidateRect(hwnd, NIL, TRUE);
  Result := 0;
    END end;

  WM_RBUTTONDOWN:
    begin IF NOT gameOver THEN
    BEGIN
  x := LOWORD(lParam);
  y := HIWORD(lParam);
  col := x DIV CELL_SIZE;
  row := y DIV CELL_SIZE;
  IF NOT Cells[row][col].revealed THEN
    begin Cells[row][col].flagged := NOT Cells[row][col].flagged end;
  InvalidateRect(hwnd, NIL, TRUE);
  Result := 0;
    END end;

  WM_DESTROY:
    begin PostQuitMessage(0) end;

  ELSE
    begin Result := DefWindowProc(hwnd, msg, wParam, lParam) end;
    END;
  END;

  PROCEDURE Run;
  VAR
  wc: WNDCLASS;
  msg: MSG;
  BEGIN
  FillChar(wc, SizeOf(wc), 0);
  wc.lpfnWndProc := @WndProc;
  wc.hInstance := hInstance;
  wc.lpszClassName := 'CampoMinadoWin';
  wc.hbrBackground := GetStockObject(WHITE_BRUSH);
  RegisterClass(wc);

  hwndMain := CreateWindowEx(0, 'CampoMinadoWin', 'Campo Minado',
  WS_OVERLAPPEDWINDOW,
  CW_USEDEFAULT, CW_USEDEFAULT,
  GRID_COLS * CELL_SIZE + 16, GRID_ROWS * CELL_SIZE + 39,
  0, 0, hInstance, NIL);

  ShowWindow(hwndMain, SW_SHOWNORMAL);
  UpdateWindow(hwndMain);

  InitGame;

  WHILE GetMessage(msg, 0, 0, 0) DO
    BEGIN
  TranslateMessage(msg);
  DispatchMessage(msg);
    END;
  END;

BEGIN
  Run;
END.

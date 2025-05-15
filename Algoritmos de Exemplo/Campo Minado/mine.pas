program CampoMinadoWinAPI;

uses
  Windows, Messages;

const
  CELL_SIZE = 30;
  GRID_ROWS = 10;
  GRID_COLS = 10;
  NUM_MINES = 10;

type
  TCell = record
    hasMine: Boolean;
    revealed: Boolean;
    flagged: Boolean;
    neighborMines: Integer;
  end;

var
  Cells: array[0..GRID_ROWS - 1, 0..GRID_COLS - 1] of TCell;
  hwndMain: HWND;
  gameOver: Boolean = False;

procedure InitGame;
var
  i, j, placed, r, c, dr, dc: Integer;
begin
  // Zera o campo
  for i := 0 to GRID_ROWS - 1 do
    for j := 0 to GRID_COLS - 1 do
      Cells[i][j] := Default(TCell);

  // Coloca minas aleatórias
  placed := 0;
  Randomize;
  while placed < NUM_MINES do
  begin
    r := Random(GRID_ROWS);
    c := Random(GRID_COLS);
    if not Cells[r][c].hasMine then
    begin
      Cells[r][c].hasMine := True;
      Inc(placed);
    end;
  end;

  // Conta minas vizinhas
  for r := 0 to GRID_ROWS - 1 do
    for c := 0 to GRID_COLS - 1 do
      if not Cells[r][c].hasMine then
        for dr := -1 to 1 do
          for dc := -1 to 1 do
            if (dr <> 0) or (dc <> 0) then
              if (r + dr >= 0) and (r + dr < GRID_ROWS) and
                 (c + dc >= 0) and (c + dc < GRID_COLS) then
                if Cells[r + dr][c + dc].hasMine then
                  Inc(Cells[r][c].neighborMines);
end;

procedure RevealCell(r, c: Integer);
var
  dr, dc: Integer;
begin
  if (r < 0) or (r >= GRID_ROWS) or (c < 0) or (c >= GRID_COLS) then Exit;
  if Cells[r][c].revealed or Cells[r][c].flagged then Exit;

  Cells[r][c].revealed := True;

  if Cells[r][c].hasMine then
  begin
    gameOver := True;
    MessageBox(0, 'Kaboom! Você perdeu.', 'Game Over', MB_ICONERROR);
    InvalidateRect(hwndMain, nil, True);
    Exit;
  end;

  if Cells[r][c].neighborMines = 0 then
    for dr := -1 to 1 do
      for dc := -1 to 1 do
        if (dr <> 0) or (dc <> 0) then
          RevealCell(r + dr, c + dc);
end;

procedure DrawField(hdc: HDC);
var
  r, c: Integer;
  rect: TRect;
  txt: string;
  brush: HBRUSH;
begin
  for r := 0 to GRID_ROWS - 1 do
    for c := 0 to GRID_COLS - 1 do
    begin
      rect.Left := c * CELL_SIZE;
      rect.Top := r * CELL_SIZE;
      rect.Right := rect.Left + CELL_SIZE;
      rect.Bottom := rect.Top + CELL_SIZE;

      if Cells[r][c].revealed then
      begin
        FillRect(hdc, rect, GetStockObject(WHITE_BRUSH));
        Rectangle(hdc, rect.Left, rect.Top, rect.Right, rect.Bottom);
        if Cells[r][c].hasMine then
          TextOut(hdc, rect.Left + 10, rect.Top + 8, 'X', 1)
        else if Cells[r][c].neighborMines > 0 then
        begin
          txt := IntToStr(Cells[r][c].neighborMines);
          TextOut(hdc, rect.Left + 10, rect.Top + 8, PChar(txt), Length(txt));
        end;
      end
      else
      begin
        brush := CreateSolidBrush(RGB(160, 160, 160));
        FillRect(hdc, rect, brush);
        DeleteObject(brush);
        Rectangle(hdc, rect.Left, rect.Top, rect.Right, rect.Bottom);
        if Cells[r][c].flagged then
          TextOut(hdc, rect.Left + 10, rect.Top + 8, 'F', 1);
      end;
    end;
end;

function WndProc(hwnd: HWND; msg: UINT; wParam: WPARAM; lParam: LPARAM): LRESULT; stdcall;
var
  hdc: HDC;
  ps: PAINTSTRUCT;
  x, y, row, col: Integer;
begin
  case msg of
    WM_PAINT:
      begin
        hdc := BeginPaint(hwnd, ps);
        DrawField(hdc);
        EndPaint(hwnd, ps);
        Result := 0;
      end;

    WM_LBUTTONDOWN:
      if not gameOver then
      begin
        x := LOWORD(lParam);
        y := HIWORD(lParam);
        col := x div CELL_SIZE;
        row := y div CELL_SIZE;
        RevealCell(row, col);
        InvalidateRect(hwnd, nil, True);
        Result := 0;
      end;

    WM_RBUTTONDOWN:
      if not gameOver then
      begin
        x := LOWORD(lParam);
        y := HIWORD(lParam);
        col := x div CELL_SIZE;
        row := y div CELL_SIZE;
        if not Cells[row][col].revealed then
          Cells[row][col].flagged := not Cells[row][col].flagged;
        InvalidateRect(hwnd, nil, True);
        Result := 0;
      end;

    WM_DESTROY:
      PostQuitMessage(0);

  else
    Result := DefWindowProc(hwnd, msg, wParam, lParam);
  end;
end;

procedure Run;
var
  wc: WNDCLASS;
  msg: MSG;
begin
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
    0, 0, hInstance, nil);

  ShowWindow(hwndMain, SW_SHOWNORMAL);
  UpdateWindow(hwndMain);

  InitGame;

  while GetMessage(msg, 0, 0, 0) do
  begin
    TranslateMessage(msg);
    DispatchMessage(msg);
  end;
end;

begin
  Run;
end.

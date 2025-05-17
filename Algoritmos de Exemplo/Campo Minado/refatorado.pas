program CampoMinadoRefatorado;

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

procedure ZeroField;
var
  r: Integer;
begin
  r := 0;
  while r < GRID_ROWS do
  begin
    var c := 0;
    while c < GRID_COLS do
    begin
      Cells[r][c] := Default(TCell);
      Inc(c);
    end;
    Inc(r);
  end;
end;

function CellHasMine(r, c: Integer): Boolean;
begin
  if (r < 0) or (r >= GRID_ROWS) then
  begin
    Exit(False);
  end;

  if (c < 0) or (c >= GRID_COLS) then
  begin
    Exit(False);
  end;

  Result := Cells[r][c].hasMine;
end;

procedure PlaceRandomMines;
var
  placed, r, c: Integer;
begin
  placed := 0;
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
end;

function CountNeighbors(r, c: Integer): Integer;
var
  count, i: Integer;
  offsets: array[0..7, 0..1] of Integer = (
    (-1, -1), (-1, 0), (-1, 1),
    (0, -1),          (0, 1),
    (1, -1),  (1, 0), (1, 1)
  );
begin
  count := 0;
  i := 0;
  while i < 8 do
  begin
    if CellHasMine(r + offsets[i][0], c + offsets[i][1]) then
    begin
      Inc(count);
    end;
    Inc(i);
  end;
  Result := count;
end;

procedure ComputeNeighborCounts;
var
  r, c: Integer;
begin
  r := 0;
  while r < GRID_ROWS do
  begin
    c := 0;
    while c < GRID_COLS do
    begin
      if not Cells[r][c].hasMine then
      begin
        Cells[r][c].neighborMines := CountNeighbors(r, c);
      end;
      Inc(c);
    end;
    Inc(r);
  end;
end;

procedure InitGame;
begin
  ZeroField;
  PlaceRandomMines;
  ComputeNeighborCounts;
end;

procedure RevealCascade(r, c: Integer);
var
  i: Integer;
  offsets: array[0..7, 0..1] of Integer = (
    (-1, -1), (-1, 0), (-1, 1),
    (0, -1),          (0, 1),
    (1, -1),  (1, 0), (1, 1)
  );
begin
  i := 0;
  while i < 8 do
  begin
    RevealCell(r + offsets[i][0], c + offsets[i][1]);
    Inc(i);
  end;
end;

procedure RevealCell(r, c: Integer);
begin
  if (r < 0) or (r >= GRID_ROWS) then
  begin
    Exit;
  end;

  if (c < 0) or (c >= GRID_COLS) then
  begin
    Exit;
  end;

  if Cells[r][c].revealed then
  begin
    Exit;
  end;

  if Cells[r][c].flagged then
  begin
    Exit;
  end;

  Cells[r][c].revealed := True;

  if Cells[r][c].hasMine then
  begin
    gameOver := True;
    MessageBox(0, 'Kaboom! Você perdeu.', 'Game Over', MB_ICONERROR);
    InvalidateRect(hwndMain, nil, True);
    Exit;
  end;

  if Cells[r][c].neighborMines = 0 then
  begin
    RevealCascade(r, c);
  end;
end;

procedure DrawCell(hdc: HDC; r, c: Integer);
var
  rect: TRect;
  txt: string;
  brush: HBRUSH;
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
    begin
      TextOut(hdc, rect.Left + 10, rect.Top + 8, 'X', 1);
    end
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
    begin
      TextOut(hdc, rect.Left + 10, rect.Top + 8, 'F', 1);
    end;
  end;
end;

procedure DrawField(hdc: HDC);
var
  r, c: Integer;
begin
  r := 0;
  while r < GRID_ROWS do
  begin
    c := 0;
    while c < GRID_COLS do
    begin
      DrawCell(hdc, r, c);
      Inc(c);
    end;
    Inc(r);
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
        Exit;
      end;

    WM_LBUTTONDOWN:
      begin
        if not gameOver then
        begin
          x := LOWORD(lParam);
          y := HIWORD(lParam);
          col := x div CELL_SIZE;
          row := y div CELL_SIZE;

          RevealCell(row, col);
          InvalidateRect(hwnd, nil, True);
        end;
        Result := 0;
        Exit;
      end;

    WM_RBUTTONDOWN:
      begin
        if not gameOver then
        begin
          x := LOWORD(lParam);
          y := HIWORD(lParam);
          col := x div CELL_SIZE;
          row := y div CELL_SIZE;

          if not Cells[row][col].revealed then
          begin
            Cells[row][col].flagged := not Cells[row][col].flagged;
          end;

          InvalidateRect(hwnd, nil, True);
        end;
        Result := 0;
        Exit;
      end;

    WM_DESTROY:
      begin
        PostQuitMessage(0);
        Result := 0;
        Exit;
      end;
  end;

  Result := DefWindowProc(hwnd, msg, wParam, lParam);
end;

procedure Run;
var
  wc: WNDCLASS;
  msg: MSG;
begin
  FillChar(wc, SizeOf(wc), 0);
  wc.lpfnWndProc := @WndProc;
  wc.hInstance := hInstance;
  wc.lpszClassName := 'CampoMinadoWinAPI';
  wc.hbrBackground := GetStockObject(WHITE_BRUSH);

  RegisterClass(wc);

  hwndMain := CreateWindowEx(0, 'CampoMinadoWinAPI', 'Campo Minado',
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

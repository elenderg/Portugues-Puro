const
  Largura = 40;
  Altura  = 30;
  TamanhoBloco = 15;
  Velocidade = 100; // em ms
  MaxTamanho = 200;

var
  Cobra: array[1..MaxTamanho] of TPonto;
  Tamanho: Integer = 5;
  Direcao: Integer = VK_RIGHT;
  Fruta: TPonto;
  Janela: HWND;
  TimerID: UINT;
  GameOver: Boolean = False;


procedure AtualizarPosicao;
var
  i: Integer;
  nx, ny: Integer;
begin
  nx := Cobra[1].x;
  ny := Cobra[1].y;

  case Direcao of
    VK_LEFT:  Dec(nx);
    VK_RIGHT: Inc(nx);
    VK_UP:    Dec(ny);
    VK_DOWN:  Inc(ny);
  end;

  if (nx < 0) or (ny < 0) or (nx >= Largura) or (ny >= Altura) then
  begin
    GameOver := True;
    Exit;
  end;

  for i := Tamanho downto 2 do
    Cobra[i] := Cobra[i - 1];

  Cobra[1].x := nx;
  Cobra[1].y := ny;

  if (Cobra[1].x = Fruta.x) and (Cobra[1].y = Fruta.y) then
  begin
    Inc(Tamanho);
    NovaFruta;
  end;
end;

procedure DesenharTudo(handleDC: HDC);
var
  i: Integer;
  retangulo: TRect;
begin
  // Fundo
  retangulo.left := 0;
  retangulo.top := 0;
  retangulo.right := Largura * TamanhoBloco;
  retangulo.bottom := Altura * TamanhoBloco;

  FillRect(
           handleDC,
           retangulo,
             CreateSolidBrush(
               RGB(0, 0, 0)
             )
           );

  // Fruta
  DesenharRetangulo(handleDC, Fruta.x, Fruta.y, RGB(255, 0, 0));

  // Corpo da cobra
  for i := 1 to Tamanho do
    DesenharRetangulo(handleDC, Cobra[i].x, Cobra[i].y, RGB(0, 255, 0));
end;

procedure ReiniciarJogo;
var
  i: Integer;
begin
  Randomize;
  Tamanho := 5;
  Direcao := VK_RIGHT;
  for i := 1 to Tamanho do
  begin
    Cobra[i].x := 10 - i;
    Cobra[i].y := 10;
  end;
  NovaFruta;
  GameOver := False;
end;

function WndProc(hWnd: HWND; mensagem: UINT; wParam: WPARAM; lParam: LPARAM): LRESULT; stdcall;
var
  ps: PAINTSTRUCT;
  handleDC: HDC;
begin
  case mensagem of
    WM_CREATE:
      begin
        ReiniciarJogo;
        TimerID := SetTimer(hWnd, 1, Velocidade, nil);
      end;

    WM_TIMER:
      begin
        if not GameOver then
        begin
          AtualizarPosicao;
          InvalidateRect(hWnd, nil, True);
        end
        else
        begin
          KillTimer(hWnd, TimerID);
          MessageBox(hWnd, 'Fim de jogo!', 'Snake', MB_OK or MB_ICONINFORMATION);
          ReiniciarJogo;
          TimerID := SetTimer(hWnd, 1, Velocidade, nil);
        end;
      end;

    WM_KEYDOWN:
      case wParam of
        VK_LEFT:  if Direcao <> VK_RIGHT then Direcao := VK_LEFT;
        VK_RIGHT: if Direcao <> VK_LEFT then Direcao := VK_RIGHT;
        VK_UP:    if Direcao <> VK_DOWN then Direcao := VK_UP;
        VK_DOWN:  if Direcao <> VK_UP then Direcao := VK_DOWN;
        VK_ESCAPE: PostQuitMessage(0);
      end;

    WM_PAINT:
      begin
        handleDC := BeginPaint(hWnd, ps);
        DesenharTudo(handleDC);
        EndPaint(hWnd, ps);
      end;

    WM_DESTROY:
      begin
        KillTimer(hWnd, TimerID);
        PostQuitMessage(0);
      end;

  else
    Result := DefWindowProc(hWnd, mensagem, wParam, lParam);
    Exit;
  end;

  Result := 0;
end;

procedure CriarJanela;
var
  wc: WNDCLASS;
begin
  FillChar(wc, SizeOf(wc), 0);
  wc.lpfnWndProc := @WndProc;
  wc.hInstance := hInstance;
  wc.lpszClassName := 'SnakeWin32';
  wc.hbrBackground := COLOR_WINDOW + 1;
  wc.hCursor := LoadCursor(0, IDC_ARROW);

  RegisterClass(wc);

  Janela := CreateWindowEx(
    0, 'SnakeWin32', 'Snake (Win32 GDI)',
    WS_OVERLAPPEDWINDOW and not WS_MAXIMIZEBOX and not WS_SIZEBOX,
    CW_USEDEFAULT, CW_USEDEFAULT,
    Largura * TamanhoBloco + 16,
    Altura * TamanhoBloco + 39,
    0, 0, hInstance, nil);

  ShowWindow(Janela, SW_SHOW);
  UpdateWindow(Janela);
end;

var
  mensagem: MSG;
begin
  CriarJanela;
  while GetMessage(mensagem, 0, 0, 0) do
  begin
    TranslateMessage(mensagem);
    DispatchMessage(mensagem);
  end;
end.


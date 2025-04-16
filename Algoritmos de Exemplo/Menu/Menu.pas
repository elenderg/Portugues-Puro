program WinMenuExample;

uses
  Windows, Messages;

const
  ID_FILE_OPEN     = 101;
  ID_FILE_SAVE     = 102;
  ID_FILE_SAVEAS   = 103;
  ID_FILE_EXIT     = 104;

  ID_EDIT_COPY     = 201;
  ID_EDIT_CUT      = 202;
  ID_EDIT_PASTE    = 203;

  ID_HELP_CONTENTS = 301;
  ID_HELP_ABOUT    = 302;

var
  hInstance: HINST;

function AboutDialog(hWnd: HWND): Integer;
begin
  MessageBox(hWnd,
    'Empresa Desenvolvedora: ExemploTech Software Ltda.' + #13 +
    'Contato: contato@exemplotech.com.br',
    'Sobre', MB_ICONINFORMATION or MB_OK);
  Result := 0;
end;

function WndProc(hWnd: HWND; Msg: UINT; wParam: WPARAM; lParam: LPARAM): LRESULT; stdcall;
var
  wmId: Word;
begin
  case Msg of
    WM_COMMAND:
    begin
      wmId := LOWORD(wParam);
      case wmId of
        ID_FILE_OPEN: MessageBox(hWnd, 'Abrir arquivo...', 'Arquivo', MB_OK);
        ID_FILE_SAVE: MessageBox(hWnd, 'Salvar arquivo...', 'Arquivo', MB_OK);
        ID_FILE_SAVEAS: MessageBox(hWnd, 'Salvar como...', 'Arquivo', MB_OK);
        ID_FILE_EXIT: PostQuitMessage(0);
        ID_EDIT_COPY: MessageBox(hWnd, 'Copiar...', 'Editar', MB_OK);
        ID_EDIT_CUT: MessageBox(hWnd, 'Recortar...', 'Editar', MB_OK);
        ID_EDIT_PASTE: MessageBox(hWnd, 'Colar...', 'Editar', MB_OK);
        ID_HELP_CONTENTS: MessageBox(hWnd, 'Conte�do de ajuda...', 'Ajuda', MB_OK);
        ID_HELP_ABOUT: AboutDialog(hWnd);
      end;
    end;

    WM_DESTROY:
    begin
      PostQuitMessage(0);
      Result := 0;
      Exit;
    end;
  end;
  Result := DefWindowProc(hWnd, Msg, wParam, lParam);
end;

procedure AddMenus(hWnd: HWND);
var
  hMenu, hFileMenu, hEditMenu, hHelpMenu: HMENU;
begin
  hMenu := CreateMenu();

  // Menu Arquivo
  hFileMenu := CreatePopupMenu();
  AppendMenu(hFileMenu, MF_STRING, ID_FILE_OPEN, 'Abrir'#9'Ctrl+O');
  AppendMenu(hFileMenu, MF_STRING, ID_FILE_SAVE, 'Salvar'#9'Ctrl+S');
  AppendMenu(hFileMenu, MF_STRING, ID_FILE_SAVEAS, 'Salvar como...');
  AppendMenu(hFileMenu, MF_SEPARATOR, 0, nil);
  AppendMenu(hFileMenu, MF_STRING, ID_FILE_EXIT, 'Fechar');

  // Menu Editar
  hEditMenu := CreatePopupMenu();
  AppendMenu(hEditMenu, MF_STRING, ID_EDIT_COPY, 'Copiar'#9'Ctrl+C');
  AppendMenu(hEditMenu, MF_STRING, ID_EDIT_CUT, 'Recortar'#9'Ctrl+X');
  AppendMenu(hEditMenu, MF_STRING, ID_EDIT_PASTE, 'Colar'#9'Ctrl+V');

  // Menu Ajuda
  hHelpMenu := CreatePopupMenu();
  AppendMenu(hHelpMenu, MF_STRING, ID_HELP_CONTENTS, 'Conte�do de Ajuda'#9'F1');
  AppendMenu(hHelpMenu, MF_STRING, ID_HELP_ABOUT, 'Sobre');

  // Monta o menu principal
  AppendMenu(hMenu, MF_POPUP, UINT_PTR(hFileMenu), 'Arquivo');
  AppendMenu(hMenu, MF_POPUP, UINT_PTR(hEditMenu), 'Editar');
  AppendMenu(hMenu, MF_POPUP, UINT_PTR(hHelpMenu), 'Ajuda');

  SetMenu(hWnd, hMenu);
end;

procedure RegisterHotkeys(hWnd: HWND);
begin
  RegisterHotKey(hWnd, ID_FILE_OPEN, MOD_CONTROL, Ord('O'));
  RegisterHotKey(hWnd, ID_EDIT_COPY, MOD_CONTROL, Ord('C'));
  RegisterHotKey(hWnd, ID_HELP_CONTENTS, 0, VK_F1);
end;

function WinMain(hInst: HINST; hPrevInst: HINST; CmdLine: PChar; CmdShow: Integer): Integer;
var
  wc: WNDCLASS;
  msg: MSG;
  hWnd: HWND;
begin
  hInstance := hInst;

  FillChar(wc, SizeOf(wc), 0);
  wc.lpfnWndProc := @WndProc;
  wc.hInstance := hInstance;
  wc.lpszClassName := 'MyWindowClass';
  wc.hCursor := LoadCursor(0, IDC_ARROW);
  wc.hbrBackground := COLOR_WINDOW + 1;

  RegisterClass(wc);

  hWnd := CreateWindow('MyWindowClass', 'Exemplo com Menu Win32',
    WS_OVERLAPPEDWINDOW, CW_USEDEFAULT, CW_USEDEFAULT, 600, 400,
    0, 0, hInstance, nil);

  AddMenus(hWnd);
  RegisterHotkeys(hWnd);

  ShowWindow(hWnd, CmdShow);
  UpdateWindow(hWnd);

  while GetMessage(msg, 0, 0, 0) do
  begin
    TranslateMessage(msg);
    DispatchMessage(msg);
  end;

  Result := msg.wParam;
end;

begin
  WinMain(GetModuleHandle(nil), 0, CmdLine, SW_SHOW);
end.

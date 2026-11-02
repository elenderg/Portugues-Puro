program ServidorLSP;

{$APPTYPE CONSOLE}

uses
  Windows,
  SysUtils;

const
  TamanhoCabecalho = 8192;

var
  Entrada: THandle;
  Saida: THandle;
  Buffer: array[0..TamanhoCabecalho - 1] of AnsiChar;
  QuantidadeLida: DWORD;
  Cabecalho: AnsiString;
  Corpo: AnsiString;
  Linha: AnsiString;
  Posicao: Integer;
  Tamanho: Integer;

function LerByte: AnsiChar;
var
  ByteLido: AnsiChar;
  Quantidade: DWORD;
begin
  if not ReadFile(Entrada, ByteLido, 1, Quantidade, nil) then
    Halt(1);

  if Quantidade <> 1 then
    Halt(0);

  Result := ByteLido;
end;

function LerCabecalho: AnsiString;
var
  Ultimos: AnsiString;
  C: AnsiChar;
begin
  Result := '';
  Ultimos := '';

  while True do
  begin
    C := LerByte;
    Result := Result + C;

    Ultimos := Ultimos + C;

    if Length(Ultimos) > 4 then
      Delete(Ultimos, 1, Length(Ultimos) - 4);

    if Ultimos = #13#10#13#10 then
      Break;
  end;
end;

function ObterTamanhoDoConteudo(const Cabecalho: AnsiString): Integer;
var
  Inicio: Integer;
  Fim: Integer;
  Valor: AnsiString;
begin
  Inicio := Pos('Content-Length:', Cabecalho);

  if Inicio = 0 then
    Halt(1);

  Inicio := Inicio + Length('Content-Length:');

  while Cabecalho[Inicio] = ' ' do
    Inc(Inicio);

  Fim := Inicio;

  while (Fim <= Length(Cabecalho)) and
        (Cabecalho[Fim] in ['0'..'9']) do
    Inc(Fim);

  Valor := Copy(Cabecalho, Inicio, Fim - Inicio);

  Result := StrToInt(Valor);
end;

function LerCorpo(Tamanho: Integer): AnsiString;
var
  Quantidade: DWORD;
  Total: Integer;
  LidoAgora: DWORD;
begin
  SetLength(Result, Tamanho);

  Total := 0;

  while Total < Tamanho do
  begin
    if not ReadFile(
      Entrada,
      Result[Total + 1],
      Tamanho - Total,
      LidoAgora,
      nil
    ) then
      Halt(1);

    if LidoAgora = 0 then
      Halt(0);

    Inc(Total, LidoAgora);
  end;
end;

procedure Escrever(const Texto: AnsiString);
var
  Total: Integer;
  EscritoAgora: DWORD;
begin
  Total := 0;

  while Total < Length(Texto) do
  begin
    if not WriteFile(
      Saida,
      Texto[Total + 1],
      Length(Texto) - Total,
      EscritoAgora,
      nil
    ) then
      Halt(1);

    if EscritoAgora = 0 then
      Halt(1);

    Inc(Total, EscritoAgora);
  end;
end;

procedure EnviarMensagem(const Corpo: AnsiString);
var
  Cabecalho: AnsiString;
begin
  Cabecalho :=
    'Content-Length: ' +
    IntToStr(Length(Corpo)) +
    #13#10#13#10;

  Escrever(Cabecalho);
  Escrever(Corpo);
end;

begin
  Entrada := GetStdHandle(STD_INPUT_HANDLE);
  Saida := GetStdHandle(STD_OUTPUT_HANDLE);

  while True do
  begin
    Cabecalho := LerCabecalho;

    Tamanho := ObterTamanhoDoConteudo(Cabecalho);

    Corpo := LerCorpo(Tamanho);

    { Por enquanto, simplesmente registre o que recebeu. }
    WriteLn(StdErr, 'Recebido: ', Corpo);

    { Resposta provisória fixa. }
    EnviarMensagem(
      '{"jsonrpc":"2.0","id":1,"result":null}'
    );
  end;
end.
grammar PortuguesPuro;

regra_espaco:
	' '; // regra combina tokens léxicos com outras regras.

palavra: CARACTERES_IMPRIMIVEIS+;




possessivo: palavra APOSTROFO;
artigo: artigo_definido | artigo_indefinido;
artigo_definido: 'o' | 'a' | 'os' | 'as' | adjacentes;
artigo_indefinido: 'um' | 'uma' | 'uns' | 'umas' | abrangentes;
adjacentes: 'este' | 'esta' | 'estes' | 'estas';
abrangentes: 'esse' | 'essa' | 'esses' | 'essas';
contracoes:
	  'ao'
	| 'à'
	| 'aos'
	| 'às'
	| 'no'
	| 'na'
	| 'nos'
	| 'nas'
	| 'pelo'
	| 'pela'
	| 'pelos'
	| 'pelas'
	| 'num'
	| 'numa'
	| 'nuns'
	| 'numas' 
    | atribuidores_de_posse
    | p1
	| p2;

atribuidores_de_posse: 
      'dum'
	| 'duma'
	| 'duns'
	| 'dumas';

p1: 'desse' | 'dessa' | 'desses' | 'dessas';
p2: 'deste' | 'desta' | 'destes' | 'destas';




operadores_de_comparacao:
	| 'igual a'
	| 'diferente de'
	| 'maior que'
	| 'maior do que'
	| 'maior ou igual a'
	| 'menor que'
	| 'menor do que'
	| 'menor ou igual a' ;

palavras_reservadas:
	  'Se'
	| 'Itere'
	| 'Reitere'
	| 'Pare'
	| 'Retorne'
	| 'Preserve'
	| 'Diga'
	| 'sim'
	| 'não'
	| 'original'
    | 'Decodifique'
	| 'Processe'
	| 'retornando'
	| 'Push'
	| 'Pop'
	| 'nulo'
	| 'vazio'
	| 'inexistente' 
    | denominacoes;

denominacoes:
      'denominado'
    | 'denominada'
    | 'denominados'
    | 'denominadas'
    | 'chamado'
    | 'chamada'
    | 'chamados'
    | 'chamadas';



verbos:
	  'é'
	| 'está'
	| 'estiver'
	| 'for'
	| 'forem'
	| 'são'
	| 'estão'
	| 'estiverem'
	| 'ser'
	| 'serem'
	| 'estar'
	| 'poder'
	| 'puder'
	| 'foi'
	| 'estamos'
	| 'há'
	| 'pode'
	| 'existe'
	| 'existir'
	| 'contém'
	| 'contiver'
	| 'possui'
	| 'possuir';

// --- LEXICAL BNF ---

caracteres_ignoraveis: CARACTERES_DE_CONTROLE | ESPACO_EM_BRANCO | ESPACO_RIGIDO;

comentario: comentario_de_linha | comentario_de_bloco;
comentario_de_linha: BARRA_INVERTIDA CARACTERES_IMPRIMIVEIS* QUEBRA_DE_LINHA;
comentario_de_bloco: ABRE_COLCHETES CARACTERES_IMPRIMIVEIS* FECHA_COLCHETES;


token: aglomerado | possessivo | qualificador | string_literal;
aglomerado: iniciador_de_aglomerado (caractere_aglomeravel);
caractere_aglomeravel: LETRA | DIGITO | '~'| '@' | '#' | '%' | '_' | '$' | '&' | '-' | '+' | '/';
iniciador_de_aglomerado: LETRA | DIGITO | '~'| '@' | '#' | '%' | '_' | '$' | '&' | '\'';
// 

possessivo_novo: '\'s' caractere_nao_aglomeravel; // should be followed by any terminal that is not a caractere_aglomeravel
qualificador:ABRE_PARENTESES CARACTERES_IMPRIMIVEIS* FECHA_PARENTESES;

caractere_nao_aglomeravel: ~LETRA | ~DIGITO | ~'~'| ~'@' | ~'#' | ~'%' | ~'_' | ~'$' | ~'&' | ~'-' | ~'+' | ~'/';
sinal_de_pontuacao: '.' | ',' | ';' | ':' | '!' | '?';
simbolos_especiais: '|' | '*' | '+' | '-' | '^' | '/' | '<' | '>' | '{' | '}' ;

// --- ONE LEVEL UP FROM LEXICAL ---

noise: caracteres_ignoraveis | comentario | qualificador;
numero_inteiro: DIGITO+;
numero_decimal: HIFEN? numero_inteiro;
numero_fracionario: numero_decimal BARRA_INCLINADA numero_inteiro;
numero_misto: numero_decimal SINAL_DE_ADICAO numero_fracionario;
numero_hexadecimal: CIFRAO numero_inteiro;
string_literal:	ASPAS_DUPLAS CARACTERES_IMPRIMIVEIS* ASPAS_DUPLAS;

// --- SYNTATICAL BNF ---

programa: tipo | variavel_global | rotina;

tipos_primitivos: 'byte' | 'caractere' | 'word' | 'número' | 
                  'sinalizador' | 'ponteiro' | 'estrutura' | 
                  'string' | 'subtexto' | 'texto hexadecimal' | 
                  'lista' | 'lista estruturada' | 'listas' | 
                  'proporção' | 'fração' | 'numerador' | 'denominador';

tipo: 
    artigo_indefinido nome 'é' artigo_indefinido nome_do_tipo informacao_opcional? '.' |
    artigo_indefinido nome 'é uma estrutura com' campos '.' |
    artigo_indefinido nome 'é' numero_inteiro nome_do_tipo '.' ;

nome: palavra;
nome_do_tipo: nome;

informacao_opcional: 'para' artigo_indefinido nome_do_tipo | 'com' campos;

campos: campo (pausas campo)*;

campo: (artigo_indefinido | numero_inteiro 'bytes') 
       (denominacoes nome | 'sob' artigo_definido nome | '(referência)')?;

pausa: ',' | ';' | 'e' | 'ou';
pausas: pausa+;

conjuncoes: 'e' | 'ou' | 'nem';
preposicoes:
	  'usando'
	| 'com'
	| 'por'
	| 'contendo'
	| 'desde'
	| 'pelo'
	| 'pela'
	| 'entre'
	| 'sobre'
	| 'sob'
	| 'cima'
	| 'embaixo'
	| 'abaixo'
	| 'antes'
	| 'depois'
	| 'após'
	| 'cerca'
	| 'próximo'
	| 'até'
	| 'aproximadamente'
	| 'como';


variavel_global: 
    artigo_definido nome 'é' artigo_indefinido nome_do_tipo informacao_opcional? '.' |
    artigo_definido nome 'é uma estrutura com' campos '.' |    
    artigo_definido nome 'é' artigo_indefinido nome_do_tipo 'igual a' termo_constante '.'
    artigo_definido nome 'é' termo_constante '.' |
    ;

rotina: procedimento | decisor | funcao | retroinvocacao;

procedimento:  ('Rotina'? 'para que se' nome_da_rotina ';' |
                'Rotina'? 'para que se' nome_da_rotina ':') instrucoes;

decisor: 'Rotina'? 'para que se determine se' nome_da_rotina ';' |
                'Rotina'? 'para que se determine se' nome_da_rotina ':';

funcao: ('Função'? 
        'para que se atribua' 
        artigo_definido nome_do_tipo 
        atribuidores_de_posse nome 'para' 
        artigo_indefinido nome_do_tipo ';' |                
        'Função'? 
        'para que se atribua' 
        artigo_definido nome_do_tipo 
        atribuidores_de_posse nome 'para' 
        artigo_indefinido nome_do_tipo ':') instrucoes;


retroinvocacao: ('Rotina'? 'para que se compativelmente' nome_da_rotina ';' |
                'Rotina'? 'para que se compativelmente' nome_da_rotina ':') instrucoes;

nome_da_rotina: unidade_semantica | parametro | frase qualificador?;
unidade_semantica: palavra;
parametro: artigo_indefinido nome (denominacoes nome)?;
frase: artigo_definido nome;

instrucoes: instrucao+;
instrucao: preservacao | iteracao | condicional | incondicional ',';
preservacao: 'Preserve' parametro;
iteracao: 'Itere.';

condicional: 'Se' expressao_decisora ',' incondicional (';' incondicional)* '.';

expressao_decisora: palavra+ verbos? expressao_decisora?;

incondicional: interrupcao | invocacao | retorno | decodificacao | reiteracao | 
               indirecao | empilhamento | retorno_booleano;

interrupcao: 'Pare';
invocacao: invocacao_interna | invocacao_externa | invocacao_indireta;
invocacao_interna: (unidade_semantica | expressao | frase) qualificador?;
invocacao_externa: 'Processe' '"' nome_da_DLL '"' '"' nome_da_funcao '"' (('com' expressao) ('e' expressao)* ('retornando' termo)?)?;
nome_da_DLL: palavra;
nome_da_funcao: palavra;
invocacao_indireta: 'Processe' expressao ('com' expressao ('e' expressao)* ('retornando' termo)?)?;
retorno: 'Retorne';
decodificacao: 'Decodifique' numero_hexadecimal;
indirecao: 'Aponte' artigo termo 'para a rotina' (unidade_semantica | parametro | frase) qualificador?;
empilhamento: 'Push' expressao;
reiteracao: 'Reitere';
retorno_booleano: 'Diga sim' | 'Diga não';

expressao: termo (operadores_comuns termo)*;
operadores_comuns:
	  'mais'
	| 'menos'
	| 'vezes'
	| 'multiplicado por'
	| 'dividido por'
    | 'junto com'
	| 'seguido de'
	| 'acompanhado de';


termo_constante: termo_constante_negativo | termo_constante_positivo | literal;
termo_constante_negativo: '-' termo_constante;
termo_constante_positivo: '+' termo_constante;
numero: numero_decimal | numero_fracionario | numero_misto;
literal: numero (nome_do_tipo)? | string_literal | numero_hexadecimal | 'sim' | 'não' | 'nulo' | 'inexistene';

termo: termo_negativo | 
       termo_positivo | 
       variavel_local | 
       variavel | 
       termo_literal ('como' artigo_indefinido nome_do_tipo)? ('/' termo)?;

termo_negativo: '-' termo;
termo_positivo: '+' termo;
variavel_local: artigo_indefinido nome (denominacoes nome)? possessivos;
variavel: artigo_definido nome possessivos;
termo_literal: literal possessivos;


possessivos: (possessivo_antigo)*;
possessivo_antigo: '\'s' (nome | funcao | 'conteúdo' | 'magnitude' | 'endereçamento');




// Uma regra pode ser usada para definir um conjunto de caracteres. Exemplo:

// TOKENS LÉXICOS Tokens léxicos são os elementos básicos da linguagem que são reconhecidos pelo
// analisador léxico. Não chamam outras regras.

LETRA: [a-zA-ZÀ-ÖØ-öø-ÿ]; // Letras do alfabeto latino com acentos e cedilha.
DIGITO: [0-9]; // Dígitos de 0 a 9.
SIMBOLO:
	[!@#$%^&*()_+{}|:"<>?`\-=[\];',./]; // Símbolos especiais.
ESPACO: (' ' | '\t' | '\r' | '\n'); // Espaço em branco.
APOSTROFO: '\''; // Aspas simples.
ASPAS_DUPLAS: '\\"'; // Aspas duplas.
HIFEN: '-'; // HIFEN.
CIFRAO: '$'; // Símbolo de moeda.
ESPACO_EM_BRANCO: (' ' | '\t');
ESPACO_RIGIDO: '\u00A0'; // Espaço rígido.
QUEBRA_DE_LINHA: ('\r\n')+;
BARRA_INCLINADA: '/'; // Barra inclinada.
BARRA_INVERTIDA: '\\'; // Barra invertida.
SINAL_DE_ADICAO: '+'; // Sinal de adição.
PONTO: '.'; // Ponto.
VIRGULA: ','; // Vírgula.
PONTO_E_VIRGULA: ';'; // Ponto e vírgula.
DOIS_PONTOS: ':'; // Dois pontos.
ABRE_PARENTESES: '('; // Abre parênteses.
FECHA_PARENTESES: ')'; // Fecha parênteses.
ABRE_COLCHETES: '['; // Abre colchetes.
FECHA_COLCHETES: ']'; // Fecha colchetes.

CARACTERES_IMPRIMIVEIS:
	[\u0020-\u00FF]; // Caracteres imprimíveis do código ASCII Extended. (Codepage Windows 1252)
CARACTERES_DE_CONTROLE:
	[\u0000-\u001F]; // Caracteres de controle do código ASCII Extended. (Codepage Windows 1252)

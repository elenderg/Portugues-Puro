// Generated from c:/Users/Elender/Desktop/Gramática/PortuguesPuro.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PortuguesPuroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, T__159=160, T__160=161, 
		T__161=162, T__162=163, T__163=164, T__164=165, T__165=166, T__166=167, 
		T__167=168, T__168=169, T__169=170, T__170=171, T__171=172, T__172=173, 
		T__173=174, T__174=175, T__175=176, T__176=177, T__177=178, T__178=179, 
		T__179=180, T__180=181, T__181=182, T__182=183, T__183=184, T__184=185, 
		LETRA=186, DIGITO=187, SIMBOLO=188, ESPACO=189, APOSTROFO=190, ASPAS_DUPLAS=191, 
		HIFEN=192, CIFRAO=193, ESPACO_EM_BRANCO=194, ESPACO_RIGIDO=195, QUEBRA_DE_LINHA=196, 
		BARRA_INCLINADA=197, BARRA_INVERTIDA=198, SINAL_DE_ADICAO=199, PONTO=200, 
		VIRGULA=201, PONTO_E_VIRGULA=202, DOIS_PONTOS=203, ABRE_PARENTESES=204, 
		FECHA_PARENTESES=205, ABRE_COLCHETES=206, FECHA_COLCHETES=207, CARACTERES_IMPRIMIVEIS=208, 
		CARACTERES_DE_CONTROLE=209;
	public static final int
		RULE_regra_espaco = 0, RULE_palavra = 1, RULE_possessivo = 2, RULE_artigo = 3, 
		RULE_artigo_definido = 4, RULE_artigo_indefinido = 5, RULE_adjacentes = 6, 
		RULE_abrangentes = 7, RULE_contracoes = 8, RULE_atribuidores_de_posse = 9, 
		RULE_p1 = 10, RULE_p2 = 11, RULE_operadores_de_comparacao = 12, RULE_palavras_reservadas = 13, 
		RULE_denominacoes = 14, RULE_verbos = 15, RULE_caracteres_ignoraveis = 16, 
		RULE_comentario = 17, RULE_comentario_de_linha = 18, RULE_comentario_de_bloco = 19, 
		RULE_token = 20, RULE_aglomerado = 21, RULE_caractere_aglomeravel = 22, 
		RULE_iniciador_de_aglomerado = 23, RULE_possessivo_novo = 24, RULE_qualificador = 25, 
		RULE_caractere_nao_aglomeravel = 26, RULE_sinal_de_pontuacao = 27, RULE_simbolos_especiais = 28, 
		RULE_noise = 29, RULE_numero_inteiro = 30, RULE_numero_decimal = 31, RULE_numero_fracionario = 32, 
		RULE_numero_misto = 33, RULE_numero_hexadecimal = 34, RULE_string_literal = 35, 
		RULE_programa = 36, RULE_tipos_primitivos = 37, RULE_tipo = 38, RULE_nome = 39, 
		RULE_nome_do_tipo = 40, RULE_informacao_opcional = 41, RULE_campos = 42, 
		RULE_campo = 43, RULE_pausa = 44, RULE_pausas = 45, RULE_conjuncoes = 46, 
		RULE_preposicoes = 47, RULE_variavel_global = 48, RULE_rotina = 49, RULE_procedimento = 50, 
		RULE_decisor = 51, RULE_funcao = 52, RULE_retroinvocacao = 53, RULE_nome_da_rotina = 54, 
		RULE_unidade_semantica = 55, RULE_parametro = 56, RULE_frase = 57, RULE_instrucoes = 58, 
		RULE_instrucao = 59, RULE_preservacao = 60, RULE_iteracao = 61, RULE_condicional = 62, 
		RULE_expressao_decisora = 63, RULE_incondicional = 64, RULE_interrupcao = 65, 
		RULE_invocacao = 66, RULE_invocacao_interna = 67, RULE_invocacao_externa = 68, 
		RULE_nome_da_DLL = 69, RULE_nome_da_funcao = 70, RULE_invocacao_indireta = 71, 
		RULE_retorno = 72, RULE_decodificacao = 73, RULE_indirecao = 74, RULE_empilhamento = 75, 
		RULE_reiteracao = 76, RULE_retorno_booleano = 77, RULE_expressao = 78, 
		RULE_operadores_comuns = 79, RULE_termo_constante = 80, RULE_termo_constante_negativo = 81, 
		RULE_termo_constante_positivo = 82, RULE_numero = 83, RULE_literal = 84, 
		RULE_termo = 85, RULE_termo_negativo = 86, RULE_termo_positivo = 87, RULE_variavel_local = 88, 
		RULE_variavel = 89, RULE_termo_literal = 90, RULE_possessivos = 91, RULE_possessivo_antigo = 92;
	private static String[] makeRuleNames() {
		return new String[] {
			"regra_espaco", "palavra", "possessivo", "artigo", "artigo_definido", 
			"artigo_indefinido", "adjacentes", "abrangentes", "contracoes", "atribuidores_de_posse", 
			"p1", "p2", "operadores_de_comparacao", "palavras_reservadas", "denominacoes", 
			"verbos", "caracteres_ignoraveis", "comentario", "comentario_de_linha", 
			"comentario_de_bloco", "token", "aglomerado", "caractere_aglomeravel", 
			"iniciador_de_aglomerado", "possessivo_novo", "qualificador", "caractere_nao_aglomeravel", 
			"sinal_de_pontuacao", "simbolos_especiais", "noise", "numero_inteiro", 
			"numero_decimal", "numero_fracionario", "numero_misto", "numero_hexadecimal", 
			"string_literal", "programa", "tipos_primitivos", "tipo", "nome", "nome_do_tipo", 
			"informacao_opcional", "campos", "campo", "pausa", "pausas", "conjuncoes", 
			"preposicoes", "variavel_global", "rotina", "procedimento", "decisor", 
			"funcao", "retroinvocacao", "nome_da_rotina", "unidade_semantica", "parametro", 
			"frase", "instrucoes", "instrucao", "preservacao", "iteracao", "condicional", 
			"expressao_decisora", "incondicional", "interrupcao", "invocacao", "invocacao_interna", 
			"invocacao_externa", "nome_da_DLL", "nome_da_funcao", "invocacao_indireta", 
			"retorno", "decodificacao", "indirecao", "empilhamento", "reiteracao", 
			"retorno_booleano", "expressao", "operadores_comuns", "termo_constante", 
			"termo_constante_negativo", "termo_constante_positivo", "numero", "literal", 
			"termo", "termo_negativo", "termo_positivo", "variavel_local", "variavel", 
			"termo_literal", "possessivos", "possessivo_antigo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'o'", "'a'", "'os'", "'as'", "'um'", "'uma'", "'uns'", 
			"'umas'", "'este'", "'esta'", "'estes'", "'estas'", "'esse'", "'essa'", 
			"'esses'", "'essas'", "'ao'", "'\\u00E0'", "'aos'", "'\\u00E0s'", "'no'", 
			"'na'", "'nos'", "'nas'", "'pelo'", "'pela'", "'pelos'", "'pelas'", "'num'", 
			"'numa'", "'nuns'", "'numas'", "'dum'", "'duma'", "'duns'", "'dumas'", 
			"'desse'", "'dessa'", "'desses'", "'dessas'", "'deste'", "'desta'", "'destes'", 
			"'destas'", "'igual a'", "'diferente de'", "'maior que'", "'maior do que'", 
			"'maior ou igual a'", "'menor que'", "'menor do que'", "'menor ou igual a'", 
			"'Se'", "'Itere'", "'Reitere'", "'Pare'", "'Retorne'", "'Preserve'", 
			"'Diga'", "'sim'", "'n\\u00E3o'", "'original'", "'Decodifique'", "'Processe'", 
			"'retornando'", "'Push'", "'Pop'", "'nulo'", "'vazio'", "'inexistente'", 
			"'denominado'", "'denominada'", "'denominados'", "'denominadas'", "'chamado'", 
			"'chamada'", "'chamados'", "'chamadas'", "'\\u00E9'", "'est\\u00E1'", 
			"'estiver'", "'for'", "'forem'", "'s\\u00E3o'", "'est\\u00E3o'", "'estiverem'", 
			"'ser'", "'serem'", "'estar'", "'poder'", "'puder'", "'foi'", "'estamos'", 
			"'h\\u00E1'", "'pode'", "'existe'", "'existir'", "'cont\\u00E9m'", "'contiver'", 
			"'possui'", "'possuir'", "'~'", "'@'", "'#'", "'%'", "'_'", "'&'", "''s'", 
			"'!'", "'?'", "'|'", "'*'", "'^'", "'<'", "'>'", "'{'", "'}'", "'byte'", 
			"'caractere'", "'word'", "'n\\u00FAmero'", "'sinalizador'", "'ponteiro'", 
			"'estrutura'", "'string'", "'subtexto'", "'texto hexadecimal'", "'lista'", 
			"'lista estruturada'", "'listas'", "'propor\\u00E7\\u00E3o'", "'fra\\u00E7\\u00E3o'", 
			"'numerador'", "'denominador'", "'\\u00E9 uma estrutura com'", "'para'", 
			"'com'", "'bytes'", "'sob'", "'(refer\\u00EAncia)'", "'e'", "'ou'", "'nem'", 
			"'usando'", "'por'", "'contendo'", "'desde'", "'entre'", "'sobre'", "'cima'", 
			"'embaixo'", "'abaixo'", "'antes'", "'depois'", "'ap\\u00F3s'", "'cerca'", 
			"'pr\\u00F3ximo'", "'at\\u00E9'", "'aproximadamente'", "'como'", "'Rotina'", 
			"'para que se'", "'para que se determine se'", "'Fun\\u00E7\\u00E3o'", 
			"'para que se atribua'", "'para que se compativelmente'", "'Itere.'", 
			"'\"'", "'Aponte'", "'para a rotina'", "'Diga sim'", "'Diga n\\u00E3o'", 
			"'mais'", "'menos'", "'vezes'", "'multiplicado por'", "'dividido por'", 
			"'junto com'", "'seguido de'", "'acompanhado de'", "'inexistene'", "'conte\\u00FAdo'", 
			"'magnitude'", "'endere\\u00E7amento'", null, null, null, null, "'''", 
			"'\\\"'", "'-'", "'$'", null, "'\\u00A0'", null, "'/'", "'\\'", "'+'", 
			"'.'", "','", "';'", "':'", "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "LETRA", "DIGITO", "SIMBOLO", "ESPACO", 
			"APOSTROFO", "ASPAS_DUPLAS", "HIFEN", "CIFRAO", "ESPACO_EM_BRANCO", "ESPACO_RIGIDO", 
			"QUEBRA_DE_LINHA", "BARRA_INCLINADA", "BARRA_INVERTIDA", "SINAL_DE_ADICAO", 
			"PONTO", "VIRGULA", "PONTO_E_VIRGULA", "DOIS_PONTOS", "ABRE_PARENTESES", 
			"FECHA_PARENTESES", "ABRE_COLCHETES", "FECHA_COLCHETES", "CARACTERES_IMPRIMIVEIS", 
			"CARACTERES_DE_CONTROLE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PortuguesPuro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PortuguesPuroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Regra_espacoContext extends ParserRuleContext {
		public Regra_espacoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regra_espaco; }
	}

	public final Regra_espacoContext regra_espaco() throws RecognitionException {
		Regra_espacoContext _localctx = new Regra_espacoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_regra_espaco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PalavraContext extends ParserRuleContext {
		public List<TerminalNode> CARACTERES_IMPRIMIVEIS() { return getTokens(PortuguesPuroParser.CARACTERES_IMPRIMIVEIS); }
		public TerminalNode CARACTERES_IMPRIMIVEIS(int i) {
			return getToken(PortuguesPuroParser.CARACTERES_IMPRIMIVEIS, i);
		}
		public PalavraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavra; }
	}

	public final PalavraContext palavra() throws RecognitionException {
		PalavraContext _localctx = new PalavraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_palavra);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(188);
					match(CARACTERES_IMPRIMIVEIS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PossessivoContext extends ParserRuleContext {
		public PalavraContext palavra() {
			return getRuleContext(PalavraContext.class,0);
		}
		public TerminalNode APOSTROFO() { return getToken(PortuguesPuroParser.APOSTROFO, 0); }
		public PossessivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possessivo; }
	}

	public final PossessivoContext possessivo() throws RecognitionException {
		PossessivoContext _localctx = new PossessivoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_possessivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			palavra();
			setState(194);
			match(APOSTROFO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArtigoContext extends ParserRuleContext {
		public Artigo_definidoContext artigo_definido() {
			return getRuleContext(Artigo_definidoContext.class,0);
		}
		public Artigo_indefinidoContext artigo_indefinido() {
			return getRuleContext(Artigo_indefinidoContext.class,0);
		}
		public ArtigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_artigo; }
	}

	public final ArtigoContext artigo() throws RecognitionException {
		ArtigoContext _localctx = new ArtigoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_artigo);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				artigo_definido();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				artigo_indefinido();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Artigo_definidoContext extends ParserRuleContext {
		public AdjacentesContext adjacentes() {
			return getRuleContext(AdjacentesContext.class,0);
		}
		public Artigo_definidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_artigo_definido; }
	}

	public final Artigo_definidoContext artigo_definido() throws RecognitionException {
		Artigo_definidoContext _localctx = new Artigo_definidoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_artigo_definido);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(T__4);
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				adjacentes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Artigo_indefinidoContext extends ParserRuleContext {
		public AbrangentesContext abrangentes() {
			return getRuleContext(AbrangentesContext.class,0);
		}
		public Artigo_indefinidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_artigo_indefinido; }
	}

	public final Artigo_indefinidoContext artigo_indefinido() throws RecognitionException {
		Artigo_indefinidoContext _localctx = new Artigo_indefinidoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_artigo_indefinido);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(T__8);
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				abrangentes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdjacentesContext extends ParserRuleContext {
		public AdjacentesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjacentes; }
	}

	public final AdjacentesContext adjacentes() throws RecognitionException {
		AdjacentesContext _localctx = new AdjacentesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_adjacentes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AbrangentesContext extends ParserRuleContext {
		public AbrangentesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abrangentes; }
	}

	public final AbrangentesContext abrangentes() throws RecognitionException {
		AbrangentesContext _localctx = new AbrangentesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_abrangentes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContracoesContext extends ParserRuleContext {
		public Atribuidores_de_posseContext atribuidores_de_posse() {
			return getRuleContext(Atribuidores_de_posseContext.class,0);
		}
		public P1Context p1() {
			return getRuleContext(P1Context.class,0);
		}
		public P2Context p2() {
			return getRuleContext(P2Context.class,0);
		}
		public ContracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contracoes; }
	}

	public final ContracoesContext contracoes() throws RecognitionException {
		ContracoesContext _localctx = new ContracoesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_contracoes);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(224);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 8);
				{
				setState(225);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 9);
				{
				setState(226);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 10);
				{
				setState(227);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 11);
				{
				setState(228);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 12);
				{
				setState(229);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 13);
				{
				setState(230);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 14);
				{
				setState(231);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 15);
				{
				setState(232);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 16);
				{
				setState(233);
				match(T__32);
				}
				break;
			case T__33:
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 17);
				{
				setState(234);
				atribuidores_de_posse();
				}
				break;
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 18);
				{
				setState(235);
				p1();
				}
				break;
			case T__41:
			case T__42:
			case T__43:
			case T__44:
				enterOuterAlt(_localctx, 19);
				{
				setState(236);
				p2();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Atribuidores_de_posseContext extends ParserRuleContext {
		public Atribuidores_de_posseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuidores_de_posse; }
	}

	public final Atribuidores_de_posseContext atribuidores_de_posse() throws RecognitionException {
		Atribuidores_de_posseContext _localctx = new Atribuidores_de_posseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuidores_de_posse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class P1Context extends ParserRuleContext {
		public P1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p1; }
	}

	public final P1Context p1() throws RecognitionException {
		P1Context _localctx = new P1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_p1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class P2Context extends ParserRuleContext {
		public P2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p2; }
	}

	public final P2Context p2() throws RecognitionException {
		P2Context _localctx = new P2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_p2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970697666560L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operadores_de_comparacaoContext extends ParserRuleContext {
		public Operadores_de_comparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadores_de_comparacao; }
	}

	public final Operadores_de_comparacaoContext operadores_de_comparacao() throws RecognitionException {
		Operadores_de_comparacaoContext _localctx = new Operadores_de_comparacaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operadores_de_comparacao);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 9);
				{
				setState(253);
				match(T__52);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Palavras_reservadasContext extends ParserRuleContext {
		public DenominacoesContext denominacoes() {
			return getRuleContext(DenominacoesContext.class,0);
		}
		public Palavras_reservadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavras_reservadas; }
	}

	public final Palavras_reservadasContext palavras_reservadas() throws RecognitionException {
		Palavras_reservadasContext _localctx = new Palavras_reservadasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_palavras_reservadas);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(T__55);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				match(T__59);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				match(T__60);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 9);
				{
				setState(264);
				match(T__61);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 10);
				{
				setState(265);
				match(T__62);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 11);
				{
				setState(266);
				match(T__63);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 12);
				{
				setState(267);
				match(T__64);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 13);
				{
				setState(268);
				match(T__65);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 14);
				{
				setState(269);
				match(T__66);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 15);
				{
				setState(270);
				match(T__67);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 16);
				{
				setState(271);
				match(T__68);
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 17);
				{
				setState(272);
				match(T__69);
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 18);
				{
				setState(273);
				match(T__70);
				}
				break;
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
				enterOuterAlt(_localctx, 19);
				{
				setState(274);
				denominacoes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DenominacoesContext extends ParserRuleContext {
		public DenominacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_denominacoes; }
	}

	public final DenominacoesContext denominacoes() throws RecognitionException {
		DenominacoesContext _localctx = new DenominacoesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_denominacoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VerbosContext extends ParserRuleContext {
		public VerbosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbos; }
	}

	public final VerbosContext verbos() throws RecognitionException {
		VerbosContext _localctx = new VerbosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_verbos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 8388607L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Caracteres_ignoraveisContext extends ParserRuleContext {
		public TerminalNode CARACTERES_DE_CONTROLE() { return getToken(PortuguesPuroParser.CARACTERES_DE_CONTROLE, 0); }
		public TerminalNode ESPACO_EM_BRANCO() { return getToken(PortuguesPuroParser.ESPACO_EM_BRANCO, 0); }
		public TerminalNode ESPACO_RIGIDO() { return getToken(PortuguesPuroParser.ESPACO_RIGIDO, 0); }
		public Caracteres_ignoraveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracteres_ignoraveis; }
	}

	public final Caracteres_ignoraveisContext caracteres_ignoraveis() throws RecognitionException {
		Caracteres_ignoraveisContext _localctx = new Caracteres_ignoraveisContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caracteres_ignoraveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & 32771L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComentarioContext extends ParserRuleContext {
		public Comentario_de_linhaContext comentario_de_linha() {
			return getRuleContext(Comentario_de_linhaContext.class,0);
		}
		public Comentario_de_blocoContext comentario_de_bloco() {
			return getRuleContext(Comentario_de_blocoContext.class,0);
		}
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comentario);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BARRA_INVERTIDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				comentario_de_linha();
				}
				break;
			case ABRE_COLCHETES:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				comentario_de_bloco();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comentario_de_linhaContext extends ParserRuleContext {
		public TerminalNode BARRA_INVERTIDA() { return getToken(PortuguesPuroParser.BARRA_INVERTIDA, 0); }
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(PortuguesPuroParser.QUEBRA_DE_LINHA, 0); }
		public List<TerminalNode> CARACTERES_IMPRIMIVEIS() { return getTokens(PortuguesPuroParser.CARACTERES_IMPRIMIVEIS); }
		public TerminalNode CARACTERES_IMPRIMIVEIS(int i) {
			return getToken(PortuguesPuroParser.CARACTERES_IMPRIMIVEIS, i);
		}
		public Comentario_de_linhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario_de_linha; }
	}

	public final Comentario_de_linhaContext comentario_de_linha() throws RecognitionException {
		Comentario_de_linhaContext _localctx = new Comentario_de_linhaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comentario_de_linha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(BARRA_INVERTIDA);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARACTERES_IMPRIMIVEIS) {
				{
				{
				setState(288);
				match(CARACTERES_IMPRIMIVEIS);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(QUEBRA_DE_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comentario_de_blocoContext extends ParserRuleContext {
		public TerminalNode ABRE_COLCHETES() { return getToken(PortuguesPuroParser.ABRE_COLCHETES, 0); }
		public TerminalNode FECHA_COLCHETES() { return getToken(PortuguesPuroParser.FECHA_COLCHETES, 0); }
		public List<TerminalNode> CARACTERES_IMPRIMIVEIS() { return getTokens(PortuguesPuroParser.CARACTERES_IMPRIMIVEIS); }
		public TerminalNode CARACTERES_IMPRIMIVEIS(int i) {
			return getToken(PortuguesPuroParser.CARACTERES_IMPRIMIVEIS, i);
		}
		public Comentario_de_blocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario_de_bloco; }
	}

	public final Comentario_de_blocoContext comentario_de_bloco() throws RecognitionException {
		Comentario_de_blocoContext _localctx = new Comentario_de_blocoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comentario_de_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ABRE_COLCHETES);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARACTERES_IMPRIMIVEIS) {
				{
				{
				setState(297);
				match(CARACTERES_IMPRIMIVEIS);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(FECHA_COLCHETES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TokenContext extends ParserRuleContext {
		public AglomeradoContext aglomerado() {
			return getRuleContext(AglomeradoContext.class,0);
		}
		public PossessivoContext possessivo() {
			return getRuleContext(PossessivoContext.class,0);
		}
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_token);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case LETRA:
			case DIGITO:
			case APOSTROFO:
			case CIFRAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				aglomerado();
				}
				break;
			case CARACTERES_IMPRIMIVEIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				possessivo();
				}
				break;
			case ABRE_PARENTESES:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				qualificador();
				}
				break;
			case ASPAS_DUPLAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				string_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AglomeradoContext extends ParserRuleContext {
		public Iniciador_de_aglomeradoContext iniciador_de_aglomerado() {
			return getRuleContext(Iniciador_de_aglomeradoContext.class,0);
		}
		public Caractere_aglomeravelContext caractere_aglomeravel() {
			return getRuleContext(Caractere_aglomeravelContext.class,0);
		}
		public AglomeradoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aglomerado; }
	}

	public final AglomeradoContext aglomerado() throws RecognitionException {
		AglomeradoContext _localctx = new AglomeradoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_aglomerado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			iniciador_de_aglomerado();
			{
			setState(312);
			caractere_aglomeravel();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Caractere_aglomeravelContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(PortuguesPuroParser.LETRA, 0); }
		public TerminalNode DIGITO() { return getToken(PortuguesPuroParser.DIGITO, 0); }
		public TerminalNode CIFRAO() { return getToken(PortuguesPuroParser.CIFRAO, 0); }
		public TerminalNode HIFEN() { return getToken(PortuguesPuroParser.HIFEN, 0); }
		public TerminalNode SINAL_DE_ADICAO() { return getToken(PortuguesPuroParser.SINAL_DE_ADICAO, 0); }
		public TerminalNode BARRA_INCLINADA() { return getToken(PortuguesPuroParser.BARRA_INCLINADA, 0); }
		public Caractere_aglomeravelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caractere_aglomeravel; }
	}

	public final Caractere_aglomeravelContext caractere_aglomeravel() throws RecognitionException {
		Caractere_aglomeravelContext _localctx = new Caractere_aglomeravelContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_caractere_aglomeravel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 63L) != 0) || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & 10435L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Iniciador_de_aglomeradoContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(PortuguesPuroParser.LETRA, 0); }
		public TerminalNode DIGITO() { return getToken(PortuguesPuroParser.DIGITO, 0); }
		public TerminalNode CIFRAO() { return getToken(PortuguesPuroParser.CIFRAO, 0); }
		public TerminalNode APOSTROFO() { return getToken(PortuguesPuroParser.APOSTROFO, 0); }
		public Iniciador_de_aglomeradoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iniciador_de_aglomerado; }
	}

	public final Iniciador_de_aglomeradoContext iniciador_de_aglomerado() throws RecognitionException {
		Iniciador_de_aglomeradoContext _localctx = new Iniciador_de_aglomeradoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_iniciador_de_aglomerado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 63L) != 0) || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & 147L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Possessivo_novoContext extends ParserRuleContext {
		public Caractere_nao_aglomeravelContext caractere_nao_aglomeravel() {
			return getRuleContext(Caractere_nao_aglomeravelContext.class,0);
		}
		public Possessivo_novoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possessivo_novo; }
	}

	public final Possessivo_novoContext possessivo_novo() throws RecognitionException {
		Possessivo_novoContext _localctx = new Possessivo_novoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_possessivo_novo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__108);
			setState(319);
			caractere_nao_aglomeravel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualificadorContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(PortuguesPuroParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(PortuguesPuroParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> CARACTERES_IMPRIMIVEIS() { return getTokens(PortuguesPuroParser.CARACTERES_IMPRIMIVEIS); }
		public TerminalNode CARACTERES_IMPRIMIVEIS(int i) {
			return getToken(PortuguesPuroParser.CARACTERES_IMPRIMIVEIS, i);
		}
		public QualificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualificador; }
	}

	public final QualificadorContext qualificador() throws RecognitionException {
		QualificadorContext _localctx = new QualificadorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_qualificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ABRE_PARENTESES);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARACTERES_IMPRIMIVEIS) {
				{
				{
				setState(322);
				match(CARACTERES_IMPRIMIVEIS);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Caractere_nao_aglomeravelContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(PortuguesPuroParser.LETRA, 0); }
		public TerminalNode DIGITO() { return getToken(PortuguesPuroParser.DIGITO, 0); }
		public TerminalNode CIFRAO() { return getToken(PortuguesPuroParser.CIFRAO, 0); }
		public TerminalNode HIFEN() { return getToken(PortuguesPuroParser.HIFEN, 0); }
		public TerminalNode SINAL_DE_ADICAO() { return getToken(PortuguesPuroParser.SINAL_DE_ADICAO, 0); }
		public TerminalNode BARRA_INCLINADA() { return getToken(PortuguesPuroParser.BARRA_INCLINADA, 0); }
		public Caractere_nao_aglomeravelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caractere_nao_aglomeravel; }
	}

	public final Caractere_nao_aglomeravelContext caractere_nao_aglomeravel() throws RecognitionException {
		Caractere_nao_aglomeravelContext _localctx = new Caractere_nao_aglomeravelContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_caractere_nao_aglomeravel);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==LETRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==DIGITO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__102) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__103) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__104) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__105) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(336);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__106) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(337);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CIFRAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(338);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__107) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(339);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==HIFEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(340);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SINAL_DE_ADICAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(341);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==BARRA_INCLINADA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sinal_de_pontuacaoContext extends ParserRuleContext {
		public TerminalNode PONTO() { return getToken(PortuguesPuroParser.PONTO, 0); }
		public TerminalNode VIRGULA() { return getToken(PortuguesPuroParser.VIRGULA, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(PortuguesPuroParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(PortuguesPuroParser.DOIS_PONTOS, 0); }
		public Sinal_de_pontuacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinal_de_pontuacao; }
	}

	public final Sinal_de_pontuacaoContext sinal_de_pontuacao() throws RecognitionException {
		Sinal_de_pontuacaoContext _localctx = new Sinal_de_pontuacaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sinal_de_pontuacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if ( !(_la==T__109 || _la==T__110 || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simbolos_especiaisContext extends ParserRuleContext {
		public TerminalNode SINAL_DE_ADICAO() { return getToken(PortuguesPuroParser.SINAL_DE_ADICAO, 0); }
		public TerminalNode HIFEN() { return getToken(PortuguesPuroParser.HIFEN, 0); }
		public TerminalNode BARRA_INCLINADA() { return getToken(PortuguesPuroParser.BARRA_INCLINADA, 0); }
		public Simbolos_especiaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simbolos_especiais; }
	}

	public final Simbolos_especiaisContext simbolos_especiais() throws RecognitionException {
		Simbolos_especiaisContext _localctx = new Simbolos_especiaisContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_simbolos_especiais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 127L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 161L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoiseContext extends ParserRuleContext {
		public Caracteres_ignoraveisContext caracteres_ignoraveis() {
			return getRuleContext(Caracteres_ignoraveisContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public NoiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noise; }
	}

	public final NoiseContext noise() throws RecognitionException {
		NoiseContext _localctx = new NoiseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_noise);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESPACO_EM_BRANCO:
			case ESPACO_RIGIDO:
			case CARACTERES_DE_CONTROLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				caracteres_ignoraveis();
				}
				break;
			case BARRA_INVERTIDA:
			case ABRE_COLCHETES:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				comentario();
				}
				break;
			case ABRE_PARENTESES:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				qualificador();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_inteiroContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(PortuguesPuroParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(PortuguesPuroParser.DIGITO, i);
		}
		public Numero_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_inteiro; }
	}

	public final Numero_inteiroContext numero_inteiro() throws RecognitionException {
		Numero_inteiroContext _localctx = new Numero_inteiroContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_numero_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(353);
				match(DIGITO);
				}
				}
				setState(356); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_decimalContext extends ParserRuleContext {
		public Numero_inteiroContext numero_inteiro() {
			return getRuleContext(Numero_inteiroContext.class,0);
		}
		public TerminalNode HIFEN() { return getToken(PortuguesPuroParser.HIFEN, 0); }
		public Numero_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_decimal; }
	}

	public final Numero_decimalContext numero_decimal() throws RecognitionException {
		Numero_decimalContext _localctx = new Numero_decimalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numero_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HIFEN) {
				{
				setState(358);
				match(HIFEN);
				}
			}

			setState(361);
			numero_inteiro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_fracionarioContext extends ParserRuleContext {
		public Numero_decimalContext numero_decimal() {
			return getRuleContext(Numero_decimalContext.class,0);
		}
		public TerminalNode BARRA_INCLINADA() { return getToken(PortuguesPuroParser.BARRA_INCLINADA, 0); }
		public Numero_inteiroContext numero_inteiro() {
			return getRuleContext(Numero_inteiroContext.class,0);
		}
		public Numero_fracionarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_fracionario; }
	}

	public final Numero_fracionarioContext numero_fracionario() throws RecognitionException {
		Numero_fracionarioContext _localctx = new Numero_fracionarioContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numero_fracionario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			numero_decimal();
			setState(364);
			match(BARRA_INCLINADA);
			setState(365);
			numero_inteiro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_mistoContext extends ParserRuleContext {
		public Numero_decimalContext numero_decimal() {
			return getRuleContext(Numero_decimalContext.class,0);
		}
		public TerminalNode SINAL_DE_ADICAO() { return getToken(PortuguesPuroParser.SINAL_DE_ADICAO, 0); }
		public Numero_fracionarioContext numero_fracionario() {
			return getRuleContext(Numero_fracionarioContext.class,0);
		}
		public Numero_mistoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_misto; }
	}

	public final Numero_mistoContext numero_misto() throws RecognitionException {
		Numero_mistoContext _localctx = new Numero_mistoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numero_misto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			numero_decimal();
			setState(368);
			match(SINAL_DE_ADICAO);
			setState(369);
			numero_fracionario();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_hexadecimalContext extends ParserRuleContext {
		public TerminalNode CIFRAO() { return getToken(PortuguesPuroParser.CIFRAO, 0); }
		public Numero_inteiroContext numero_inteiro() {
			return getRuleContext(Numero_inteiroContext.class,0);
		}
		public Numero_hexadecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_hexadecimal; }
	}

	public final Numero_hexadecimalContext numero_hexadecimal() throws RecognitionException {
		Numero_hexadecimalContext _localctx = new Numero_hexadecimalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_numero_hexadecimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(CIFRAO);
			setState(372);
			numero_inteiro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public List<TerminalNode> ASPAS_DUPLAS() { return getTokens(PortuguesPuroParser.ASPAS_DUPLAS); }
		public TerminalNode ASPAS_DUPLAS(int i) {
			return getToken(PortuguesPuroParser.ASPAS_DUPLAS, i);
		}
		public List<TerminalNode> CARACTERES_IMPRIMIVEIS() { return getTokens(PortuguesPuroParser.CARACTERES_IMPRIMIVEIS); }
		public TerminalNode CARACTERES_IMPRIMIVEIS(int i) {
			return getToken(PortuguesPuroParser.CARACTERES_IMPRIMIVEIS, i);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(ASPAS_DUPLAS);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARACTERES_IMPRIMIVEIS) {
				{
				{
				setState(375);
				match(CARACTERES_IMPRIMIVEIS);
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
			match(ASPAS_DUPLAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Variavel_globalContext variavel_global() {
			return getRuleContext(Variavel_globalContext.class,0);
		}
		public RotinaContext rotina() {
			return getRuleContext(RotinaContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_programa);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				tipo();
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				variavel_global();
				}
				break;
			case T__161:
			case T__162:
			case T__163:
			case T__164:
			case T__165:
			case T__166:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				rotina();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipos_primitivosContext extends ParserRuleContext {
		public Tipos_primitivosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_primitivos; }
	}

	public final Tipos_primitivosContext tipos_primitivos() throws RecognitionException {
		Tipos_primitivosContext _localctx = new Tipos_primitivosContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tipos_primitivos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & 131071L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public List<Artigo_indefinidoContext> artigo_indefinido() {
			return getRuleContexts(Artigo_indefinidoContext.class);
		}
		public Artigo_indefinidoContext artigo_indefinido(int i) {
			return getRuleContext(Artigo_indefinidoContext.class,i);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public Nome_do_tipoContext nome_do_tipo() {
			return getRuleContext(Nome_do_tipoContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(PortuguesPuroParser.PONTO, 0); }
		public Informacao_opcionalContext informacao_opcional() {
			return getRuleContext(Informacao_opcionalContext.class,0);
		}
		public CamposContext campos() {
			return getRuleContext(CamposContext.class,0);
		}
		public Numero_inteiroContext numero_inteiro() {
			return getRuleContext(Numero_inteiroContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tipo);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				artigo_indefinido();
				setState(391);
				nome();
				setState(392);
				match(T__79);
				setState(393);
				artigo_indefinido();
				setState(394);
				nome_do_tipo();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__136 || _la==T__137) {
					{
					setState(395);
					informacao_opcional();
					}
				}

				setState(398);
				match(PONTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				artigo_indefinido();
				setState(401);
				nome();
				setState(402);
				match(T__135);
				setState(403);
				campos();
				setState(404);
				match(PONTO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				artigo_indefinido();
				setState(407);
				nome();
				setState(408);
				match(T__79);
				setState(409);
				numero_inteiro();
				setState(410);
				nome_do_tipo();
				setState(411);
				match(PONTO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NomeContext extends ParserRuleContext {
		public PalavraContext palavra() {
			return getRuleContext(PalavraContext.class,0);
		}
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			palavra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nome_do_tipoContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public Nome_do_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_do_tipo; }
	}

	public final Nome_do_tipoContext nome_do_tipo() throws RecognitionException {
		Nome_do_tipoContext _localctx = new Nome_do_tipoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_nome_do_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			nome();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Informacao_opcionalContext extends ParserRuleContext {
		public Artigo_indefinidoContext artigo_indefinido() {
			return getRuleContext(Artigo_indefinidoContext.class,0);
		}
		public Nome_do_tipoContext nome_do_tipo() {
			return getRuleContext(Nome_do_tipoContext.class,0);
		}
		public CamposContext campos() {
			return getRuleContext(CamposContext.class,0);
		}
		public Informacao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_informacao_opcional; }
	}

	public final Informacao_opcionalContext informacao_opcional() throws RecognitionException {
		Informacao_opcionalContext _localctx = new Informacao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_informacao_opcional);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__136:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(T__136);
				setState(420);
				artigo_indefinido();
				setState(421);
				nome_do_tipo();
				}
				break;
			case T__137:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(T__137);
				setState(424);
				campos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CamposContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<PausasContext> pausas() {
			return getRuleContexts(PausasContext.class);
		}
		public PausasContext pausas(int i) {
			return getRuleContext(PausasContext.class,i);
		}
		public CamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos; }
	}

	public final CamposContext campos() throws RecognitionException {
		CamposContext _localctx = new CamposContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_campos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			campo();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 1729382256910270467L) != 0)) {
				{
				{
				setState(428);
				pausas();
				setState(429);
				campo();
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CampoContext extends ParserRuleContext {
		public Artigo_indefinidoContext artigo_indefinido() {
			return getRuleContext(Artigo_indefinidoContext.class,0);
		}
		public Numero_inteiroContext numero_inteiro() {
			return getRuleContext(Numero_inteiroContext.class,0);
		}
		public DenominacoesContext denominacoes() {
			return getRuleContext(DenominacoesContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public Artigo_definidoContext artigo_definido() {
			return getRuleContext(Artigo_definidoContext.class,0);
		}
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				{
				setState(436);
				artigo_indefinido();
				}
				break;
			case DIGITO:
				{
				setState(437);
				numero_inteiro();
				setState(438);
				match(T__138);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
				{
				setState(442);
				denominacoes();
				setState(443);
				nome();
				}
				break;
			case T__139:
				{
				setState(445);
				match(T__139);
				setState(446);
				artigo_definido();
				setState(447);
				nome();
				}
				break;
			case T__140:
				{
				setState(449);
				match(T__140);
				}
				break;
			case T__141:
			case T__142:
			case PONTO:
			case VIRGULA:
			case PONTO_E_VIRGULA:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PausaContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(PortuguesPuroParser.VIRGULA, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(PortuguesPuroParser.PONTO_E_VIRGULA, 0); }
		public PausaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pausa; }
	}

	public final PausaContext pausa() throws RecognitionException {
		PausaContext _localctx = new PausaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_pausa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 1729382256910270467L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PausasContext extends ParserRuleContext {
		public List<PausaContext> pausa() {
			return getRuleContexts(PausaContext.class);
		}
		public PausaContext pausa(int i) {
			return getRuleContext(PausaContext.class,i);
		}
		public PausasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pausas; }
	}

	public final PausasContext pausas() throws RecognitionException {
		PausasContext _localctx = new PausasContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pausas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454);
				pausa();
				}
				}
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 1729382256910270467L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConjuncoesContext extends ParserRuleContext {
		public ConjuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuncoes; }
	}

	public final ConjuncoesContext conjuncoes() throws RecognitionException {
		ConjuncoesContext _localctx = new ConjuncoesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_conjuncoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PreposicoesContext extends ParserRuleContext {
		public PreposicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preposicoes; }
	}

	public final PreposicoesContext preposicoes() throws RecognitionException {
		PreposicoesContext _localctx = new PreposicoesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_preposicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26 || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & 16777093L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variavel_globalContext extends ParserRuleContext {
		public List<Artigo_definidoContext> artigo_definido() {
			return getRuleContexts(Artigo_definidoContext.class);
		}
		public Artigo_definidoContext artigo_definido(int i) {
			return getRuleContext(Artigo_definidoContext.class,i);
		}
		public List<NomeContext> nome() {
			return getRuleContexts(NomeContext.class);
		}
		public NomeContext nome(int i) {
			return getRuleContext(NomeContext.class,i);
		}
		public Artigo_indefinidoContext artigo_indefinido() {
			return getRuleContext(Artigo_indefinidoContext.class,0);
		}
		public Nome_do_tipoContext nome_do_tipo() {
			return getRuleContext(Nome_do_tipoContext.class,0);
		}
		public List<TerminalNode> PONTO() { return getTokens(PortuguesPuroParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(PortuguesPuroParser.PONTO, i);
		}
		public Informacao_opcionalContext informacao_opcional() {
			return getRuleContext(Informacao_opcionalContext.class,0);
		}
		public CamposContext campos() {
			return getRuleContext(CamposContext.class,0);
		}
		public List<Termo_constanteContext> termo_constante() {
			return getRuleContexts(Termo_constanteContext.class);
		}
		public Termo_constanteContext termo_constante(int i) {
			return getRuleContext(Termo_constanteContext.class,i);
		}
		public Variavel_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel_global; }
	}

	public final Variavel_globalContext variavel_global() throws RecognitionException {
		Variavel_globalContext _localctx = new Variavel_globalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variavel_global);
		int _la;
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				artigo_definido();
				setState(464);
				nome();
				setState(465);
				match(T__79);
				setState(466);
				artigo_indefinido();
				setState(467);
				nome_do_tipo();
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__136 || _la==T__137) {
					{
					setState(468);
					informacao_opcional();
					}
				}

				setState(471);
				match(PONTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				artigo_definido();
				setState(474);
				nome();
				setState(475);
				match(T__135);
				setState(476);
				campos();
				setState(477);
				match(PONTO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				artigo_definido();
				setState(480);
				nome();
				setState(481);
				match(T__79);
				setState(482);
				artigo_indefinido();
				setState(483);
				nome_do_tipo();
				setState(484);
				match(T__45);
				setState(485);
				termo_constante();
				setState(486);
				match(PONTO);
				setState(487);
				artigo_definido();
				setState(488);
				nome();
				setState(489);
				match(T__79);
				setState(490);
				termo_constante();
				setState(491);
				match(PONTO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RotinaContext extends ParserRuleContext {
		public ProcedimentoContext procedimento() {
			return getRuleContext(ProcedimentoContext.class,0);
		}
		public DecisorContext decisor() {
			return getRuleContext(DecisorContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public RetroinvocacaoContext retroinvocacao() {
			return getRuleContext(RetroinvocacaoContext.class,0);
		}
		public RotinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotina; }
	}

	public final RotinaContext rotina() throws RecognitionException {
		RotinaContext _localctx = new RotinaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_rotina);
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				procedimento();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				decisor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				funcao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(499);
				retroinvocacao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedimentoContext extends ParserRuleContext {
		public InstrucoesContext instrucoes() {
			return getRuleContext(InstrucoesContext.class,0);
		}
		public Nome_da_rotinaContext nome_da_rotina() {
			return getRuleContext(Nome_da_rotinaContext.class,0);
		}
		public TerminalNode PONTO_E_VIRGULA() { return getToken(PortuguesPuroParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(PortuguesPuroParser.DOIS_PONTOS, 0); }
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__161) {
					{
					setState(502);
					match(T__161);
					}
				}

				setState(505);
				match(T__162);
				setState(506);
				nome_da_rotina();
				setState(507);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 2:
				{
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__161) {
					{
					setState(509);
					match(T__161);
					}
				}

				setState(512);
				match(T__162);
				setState(513);
				nome_da_rotina();
				setState(514);
				match(DOIS_PONTOS);
				}
				break;
			}
			setState(518);
			instrucoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecisorContext extends ParserRuleContext {
		public Nome_da_rotinaContext nome_da_rotina() {
			return getRuleContext(Nome_da_rotinaContext.class,0);
		}
		public TerminalNode PONTO_E_VIRGULA() { return getToken(PortuguesPuroParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(PortuguesPuroParser.DOIS_PONTOS, 0); }
		public DecisorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decisor; }
	}

	public final DecisorContext decisor() throws RecognitionException {
		DecisorContext _localctx = new DecisorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_decisor);
		int _la;
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__161) {
					{
					setState(520);
					match(T__161);
					}
				}

				setState(523);
				match(T__163);
				setState(524);
				nome_da_rotina();
				setState(525);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__161) {
					{
					setState(527);
					match(T__161);
					}
				}

				setState(530);
				match(T__163);
				setState(531);
				nome_da_rotina();
				setState(532);
				match(DOIS_PONTOS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public InstrucoesContext instrucoes() {
			return getRuleContext(InstrucoesContext.class,0);
		}
		public Artigo_definidoContext artigo_definido() {
			return getRuleContext(Artigo_definidoContext.class,0);
		}
		public List<Nome_do_tipoContext> nome_do_tipo() {
			return getRuleContexts(Nome_do_tipoContext.class);
		}
		public Nome_do_tipoContext nome_do_tipo(int i) {
			return getRuleContext(Nome_do_tipoContext.class,i);
		}
		public Atribuidores_de_posseContext atribuidores_de_posse() {
			return getRuleContext(Atribuidores_de_posseContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public Artigo_indefinidoContext artigo_indefinido() {
			return getRuleContext(Artigo_indefinidoContext.class,0);
		}
		public TerminalNode PONTO_E_VIRGULA() { return getToken(PortuguesPuroParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(PortuguesPuroParser.DOIS_PONTOS, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__164) {
					{
					setState(536);
					match(T__164);
					}
				}

				setState(539);
				match(T__165);
				setState(540);
				artigo_definido();
				setState(541);
				nome_do_tipo();
				setState(542);
				atribuidores_de_posse();
				setState(543);
				nome();
				setState(544);
				match(T__136);
				setState(545);
				artigo_indefinido();
				setState(546);
				nome_do_tipo();
				setState(547);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 2:
				{
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__164) {
					{
					setState(549);
					match(T__164);
					}
				}

				setState(552);
				match(T__165);
				setState(553);
				artigo_definido();
				setState(554);
				nome_do_tipo();
				setState(555);
				atribuidores_de_posse();
				setState(556);
				nome();
				setState(557);
				match(T__136);
				setState(558);
				artigo_indefinido();
				setState(559);
				nome_do_tipo();
				setState(560);
				match(DOIS_PONTOS);
				}
				break;
			}
			setState(564);
			instrucoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetroinvocacaoContext extends ParserRuleContext {
		public InstrucoesContext instrucoes() {
			return getRuleContext(InstrucoesContext.class,0);
		}
		public Nome_da_rotinaContext nome_da_rotina() {
			return getRuleContext(Nome_da_rotinaContext.class,0);
		}
		public TerminalNode PONTO_E_VIRGULA() { return getToken(PortuguesPuroParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(PortuguesPuroParser.DOIS_PONTOS, 0); }
		public RetroinvocacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retroinvocacao; }
	}

	public final RetroinvocacaoContext retroinvocacao() throws RecognitionException {
		RetroinvocacaoContext _localctx = new RetroinvocacaoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_retroinvocacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__161) {
					{
					setState(566);
					match(T__161);
					}
				}

				setState(569);
				match(T__166);
				setState(570);
				nome_da_rotina();
				setState(571);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 2:
				{
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__161) {
					{
					setState(573);
					match(T__161);
					}
				}

				setState(576);
				match(T__166);
				setState(577);
				nome_da_rotina();
				setState(578);
				match(DOIS_PONTOS);
				}
				break;
			}
			setState(582);
			instrucoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nome_da_rotinaContext extends ParserRuleContext {
		public Unidade_semanticaContext unidade_semantica() {
			return getRuleContext(Unidade_semanticaContext.class,0);
		}
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public Nome_da_rotinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_da_rotina; }
	}

	public final Nome_da_rotinaContext nome_da_rotina() throws RecognitionException {
		Nome_da_rotinaContext _localctx = new Nome_da_rotinaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_nome_da_rotina);
		int _la;
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARACTERES_IMPRIMIVEIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				unidade_semantica();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				parametro();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				frase();
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABRE_PARENTESES) {
					{
					setState(587);
					qualificador();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unidade_semanticaContext extends ParserRuleContext {
		public PalavraContext palavra() {
			return getRuleContext(PalavraContext.class,0);
		}
		public Unidade_semanticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unidade_semantica; }
	}

	public final Unidade_semanticaContext unidade_semantica() throws RecognitionException {
		Unidade_semanticaContext _localctx = new Unidade_semanticaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unidade_semantica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			palavra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public Artigo_indefinidoContext artigo_indefinido() {
			return getRuleContext(Artigo_indefinidoContext.class,0);
		}
		public List<NomeContext> nome() {
			return getRuleContexts(NomeContext.class);
		}
		public NomeContext nome(int i) {
			return getRuleContext(NomeContext.class,i);
		}
		public DenominacoesContext denominacoes() {
			return getRuleContext(DenominacoesContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			artigo_indefinido();
			setState(595);
			nome();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 255L) != 0)) {
				{
				setState(596);
				denominacoes();
				setState(597);
				nome();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FraseContext extends ParserRuleContext {
		public Artigo_definidoContext artigo_definido() {
			return getRuleContext(Artigo_definidoContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public FraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frase; }
	}

	public final FraseContext frase() throws RecognitionException {
		FraseContext _localctx = new FraseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_frase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			artigo_definido();
			setState(602);
			nome();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucoesContext extends ParserRuleContext {
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public InstrucoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucoes; }
	}

	public final InstrucoesContext instrucoes() throws RecognitionException {
		InstrucoesContext _localctx = new InstrucoesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_instrucoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(604);
				instrucao();
				}
				}
				setState(607); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8016407336719745020L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 43L) != 0) || ((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & 1101718372405L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoContext extends ParserRuleContext {
		public PreservacaoContext preservacao() {
			return getRuleContext(PreservacaoContext.class,0);
		}
		public IteracaoContext iteracao() {
			return getRuleContext(IteracaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public IncondicionalContext incondicional() {
			return getRuleContext(IncondicionalContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(PortuguesPuroParser.VIRGULA, 0); }
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_instrucao);
		try {
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				preservacao();
				}
				break;
			case T__167:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				iteracao();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				condicional();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__55:
			case T__56:
			case T__57:
			case T__60:
			case T__61:
			case T__63:
			case T__64:
			case T__66:
			case T__68:
			case T__169:
			case T__171:
			case T__172:
			case T__181:
			case DIGITO:
			case ASPAS_DUPLAS:
			case HIFEN:
			case CIFRAO:
			case SINAL_DE_ADICAO:
			case CARACTERES_IMPRIMIVEIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(612);
				incondicional();
				setState(613);
				match(VIRGULA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PreservacaoContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public PreservacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preservacao; }
	}

	public final PreservacaoContext preservacao() throws RecognitionException {
		PreservacaoContext _localctx = new PreservacaoContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_preservacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(T__58);
			setState(618);
			parametro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IteracaoContext extends ParserRuleContext {
		public IteracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracao; }
	}

	public final IteracaoContext iteracao() throws RecognitionException {
		IteracaoContext _localctx = new IteracaoContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_iteracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(T__167);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public Expressao_decisoraContext expressao_decisora() {
			return getRuleContext(Expressao_decisoraContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(PortuguesPuroParser.VIRGULA, 0); }
		public List<IncondicionalContext> incondicional() {
			return getRuleContexts(IncondicionalContext.class);
		}
		public IncondicionalContext incondicional(int i) {
			return getRuleContext(IncondicionalContext.class,i);
		}
		public TerminalNode PONTO() { return getToken(PortuguesPuroParser.PONTO, 0); }
		public List<TerminalNode> PONTO_E_VIRGULA() { return getTokens(PortuguesPuroParser.PONTO_E_VIRGULA); }
		public TerminalNode PONTO_E_VIRGULA(int i) {
			return getToken(PortuguesPuroParser.PONTO_E_VIRGULA, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(T__53);
			setState(623);
			expressao_decisora();
			setState(624);
			match(VIRGULA);
			setState(625);
			incondicional();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO_E_VIRGULA) {
				{
				{
				setState(626);
				match(PONTO_E_VIRGULA);
				setState(627);
				incondicional();
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(633);
			match(PONTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_decisoraContext extends ParserRuleContext {
		public List<PalavraContext> palavra() {
			return getRuleContexts(PalavraContext.class);
		}
		public PalavraContext palavra(int i) {
			return getRuleContext(PalavraContext.class,i);
		}
		public VerbosContext verbos() {
			return getRuleContext(VerbosContext.class,0);
		}
		public Expressao_decisoraContext expressao_decisora() {
			return getRuleContext(Expressao_decisoraContext.class,0);
		}
		public Expressao_decisoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_decisora; }
	}

	public final Expressao_decisoraContext expressao_decisora() throws RecognitionException {
		Expressao_decisoraContext _localctx = new Expressao_decisoraContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expressao_decisora);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(636); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(635);
					palavra();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(638); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 8388607L) != 0)) {
				{
				setState(640);
				verbos();
				}
			}

			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARACTERES_IMPRIMIVEIS) {
				{
				setState(643);
				expressao_decisora();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncondicionalContext extends ParserRuleContext {
		public InterrupcaoContext interrupcao() {
			return getRuleContext(InterrupcaoContext.class,0);
		}
		public InvocacaoContext invocacao() {
			return getRuleContext(InvocacaoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public DecodificacaoContext decodificacao() {
			return getRuleContext(DecodificacaoContext.class,0);
		}
		public ReiteracaoContext reiteracao() {
			return getRuleContext(ReiteracaoContext.class,0);
		}
		public IndirecaoContext indirecao() {
			return getRuleContext(IndirecaoContext.class,0);
		}
		public EmpilhamentoContext empilhamento() {
			return getRuleContext(EmpilhamentoContext.class,0);
		}
		public Retorno_booleanoContext retorno_booleano() {
			return getRuleContext(Retorno_booleanoContext.class,0);
		}
		public IncondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incondicional; }
	}

	public final IncondicionalContext incondicional() throws RecognitionException {
		IncondicionalContext _localctx = new IncondicionalContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_incondicional);
		try {
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				interrupcao();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__60:
			case T__61:
			case T__64:
			case T__68:
			case T__181:
			case DIGITO:
			case ASPAS_DUPLAS:
			case HIFEN:
			case CIFRAO:
			case SINAL_DE_ADICAO:
			case CARACTERES_IMPRIMIVEIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				invocacao();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 3);
				{
				setState(648);
				retorno();
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 4);
				{
				setState(649);
				decodificacao();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 5);
				{
				setState(650);
				reiteracao();
				}
				break;
			case T__169:
				enterOuterAlt(_localctx, 6);
				{
				setState(651);
				indirecao();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 7);
				{
				setState(652);
				empilhamento();
				}
				break;
			case T__171:
			case T__172:
				enterOuterAlt(_localctx, 8);
				{
				setState(653);
				retorno_booleano();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterrupcaoContext extends ParserRuleContext {
		public InterrupcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interrupcao; }
	}

	public final InterrupcaoContext interrupcao() throws RecognitionException {
		InterrupcaoContext _localctx = new InterrupcaoContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_interrupcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(T__56);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InvocacaoContext extends ParserRuleContext {
		public Invocacao_internaContext invocacao_interna() {
			return getRuleContext(Invocacao_internaContext.class,0);
		}
		public Invocacao_externaContext invocacao_externa() {
			return getRuleContext(Invocacao_externaContext.class,0);
		}
		public Invocacao_indiretaContext invocacao_indireta() {
			return getRuleContext(Invocacao_indiretaContext.class,0);
		}
		public InvocacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocacao; }
	}

	public final InvocacaoContext invocacao() throws RecognitionException {
		InvocacaoContext _localctx = new InvocacaoContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_invocacao);
		try {
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				invocacao_interna();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				invocacao_externa();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
				invocacao_indireta();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Invocacao_internaContext extends ParserRuleContext {
		public Unidade_semanticaContext unidade_semantica() {
			return getRuleContext(Unidade_semanticaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public Invocacao_internaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocacao_interna; }
	}

	public final Invocacao_internaContext invocacao_interna() throws RecognitionException {
		Invocacao_internaContext _localctx = new Invocacao_internaContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_invocacao_interna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(663);
				unidade_semantica();
				}
				break;
			case 2:
				{
				setState(664);
				expressao();
				}
				break;
			case 3:
				{
				setState(665);
				frase();
				}
				break;
			}
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABRE_PARENTESES) {
				{
				setState(668);
				qualificador();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Invocacao_externaContext extends ParserRuleContext {
		public Nome_da_DLLContext nome_da_DLL() {
			return getRuleContext(Nome_da_DLLContext.class,0);
		}
		public Nome_da_funcaoContext nome_da_funcao() {
			return getRuleContext(Nome_da_funcaoContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Invocacao_externaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocacao_externa; }
	}

	public final Invocacao_externaContext invocacao_externa() throws RecognitionException {
		Invocacao_externaContext _localctx = new Invocacao_externaContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_invocacao_externa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(T__64);
			setState(672);
			match(T__168);
			setState(673);
			nome_da_DLL();
			setState(674);
			match(T__168);
			setState(675);
			match(T__168);
			setState(676);
			nome_da_funcao();
			setState(677);
			match(T__168);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__137) {
				{
				{
				setState(678);
				match(T__137);
				setState(679);
				expressao();
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__141) {
					{
					{
					setState(681);
					match(T__141);
					setState(682);
					expressao();
					}
					}
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__65) {
					{
					setState(688);
					match(T__65);
					setState(689);
					termo();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nome_da_DLLContext extends ParserRuleContext {
		public PalavraContext palavra() {
			return getRuleContext(PalavraContext.class,0);
		}
		public Nome_da_DLLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_da_DLL; }
	}

	public final Nome_da_DLLContext nome_da_DLL() throws RecognitionException {
		Nome_da_DLLContext _localctx = new Nome_da_DLLContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_nome_da_DLL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			palavra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nome_da_funcaoContext extends ParserRuleContext {
		public PalavraContext palavra() {
			return getRuleContext(PalavraContext.class,0);
		}
		public Nome_da_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_da_funcao; }
	}

	public final Nome_da_funcaoContext nome_da_funcao() throws RecognitionException {
		Nome_da_funcaoContext _localctx = new Nome_da_funcaoContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_nome_da_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			palavra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Invocacao_indiretaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Invocacao_indiretaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocacao_indireta; }
	}

	public final Invocacao_indiretaContext invocacao_indireta() throws RecognitionException {
		Invocacao_indiretaContext _localctx = new Invocacao_indiretaContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_invocacao_indireta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(T__64);
			setState(699);
			expressao();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__137) {
				{
				setState(700);
				match(T__137);
				setState(701);
				expressao();
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__141) {
					{
					{
					setState(702);
					match(T__141);
					setState(703);
					expressao();
					}
					}
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__65) {
					{
					setState(709);
					match(T__65);
					setState(710);
					termo();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(T__57);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecodificacaoContext extends ParserRuleContext {
		public Numero_hexadecimalContext numero_hexadecimal() {
			return getRuleContext(Numero_hexadecimalContext.class,0);
		}
		public DecodificacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decodificacao; }
	}

	public final DecodificacaoContext decodificacao() throws RecognitionException {
		DecodificacaoContext _localctx = new DecodificacaoContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_decodificacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(T__63);
			setState(718);
			numero_hexadecimal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndirecaoContext extends ParserRuleContext {
		public ArtigoContext artigo() {
			return getRuleContext(ArtigoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Unidade_semanticaContext unidade_semantica() {
			return getRuleContext(Unidade_semanticaContext.class,0);
		}
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public IndirecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirecao; }
	}

	public final IndirecaoContext indirecao() throws RecognitionException {
		IndirecaoContext _localctx = new IndirecaoContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_indirecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(T__169);
			setState(721);
			artigo();
			setState(722);
			termo();
			setState(723);
			match(T__170);
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARACTERES_IMPRIMIVEIS:
				{
				setState(724);
				unidade_semantica();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				{
				setState(725);
				parametro();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				{
				setState(726);
				frase();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABRE_PARENTESES) {
				{
				setState(729);
				qualificador();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmpilhamentoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public EmpilhamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empilhamento; }
	}

	public final EmpilhamentoContext empilhamento() throws RecognitionException {
		EmpilhamentoContext _localctx = new EmpilhamentoContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_empilhamento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__66);
			setState(733);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReiteracaoContext extends ParserRuleContext {
		public ReiteracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reiteracao; }
	}

	public final ReiteracaoContext reiteracao() throws RecognitionException {
		ReiteracaoContext _localctx = new ReiteracaoContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_reiteracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(T__55);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Retorno_booleanoContext extends ParserRuleContext {
		public Retorno_booleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno_booleano; }
	}

	public final Retorno_booleanoContext retorno_booleano() throws RecognitionException {
		Retorno_booleanoContext _localctx = new Retorno_booleanoContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_retorno_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_la = _input.LA(1);
			if ( !(_la==T__171 || _la==T__172) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Operadores_comunsContext> operadores_comuns() {
			return getRuleContexts(Operadores_comunsContext.class);
		}
		public Operadores_comunsContext operadores_comuns(int i) {
			return getRuleContext(Operadores_comunsContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			termo();
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & 255L) != 0)) {
				{
				{
				setState(740);
				operadores_comuns();
				setState(741);
				termo();
				}
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operadores_comunsContext extends ParserRuleContext {
		public Operadores_comunsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadores_comuns; }
	}

	public final Operadores_comunsContext operadores_comuns() throws RecognitionException {
		Operadores_comunsContext _localctx = new Operadores_comunsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_operadores_comuns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			_la = _input.LA(1);
			if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_constanteContext extends ParserRuleContext {
		public Termo_constante_negativoContext termo_constante_negativo() {
			return getRuleContext(Termo_constante_negativoContext.class,0);
		}
		public Termo_constante_positivoContext termo_constante_positivo() {
			return getRuleContext(Termo_constante_positivoContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Termo_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_constante; }
	}

	public final Termo_constanteContext termo_constante() throws RecognitionException {
		Termo_constanteContext _localctx = new Termo_constanteContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_termo_constante);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				termo_constante_negativo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				termo_constante_positivo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(752);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_constante_negativoContext extends ParserRuleContext {
		public TerminalNode HIFEN() { return getToken(PortuguesPuroParser.HIFEN, 0); }
		public Termo_constanteContext termo_constante() {
			return getRuleContext(Termo_constanteContext.class,0);
		}
		public Termo_constante_negativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_constante_negativo; }
	}

	public final Termo_constante_negativoContext termo_constante_negativo() throws RecognitionException {
		Termo_constante_negativoContext _localctx = new Termo_constante_negativoContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_termo_constante_negativo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(HIFEN);
			setState(756);
			termo_constante();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_constante_positivoContext extends ParserRuleContext {
		public TerminalNode SINAL_DE_ADICAO() { return getToken(PortuguesPuroParser.SINAL_DE_ADICAO, 0); }
		public Termo_constanteContext termo_constante() {
			return getRuleContext(Termo_constanteContext.class,0);
		}
		public Termo_constante_positivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_constante_positivo; }
	}

	public final Termo_constante_positivoContext termo_constante_positivo() throws RecognitionException {
		Termo_constante_positivoContext _localctx = new Termo_constante_positivoContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_termo_constante_positivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(SINAL_DE_ADICAO);
			setState(759);
			termo_constante();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public Numero_decimalContext numero_decimal() {
			return getRuleContext(Numero_decimalContext.class,0);
		}
		public Numero_fracionarioContext numero_fracionario() {
			return getRuleContext(Numero_fracionarioContext.class,0);
		}
		public Numero_mistoContext numero_misto() {
			return getRuleContext(Numero_mistoContext.class,0);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_numero);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				numero_decimal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				numero_fracionario();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				numero_misto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Nome_do_tipoContext nome_do_tipo() {
			return getRuleContext(Nome_do_tipoContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Numero_hexadecimalContext numero_hexadecimal() {
			return getRuleContext(Numero_hexadecimalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_literal);
		int _la;
		try {
			setState(776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITO:
			case HIFEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				numero();
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CARACTERES_IMPRIMIVEIS) {
					{
					setState(767);
					nome_do_tipo();
					}
				}

				}
				break;
			case ASPAS_DUPLAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				string_literal();
				}
				break;
			case CIFRAO:
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				numero_hexadecimal();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
				match(T__60);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 5);
				{
				setState(773);
				match(T__61);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 6);
				{
				setState(774);
				match(T__68);
				}
				break;
			case T__181:
				enterOuterAlt(_localctx, 7);
				{
				setState(775);
				match(T__181);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public Termo_negativoContext termo_negativo() {
			return getRuleContext(Termo_negativoContext.class,0);
		}
		public Termo_positivoContext termo_positivo() {
			return getRuleContext(Termo_positivoContext.class,0);
		}
		public Variavel_localContext variavel_local() {
			return getRuleContext(Variavel_localContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Termo_literalContext termo_literal() {
			return getRuleContext(Termo_literalContext.class,0);
		}
		public Artigo_indefinidoContext artigo_indefinido() {
			return getRuleContext(Artigo_indefinidoContext.class,0);
		}
		public Nome_do_tipoContext nome_do_tipo() {
			return getRuleContext(Nome_do_tipoContext.class,0);
		}
		public TerminalNode BARRA_INCLINADA() { return getToken(PortuguesPuroParser.BARRA_INCLINADA, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_termo);
		int _la;
		try {
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				termo_negativo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				termo_positivo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				variavel_local();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(781);
				variavel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(782);
				termo_literal();
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__160) {
					{
					setState(783);
					match(T__160);
					setState(784);
					artigo_indefinido();
					setState(785);
					nome_do_tipo();
					}
				}

				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BARRA_INCLINADA) {
					{
					setState(789);
					match(BARRA_INCLINADA);
					setState(790);
					termo();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_negativoContext extends ParserRuleContext {
		public TerminalNode HIFEN() { return getToken(PortuguesPuroParser.HIFEN, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Termo_negativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_negativo; }
	}

	public final Termo_negativoContext termo_negativo() throws RecognitionException {
		Termo_negativoContext _localctx = new Termo_negativoContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_termo_negativo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(HIFEN);
			setState(796);
			termo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_positivoContext extends ParserRuleContext {
		public TerminalNode SINAL_DE_ADICAO() { return getToken(PortuguesPuroParser.SINAL_DE_ADICAO, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Termo_positivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_positivo; }
	}

	public final Termo_positivoContext termo_positivo() throws RecognitionException {
		Termo_positivoContext _localctx = new Termo_positivoContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_termo_positivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(SINAL_DE_ADICAO);
			setState(799);
			termo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variavel_localContext extends ParserRuleContext {
		public Artigo_indefinidoContext artigo_indefinido() {
			return getRuleContext(Artigo_indefinidoContext.class,0);
		}
		public List<NomeContext> nome() {
			return getRuleContexts(NomeContext.class);
		}
		public NomeContext nome(int i) {
			return getRuleContext(NomeContext.class,i);
		}
		public PossessivosContext possessivos() {
			return getRuleContext(PossessivosContext.class,0);
		}
		public DenominacoesContext denominacoes() {
			return getRuleContext(DenominacoesContext.class,0);
		}
		public Variavel_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel_local; }
	}

	public final Variavel_localContext variavel_local() throws RecognitionException {
		Variavel_localContext _localctx = new Variavel_localContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_variavel_local);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			artigo_indefinido();
			setState(802);
			nome();
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 255L) != 0)) {
				{
				setState(803);
				denominacoes();
				setState(804);
				nome();
				}
			}

			setState(808);
			possessivos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends ParserRuleContext {
		public Artigo_definidoContext artigo_definido() {
			return getRuleContext(Artigo_definidoContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public PossessivosContext possessivos() {
			return getRuleContext(PossessivosContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			artigo_definido();
			setState(811);
			nome();
			setState(812);
			possessivos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_literalContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PossessivosContext possessivos() {
			return getRuleContext(PossessivosContext.class,0);
		}
		public Termo_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_literal; }
	}

	public final Termo_literalContext termo_literal() throws RecognitionException {
		Termo_literalContext _localctx = new Termo_literalContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_termo_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			literal();
			setState(815);
			possessivos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PossessivosContext extends ParserRuleContext {
		public List<Possessivo_antigoContext> possessivo_antigo() {
			return getRuleContexts(Possessivo_antigoContext.class);
		}
		public Possessivo_antigoContext possessivo_antigo(int i) {
			return getRuleContext(Possessivo_antigoContext.class,i);
		}
		public PossessivosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possessivos; }
	}

	public final PossessivosContext possessivos() throws RecognitionException {
		PossessivosContext _localctx = new PossessivosContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_possessivos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__108) {
				{
				{
				setState(817);
				possessivo_antigo();
				}
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Possessivo_antigoContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public Possessivo_antigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possessivo_antigo; }
	}

	public final Possessivo_antigoContext possessivo_antigo() throws RecognitionException {
		Possessivo_antigoContext _localctx = new Possessivo_antigoContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_possessivo_antigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(T__108);
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARACTERES_IMPRIMIVEIS:
				{
				setState(824);
				nome();
				}
				break;
			case T__164:
			case T__165:
				{
				setState(825);
				funcao();
				}
				break;
			case T__182:
				{
				setState(826);
				match(T__182);
				}
				break;
			case T__183:
				{
				setState(827);
				match(T__183);
				}
				break;
			case T__184:
				{
				setState(828);
				match(T__184);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00d1\u0340\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001\u00be\b\u0001\u000b\u0001\f\u0001\u00bf\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00c7"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00ce\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00d5\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00ee\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00ff\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0114\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u011e\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0122\b\u0012\n\u0012\f\u0012\u0125\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u012b\b\u0013\n\u0013\f\u0013\u012e\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0136\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u0144\b\u0019\n\u0019\f\u0019\u0147"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0157\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0160\b\u001d\u0001\u001e\u0004\u001e\u0163\b\u001e\u000b\u001e"+
		"\f\u001e\u0164\u0001\u001f\u0003\u001f\u0168\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\""+
		"\u0001\"\u0001\"\u0001#\u0001#\u0005#\u0179\b#\n#\f#\u017c\t#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0003$\u0183\b$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u018d\b&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u019e\b&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u01aa\b)\u0001*\u0001*\u0001*\u0001*\u0005*\u01b0"+
		"\b*\n*\f*\u01b3\t*\u0001+\u0001+\u0001+\u0001+\u0003+\u01b9\b+\u0001+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01c3\b+\u0001"+
		",\u0001,\u0001-\u0004-\u01c8\b-\u000b-\f-\u01c9\u0001.\u0001.\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u01d6\b0\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u01ef\b0\u00011\u00011\u00011\u00011\u00031\u01f5\b1\u0001"+
		"2\u00032\u01f8\b2\u00012\u00012\u00012\u00012\u00012\u00032\u01ff\b2\u0001"+
		"2\u00012\u00012\u00012\u00032\u0205\b2\u00012\u00012\u00013\u00033\u020a"+
		"\b3\u00013\u00013\u00013\u00013\u00013\u00033\u0211\b3\u00013\u00013\u0001"+
		"3\u00013\u00033\u0217\b3\u00014\u00034\u021a\b4\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u0227\b4\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0003"+
		"4\u0233\b4\u00014\u00014\u00015\u00035\u0238\b5\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u023f\b5\u00015\u00015\u00015\u00015\u00035\u0245\b5\u0001"+
		"5\u00015\u00016\u00016\u00016\u00016\u00036\u024d\b6\u00036\u024f\b6\u0001"+
		"7\u00017\u00018\u00018\u00018\u00018\u00018\u00038\u0258\b8\u00019\u0001"+
		"9\u00019\u0001:\u0004:\u025e\b:\u000b:\f:\u025f\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u0268\b;\u0001<\u0001<\u0001<\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0005>\u0275\b>\n>\f>\u0278\t>\u0001"+
		">\u0001>\u0001?\u0004?\u027d\b?\u000b?\f?\u027e\u0001?\u0003?\u0282\b"+
		"?\u0001?\u0003?\u0285\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0003@\u028f\b@\u0001A\u0001A\u0001B\u0001B\u0001B\u0003B\u0296"+
		"\bB\u0001C\u0001C\u0001C\u0003C\u029b\bC\u0001C\u0003C\u029e\bC\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0005D\u02ac\bD\nD\fD\u02af\tD\u0001D\u0001D\u0003D\u02b3\bD"+
		"\u0003D\u02b5\bD\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0005G\u02c1\bG\nG\fG\u02c4\tG\u0001G\u0001G\u0003G\u02c8"+
		"\bG\u0003G\u02ca\bG\u0001H\u0001H\u0001I\u0001I\u0001I\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0003J\u02d8\bJ\u0001J\u0003J\u02db\bJ\u0001"+
		"K\u0001K\u0001K\u0001L\u0001L\u0001M\u0001M\u0001N\u0001N\u0001N\u0001"+
		"N\u0005N\u02e8\bN\nN\fN\u02eb\tN\u0001O\u0001O\u0001P\u0001P\u0001P\u0003"+
		"P\u02f2\bP\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001S\u0001S\u0001"+
		"S\u0003S\u02fd\bS\u0001T\u0001T\u0003T\u0301\bT\u0001T\u0001T\u0001T\u0001"+
		"T\u0001T\u0001T\u0003T\u0309\bT\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0003U\u0314\bU\u0001U\u0001U\u0003U\u0318\bU\u0003"+
		"U\u031a\bU\u0001V\u0001V\u0001V\u0001W\u0001W\u0001W\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0003X\u0327\bX\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Z\u0001Z\u0001Z\u0001[\u0005[\u0333\b[\n[\f[\u0336\t[\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u033e\b\\\u0001\\\u0000\u0000"+
		"]\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u0000\u001e\u0001\u0000\n\r\u0001\u0000\u000e\u0011"+
		"\u0001\u0000\"%\u0001\u0000&)\u0001\u0000*-\u0001\u0000HO\u0001\u0000"+
		"Pf\u0002\u0000\u00c2\u00c3\u00d1\u00d1\u0005\u0000gl\u00ba\u00bb\u00c0"+
		"\u00c1\u00c5\u00c5\u00c7\u00c7\u0004\u0000gl\u00ba\u00bb\u00be\u00be\u00c1"+
		"\u00c1\u0001\u0000\u00ba\u00ba\u0001\u0000\u00bb\u00bb\u0001\u0000gg\u0001"+
		"\u0000hh\u0001\u0000ii\u0001\u0000jj\u0001\u0000kk\u0001\u0000\u00c1\u00c1"+
		"\u0001\u0000ll\u0001\u0000\u00c0\u00c0\u0001\u0000\u00c7\u00c7\u0001\u0000"+
		"\u00c5\u00c5\u0002\u0000no\u00c8\u00cb\u0004\u0000pv\u00c0\u00c0\u00c5"+
		"\u00c5\u00c7\u00c7\u0001\u0000w\u0087\u0002\u0000\u008e\u008f\u00c9\u00ca"+
		"\u0001\u0000\u008e\u0090\u0004\u0000\u001a\u001b\u008a\u008a\u008c\u008c"+
		"\u0091\u00a1\u0001\u0000\u00ac\u00ad\u0001\u0000\u00ae\u00b5\u0387\u0000"+
		"\u00ba\u0001\u0000\u0000\u0000\u0002\u00bd\u0001\u0000\u0000\u0000\u0004"+
		"\u00c1\u0001\u0000\u0000\u0000\u0006\u00c6\u0001\u0000\u0000\u0000\b\u00cd"+
		"\u0001\u0000\u0000\u0000\n\u00d4\u0001\u0000\u0000\u0000\f\u00d6\u0001"+
		"\u0000\u0000\u0000\u000e\u00d8\u0001\u0000\u0000\u0000\u0010\u00ed\u0001"+
		"\u0000\u0000\u0000\u0012\u00ef\u0001\u0000\u0000\u0000\u0014\u00f1\u0001"+
		"\u0000\u0000\u0000\u0016\u00f3\u0001\u0000\u0000\u0000\u0018\u00fe\u0001"+
		"\u0000\u0000\u0000\u001a\u0113\u0001\u0000\u0000\u0000\u001c\u0115\u0001"+
		"\u0000\u0000\u0000\u001e\u0117\u0001\u0000\u0000\u0000 \u0119\u0001\u0000"+
		"\u0000\u0000\"\u011d\u0001\u0000\u0000\u0000$\u011f\u0001\u0000\u0000"+
		"\u0000&\u0128\u0001\u0000\u0000\u0000(\u0135\u0001\u0000\u0000\u0000*"+
		"\u0137\u0001\u0000\u0000\u0000,\u013a\u0001\u0000\u0000\u0000.\u013c\u0001"+
		"\u0000\u0000\u00000\u013e\u0001\u0000\u0000\u00002\u0141\u0001\u0000\u0000"+
		"\u00004\u0156\u0001\u0000\u0000\u00006\u0158\u0001\u0000\u0000\u00008"+
		"\u015a\u0001\u0000\u0000\u0000:\u015f\u0001\u0000\u0000\u0000<\u0162\u0001"+
		"\u0000\u0000\u0000>\u0167\u0001\u0000\u0000\u0000@\u016b\u0001\u0000\u0000"+
		"\u0000B\u016f\u0001\u0000\u0000\u0000D\u0173\u0001\u0000\u0000\u0000F"+
		"\u0176\u0001\u0000\u0000\u0000H\u0182\u0001\u0000\u0000\u0000J\u0184\u0001"+
		"\u0000\u0000\u0000L\u019d\u0001\u0000\u0000\u0000N\u019f\u0001\u0000\u0000"+
		"\u0000P\u01a1\u0001\u0000\u0000\u0000R\u01a9\u0001\u0000\u0000\u0000T"+
		"\u01ab\u0001\u0000\u0000\u0000V\u01b8\u0001\u0000\u0000\u0000X\u01c4\u0001"+
		"\u0000\u0000\u0000Z\u01c7\u0001\u0000\u0000\u0000\\\u01cb\u0001\u0000"+
		"\u0000\u0000^\u01cd\u0001\u0000\u0000\u0000`\u01ee\u0001\u0000\u0000\u0000"+
		"b\u01f4\u0001\u0000\u0000\u0000d\u0204\u0001\u0000\u0000\u0000f\u0216"+
		"\u0001\u0000\u0000\u0000h\u0232\u0001\u0000\u0000\u0000j\u0244\u0001\u0000"+
		"\u0000\u0000l\u024e\u0001\u0000\u0000\u0000n\u0250\u0001\u0000\u0000\u0000"+
		"p\u0252\u0001\u0000\u0000\u0000r\u0259\u0001\u0000\u0000\u0000t\u025d"+
		"\u0001\u0000\u0000\u0000v\u0267\u0001\u0000\u0000\u0000x\u0269\u0001\u0000"+
		"\u0000\u0000z\u026c\u0001\u0000\u0000\u0000|\u026e\u0001\u0000\u0000\u0000"+
		"~\u027c\u0001\u0000\u0000\u0000\u0080\u028e\u0001\u0000\u0000\u0000\u0082"+
		"\u0290\u0001\u0000\u0000\u0000\u0084\u0295\u0001\u0000\u0000\u0000\u0086"+
		"\u029a\u0001\u0000\u0000\u0000\u0088\u029f\u0001\u0000\u0000\u0000\u008a"+
		"\u02b6\u0001\u0000\u0000\u0000\u008c\u02b8\u0001\u0000\u0000\u0000\u008e"+
		"\u02ba\u0001\u0000\u0000\u0000\u0090\u02cb\u0001\u0000\u0000\u0000\u0092"+
		"\u02cd\u0001\u0000\u0000\u0000\u0094\u02d0\u0001\u0000\u0000\u0000\u0096"+
		"\u02dc\u0001\u0000\u0000\u0000\u0098\u02df\u0001\u0000\u0000\u0000\u009a"+
		"\u02e1\u0001\u0000\u0000\u0000\u009c\u02e3\u0001\u0000\u0000\u0000\u009e"+
		"\u02ec\u0001\u0000\u0000\u0000\u00a0\u02f1\u0001\u0000\u0000\u0000\u00a2"+
		"\u02f3\u0001\u0000\u0000\u0000\u00a4\u02f6\u0001\u0000\u0000\u0000\u00a6"+
		"\u02fc\u0001\u0000\u0000\u0000\u00a8\u0308\u0001\u0000\u0000\u0000\u00aa"+
		"\u0319\u0001\u0000\u0000\u0000\u00ac\u031b\u0001\u0000\u0000\u0000\u00ae"+
		"\u031e\u0001\u0000\u0000\u0000\u00b0\u0321\u0001\u0000\u0000\u0000\u00b2"+
		"\u032a\u0001\u0000\u0000\u0000\u00b4\u032e\u0001\u0000\u0000\u0000\u00b6"+
		"\u0334\u0001\u0000\u0000\u0000\u00b8\u0337\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005\u0001\u0000\u0000\u00bb\u0001\u0001\u0000\u0000\u0000\u00bc"+
		"\u00be\u0005\u00d0\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c0\u0003\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0003\u0002\u0001\u0000\u00c2\u00c3\u0005\u00be\u0000\u0000\u00c3"+
		"\u0005\u0001\u0000\u0000\u0000\u00c4\u00c7\u0003\b\u0004\u0000\u00c5\u00c7"+
		"\u0003\n\u0005\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u0007\u0001\u0000\u0000\u0000\u00c8\u00ce\u0005"+
		"\u0002\u0000\u0000\u00c9\u00ce\u0005\u0003\u0000\u0000\u00ca\u00ce\u0005"+
		"\u0004\u0000\u0000\u00cb\u00ce\u0005\u0005\u0000\u0000\u00cc\u00ce\u0003"+
		"\f\u0006\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\t\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d5\u0005\u0006\u0000\u0000\u00d0\u00d5\u0005\u0007\u0000"+
		"\u0000\u00d1\u00d5\u0005\b\u0000\u0000\u00d2\u00d5\u0005\t\u0000\u0000"+
		"\u00d3\u00d5\u0003\u000e\u0007\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d0\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u000b\u0001\u0000\u0000\u0000\u00d6\u00d7\u0007\u0000\u0000\u0000"+
		"\u00d7\r\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\u0001\u0000\u0000\u00d9"+
		"\u000f\u0001\u0000\u0000\u0000\u00da\u00ee\u0005\u0012\u0000\u0000\u00db"+
		"\u00ee\u0005\u0013\u0000\u0000\u00dc\u00ee\u0005\u0014\u0000\u0000\u00dd"+
		"\u00ee\u0005\u0015\u0000\u0000\u00de\u00ee\u0005\u0016\u0000\u0000\u00df"+
		"\u00ee\u0005\u0017\u0000\u0000\u00e0\u00ee\u0005\u0018\u0000\u0000\u00e1"+
		"\u00ee\u0005\u0019\u0000\u0000\u00e2\u00ee\u0005\u001a\u0000\u0000\u00e3"+
		"\u00ee\u0005\u001b\u0000\u0000\u00e4\u00ee\u0005\u001c\u0000\u0000\u00e5"+
		"\u00ee\u0005\u001d\u0000\u0000\u00e6\u00ee\u0005\u001e\u0000\u0000\u00e7"+
		"\u00ee\u0005\u001f\u0000\u0000\u00e8\u00ee\u0005 \u0000\u0000\u00e9\u00ee"+
		"\u0005!\u0000\u0000\u00ea\u00ee\u0003\u0012\t\u0000\u00eb\u00ee\u0003"+
		"\u0014\n\u0000\u00ec\u00ee\u0003\u0016\u000b\u0000\u00ed\u00da\u0001\u0000"+
		"\u0000\u0000\u00ed\u00db\u0001\u0000\u0000\u0000\u00ed\u00dc\u0001\u0000"+
		"\u0000\u0000\u00ed\u00dd\u0001\u0000\u0000\u0000\u00ed\u00de\u0001\u0000"+
		"\u0000\u0000\u00ed\u00df\u0001\u0000\u0000\u0000\u00ed\u00e0\u0001\u0000"+
		"\u0000\u0000\u00ed\u00e1\u0001\u0000\u0000\u0000\u00ed\u00e2\u0001\u0000"+
		"\u0000\u0000\u00ed\u00e3\u0001\u0000\u0000\u0000\u00ed\u00e4\u0001\u0000"+
		"\u0000\u0000\u00ed\u00e5\u0001\u0000\u0000\u0000\u00ed\u00e6\u0001\u0000"+
		"\u0000\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u0011\u0001\u0000\u0000\u0000\u00ef\u00f0\u0007\u0002"+
		"\u0000\u0000\u00f0\u0013\u0001\u0000\u0000\u0000\u00f1\u00f2\u0007\u0003"+
		"\u0000\u0000\u00f2\u0015\u0001\u0000\u0000\u0000\u00f3\u00f4\u0007\u0004"+
		"\u0000\u0000\u00f4\u0017\u0001\u0000\u0000\u0000\u00f5\u00ff\u0001\u0000"+
		"\u0000\u0000\u00f6\u00ff\u0005.\u0000\u0000\u00f7\u00ff\u0005/\u0000\u0000"+
		"\u00f8\u00ff\u00050\u0000\u0000\u00f9\u00ff\u00051\u0000\u0000\u00fa\u00ff"+
		"\u00052\u0000\u0000\u00fb\u00ff\u00053\u0000\u0000\u00fc\u00ff\u00054"+
		"\u0000\u0000\u00fd\u00ff\u00055\u0000\u0000\u00fe\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fe\u00f6\u0001\u0000\u0000\u0000\u00fe\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fe\u00f8\u0001\u0000\u0000\u0000\u00fe\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00ff\u0019\u0001\u0000\u0000\u0000\u0100\u0114\u00056\u0000\u0000"+
		"\u0101\u0114\u00057\u0000\u0000\u0102\u0114\u00058\u0000\u0000\u0103\u0114"+
		"\u00059\u0000\u0000\u0104\u0114\u0005:\u0000\u0000\u0105\u0114\u0005;"+
		"\u0000\u0000\u0106\u0114\u0005<\u0000\u0000\u0107\u0114\u0005=\u0000\u0000"+
		"\u0108\u0114\u0005>\u0000\u0000\u0109\u0114\u0005?\u0000\u0000\u010a\u0114"+
		"\u0005@\u0000\u0000\u010b\u0114\u0005A\u0000\u0000\u010c\u0114\u0005B"+
		"\u0000\u0000\u010d\u0114\u0005C\u0000\u0000\u010e\u0114\u0005D\u0000\u0000"+
		"\u010f\u0114\u0005E\u0000\u0000\u0110\u0114\u0005F\u0000\u0000\u0111\u0114"+
		"\u0005G\u0000\u0000\u0112\u0114\u0003\u001c\u000e\u0000\u0113\u0100\u0001"+
		"\u0000\u0000\u0000\u0113\u0101\u0001\u0000\u0000\u0000\u0113\u0102\u0001"+
		"\u0000\u0000\u0000\u0113\u0103\u0001\u0000\u0000\u0000\u0113\u0104\u0001"+
		"\u0000\u0000\u0000\u0113\u0105\u0001\u0000\u0000\u0000\u0113\u0106\u0001"+
		"\u0000\u0000\u0000\u0113\u0107\u0001\u0000\u0000\u0000\u0113\u0108\u0001"+
		"\u0000\u0000\u0000\u0113\u0109\u0001\u0000\u0000\u0000\u0113\u010a\u0001"+
		"\u0000\u0000\u0000\u0113\u010b\u0001\u0000\u0000\u0000\u0113\u010c\u0001"+
		"\u0000\u0000\u0000\u0113\u010d\u0001\u0000\u0000\u0000\u0113\u010e\u0001"+
		"\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0113\u0110\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001"+
		"\u0000\u0000\u0000\u0114\u001b\u0001\u0000\u0000\u0000\u0115\u0116\u0007"+
		"\u0005\u0000\u0000\u0116\u001d\u0001\u0000\u0000\u0000\u0117\u0118\u0007"+
		"\u0006\u0000\u0000\u0118\u001f\u0001\u0000\u0000\u0000\u0119\u011a\u0007"+
		"\u0007\u0000\u0000\u011a!\u0001\u0000\u0000\u0000\u011b\u011e\u0003$\u0012"+
		"\u0000\u011c\u011e\u0003&\u0013\u0000\u011d\u011b\u0001\u0000\u0000\u0000"+
		"\u011d\u011c\u0001\u0000\u0000\u0000\u011e#\u0001\u0000\u0000\u0000\u011f"+
		"\u0123\u0005\u00c6\u0000\u0000\u0120\u0122\u0005\u00d0\u0000\u0000\u0121"+
		"\u0120\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123"+
		"\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0126\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0005\u00c4\u0000\u0000\u0127%\u0001\u0000\u0000\u0000\u0128\u012c"+
		"\u0005\u00ce\u0000\u0000\u0129\u012b\u0005\u00d0\u0000\u0000\u012a\u0129"+
		"\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f"+
		"\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0005\u00cf\u0000\u0000\u0130\'\u0001\u0000\u0000\u0000\u0131\u0136\u0003"+
		"*\u0015\u0000\u0132\u0136\u0003\u0004\u0002\u0000\u0133\u0136\u00032\u0019"+
		"\u0000\u0134\u0136\u0003F#\u0000\u0135\u0131\u0001\u0000\u0000\u0000\u0135"+
		"\u0132\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0136)\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0003.\u0017\u0000\u0138\u0139\u0003,\u0016\u0000\u0139+\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0007\b\u0000\u0000\u013b-\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0007\t\u0000\u0000\u013d/\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0005m\u0000\u0000\u013f\u0140\u00034\u001a\u0000\u01401"+
		"\u0001\u0000\u0000\u0000\u0141\u0145\u0005\u00cc\u0000\u0000\u0142\u0144"+
		"\u0005\u00d0\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0147"+
		"\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0145"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0005\u00cd\u0000\u0000\u01493\u0001"+
		"\u0000\u0000\u0000\u014a\u0157\b\n\u0000\u0000\u014b\u0157\b\u000b\u0000"+
		"\u0000\u014c\u0157\b\f\u0000\u0000\u014d\u0157\b\r\u0000\u0000\u014e\u0157"+
		"\b\u000e\u0000\u0000\u014f\u0157\b\u000f\u0000\u0000\u0150\u0157\b\u0010"+
		"\u0000\u0000\u0151\u0157\b\u0011\u0000\u0000\u0152\u0157\b\u0012\u0000"+
		"\u0000\u0153\u0157\b\u0013\u0000\u0000\u0154\u0157\b\u0014\u0000\u0000"+
		"\u0155\u0157\b\u0015\u0000\u0000\u0156\u014a\u0001\u0000\u0000\u0000\u0156"+
		"\u014b\u0001\u0000\u0000\u0000\u0156\u014c\u0001\u0000\u0000\u0000\u0156"+
		"\u014d\u0001\u0000\u0000\u0000\u0156\u014e\u0001\u0000\u0000\u0000\u0156"+
		"\u014f\u0001\u0000\u0000\u0000\u0156\u0150\u0001\u0000\u0000\u0000\u0156"+
		"\u0151\u0001\u0000\u0000\u0000\u0156\u0152\u0001\u0000\u0000\u0000\u0156"+
		"\u0153\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156"+
		"\u0155\u0001\u0000\u0000\u0000\u01575\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0007\u0016\u0000\u0000\u01597\u0001\u0000\u0000\u0000\u015a\u015b\u0007"+
		"\u0017\u0000\u0000\u015b9\u0001\u0000\u0000\u0000\u015c\u0160\u0003 \u0010"+
		"\u0000\u015d\u0160\u0003\"\u0011\u0000\u015e\u0160\u00032\u0019\u0000"+
		"\u015f\u015c\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u015f\u015e\u0001\u0000\u0000\u0000\u0160;\u0001\u0000\u0000\u0000\u0161"+
		"\u0163\u0005\u00bb\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165=\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\u0005\u00c0\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0003<\u001e\u0000\u016a?\u0001\u0000\u0000\u0000\u016b\u016c\u0003>"+
		"\u001f\u0000\u016c\u016d\u0005\u00c5\u0000\u0000\u016d\u016e\u0003<\u001e"+
		"\u0000\u016eA\u0001\u0000\u0000\u0000\u016f\u0170\u0003>\u001f\u0000\u0170"+
		"\u0171\u0005\u00c7\u0000\u0000\u0171\u0172\u0003@ \u0000\u0172C\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0005\u00c1\u0000\u0000\u0174\u0175\u0003"+
		"<\u001e\u0000\u0175E\u0001\u0000\u0000\u0000\u0176\u017a\u0005\u00bf\u0000"+
		"\u0000\u0177\u0179\u0005\u00d0\u0000\u0000\u0178\u0177\u0001\u0000\u0000"+
		"\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017d\u0001\u0000\u0000"+
		"\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u017e\u0005\u00bf\u0000"+
		"\u0000\u017eG\u0001\u0000\u0000\u0000\u017f\u0183\u0003L&\u0000\u0180"+
		"\u0183\u0003`0\u0000\u0181\u0183\u0003b1\u0000\u0182\u017f\u0001\u0000"+
		"\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0181\u0001\u0000"+
		"\u0000\u0000\u0183I\u0001\u0000\u0000\u0000\u0184\u0185\u0007\u0018\u0000"+
		"\u0000\u0185K\u0001\u0000\u0000\u0000\u0186\u0187\u0003\n\u0005\u0000"+
		"\u0187\u0188\u0003N\'\u0000\u0188\u0189\u0005P\u0000\u0000\u0189\u018a"+
		"\u0003\n\u0005\u0000\u018a\u018c\u0003P(\u0000\u018b\u018d\u0003R)\u0000"+
		"\u018c\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u00c8\u0000\u0000"+
		"\u018f\u019e\u0001\u0000\u0000\u0000\u0190\u0191\u0003\n\u0005\u0000\u0191"+
		"\u0192\u0003N\'\u0000\u0192\u0193\u0005\u0088\u0000\u0000\u0193\u0194"+
		"\u0003T*\u0000\u0194\u0195\u0005\u00c8\u0000\u0000\u0195\u019e\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0003\n\u0005\u0000\u0197\u0198\u0003N\'\u0000"+
		"\u0198\u0199\u0005P\u0000\u0000\u0199\u019a\u0003<\u001e\u0000\u019a\u019b"+
		"\u0003P(\u0000\u019b\u019c\u0005\u00c8\u0000\u0000\u019c\u019e\u0001\u0000"+
		"\u0000\u0000\u019d\u0186\u0001\u0000\u0000\u0000\u019d\u0190\u0001\u0000"+
		"\u0000\u0000\u019d\u0196\u0001\u0000\u0000\u0000\u019eM\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0003\u0002\u0001\u0000\u01a0O\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0003N\'\u0000\u01a2Q\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0005\u0089\u0000\u0000\u01a4\u01a5\u0003\n\u0005\u0000\u01a5\u01a6\u0003"+
		"P(\u0000\u01a6\u01aa\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\u008a\u0000"+
		"\u0000\u01a8\u01aa\u0003T*\u0000\u01a9\u01a3\u0001\u0000\u0000\u0000\u01a9"+
		"\u01a7\u0001\u0000\u0000\u0000\u01aaS\u0001\u0000\u0000\u0000\u01ab\u01b1"+
		"\u0003V+\u0000\u01ac\u01ad\u0003Z-\u0000\u01ad\u01ae\u0003V+\u0000\u01ae"+
		"\u01b0\u0001\u0000\u0000\u0000\u01af\u01ac\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b2U\u0001\u0000\u0000\u0000\u01b3\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b9\u0003\n\u0005\u0000\u01b5\u01b6\u0003"+
		"<\u001e\u0000\u01b6\u01b7\u0005\u008b\u0000\u0000\u01b7\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b4\u0001\u0000\u0000\u0000\u01b8\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b9\u01c2\u0001\u0000\u0000\u0000\u01ba\u01bb\u0003\u001c"+
		"\u000e\u0000\u01bb\u01bc\u0003N\'\u0000\u01bc\u01c3\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0005\u008c\u0000\u0000\u01be\u01bf\u0003\b\u0004\u0000"+
		"\u01bf\u01c0\u0003N\'\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c3\u0005\u008d\u0000\u0000\u01c2\u01ba\u0001\u0000\u0000\u0000\u01c2"+
		"\u01bd\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c3W\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0007\u0019\u0000\u0000\u01c5Y\u0001\u0000\u0000\u0000\u01c6\u01c8\u0003"+
		"X,\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000"+
		"\u0000\u01ca[\u0001\u0000\u0000\u0000\u01cb\u01cc\u0007\u001a\u0000\u0000"+
		"\u01cc]\u0001\u0000\u0000\u0000\u01cd\u01ce\u0007\u001b\u0000\u0000\u01ce"+
		"_\u0001\u0000\u0000\u0000\u01cf\u01d0\u0003\b\u0004\u0000\u01d0\u01d1"+
		"\u0003N\'\u0000\u01d1\u01d2\u0005P\u0000\u0000\u01d2\u01d3\u0003\n\u0005"+
		"\u0000\u01d3\u01d5\u0003P(\u0000\u01d4\u01d6\u0003R)\u0000\u01d5\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005\u00c8\u0000\u0000\u01d8\u01ef"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0003\b\u0004\u0000\u01da\u01db\u0003"+
		"N\'\u0000\u01db\u01dc\u0005\u0088\u0000\u0000\u01dc\u01dd\u0003T*\u0000"+
		"\u01dd\u01de\u0005\u00c8\u0000\u0000\u01de\u01ef\u0001\u0000\u0000\u0000"+
		"\u01df\u01e0\u0003\b\u0004\u0000\u01e0\u01e1\u0003N\'\u0000\u01e1\u01e2"+
		"\u0005P\u0000\u0000\u01e2\u01e3\u0003\n\u0005\u0000\u01e3\u01e4\u0003"+
		"P(\u0000\u01e4\u01e5\u0005.\u0000\u0000\u01e5\u01e6\u0003\u00a0P\u0000"+
		"\u01e6\u01e7\u0005\u00c8\u0000\u0000\u01e7\u01e8\u0003\b\u0004\u0000\u01e8"+
		"\u01e9\u0003N\'\u0000\u01e9\u01ea\u0005P\u0000\u0000\u01ea\u01eb\u0003"+
		"\u00a0P\u0000\u01eb\u01ec\u0005\u00c8\u0000\u0000\u01ec\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000\u0000\u01ee\u01cf\u0001\u0000"+
		"\u0000\u0000\u01ee\u01d9\u0001\u0000\u0000\u0000\u01ee\u01df\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01efa\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f5\u0003d2\u0000\u01f1\u01f5\u0003f3\u0000\u01f2\u01f5"+
		"\u0003h4\u0000\u01f3\u01f5\u0003j5\u0000\u01f4\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5c\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f8\u0005\u00a2\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fa\u0005\u00a3\u0000\u0000\u01fa\u01fb\u0003l6\u0000\u01fb\u01fc"+
		"\u0005\u00ca\u0000\u0000\u01fc\u0205\u0001\u0000\u0000\u0000\u01fd\u01ff"+
		"\u0005\u00a2\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01fe\u01ff"+
		"\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201"+
		"\u0005\u00a3\u0000\u0000\u0201\u0202\u0003l6\u0000\u0202\u0203\u0005\u00cb"+
		"\u0000\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u01f7\u0001\u0000"+
		"\u0000\u0000\u0204\u01fe\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u0003t:\u0000\u0207e\u0001\u0000\u0000\u0000"+
		"\u0208\u020a\u0005\u00a2\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000"+
		"\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0005\u00a4\u0000\u0000\u020c\u020d\u0003l6\u0000\u020d\u020e"+
		"\u0005\u00ca\u0000\u0000\u020e\u0217\u0001\u0000\u0000\u0000\u020f\u0211"+
		"\u0005\u00a2\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0005\u00a4\u0000\u0000\u0213\u0214\u0003l6\u0000\u0214\u0215\u0005\u00cb"+
		"\u0000\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u0209\u0001\u0000"+
		"\u0000\u0000\u0216\u0210\u0001\u0000\u0000\u0000\u0217g\u0001\u0000\u0000"+
		"\u0000\u0218\u021a\u0005\u00a5\u0000\u0000\u0219\u0218\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000"+
		"\u0000\u021b\u021c\u0005\u00a6\u0000\u0000\u021c\u021d\u0003\b\u0004\u0000"+
		"\u021d\u021e\u0003P(\u0000\u021e\u021f\u0003\u0012\t\u0000\u021f\u0220"+
		"\u0003N\'\u0000\u0220\u0221\u0005\u0089\u0000\u0000\u0221\u0222\u0003"+
		"\n\u0005\u0000\u0222\u0223\u0003P(\u0000\u0223\u0224\u0005\u00ca\u0000"+
		"\u0000\u0224\u0233\u0001\u0000\u0000\u0000\u0225\u0227\u0005\u00a5\u0000"+
		"\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000"+
		"\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0005\u00a6\u0000"+
		"\u0000\u0229\u022a\u0003\b\u0004\u0000\u022a\u022b\u0003P(\u0000\u022b"+
		"\u022c\u0003\u0012\t\u0000\u022c\u022d\u0003N\'\u0000\u022d\u022e\u0005"+
		"\u0089\u0000\u0000\u022e\u022f\u0003\n\u0005\u0000\u022f\u0230\u0003P"+
		"(\u0000\u0230\u0231\u0005\u00cb\u0000\u0000\u0231\u0233\u0001\u0000\u0000"+
		"\u0000\u0232\u0219\u0001\u0000\u0000\u0000\u0232\u0226\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0235\u0003t:\u0000\u0235"+
		"i\u0001\u0000\u0000\u0000\u0236\u0238\u0005\u00a2\u0000\u0000\u0237\u0236"+
		"\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0001\u0000\u0000\u0000\u0239\u023a\u0005\u00a7\u0000\u0000\u023a\u023b"+
		"\u0003l6\u0000\u023b\u023c\u0005\u00ca\u0000\u0000\u023c\u0245\u0001\u0000"+
		"\u0000\u0000\u023d\u023f\u0005\u00a2\u0000\u0000\u023e\u023d\u0001\u0000"+
		"\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000"+
		"\u0000\u0000\u0240\u0241\u0005\u00a7\u0000\u0000\u0241\u0242\u0003l6\u0000"+
		"\u0242\u0243\u0005\u00cb\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000"+
		"\u0244\u0237\u0001\u0000\u0000\u0000\u0244\u023e\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0003t:\u0000\u0247k"+
		"\u0001\u0000\u0000\u0000\u0248\u024f\u0003n7\u0000\u0249\u024f\u0003p"+
		"8\u0000\u024a\u024c\u0003r9\u0000\u024b\u024d\u00032\u0019\u0000\u024c"+
		"\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d"+
		"\u024f\u0001\u0000\u0000\u0000\u024e\u0248\u0001\u0000\u0000\u0000\u024e"+
		"\u0249\u0001\u0000\u0000\u0000\u024e\u024a\u0001\u0000\u0000\u0000\u024f"+
		"m\u0001\u0000\u0000\u0000\u0250\u0251\u0003\u0002\u0001\u0000\u0251o\u0001"+
		"\u0000\u0000\u0000\u0252\u0253\u0003\n\u0005\u0000\u0253\u0257\u0003N"+
		"\'\u0000\u0254\u0255\u0003\u001c\u000e\u0000\u0255\u0256\u0003N\'\u0000"+
		"\u0256\u0258\u0001\u0000\u0000\u0000\u0257\u0254\u0001\u0000\u0000\u0000"+
		"\u0257\u0258\u0001\u0000\u0000\u0000\u0258q\u0001\u0000\u0000\u0000\u0259"+
		"\u025a\u0003\b\u0004\u0000\u025a\u025b\u0003N\'\u0000\u025bs\u0001\u0000"+
		"\u0000\u0000\u025c\u025e\u0003v;\u0000\u025d\u025c\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0001\u0000\u0000\u0000\u0260u\u0001\u0000\u0000\u0000\u0261"+
		"\u0268\u0003x<\u0000\u0262\u0268\u0003z=\u0000\u0263\u0268\u0003|>\u0000"+
		"\u0264\u0265\u0003\u0080@\u0000\u0265\u0266\u0005\u00c9\u0000\u0000\u0266"+
		"\u0268\u0001\u0000\u0000\u0000\u0267\u0261\u0001\u0000\u0000\u0000\u0267"+
		"\u0262\u0001\u0000\u0000\u0000\u0267\u0263\u0001\u0000\u0000\u0000\u0267"+
		"\u0264\u0001\u0000\u0000\u0000\u0268w\u0001\u0000\u0000\u0000\u0269\u026a"+
		"\u0005;\u0000\u0000\u026a\u026b\u0003p8\u0000\u026by\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0005\u00a8\u0000\u0000\u026d{\u0001\u0000\u0000\u0000"+
		"\u026e\u026f\u00056\u0000\u0000\u026f\u0270\u0003~?\u0000\u0270\u0271"+
		"\u0005\u00c9\u0000\u0000\u0271\u0276\u0003\u0080@\u0000\u0272\u0273\u0005"+
		"\u00ca\u0000\u0000\u0273\u0275\u0003\u0080@\u0000\u0274\u0272\u0001\u0000"+
		"\u0000\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0279\u0001\u0000"+
		"\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027a\u0005\u00c8"+
		"\u0000\u0000\u027a}\u0001\u0000\u0000\u0000\u027b\u027d\u0003\u0002\u0001"+
		"\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000"+
		"\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000"+
		"\u0000\u027f\u0281\u0001\u0000\u0000\u0000\u0280\u0282\u0003\u001e\u000f"+
		"\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000"+
		"\u0000\u0282\u0284\u0001\u0000\u0000\u0000\u0283\u0285\u0003~?\u0000\u0284"+
		"\u0283\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285"+
		"\u007f\u0001\u0000\u0000\u0000\u0286\u028f\u0003\u0082A\u0000\u0287\u028f"+
		"\u0003\u0084B\u0000\u0288\u028f\u0003\u0090H\u0000\u0289\u028f\u0003\u0092"+
		"I\u0000\u028a\u028f\u0003\u0098L\u0000\u028b\u028f\u0003\u0094J\u0000"+
		"\u028c\u028f\u0003\u0096K\u0000\u028d\u028f\u0003\u009aM\u0000\u028e\u0286"+
		"\u0001\u0000\u0000\u0000\u028e\u0287\u0001\u0000\u0000\u0000\u028e\u0288"+
		"\u0001\u0000\u0000\u0000\u028e\u0289\u0001\u0000\u0000\u0000\u028e\u028a"+
		"\u0001\u0000\u0000\u0000\u028e\u028b\u0001\u0000\u0000\u0000\u028e\u028c"+
		"\u0001\u0000\u0000\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028f\u0081"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u00059\u0000\u0000\u0291\u0083\u0001"+
		"\u0000\u0000\u0000\u0292\u0296\u0003\u0086C\u0000\u0293\u0296\u0003\u0088"+
		"D\u0000\u0294\u0296\u0003\u008eG\u0000\u0295\u0292\u0001\u0000\u0000\u0000"+
		"\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0294\u0001\u0000\u0000\u0000"+
		"\u0296\u0085\u0001\u0000\u0000\u0000\u0297\u029b\u0003n7\u0000\u0298\u029b"+
		"\u0003\u009cN\u0000\u0299\u029b\u0003r9\u0000\u029a\u0297\u0001\u0000"+
		"\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000\u029a\u0299\u0001\u0000"+
		"\u0000\u0000\u029b\u029d\u0001\u0000\u0000\u0000\u029c\u029e\u00032\u0019"+
		"\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000"+
		"\u0000\u029e\u0087\u0001\u0000\u0000\u0000\u029f\u02a0\u0005A\u0000\u0000"+
		"\u02a0\u02a1\u0005\u00a9\u0000\u0000\u02a1\u02a2\u0003\u008aE\u0000\u02a2"+
		"\u02a3\u0005\u00a9\u0000\u0000\u02a3\u02a4\u0005\u00a9\u0000\u0000\u02a4"+
		"\u02a5\u0003\u008cF\u0000\u02a5\u02b4\u0005\u00a9\u0000\u0000\u02a6\u02a7"+
		"\u0005\u008a\u0000\u0000\u02a7\u02a8\u0003\u009cN\u0000\u02a8\u02ad\u0001"+
		"\u0000\u0000\u0000\u02a9\u02aa\u0005\u008e\u0000\u0000\u02aa\u02ac\u0003"+
		"\u009cN\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02af\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b2\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u0005B\u0000\u0000\u02b1\u02b3\u0003\u00aaU\u0000"+
		"\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b5\u0001\u0000\u0000\u0000\u02b4\u02a6\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u0089\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b7\u0003\u0002\u0001\u0000\u02b7\u008b\u0001\u0000\u0000\u0000"+
		"\u02b8\u02b9\u0003\u0002\u0001\u0000\u02b9\u008d\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bb\u0005A\u0000\u0000\u02bb\u02c9\u0003\u009cN\u0000\u02bc\u02bd"+
		"\u0005\u008a\u0000\u0000\u02bd\u02c2\u0003\u009cN\u0000\u02be\u02bf\u0005"+
		"\u008e\u0000\u0000\u02bf\u02c1\u0003\u009cN\u0000\u02c0\u02be\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c7\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005B\u0000"+
		"\u0000\u02c6\u02c8\u0003\u00aaU\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02ca\u0001\u0000\u0000\u0000"+
		"\u02c9\u02bc\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000"+
		"\u02ca\u008f\u0001\u0000\u0000\u0000\u02cb\u02cc\u0005:\u0000\u0000\u02cc"+
		"\u0091\u0001\u0000\u0000\u0000\u02cd\u02ce\u0005@\u0000\u0000\u02ce\u02cf"+
		"\u0003D\"\u0000\u02cf\u0093\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005"+
		"\u00aa\u0000\u0000\u02d1\u02d2\u0003\u0006\u0003\u0000\u02d2\u02d3\u0003"+
		"\u00aaU\u0000\u02d3\u02d7\u0005\u00ab\u0000\u0000\u02d4\u02d8\u0003n7"+
		"\u0000\u02d5\u02d8\u0003p8\u0000\u02d6\u02d8\u0003r9\u0000\u02d7\u02d4"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d7\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d8\u02da\u0001\u0000\u0000\u0000\u02d9\u02db"+
		"\u00032\u0019\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02da\u02db\u0001"+
		"\u0000\u0000\u0000\u02db\u0095\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005"+
		"C\u0000\u0000\u02dd\u02de\u0003\u009cN\u0000\u02de\u0097\u0001\u0000\u0000"+
		"\u0000\u02df\u02e0\u00058\u0000\u0000\u02e0\u0099\u0001\u0000\u0000\u0000"+
		"\u02e1\u02e2\u0007\u001c\u0000\u0000\u02e2\u009b\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e9\u0003\u00aaU\u0000\u02e4\u02e5\u0003\u009eO\u0000\u02e5\u02e6"+
		"\u0003\u00aaU\u0000\u02e6\u02e8\u0001\u0000\u0000\u0000\u02e7\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e8\u02eb\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u009d\u0001"+
		"\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02ec\u02ed\u0007"+
		"\u001d\u0000\u0000\u02ed\u009f\u0001\u0000\u0000\u0000\u02ee\u02f2\u0003"+
		"\u00a2Q\u0000\u02ef\u02f2\u0003\u00a4R\u0000\u02f0\u02f2\u0003\u00a8T"+
		"\u0000\u02f1\u02ee\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f2\u00a1\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f4\u0005\u00c0\u0000\u0000\u02f4\u02f5\u0003\u00a0P\u0000"+
		"\u02f5\u00a3\u0001\u0000\u0000\u0000\u02f6\u02f7\u0005\u00c7\u0000\u0000"+
		"\u02f7\u02f8\u0003\u00a0P\u0000\u02f8\u00a5\u0001\u0000\u0000\u0000\u02f9"+
		"\u02fd\u0003>\u001f\u0000\u02fa\u02fd\u0003@ \u0000\u02fb\u02fd\u0003"+
		"B!\u0000\u02fc\u02f9\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fb\u0001\u0000\u0000\u0000\u02fd\u00a7\u0001\u0000\u0000"+
		"\u0000\u02fe\u0300\u0003\u00a6S\u0000\u02ff\u0301\u0003P(\u0000\u0300"+
		"\u02ff\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301"+
		"\u0309\u0001\u0000\u0000\u0000\u0302\u0309\u0003F#\u0000\u0303\u0309\u0003"+
		"D\"\u0000\u0304\u0309\u0005=\u0000\u0000\u0305\u0309\u0005>\u0000\u0000"+
		"\u0306\u0309\u0005E\u0000\u0000\u0307\u0309\u0005\u00b6\u0000\u0000\u0308"+
		"\u02fe\u0001\u0000\u0000\u0000\u0308\u0302\u0001\u0000\u0000\u0000\u0308"+
		"\u0303\u0001\u0000\u0000\u0000\u0308\u0304\u0001\u0000\u0000\u0000\u0308"+
		"\u0305\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000\u0000\u0000\u0308"+
		"\u0307\u0001\u0000\u0000\u0000\u0309\u00a9\u0001\u0000\u0000\u0000\u030a"+
		"\u031a\u0003\u00acV\u0000\u030b\u031a\u0003\u00aeW\u0000\u030c\u031a\u0003"+
		"\u00b0X\u0000\u030d\u031a\u0003\u00b2Y\u0000\u030e\u0313\u0003\u00b4Z"+
		"\u0000\u030f\u0310\u0005\u00a1\u0000\u0000\u0310\u0311\u0003\n\u0005\u0000"+
		"\u0311\u0312\u0003P(\u0000\u0312\u0314\u0001\u0000\u0000\u0000\u0313\u030f"+
		"\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0317"+
		"\u0001\u0000\u0000\u0000\u0315\u0316\u0005\u00c5\u0000\u0000\u0316\u0318"+
		"\u0003\u00aaU\u0000\u0317\u0315\u0001\u0000\u0000\u0000\u0317\u0318\u0001"+
		"\u0000\u0000\u0000\u0318\u031a\u0001\u0000\u0000\u0000\u0319\u030a\u0001"+
		"\u0000\u0000\u0000\u0319\u030b\u0001\u0000\u0000\u0000\u0319\u030c\u0001"+
		"\u0000\u0000\u0000\u0319\u030d\u0001\u0000\u0000\u0000\u0319\u030e\u0001"+
		"\u0000\u0000\u0000\u031a\u00ab\u0001\u0000\u0000\u0000\u031b\u031c\u0005"+
		"\u00c0\u0000\u0000\u031c\u031d\u0003\u00aaU\u0000\u031d\u00ad\u0001\u0000"+
		"\u0000\u0000\u031e\u031f\u0005\u00c7\u0000\u0000\u031f\u0320\u0003\u00aa"+
		"U\u0000\u0320\u00af\u0001\u0000\u0000\u0000\u0321\u0322\u0003\n\u0005"+
		"\u0000\u0322\u0326\u0003N\'\u0000\u0323\u0324\u0003\u001c\u000e\u0000"+
		"\u0324\u0325\u0003N\'\u0000\u0325\u0327\u0001\u0000\u0000\u0000\u0326"+
		"\u0323\u0001\u0000\u0000\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327"+
		"\u0328\u0001\u0000\u0000\u0000\u0328\u0329\u0003\u00b6[\u0000\u0329\u00b1"+
		"\u0001\u0000\u0000\u0000\u032a\u032b\u0003\b\u0004\u0000\u032b\u032c\u0003"+
		"N\'\u0000\u032c\u032d\u0003\u00b6[\u0000\u032d\u00b3\u0001\u0000\u0000"+
		"\u0000\u032e\u032f\u0003\u00a8T\u0000\u032f\u0330\u0003\u00b6[\u0000\u0330"+
		"\u00b5\u0001\u0000\u0000\u0000\u0331\u0333\u0003\u00b8\\\u0000\u0332\u0331"+
		"\u0001\u0000\u0000\u0000\u0333\u0336\u0001\u0000\u0000\u0000\u0334\u0332"+
		"\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u00b7"+
		"\u0001\u0000\u0000\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0337\u033d"+
		"\u0005m\u0000\u0000\u0338\u033e\u0003N\'\u0000\u0339\u033e\u0003h4\u0000"+
		"\u033a\u033e\u0005\u00b7\u0000\u0000\u033b\u033e\u0005\u00b8\u0000\u0000"+
		"\u033c\u033e\u0005\u00b9\u0000\u0000\u033d\u0338\u0001\u0000\u0000\u0000"+
		"\u033d\u0339\u0001\u0000\u0000\u0000\u033d\u033a\u0001\u0000\u0000\u0000"+
		"\u033d\u033b\u0001\u0000\u0000\u0000\u033d\u033c\u0001\u0000\u0000\u0000"+
		"\u033e\u00b9\u0001\u0000\u0000\u0000H\u00bf\u00c6\u00cd\u00d4\u00ed\u00fe"+
		"\u0113\u011d\u0123\u012c\u0135\u0145\u0156\u015f\u0164\u0167\u017a\u0182"+
		"\u018c\u019d\u01a9\u01b1\u01b8\u01c2\u01c9\u01d5\u01ee\u01f4\u01f7\u01fe"+
		"\u0204\u0209\u0210\u0216\u0219\u0226\u0232\u0237\u023e\u0244\u024c\u024e"+
		"\u0257\u025f\u0267\u0276\u027e\u0281\u0284\u028e\u0295\u029a\u029d\u02ad"+
		"\u02b2\u02b4\u02c2\u02c7\u02c9\u02d7\u02da\u02e9\u02f1\u02fc\u0300\u0308"+
		"\u0313\u0317\u0319\u0326\u0334\u033d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
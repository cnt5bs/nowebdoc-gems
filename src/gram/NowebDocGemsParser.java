// Generated from NowebDocGems.g4 by ANTLR 4.5.3
package gram;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NowebDocGemsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TEXTO=7, DIGITO=8, LETRA=9, 
		WS=10, ErroIsolado=11;
	public static final int
		RULE_cmds = 0, RULE_cmd = 1, RULE_configuracao = 2, RULE_trecho = 3, RULE_documento = 4, 
		RULE_ajuda = 5, RULE_versao = 6, RULE_erro = 7;
	public static final String[] ruleNames = {
		"cmds", "cmd", "configuracao", "trecho", "documento", "ajuda", "versao", 
		"erro"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'--config'", "'-R'", "'-h'", "'--help'", "'-v'", "'--version'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "TEXTO", "DIGITO", "LETRA", 
		"WS", "ErroIsolado"
	};
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
	public String getGrammarFileName() { return "NowebDocGems.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NowebDocGemsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CmdsContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).enterCmds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).exitCmds(this);
		}
	}

	public final CmdsContext cmds() throws RecognitionException {
		CmdsContext _localctx = new CmdsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				cmd();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << TEXTO) | (1L << ErroIsolado))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public ConfiguracaoContext configuracao() {
			return getRuleContext(ConfiguracaoContext.class,0);
		}
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public DocumentoContext documento() {
			return getRuleContext(DocumentoContext.class,0);
		}
		public VersaoContext versao() {
			return getRuleContext(VersaoContext.class,0);
		}
		public AjudaContext ajuda() {
			return getRuleContext(AjudaContext.class,0);
		}
		public ErroContext erro() {
			return getRuleContext(ErroContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmd);
		try {
			setState(27);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				configuracao();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				trecho();
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				documento();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				versao();
				}
				break;
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(25);
				ajuda();
				}
				break;
			case ErroIsolado:
				enterOuterAlt(_localctx, 6);
				{
				setState(26);
				erro();
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

	public static class ConfiguracaoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(NowebDocGemsParser.TEXTO, 0); }
		public ConfiguracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).enterConfiguracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).exitConfiguracao(this);
		}
	}

	public final ConfiguracaoContext configuracao() throws RecognitionException {
		ConfiguracaoContext _localctx = new ConfiguracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_configuracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			match(TEXTO);
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

	public static class TrechoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(NowebDocGemsParser.TEXTO, 0); }
		public TrechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).enterTrecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).exitTrecho(this);
		}
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_trecho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__1);
			setState(33);
			match(TEXTO);
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

	public static class DocumentoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(NowebDocGemsParser.TEXTO, 0); }
		public DocumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).enterDocumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).exitDocumento(this);
		}
	}

	public final DocumentoContext documento() throws RecognitionException {
		DocumentoContext _localctx = new DocumentoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_documento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(TEXTO);
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

	public static class AjudaContext extends ParserRuleContext {
		public AjudaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ajuda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).enterAjuda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).exitAjuda(this);
		}
	}

	public final AjudaContext ajuda() throws RecognitionException {
		AjudaContext _localctx = new AjudaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ajuda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class VersaoContext extends ParserRuleContext {
		public VersaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).enterVersao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).exitVersao(this);
		}
	}

	public final VersaoContext versao() throws RecognitionException {
		VersaoContext _localctx = new VersaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_versao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ErroContext extends ParserRuleContext {
		public List<TerminalNode> ErroIsolado() { return getTokens(NowebDocGemsParser.ErroIsolado); }
		public TerminalNode ErroIsolado(int i) {
			return getToken(NowebDocGemsParser.ErroIsolado, i);
		}
		public ErroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_erro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).enterErro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsListener ) ((NowebDocGemsListener)listener).exitErro(this);
		}
	}

	public final ErroContext erro() throws RecognitionException {
		ErroContext _localctx = new ErroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_erro);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(41);
					match(ErroIsolado);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(44); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r"+
		"\2\16\2\25\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t-\n\t\r\t\16\t.\3\t\2\2\n\2\4\6\b\n\f"+
		"\16\20\2\4\3\2\5\6\3\2\7\b/\2\23\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b\""+
		"\3\2\2\2\n%\3\2\2\2\f\'\3\2\2\2\16)\3\2\2\2\20,\3\2\2\2\22\24\5\4\3\2"+
		"\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2"+
		"\27\36\5\6\4\2\30\36\5\b\5\2\31\36\5\n\6\2\32\36\5\16\b\2\33\36\5\f\7"+
		"\2\34\36\5\20\t\2\35\27\3\2\2\2\35\30\3\2\2\2\35\31\3\2\2\2\35\32\3\2"+
		"\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37 \7\3\2\2 !\7\t\2\2!\7"+
		"\3\2\2\2\"#\7\4\2\2#$\7\t\2\2$\t\3\2\2\2%&\7\t\2\2&\13\3\2\2\2\'(\t\2"+
		"\2\2(\r\3\2\2\2)*\t\3\2\2*\17\3\2\2\2+-\7\r\2\2,+\3\2\2\2-.\3\2\2\2.,"+
		"\3\2\2\2./\3\2\2\2/\21\3\2\2\2\5\25\35.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
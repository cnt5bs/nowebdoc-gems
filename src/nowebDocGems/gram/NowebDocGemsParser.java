// Generated from NowebDocGemsParser.g4 by ANTLR 4.5.3
package nowebDocGems.gram;
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
		CMT=1, OPENFRAG=2, TEXT=3, TEXTWS=4, CLOSEFRAG=5, OPENCODE=6, MINOR=7, 
		TIL=8, SNIPPETTEXT=9, CLOSEKEY=10, CLOSECODE=11, MACROTEXT=12, MACROWS=13;
	public static final int
		RULE_specification = 0, RULE_text = 1, RULE_frag = 2, RULE_snippet = 3, 
		RULE_codeName = 4, RULE_keyName = 5, RULE_lines = 6, RULE_instruction = 7, 
		RULE_block = 8, RULE_instructionText = 9, RULE_minor = 10, RULE_til = 11;
	public static final String[] ruleNames = {
		"specification", "text", "frag", "snippet", "codeName", "keyName", "lines", 
		"instruction", "block", "instructionText", "minor", "til"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'<<'", "'<'", "'~'", null, "'>>='", 
		"'>>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CMT", "OPENFRAG", "TEXT", "TEXTWS", "CLOSEFRAG", "OPENCODE", "MINOR", 
		"TIL", "SNIPPETTEXT", "CLOSEKEY", "CLOSECODE", "MACROTEXT", "MACROWS"
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
	public String getGrammarFileName() { return "NowebDocGemsParser.g4"; }

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
	public static class SpecificationContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<FragContext> frag() {
			return getRuleContexts(FragContext.class);
		}
		public FragContext frag(int i) {
			return getRuleContext(FragContext.class,i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitSpecification(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPENFRAG || _la==TEXT) {
				{
				setState(26);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(24);
					text();
					}
					break;
				case OPENFRAG:
					{
					setState(25);
					frag();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30);
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(NowebDocGemsParser.TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(TEXT);
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

	public static class FragContext extends ParserRuleContext {
		public TerminalNode OPENFRAG() { return getToken(NowebDocGemsParser.OPENFRAG, 0); }
		public TerminalNode CLOSEFRAG() { return getToken(NowebDocGemsParser.CLOSEFRAG, 0); }
		public SnippetContext snippet() {
			return getRuleContext(SnippetContext.class,0);
		}
		public FragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterFrag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitFrag(this);
		}
	}

	public final FragContext frag() throws RecognitionException {
		FragContext _localctx = new FragContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_frag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(OPENFRAG);
			setState(35);
			_la = _input.LA(1);
			if (_la==OPENCODE) {
				{
				setState(34);
				snippet();
				}
			}

			setState(37);
			match(CLOSEFRAG);
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

	public static class SnippetContext extends ParserRuleContext {
		public CodeNameContext codeName() {
			return getRuleContext(CodeNameContext.class,0);
		}
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public SnippetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_snippet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterSnippet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitSnippet(this);
		}
	}

	public final SnippetContext snippet() throws RecognitionException {
		SnippetContext _localctx = new SnippetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_snippet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			codeName();
			setState(40);
			lines();
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

	public static class CodeNameContext extends ParserRuleContext {
		public TerminalNode OPENCODE() { return getToken(NowebDocGemsParser.OPENCODE, 0); }
		public KeyNameContext keyName() {
			return getRuleContext(KeyNameContext.class,0);
		}
		public TerminalNode CLOSEKEY() { return getToken(NowebDocGemsParser.CLOSEKEY, 0); }
		public CodeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterCodeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitCodeName(this);
		}
	}

	public final CodeNameContext codeName() throws RecognitionException {
		CodeNameContext _localctx = new CodeNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_codeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(OPENCODE);
			setState(43);
			keyName();
			setState(44);
			match(CLOSEKEY);
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

	public static class KeyNameContext extends ParserRuleContext {
		public TerminalNode MACROTEXT() { return getToken(NowebDocGemsParser.MACROTEXT, 0); }
		public KeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterKeyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitKeyName(this);
		}
	}

	public final KeyNameContext keyName() throws RecognitionException {
		KeyNameContext _localctx = new KeyNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_keyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(MACROTEXT);
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

	public static class LinesContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitLines(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENCODE) | (1L << MINOR) | (1L << TIL) | (1L << SNIPPETTEXT))) != 0)) {
				{
				setState(50);
				switch (_input.LA(1)) {
				case OPENCODE:
					{
					setState(48);
					block();
					}
					break;
				case MINOR:
				case TIL:
				case SNIPPETTEXT:
					{
					setState(49);
					instruction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionTextContext instructionText() {
			return getRuleContext(InstructionTextContext.class,0);
		}
		public MinorContext minor() {
			return getRuleContext(MinorContext.class,0);
		}
		public TilContext til() {
			return getRuleContext(TilContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instruction);
		try {
			setState(58);
			switch (_input.LA(1)) {
			case SNIPPETTEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				instructionText();
				}
				break;
			case MINOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				minor();
				}
				break;
			case TIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				til();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPENCODE() { return getToken(NowebDocGemsParser.OPENCODE, 0); }
		public TerminalNode MACROTEXT() { return getToken(NowebDocGemsParser.MACROTEXT, 0); }
		public TerminalNode CLOSECODE() { return getToken(NowebDocGemsParser.CLOSECODE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(OPENCODE);
			setState(61);
			match(MACROTEXT);
			setState(62);
			match(CLOSECODE);
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

	public static class InstructionTextContext extends ParserRuleContext {
		public TerminalNode SNIPPETTEXT() { return getToken(NowebDocGemsParser.SNIPPETTEXT, 0); }
		public InstructionTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterInstructionText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitInstructionText(this);
		}
	}

	public final InstructionTextContext instructionText() throws RecognitionException {
		InstructionTextContext _localctx = new InstructionTextContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instructionText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(SNIPPETTEXT);
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

	public static class MinorContext extends ParserRuleContext {
		public TerminalNode MINOR() { return getToken(NowebDocGemsParser.MINOR, 0); }
		public MinorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterMinor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitMinor(this);
		}
	}

	public final MinorContext minor() throws RecognitionException {
		MinorContext _localctx = new MinorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_minor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(MINOR);
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

	public static class TilContext extends ParserRuleContext {
		public TerminalNode TIL() { return getToken(NowebDocGemsParser.TIL, 0); }
		public TilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_til; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).enterTil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsParserListener ) ((NowebDocGemsParserListener)listener).exitTil(this);
		}
	}

	public final TilContext til() throws RecognitionException {
		TilContext _localctx = new TilContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_til);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(TIL);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\3\3\3\4\3\4\5\4&"+
		"\n\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\7\b\65\n\b\f"+
		"\b\16\b8\13\b\3\t\3\t\3\t\5\t=\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2C\2\36\3\2\2\2\4!\3"+
		"\2\2\2\6#\3\2\2\2\b)\3\2\2\2\n,\3\2\2\2\f\60\3\2\2\2\16\66\3\2\2\2\20"+
		"<\3\2\2\2\22>\3\2\2\2\24B\3\2\2\2\26D\3\2\2\2\30F\3\2\2\2\32\35\5\4\3"+
		"\2\33\35\5\6\4\2\34\32\3\2\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2"+
		"\36\37\3\2\2\2\37\3\3\2\2\2 \36\3\2\2\2!\"\7\5\2\2\"\5\3\2\2\2#%\7\4\2"+
		"\2$&\5\b\5\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\7\2\2(\7\3\2\2\2)*\5"+
		"\n\6\2*+\5\16\b\2+\t\3\2\2\2,-\7\b\2\2-.\5\f\7\2./\7\f\2\2/\13\3\2\2\2"+
		"\60\61\7\16\2\2\61\r\3\2\2\2\62\65\5\22\n\2\63\65\5\20\t\2\64\62\3\2\2"+
		"\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\17\3\2\2\2"+
		"8\66\3\2\2\29=\5\24\13\2:=\5\26\f\2;=\5\30\r\2<9\3\2\2\2<:\3\2\2\2<;\3"+
		"\2\2\2=\21\3\2\2\2>?\7\b\2\2?@\7\16\2\2@A\7\r\2\2A\23\3\2\2\2BC\7\13\2"+
		"\2C\25\3\2\2\2DE\7\t\2\2E\27\3\2\2\2FG\7\n\2\2G\31\3\2\2\2\b\34\36%\64"+
		"\66<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
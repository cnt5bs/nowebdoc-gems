// Generated from NowebDocGemsLexer.g4 by ANTLR 4.5.3
package nowebDocGems.gram;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NowebDocGemsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CMT=1, OPENFRAG=2, TEXT=3, TEXTWS=4, CLOSEFRAG=5, OPENCODE=6, MINOR=7, 
		TIL=8, SNIPPETTEXT=9, CLOSEKEY=10, CLOSECODE=11, MACROTEXT=12, MACROWS=13;
	public static final int SNIPPET = 1;
	public static final int MACRO = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "SNIPPET", "MACRO"
	};

	public static final String[] ruleNames = {
		"CMT", "OPENFRAG", "TEXT", "TEXTWS", "CLOSEFRAG", "OPENCODE", "MINOR", 
		"TIL", "SNIPPETTEXT", "CLOSEKEY", "CLOSECODE", "MACROTEXT", "MACROWS"
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


	public NowebDocGemsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NowebDocGemsLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return OPENFRAG_sempred((RuleContext)_localctx, predIndex);
		case 4:
			return CLOSEFRAG_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean OPENFRAG_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getCharPositionInLine() == 0;
		}
		return true;
	}
	private boolean CLOSEFRAG_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return getCharPositionInLine() == 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17\177\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\7\2&"+
		"\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\3\3\3\3\4\6\4A\n\4\r\4\16\4B\3\5\6"+
		"\5F\n\5\r\5\16\5G\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6R\n\6\f\6\16\6U\13"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\ne\n\n\r"+
		"\n\16\nf\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\6\ru\n"+
		"\r\r\r\16\rv\3\16\6\16z\n\16\r\16\16\16{\3\16\3\16\4\'8\2\17\5\3\7\4\t"+
		"\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\5\2\3\4\b\4\2\f"+
		"\f\17\17\3\2\u0080\u0080\5\2\13\f\17\17\"\"\4\2\13\13\"\"\4\2>>\u0080"+
		"\u0080\3\2@@\u0084\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3"+
		"\r\3\2\2\2\3\17\3\2\2\2\3\21\3\2\2\2\3\23\3\2\2\2\3\25\3\2\2\2\4\27\3"+
		"\2\2\2\4\31\3\2\2\2\4\33\3\2\2\2\4\35\3\2\2\2\5\37\3\2\2\2\7\60\3\2\2"+
		"\2\t@\3\2\2\2\13E\3\2\2\2\rK\3\2\2\2\17Z\3\2\2\2\21_\3\2\2\2\23a\3\2\2"+
		"\2\25d\3\2\2\2\27h\3\2\2\2\31n\3\2\2\2\33t\3\2\2\2\35y\3\2\2\2\37 \7>"+
		"\2\2 !\7#\2\2!\"\7/\2\2\"#\7/\2\2#\'\3\2\2\2$&\13\2\2\2%$\3\2\2\2&)\3"+
		"\2\2\2\'(\3\2\2\2\'%\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7/\2\2+,\7/\2\2,-"+
		"\7@\2\2-.\3\2\2\2./\b\2\2\2/\6\3\2\2\2\60\61\6\3\2\2\61\62\7\u0080\2\2"+
		"\62\63\7\u0080\2\2\63\64\7\u0080\2\2\648\3\2\2\2\65\67\13\2\2\2\66\65"+
		"\3\2\2\2\67:\3\2\2\289\3\2\2\28\66\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\t\2\2"+
		"\2<=\3\2\2\2=>\b\3\3\2>\b\3\2\2\2?A\n\3\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2"+
		"\2\2BC\3\2\2\2C\n\3\2\2\2DF\t\4\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3"+
		"\2\2\2HI\3\2\2\2IJ\b\5\2\2J\f\3\2\2\2KL\6\6\3\2LM\7\u0080\2\2MN\7\u0080"+
		"\2\2NO\7\u0080\2\2OS\3\2\2\2PR\t\5\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2S"+
		"T\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\t\2\2\2WX\3\2\2\2XY\b\6\4\2Y\16\3\2\2"+
		"\2Z[\7>\2\2[\\\7>\2\2\\]\3\2\2\2]^\b\7\5\2^\20\3\2\2\2_`\7>\2\2`\22\3"+
		"\2\2\2ab\7\u0080\2\2b\24\3\2\2\2ce\n\6\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2"+
		"\2fg\3\2\2\2g\26\3\2\2\2hi\7@\2\2ij\7@\2\2jk\7?\2\2kl\3\2\2\2lm\b\13\4"+
		"\2m\30\3\2\2\2no\7@\2\2op\7@\2\2pq\3\2\2\2qr\b\f\4\2r\32\3\2\2\2su\n\7"+
		"\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\34\3\2\2\2xz\t\4\2\2yx\3"+
		"\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\16\2\2~\36\3\2\2\2"+
		"\r\2\3\4\'8BGSfv{\6\b\2\2\7\3\2\6\2\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
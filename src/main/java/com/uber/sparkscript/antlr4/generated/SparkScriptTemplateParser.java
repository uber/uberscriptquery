// Generated from SparkScriptTemplate.g4 by ANTLR 4.5.3

   package com.uber.sparkscript.antlr4.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkScriptTemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SELECT=9, 
		FROM=10, ADD=11, AS=12, ALL=13, DISTINCT=14, WHERE=15, GROUP=16, BY=17, 
		GROUPING=18, SETS=19, CUBE=20, ROLLUP=21, ORDER=22, HAVING=23, LIMIT=24, 
		AT=25, OR=26, AND=27, IN=28, NOT=29, NO=30, EXISTS=31, BETWEEN=32, LIKE=33, 
		RLIKE=34, IS=35, NULL=36, TRUE=37, FALSE=38, NULLS=39, ASC=40, DESC=41, 
		FOR=42, INTERVAL=43, CASE=44, WHEN=45, THEN=46, ELSE=47, END=48, JOIN=49, 
		CROSS=50, OUTER=51, INNER=52, LEFT=53, SEMI=54, RIGHT=55, FULL=56, NATURAL=57, 
		ON=58, LATERAL=59, WINDOW=60, OVER=61, PARTITION=62, RANGE=63, ROWS=64, 
		UNBOUNDED=65, PRECEDING=66, FOLLOWING=67, CURRENT=68, ROW=69, WITH=70, 
		VALUES=71, CREATE=72, TABLE=73, VIEW=74, REPLACE=75, INSERT=76, DELETE=77, 
		INTO=78, DESCRIBE=79, EXPLAIN=80, FORMAT=81, LOGICAL=82, CODEGEN=83, CAST=84, 
		SHOW=85, TABLES=86, COLUMNS=87, COLUMN=88, USE=89, PARTITIONS=90, FUNCTIONS=91, 
		DROP=92, UNION=93, EXCEPT=94, INTERSECT=95, TO=96, TABLESAMPLE=97, STRATIFY=98, 
		ALTER=99, RENAME=100, ARRAY=101, MAP=102, STRUCT=103, COMMENT=104, SET=105, 
		RESET=106, DATA=107, START=108, TRANSACTION=109, COMMIT=110, ROLLBACK=111, 
		MACRO=112, IF=113, EQ=114, NSEQ=115, NEQ=116, NEQJ=117, LT=118, LTE=119, 
		GT=120, GTE=121, PLUS=122, MINUS=123, ASTERISK=124, SLASH=125, PERCENT=126, 
		DIV=127, TILDE=128, AMPERSAND=129, PIPE=130, HAT=131, PERCENTLIT=132, 
		BUCKET=133, OUT=134, OF=135, SORT=136, CLUSTER=137, DISTRIBUTE=138, OVERWRITE=139, 
		TRANSFORM=140, REDUCE=141, USING=142, SERDE=143, SERDEPROPERTIES=144, 
		RECORDREADER=145, RECORDWRITER=146, DELIMITED=147, FIELDS=148, TERMINATED=149, 
		COLLECTION=150, ITEMS=151, KEYS=152, ESCAPED=153, LINES=154, SEPARATED=155, 
		FUNCTION=156, EXTENDED=157, REFRESH=158, CLEAR=159, CACHE=160, UNCACHE=161, 
		LAZY=162, FORMATTED=163, TEMPORARY=164, OPTIONS=165, UNSET=166, TBLPROPERTIES=167, 
		DBPROPERTIES=168, BUCKETS=169, SKEWED=170, STORED=171, DIRECTORIES=172, 
		LOCATION=173, EXCHANGE=174, ARCHIVE=175, UNARCHIVE=176, FILEFORMAT=177, 
		TOUCH=178, COMPACT=179, CONCATENATE=180, CHANGE=181, CASCADE=182, RESTRICT=183, 
		CLUSTERED=184, SORTED=185, PURGE=186, INPUTFORMAT=187, OUTPUTFORMAT=188, 
		DATABASE=189, DATABASES=190, DFS=191, TRUNCATE=192, ANALYZE=193, COMPUTE=194, 
		LIST=195, STATISTICS=196, PARTITIONED=197, EXTERNAL=198, DEFINED=199, 
		REVOKE=200, GRANT=201, LOCK=202, UNLOCK=203, MSCK=204, REPAIR=205, EXPORT=206, 
		IMPORT=207, LOAD=208, ROLE=209, ROLES=210, COMPACTIONS=211, PRINCIPALS=212, 
		TRANSACTIONS=213, INDEX=214, INDEXES=215, LOCKS=216, OPTION=217, ANTI=218, 
		LOCAL=219, INPATH=220, STRING=221, BIGINT_LITERAL=222, SMALLINT_LITERAL=223, 
		TINYINT_LITERAL=224, BYTELENGTH_LITERAL=225, INTEGER_VALUE=226, DECIMAL_VALUE=227, 
		SCIENTIFIC_DECIMAL_VALUE=228, DOUBLE_LITERAL=229, IDENTIFIER=230, BACKQUOTED_IDENTIFIER=231, 
		SIMPLE_COMMENT=232, BRACKETED_COMMENT=233, WS=234, UNRECOGNIZED=235, DELIMITER=236;
	public static final int
		RULE_root = 0, RULE_assignmentWithSemicolon = 1, RULE_variableAssignment = 2, 
		RULE_variableAssignment_variableName = 3, RULE_statement = 4, RULE_unsupportedHiveNativeCommands = 5, 
		RULE_createTableHeader = 6, RULE_bucketSpec = 7, RULE_skewSpec = 8, RULE_locationSpec = 9, 
		RULE_query = 10, RULE_insertInto = 11, RULE_partitionSpecLocation = 12, 
		RULE_partitionSpec = 13, RULE_partitionVal = 14, RULE_describeFuncName = 15, 
		RULE_describeColName = 16, RULE_ctes = 17, RULE_namedQuery = 18, RULE_tableProvider = 19, 
		RULE_tablePropertyList = 20, RULE_tableProperty = 21, RULE_tablePropertyKey = 22, 
		RULE_tablePropertyValue = 23, RULE_constantList = 24, RULE_nestedConstantList = 25, 
		RULE_createFileFormat = 26, RULE_fileFormat = 27, RULE_storageHandler = 28, 
		RULE_resource = 29, RULE_queryNoWith = 30, RULE_queryOrganization = 31, 
		RULE_multiInsertQueryBody = 32, RULE_queryTerm = 33, RULE_queryPrimary = 34, 
		RULE_sortItem = 35, RULE_querySpecification = 36, RULE_fromClause = 37, 
		RULE_aggregation = 38, RULE_groupingSet = 39, RULE_lateralView = 40, RULE_setQuantifier = 41, 
		RULE_relation = 42, RULE_joinType = 43, RULE_joinCriteria = 44, RULE_sample = 45, 
		RULE_identifierList = 46, RULE_identifierSeq = 47, RULE_orderedIdentifierList = 48, 
		RULE_orderedIdentifier = 49, RULE_identifierCommentList = 50, RULE_identifierComment = 51, 
		RULE_relationPrimary = 52, RULE_inlineTable = 53, RULE_rowFormat = 54, 
		RULE_tableIdentifier = 55, RULE_namedExpression = 56, RULE_namedExpressionSeq = 57, 
		RULE_expression = 58, RULE_booleanExpression = 59, RULE_predicated = 60, 
		RULE_predicate = 61, RULE_valueExpression = 62, RULE_primaryExpression = 63, 
		RULE_constant = 64, RULE_comparisonOperator = 65, RULE_arithmeticOperator = 66, 
		RULE_predicateOperator = 67, RULE_booleanValue = 68, RULE_interval = 69, 
		RULE_intervalField = 70, RULE_intervalValue = 71, RULE_dataType = 72, 
		RULE_colTypeList = 73, RULE_colType = 74, RULE_whenClause = 75, RULE_windows = 76, 
		RULE_namedWindow = 77, RULE_windowSpec = 78, RULE_windowFrame = 79, RULE_frameBound = 80, 
		RULE_qualifiedName = 81, RULE_identifier = 82, RULE_strictIdentifier = 83, 
		RULE_quotedIdentifier = 84, RULE_number = 85, RULE_nonReserved = 86;
	public static final String[] ruleNames = {
		"root", "assignmentWithSemicolon", "variableAssignment", "variableAssignment_variableName", 
		"statement", "unsupportedHiveNativeCommands", "createTableHeader", "bucketSpec", 
		"skewSpec", "locationSpec", "query", "insertInto", "partitionSpecLocation", 
		"partitionSpec", "partitionVal", "describeFuncName", "describeColName", 
		"ctes", "namedQuery", "tableProvider", "tablePropertyList", "tableProperty", 
		"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
		"createFileFormat", "fileFormat", "storageHandler", "resource", "queryNoWith", 
		"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
		"sortItem", "querySpecification", "fromClause", "aggregation", "groupingSet", 
		"lateralView", "setQuantifier", "relation", "joinType", "joinCriteria", 
		"sample", "identifierList", "identifierSeq", "orderedIdentifierList", 
		"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
		"inlineTable", "rowFormat", "tableIdentifier", "namedExpression", "namedExpressionSeq", 
		"expression", "booleanExpression", "predicated", "predicate", "valueExpression", 
		"primaryExpression", "constant", "comparisonOperator", "arithmeticOperator", 
		"predicateOperator", "booleanValue", "interval", "intervalField", "intervalValue", 
		"dataType", "colTypeList", "colType", "whenClause", "windows", "namedWindow", 
		"windowSpec", "windowFrame", "frameBound", "qualifiedName", "identifier", 
		"strictIdentifier", "quotedIdentifier", "number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "','", "'.'", "'['", "']'", "':'", "'SELECT'", 
		"'FROM'", "'ADD'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", "'GROUP'", 
		"'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", "'HAVING'", 
		"'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", "'EXISTS'", 
		"'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", "'FALSE'", "'NULLS'", 
		"'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", "'WHEN'", "'THEN'", 
		"'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", "'INNER'", "'LEFT'", 
		"'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", "'LATERAL'", "'WINDOW'", 
		"'OVER'", "'PARTITION'", "'RANGE'", "'ROWS'", "'UNBOUNDED'", "'PRECEDING'", 
		"'FOLLOWING'", "'CURRENT'", "'ROW'", "'WITH'", "'VALUES'", "'CREATE'", 
		"'TABLE'", "'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", "'DESCRIBE'", 
		"'EXPLAIN'", "'FORMAT'", "'LOGICAL'", "'CODEGEN'", "'CAST'", "'SHOW'", 
		"'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", "'FUNCTIONS'", 
		"'DROP'", "'UNION'", "'EXCEPT'", "'INTERSECT'", "'TO'", "'TABLESAMPLE'", 
		"'STRATIFY'", "'ALTER'", "'RENAME'", "'ARRAY'", "'MAP'", "'STRUCT'", "'COMMENT'", 
		"'SET'", "'RESET'", "'DATA'", "'START'", "'TRANSACTION'", "'COMMIT'", 
		"'ROLLBACK'", "'MACRO'", "'IF'", null, "'<=>'", "'<>'", "'!='", "'<'", 
		null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", 
		"'&'", "'|'", "'^'", "'PERCENT'", "'BUCKET'", "'OUT'", "'OF'", "'SORT'", 
		"'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", "'TRANSFORM'", "'REDUCE'", 
		"'USING'", "'SERDE'", "'SERDEPROPERTIES'", "'RECORDREADER'", "'RECORDWRITER'", 
		"'DELIMITED'", "'FIELDS'", "'TERMINATED'", "'COLLECTION'", "'ITEMS'", 
		"'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", "'FUNCTION'", "'EXTENDED'", 
		"'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", "'LAZY'", "'FORMATTED'", 
		null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", "'DBPROPERTIES'", "'BUCKETS'", 
		"'SKEWED'", "'STORED'", "'DIRECTORIES'", "'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", 
		"'UNARCHIVE'", "'FILEFORMAT'", "'TOUCH'", "'COMPACT'", "'CONCATENATE'", 
		"'CHANGE'", "'CASCADE'", "'RESTRICT'", "'CLUSTERED'", "'SORTED'", "'PURGE'", 
		"'INPUTFORMAT'", "'OUTPUTFORMAT'", null, null, "'DFS'", "'TRUNCATE'", 
		"'ANALYZE'", "'COMPUTE'", "'LIST'", "'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", 
		"'DEFINED'", "'REVOKE'", "'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", 
		"'EXPORT'", "'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", 
		"'PRINCIPALS'", "'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", 
		"'ANTI'", "'LOCAL'", "'INPATH'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "SELECT", "FROM", 
		"ADD", "AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", "SETS", 
		"CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", "IN", 
		"NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL", "TRUE", 
		"FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", "WHEN", "THEN", 
		"ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "SEMI", "RIGHT", 
		"FULL", "NATURAL", "ON", "LATERAL", "WINDOW", "OVER", "PARTITION", "RANGE", 
		"ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "ROW", "WITH", 
		"VALUES", "CREATE", "TABLE", "VIEW", "REPLACE", "INSERT", "DELETE", "INTO", 
		"DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", "CODEGEN", "CAST", "SHOW", 
		"TABLES", "COLUMNS", "COLUMN", "USE", "PARTITIONS", "FUNCTIONS", "DROP", 
		"UNION", "EXCEPT", "INTERSECT", "TO", "TABLESAMPLE", "STRATIFY", "ALTER", 
		"RENAME", "ARRAY", "MAP", "STRUCT", "COMMENT", "SET", "RESET", "DATA", 
		"START", "TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", "IF", "EQ", "NSEQ", 
		"NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", 
		"SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", "HAT", "PERCENTLIT", 
		"BUCKET", "OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", "OVERWRITE", "TRANSFORM", 
		"REDUCE", "USING", "SERDE", "SERDEPROPERTIES", "RECORDREADER", "RECORDWRITER", 
		"DELIMITED", "FIELDS", "TERMINATED", "COLLECTION", "ITEMS", "KEYS", "ESCAPED", 
		"LINES", "SEPARATED", "FUNCTION", "EXTENDED", "REFRESH", "CLEAR", "CACHE", 
		"UNCACHE", "LAZY", "FORMATTED", "TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", 
		"DBPROPERTIES", "BUCKETS", "SKEWED", "STORED", "DIRECTORIES", "LOCATION", 
		"EXCHANGE", "ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", 
		"CONCATENATE", "CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", "SORTED", 
		"PURGE", "INPUTFORMAT", "OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", 
		"TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "STATISTICS", "PARTITIONED", 
		"EXTERNAL", "DEFINED", "REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", 
		"EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", "PRINCIPALS", 
		"TRANSACTIONS", "INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", "LOCAL", 
		"INPATH", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
		"BYTELENGTH_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "SCIENTIFIC_DECIMAL_VALUE", 
		"DOUBLE_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "DELIMITER"
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
	public String getGrammarFileName() { return "SparkScriptTemplate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SparkScriptTemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SparkScriptTemplateParser.EOF, 0); }
		public List<AssignmentWithSemicolonContext> assignmentWithSemicolon() {
			return getRuleContexts(AssignmentWithSemicolonContext.class);
		}
		public AssignmentWithSemicolonContext assignmentWithSemicolon(int i) {
			return getRuleContext(AssignmentWithSemicolonContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					assignmentWithSemicolon();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION) | (1L << RANGE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)) | (1L << (EQ - 64)) | (1L << (NSEQ - 64)) | (1L << (NEQ - 64)) | (1L << (NEQJ - 64)) | (1L << (LT - 64)) | (1L << (LTE - 64)) | (1L << (GT - 64)) | (1L << (GTE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (ASTERISK - 64)) | (1L << (SLASH - 64)) | (1L << (PERCENT - 64)) | (1L << (DIV - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TILDE - 128)) | (1L << (AMPERSAND - 128)) | (1L << (PIPE - 128)) | (1L << (HAT - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (USING - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)) | (1L << (EXCHANGE - 128)) | (1L << (ARCHIVE - 128)) | (1L << (UNARCHIVE - 128)) | (1L << (FILEFORMAT - 128)) | (1L << (TOUCH - 128)) | (1L << (COMPACT - 128)) | (1L << (CONCATENATE - 128)) | (1L << (CHANGE - 128)) | (1L << (CASCADE - 128)) | (1L << (RESTRICT - 128)) | (1L << (CLUSTERED - 128)) | (1L << (SORTED - 128)) | (1L << (PURGE - 128)) | (1L << (INPUTFORMAT - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (DFS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (BYTELENGTH_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (SCIENTIFIC_DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (SIMPLE_COMMENT - 192)) | (1L << (BRACKETED_COMMENT - 192)) | (1L << (WS - 192)) | (1L << (UNRECOGNIZED - 192)) | (1L << (DELIMITER - 192)))) != 0)) {
				{
				{
				setState(180);
				matchWildcard();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(EOF);
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

	public static class AssignmentWithSemicolonContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public AssignmentWithSemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentWithSemicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterAssignmentWithSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitAssignmentWithSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitAssignmentWithSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentWithSemicolonContext assignmentWithSemicolon() throws RecognitionException {
		AssignmentWithSemicolonContext _localctx = new AssignmentWithSemicolonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignmentWithSemicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			variableAssignment();
			setState(189);
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public VariableAssignment_variableNameContext variableAssignment_variableName() {
			return getRuleContext(VariableAssignment_variableNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkScriptTemplateParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			variableAssignment_variableName();
			setState(192);
			match(EQ);
			setState(193);
			match(STRING);
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

	public static class VariableAssignment_variableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SparkScriptTemplateParser.IDENTIFIER, 0); }
		public VariableAssignment_variableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterVariableAssignment_variableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitVariableAssignment_variableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitVariableAssignment_variableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignment_variableNameContext variableAssignment_variableName() throws RecognitionException {
		VariableAssignment_variableNameContext _localctx = new VariableAssignment_variableNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableAssignment_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(IDENTIFIER);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SparkScriptTemplateParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SparkScriptTemplateParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkScriptTemplateParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkScriptTemplateParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkScriptTemplateParser.CODEGEN, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(SparkScriptTemplateParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkScriptTemplateParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkScriptTemplateParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSetDatabaseProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSetDatabaseProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkScriptTemplateParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(SparkScriptTemplateParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkScriptTemplateParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SparkScriptTemplateParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public ColTypeListContext columns;
		public ColTypeListContext partitionColumns;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkScriptTemplateParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkScriptTemplateParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SparkScriptTemplateParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public SkewSpecContext skewSpec() {
			return getRuleContext(SkewSpecContext.class,0);
		}
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SparkScriptTemplateParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SparkScriptTemplateParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(SparkScriptTemplateParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkScriptTemplateParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkScriptTemplateParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkScriptTemplateParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDescribeDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDescribeDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SparkScriptTemplateParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkScriptTemplateParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkScriptTemplateParser.DESCRIBE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SparkScriptTemplateParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkScriptTemplateParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDescribeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDescribeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode USE() { return getToken(SparkScriptTemplateParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkScriptTemplateParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkScriptTemplateParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SparkScriptTemplateParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkScriptTemplateParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkScriptTemplateParser.REPLACE, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkScriptTemplateParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(SparkScriptTemplateParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SparkScriptTemplateParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkScriptTemplateParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SparkScriptTemplateParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkScriptTemplateParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkScriptTemplateParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SparkScriptTemplateParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkScriptTemplateParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkScriptTemplateParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkScriptTemplateParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkScriptTemplateParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SparkScriptTemplateParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SparkScriptTemplateParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SparkScriptTemplateParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SparkScriptTemplateParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SparkScriptTemplateParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkScriptTemplateParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkScriptTemplateParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkScriptTemplateParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkScriptTemplateParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SparkScriptTemplateParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkScriptTemplateParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkScriptTemplateParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkScriptTemplateParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SparkScriptTemplateParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SparkScriptTemplateParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkScriptTemplateParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SparkScriptTemplateParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(SparkScriptTemplateParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkScriptTemplateParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkScriptTemplateParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SparkScriptTemplateParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkScriptTemplateParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkScriptTemplateParser.REFRESH, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SparkScriptTemplateParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkScriptTemplateParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SparkScriptTemplateParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SparkScriptTemplateParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkScriptTemplateParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkScriptTemplateParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SparkScriptTemplateParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkScriptTemplateParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkScriptTemplateParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkScriptTemplateParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkScriptTemplateParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkScriptTemplateParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkScriptTemplateParser.PARTITIONED, 0); }
		public TerminalNode ON() { return getToken(SparkScriptTemplateParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SparkScriptTemplateParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SparkScriptTemplateParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkScriptTemplateParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SparkScriptTemplateParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkScriptTemplateParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SparkScriptTemplateParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkScriptTemplateParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkScriptTemplateParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkScriptTemplateParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SparkScriptTemplateParser.VIEW, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(SparkScriptTemplateParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkScriptTemplateParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(SparkScriptTemplateParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SparkScriptTemplateParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SparkScriptTemplateParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SparkScriptTemplateParser.IN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableUsingContext extends StatementContext {
		public IdentifierListContext partitionColumnNames;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkScriptTemplateParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode PARTITIONED() { return getToken(SparkScriptTemplateParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SparkScriptTemplateParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public CreateTableUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCreateTableUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCreateTableUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCreateTableUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkScriptTemplateParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SparkScriptTemplateParser.DATABASES, 0); }
		public TerminalNode LIKE() { return getToken(SparkScriptTemplateParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitShowDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitShowDatabases(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkScriptTemplateParser.ADD, 0); }
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkScriptTemplateParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(SparkScriptTemplateParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkScriptTemplateParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkScriptTemplateParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SparkScriptTemplateParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(SparkScriptTemplateParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SparkScriptTemplateParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkScriptTemplateParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SparkScriptTemplateParser.COMMENT, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SparkScriptTemplateParser.WITH, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkScriptTemplateParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SparkScriptTemplateParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkScriptTemplateParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SparkScriptTemplateParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SparkScriptTemplateParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkScriptTemplateParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SparkScriptTemplateParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkScriptTemplateParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SparkScriptTemplateParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkScriptTemplateParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkScriptTemplateParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkScriptTemplateParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SparkScriptTemplateParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkScriptTemplateParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkScriptTemplateParser.TEMPORARY, 0); }
		public TerminalNode USING() { return getToken(SparkScriptTemplateParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkScriptTemplateParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkScriptTemplateParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SparkScriptTemplateParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(SparkScriptTemplateParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SparkScriptTemplateParser.LAZY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkScriptTemplateParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkScriptTemplateParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkScriptTemplateParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(USE);
				setState(199);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(CREATE);
				setState(201);
				match(DATABASE);
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(202);
					match(IF);
					setState(203);
					match(NOT);
					setState(204);
					match(EXISTS);
					}
					break;
				}
				setState(207);
				identifier();
				setState(210);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(208);
					match(COMMENT);
					setState(209);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(213);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(212);
					locationSpec();
					}
				}

				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(215);
					match(WITH);
					setState(216);
					match(DBPROPERTIES);
					setState(217);
					tablePropertyList();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(ALTER);
				setState(221);
				match(DATABASE);
				setState(222);
				identifier();
				setState(223);
				match(SET);
				setState(224);
				match(DBPROPERTIES);
				setState(225);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(DROP);
				setState(228);
				match(DATABASE);
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(229);
					match(IF);
					setState(230);
					match(EXISTS);
					}
					break;
				}
				setState(233);
				identifier();
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(234);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new CreateTableUsingContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				createTableHeader();
				setState(242);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(238);
					match(T__1);
					setState(239);
					colTypeList();
					setState(240);
					match(T__2);
					}
				}

				setState(244);
				tableProvider();
				setState(247);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(245);
					match(OPTIONS);
					setState(246);
					tablePropertyList();
					}
				}

				setState(252);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(249);
					match(PARTITIONED);
					setState(250);
					match(BY);
					setState(251);
					((CreateTableUsingContext)_localctx).partitionColumnNames = identifierList();
					}
				}

				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(254);
					bucketSpec();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new CreateTableUsingContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				createTableHeader();
				setState(258);
				tableProvider();
				setState(261);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(259);
					match(OPTIONS);
					setState(260);
					tablePropertyList();
					}
				}

				setState(266);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(263);
					match(PARTITIONED);
					setState(264);
					match(BY);
					setState(265);
					((CreateTableUsingContext)_localctx).partitionColumnNames = identifierList();
					}
				}

				setState(269);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(268);
					bucketSpec();
					}
				}

				setState(272);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(271);
					match(AS);
					}
				}

				setState(274);
				query();
				}
				break;
			case 8:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				createTableHeader();
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(277);
					match(T__1);
					setState(278);
					((CreateTableContext)_localctx).columns = colTypeList();
					setState(279);
					match(T__2);
					}
					break;
				}
				setState(285);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(283);
					match(COMMENT);
					setState(284);
					match(STRING);
					}
				}

				setState(293);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(287);
					match(PARTITIONED);
					setState(288);
					match(BY);
					setState(289);
					match(T__1);
					setState(290);
					((CreateTableContext)_localctx).partitionColumns = colTypeList();
					setState(291);
					match(T__2);
					}
				}

				setState(296);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(295);
					bucketSpec();
					}
				}

				setState(299);
				_la = _input.LA(1);
				if (_la==SKEWED) {
					{
					setState(298);
					skewSpec();
					}
				}

				setState(302);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(301);
					rowFormat();
					}
				}

				setState(305);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(304);
					createFileFormat();
					}
				}

				setState(308);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(307);
					locationSpec();
					}
				}

				setState(312);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(310);
					match(TBLPROPERTIES);
					setState(311);
					tablePropertyList();
					}
				}

				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(315);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(314);
						match(AS);
						}
					}

					setState(317);
					query();
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(320);
				match(CREATE);
				setState(321);
				match(TABLE);
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(322);
					match(IF);
					setState(323);
					match(NOT);
					setState(324);
					match(EXISTS);
					}
					break;
				}
				setState(327);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(328);
				match(LIKE);
				setState(329);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				}
				break;
			case 10:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(331);
				match(ANALYZE);
				setState(332);
				match(TABLE);
				setState(333);
				tableIdentifier();
				setState(335);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(334);
					partitionSpec();
					}
				}

				setState(337);
				match(COMPUTE);
				setState(338);
				match(STATISTICS);
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(339);
					identifier();
					}
					break;
				case 2:
					{
					setState(340);
					match(FOR);
					setState(341);
					match(COLUMNS);
					setState(343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(342);
						identifierSeq();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(347);
				match(ALTER);
				setState(348);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(349);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(350);
				match(RENAME);
				setState(351);
				match(TO);
				setState(352);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(354);
				match(ALTER);
				setState(355);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(356);
				tableIdentifier();
				setState(357);
				match(SET);
				setState(358);
				match(TBLPROPERTIES);
				setState(359);
				tablePropertyList();
				}
				break;
			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(361);
				match(ALTER);
				setState(362);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(363);
				tableIdentifier();
				setState(364);
				match(UNSET);
				setState(365);
				match(TBLPROPERTIES);
				setState(368);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(366);
					match(IF);
					setState(367);
					match(EXISTS);
					}
				}

				setState(370);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(372);
				match(ALTER);
				setState(373);
				match(TABLE);
				setState(374);
				tableIdentifier();
				setState(376);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(375);
					partitionSpec();
					}
				}

				setState(378);
				match(SET);
				setState(379);
				match(SERDE);
				setState(380);
				match(STRING);
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(381);
					match(WITH);
					setState(382);
					match(SERDEPROPERTIES);
					setState(383);
					tablePropertyList();
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(386);
				match(ALTER);
				setState(387);
				match(TABLE);
				setState(388);
				tableIdentifier();
				setState(390);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(389);
					partitionSpec();
					}
				}

				setState(392);
				match(SET);
				setState(393);
				match(SERDEPROPERTIES);
				setState(394);
				tablePropertyList();
				}
				break;
			case 16:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(396);
				match(ALTER);
				setState(397);
				match(TABLE);
				setState(398);
				tableIdentifier();
				setState(399);
				match(ADD);
				setState(403);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(400);
					match(IF);
					setState(401);
					match(NOT);
					setState(402);
					match(EXISTS);
					}
				}

				setState(406); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(405);
						partitionSpecLocation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(408); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(410);
				match(ALTER);
				setState(411);
				match(VIEW);
				setState(412);
				tableIdentifier();
				setState(413);
				match(ADD);
				setState(417);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(414);
					match(IF);
					setState(415);
					match(NOT);
					setState(416);
					match(EXISTS);
					}
				}

				setState(420); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(419);
						partitionSpec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(422); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 18:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(424);
				match(ALTER);
				setState(425);
				match(TABLE);
				setState(426);
				tableIdentifier();
				setState(427);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(428);
				match(RENAME);
				setState(429);
				match(TO);
				setState(430);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 19:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(432);
				match(ALTER);
				setState(433);
				match(TABLE);
				setState(434);
				tableIdentifier();
				setState(435);
				match(DROP);
				setState(438);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(436);
					match(IF);
					setState(437);
					match(EXISTS);
					}
				}

				setState(440);
				partitionSpec();
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(441);
					match(T__3);
					setState(442);
					partitionSpec();
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(448);
					match(PURGE);
					}
					break;
				}
				}
				break;
			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(451);
				match(ALTER);
				setState(452);
				match(VIEW);
				setState(453);
				tableIdentifier();
				setState(454);
				match(DROP);
				setState(457);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(455);
					match(IF);
					setState(456);
					match(EXISTS);
					}
				}

				setState(459);
				partitionSpec();
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(460);
						match(T__3);
						setState(461);
						partitionSpec();
						}
						} 
					}
					setState(466);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case 21:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(467);
				match(ALTER);
				setState(468);
				match(TABLE);
				setState(469);
				tableIdentifier();
				setState(471);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(470);
					partitionSpec();
					}
				}

				setState(473);
				match(SET);
				setState(474);
				locationSpec();
				}
				break;
			case 22:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(476);
				match(DROP);
				setState(477);
				match(TABLE);
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(478);
					match(IF);
					setState(479);
					match(EXISTS);
					}
					break;
				}
				setState(482);
				tableIdentifier();
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(483);
					match(PURGE);
					}
					break;
				}
				}
				break;
			case 23:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(486);
				match(DROP);
				setState(487);
				match(VIEW);
				setState(490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(488);
					match(IF);
					setState(489);
					match(EXISTS);
					}
					break;
				}
				setState(492);
				tableIdentifier();
				}
				break;
			case 24:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(493);
				match(CREATE);
				setState(496);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(494);
					match(OR);
					setState(495);
					match(REPLACE);
					}
				}

				setState(499);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(498);
					match(TEMPORARY);
					}
				}

				setState(501);
				match(VIEW);
				setState(505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(502);
					match(IF);
					setState(503);
					match(NOT);
					setState(504);
					match(EXISTS);
					}
					break;
				}
				setState(507);
				tableIdentifier();
				setState(509);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(508);
					identifierCommentList();
					}
				}

				setState(513);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(511);
					match(COMMENT);
					setState(512);
					match(STRING);
					}
				}

				setState(518);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(515);
					match(PARTITIONED);
					setState(516);
					match(ON);
					setState(517);
					identifierList();
					}
				}

				setState(522);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(520);
					match(TBLPROPERTIES);
					setState(521);
					tablePropertyList();
					}
				}

				setState(524);
				match(AS);
				setState(525);
				query();
				}
				break;
			case 25:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(527);
				match(CREATE);
				setState(530);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(528);
					match(OR);
					setState(529);
					match(REPLACE);
					}
				}

				setState(532);
				match(TEMPORARY);
				setState(533);
				match(VIEW);
				setState(534);
				tableIdentifier();
				setState(539);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(535);
					match(T__1);
					setState(536);
					colTypeList();
					setState(537);
					match(T__2);
					}
				}

				setState(541);
				tableProvider();
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(542);
					match(OPTIONS);
					setState(543);
					tablePropertyList();
					}
					break;
				}
				}
				break;
			case 26:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(546);
				match(ALTER);
				setState(547);
				match(VIEW);
				setState(548);
				tableIdentifier();
				setState(550);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(549);
					match(AS);
					}
				}

				setState(552);
				query();
				}
				break;
			case 27:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(554);
				match(CREATE);
				setState(556);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(555);
					match(TEMPORARY);
					}
				}

				setState(558);
				match(FUNCTION);
				setState(559);
				qualifiedName();
				setState(560);
				match(AS);
				setState(561);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(562);
					match(USING);
					setState(563);
					resource();
					setState(568);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(564);
							match(T__3);
							setState(565);
							resource();
							}
							} 
						}
						setState(570);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 28:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(573);
				match(DROP);
				setState(575);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(574);
					match(TEMPORARY);
					}
				}

				setState(577);
				match(FUNCTION);
				setState(580);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(578);
					match(IF);
					setState(579);
					match(EXISTS);
					}
					break;
				}
				setState(582);
				qualifiedName();
				}
				break;
			case 29:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(583);
				match(EXPLAIN);
				setState(585);
				_la = _input.LA(1);
				if (_la==LOGICAL || _la==CODEGEN || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(584);
					_la = _input.LA(1);
					if ( !(_la==LOGICAL || _la==CODEGEN || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(587);
				statement();
				}
				break;
			case 30:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(588);
				match(SHOW);
				setState(589);
				match(TABLES);
				setState(592);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(590);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(591);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(595);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(594);
						match(LIKE);
						}
					}

					setState(597);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
					break;
				}
				}
				break;
			case 31:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(600);
				match(SHOW);
				setState(601);
				match(DATABASES);
				setState(604);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(602);
					match(LIKE);
					setState(603);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
					break;
				}
				}
				break;
			case 32:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(606);
				match(SHOW);
				setState(607);
				match(TBLPROPERTIES);
				setState(608);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(609);
					match(T__1);
					setState(610);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(611);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 33:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(615);
				match(SHOW);
				setState(616);
				match(COLUMNS);
				setState(617);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(618);
				tableIdentifier();
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(619);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(620);
					((ShowColumnsContext)_localctx).db = identifier();
					}
					break;
				}
				}
				break;
			case 34:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(623);
				match(SHOW);
				setState(624);
				match(PARTITIONS);
				setState(625);
				tableIdentifier();
				setState(627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(626);
					partitionSpec();
					}
					break;
				}
				}
				break;
			case 35:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(629);
				match(SHOW);
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(630);
					identifier();
					}
					break;
				}
				setState(633);
				match(FUNCTIONS);
				setState(641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(635);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(634);
						match(LIKE);
						}
						break;
					}
					setState(639);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IF:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case USING:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(637);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(638);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case 36:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(643);
				match(SHOW);
				setState(644);
				match(CREATE);
				setState(645);
				match(TABLE);
				setState(646);
				tableIdentifier();
				}
				break;
			case 37:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(647);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(648);
				match(FUNCTION);
				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(649);
					match(EXTENDED);
					}
					break;
				}
				setState(652);
				describeFuncName();
				}
				break;
			case 38:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(653);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(654);
				match(DATABASE);
				setState(656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(655);
					match(EXTENDED);
					}
					break;
				}
				setState(658);
				identifier();
				}
				break;
			case 39:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(659);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(660);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(663);
				tableIdentifier();
				setState(665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(664);
					partitionSpec();
					}
					break;
				}
				setState(668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(667);
					describeColName();
					}
					break;
				}
				}
				break;
			case 40:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(670);
				match(REFRESH);
				setState(671);
				match(TABLE);
				setState(672);
				tableIdentifier();
				}
				break;
			case 41:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(673);
				match(REFRESH);
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(674);
						matchWildcard();
						}
						} 
					}
					setState(679);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				}
				break;
			case 42:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(680);
				match(CACHE);
				setState(682);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(681);
					match(LAZY);
					}
				}

				setState(684);
				match(TABLE);
				setState(685);
				tableIdentifier();
				setState(690);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(687);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(686);
						match(AS);
						}
					}

					setState(689);
					query();
					}
					break;
				}
				}
				break;
			case 43:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(692);
				match(UNCACHE);
				setState(693);
				match(TABLE);
				setState(694);
				tableIdentifier();
				}
				break;
			case 44:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(695);
				match(CLEAR);
				setState(696);
				match(CACHE);
				}
				break;
			case 45:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(697);
				match(LOAD);
				setState(698);
				match(DATA);
				setState(700);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(699);
					match(LOCAL);
					}
				}

				setState(702);
				match(INPATH);
				setState(703);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(705);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(704);
					match(OVERWRITE);
					}
				}

				setState(707);
				match(INTO);
				setState(708);
				match(TABLE);
				setState(709);
				tableIdentifier();
				setState(711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(710);
					partitionSpec();
					}
					break;
				}
				}
				break;
			case 46:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(713);
				match(TRUNCATE);
				setState(714);
				match(TABLE);
				setState(715);
				tableIdentifier();
				setState(717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(716);
					partitionSpec();
					}
					break;
				}
				}
				break;
			case 47:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(719);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(720);
				identifier();
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(721);
						matchWildcard();
						}
						} 
					}
					setState(726);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				}
				break;
			case 48:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(727);
				match(SET);
				setState(728);
				match(ROLE);
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(729);
						matchWildcard();
						}
						} 
					}
					setState(734);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
				break;
			case 49:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(735);
				match(SET);
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(736);
						matchWildcard();
						}
						} 
					}
					setState(741);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
				break;
			case 50:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(742);
				match(RESET);
				}
				break;
			case 51:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(743);
				unsupportedHiveNativeCommands();
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(744);
						matchWildcard();
						}
						} 
					}
					setState(749);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SparkScriptTemplateParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SparkScriptTemplateParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SparkScriptTemplateParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SparkScriptTemplateParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkScriptTemplateParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SparkScriptTemplateParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkScriptTemplateParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SparkScriptTemplateParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SparkScriptTemplateParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SparkScriptTemplateParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkScriptTemplateParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkScriptTemplateParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkScriptTemplateParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SparkScriptTemplateParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SparkScriptTemplateParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SparkScriptTemplateParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SparkScriptTemplateParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SparkScriptTemplateParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkScriptTemplateParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkScriptTemplateParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SparkScriptTemplateParser.MACRO, 0); }
		public TerminalNode MSCK() { return getToken(SparkScriptTemplateParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SparkScriptTemplateParser.REPAIR, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkScriptTemplateParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkScriptTemplateParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SparkScriptTemplateParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SparkScriptTemplateParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SparkScriptTemplateParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SparkScriptTemplateParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkScriptTemplateParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SparkScriptTemplateParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SparkScriptTemplateParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkScriptTemplateParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkScriptTemplateParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkScriptTemplateParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkScriptTemplateParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SparkScriptTemplateParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SparkScriptTemplateParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SparkScriptTemplateParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkScriptTemplateParser.FILEFORMAT, 0); }
		public TerminalNode ADD() { return getToken(SparkScriptTemplateParser.ADD, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkScriptTemplateParser.COLUMNS, 0); }
		public TerminalNode CHANGE() { return getToken(SparkScriptTemplateParser.CHANGE, 0); }
		public TerminalNode REPLACE() { return getToken(SparkScriptTemplateParser.REPLACE, 0); }
		public TerminalNode START() { return getToken(SparkScriptTemplateParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkScriptTemplateParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SparkScriptTemplateParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkScriptTemplateParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SparkScriptTemplateParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(SparkScriptTemplateParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SparkScriptTemplateParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(753);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(755);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(758);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(757);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(760);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(762);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(761);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(764);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(765);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(766);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(767);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(768);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(771);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(772);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(773);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(774);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(775);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(776);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(777);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(778);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(779);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(780);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(781);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(782);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(783);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(784);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(785);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(786);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(787);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(788);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(789);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(790);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(791);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(792);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(793);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(794);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(795);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(796);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(797);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(798);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(799);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(800);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(801);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(802);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(803);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(804);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(805);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(806);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(807);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(808);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(809);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(810);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(811);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(812);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(813);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(MSCK);
				setState(814);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(REPAIR);
				setState(815);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(816);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(817);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(818);
				tableIdentifier();
				setState(819);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(820);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(822);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(823);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(824);
				tableIdentifier();
				setState(825);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(826);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(828);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(829);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(830);
				tableIdentifier();
				setState(831);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(832);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(834);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(835);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(836);
				tableIdentifier();
				setState(837);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(838);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(840);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(841);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(842);
				tableIdentifier();
				setState(843);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(844);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(846);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(847);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(848);
				tableIdentifier();
				setState(849);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(850);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(851);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(852);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(854);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(855);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(856);
				tableIdentifier();
				setState(857);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(858);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(859);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(861);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(862);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(863);
				tableIdentifier();
				setState(864);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(865);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(867);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(868);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(869);
				tableIdentifier();
				setState(870);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(871);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(873);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(874);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(875);
				tableIdentifier();
				setState(876);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(877);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(879);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(880);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(881);
				tableIdentifier();
				setState(882);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(884);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(885);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(886);
				tableIdentifier();
				setState(888);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(887);
					partitionSpec();
					}
				}

				setState(890);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(892);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(893);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(894);
				tableIdentifier();
				setState(896);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(895);
					partitionSpec();
					}
				}

				setState(898);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(900);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(901);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(902);
				tableIdentifier();
				setState(904);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(903);
					partitionSpec();
					}
				}

				setState(906);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(907);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(909);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(910);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(911);
				tableIdentifier();
				setState(913);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(912);
					partitionSpec();
					}
				}

				setState(915);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ADD);
				setState(916);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(918);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(919);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(920);
				tableIdentifier();
				setState(922);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(921);
					partitionSpec();
					}
				}

				setState(924);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CHANGE);
				setState(926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(925);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(928);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(929);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(930);
				tableIdentifier();
				setState(932);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(931);
					partitionSpec();
					}
				}

				setState(934);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(935);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(937);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(938);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(939);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(940);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(941);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(942);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(943);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SparkScriptTemplateParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkScriptTemplateParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkScriptTemplateParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkScriptTemplateParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(CREATE);
			setState(948);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(947);
				match(TEMPORARY);
				}
			}

			setState(951);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(950);
				match(EXTERNAL);
				}
			}

			setState(953);
			match(TABLE);
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(954);
				match(IF);
				setState(955);
				match(NOT);
				setState(956);
				match(EXISTS);
				}
				break;
			}
			setState(959);
			tableIdentifier();
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

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SparkScriptTemplateParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkScriptTemplateParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkScriptTemplateParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SparkScriptTemplateParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkScriptTemplateParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkScriptTemplateParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SparkScriptTemplateParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(CLUSTERED);
			setState(962);
			match(BY);
			setState(963);
			identifierList();
			setState(967);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(964);
				match(SORTED);
				setState(965);
				match(BY);
				setState(966);
				orderedIdentifierList();
				}
			}

			setState(969);
			match(INTO);
			setState(970);
			match(INTEGER_VALUE);
			setState(971);
			match(BUCKETS);
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

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SparkScriptTemplateParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SparkScriptTemplateParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SparkScriptTemplateParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SparkScriptTemplateParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkScriptTemplateParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(SKEWED);
			setState(974);
			match(BY);
			setState(975);
			identifierList();
			setState(976);
			match(ON);
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(977);
				constantList();
				}
				break;
			case 2:
				{
				setState(978);
				nestedConstantList();
				}
				break;
			}
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(981);
				match(STORED);
				setState(982);
				match(AS);
				setState(983);
				match(DIRECTORIES);
				}
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

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SparkScriptTemplateParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(LOCATION);
			setState(987);
			match(STRING);
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

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(989);
				ctes();
				}
			}

			setState(992);
			queryNoWith();
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

	public static class InsertIntoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SparkScriptTemplateParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkScriptTemplateParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkScriptTemplateParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public TerminalNode INTO() { return getToken(SparkScriptTemplateParser.INTO, 0); }
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insertInto);
		int _la;
		try {
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				match(INSERT);
				setState(995);
				match(OVERWRITE);
				setState(996);
				match(TABLE);
				setState(997);
				tableIdentifier();
				setState(1004);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(998);
					partitionSpec();
					setState(1002);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(999);
						match(IF);
						setState(1000);
						match(NOT);
						setState(1001);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				match(INSERT);
				setState(1007);
				match(INTO);
				setState(1009);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1008);
					match(TABLE);
					}
					break;
				}
				setState(1011);
				tableIdentifier();
				setState(1013);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1012);
					partitionSpec();
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

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			partitionSpec();
			setState(1019);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1018);
				locationSpec();
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

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SparkScriptTemplateParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(PARTITION);
			setState(1022);
			match(T__1);
			setState(1023);
			partitionVal();
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1024);
				match(T__3);
				setState(1025);
				partitionVal();
				}
				}
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1031);
			match(T__2);
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

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkScriptTemplateParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			identifier();
			setState(1036);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1034);
				match(EQ);
				setState(1035);
				constant();
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

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_describeFuncName);
		try {
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1040);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1041);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1042);
				predicateOperator();
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

	public static class DescribeColNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SparkScriptTemplateParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkScriptTemplateParser.STRING, i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_describeColName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			identifier();
			setState(1053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1046);
					match(T__4);
					setState(1049);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IF:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case USING:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(1047);
						identifier();
						}
						break;
					case STRING:
						{
						setState(1048);
						match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SparkScriptTemplateParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(WITH);
			setState(1057);
			namedQuery();
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1058);
				match(T__3);
				setState(1059);
				namedQuery();
				}
				}
				setState(1064);
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1067);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1066);
				match(AS);
				}
			}

			setState(1069);
			match(T__1);
			setState(1070);
			queryNoWith();
			setState(1071);
			match(T__2);
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

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SparkScriptTemplateParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(USING);
			setState(1074);
			qualifiedName();
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

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(T__1);
			setState(1077);
			tableProperty();
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1078);
				match(T__3);
				setState(1079);
				tableProperty();
				}
				}
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1085);
			match(T__2);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkScriptTemplateParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1092);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (STRING - 221)) | (1L << (INTEGER_VALUE - 221)) | (1L << (DECIMAL_VALUE - 221)))) != 0)) {
				{
				setState(1089);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1088);
					match(EQ);
					}
				}

				setState(1091);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
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

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1103);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				identifier();
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1095);
					match(T__4);
					setState(1096);
					identifier();
					}
					}
					setState(1101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				match(STRING);
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

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkScriptTemplateParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkScriptTemplateParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tablePropertyValue);
		try {
			setState(1109);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1107);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1108);
				match(STRING);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(T__1);
			setState(1112);
			constant();
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1113);
				match(T__3);
				setState(1114);
				constant();
				}
				}
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1120);
			match(T__2);
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

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			match(T__1);
			setState(1123);
			constantList();
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1124);
				match(T__3);
				setState(1125);
				constantList();
				}
				}
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1131);
			match(T__2);
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

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SparkScriptTemplateParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SparkScriptTemplateParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_createFileFormat);
		try {
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1133);
				match(STORED);
				setState(1134);
				match(AS);
				setState(1135);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				match(STORED);
				setState(1137);
				match(BY);
				setState(1138);
				storageHandler();
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

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SparkScriptTemplateParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkScriptTemplateParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkScriptTemplateParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkScriptTemplateParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fileFormat);
		try {
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1141);
				match(INPUTFORMAT);
				setState(1142);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1143);
				match(OUTPUTFORMAT);
				setState(1144);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				identifier();
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

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkScriptTemplateParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkScriptTemplateParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(STRING);
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1149);
				match(WITH);
				setState(1150);
				match(SERDEPROPERTIES);
				setState(1151);
				tablePropertyList();
				}
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

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			identifier();
			setState(1155);
			match(STRING);
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

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_queryNoWith);
		int _la;
		try {
			setState(1169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1158);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1157);
					insertInto();
					}
				}

				setState(1160);
				queryTerm(0);
				setState(1161);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
				fromClause();
				setState(1165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1164);
					multiInsertQueryBody();
					}
					}
					setState(1167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SparkScriptTemplateParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkScriptTemplateParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkScriptTemplateParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SparkScriptTemplateParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkScriptTemplateParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SparkScriptTemplateParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SparkScriptTemplateParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1171);
				match(ORDER);
				setState(1172);
				match(BY);
				setState(1173);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1174);
					match(T__3);
					setState(1175);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1193);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1183);
				match(CLUSTER);
				setState(1184);
				match(BY);
				setState(1185);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1186);
					match(T__3);
					setState(1187);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1205);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1195);
				match(DISTRIBUTE);
				setState(1196);
				match(BY);
				setState(1197);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1198);
					match(T__3);
					setState(1199);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1217);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1207);
				match(SORT);
				setState(1208);
				match(BY);
				setState(1209);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1210);
					match(T__3);
					setState(1211);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1220);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1219);
				windows();
				}
			}

			setState(1224);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1222);
				match(LIMIT);
				setState(1223);
				((QueryOrganizationContext)_localctx).limit = expression();
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

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1226);
				insertInto();
				}
			}

			setState(1229);
			querySpecification();
			setState(1230);
			queryOrganization();
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SparkScriptTemplateParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SparkScriptTemplateParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkScriptTemplateParser.EXCEPT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1233);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(1235);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1236);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (UNION - 93)) | (1L << (EXCEPT - 93)) | (1L << (INTERSECT - 93)))) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1238);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1237);
						setQuantifier();
						}
					}

					setState(1240);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(1245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SparkScriptTemplateParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_queryPrimary);
		try {
			setState(1254);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1247);
				match(TABLE);
				setState(1248);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1249);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1250);
				match(T__1);
				setState(1251);
				queryNoWith();
				setState(1252);
				match(T__2);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SparkScriptTemplateParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkScriptTemplateParser.DESC, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			expression();
			setState(1258);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1257);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(SparkScriptTemplateParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkScriptTemplateParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkScriptTemplateParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(SparkScriptTemplateParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkScriptTemplateParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SparkScriptTemplateParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(SparkScriptTemplateParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(SparkScriptTemplateParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SparkScriptTemplateParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SparkScriptTemplateParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SparkScriptTemplateParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1270);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1260);
					match(SELECT);
					setState(1261);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1262);
					match(T__1);
					setState(1263);
					namedExpressionSeq();
					setState(1264);
					match(T__2);
					}
					break;
				case MAP:
					{
					setState(1266);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1267);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1268);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1269);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1273);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1272);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1277);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1275);
					match(RECORDWRITER);
					setState(1276);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1279);
				match(USING);
				setState(1280);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1281);
					match(AS);
					setState(1291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1:
						{
						setState(1282);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1283);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1284);
						match(T__1);
						setState(1287);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
						case 1:
							{
							setState(1285);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1286);
							colTypeList();
							}
							break;
						}
						setState(1289);
						match(T__2);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1295);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1298);
					match(RECORDREADER);
					setState(1299);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1302);
					fromClause();
					}
					break;
				}
				setState(1307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1305);
					match(WHERE);
					setState(1306);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1325);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1309);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						setState(1310);
						setQuantifier();
						}
						break;
					}
					setState(1313);
					namedExpressionSeq();
					setState(1315);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
					case 1:
						{
						setState(1314);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1317);
					fromClause();
					setState(1323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
					case 1:
						{
						setState(1318);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1320);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
						case 1:
							{
							setState(1319);
							setQuantifier();
							}
							break;
						}
						setState(1322);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1327);
						lateralView();
						}
						} 
					}
					setState(1332);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				setState(1335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1333);
					match(WHERE);
					setState(1334);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1337);
					aggregation();
					}
					break;
				}
				setState(1342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1340);
					match(HAVING);
					setState(1341);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1344);
					windows();
					}
					break;
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SparkScriptTemplateParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			match(FROM);
			setState(1350);
			relation(0);
			setState(1355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1351);
					match(T__3);
					setState(1352);
					relation(0);
					}
					} 
				}
				setState(1357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			setState(1361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1358);
					lateralView();
					}
					} 
				}
				setState(1363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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

	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SparkScriptTemplateParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SparkScriptTemplateParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SparkScriptTemplateParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SparkScriptTemplateParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SparkScriptTemplateParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SparkScriptTemplateParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SparkScriptTemplateParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_aggregation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			match(GROUP);
			setState(1365);
			match(BY);
			setState(1366);
			((AggregationContext)_localctx).expression = expression();
			((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
			setState(1371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1367);
					match(T__3);
					setState(1368);
					((AggregationContext)_localctx).expression = expression();
					((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
					}
					} 
				}
				setState(1373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1374);
				match(WITH);
				setState(1375);
				((AggregationContext)_localctx).kind = match(ROLLUP);
				}
				break;
			case 2:
				{
				setState(1376);
				match(WITH);
				setState(1377);
				((AggregationContext)_localctx).kind = match(CUBE);
				}
				break;
			case 3:
				{
				setState(1378);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1379);
				match(SETS);
				setState(1380);
				match(T__1);
				setState(1381);
				groupingSet();
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1382);
					match(T__3);
					setState(1383);
					groupingSet();
					}
					}
					setState(1388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1389);
				match(T__2);
				}
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_groupingSet);
		int _la;
		try {
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393);
				match(T__1);
				setState(1402);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION) | (1L << RANGE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (ASTERISK - 64)) | (1L << (DIV - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (USING - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)) | (1L << (EXCHANGE - 128)) | (1L << (ARCHIVE - 128)) | (1L << (UNARCHIVE - 128)) | (1L << (FILEFORMAT - 128)) | (1L << (TOUCH - 128)) | (1L << (COMPACT - 128)) | (1L << (CONCATENATE - 128)) | (1L << (CHANGE - 128)) | (1L << (CASCADE - 128)) | (1L << (RESTRICT - 128)) | (1L << (CLUSTERED - 128)) | (1L << (SORTED - 128)) | (1L << (PURGE - 128)) | (1L << (INPUTFORMAT - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (DFS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (SCIENTIFIC_DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1394);
					expression();
					setState(1399);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1395);
						match(T__3);
						setState(1396);
						expression();
						}
						}
						setState(1401);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1404);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1405);
				expression();
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

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SparkScriptTemplateParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SparkScriptTemplateParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SparkScriptTemplateParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			match(LATERAL);
			setState(1409);
			match(VIEW);
			setState(1411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1410);
				match(OUTER);
				}
				break;
			}
			setState(1413);
			qualifiedName();
			setState(1414);
			match(T__1);
			setState(1423);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION) | (1L << RANGE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (ASTERISK - 64)) | (1L << (DIV - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (USING - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)) | (1L << (EXCHANGE - 128)) | (1L << (ARCHIVE - 128)) | (1L << (UNARCHIVE - 128)) | (1L << (FILEFORMAT - 128)) | (1L << (TOUCH - 128)) | (1L << (COMPACT - 128)) | (1L << (CONCATENATE - 128)) | (1L << (CHANGE - 128)) | (1L << (CASCADE - 128)) | (1L << (RESTRICT - 128)) | (1L << (CLUSTERED - 128)) | (1L << (SORTED - 128)) | (1L << (PURGE - 128)) | (1L << (INPUTFORMAT - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (DFS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (SCIENTIFIC_DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1415);
				expression();
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1416);
					match(T__3);
					setState(1417);
					expression();
					}
					}
					setState(1422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1425);
			match(T__2);
			setState(1426);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1427);
					match(AS);
					}
					break;
				}
				setState(1430);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1431);
						match(T__3);
						setState(1432);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1437);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				}
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SparkScriptTemplateParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SparkScriptTemplateParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public RelationContext right;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(SparkScriptTemplateParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(SparkScriptTemplateParser.NATURAL, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode CROSS() { return getToken(SparkScriptTemplateParser.CROSS, 0); }
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1443);
			relationPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(1445);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1460);
					switch (_input.LA(1)) {
					case JOIN:
					case CROSS:
					case INNER:
					case LEFT:
					case RIGHT:
					case FULL:
					case ANTI:
						{
						setState(1448);
						switch (_input.LA(1)) {
						case CROSS:
							{
							setState(1446);
							match(CROSS);
							}
							break;
						case JOIN:
						case INNER:
						case LEFT:
						case RIGHT:
						case FULL:
						case ANTI:
							{
							setState(1447);
							joinType();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1450);
						match(JOIN);
						setState(1451);
						((JoinRelationContext)_localctx).right = relation(0);
						setState(1453);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
						case 1:
							{
							setState(1452);
							joinCriteria();
							}
							break;
						}
						}
						break;
					case NATURAL:
						{
						setState(1455);
						match(NATURAL);
						setState(1456);
						joinType();
						setState(1457);
						match(JOIN);
						setState(1458);
						((JoinRelationContext)_localctx).right = relation(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SparkScriptTemplateParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SparkScriptTemplateParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SparkScriptTemplateParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SparkScriptTemplateParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SparkScriptTemplateParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SparkScriptTemplateParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SparkScriptTemplateParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_joinType);
		int _la;
		try {
			setState(1488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1468);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1467);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				match(LEFT);
				setState(1472);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1471);
					match(OUTER);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1474);
				match(LEFT);
				setState(1475);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1476);
				match(RIGHT);
				setState(1478);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1477);
					match(OUTER);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1480);
				match(FULL);
				setState(1482);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1481);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1485);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1484);
					match(LEFT);
					}
				}

				setState(1487);
				match(ANTI);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SparkScriptTemplateParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SparkScriptTemplateParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_joinCriteria);
		int _la;
		try {
			setState(1504);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1490);
				match(ON);
				setState(1491);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1492);
				match(USING);
				setState(1493);
				match(T__1);
				setState(1494);
				identifier();
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1495);
					match(T__3);
					setState(1496);
					identifier();
					}
					}
					setState(1501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1502);
				match(T__2);
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

	public static class SampleContext extends ParserRuleContext {
		public Token percentage;
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode TABLESAMPLE() { return getToken(SparkScriptTemplateParser.TABLESAMPLE, 0); }
		public TerminalNode BYTELENGTH_LITERAL() { return getToken(SparkScriptTemplateParser.BYTELENGTH_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OUT() { return getToken(SparkScriptTemplateParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SparkScriptTemplateParser.OF, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SparkScriptTemplateParser.PERCENTLIT, 0); }
		public TerminalNode ROWS() { return getToken(SparkScriptTemplateParser.ROWS, 0); }
		public TerminalNode BUCKET() { return getToken(SparkScriptTemplateParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkScriptTemplateParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkScriptTemplateParser.INTEGER_VALUE, i);
		}
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkScriptTemplateParser.DECIMAL_VALUE, 0); }
		public TerminalNode ON() { return getToken(SparkScriptTemplateParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			match(TABLESAMPLE);
			setState(1507);
			match(T__1);
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				{
				setState(1508);
				((SampleContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1509);
				((SampleContext)_localctx).sampleType = match(PERCENTLIT);
				}
				}
				break;
			case 2:
				{
				{
				setState(1510);
				expression();
				setState(1511);
				((SampleContext)_localctx).sampleType = match(ROWS);
				}
				}
				break;
			case 3:
				{
				setState(1513);
				((SampleContext)_localctx).sampleType = match(BYTELENGTH_LITERAL);
				}
				break;
			case 4:
				{
				{
				setState(1514);
				((SampleContext)_localctx).sampleType = match(BUCKET);
				setState(1515);
				((SampleContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1516);
				match(OUT);
				setState(1517);
				match(OF);
				setState(1518);
				((SampleContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1527);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1519);
					match(ON);
					setState(1525);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
					case 1:
						{
						setState(1520);
						identifier();
						}
						break;
					case 2:
						{
						setState(1521);
						qualifiedName();
						setState(1522);
						match(T__1);
						setState(1523);
						match(T__2);
						}
						break;
					}
					}
				}

				}
				}
				break;
			}
			setState(1531);
			match(T__2);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(T__1);
			setState(1534);
			identifierSeq();
			setState(1535);
			match(T__2);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			identifier();
			setState(1542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1538);
					match(T__3);
					setState(1539);
					identifier();
					}
					} 
				}
				setState(1544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			match(T__1);
			setState(1546);
			orderedIdentifier();
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1547);
				match(T__3);
				setState(1548);
				orderedIdentifier();
				}
				}
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1554);
			match(T__2);
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

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SparkScriptTemplateParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkScriptTemplateParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			identifier();
			setState(1558);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1557);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
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

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			match(T__1);
			setState(1561);
			identifierComment();
			setState(1566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1562);
				match(T__3);
				setState(1563);
				identifierComment();
				}
				}
				setState(1568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1569);
			match(T__2);
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

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkScriptTemplateParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			identifier();
			setState(1574);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1572);
				match(COMMENT);
				setState(1573);
				match(STRING);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_relationPrimary);
		try {
			setState(1611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1576);
				tableIdentifier();
				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1577);
					sample();
					}
					break;
				}
				setState(1584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1581);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
					case 1:
						{
						setState(1580);
						match(AS);
						}
						break;
					}
					setState(1583);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
				match(T__1);
				setState(1587);
				queryNoWith();
				setState(1588);
				match(T__2);
				setState(1590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1589);
					sample();
					}
					break;
				}
				setState(1596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1593);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
					case 1:
						{
						setState(1592);
						match(AS);
						}
						break;
					}
					setState(1595);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1598);
				match(T__1);
				setState(1599);
				relation(0);
				setState(1600);
				match(T__2);
				setState(1602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1601);
					sample();
					}
					break;
				}
				setState(1608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1605);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
					case 1:
						{
						setState(1604);
						match(AS);
						}
						break;
					}
					setState(1607);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1610);
				inlineTable();
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SparkScriptTemplateParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			match(VALUES);
			setState(1614);
			expression();
			setState(1619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1615);
					match(T__3);
					setState(1616);
					expression();
					}
					} 
				}
				setState(1621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			setState(1629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1622);
					match(AS);
					}
					break;
				}
				setState(1625);
				identifier();
				setState(1627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1626);
					identifierList();
					}
					break;
				}
				}
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

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SparkScriptTemplateParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkScriptTemplateParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SparkScriptTemplateParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkScriptTemplateParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkScriptTemplateParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SparkScriptTemplateParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkScriptTemplateParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkScriptTemplateParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SparkScriptTemplateParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SparkScriptTemplateParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SparkScriptTemplateParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkScriptTemplateParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkScriptTemplateParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SparkScriptTemplateParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SparkScriptTemplateParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SparkScriptTemplateParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SparkScriptTemplateParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SparkScriptTemplateParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SparkScriptTemplateParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SparkScriptTemplateParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkScriptTemplateParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkScriptTemplateParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SparkScriptTemplateParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_rowFormat);
		try {
			setState(1680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				match(ROW);
				setState(1632);
				match(FORMAT);
				setState(1633);
				match(SERDE);
				setState(1634);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1635);
					match(WITH);
					setState(1636);
					match(SERDEPROPERTIES);
					setState(1637);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1640);
				match(ROW);
				setState(1641);
				match(FORMAT);
				setState(1642);
				match(DELIMITED);
				setState(1652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1643);
					match(FIELDS);
					setState(1644);
					match(TERMINATED);
					setState(1645);
					match(BY);
					setState(1646);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1650);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						setState(1647);
						match(ESCAPED);
						setState(1648);
						match(BY);
						setState(1649);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1659);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1654);
					match(COLLECTION);
					setState(1655);
					match(ITEMS);
					setState(1656);
					match(TERMINATED);
					setState(1657);
					match(BY);
					setState(1658);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1661);
					match(MAP);
					setState(1662);
					match(KEYS);
					setState(1663);
					match(TERMINATED);
					setState(1664);
					match(BY);
					setState(1665);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1672);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1668);
					match(LINES);
					setState(1669);
					match(TERMINATED);
					setState(1670);
					match(BY);
					setState(1671);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1674);
					match(NULL);
					setState(1675);
					match(DEFINED);
					setState(1676);
					match(AS);
					setState(1677);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1682);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1683);
				match(T__4);
				}
				break;
			}
			setState(1687);
			((TableIdentifierContext)_localctx).table = identifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			expression();
			setState(1697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1690);
					match(AS);
					}
					break;
				}
				setState(1695);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IF:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case USING:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1693);
					identifier();
					}
					break;
				case T__1:
					{
					setState(1694);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			namedExpression();
			setState(1704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1700);
					match(T__3);
					setState(1701);
					namedExpression();
					}
					} 
				}
				setState(1706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SparkScriptTemplateParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SparkScriptTemplateParser.AND, 0); }
		public TerminalNode OR() { return getToken(SparkScriptTemplateParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1710);
				match(NOT);
				setState(1711);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1712);
				predicated();
				}
				break;
			case 3:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1713);
				match(EXISTS);
				setState(1714);
				match(T__1);
				setState(1715);
				query();
				setState(1716);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1728);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1726);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1720);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1721);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1722);
						((LogicalBinaryContext)_localctx).right = booleanExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1723);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1724);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1725);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					}
					} 
				}
				setState(1730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			valueExpression(0);
			setState(1733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1732);
				predicate();
				}
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

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public TerminalNode AND() { return getToken(SparkScriptTemplateParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkScriptTemplateParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SparkScriptTemplateParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SparkScriptTemplateParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SparkScriptTemplateParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SparkScriptTemplateParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SparkScriptTemplateParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SparkScriptTemplateParser.NULL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_predicate);
		int _la;
		try {
			setState(1776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1736);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1735);
					match(NOT);
					}
				}

				setState(1738);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1739);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1740);
				match(AND);
				setState(1741);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1744);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1743);
					match(NOT);
					}
				}

				setState(1746);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1747);
				match(T__1);
				setState(1748);
				expression();
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1749);
					match(T__3);
					setState(1750);
					expression();
					}
					}
					setState(1755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1756);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1759);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1758);
					match(NOT);
					}
				}

				setState(1761);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1762);
				match(T__1);
				setState(1763);
				query();
				setState(1764);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1767);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1766);
					match(NOT);
					}
				}

				setState(1769);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1770);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1771);
				match(IS);
				setState(1773);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1772);
					match(NOT);
					}
				}

				setState(1775);
				((PredicateContext)_localctx).kind = match(NULL);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SparkScriptTemplateParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkScriptTemplateParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkScriptTemplateParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkScriptTemplateParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SparkScriptTemplateParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkScriptTemplateParser.MINUS, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkScriptTemplateParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SparkScriptTemplateParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SparkScriptTemplateParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SparkScriptTemplateParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SparkScriptTemplateParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SparkScriptTemplateParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			switch (_input.LA(1)) {
			case T__1:
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IF:
			case ASTERISK:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case STRING:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case SCIENTIFIC_DECIMAL_VALUE:
			case DOUBLE_LITERAL:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1779);
				primaryExpression(0);
				}
				break;
			case PLUS:
			case MINUS:
			case TILDE:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1780);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (PLUS - 122)) | (1L << (MINUS - 122)) | (1L << (TILDE - 122)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1781);
				valueExpression(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1803);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1784);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1785);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (ASTERISK - 124)) | (1L << (SLASH - 124)) | (1L << (PERCENT - 124)) | (1L << (DIV - 124)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1786);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1787);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1788);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1789);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1790);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1791);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(1792);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1793);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1794);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(1795);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1796);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1797);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(1798);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1799);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1800);
						comparisonOperator();
						setState(1801);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkScriptTemplateParser.CASE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(SparkScriptTemplateParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparkScriptTemplateParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SparkScriptTemplateParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SparkScriptTemplateParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OVER() { return getToken(SparkScriptTemplateParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkScriptTemplateParser.CASE, 0); }
		public TerminalNode END() { return getToken(SparkScriptTemplateParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparkScriptTemplateParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1809);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1810);
				match(ASTERISK);
				}
				break;
			case 3:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1811);
				qualifiedName();
				setState(1812);
				match(T__4);
				setState(1813);
				match(ASTERISK);
				}
				break;
			case 4:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1815);
				match(T__1);
				setState(1816);
				expression();
				setState(1819); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1817);
					match(T__3);
					setState(1818);
					expression();
					}
					}
					setState(1821); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(1823);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1825);
				qualifiedName();
				setState(1826);
				match(T__1);
				setState(1838);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION) | (1L << RANGE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (ASTERISK - 64)) | (1L << (DIV - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (USING - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)) | (1L << (LOCATION - 128)) | (1L << (EXCHANGE - 128)) | (1L << (ARCHIVE - 128)) | (1L << (UNARCHIVE - 128)) | (1L << (FILEFORMAT - 128)) | (1L << (TOUCH - 128)) | (1L << (COMPACT - 128)) | (1L << (CONCATENATE - 128)) | (1L << (CHANGE - 128)) | (1L << (CASCADE - 128)) | (1L << (RESTRICT - 128)) | (1L << (CLUSTERED - 128)) | (1L << (SORTED - 128)) | (1L << (PURGE - 128)) | (1L << (INPUTFORMAT - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (DFS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (SCIENTIFIC_DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1828);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
					case 1:
						{
						setState(1827);
						setQuantifier();
						}
						break;
					}
					setState(1830);
					expression();
					setState(1835);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1831);
						match(T__3);
						setState(1832);
						expression();
						}
						}
						setState(1837);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1840);
				match(T__2);
				setState(1843);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(1841);
					match(OVER);
					setState(1842);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1845);
				match(T__1);
				setState(1846);
				query();
				setState(1847);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1849);
				match(CASE);
				setState(1850);
				valueExpression(0);
				setState(1852); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1851);
					whenClause();
					}
					}
					setState(1854); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1858);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1856);
					match(ELSE);
					setState(1857);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1860);
				match(END);
				}
				break;
			case 8:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1862);
				match(CASE);
				setState(1864); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1863);
					whenClause();
					}
					}
					setState(1866); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1870);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1868);
					match(ELSE);
					setState(1869);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1872);
				match(END);
				}
				break;
			case 9:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1874);
				match(CAST);
				setState(1875);
				match(T__1);
				setState(1876);
				expression();
				setState(1877);
				match(AS);
				setState(1878);
				dataType();
				setState(1879);
				match(T__2);
				}
				break;
			case 10:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1881);
				identifier();
				}
				break;
			case 11:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1882);
				match(T__1);
				setState(1883);
				expression();
				setState(1884);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1896);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1888);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1889);
						match(T__5);
						setState(1890);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1891);
						match(T__6);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1893);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1894);
						match(T__4);
						setState(1895);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SparkScriptTemplateParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SparkScriptTemplateParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkScriptTemplateParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constant);
		try {
			int _alt;
			setState(1913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1901);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1902);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1903);
				identifier();
				setState(1904);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1906);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1907);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1909); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1908);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1911); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SparkScriptTemplateParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SparkScriptTemplateParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SparkScriptTemplateParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SparkScriptTemplateParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SparkScriptTemplateParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SparkScriptTemplateParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SparkScriptTemplateParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SparkScriptTemplateParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			_la = _input.LA(1);
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (EQ - 114)) | (1L << (NSEQ - 114)) | (1L << (NEQ - 114)) | (1L << (NEQJ - 114)) | (1L << (LT - 114)) | (1L << (LTE - 114)) | (1L << (GT - 114)) | (1L << (GTE - 114)))) != 0)) ) {
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SparkScriptTemplateParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkScriptTemplateParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkScriptTemplateParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkScriptTemplateParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkScriptTemplateParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkScriptTemplateParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SparkScriptTemplateParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkScriptTemplateParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SparkScriptTemplateParser.PIPE, 0); }
		public TerminalNode HAT() { return getToken(SparkScriptTemplateParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			_la = _input.LA(1);
			if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (PLUS - 122)) | (1L << (MINUS - 122)) | (1L << (ASTERISK - 122)) | (1L << (SLASH - 122)) | (1L << (PERCENT - 122)) | (1L << (DIV - 122)) | (1L << (TILDE - 122)) | (1L << (AMPERSAND - 122)) | (1L << (PIPE - 122)) | (1L << (HAT - 122)))) != 0)) ) {
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SparkScriptTemplateParser.OR, 0); }
		public TerminalNode AND() { return getToken(SparkScriptTemplateParser.AND, 0); }
		public TerminalNode IN() { return getToken(SparkScriptTemplateParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SparkScriptTemplateParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SparkScriptTemplateParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SparkScriptTemplateParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SparkScriptTemplateParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			match(INTERVAL);
			setState(1927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1924);
					intervalField();
					}
					} 
				}
				setState(1929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(SparkScriptTemplateParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(1931);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(1934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(1932);
				match(TO);
				setState(1933);
				((IntervalFieldContext)_localctx).to = identifier();
				}
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkScriptTemplateParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkScriptTemplateParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SparkScriptTemplateParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkScriptTemplateParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_intervalValue);
		int _la;
		try {
			setState(1941);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1937);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1936);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1939);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1940);
				match(STRING);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(SparkScriptTemplateParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SparkScriptTemplateParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SparkScriptTemplateParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SparkScriptTemplateParser.NEQ, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkScriptTemplateParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkScriptTemplateParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_dataType);
		int _la;
		try {
			setState(1977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1943);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(1944);
				match(LT);
				setState(1945);
				dataType();
				setState(1946);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1948);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(1949);
				match(LT);
				setState(1950);
				dataType();
				setState(1951);
				match(T__3);
				setState(1952);
				dataType();
				setState(1953);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1955);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(1962);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(1956);
					match(LT);
					setState(1958);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION) | (1L << RANGE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)) | (1L << (DIV - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PERCENTLIT - 132)) | (1L << (BUCKET - 132)) | (1L << (OUT - 132)) | (1L << (OF - 132)) | (1L << (SORT - 132)) | (1L << (CLUSTER - 132)) | (1L << (DISTRIBUTE - 132)) | (1L << (OVERWRITE - 132)) | (1L << (TRANSFORM - 132)) | (1L << (REDUCE - 132)) | (1L << (USING - 132)) | (1L << (SERDE - 132)) | (1L << (SERDEPROPERTIES - 132)) | (1L << (RECORDREADER - 132)) | (1L << (RECORDWRITER - 132)) | (1L << (DELIMITED - 132)) | (1L << (FIELDS - 132)) | (1L << (TERMINATED - 132)) | (1L << (COLLECTION - 132)) | (1L << (ITEMS - 132)) | (1L << (KEYS - 132)) | (1L << (ESCAPED - 132)) | (1L << (LINES - 132)) | (1L << (SEPARATED - 132)) | (1L << (FUNCTION - 132)) | (1L << (EXTENDED - 132)) | (1L << (REFRESH - 132)) | (1L << (CLEAR - 132)) | (1L << (CACHE - 132)) | (1L << (UNCACHE - 132)) | (1L << (LAZY - 132)) | (1L << (FORMATTED - 132)) | (1L << (TEMPORARY - 132)) | (1L << (OPTIONS - 132)) | (1L << (UNSET - 132)) | (1L << (TBLPROPERTIES - 132)) | (1L << (DBPROPERTIES - 132)) | (1L << (BUCKETS - 132)) | (1L << (SKEWED - 132)) | (1L << (STORED - 132)) | (1L << (DIRECTORIES - 132)) | (1L << (LOCATION - 132)) | (1L << (EXCHANGE - 132)) | (1L << (ARCHIVE - 132)) | (1L << (UNARCHIVE - 132)) | (1L << (FILEFORMAT - 132)) | (1L << (TOUCH - 132)) | (1L << (COMPACT - 132)) | (1L << (CONCATENATE - 132)) | (1L << (CHANGE - 132)) | (1L << (CASCADE - 132)) | (1L << (RESTRICT - 132)) | (1L << (CLUSTERED - 132)) | (1L << (SORTED - 132)) | (1L << (PURGE - 132)) | (1L << (INPUTFORMAT - 132)) | (1L << (OUTPUTFORMAT - 132)) | (1L << (DATABASE - 132)) | (1L << (DATABASES - 132)) | (1L << (DFS - 132)) | (1L << (TRUNCATE - 132)) | (1L << (ANALYZE - 132)) | (1L << (COMPUTE - 132)) | (1L << (LIST - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (STATISTICS - 196)) | (1L << (PARTITIONED - 196)) | (1L << (EXTERNAL - 196)) | (1L << (DEFINED - 196)) | (1L << (REVOKE - 196)) | (1L << (GRANT - 196)) | (1L << (LOCK - 196)) | (1L << (UNLOCK - 196)) | (1L << (MSCK - 196)) | (1L << (REPAIR - 196)) | (1L << (EXPORT - 196)) | (1L << (IMPORT - 196)) | (1L << (LOAD - 196)) | (1L << (ROLE - 196)) | (1L << (ROLES - 196)) | (1L << (COMPACTIONS - 196)) | (1L << (PRINCIPALS - 196)) | (1L << (TRANSACTIONS - 196)) | (1L << (INDEX - 196)) | (1L << (INDEXES - 196)) | (1L << (LOCKS - 196)) | (1L << (OPTION - 196)) | (1L << (ANTI - 196)) | (1L << (LOCAL - 196)) | (1L << (INPATH - 196)) | (1L << (IDENTIFIER - 196)) | (1L << (BACKQUOTED_IDENTIFIER - 196)))) != 0)) {
						{
						setState(1957);
						colTypeList();
						}
					}

					setState(1960);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(1961);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1964);
				identifier();
				setState(1975);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(1965);
					match(T__1);
					setState(1966);
					match(INTEGER_VALUE);
					setState(1971);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1967);
						match(T__3);
						setState(1968);
						match(INTEGER_VALUE);
						}
						}
						setState(1973);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1974);
					match(T__2);
					}
					break;
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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			colType();
			setState(1984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1980);
					match(T__3);
					setState(1981);
					colType();
					}
					} 
				}
				setState(1986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
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

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkScriptTemplateParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkScriptTemplateParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_colType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			identifier();
			setState(1989);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(1988);
				match(T__7);
				}
			}

			setState(1991);
			dataType();
			setState(1994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(1992);
				match(COMMENT);
				setState(1993);
				match(STRING);
				}
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SparkScriptTemplateParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SparkScriptTemplateParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			match(WHEN);
			setState(1997);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1998);
			match(THEN);
			setState(1999);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SparkScriptTemplateParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitWindows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitWindows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			match(WINDOW);
			setState(2002);
			namedWindow();
			setState(2007);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2003);
					match(T__3);
					setState(2004);
					namedWindow();
					}
					} 
				}
				setState(2009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
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

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			identifier();
			setState(2011);
			match(AS);
			setState(2012);
			windowSpec();
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

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SparkScriptTemplateParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkScriptTemplateParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkScriptTemplateParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SparkScriptTemplateParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkScriptTemplateParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SparkScriptTemplateParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SparkScriptTemplateParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_windowSpec);
		int _la;
		try {
			setState(2056);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2014);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case T__1:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2015);
				match(T__1);
				setState(2050);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2016);
					match(CLUSTER);
					setState(2017);
					match(BY);
					setState(2018);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2023);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2019);
						match(T__3);
						setState(2020);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2025);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2036);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2026);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2027);
						match(BY);
						setState(2028);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2033);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2029);
							match(T__3);
							setState(2030);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2035);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2048);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2038);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2039);
						match(BY);
						setState(2040);
						sortItem();
						setState(2045);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2041);
							match(T__3);
							setState(2042);
							sortItem();
							}
							}
							setState(2047);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2053);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2052);
					windowFrame();
					}
				}

				setState(2055);
				match(T__2);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SparkScriptTemplateParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SparkScriptTemplateParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkScriptTemplateParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SparkScriptTemplateParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_windowFrame);
		try {
			setState(2074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2058);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2059);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2060);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2061);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2062);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2063);
				match(BETWEEN);
				setState(2064);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2065);
				match(AND);
				setState(2066);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2068);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2069);
				match(BETWEEN);
				setState(2070);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2071);
				match(AND);
				setState(2072);
				((WindowFrameContext)_localctx).end = frameBound();
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

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SparkScriptTemplateParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkScriptTemplateParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkScriptTemplateParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SparkScriptTemplateParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SparkScriptTemplateParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_frameBound);
		int _la;
		try {
			setState(2083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2076);
				match(UNBOUNDED);
				setState(2077);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2078);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2079);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2080);
				expression();
				setState(2081);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				} else {
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			identifier();
			setState(2090);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2086);
					match(T__4);
					setState(2087);
					identifier();
					}
					} 
				}
				setState(2092);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(SparkScriptTemplateParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(SparkScriptTemplateParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SparkScriptTemplateParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SparkScriptTemplateParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(SparkScriptTemplateParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SparkScriptTemplateParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(SparkScriptTemplateParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(SparkScriptTemplateParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SparkScriptTemplateParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(SparkScriptTemplateParser.ON, 0); }
		public TerminalNode UNION() { return getToken(SparkScriptTemplateParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(SparkScriptTemplateParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkScriptTemplateParser.EXCEPT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_identifier);
		try {
			setState(2107);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2093);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2094);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2095);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2096);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2097);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2098);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2099);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2100);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2101);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2102);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2103);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(2104);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(2105);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2106);
				match(EXCEPT);
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SparkScriptTemplateParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_strictIdentifier);
		try {
			setState(2112);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2109);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2110);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2111);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SparkScriptTemplateParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			match(BACKQUOTED_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkScriptTemplateParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SparkScriptTemplateParser.BIGINT_LITERAL, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SparkScriptTemplateParser.TINYINT_LITERAL, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SparkScriptTemplateParser.DOUBLE_LITERAL, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkScriptTemplateParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SparkScriptTemplateParser.SMALLINT_LITERAL, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScientificDecimalLiteralContext extends NumberContext {
		public TerminalNode SCIENTIFIC_DECIMAL_VALUE() { return getToken(SparkScriptTemplateParser.SCIENTIFIC_DECIMAL_VALUE, 0); }
		public ScientificDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterScientificDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitScientificDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitScientificDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_number);
		try {
			setState(2123);
			switch (_input.LA(1)) {
			case DECIMAL_VALUE:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2116);
				match(DECIMAL_VALUE);
				}
				break;
			case SCIENTIFIC_DECIMAL_VALUE:
				_localctx = new ScientificDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2117);
				match(SCIENTIFIC_DECIMAL_VALUE);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2118);
				match(INTEGER_VALUE);
				}
				break;
			case BIGINT_LITERAL:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2119);
				match(BIGINT_LITERAL);
				}
				break;
			case SMALLINT_LITERAL:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2120);
				match(SMALLINT_LITERAL);
				}
				break;
			case TINYINT_LITERAL:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2121);
				match(TINYINT_LITERAL);
				}
				break;
			case DOUBLE_LITERAL:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2122);
				match(DOUBLE_LITERAL);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SparkScriptTemplateParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SparkScriptTemplateParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkScriptTemplateParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SparkScriptTemplateParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkScriptTemplateParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkScriptTemplateParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(SparkScriptTemplateParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(SparkScriptTemplateParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(SparkScriptTemplateParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SparkScriptTemplateParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SparkScriptTemplateParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SparkScriptTemplateParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkScriptTemplateParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkScriptTemplateParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SparkScriptTemplateParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SparkScriptTemplateParser.ROW, 0); }
		public TerminalNode MAP() { return getToken(SparkScriptTemplateParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SparkScriptTemplateParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(SparkScriptTemplateParser.STRUCT, 0); }
		public TerminalNode LATERAL() { return getToken(SparkScriptTemplateParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(SparkScriptTemplateParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(SparkScriptTemplateParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(SparkScriptTemplateParser.TRANSFORM, 0); }
		public TerminalNode USING() { return getToken(SparkScriptTemplateParser.USING, 0); }
		public TerminalNode SERDE() { return getToken(SparkScriptTemplateParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkScriptTemplateParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkScriptTemplateParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkScriptTemplateParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SparkScriptTemplateParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(SparkScriptTemplateParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(SparkScriptTemplateParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SparkScriptTemplateParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SparkScriptTemplateParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(SparkScriptTemplateParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(SparkScriptTemplateParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(SparkScriptTemplateParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkScriptTemplateParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(SparkScriptTemplateParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(SparkScriptTemplateParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SparkScriptTemplateParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(SparkScriptTemplateParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(SparkScriptTemplateParser.LAZY, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkScriptTemplateParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkScriptTemplateParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(SparkScriptTemplateParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(SparkScriptTemplateParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(SparkScriptTemplateParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(SparkScriptTemplateParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(SparkScriptTemplateParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(SparkScriptTemplateParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkScriptTemplateParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkScriptTemplateParser.CODEGEN, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SparkScriptTemplateParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(SparkScriptTemplateParser.USE, 0); }
		public List<TerminalNode> TO() { return getTokens(SparkScriptTemplateParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(SparkScriptTemplateParser.TO, i);
		}
		public TerminalNode BUCKET() { return getToken(SparkScriptTemplateParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SparkScriptTemplateParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(SparkScriptTemplateParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SparkScriptTemplateParser.OF, 0); }
		public TerminalNode SET() { return getToken(SparkScriptTemplateParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SparkScriptTemplateParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SparkScriptTemplateParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SparkScriptTemplateParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SparkScriptTemplateParser.IF, 0); }
		public TerminalNode NO() { return getToken(SparkScriptTemplateParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SparkScriptTemplateParser.DATA, 0); }
		public TerminalNode START() { return getToken(SparkScriptTemplateParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkScriptTemplateParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SparkScriptTemplateParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkScriptTemplateParser.ROLLBACK, 0); }
		public TerminalNode SORT() { return getToken(SparkScriptTemplateParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(SparkScriptTemplateParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkScriptTemplateParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(SparkScriptTemplateParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkScriptTemplateParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(SparkScriptTemplateParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SparkScriptTemplateParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkScriptTemplateParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(SparkScriptTemplateParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkScriptTemplateParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkScriptTemplateParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkScriptTemplateParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkScriptTemplateParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(SparkScriptTemplateParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SparkScriptTemplateParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(SparkScriptTemplateParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(SparkScriptTemplateParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(SparkScriptTemplateParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkScriptTemplateParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkScriptTemplateParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkScriptTemplateParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(SparkScriptTemplateParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(SparkScriptTemplateParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SparkScriptTemplateParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkScriptTemplateParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkScriptTemplateParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(SparkScriptTemplateParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(SparkScriptTemplateParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(SparkScriptTemplateParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(SparkScriptTemplateParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkScriptTemplateParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(SparkScriptTemplateParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkScriptTemplateParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkScriptTemplateParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(SparkScriptTemplateParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkScriptTemplateParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(SparkScriptTemplateParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(SparkScriptTemplateParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(SparkScriptTemplateParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkScriptTemplateParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(SparkScriptTemplateParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SparkScriptTemplateParser.REPAIR, 0); }
		public TerminalNode EXPORT() { return getToken(SparkScriptTemplateParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(SparkScriptTemplateParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(SparkScriptTemplateParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(SparkScriptTemplateParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(SparkScriptTemplateParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(SparkScriptTemplateParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SparkScriptTemplateParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkScriptTemplateParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkScriptTemplateParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkScriptTemplateParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(SparkScriptTemplateParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SparkScriptTemplateParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SparkScriptTemplateParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(SparkScriptTemplateParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(SparkScriptTemplateParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(SparkScriptTemplateParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(SparkScriptTemplateParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkScriptTemplateParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(SparkScriptTemplateParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(SparkScriptTemplateParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(SparkScriptTemplateParser.SETS, 0); }
		public TerminalNode AT() { return getToken(SparkScriptTemplateParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(SparkScriptTemplateParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkScriptTemplateParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(SparkScriptTemplateParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SparkScriptTemplateParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(SparkScriptTemplateParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkScriptTemplateParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SparkScriptTemplateParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(SparkScriptTemplateParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(SparkScriptTemplateParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkScriptTemplateParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(SparkScriptTemplateParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(SparkScriptTemplateParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(SparkScriptTemplateParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(SparkScriptTemplateParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(SparkScriptTemplateParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(SparkScriptTemplateParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SparkScriptTemplateParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SparkScriptTemplateParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SparkScriptTemplateParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(SparkScriptTemplateParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(SparkScriptTemplateParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(SparkScriptTemplateParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(SparkScriptTemplateParser.OUTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(SparkScriptTemplateParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(SparkScriptTemplateParser.TABLE, i);
		}
		public TerminalNode TRUE() { return getToken(SparkScriptTemplateParser.TRUE, 0); }
		public List<TerminalNode> WITH() { return getTokens(SparkScriptTemplateParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SparkScriptTemplateParser.WITH, i);
		}
		public TerminalNode RLIKE() { return getToken(SparkScriptTemplateParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(SparkScriptTemplateParser.AND, 0); }
		public TerminalNode CASE() { return getToken(SparkScriptTemplateParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SparkScriptTemplateParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkScriptTemplateParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(SparkScriptTemplateParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(SparkScriptTemplateParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SparkScriptTemplateParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkScriptTemplateParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(SparkScriptTemplateParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(SparkScriptTemplateParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(SparkScriptTemplateParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(SparkScriptTemplateParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(SparkScriptTemplateParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SparkScriptTemplateParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(SparkScriptTemplateParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(SparkScriptTemplateParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(SparkScriptTemplateParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SparkScriptTemplateParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SparkScriptTemplateParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(SparkScriptTemplateParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(SparkScriptTemplateParser.NOT, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkScriptTemplateListener ) ((SparkScriptTemplateListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkScriptTemplateVisitor ) return ((SparkScriptTemplateVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION) | (1L << RANGE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)) | (1L << (DIV - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PERCENTLIT - 132)) | (1L << (BUCKET - 132)) | (1L << (OUT - 132)) | (1L << (OF - 132)) | (1L << (SORT - 132)) | (1L << (CLUSTER - 132)) | (1L << (DISTRIBUTE - 132)) | (1L << (OVERWRITE - 132)) | (1L << (TRANSFORM - 132)) | (1L << (REDUCE - 132)) | (1L << (USING - 132)) | (1L << (SERDE - 132)) | (1L << (SERDEPROPERTIES - 132)) | (1L << (RECORDREADER - 132)) | (1L << (RECORDWRITER - 132)) | (1L << (DELIMITED - 132)) | (1L << (FIELDS - 132)) | (1L << (TERMINATED - 132)) | (1L << (COLLECTION - 132)) | (1L << (ITEMS - 132)) | (1L << (KEYS - 132)) | (1L << (ESCAPED - 132)) | (1L << (LINES - 132)) | (1L << (SEPARATED - 132)) | (1L << (FUNCTION - 132)) | (1L << (EXTENDED - 132)) | (1L << (REFRESH - 132)) | (1L << (CLEAR - 132)) | (1L << (CACHE - 132)) | (1L << (UNCACHE - 132)) | (1L << (LAZY - 132)) | (1L << (FORMATTED - 132)) | (1L << (TEMPORARY - 132)) | (1L << (OPTIONS - 132)) | (1L << (UNSET - 132)) | (1L << (TBLPROPERTIES - 132)) | (1L << (DBPROPERTIES - 132)) | (1L << (BUCKETS - 132)) | (1L << (SKEWED - 132)) | (1L << (STORED - 132)) | (1L << (DIRECTORIES - 132)) | (1L << (LOCATION - 132)) | (1L << (EXCHANGE - 132)) | (1L << (ARCHIVE - 132)) | (1L << (UNARCHIVE - 132)) | (1L << (FILEFORMAT - 132)) | (1L << (TOUCH - 132)) | (1L << (COMPACT - 132)) | (1L << (CONCATENATE - 132)) | (1L << (CHANGE - 132)) | (1L << (CASCADE - 132)) | (1L << (RESTRICT - 132)) | (1L << (CLUSTERED - 132)) | (1L << (SORTED - 132)) | (1L << (PURGE - 132)) | (1L << (INPUTFORMAT - 132)) | (1L << (OUTPUTFORMAT - 132)) | (1L << (DATABASE - 132)) | (1L << (DATABASES - 132)) | (1L << (DFS - 132)) | (1L << (TRUNCATE - 132)) | (1L << (ANALYZE - 132)) | (1L << (COMPUTE - 132)) | (1L << (LIST - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (STATISTICS - 196)) | (1L << (PARTITIONED - 196)) | (1L << (EXTERNAL - 196)) | (1L << (DEFINED - 196)) | (1L << (REVOKE - 196)) | (1L << (GRANT - 196)) | (1L << (LOCK - 196)) | (1L << (UNLOCK - 196)) | (1L << (MSCK - 196)) | (1L << (REPAIR - 196)) | (1L << (EXPORT - 196)) | (1L << (IMPORT - 196)) | (1L << (LOAD - 196)) | (1L << (ROLE - 196)) | (1L << (ROLES - 196)) | (1L << (COMPACTIONS - 196)) | (1L << (PRINCIPALS - 196)) | (1L << (TRANSACTIONS - 196)) | (1L << (INDEX - 196)) | (1L << (INDEXES - 196)) | (1L << (LOCKS - 196)) | (1L << (OPTION - 196)) | (1L << (LOCAL - 196)) | (1L << (INPATH - 196)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 42:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 59:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 62:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 63:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00ee\u0852\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\7\2\u00b2\n\2\f\2\16\2\u00b5\13\2\3\2\7\2"+
		"\u00b8\n\2\f\2\16\2\u00bb\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d0\n\6\3\6\3\6\3\6\5\6\u00d5"+
		"\n\6\3\6\5\6\u00d8\n\6\3\6\3\6\3\6\5\6\u00dd\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ea\n\6\3\6\3\6\5\6\u00ee\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00f5\n\6\3\6\3\6\3\6\5\6\u00fa\n\6\3\6\3\6\3\6\5\6\u00ff"+
		"\n\6\3\6\5\6\u0102\n\6\3\6\3\6\3\6\3\6\5\6\u0108\n\6\3\6\3\6\3\6\5\6\u010d"+
		"\n\6\3\6\5\6\u0110\n\6\3\6\5\6\u0113\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u011c\n\6\3\6\3\6\5\6\u0120\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0128\n"+
		"\6\3\6\5\6\u012b\n\6\3\6\5\6\u012e\n\6\3\6\5\6\u0131\n\6\3\6\5\6\u0134"+
		"\n\6\3\6\5\6\u0137\n\6\3\6\3\6\5\6\u013b\n\6\3\6\5\6\u013e\n\6\3\6\5\6"+
		"\u0141\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0148\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0152\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u015a\n\6\5\6\u015c\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0173\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u017b\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u0183\n\6\3\6\3\6\3\6\3\6\5\6\u0189\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0196\n\6\3\6\6\6\u0199\n"+
		"\6\r\6\16\6\u019a\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01a4\n\6\3\6\6\6\u01a7"+
		"\n\6\r\6\16\6\u01a8\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u01b9\n\6\3\6\3\6\3\6\7\6\u01be\n\6\f\6\16\6\u01c1\13\6\3\6"+
		"\5\6\u01c4\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01cc\n\6\3\6\3\6\3\6\7\6\u01d1"+
		"\n\6\f\6\16\6\u01d4\13\6\3\6\3\6\3\6\3\6\5\6\u01da\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u01e3\n\6\3\6\3\6\5\6\u01e7\n\6\3\6\3\6\3\6\3\6\5\6\u01ed"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u01f3\n\6\3\6\5\6\u01f6\n\6\3\6\3\6\3\6\3\6\5"+
		"\6\u01fc\n\6\3\6\3\6\5\6\u0200\n\6\3\6\3\6\5\6\u0204\n\6\3\6\3\6\3\6\5"+
		"\6\u0209\n\6\3\6\3\6\5\6\u020d\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0215\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u021e\n\6\3\6\3\6\3\6\5\6\u0223\n\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0229\n\6\3\6\3\6\3\6\3\6\5\6\u022f\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u0239\n\6\f\6\16\6\u023c\13\6\5\6\u023e\n\6"+
		"\3\6\3\6\5\6\u0242\n\6\3\6\3\6\3\6\5\6\u0247\n\6\3\6\3\6\3\6\5\6\u024c"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0253\n\6\3\6\5\6\u0256\n\6\3\6\5\6\u0259"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u025f\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0268"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0270\n\6\3\6\3\6\3\6\3\6\5\6\u0276\n"+
		"\6\3\6\3\6\5\6\u027a\n\6\3\6\3\6\5\6\u027e\n\6\3\6\3\6\5\6\u0282\n\6\5"+
		"\6\u0284\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u028d\n\6\3\6\3\6\3\6\3\6"+
		"\5\6\u0293\n\6\3\6\3\6\3\6\5\6\u0298\n\6\3\6\3\6\5\6\u029c\n\6\3\6\5\6"+
		"\u029f\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u02a6\n\6\f\6\16\6\u02a9\13\6\3\6\3"+
		"\6\5\6\u02ad\n\6\3\6\3\6\3\6\5\6\u02b2\n\6\3\6\5\6\u02b5\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u02bf\n\6\3\6\3\6\3\6\5\6\u02c4\n\6\3\6\3\6"+
		"\3\6\3\6\5\6\u02ca\n\6\3\6\3\6\3\6\3\6\5\6\u02d0\n\6\3\6\3\6\3\6\7\6\u02d5"+
		"\n\6\f\6\16\6\u02d8\13\6\3\6\3\6\3\6\7\6\u02dd\n\6\f\6\16\6\u02e0\13\6"+
		"\3\6\3\6\7\6\u02e4\n\6\f\6\16\6\u02e7\13\6\3\6\3\6\3\6\7\6\u02ec\n\6\f"+
		"\6\16\6\u02ef\13\6\5\6\u02f1\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u02f9\n\7"+
		"\3\7\3\7\5\7\u02fd\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0304\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u037b\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u0383\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u038b\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u0394\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u039d\n\7\3"+
		"\7\3\7\5\7\u03a1\n\7\3\7\3\7\3\7\3\7\5\7\u03a7\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u03b3\n\7\3\b\3\b\5\b\u03b7\n\b\3\b\5\b\u03ba"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u03c0\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u03ca\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u03d6\n\n\3\n\3"+
		"\n\3\n\5\n\u03db\n\n\3\13\3\13\3\13\3\f\5\f\u03e1\n\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u03ed\n\r\5\r\u03ef\n\r\3\r\3\r\3\r\5\r\u03f4"+
		"\n\r\3\r\3\r\5\r\u03f8\n\r\5\r\u03fa\n\r\3\16\3\16\5\16\u03fe\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0405\n\17\f\17\16\17\u0408\13\17\3\17\3\17"+
		"\3\20\3\20\3\20\5\20\u040f\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0416\n"+
		"\21\3\22\3\22\3\22\3\22\5\22\u041c\n\22\7\22\u041e\n\22\f\22\16\22\u0421"+
		"\13\22\3\23\3\23\3\23\3\23\7\23\u0427\n\23\f\23\16\23\u042a\13\23\3\24"+
		"\3\24\5\24\u042e\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\7\26\u043b\n\26\f\26\16\26\u043e\13\26\3\26\3\26\3\27\3\27\5\27"+
		"\u0444\n\27\3\27\5\27\u0447\n\27\3\30\3\30\3\30\7\30\u044c\n\30\f\30\16"+
		"\30\u044f\13\30\3\30\5\30\u0452\n\30\3\31\3\31\3\31\3\31\5\31\u0458\n"+
		"\31\3\32\3\32\3\32\3\32\7\32\u045e\n\32\f\32\16\32\u0461\13\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\7\33\u0469\n\33\f\33\16\33\u046c\13\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0476\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u047d\n\35\3\36\3\36\3\36\3\36\5\36\u0483\n\36\3\37\3\37\3"+
		"\37\3 \5 \u0489\n \3 \3 \3 \3 \3 \6 \u0490\n \r \16 \u0491\5 \u0494\n"+
		" \3!\3!\3!\3!\3!\7!\u049b\n!\f!\16!\u049e\13!\5!\u04a0\n!\3!\3!\3!\3!"+
		"\3!\7!\u04a7\n!\f!\16!\u04aa\13!\5!\u04ac\n!\3!\3!\3!\3!\3!\7!\u04b3\n"+
		"!\f!\16!\u04b6\13!\5!\u04b8\n!\3!\3!\3!\3!\3!\7!\u04bf\n!\f!\16!\u04c2"+
		"\13!\5!\u04c4\n!\3!\5!\u04c7\n!\3!\3!\5!\u04cb\n!\3\"\5\"\u04ce\n\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u04d9\n#\3#\7#\u04dc\n#\f#\16#\u04df\13"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u04e9\n$\3%\3%\5%\u04ed\n%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\5&\u04f9\n&\3&\5&\u04fc\n&\3&\3&\5&\u0500\n&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\5&\u050a\n&\3&\3&\5&\u050e\n&\5&\u0510\n&\3&\5&\u0513"+
		"\n&\3&\3&\5&\u0517\n&\3&\5&\u051a\n&\3&\3&\5&\u051e\n&\3&\3&\5&\u0522"+
		"\n&\3&\3&\5&\u0526\n&\3&\3&\3&\5&\u052b\n&\3&\5&\u052e\n&\5&\u0530\n&"+
		"\3&\7&\u0533\n&\f&\16&\u0536\13&\3&\3&\5&\u053a\n&\3&\5&\u053d\n&\3&\3"+
		"&\5&\u0541\n&\3&\5&\u0544\n&\5&\u0546\n&\3\'\3\'\3\'\3\'\7\'\u054c\n\'"+
		"\f\'\16\'\u054f\13\'\3\'\7\'\u0552\n\'\f\'\16\'\u0555\13\'\3(\3(\3(\3"+
		"(\3(\7(\u055c\n(\f(\16(\u055f\13(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u056b"+
		"\n(\f(\16(\u056e\13(\3(\3(\5(\u0572\n(\3)\3)\3)\3)\7)\u0578\n)\f)\16)"+
		"\u057b\13)\5)\u057d\n)\3)\3)\5)\u0581\n)\3*\3*\3*\5*\u0586\n*\3*\3*\3"+
		"*\3*\3*\7*\u058d\n*\f*\16*\u0590\13*\5*\u0592\n*\3*\3*\3*\5*\u0597\n*"+
		"\3*\3*\3*\7*\u059c\n*\f*\16*\u059f\13*\5*\u05a1\n*\3+\3+\3,\3,\3,\3,\3"+
		",\3,\5,\u05ab\n,\3,\3,\3,\5,\u05b0\n,\3,\3,\3,\3,\3,\5,\u05b7\n,\7,\u05b9"+
		"\n,\f,\16,\u05bc\13,\3-\5-\u05bf\n-\3-\3-\5-\u05c3\n-\3-\3-\3-\3-\5-\u05c9"+
		"\n-\3-\3-\5-\u05cd\n-\3-\5-\u05d0\n-\3-\5-\u05d3\n-\3.\3.\3.\3.\3.\3."+
		"\3.\7.\u05dc\n.\f.\16.\u05df\13.\3.\3.\5.\u05e3\n.\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u05f8\n/\5/\u05fa\n/\5/\u05fc"+
		"\n/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\7\61\u0607\n\61\f\61\16\61"+
		"\u060a\13\61\3\62\3\62\3\62\3\62\7\62\u0610\n\62\f\62\16\62\u0613\13\62"+
		"\3\62\3\62\3\63\3\63\5\63\u0619\n\63\3\64\3\64\3\64\3\64\7\64\u061f\n"+
		"\64\f\64\16\64\u0622\13\64\3\64\3\64\3\65\3\65\3\65\5\65\u0629\n\65\3"+
		"\66\3\66\5\66\u062d\n\66\3\66\5\66\u0630\n\66\3\66\5\66\u0633\n\66\3\66"+
		"\3\66\3\66\3\66\5\66\u0639\n\66\3\66\5\66\u063c\n\66\3\66\5\66\u063f\n"+
		"\66\3\66\3\66\3\66\3\66\5\66\u0645\n\66\3\66\5\66\u0648\n\66\3\66\5\66"+
		"\u064b\n\66\3\66\5\66\u064e\n\66\3\67\3\67\3\67\3\67\7\67\u0654\n\67\f"+
		"\67\16\67\u0657\13\67\3\67\5\67\u065a\n\67\3\67\3\67\5\67\u065e\n\67\5"+
		"\67\u0660\n\67\38\38\38\38\38\38\38\58\u0669\n8\38\38\38\38\38\38\38\3"+
		"8\38\38\58\u0675\n8\58\u0677\n8\38\38\38\38\38\58\u067e\n8\38\38\38\3"+
		"8\38\58\u0685\n8\38\38\38\38\58\u068b\n8\38\38\38\38\58\u0691\n8\58\u0693"+
		"\n8\39\39\39\59\u0698\n9\39\39\3:\3:\5:\u069e\n:\3:\3:\5:\u06a2\n:\5:"+
		"\u06a4\n:\3;\3;\3;\7;\u06a9\n;\f;\16;\u06ac\13;\3<\3<\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\5=\u06b9\n=\3=\3=\3=\3=\3=\3=\7=\u06c1\n=\f=\16=\u06c4\13="+
		"\3>\3>\5>\u06c8\n>\3?\5?\u06cb\n?\3?\3?\3?\3?\3?\3?\5?\u06d3\n?\3?\3?"+
		"\3?\3?\3?\7?\u06da\n?\f?\16?\u06dd\13?\3?\3?\3?\5?\u06e2\n?\3?\3?\3?\3"+
		"?\3?\3?\5?\u06ea\n?\3?\3?\3?\3?\5?\u06f0\n?\3?\5?\u06f3\n?\3@\3@\3@\3"+
		"@\5@\u06f9\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\7@\u070e\n@\f@\16@\u0711\13@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\6A\u071e"+
		"\nA\rA\16A\u071f\3A\3A\3A\3A\3A\5A\u0727\nA\3A\3A\3A\7A\u072c\nA\fA\16"+
		"A\u072f\13A\5A\u0731\nA\3A\3A\3A\5A\u0736\nA\3A\3A\3A\3A\3A\3A\3A\6A\u073f"+
		"\nA\rA\16A\u0740\3A\3A\5A\u0745\nA\3A\3A\3A\3A\6A\u074b\nA\rA\16A\u074c"+
		"\3A\3A\5A\u0751\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0761"+
		"\nA\3A\3A\3A\3A\3A\3A\3A\3A\7A\u076b\nA\fA\16A\u076e\13A\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\6B\u0778\nB\rB\16B\u0779\5B\u077c\nB\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\7G\u0788\nG\fG\16G\u078b\13G\3H\3H\3H\3H\5H\u0791\nH\3I\5I\u0794"+
		"\nI\3I\3I\5I\u0798\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J"+
		"\u07a9\nJ\3J\3J\5J\u07ad\nJ\3J\3J\3J\3J\3J\7J\u07b4\nJ\fJ\16J\u07b7\13"+
		"J\3J\5J\u07ba\nJ\5J\u07bc\nJ\3K\3K\3K\7K\u07c1\nK\fK\16K\u07c4\13K\3L"+
		"\3L\5L\u07c8\nL\3L\3L\3L\5L\u07cd\nL\3M\3M\3M\3M\3M\3N\3N\3N\3N\7N\u07d8"+
		"\nN\fN\16N\u07db\13N\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\7P\u07e8\nP\fP\16"+
		"P\u07eb\13P\3P\3P\3P\3P\3P\7P\u07f2\nP\fP\16P\u07f5\13P\5P\u07f7\nP\3"+
		"P\3P\3P\3P\3P\7P\u07fe\nP\fP\16P\u0801\13P\5P\u0803\nP\5P\u0805\nP\3P"+
		"\5P\u0808\nP\3P\5P\u080b\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\5Q\u081d\nQ\3R\3R\3R\3R\3R\3R\3R\5R\u0826\nR\3S\3S\3S\7S\u082b"+
		"\nS\fS\16S\u082e\13S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u083e"+
		"\nT\3U\3U\3U\5U\u0843\nU\3V\3V\3W\3W\3W\3W\3W\3W\3W\5W\u084e\nW\3X\3X"+
		"\3X\7\u02a7\u02d6\u02de\u02e5\u02ed\7DVx~\u0080Y\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\2\31\3\2\u00b8\u00b9\3\2KL\5\2TU\u009f\u009f\u00a5\u00a5\4\2\f"+
		"\f\36\36\4\2++QQ\4\2\u009f\u009f\u00a5\u00a5\4\2\r\r\u00c5\u00c5\3\2_"+
		"a\3\2*+\3\2\17\20\3\2\u00e4\u00e5\3\2#$\4\2|}\u0082\u0082\3\2~\u0081\3"+
		"\2|}\3\2t{\3\2|\u0085\3\2\34\37\3\2\'(\4\2@@\u008c\u008c\4\2\30\30\u008a"+
		"\u008a\3\2DE\t\2\13\62\65\65=^bs\u0081\u0081\u0086\u00db\u00dd\u00de\u09bc"+
		"\2\u00b3\3\2\2\2\4\u00be\3\2\2\2\6\u00c1\3\2\2\2\b\u00c5\3\2\2\2\n\u02f0"+
		"\3\2\2\2\f\u03b2\3\2\2\2\16\u03b4\3\2\2\2\20\u03c3\3\2\2\2\22\u03cf\3"+
		"\2\2\2\24\u03dc\3\2\2\2\26\u03e0\3\2\2\2\30\u03f9\3\2\2\2\32\u03fb\3\2"+
		"\2\2\34\u03ff\3\2\2\2\36\u040b\3\2\2\2 \u0415\3\2\2\2\"\u0417\3\2\2\2"+
		"$\u0422\3\2\2\2&\u042b\3\2\2\2(\u0433\3\2\2\2*\u0436\3\2\2\2,\u0441\3"+
		"\2\2\2.\u0451\3\2\2\2\60\u0457\3\2\2\2\62\u0459\3\2\2\2\64\u0464\3\2\2"+
		"\2\66\u0475\3\2\2\28\u047c\3\2\2\2:\u047e\3\2\2\2<\u0484\3\2\2\2>\u0493"+
		"\3\2\2\2@\u049f\3\2\2\2B\u04cd\3\2\2\2D\u04d2\3\2\2\2F\u04e8\3\2\2\2H"+
		"\u04ea\3\2\2\2J\u0545\3\2\2\2L\u0547\3\2\2\2N\u0556\3\2\2\2P\u0580\3\2"+
		"\2\2R\u0582\3\2\2\2T\u05a2\3\2\2\2V\u05a4\3\2\2\2X\u05d2\3\2\2\2Z\u05e2"+
		"\3\2\2\2\\\u05e4\3\2\2\2^\u05ff\3\2\2\2`\u0603\3\2\2\2b\u060b\3\2\2\2"+
		"d\u0616\3\2\2\2f\u061a\3\2\2\2h\u0625\3\2\2\2j\u064d\3\2\2\2l\u064f\3"+
		"\2\2\2n\u0692\3\2\2\2p\u0697\3\2\2\2r\u069b\3\2\2\2t\u06a5\3\2\2\2v\u06ad"+
		"\3\2\2\2x\u06b8\3\2\2\2z\u06c5\3\2\2\2|\u06f2\3\2\2\2~\u06f8\3\2\2\2\u0080"+
		"\u0760\3\2\2\2\u0082\u077b\3\2\2\2\u0084\u077d\3\2\2\2\u0086\u077f\3\2"+
		"\2\2\u0088\u0781\3\2\2\2\u008a\u0783\3\2\2\2\u008c\u0785\3\2\2\2\u008e"+
		"\u078c\3\2\2\2\u0090\u0797\3\2\2\2\u0092\u07bb\3\2\2\2\u0094\u07bd\3\2"+
		"\2\2\u0096\u07c5\3\2\2\2\u0098\u07ce\3\2\2\2\u009a\u07d3\3\2\2\2\u009c"+
		"\u07dc\3\2\2\2\u009e\u080a\3\2\2\2\u00a0\u081c\3\2\2\2\u00a2\u0825\3\2"+
		"\2\2\u00a4\u0827\3\2\2\2\u00a6\u083d\3\2\2\2\u00a8\u0842\3\2\2\2\u00aa"+
		"\u0844\3\2\2\2\u00ac\u084d\3\2\2\2\u00ae\u084f\3\2\2\2\u00b0\u00b2\5\4"+
		"\3\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b9\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\13"+
		"\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\2"+
		"\2\3\u00bd\3\3\2\2\2\u00be\u00bf\5\6\4\2\u00bf\u00c0\7\3\2\2\u00c0\5\3"+
		"\2\2\2\u00c1\u00c2\5\b\5\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7\u00df\2\2"+
		"\u00c4\7\3\2\2\2\u00c5\u00c6\7\u00e8\2\2\u00c6\t\3\2\2\2\u00c7\u02f1\5"+
		"\26\f\2\u00c8\u00c9\7[\2\2\u00c9\u02f1\5\u00a6T\2\u00ca\u00cb\7J\2\2\u00cb"+
		"\u00cf\7\u00bf\2\2\u00cc\u00cd\7s\2\2\u00cd\u00ce\7\37\2\2\u00ce\u00d0"+
		"\7!\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d4\5\u00a6T\2\u00d2\u00d3\7j\2\2\u00d3\u00d5\7\u00df\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\5\24\13\2"+
		"\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00da"+
		"\7H\2\2\u00da\u00db\7\u00aa\2\2\u00db\u00dd\5*\26\2\u00dc\u00d9\3\2\2"+
		"\2\u00dc\u00dd\3\2\2\2\u00dd\u02f1\3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0"+
		"\7\u00bf\2\2\u00e0\u00e1\5\u00a6T\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7\u00aa"+
		"\2\2\u00e3\u00e4\5*\26\2\u00e4\u02f1\3\2\2\2\u00e5\u00e6\7^\2\2\u00e6"+
		"\u00e9\7\u00bf\2\2\u00e7\u00e8\7s\2\2\u00e8\u00ea\7!\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\5\u00a6T\2"+
		"\u00ec\u00ee\t\2\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u02f1"+
		"\3\2\2\2\u00ef\u00f4\5\16\b\2\u00f0\u00f1\7\4\2\2\u00f1\u00f2\5\u0094"+
		"K\2\u00f2\u00f3\7\5\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\5(\25\2\u00f7\u00f8\7\u00a7"+
		"\2\2\u00f8\u00fa\5*\26\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fe\3\2\2\2\u00fb\u00fc\7\u00c7\2\2\u00fc\u00fd\7\23\2\2\u00fd\u00ff"+
		"\5^\60\2\u00fe\u00fb\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u0102\5\20\t\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u02f1\3"+
		"\2\2\2\u0103\u0104\5\16\b\2\u0104\u0107\5(\25\2\u0105\u0106\7\u00a7\2"+
		"\2\u0106\u0108\5*\26\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010c"+
		"\3\2\2\2\u0109\u010a\7\u00c7\2\2\u010a\u010b\7\23\2\2\u010b\u010d\5^\60"+
		"\2\u010c\u0109\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0110"+
		"\5\20\t\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2"+
		"\u0111\u0113\7\16\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\5\26\f\2\u0115\u02f1\3\2\2\2\u0116\u011b\5\16\b\2"+
		"\u0117\u0118\7\4\2\2\u0118\u0119\5\u0094K\2\u0119\u011a\7\5\2\2\u011a"+
		"\u011c\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011e\7j\2\2\u011e\u0120\7\u00df\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0127\3\2\2\2\u0121\u0122\7\u00c7\2\2\u0122\u0123"+
		"\7\23\2\2\u0123\u0124\7\4\2\2\u0124\u0125\5\u0094K\2\u0125\u0126\7\5\2"+
		"\2\u0126\u0128\3\2\2\2\u0127\u0121\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a"+
		"\3\2\2\2\u0129\u012b\5\20\t\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2"+
		"\u012b\u012d\3\2\2\2\u012c\u012e\5\22\n\2\u012d\u012c\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0131\5n8\2\u0130\u012f\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0134\5\66\34\2\u0133\u0132\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0137\5\24\13\2\u0136"+
		"\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0139\7\u00a9"+
		"\2\2\u0139\u013b\5*\26\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u0140\3\2\2\2\u013c\u013e\7\16\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\5\26\f\2\u0140\u013d\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u02f1\3\2\2\2\u0142\u0143\7J\2\2\u0143\u0147\7K\2"+
		"\2\u0144\u0145\7s\2\2\u0145\u0146\7\37\2\2\u0146\u0148\7!\2\2\u0147\u0144"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\5p9\2\u014a"+
		"\u014b\7#\2\2\u014b\u014c\5p9\2\u014c\u02f1\3\2\2\2\u014d\u014e\7\u00c3"+
		"\2\2\u014e\u014f\7K\2\2\u014f\u0151\5p9\2\u0150\u0152\5\34\17\2\u0151"+
		"\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\u00c4"+
		"\2\2\u0154\u015b\7\u00c6\2\2\u0155\u015c\5\u00a6T\2\u0156\u0157\7,\2\2"+
		"\u0157\u0159\7Y\2\2\u0158\u015a\5`\61\2\u0159\u0158\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u0156\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u02f1\3\2\2\2\u015d\u015e\7e\2\2\u015e\u015f\t\3"+
		"\2\2\u015f\u0160\5p9\2\u0160\u0161\7f\2\2\u0161\u0162\7b\2\2\u0162\u0163"+
		"\5p9\2\u0163\u02f1\3\2\2\2\u0164\u0165\7e\2\2\u0165\u0166\t\3\2\2\u0166"+
		"\u0167\5p9\2\u0167\u0168\7k\2\2\u0168\u0169\7\u00a9\2\2\u0169\u016a\5"+
		"*\26\2\u016a\u02f1\3\2\2\2\u016b\u016c\7e\2\2\u016c\u016d\t\3\2\2\u016d"+
		"\u016e\5p9\2\u016e\u016f\7\u00a8\2\2\u016f\u0172\7\u00a9\2\2\u0170\u0171"+
		"\7s\2\2\u0171\u0173\7!\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\5*\26\2\u0175\u02f1\3\2\2\2\u0176\u0177\7e"+
		"\2\2\u0177\u0178\7K\2\2\u0178\u017a\5p9\2\u0179\u017b\5\34\17\2\u017a"+
		"\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7k"+
		"\2\2\u017d\u017e\7\u0091\2\2\u017e\u0182\7\u00df\2\2\u017f\u0180\7H\2"+
		"\2\u0180\u0181\7\u0092\2\2\u0181\u0183\5*\26\2\u0182\u017f\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u02f1\3\2\2\2\u0184\u0185\7e\2\2\u0185\u0186\7K\2"+
		"\2\u0186\u0188\5p9\2\u0187\u0189\5\34\17\2\u0188\u0187\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\7k\2\2\u018b\u018c\7\u0092\2"+
		"\2\u018c\u018d\5*\26\2\u018d\u02f1\3\2\2\2\u018e\u018f\7e\2\2\u018f\u0190"+
		"\7K\2\2\u0190\u0191\5p9\2\u0191\u0195\7\r\2\2\u0192\u0193\7s\2\2\u0193"+
		"\u0194\7\37\2\2\u0194\u0196\7!\2\2\u0195\u0192\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0198\3\2\2\2\u0197\u0199\5\32\16\2\u0198\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u02f1\3\2"+
		"\2\2\u019c\u019d\7e\2\2\u019d\u019e\7L\2\2\u019e\u019f\5p9\2\u019f\u01a3"+
		"\7\r\2\2\u01a0\u01a1\7s\2\2\u01a1\u01a2\7\37\2\2\u01a2\u01a4\7!\2\2\u01a3"+
		"\u01a0\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\5\34"+
		"\17\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u02f1\3\2\2\2\u01aa\u01ab\7e\2\2\u01ab\u01ac\7K\2"+
		"\2\u01ac\u01ad\5p9\2\u01ad\u01ae\5\34\17\2\u01ae\u01af\7f\2\2\u01af\u01b0"+
		"\7b\2\2\u01b0\u01b1\5\34\17\2\u01b1\u02f1\3\2\2\2\u01b2\u01b3\7e\2\2\u01b3"+
		"\u01b4\7K\2\2\u01b4\u01b5\5p9\2\u01b5\u01b8\7^\2\2\u01b6\u01b7\7s\2\2"+
		"\u01b7\u01b9\7!\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01bf\5\34\17\2\u01bb\u01bc\7\6\2\2\u01bc\u01be\5\34\17"+
		"\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c4\7\u00bc\2"+
		"\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u02f1\3\2\2\2\u01c5\u01c6"+
		"\7e\2\2\u01c6\u01c7\7L\2\2\u01c7\u01c8\5p9\2\u01c8\u01cb\7^\2\2\u01c9"+
		"\u01ca\7s\2\2\u01ca\u01cc\7!\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2"+
		"\2\u01cc\u01cd\3\2\2\2\u01cd\u01d2\5\34\17\2\u01ce\u01cf\7\6\2\2\u01cf"+
		"\u01d1\5\34\17\2\u01d0\u01ce\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3"+
		"\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u02f1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"\u01d6\7e\2\2\u01d6\u01d7\7K\2\2\u01d7\u01d9\5p9\2\u01d8\u01da\5\34\17"+
		"\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc"+
		"\7k\2\2\u01dc\u01dd\5\24\13\2\u01dd\u02f1\3\2\2\2\u01de\u01df\7^\2\2\u01df"+
		"\u01e2\7K\2\2\u01e0\u01e1\7s\2\2\u01e1\u01e3\7!\2\2\u01e2\u01e0\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\5p9\2\u01e5\u01e7"+
		"\7\u00bc\2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u02f1\3\2\2"+
		"\2\u01e8\u01e9\7^\2\2\u01e9\u01ec\7L\2\2\u01ea\u01eb\7s\2\2\u01eb\u01ed"+
		"\7!\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u02f1\5p9\2\u01ef\u01f2\7J\2\2\u01f0\u01f1\7\34\2\2\u01f1\u01f3\7M\2"+
		"\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f6"+
		"\7\u00a6\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2"+
		"\2\u01f7\u01fb\7L\2\2\u01f8\u01f9\7s\2\2\u01f9\u01fa\7\37\2\2\u01fa\u01fc"+
		"\7!\2\2\u01fb\u01f8\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01ff\5p9\2\u01fe\u0200\5f\64\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2"+
		"\2\u0200\u0203\3\2\2\2\u0201\u0202\7j\2\2\u0202\u0204\7\u00df\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0208\3\2\2\2\u0205\u0206\7\u00c7"+
		"\2\2\u0206\u0207\7<\2\2\u0207\u0209\5^\60\2\u0208\u0205\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u020b\7\u00a9\2\2\u020b\u020d"+
		"\5*\26\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\7\16\2\2\u020f\u0210\5\26\f\2\u0210\u02f1\3\2\2\2\u0211\u0214\7"+
		"J\2\2\u0212\u0213\7\34\2\2\u0213\u0215\7M\2\2\u0214\u0212\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7\u00a6\2\2\u0217\u0218"+
		"\7L\2\2\u0218\u021d\5p9\2\u0219\u021a\7\4\2\2\u021a\u021b\5\u0094K\2\u021b"+
		"\u021c\7\5\2\2\u021c\u021e\3\2\2\2\u021d\u0219\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021f\u0222\5(\25\2\u0220\u0221\7\u00a7\2\2\u0221"+
		"\u0223\5*\26\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u02f1\3\2"+
		"\2\2\u0224\u0225\7e\2\2\u0225\u0226\7L\2\2\u0226\u0228\5p9\2\u0227\u0229"+
		"\7\16\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2"+
		"\u022a\u022b\5\26\f\2\u022b\u02f1\3\2\2\2\u022c\u022e\7J\2\2\u022d\u022f"+
		"\7\u00a6\2\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2"+
		"\2\u0230\u0231\7\u009e\2\2\u0231\u0232\5\u00a4S\2\u0232\u0233\7\16\2\2"+
		"\u0233\u023d\7\u00df\2\2\u0234\u0235\7\u0090\2\2\u0235\u023a\5<\37\2\u0236"+
		"\u0237\7\6\2\2\u0237\u0239\5<\37\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2"+
		"\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023e\3\2\2\2\u023c"+
		"\u023a\3\2\2\2\u023d\u0234\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u02f1\3\2"+
		"\2\2\u023f\u0241\7^\2\2\u0240\u0242\7\u00a6\2\2\u0241\u0240\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0246\7\u009e\2\2\u0244\u0245"+
		"\7s\2\2\u0245\u0247\7!\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u02f1\5\u00a4S\2\u0249\u024b\7R\2\2\u024a\u024c\t"+
		"\4\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u02f1\5\n\6\2\u024e\u024f\7W\2\2\u024f\u0252\7X\2\2\u0250\u0251\t\5\2"+
		"\2\u0251\u0253\5\u00a6T\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0258\3\2\2\2\u0254\u0256\7#\2\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u0257\3\2\2\2\u0257\u0259\7\u00df\2\2\u0258\u0255\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u02f1\3\2\2\2\u025a\u025b\7W\2\2\u025b\u025e\7\u00c0"+
		"\2\2\u025c\u025d\7#\2\2\u025d\u025f\7\u00df\2\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u02f1\3\2\2\2\u0260\u0261\7W\2\2\u0261\u0262\7\u00a9"+
		"\2\2\u0262\u0267\5p9\2\u0263\u0264\7\4\2\2\u0264\u0265\5.\30\2\u0265\u0266"+
		"\7\5\2\2\u0266\u0268\3\2\2\2\u0267\u0263\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u02f1\3\2\2\2\u0269\u026a\7W\2\2\u026a\u026b\7Y\2\2\u026b\u026c\t\5\2"+
		"\2\u026c\u026f\5p9\2\u026d\u026e\t\5\2\2\u026e\u0270\5\u00a6T\2\u026f"+
		"\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u02f1\3\2\2\2\u0271\u0272\7W"+
		"\2\2\u0272\u0273\7\\\2\2\u0273\u0275\5p9\2\u0274\u0276\5\34\17\2\u0275"+
		"\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u02f1\3\2\2\2\u0277\u0279\7W"+
		"\2\2\u0278\u027a\5\u00a6T\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u0283\7]\2\2\u027c\u027e\7#\2\2\u027d\u027c\3\2\2"+
		"\2\u027d\u027e\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u0282\5\u00a4S\2\u0280"+
		"\u0282\7\u00df\2\2\u0281\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0282\u0284"+
		"\3\2\2\2\u0283\u027d\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u02f1\3\2\2\2\u0285"+
		"\u0286\7W\2\2\u0286\u0287\7J\2\2\u0287\u0288\7K\2\2\u0288\u02f1\5p9\2"+
		"\u0289\u028a\t\6\2\2\u028a\u028c\7\u009e\2\2\u028b\u028d\7\u009f\2\2\u028c"+
		"\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u02f1\5 "+
		"\21\2\u028f\u0290\t\6\2\2\u0290\u0292\7\u00bf\2\2\u0291\u0293\7\u009f"+
		"\2\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u02f1\5\u00a6T\2\u0295\u0297\t\6\2\2\u0296\u0298\t\7\2\2\u0297\u0296"+
		"\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\5p9\2\u029a"+
		"\u029c\5\34\17\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3"+
		"\2\2\2\u029d\u029f\5\"\22\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02f1\3\2\2\2\u02a0\u02a1\7\u00a0\2\2\u02a1\u02a2\7K\2\2\u02a2\u02f1"+
		"\5p9\2\u02a3\u02a7\7\u00a0\2\2\u02a4\u02a6\13\2\2\2\u02a5\u02a4\3\2\2"+
		"\2\u02a6\u02a9\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02f1"+
		"\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ac\7\u00a2\2\2\u02ab\u02ad\7\u00a4"+
		"\2\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u02af\7K\2\2\u02af\u02b4\5p9\2\u02b0\u02b2\7\16\2\2\u02b1\u02b0\3\2\2"+
		"\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\5\26\f\2\u02b4"+
		"\u02b1\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02f1\3\2\2\2\u02b6\u02b7\7\u00a3"+
		"\2\2\u02b7\u02b8\7K\2\2\u02b8\u02f1\5p9\2\u02b9\u02ba\7\u00a1\2\2\u02ba"+
		"\u02f1\7\u00a2\2\2\u02bb\u02bc\7\u00d2\2\2\u02bc\u02be\7m\2\2\u02bd\u02bf"+
		"\7\u00dd\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2"+
		"\2\u02c0\u02c1\7\u00de\2\2\u02c1\u02c3\7\u00df\2\2\u02c2\u02c4\7\u008d"+
		"\2\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"\u02c6\7P\2\2\u02c6\u02c7\7K\2\2\u02c7\u02c9\5p9\2\u02c8\u02ca\5\34\17"+
		"\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02f1\3\2\2\2\u02cb\u02cc"+
		"\7\u00c2\2\2\u02cc\u02cd\7K\2\2\u02cd\u02cf\5p9\2\u02ce\u02d0\5\34\17"+
		"\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02f1\3\2\2\2\u02d1\u02d2"+
		"\t\b\2\2\u02d2\u02d6\5\u00a6T\2\u02d3\u02d5\13\2\2\2\u02d4\u02d3\3\2\2"+
		"\2\u02d5\u02d8\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02f1"+
		"\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02da\7k\2\2\u02da\u02de\7\u00d3\2"+
		"\2\u02db\u02dd\13\2\2\2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02f1\3\2\2\2\u02e0\u02de\3\2"+
		"\2\2\u02e1\u02e5\7k\2\2\u02e2\u02e4\13\2\2\2\u02e3\u02e2\3\2\2\2\u02e4"+
		"\u02e7\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02f1\3\2"+
		"\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02f1\7l\2\2\u02e9\u02ed\5\f\7\2\u02ea"+
		"\u02ec\13\2\2\2\u02eb\u02ea\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02ee\3"+
		"\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0"+
		"\u00c7\3\2\2\2\u02f0\u00c8\3\2\2\2\u02f0\u00ca\3\2\2\2\u02f0\u00de\3\2"+
		"\2\2\u02f0\u00e5\3\2\2\2\u02f0\u00ef\3\2\2\2\u02f0\u0103\3\2\2\2\u02f0"+
		"\u0116\3\2\2\2\u02f0\u0142\3\2\2\2\u02f0\u014d\3\2\2\2\u02f0\u015d\3\2"+
		"\2\2\u02f0\u0164\3\2\2\2\u02f0\u016b\3\2\2\2\u02f0\u0176\3\2\2\2\u02f0"+
		"\u0184\3\2\2\2\u02f0\u018e\3\2\2\2\u02f0\u019c\3\2\2\2\u02f0\u01aa\3\2"+
		"\2\2\u02f0\u01b2\3\2\2\2\u02f0\u01c5\3\2\2\2\u02f0\u01d5\3\2\2\2\u02f0"+
		"\u01de\3\2\2\2\u02f0\u01e8\3\2\2\2\u02f0\u01ef\3\2\2\2\u02f0\u0211\3\2"+
		"\2\2\u02f0\u0224\3\2\2\2\u02f0\u022c\3\2\2\2\u02f0\u023f\3\2\2\2\u02f0"+
		"\u0249\3\2\2\2\u02f0\u024e\3\2\2\2\u02f0\u025a\3\2\2\2\u02f0\u0260\3\2"+
		"\2\2\u02f0\u0269\3\2\2\2\u02f0\u0271\3\2\2\2\u02f0\u0277\3\2\2\2\u02f0"+
		"\u0285\3\2\2\2\u02f0\u0289\3\2\2\2\u02f0\u028f\3\2\2\2\u02f0\u0295\3\2"+
		"\2\2\u02f0\u02a0\3\2\2\2\u02f0\u02a3\3\2\2\2\u02f0\u02aa\3\2\2\2\u02f0"+
		"\u02b6\3\2\2\2\u02f0\u02b9\3\2\2\2\u02f0\u02bb\3\2\2\2\u02f0\u02cb\3\2"+
		"\2\2\u02f0\u02d1\3\2\2\2\u02f0\u02d9\3\2\2\2\u02f0\u02e1\3\2\2\2\u02f0"+
		"\u02e8\3\2\2\2\u02f0\u02e9\3\2\2\2\u02f1\13\3\2\2\2\u02f2\u02f3\7J\2\2"+
		"\u02f3\u03b3\7\u00d3\2\2\u02f4\u02f5\7^\2\2\u02f5\u03b3\7\u00d3\2\2\u02f6"+
		"\u02f8\7\u00cb\2\2\u02f7\u02f9\7\u00d3\2\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9"+
		"\3\2\2\2\u02f9\u03b3\3\2\2\2\u02fa\u02fc\7\u00ca\2\2\u02fb\u02fd\7\u00d3"+
		"\2\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u03b3\3\2\2\2\u02fe"+
		"\u02ff\7W\2\2\u02ff\u03b3\7\u00cb\2\2\u0300\u0301\7W\2\2\u0301\u0303\7"+
		"\u00d3\2\2\u0302\u0304\7\u00cb\2\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304\u03b3\3\2\2\2\u0305\u0306\7W\2\2\u0306\u03b3\7\u00d6\2\2\u0307"+
		"\u0308\7W\2\2\u0308\u03b3\7\u00d4\2\2\u0309\u030a\7W\2\2\u030a\u030b\7"+
		"F\2\2\u030b\u03b3\7\u00d4\2\2\u030c\u030d\7\u00d0\2\2\u030d\u03b3\7K\2"+
		"\2\u030e\u030f\7\u00d1\2\2\u030f\u03b3\7K\2\2\u0310\u0311\7W\2\2\u0311"+
		"\u03b3\7\u00d5\2\2\u0312\u0313\7W\2\2\u0313\u0314\7J\2\2\u0314\u03b3\7"+
		"K\2\2\u0315\u0316\7W\2\2\u0316\u03b3\7\u00d7\2\2\u0317\u0318\7W\2\2\u0318"+
		"\u03b3\7\u00d9\2\2\u0319\u031a\7W\2\2\u031a\u03b3\7\u00da\2\2\u031b\u031c"+
		"\7J\2\2\u031c\u03b3\7\u00d8\2\2\u031d\u031e\7^\2\2\u031e\u03b3\7\u00d8"+
		"\2\2\u031f\u0320\7e\2\2\u0320\u03b3\7\u00d8\2\2\u0321\u0322\7\u00cc\2"+
		"\2\u0322\u03b3\7K\2\2\u0323\u0324\7\u00cc\2\2\u0324\u03b3\7\u00bf\2\2"+
		"\u0325\u0326\7\u00cd\2\2\u0326\u03b3\7K\2\2\u0327\u0328\7\u00cd\2\2\u0328"+
		"\u03b3\7\u00bf\2\2\u0329\u032a\7J\2\2\u032a\u032b\7\u00a6\2\2\u032b\u03b3"+
		"\7r\2\2\u032c\u032d\7^\2\2\u032d\u032e\7\u00a6\2\2\u032e\u03b3\7r\2\2"+
		"\u032f\u0330\7\u00ce\2\2\u0330\u0331\7\u00cf\2\2\u0331\u03b3\7K\2\2\u0332"+
		"\u0333\7e\2\2\u0333\u0334\7K\2\2\u0334\u0335\5p9\2\u0335\u0336\7\37\2"+
		"\2\u0336\u0337\7\u00ba\2\2\u0337\u03b3\3\2\2\2\u0338\u0339\7e\2\2\u0339"+
		"\u033a\7K\2\2\u033a\u033b\5p9\2\u033b\u033c\7\u00ba\2\2\u033c\u033d\7"+
		"\23\2\2\u033d\u03b3\3\2\2\2\u033e\u033f\7e\2\2\u033f\u0340\7K\2\2\u0340"+
		"\u0341\5p9\2\u0341\u0342\7\37\2\2\u0342\u0343\7\u00bb\2\2\u0343\u03b3"+
		"\3\2\2\2\u0344\u0345\7e\2\2\u0345\u0346\7K\2\2\u0346\u0347\5p9\2\u0347"+
		"\u0348\7\u00ac\2\2\u0348\u0349\7\23\2\2\u0349\u03b3\3\2\2\2\u034a\u034b"+
		"\7e\2\2\u034b\u034c\7K\2\2\u034c\u034d\5p9\2\u034d\u034e\7\37\2\2\u034e"+
		"\u034f\7\u00ac\2\2\u034f\u03b3\3\2\2\2\u0350\u0351\7e\2\2\u0351\u0352"+
		"\7K\2\2\u0352\u0353\5p9\2\u0353\u0354\7\37\2\2\u0354\u0355\7\u00ad\2\2"+
		"\u0355\u0356\7\16\2\2\u0356\u0357\7\u00ae\2\2\u0357\u03b3\3\2\2\2\u0358"+
		"\u0359\7e\2\2\u0359\u035a\7K\2\2\u035a\u035b\5p9\2\u035b\u035c\7k\2\2"+
		"\u035c\u035d\7\u00ac\2\2\u035d\u035e\7\u00af\2\2\u035e\u03b3\3\2\2\2\u035f"+
		"\u0360\7e\2\2\u0360\u0361\7K\2\2\u0361\u0362\5p9\2\u0362\u0363\7\u00b0"+
		"\2\2\u0363\u0364\7@\2\2\u0364\u03b3\3\2\2\2\u0365\u0366\7e\2\2\u0366\u0367"+
		"\7K\2\2\u0367\u0368\5p9\2\u0368\u0369\7\u00b1\2\2\u0369\u036a\7@\2\2\u036a"+
		"\u03b3\3\2\2\2\u036b\u036c\7e\2\2\u036c\u036d\7K\2\2\u036d\u036e\5p9\2"+
		"\u036e\u036f\7\u00b2\2\2\u036f\u0370\7@\2\2\u0370\u03b3\3\2\2\2\u0371"+
		"\u0372\7e\2\2\u0372\u0373\7K\2\2\u0373\u0374\5p9\2\u0374\u0375\7\u00b4"+
		"\2\2\u0375\u03b3\3\2\2\2\u0376\u0377\7e\2\2\u0377\u0378\7K\2\2\u0378\u037a"+
		"\5p9\2\u0379\u037b\5\34\17\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c\u037d\7\u00b5\2\2\u037d\u03b3\3\2\2\2\u037e\u037f"+
		"\7e\2\2\u037f\u0380\7K\2\2\u0380\u0382\5p9\2\u0381\u0383\5\34\17\2\u0382"+
		"\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\7\u00b6"+
		"\2\2\u0385\u03b3\3\2\2\2\u0386\u0387\7e\2\2\u0387\u0388\7K\2\2\u0388\u038a"+
		"\5p9\2\u0389\u038b\5\34\17\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038c\3\2\2\2\u038c\u038d\7k\2\2\u038d\u038e\7\u00b3\2\2\u038e\u03b3"+
		"\3\2\2\2\u038f\u0390\7e\2\2\u0390\u0391\7K\2\2\u0391\u0393\5p9\2\u0392"+
		"\u0394\5\34\17\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3"+
		"\2\2\2\u0395\u0396\7\r\2\2\u0396\u0397\7Y\2\2\u0397\u03b3\3\2\2\2\u0398"+
		"\u0399\7e\2\2\u0399\u039a\7K\2\2\u039a\u039c\5p9\2\u039b\u039d\5\34\17"+
		"\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0"+
		"\7\u00b7\2\2\u039f\u03a1\7Y\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2"+
		"\2\u03a1\u03b3\3\2\2\2\u03a2\u03a3\7e\2\2\u03a3\u03a4\7K\2\2\u03a4\u03a6"+
		"\5p9\2\u03a5\u03a7\5\34\17\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03a9\7M\2\2\u03a9\u03aa\7Y\2\2\u03aa\u03b3\3\2\2"+
		"\2\u03ab\u03ac\7n\2\2\u03ac\u03b3\7o\2\2\u03ad\u03b3\7p\2\2\u03ae\u03b3"+
		"\7q\2\2\u03af\u03b3\7\u00c1\2\2\u03b0\u03b1\7O\2\2\u03b1\u03b3\7\f\2\2"+
		"\u03b2\u02f2\3\2\2\2\u03b2\u02f4\3\2\2\2\u03b2\u02f6\3\2\2\2\u03b2\u02fa"+
		"\3\2\2\2\u03b2\u02fe\3\2\2\2\u03b2\u0300\3\2\2\2\u03b2\u0305\3\2\2\2\u03b2"+
		"\u0307\3\2\2\2\u03b2\u0309\3\2\2\2\u03b2\u030c\3\2\2\2\u03b2\u030e\3\2"+
		"\2\2\u03b2\u0310\3\2\2\2\u03b2\u0312\3\2\2\2\u03b2\u0315\3\2\2\2\u03b2"+
		"\u0317\3\2\2\2\u03b2\u0319\3\2\2\2\u03b2\u031b\3\2\2\2\u03b2\u031d\3\2"+
		"\2\2\u03b2\u031f\3\2\2\2\u03b2\u0321\3\2\2\2\u03b2\u0323\3\2\2\2\u03b2"+
		"\u0325\3\2\2\2\u03b2\u0327\3\2\2\2\u03b2\u0329\3\2\2\2\u03b2\u032c\3\2"+
		"\2\2\u03b2\u032f\3\2\2\2\u03b2\u0332\3\2\2\2\u03b2\u0338\3\2\2\2\u03b2"+
		"\u033e\3\2\2\2\u03b2\u0344\3\2\2\2\u03b2\u034a\3\2\2\2\u03b2\u0350\3\2"+
		"\2\2\u03b2\u0358\3\2\2\2\u03b2\u035f\3\2\2\2\u03b2\u0365\3\2\2\2\u03b2"+
		"\u036b\3\2\2\2\u03b2\u0371\3\2\2\2\u03b2\u0376\3\2\2\2\u03b2\u037e\3\2"+
		"\2\2\u03b2\u0386\3\2\2\2\u03b2\u038f\3\2\2\2\u03b2\u0398\3\2\2\2\u03b2"+
		"\u03a2\3\2\2\2\u03b2\u03ab\3\2\2\2\u03b2\u03ad\3\2\2\2\u03b2\u03ae\3\2"+
		"\2\2\u03b2\u03af\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\r\3\2\2\2\u03b4\u03b6"+
		"\7J\2\2\u03b5\u03b7\7\u00a6\2\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2"+
		"\2\u03b7\u03b9\3\2\2\2\u03b8\u03ba\7\u00c8\2\2\u03b9\u03b8\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bf\7K\2\2\u03bc\u03bd\7s\2"+
		"\2\u03bd\u03be\7\37\2\2\u03be\u03c0\7!\2\2\u03bf\u03bc\3\2\2\2\u03bf\u03c0"+
		"\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\5p9\2\u03c2\17\3\2\2\2\u03c3"+
		"\u03c4\7\u00ba\2\2\u03c4\u03c5\7\23\2\2\u03c5\u03c9\5^\60\2\u03c6\u03c7"+
		"\7\u00bb\2\2\u03c7\u03c8\7\23\2\2\u03c8\u03ca\5b\62\2\u03c9\u03c6\3\2"+
		"\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\7P\2\2\u03cc"+
		"\u03cd\7\u00e4\2\2\u03cd\u03ce\7\u00ab\2\2\u03ce\21\3\2\2\2\u03cf\u03d0"+
		"\7\u00ac\2\2\u03d0\u03d1\7\23\2\2\u03d1\u03d2\5^\60\2\u03d2\u03d5\7<\2"+
		"\2\u03d3\u03d6\5\62\32\2\u03d4\u03d6\5\64\33\2\u03d5\u03d3\3\2\2\2\u03d5"+
		"\u03d4\3\2\2\2\u03d6\u03da\3\2\2\2\u03d7\u03d8\7\u00ad\2\2\u03d8\u03d9"+
		"\7\16\2\2\u03d9\u03db\7\u00ae\2\2\u03da\u03d7\3\2\2\2\u03da\u03db\3\2"+
		"\2\2\u03db\23\3\2\2\2\u03dc\u03dd\7\u00af\2\2\u03dd\u03de\7\u00df\2\2"+
		"\u03de\25\3\2\2\2\u03df\u03e1\5$\23\2\u03e0\u03df\3\2\2\2\u03e0\u03e1"+
		"\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\5> \2\u03e3\27\3\2\2\2\u03e4"+
		"\u03e5\7N\2\2\u03e5\u03e6\7\u008d\2\2\u03e6\u03e7\7K\2\2\u03e7\u03ee\5"+
		"p9\2\u03e8\u03ec\5\34\17\2\u03e9\u03ea\7s\2\2\u03ea\u03eb\7\37\2\2\u03eb"+
		"\u03ed\7!\2\2\u03ec\u03e9\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2"+
		"\2\2\u03ee\u03e8\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03fa\3\2\2\2\u03f0"+
		"\u03f1\7N\2\2\u03f1\u03f3\7P\2\2\u03f2\u03f4\7K\2\2\u03f3\u03f2\3\2\2"+
		"\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\5p9\2\u03f6\u03f8"+
		"\5\34\17\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2\2\2"+
		"\u03f9\u03e4\3\2\2\2\u03f9\u03f0\3\2\2\2\u03fa\31\3\2\2\2\u03fb\u03fd"+
		"\5\34\17\2\u03fc\u03fe\5\24\13\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2"+
		"\2\u03fe\33\3\2\2\2\u03ff\u0400\7@\2\2\u0400\u0401\7\4\2\2\u0401\u0406"+
		"\5\36\20\2\u0402\u0403\7\6\2\2\u0403\u0405\5\36\20\2\u0404\u0402\3\2\2"+
		"\2\u0405\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409"+
		"\3\2\2\2\u0408\u0406\3\2\2\2\u0409\u040a\7\5\2\2\u040a\35\3\2\2\2\u040b"+
		"\u040e\5\u00a6T\2\u040c\u040d\7t\2\2\u040d\u040f\5\u0082B\2\u040e\u040c"+
		"\3\2\2\2\u040e\u040f\3\2\2\2\u040f\37\3\2\2\2\u0410\u0416\5\u00a4S\2\u0411"+
		"\u0416\7\u00df\2\2\u0412\u0416\5\u0084C\2\u0413\u0416\5\u0086D\2\u0414"+
		"\u0416\5\u0088E\2\u0415\u0410\3\2\2\2\u0415\u0411\3\2\2\2\u0415\u0412"+
		"\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0414\3\2\2\2\u0416!\3\2\2\2\u0417"+
		"\u041f\5\u00a6T\2\u0418\u041b\7\7\2\2\u0419\u041c\5\u00a6T\2\u041a\u041c"+
		"\7\u00df\2\2\u041b\u0419\3\2\2\2\u041b\u041a\3\2\2\2\u041c\u041e\3\2\2"+
		"\2\u041d\u0418\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420"+
		"\3\2\2\2\u0420#\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0423\7H\2\2\u0423\u0428"+
		"\5&\24\2\u0424\u0425\7\6\2\2\u0425\u0427\5&\24\2\u0426\u0424\3\2\2\2\u0427"+
		"\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429%\3\2\2\2"+
		"\u042a\u0428\3\2\2\2\u042b\u042d\5\u00a6T\2\u042c\u042e\7\16\2\2\u042d"+
		"\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\7\4"+
		"\2\2\u0430\u0431\5> \2\u0431\u0432\7\5\2\2\u0432\'\3\2\2\2\u0433\u0434"+
		"\7\u0090\2\2\u0434\u0435\5\u00a4S\2\u0435)\3\2\2\2\u0436\u0437\7\4\2\2"+
		"\u0437\u043c\5,\27\2\u0438\u0439\7\6\2\2\u0439\u043b\5,\27\2\u043a\u0438"+
		"\3\2\2\2\u043b\u043e\3\2\2\2\u043c\u043a\3\2\2\2\u043c\u043d\3\2\2\2\u043d"+
		"\u043f\3\2\2\2\u043e\u043c\3\2\2\2\u043f\u0440\7\5\2\2\u0440+\3\2\2\2"+
		"\u0441\u0446\5.\30\2\u0442\u0444\7t\2\2\u0443\u0442\3\2\2\2\u0443\u0444"+
		"\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0447\5\60\31\2\u0446\u0443\3\2\2\2"+
		"\u0446\u0447\3\2\2\2\u0447-\3\2\2\2\u0448\u044d\5\u00a6T\2\u0449\u044a"+
		"\7\7\2\2\u044a\u044c\5\u00a6T\2\u044b\u0449\3\2\2\2\u044c\u044f\3\2\2"+
		"\2\u044d\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0452\3\2\2\2\u044f\u044d"+
		"\3\2\2\2\u0450\u0452\7\u00df\2\2\u0451\u0448\3\2\2\2\u0451\u0450\3\2\2"+
		"\2\u0452/\3\2\2\2\u0453\u0458\7\u00e4\2\2\u0454\u0458\7\u00e5\2\2\u0455"+
		"\u0458\5\u008aF\2\u0456\u0458\7\u00df\2\2\u0457\u0453\3\2\2\2\u0457\u0454"+
		"\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0456\3\2\2\2\u0458\61\3\2\2\2\u0459"+
		"\u045a\7\4\2\2\u045a\u045f\5\u0082B\2\u045b\u045c\7\6\2\2\u045c\u045e"+
		"\5\u0082B\2\u045d\u045b\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2"+
		"\2\u045f\u0460\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0463"+
		"\7\5\2\2\u0463\63\3\2\2\2\u0464\u0465\7\4\2\2\u0465\u046a\5\62\32\2\u0466"+
		"\u0467\7\6\2\2\u0467\u0469\5\62\32\2\u0468\u0466\3\2\2\2\u0469\u046c\3"+
		"\2\2\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046d\3\2\2\2\u046c"+
		"\u046a\3\2\2\2\u046d\u046e\7\5\2\2\u046e\65\3\2\2\2\u046f\u0470\7\u00ad"+
		"\2\2\u0470\u0471\7\16\2\2\u0471\u0476\58\35\2\u0472\u0473\7\u00ad\2\2"+
		"\u0473\u0474\7\23\2\2\u0474\u0476\5:\36\2\u0475\u046f\3\2\2\2\u0475\u0472"+
		"\3\2\2\2\u0476\67\3\2\2\2\u0477\u0478\7\u00bd\2\2\u0478\u0479\7\u00df"+
		"\2\2\u0479\u047a\7\u00be\2\2\u047a\u047d\7\u00df\2\2\u047b\u047d\5\u00a6"+
		"T\2\u047c\u0477\3\2\2\2\u047c\u047b\3\2\2\2\u047d9\3\2\2\2\u047e\u0482"+
		"\7\u00df\2\2\u047f\u0480\7H\2\2\u0480\u0481\7\u0092\2\2\u0481\u0483\5"+
		"*\26\2\u0482\u047f\3\2\2\2\u0482\u0483\3\2\2\2\u0483;\3\2\2\2\u0484\u0485"+
		"\5\u00a6T\2\u0485\u0486\7\u00df\2\2\u0486=\3\2\2\2\u0487\u0489\5\30\r"+
		"\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b"+
		"\5D#\2\u048b\u048c\5@!\2\u048c\u0494\3\2\2\2\u048d\u048f\5L\'\2\u048e"+
		"\u0490\5B\"\2\u048f\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u048f\3\2"+
		"\2\2\u0491\u0492\3\2\2\2\u0492\u0494\3\2\2\2\u0493\u0488\3\2\2\2\u0493"+
		"\u048d\3\2\2\2\u0494?\3\2\2\2\u0495\u0496\7\30\2\2\u0496\u0497\7\23\2"+
		"\2\u0497\u049c\5H%\2\u0498\u0499\7\6\2\2\u0499\u049b\5H%\2\u049a\u0498"+
		"\3\2\2\2\u049b\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049c\u049d\3\2\2\2\u049d"+
		"\u04a0\3\2\2\2\u049e\u049c\3\2\2\2\u049f\u0495\3\2\2\2\u049f\u04a0\3\2"+
		"\2\2\u04a0\u04ab\3\2\2\2\u04a1\u04a2\7\u008b\2\2\u04a2\u04a3\7\23\2\2"+
		"\u04a3\u04a8\5v<\2\u04a4\u04a5\7\6\2\2\u04a5\u04a7\5v<\2\u04a6\u04a4\3"+
		"\2\2\2\u04a7\u04aa\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9"+
		"\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04ab\u04a1\3\2\2\2\u04ab\u04ac\3\2"+
		"\2\2\u04ac\u04b7\3\2\2\2\u04ad\u04ae\7\u008c\2\2\u04ae\u04af\7\23\2\2"+
		"\u04af\u04b4\5v<\2\u04b0\u04b1\7\6\2\2\u04b1\u04b3\5v<\2\u04b2\u04b0\3"+
		"\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u04b8\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04ad\3\2\2\2\u04b7\u04b8\3\2"+
		"\2\2\u04b8\u04c3\3\2\2\2\u04b9\u04ba\7\u008a\2\2\u04ba\u04bb\7\23\2\2"+
		"\u04bb\u04c0\5H%\2\u04bc\u04bd\7\6\2\2\u04bd\u04bf\5H%\2\u04be\u04bc\3"+
		"\2\2\2\u04bf\u04c2\3\2\2\2\u04c0\u04be\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1"+
		"\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c3\u04b9\3\2\2\2\u04c3\u04c4\3\2"+
		"\2\2\u04c4\u04c6\3\2\2\2\u04c5\u04c7\5\u009aN\2\u04c6\u04c5\3\2\2\2\u04c6"+
		"\u04c7\3\2\2\2\u04c7\u04ca\3\2\2\2\u04c8\u04c9\7\32\2\2\u04c9\u04cb\5"+
		"v<\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cbA\3\2\2\2\u04cc\u04ce"+
		"\5\30\r\2\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2"+
		"\u04cf\u04d0\5J&\2\u04d0\u04d1\5@!\2\u04d1C\3\2\2\2\u04d2\u04d3\b#\1\2"+
		"\u04d3\u04d4\5F$\2\u04d4\u04dd\3\2\2\2\u04d5\u04d6\f\3\2\2\u04d6\u04d8"+
		"\t\t\2\2\u04d7\u04d9\5T+\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04da\3\2\2\2\u04da\u04dc\5D#\4\u04db\u04d5\3\2\2\2\u04dc\u04df\3\2\2"+
		"\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04deE\3\2\2\2\u04df\u04dd"+
		"\3\2\2\2\u04e0\u04e9\5J&\2\u04e1\u04e2\7K\2\2\u04e2\u04e9\5p9\2\u04e3"+
		"\u04e9\5l\67\2\u04e4\u04e5\7\4\2\2\u04e5\u04e6\5> \2\u04e6\u04e7\7\5\2"+
		"\2\u04e7\u04e9\3\2\2\2\u04e8\u04e0\3\2\2\2\u04e8\u04e1\3\2\2\2\u04e8\u04e3"+
		"\3\2\2\2\u04e8\u04e4\3\2\2\2\u04e9G\3\2\2\2\u04ea\u04ec\5v<\2\u04eb\u04ed"+
		"\t\n\2\2\u04ec\u04eb\3\2\2\2\u04ec\u04ed\3\2\2\2\u04edI\3\2\2\2\u04ee"+
		"\u04ef\7\13\2\2\u04ef\u04f0\7\u008e\2\2\u04f0\u04f1\7\4\2\2\u04f1\u04f2"+
		"\5t;\2\u04f2\u04f3\7\5\2\2\u04f3\u04f9\3\2\2\2\u04f4\u04f5\7h\2\2\u04f5"+
		"\u04f9\5t;\2\u04f6\u04f7\7\u008f\2\2\u04f7\u04f9\5t;\2\u04f8\u04ee\3\2"+
		"\2\2\u04f8\u04f4\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9\u04fb\3\2\2\2\u04fa"+
		"\u04fc\5n8\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04ff\3\2\2"+
		"\2\u04fd\u04fe\7\u0094\2\2\u04fe\u0500\7\u00df\2\2\u04ff\u04fd\3\2\2\2"+
		"\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\7\u0090\2\2\u0502"+
		"\u050f\7\u00df\2\2\u0503\u050d\7\16\2\2\u0504\u050e\5`\61\2\u0505\u050e"+
		"\5\u0094K\2\u0506\u0509\7\4\2\2\u0507\u050a\5`\61\2\u0508\u050a\5\u0094"+
		"K\2\u0509\u0507\3\2\2\2\u0509\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b"+
		"\u050c\7\5\2\2\u050c\u050e\3\2\2\2\u050d\u0504\3\2\2\2\u050d\u0505\3\2"+
		"\2\2\u050d\u0506\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u0503\3\2\2\2\u050f"+
		"\u0510\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u0513\5n8\2\u0512\u0511\3\2\2"+
		"\2\u0512\u0513\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0515\7\u0093\2\2\u0515"+
		"\u0517\7\u00df\2\2\u0516\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519"+
		"\3\2\2\2\u0518\u051a\5L\'\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a"+
		"\u051d\3\2\2\2\u051b\u051c\7\21\2\2\u051c\u051e\5x=\2\u051d\u051b\3\2"+
		"\2\2\u051d\u051e\3\2\2\2\u051e\u0546\3\2\2\2\u051f\u0521\7\13\2\2\u0520"+
		"\u0522\5T+\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2"+
		"\2\u0523\u0525\5t;\2\u0524\u0526\5L\'\2\u0525\u0524\3\2\2\2\u0525\u0526"+
		"\3\2\2\2\u0526\u0530\3\2\2\2\u0527\u052d\5L\'\2\u0528\u052a\7\13\2\2\u0529"+
		"\u052b\5T+\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\3\2\2"+
		"\2\u052c\u052e\5t;\2\u052d\u0528\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0530"+
		"\3\2\2\2\u052f\u051f\3\2\2\2\u052f\u0527\3\2\2\2\u0530\u0534\3\2\2\2\u0531"+
		"\u0533\5R*\2\u0532\u0531\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2"+
		"\2\u0534\u0535\3\2\2\2\u0535\u0539\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u0538"+
		"\7\21\2\2\u0538\u053a\5x=\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a"+
		"\u053c\3\2\2\2\u053b\u053d\5N(\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2"+
		"\2\u053d\u0540\3\2\2\2\u053e\u053f\7\31\2\2\u053f\u0541\5x=\2\u0540\u053e"+
		"\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542\u0544\5\u009aN"+
		"\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0546\3\2\2\2\u0545\u04f8"+
		"\3\2\2\2\u0545\u052f\3\2\2\2\u0546K\3\2\2\2\u0547\u0548\7\f\2\2\u0548"+
		"\u054d\5V,\2\u0549\u054a\7\6\2\2\u054a\u054c\5V,\2\u054b\u0549\3\2\2\2"+
		"\u054c\u054f\3\2\2\2\u054d\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0553"+
		"\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u0552\5R*\2\u0551\u0550\3\2\2\2\u0552"+
		"\u0555\3\2\2\2\u0553\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554M\3\2\2\2"+
		"\u0555\u0553\3\2\2\2\u0556\u0557\7\22\2\2\u0557\u0558\7\23\2\2\u0558\u055d"+
		"\5v<\2\u0559\u055a\7\6\2\2\u055a\u055c\5v<\2\u055b\u0559\3\2\2\2\u055c"+
		"\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0571\3\2"+
		"\2\2\u055f\u055d\3\2\2\2\u0560\u0561\7H\2\2\u0561\u0572\7\27\2\2\u0562"+
		"\u0563\7H\2\2\u0563\u0572\7\26\2\2\u0564\u0565\7\24\2\2\u0565\u0566\7"+
		"\25\2\2\u0566\u0567\7\4\2\2\u0567\u056c\5P)\2\u0568\u0569\7\6\2\2\u0569"+
		"\u056b\5P)\2\u056a\u0568\3\2\2\2\u056b\u056e\3\2\2\2\u056c\u056a\3\2\2"+
		"\2\u056c\u056d\3\2\2\2\u056d\u056f\3\2\2\2\u056e\u056c\3\2\2\2\u056f\u0570"+
		"\7\5\2\2\u0570\u0572\3\2\2\2\u0571\u0560\3\2\2\2\u0571\u0562\3\2\2\2\u0571"+
		"\u0564\3\2\2\2\u0571\u0572\3\2\2\2\u0572O\3\2\2\2\u0573\u057c\7\4\2\2"+
		"\u0574\u0579\5v<\2\u0575\u0576\7\6\2\2\u0576\u0578\5v<\2\u0577\u0575\3"+
		"\2\2\2\u0578\u057b\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a"+
		"\u057d\3\2\2\2\u057b\u0579\3\2\2\2\u057c\u0574\3\2\2\2\u057c\u057d\3\2"+
		"\2\2\u057d\u057e\3\2\2\2\u057e\u0581\7\5\2\2\u057f\u0581\5v<\2\u0580\u0573"+
		"\3\2\2\2\u0580\u057f\3\2\2\2\u0581Q\3\2\2\2\u0582\u0583\7=\2\2\u0583\u0585"+
		"\7L\2\2\u0584\u0586\7\65\2\2\u0585\u0584\3\2\2\2\u0585\u0586\3\2\2\2\u0586"+
		"\u0587\3\2\2\2\u0587\u0588\5\u00a4S\2\u0588\u0591\7\4\2\2\u0589\u058e"+
		"\5v<\2\u058a\u058b\7\6\2\2\u058b\u058d\5v<\2\u058c\u058a\3\2\2\2\u058d"+
		"\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0592\3\2"+
		"\2\2\u0590\u058e\3\2\2\2\u0591\u0589\3\2\2\2\u0591\u0592\3\2\2\2\u0592"+
		"\u0593\3\2\2\2\u0593\u0594\7\5\2\2\u0594\u05a0\5\u00a6T\2\u0595\u0597"+
		"\7\16\2\2\u0596\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2\2"+
		"\u0598\u059d\5\u00a6T\2\u0599\u059a\7\6\2\2\u059a\u059c\5\u00a6T\2\u059b"+
		"\u0599\3\2\2\2\u059c\u059f\3\2\2\2\u059d\u059b\3\2\2\2\u059d\u059e\3\2"+
		"\2\2\u059e\u05a1\3\2\2\2\u059f\u059d\3\2\2\2\u05a0\u0596\3\2\2\2\u05a0"+
		"\u05a1\3\2\2\2\u05a1S\3\2\2\2\u05a2\u05a3\t\13\2\2\u05a3U\3\2\2\2\u05a4"+
		"\u05a5\b,\1\2\u05a5\u05a6\5j\66\2\u05a6\u05ba\3\2\2\2\u05a7\u05b6\f\4"+
		"\2\2\u05a8\u05ab\7\64\2\2\u05a9\u05ab\5X-\2\u05aa\u05a8\3\2\2\2\u05aa"+
		"\u05a9\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\7\63\2\2\u05ad\u05af\5"+
		"V,\2\u05ae\u05b0\5Z.\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b7"+
		"\3\2\2\2\u05b1\u05b2\7;\2\2\u05b2\u05b3\5X-\2\u05b3\u05b4\7\63\2\2\u05b4"+
		"\u05b5\5V,\2\u05b5\u05b7\3\2\2\2\u05b6\u05aa\3\2\2\2\u05b6\u05b1\3\2\2"+
		"\2\u05b7\u05b9\3\2\2\2\u05b8\u05a7\3\2\2\2\u05b9\u05bc\3\2\2\2\u05ba\u05b8"+
		"\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bbW\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bd"+
		"\u05bf\7\66\2\2\u05be\u05bd\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05d3\3"+
		"\2\2\2\u05c0\u05c2\7\67\2\2\u05c1\u05c3\7\65\2\2\u05c2\u05c1\3\2\2\2\u05c2"+
		"\u05c3\3\2\2\2\u05c3\u05d3\3\2\2\2\u05c4\u05c5\7\67\2\2\u05c5\u05d3\7"+
		"8\2\2\u05c6\u05c8\79\2\2\u05c7\u05c9\7\65\2\2\u05c8\u05c7\3\2\2\2\u05c8"+
		"\u05c9\3\2\2\2\u05c9\u05d3\3\2\2\2\u05ca\u05cc\7:\2\2\u05cb\u05cd\7\65"+
		"\2\2\u05cc\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05d3\3\2\2\2\u05ce"+
		"\u05d0\7\67\2\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\3"+
		"\2\2\2\u05d1\u05d3\7\u00dc\2\2\u05d2\u05be\3\2\2\2\u05d2\u05c0\3\2\2\2"+
		"\u05d2\u05c4\3\2\2\2\u05d2\u05c6\3\2\2\2\u05d2\u05ca\3\2\2\2\u05d2\u05cf"+
		"\3\2\2\2\u05d3Y\3\2\2\2\u05d4\u05d5\7<\2\2\u05d5\u05e3\5x=\2\u05d6\u05d7"+
		"\7\u0090\2\2\u05d7\u05d8\7\4\2\2\u05d8\u05dd\5\u00a6T\2\u05d9\u05da\7"+
		"\6\2\2\u05da\u05dc\5\u00a6T\2\u05db\u05d9\3\2\2\2\u05dc\u05df\3\2\2\2"+
		"\u05dd\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e0\3\2\2\2\u05df\u05dd"+
		"\3\2\2\2\u05e0\u05e1\7\5\2\2\u05e1\u05e3\3\2\2\2\u05e2\u05d4\3\2\2\2\u05e2"+
		"\u05d6\3\2\2\2\u05e3[\3\2\2\2\u05e4\u05e5\7c\2\2\u05e5\u05fb\7\4\2\2\u05e6"+
		"\u05e7\t\f\2\2\u05e7\u05fc\7\u0086\2\2\u05e8\u05e9\5v<\2\u05e9\u05ea\7"+
		"B\2\2\u05ea\u05fc\3\2\2\2\u05eb\u05fc\7\u00e3\2\2\u05ec\u05ed\7\u0087"+
		"\2\2\u05ed\u05ee\7\u00e4\2\2\u05ee\u05ef\7\u0088\2\2\u05ef\u05f0\7\u0089"+
		"\2\2\u05f0\u05f9\7\u00e4\2\2\u05f1\u05f7\7<\2\2\u05f2\u05f8\5\u00a6T\2"+
		"\u05f3\u05f4\5\u00a4S\2\u05f4\u05f5\7\4\2\2\u05f5\u05f6\7\5\2\2\u05f6"+
		"\u05f8\3\2\2\2\u05f7\u05f2\3\2\2\2\u05f7\u05f3\3\2\2\2\u05f8\u05fa\3\2"+
		"\2\2\u05f9\u05f1\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fc\3\2\2\2\u05fb"+
		"\u05e6\3\2\2\2\u05fb\u05e8\3\2\2\2\u05fb\u05eb\3\2\2\2\u05fb\u05ec\3\2"+
		"\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\7\5\2\2\u05fe]\3\2\2\2\u05ff\u0600"+
		"\7\4\2\2\u0600\u0601\5`\61\2\u0601\u0602\7\5\2\2\u0602_\3\2\2\2\u0603"+
		"\u0608\5\u00a6T\2\u0604\u0605\7\6\2\2\u0605\u0607\5\u00a6T\2\u0606\u0604"+
		"\3\2\2\2\u0607\u060a\3\2\2\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609"+
		"a\3\2\2\2\u060a\u0608\3\2\2\2\u060b\u060c\7\4\2\2\u060c\u0611\5d\63\2"+
		"\u060d\u060e\7\6\2\2\u060e\u0610\5d\63\2\u060f\u060d\3\2\2\2\u0610\u0613"+
		"\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0614\3\2\2\2\u0613"+
		"\u0611\3\2\2\2\u0614\u0615\7\5\2\2\u0615c\3\2\2\2\u0616\u0618\5\u00a6"+
		"T\2\u0617\u0619\t\n\2\2\u0618\u0617\3\2\2\2\u0618\u0619\3\2\2\2\u0619"+
		"e\3\2\2\2\u061a\u061b\7\4\2\2\u061b\u0620\5h\65\2\u061c\u061d\7\6\2\2"+
		"\u061d\u061f\5h\65\2\u061e\u061c\3\2\2\2\u061f\u0622\3\2\2\2\u0620\u061e"+
		"\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0623\3\2\2\2\u0622\u0620\3\2\2\2\u0623"+
		"\u0624\7\5\2\2\u0624g\3\2\2\2\u0625\u0628\5\u00a6T\2\u0626\u0627\7j\2"+
		"\2\u0627\u0629\7\u00df\2\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629"+
		"i\3\2\2\2\u062a\u062c\5p9\2\u062b\u062d\5\\/\2\u062c\u062b\3\2\2\2\u062c"+
		"\u062d\3\2\2\2\u062d\u0632\3\2\2\2\u062e\u0630\7\16\2\2\u062f\u062e\3"+
		"\2\2\2\u062f\u0630\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0633\5\u00a8U\2"+
		"\u0632\u062f\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u064e\3\2\2\2\u0634\u0635"+
		"\7\4\2\2\u0635\u0636\5> \2\u0636\u0638\7\5\2\2\u0637\u0639\5\\/\2\u0638"+
		"\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063e\3\2\2\2\u063a\u063c\7\16"+
		"\2\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063d\3\2\2\2\u063d"+
		"\u063f\5\u00a8U\2\u063e\u063b\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u064e"+
		"\3\2\2\2\u0640\u0641\7\4\2\2\u0641\u0642\5V,\2\u0642\u0644\7\5\2\2\u0643"+
		"\u0645\5\\/\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u064a\3\2"+
		"\2\2\u0646\u0648\7\16\2\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648"+
		"\u0649\3\2\2\2\u0649\u064b\5\u00a8U\2\u064a\u0647\3\2\2\2\u064a\u064b"+
		"\3\2\2\2\u064b\u064e\3\2\2\2\u064c\u064e\5l\67\2\u064d\u062a\3\2\2\2\u064d"+
		"\u0634\3\2\2\2\u064d\u0640\3\2\2\2\u064d\u064c\3\2\2\2\u064ek\3\2\2\2"+
		"\u064f\u0650\7I\2\2\u0650\u0655\5v<\2\u0651\u0652\7\6\2\2\u0652\u0654"+
		"\5v<\2\u0653\u0651\3\2\2\2\u0654\u0657\3\2\2\2\u0655\u0653\3\2\2\2\u0655"+
		"\u0656\3\2\2\2\u0656\u065f\3\2\2\2\u0657\u0655\3\2\2\2\u0658\u065a\7\16"+
		"\2\2\u0659\u0658\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065b\3\2\2\2\u065b"+
		"\u065d\5\u00a6T\2\u065c\u065e\5^\60\2\u065d\u065c\3\2\2\2\u065d\u065e"+
		"\3\2\2\2\u065e\u0660\3\2\2\2\u065f\u0659\3\2\2\2\u065f\u0660\3\2\2\2\u0660"+
		"m\3\2\2\2\u0661\u0662\7G\2\2\u0662\u0663\7S\2\2\u0663\u0664\7\u0091\2"+
		"\2\u0664\u0668\7\u00df\2\2\u0665\u0666\7H\2\2\u0666\u0667\7\u0092\2\2"+
		"\u0667\u0669\5*\26\2\u0668\u0665\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u0693"+
		"\3\2\2\2\u066a\u066b\7G\2\2\u066b\u066c\7S\2\2\u066c\u0676\7\u0095\2\2"+
		"\u066d\u066e\7\u0096\2\2\u066e\u066f\7\u0097\2\2\u066f\u0670\7\23\2\2"+
		"\u0670\u0674\7\u00df\2\2\u0671\u0672\7\u009b\2\2\u0672\u0673\7\23\2\2"+
		"\u0673\u0675\7\u00df\2\2\u0674\u0671\3\2\2\2\u0674\u0675\3\2\2\2\u0675"+
		"\u0677\3\2\2\2\u0676\u066d\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u067d\3\2"+
		"\2\2\u0678\u0679\7\u0098\2\2\u0679\u067a\7\u0099\2\2\u067a\u067b\7\u0097"+
		"\2\2\u067b\u067c\7\23\2\2\u067c\u067e\7\u00df\2\2\u067d\u0678\3\2\2\2"+
		"\u067d\u067e\3\2\2\2\u067e\u0684\3\2\2\2\u067f\u0680\7h\2\2\u0680\u0681"+
		"\7\u009a\2\2\u0681\u0682\7\u0097\2\2\u0682\u0683\7\23\2\2\u0683\u0685"+
		"\7\u00df\2\2\u0684\u067f\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u068a\3\2\2"+
		"\2\u0686\u0687\7\u009c\2\2\u0687\u0688\7\u0097\2\2\u0688\u0689\7\23\2"+
		"\2\u0689\u068b\7\u00df\2\2\u068a\u0686\3\2\2\2\u068a\u068b\3\2\2\2\u068b"+
		"\u0690\3\2\2\2\u068c\u068d\7&\2\2\u068d\u068e\7\u00c9\2\2\u068e\u068f"+
		"\7\16\2\2\u068f\u0691\7\u00df\2\2\u0690\u068c\3\2\2\2\u0690\u0691\3\2"+
		"\2\2\u0691\u0693\3\2\2\2\u0692\u0661\3\2\2\2\u0692\u066a\3\2\2\2\u0693"+
		"o\3\2\2\2\u0694\u0695\5\u00a6T\2\u0695\u0696\7\7\2\2\u0696\u0698\3\2\2"+
		"\2\u0697\u0694\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069a"+
		"\5\u00a6T\2\u069aq\3\2\2\2\u069b\u06a3\5v<\2\u069c\u069e\7\16\2\2\u069d"+
		"\u069c\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06a1\3\2\2\2\u069f\u06a2\5\u00a6"+
		"T\2\u06a0\u06a2\5^\60\2\u06a1\u069f\3\2\2\2\u06a1\u06a0\3\2\2\2\u06a2"+
		"\u06a4\3\2\2\2\u06a3\u069d\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4s\3\2\2\2"+
		"\u06a5\u06aa\5r:\2\u06a6\u06a7\7\6\2\2\u06a7\u06a9\5r:\2\u06a8\u06a6\3"+
		"\2\2\2\u06a9\u06ac\3\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab"+
		"u\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ad\u06ae\5x=\2\u06aew\3\2\2\2\u06af\u06b0"+
		"\b=\1\2\u06b0\u06b1\7\37\2\2\u06b1\u06b9\5x=\7\u06b2\u06b9\5z>\2\u06b3"+
		"\u06b4\7!\2\2\u06b4\u06b5\7\4\2\2\u06b5\u06b6\5\26\f\2\u06b6\u06b7\7\5"+
		"\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06af\3\2\2\2\u06b8\u06b2\3\2\2\2\u06b8"+
		"\u06b3\3\2\2\2\u06b9\u06c2\3\2\2\2\u06ba\u06bb\f\5\2\2\u06bb\u06bc\7\35"+
		"\2\2\u06bc\u06c1\5x=\6\u06bd\u06be\f\4\2\2\u06be\u06bf\7\34\2\2\u06bf"+
		"\u06c1\5x=\5\u06c0\u06ba\3\2\2\2\u06c0\u06bd\3\2\2\2\u06c1\u06c4\3\2\2"+
		"\2\u06c2\u06c0\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3y\3\2\2\2\u06c4\u06c2"+
		"\3\2\2\2\u06c5\u06c7\5~@\2\u06c6\u06c8\5|?\2\u06c7\u06c6\3\2\2\2\u06c7"+
		"\u06c8\3\2\2\2\u06c8{\3\2\2\2\u06c9\u06cb\7\37\2\2\u06ca\u06c9\3\2\2\2"+
		"\u06ca\u06cb\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06cd\7\"\2\2\u06cd\u06ce"+
		"\5~@\2\u06ce\u06cf\7\35\2\2\u06cf\u06d0\5~@\2\u06d0\u06f3\3\2\2\2\u06d1"+
		"\u06d3\7\37\2\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d4\3"+
		"\2\2\2\u06d4\u06d5\7\36\2\2\u06d5\u06d6\7\4\2\2\u06d6\u06db\5v<\2\u06d7"+
		"\u06d8\7\6\2\2\u06d8\u06da\5v<\2\u06d9\u06d7\3\2\2\2\u06da\u06dd\3\2\2"+
		"\2\u06db\u06d9\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06de\3\2\2\2\u06dd\u06db"+
		"\3\2\2\2\u06de\u06df\7\5\2\2\u06df\u06f3\3\2\2\2\u06e0\u06e2\7\37\2\2"+
		"\u06e1\u06e0\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e4"+
		"\7\36\2\2\u06e4\u06e5\7\4\2\2\u06e5\u06e6\5\26\f\2\u06e6\u06e7\7\5\2\2"+
		"\u06e7\u06f3\3\2\2\2\u06e8\u06ea\7\37\2\2\u06e9\u06e8\3\2\2\2\u06e9\u06ea"+
		"\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\t\r\2\2\u06ec\u06f3\5~@\2\u06ed"+
		"\u06ef\7%\2\2\u06ee\u06f0\7\37\2\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2"+
		"\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f3\7&\2\2\u06f2\u06ca\3\2\2\2\u06f2"+
		"\u06d2\3\2\2\2\u06f2\u06e1\3\2\2\2\u06f2\u06e9\3\2\2\2\u06f2\u06ed\3\2"+
		"\2\2\u06f3}\3\2\2\2\u06f4\u06f5\b@\1\2\u06f5\u06f9\5\u0080A\2\u06f6\u06f7"+
		"\t\16\2\2\u06f7\u06f9\5~@\t\u06f8\u06f4\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f9"+
		"\u070f\3\2\2\2\u06fa\u06fb\f\b\2\2\u06fb\u06fc\t\17\2\2\u06fc\u070e\5"+
		"~@\t\u06fd\u06fe\f\7\2\2\u06fe\u06ff\t\20\2\2\u06ff\u070e\5~@\b\u0700"+
		"\u0701\f\6\2\2\u0701\u0702\7\u0083\2\2\u0702\u070e\5~@\7\u0703\u0704\f"+
		"\5\2\2\u0704\u0705\7\u0085\2\2\u0705\u070e\5~@\6\u0706\u0707\f\4\2\2\u0707"+
		"\u0708\7\u0084\2\2\u0708\u070e\5~@\5\u0709\u070a\f\3\2\2\u070a\u070b\5"+
		"\u0084C\2\u070b\u070c\5~@\4\u070c\u070e\3\2\2\2\u070d\u06fa\3\2\2\2\u070d"+
		"\u06fd\3\2\2\2\u070d\u0700\3\2\2\2\u070d\u0703\3\2\2\2\u070d\u0706\3\2"+
		"\2\2\u070d\u0709\3\2\2\2\u070e\u0711\3\2\2\2\u070f\u070d\3\2\2\2\u070f"+
		"\u0710\3\2\2\2\u0710\177\3\2\2\2\u0711\u070f\3\2\2\2\u0712\u0713\bA\1"+
		"\2\u0713\u0761\5\u0082B\2\u0714\u0761\7~\2\2\u0715\u0716\5\u00a4S\2\u0716"+
		"\u0717\7\7\2\2\u0717\u0718\7~\2\2\u0718\u0761\3\2\2\2\u0719\u071a\7\4"+
		"\2\2\u071a\u071d\5v<\2\u071b\u071c\7\6\2\2\u071c\u071e\5v<\2\u071d\u071b"+
		"\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u071d\3\2\2\2\u071f\u0720\3\2\2\2\u0720"+
		"\u0721\3\2\2\2\u0721\u0722\7\5\2\2\u0722\u0761\3\2\2\2\u0723\u0724\5\u00a4"+
		"S\2\u0724\u0730\7\4\2\2\u0725\u0727\5T+\2\u0726\u0725\3\2\2\2\u0726\u0727"+
		"\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u072d\5v<\2\u0729\u072a\7\6\2\2\u072a"+
		"\u072c\5v<\2\u072b\u0729\3\2\2\2\u072c\u072f\3\2\2\2\u072d\u072b\3\2\2"+
		"\2\u072d\u072e\3\2\2\2\u072e\u0731\3\2\2\2\u072f\u072d\3\2\2\2\u0730\u0726"+
		"\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0735\7\5\2\2\u0733"+
		"\u0734\7?\2\2\u0734\u0736\5\u009eP\2\u0735\u0733\3\2\2\2\u0735\u0736\3"+
		"\2\2\2\u0736\u0761\3\2\2\2\u0737\u0738\7\4\2\2\u0738\u0739\5\26\f\2\u0739"+
		"\u073a\7\5\2\2\u073a\u0761\3\2\2\2\u073b\u073c\7.\2\2\u073c\u073e\5~@"+
		"\2\u073d\u073f\5\u0098M\2\u073e\u073d\3\2\2\2\u073f\u0740\3\2\2\2\u0740"+
		"\u073e\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0744\3\2\2\2\u0742\u0743\7\61"+
		"\2\2\u0743\u0745\5v<\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0746"+
		"\3\2\2\2\u0746\u0747\7\62\2\2\u0747\u0761\3\2\2\2\u0748\u074a\7.\2\2\u0749"+
		"\u074b\5\u0098M\2\u074a\u0749\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u074a"+
		"\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u0750\3\2\2\2\u074e\u074f\7\61\2\2"+
		"\u074f\u0751\5v<\2\u0750\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0752"+
		"\3\2\2\2\u0752\u0753\7\62\2\2\u0753\u0761\3\2\2\2\u0754\u0755\7V\2\2\u0755"+
		"\u0756\7\4\2\2\u0756\u0757\5v<\2\u0757\u0758\7\16\2\2\u0758\u0759\5\u0092"+
		"J\2\u0759\u075a\7\5\2\2\u075a\u0761\3\2\2\2\u075b\u0761\5\u00a6T\2\u075c"+
		"\u075d\7\4\2\2\u075d\u075e\5v<\2\u075e\u075f\7\5\2\2\u075f\u0761\3\2\2"+
		"\2\u0760\u0712\3\2\2\2\u0760\u0714\3\2\2\2\u0760\u0715\3\2\2\2\u0760\u0719"+
		"\3\2\2\2\u0760\u0723\3\2\2\2\u0760\u0737\3\2\2\2\u0760\u073b\3\2\2\2\u0760"+
		"\u0748\3\2\2\2\u0760\u0754\3\2\2\2\u0760\u075b\3\2\2\2\u0760\u075c\3\2"+
		"\2\2\u0761\u076c\3\2\2\2\u0762\u0763\f\6\2\2\u0763\u0764\7\b\2\2\u0764"+
		"\u0765\5~@\2\u0765\u0766\7\t\2\2\u0766\u076b\3\2\2\2\u0767\u0768\f\4\2"+
		"\2\u0768\u0769\7\7\2\2\u0769\u076b\5\u00a6T\2\u076a\u0762\3\2\2\2\u076a"+
		"\u0767\3\2\2\2\u076b\u076e\3\2\2\2\u076c\u076a\3\2\2\2\u076c\u076d\3\2"+
		"\2\2\u076d\u0081\3\2\2\2\u076e\u076c\3\2\2\2\u076f\u077c\7&\2\2\u0770"+
		"\u077c\5\u008cG\2\u0771\u0772\5\u00a6T\2\u0772\u0773\7\u00df\2\2\u0773"+
		"\u077c\3\2\2\2\u0774\u077c\5\u00acW\2\u0775\u077c\5\u008aF\2\u0776\u0778"+
		"\7\u00df\2\2\u0777\u0776\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u0777\3\2\2"+
		"\2\u0779\u077a\3\2\2\2\u077a\u077c\3\2\2\2\u077b\u076f\3\2\2\2\u077b\u0770"+
		"\3\2\2\2\u077b\u0771\3\2\2\2\u077b\u0774\3\2\2\2\u077b\u0775\3\2\2\2\u077b"+
		"\u0777\3\2\2\2\u077c\u0083\3\2\2\2\u077d\u077e\t\21\2\2\u077e\u0085\3"+
		"\2\2\2\u077f\u0780\t\22\2\2\u0780\u0087\3\2\2\2\u0781\u0782\t\23\2\2\u0782"+
		"\u0089\3\2\2\2\u0783\u0784\t\24\2\2\u0784\u008b\3\2\2\2\u0785\u0789\7"+
		"-\2\2\u0786\u0788\5\u008eH\2\u0787\u0786\3\2\2\2\u0788\u078b\3\2\2\2\u0789"+
		"\u0787\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u008d\3\2\2\2\u078b\u0789\3\2"+
		"\2\2\u078c\u078d\5\u0090I\2\u078d\u0790\5\u00a6T\2\u078e\u078f\7b\2\2"+
		"\u078f\u0791\5\u00a6T\2\u0790\u078e\3\2\2\2\u0790\u0791\3\2\2\2\u0791"+
		"\u008f\3\2\2\2\u0792\u0794\t\20\2\2\u0793\u0792\3\2\2\2\u0793\u0794\3"+
		"\2\2\2\u0794\u0795\3\2\2\2\u0795\u0798\t\f\2\2\u0796\u0798\7\u00df\2\2"+
		"\u0797\u0793\3\2\2\2\u0797\u0796\3\2\2\2\u0798\u0091\3\2\2\2\u0799\u079a"+
		"\7g\2\2\u079a\u079b\7x\2\2\u079b\u079c\5\u0092J\2\u079c\u079d\7z\2\2\u079d"+
		"\u07bc\3\2\2\2\u079e\u079f\7h\2\2\u079f\u07a0\7x\2\2\u07a0\u07a1\5\u0092"+
		"J\2\u07a1\u07a2\7\6\2\2\u07a2\u07a3\5\u0092J\2\u07a3\u07a4\7z\2\2\u07a4"+
		"\u07bc\3\2\2\2\u07a5\u07ac\7i\2\2\u07a6\u07a8\7x\2\2\u07a7\u07a9\5\u0094"+
		"K\2\u07a8\u07a7\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa"+
		"\u07ad\7z\2\2\u07ab\u07ad\7v\2\2\u07ac\u07a6\3\2\2\2\u07ac\u07ab\3\2\2"+
		"\2\u07ad\u07bc\3\2\2\2\u07ae\u07b9\5\u00a6T\2\u07af\u07b0\7\4\2\2\u07b0"+
		"\u07b5\7\u00e4\2\2\u07b1\u07b2\7\6\2\2\u07b2\u07b4\7\u00e4\2\2\u07b3\u07b1"+
		"\3\2\2\2\u07b4\u07b7\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6"+
		"\u07b8\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b8\u07ba\7\5\2\2\u07b9\u07af\3\2"+
		"\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07bc\3\2\2\2\u07bb\u0799\3\2\2\2\u07bb"+
		"\u079e\3\2\2\2\u07bb\u07a5\3\2\2\2\u07bb\u07ae\3\2\2\2\u07bc\u0093\3\2"+
		"\2\2\u07bd\u07c2\5\u0096L\2\u07be\u07bf\7\6\2\2\u07bf\u07c1\5\u0096L\2"+
		"\u07c0\u07be\3\2\2\2\u07c1\u07c4\3\2\2\2\u07c2\u07c0\3\2\2\2\u07c2\u07c3"+
		"\3\2\2\2\u07c3\u0095\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c5\u07c7\5\u00a6T"+
		"\2\u07c6\u07c8\7\n\2\2\u07c7\u07c6\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07c9"+
		"\3\2\2\2\u07c9\u07cc\5\u0092J\2\u07ca\u07cb\7j\2\2\u07cb\u07cd\7\u00df"+
		"\2\2\u07cc\u07ca\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u0097\3\2\2\2\u07ce"+
		"\u07cf\7/\2\2\u07cf\u07d0\5v<\2\u07d0\u07d1\7\60\2\2\u07d1\u07d2\5v<\2"+
		"\u07d2\u0099\3\2\2\2\u07d3\u07d4\7>\2\2\u07d4\u07d9\5\u009cO\2\u07d5\u07d6"+
		"\7\6\2\2\u07d6\u07d8\5\u009cO\2\u07d7\u07d5\3\2\2\2\u07d8\u07db\3\2\2"+
		"\2\u07d9\u07d7\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u009b\3\2\2\2\u07db\u07d9"+
		"\3\2\2\2\u07dc\u07dd\5\u00a6T\2\u07dd\u07de\7\16\2\2\u07de\u07df\5\u009e"+
		"P\2\u07df\u009d\3\2\2\2\u07e0\u080b\5\u00a6T\2\u07e1\u0804\7\4\2\2\u07e2"+
		"\u07e3\7\u008b\2\2\u07e3\u07e4\7\23\2\2\u07e4\u07e9\5v<\2\u07e5\u07e6"+
		"\7\6\2\2\u07e6\u07e8\5v<\2\u07e7\u07e5\3\2\2\2\u07e8\u07eb\3\2\2\2\u07e9"+
		"\u07e7\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u0805\3\2\2\2\u07eb\u07e9\3\2"+
		"\2\2\u07ec\u07ed\t\25\2\2\u07ed\u07ee\7\23\2\2\u07ee\u07f3\5v<\2\u07ef"+
		"\u07f0\7\6\2\2\u07f0\u07f2\5v<\2\u07f1\u07ef\3\2\2\2\u07f2\u07f5\3\2\2"+
		"\2\u07f3\u07f1\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f7\3\2\2\2\u07f5\u07f3"+
		"\3\2\2\2\u07f6\u07ec\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u0802\3\2\2\2\u07f8"+
		"\u07f9\t\26\2\2\u07f9\u07fa\7\23\2\2\u07fa\u07ff\5H%\2\u07fb\u07fc\7\6"+
		"\2\2\u07fc\u07fe\5H%\2\u07fd\u07fb\3\2\2\2\u07fe\u0801\3\2\2\2\u07ff\u07fd"+
		"\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0803\3\2\2\2\u0801\u07ff\3\2\2\2\u0802"+
		"\u07f8\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0805\3\2\2\2\u0804\u07e2\3\2"+
		"\2\2\u0804\u07f6\3\2\2\2\u0805\u0807\3\2\2\2\u0806\u0808\5\u00a0Q\2\u0807"+
		"\u0806\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080b\7\5"+
		"\2\2\u080a\u07e0\3\2\2\2\u080a\u07e1\3\2\2\2\u080b\u009f\3\2\2\2\u080c"+
		"\u080d\7A\2\2\u080d\u081d\5\u00a2R\2\u080e\u080f\7B\2\2\u080f\u081d\5"+
		"\u00a2R\2\u0810\u0811\7A\2\2\u0811\u0812\7\"\2\2\u0812\u0813\5\u00a2R"+
		"\2\u0813\u0814\7\35\2\2\u0814\u0815\5\u00a2R\2\u0815\u081d\3\2\2\2\u0816"+
		"\u0817\7B\2\2\u0817\u0818\7\"\2\2\u0818\u0819\5\u00a2R\2\u0819\u081a\7"+
		"\35\2\2\u081a\u081b\5\u00a2R\2\u081b\u081d\3\2\2\2\u081c\u080c\3\2\2\2"+
		"\u081c\u080e\3\2\2\2\u081c\u0810\3\2\2\2\u081c\u0816\3\2\2\2\u081d\u00a1"+
		"\3\2\2\2\u081e\u081f\7C\2\2\u081f\u0826\t\27\2\2\u0820\u0821\7F\2\2\u0821"+
		"\u0826\7G\2\2\u0822\u0823\5v<\2\u0823\u0824\t\27\2\2\u0824\u0826\3\2\2"+
		"\2\u0825\u081e\3\2\2\2\u0825\u0820\3\2\2\2\u0825\u0822\3\2\2\2\u0826\u00a3"+
		"\3\2\2\2\u0827\u082c\5\u00a6T\2\u0828\u0829\7\7\2\2\u0829\u082b\5\u00a6"+
		"T\2\u082a\u0828\3\2\2\2\u082b\u082e\3\2\2\2\u082c\u082a\3\2\2\2\u082c"+
		"\u082d\3\2\2\2\u082d\u00a5\3\2\2\2\u082e\u082c\3\2\2\2\u082f\u083e\5\u00a8"+
		"U\2\u0830\u083e\7\u00dc\2\2\u0831\u083e\7:\2\2\u0832\u083e\7\66\2\2\u0833"+
		"\u083e\7\67\2\2\u0834\u083e\78\2\2\u0835\u083e\79\2\2\u0836\u083e\7;\2"+
		"\2\u0837\u083e\7\63\2\2\u0838\u083e\7\64\2\2\u0839\u083e\7<\2\2\u083a"+
		"\u083e\7_\2\2\u083b\u083e\7a\2\2\u083c\u083e\7`\2\2\u083d\u082f\3\2\2"+
		"\2\u083d\u0830\3\2\2\2\u083d\u0831\3\2\2\2\u083d\u0832\3\2\2\2\u083d\u0833"+
		"\3\2\2\2\u083d\u0834\3\2\2\2\u083d\u0835\3\2\2\2\u083d\u0836\3\2\2\2\u083d"+
		"\u0837\3\2\2\2\u083d\u0838\3\2\2\2\u083d\u0839\3\2\2\2\u083d\u083a\3\2"+
		"\2\2\u083d\u083b\3\2\2\2\u083d\u083c\3\2\2\2\u083e\u00a7\3\2\2\2\u083f"+
		"\u0843\7\u00e8\2\2\u0840\u0843\5\u00aaV\2\u0841\u0843\5\u00aeX\2\u0842"+
		"\u083f\3\2\2\2\u0842\u0840\3\2\2\2\u0842\u0841\3\2\2\2\u0843\u00a9\3\2"+
		"\2\2\u0844\u0845\7\u00e9\2\2\u0845\u00ab\3\2\2\2\u0846\u084e\7\u00e5\2"+
		"\2\u0847\u084e\7\u00e6\2\2\u0848\u084e\7\u00e4\2\2\u0849\u084e\7\u00e0"+
		"\2\2\u084a\u084e\7\u00e1\2\2\u084b\u084e\7\u00e2\2\2\u084c\u084e\7\u00e7"+
		"\2\2\u084d\u0846\3\2\2\2\u084d\u0847\3\2\2\2\u084d\u0848\3\2\2\2\u084d"+
		"\u0849\3\2\2\2\u084d\u084a\3\2\2\2\u084d\u084b\3\2\2\2\u084d\u084c\3\2"+
		"\2\2\u084e\u00ad\3\2\2\2\u084f\u0850\t\30\2\2\u0850\u00af\3\2\2\2\u0125"+
		"\u00b3\u00b9\u00cf\u00d4\u00d7\u00dc\u00e9\u00ed\u00f4\u00f9\u00fe\u0101"+
		"\u0107\u010c\u010f\u0112\u011b\u011f\u0127\u012a\u012d\u0130\u0133\u0136"+
		"\u013a\u013d\u0140\u0147\u0151\u0159\u015b\u0172\u017a\u0182\u0188\u0195"+
		"\u019a\u01a3\u01a8\u01b8\u01bf\u01c3\u01cb\u01d2\u01d9\u01e2\u01e6\u01ec"+
		"\u01f2\u01f5\u01fb\u01ff\u0203\u0208\u020c\u0214\u021d\u0222\u0228\u022e"+
		"\u023a\u023d\u0241\u0246\u024b\u0252\u0255\u0258\u025e\u0267\u026f\u0275"+
		"\u0279\u027d\u0281\u0283\u028c\u0292\u0297\u029b\u029e\u02a7\u02ac\u02b1"+
		"\u02b4\u02be\u02c3\u02c9\u02cf\u02d6\u02de\u02e5\u02ed\u02f0\u02f8\u02fc"+
		"\u0303\u037a\u0382\u038a\u0393\u039c\u03a0\u03a6\u03b2\u03b6\u03b9\u03bf"+
		"\u03c9\u03d5\u03da\u03e0\u03ec\u03ee\u03f3\u03f7\u03f9\u03fd\u0406\u040e"+
		"\u0415\u041b\u041f\u0428\u042d\u043c\u0443\u0446\u044d\u0451\u0457\u045f"+
		"\u046a\u0475\u047c\u0482\u0488\u0491\u0493\u049c\u049f\u04a8\u04ab\u04b4"+
		"\u04b7\u04c0\u04c3\u04c6\u04ca\u04cd\u04d8\u04dd\u04e8\u04ec\u04f8\u04fb"+
		"\u04ff\u0509\u050d\u050f\u0512\u0516\u0519\u051d\u0521\u0525\u052a\u052d"+
		"\u052f\u0534\u0539\u053c\u0540\u0543\u0545\u054d\u0553\u055d\u056c\u0571"+
		"\u0579\u057c\u0580\u0585\u058e\u0591\u0596\u059d\u05a0\u05aa\u05af\u05b6"+
		"\u05ba\u05be\u05c2\u05c8\u05cc\u05cf\u05d2\u05dd\u05e2\u05f7\u05f9\u05fb"+
		"\u0608\u0611\u0618\u0620\u0628\u062c\u062f\u0632\u0638\u063b\u063e\u0644"+
		"\u0647\u064a\u064d\u0655\u0659\u065d\u065f\u0668\u0674\u0676\u067d\u0684"+
		"\u068a\u0690\u0692\u0697\u069d\u06a1\u06a3\u06aa\u06b8\u06c0\u06c2\u06c7"+
		"\u06ca\u06d2\u06db\u06e1\u06e9\u06ef\u06f2\u06f8\u070d\u070f\u071f\u0726"+
		"\u072d\u0730\u0735\u0740\u0744\u074c\u0750\u0760\u076a\u076c\u0779\u077b"+
		"\u0789\u0790\u0793\u0797\u07a8\u07ac\u07b5\u07b9\u07bb\u07c2\u07c7\u07cc"+
		"\u07d9\u07e9\u07f3\u07f6\u07ff\u0802\u0804\u0807\u080a\u081c\u0825\u082c"+
		"\u083d\u0842\u084d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from SparkScriptSql.g4 by ANTLR 4.5.3

package com.uber.sparkscript.antlr4.generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkScriptSqlParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, URL_STRING = 14, JSON = 15, TEXT = 16,
            CSV = 17, PARQUET = 18, SELECT = 19, FROM = 20, ADD = 21, AS = 22, ALL = 23, DISTINCT = 24,
            WHERE = 25, GROUP = 26, BY = 27, GROUPING = 28, SETS = 29, CUBE = 30, ROLLUP = 31, ORDER = 32,
            HAVING = 33, LIMIT = 34, AT = 35, OR = 36, AND = 37, IN = 38, NOT = 39, NO = 40, EXISTS = 41,
            BETWEEN = 42, LIKE = 43, RLIKE = 44, IS = 45, NULL = 46, TRUE = 47, FALSE = 48, NULLS = 49,
            ASC = 50, DESC = 51, FOR = 52, INTERVAL = 53, CASE = 54, WHEN = 55, THEN = 56, ELSE = 57,
            END = 58, JOIN = 59, CROSS = 60, OUTER = 61, INNER = 62, LEFT = 63, SEMI = 64, RIGHT = 65,
            FULL = 66, NATURAL = 67, ON = 68, LATERAL = 69, WINDOW = 70, OVER = 71, PARTITION = 72,
            RANGE = 73, ROWS = 74, UNBOUNDED = 75, PRECEDING = 76, FOLLOWING = 77, CURRENT = 78,
            ROW = 79, WITH = 80, VALUES = 81, CREATE = 82, TABLE = 83, VIEW = 84, REPLACE = 85,
            INSERT = 86, DELETE = 87, INTO = 88, DESCRIBE = 89, EXPLAIN = 90, FORMAT = 91, LOGICAL = 92,
            CODEGEN = 93, CAST = 94, SHOW = 95, TABLES = 96, COLUMNS = 97, COLUMN = 98, USE = 99,
            PARTITIONS = 100, FUNCTIONS = 101, DROP = 102, UNION = 103, EXCEPT = 104, INTERSECT = 105,
            TO = 106, TABLESAMPLE = 107, STRATIFY = 108, ALTER = 109, RENAME = 110, ARRAY = 111,
            MAP = 112, STRUCT = 113, COMMENT = 114, SET = 115, RESET = 116, DATA = 117, START = 118,
            TRANSACTION = 119, COMMIT = 120, ROLLBACK = 121, MACRO = 122, IF = 123, EQ = 124,
            NSEQ = 125, NEQ = 126, NEQJ = 127, LT = 128, LTE = 129, GT = 130, GTE = 131, PLUS = 132,
            MINUS = 133, ASTERISK = 134, SLASH = 135, PERCENT = 136, DIV = 137, TILDE = 138, AMPERSAND = 139,
            PIPE = 140, HAT = 141, PERCENTLIT = 142, BUCKET = 143, OUT = 144, OF = 145, SORT = 146,
            CLUSTER = 147, DISTRIBUTE = 148, OVERWRITE = 149, TRANSFORM = 150, REDUCE = 151,
            USING = 152, SERDE = 153, SERDEPROPERTIES = 154, RECORDREADER = 155, RECORDWRITER = 156,
            DELIMITED = 157, FIELDS = 158, TERMINATED = 159, COLLECTION = 160, ITEMS = 161,
            KEYS = 162, ESCAPED = 163, LINES = 164, SEPARATED = 165, FUNCTION = 166, EXTENDED = 167,
            REFRESH = 168, CLEAR = 169, CACHE = 170, UNCACHE = 171, LAZY = 172, FORMATTED = 173,
            TEMPORARY = 174, OPTIONS = 175, UNSET = 176, TBLPROPERTIES = 177, DBPROPERTIES = 178,
            BUCKETS = 179, SKEWED = 180, STORED = 181, DIRECTORIES = 182, LOCATION = 183, EXCHANGE = 184,
            ARCHIVE = 185, UNARCHIVE = 186, FILEFORMAT = 187, TOUCH = 188, COMPACT = 189, CONCATENATE = 190,
            CHANGE = 191, CASCADE = 192, RESTRICT = 193, CLUSTERED = 194, SORTED = 195, PURGE = 196,
            INPUTFORMAT = 197, OUTPUTFORMAT = 198, DATABASE = 199, DATABASES = 200, DFS = 201,
            TRUNCATE = 202, ANALYZE = 203, COMPUTE = 204, LIST = 205, STATISTICS = 206, PARTITIONED = 207,
            EXTERNAL = 208, DEFINED = 209, REVOKE = 210, GRANT = 211, LOCK = 212, UNLOCK = 213,
            MSCK = 214, REPAIR = 215, EXPORT = 216, IMPORT = 217, LOAD = 218, ROLE = 219, ROLES = 220,
            COMPACTIONS = 221, PRINCIPALS = 222, TRANSACTIONS = 223, INDEX = 224, INDEXES = 225,
            LOCKS = 226, OPTION = 227, ANTI = 228, LOCAL = 229, INPATH = 230, STRING = 231, BIGINT_LITERAL = 232,
            SMALLINT_LITERAL = 233, TINYINT_LITERAL = 234, BYTELENGTH_LITERAL = 235, INTEGER_VALUE = 236,
            DECIMAL_VALUE = 237, SCIENTIFIC_DECIMAL_VALUE = 238, DOUBLE_LITERAL = 239, IDENTIFIER = 240,
            BACKQUOTED_IDENTIFIER = 241, SIMPLE_COMMENT = 242, BRACKETED_COMMENT = 243,
            WS = 244, UNRECOGNIZED = 245, DELIMITER = 246;
    public static final int
            RULE_root = 0, RULE_jsonQueryStatementAssignment = 1, RULE_jsonQueryStatementAssignment_query = 2,
            RULE_statementAssignment = 3, RULE_statementAssignment_tableAlias = 4,
            RULE_statementAssignment_queryType = 5, RULE_statementAssignment_queryEngine = 6,
            RULE_statementAssignment_query = 7, RULE_configSetting = 8, RULE_fileAssignment = 9,
            RULE_fileAssignment_tableAlias = 10, RULE_fileAssignment_fileType = 11,
            RULE_fileAssignment_fileLocation = 12, RULE_actionStatement = 13, RULE_actionStatement_param = 14,
            RULE_jsonObject = 15, RULE_jsonArray = 16, RULE_jsonPair = 17, RULE_jsonValue = 18,
            RULE_singleStatement = 19, RULE_singleExpression = 20, RULE_singleTableIdentifier = 21,
            RULE_singleDataType = 22, RULE_statement = 23, RULE_unsupportedHiveNativeCommands = 24,
            RULE_createTableHeader = 25, RULE_bucketSpec = 26, RULE_skewSpec = 27,
            RULE_locationSpec = 28, RULE_query = 29, RULE_insertInto = 30, RULE_partitionSpecLocation = 31,
            RULE_partitionSpec = 32, RULE_partitionVal = 33, RULE_describeFuncName = 34,
            RULE_describeColName = 35, RULE_ctes = 36, RULE_namedQuery = 37, RULE_tableProvider = 38,
            RULE_tablePropertyList = 39, RULE_tableProperty = 40, RULE_tablePropertyKey = 41,
            RULE_tablePropertyValue = 42, RULE_constantList = 43, RULE_nestedConstantList = 44,
            RULE_createFileFormat = 45, RULE_fileFormat = 46, RULE_storageHandler = 47,
            RULE_resource = 48, RULE_queryNoWith = 49, RULE_queryOrganization = 50,
            RULE_multiInsertQueryBody = 51, RULE_queryTerm = 52, RULE_queryPrimary = 53,
            RULE_sortItem = 54, RULE_querySpecification = 55, RULE_fromClause = 56,
            RULE_aggregation = 57, RULE_groupingSet = 58, RULE_lateralView = 59, RULE_setQuantifier = 60,
            RULE_relation = 61, RULE_joinType = 62, RULE_joinCriteria = 63, RULE_sample = 64,
            RULE_identifierList = 65, RULE_identifierSeq = 66, RULE_orderedIdentifierList = 67,
            RULE_orderedIdentifier = 68, RULE_identifierCommentList = 69, RULE_identifierComment = 70,
            RULE_relationPrimary = 71, RULE_inlineTable = 72, RULE_rowFormat = 73,
            RULE_tableIdentifier = 74, RULE_namedExpression = 75, RULE_namedExpressionSeq = 76,
            RULE_expression = 77, RULE_booleanExpression = 78, RULE_predicated = 79,
            RULE_predicate = 80, RULE_valueExpression = 81, RULE_primaryExpression = 82,
            RULE_constant = 83, RULE_comparisonOperator = 84, RULE_arithmeticOperator = 85,
            RULE_predicateOperator = 86, RULE_booleanValue = 87, RULE_interval = 88,
            RULE_intervalField = 89, RULE_intervalValue = 90, RULE_dataType = 91,
            RULE_colTypeList = 92, RULE_colType = 93, RULE_whenClause = 94, RULE_windows = 95,
            RULE_namedWindow = 96, RULE_windowSpec = 97, RULE_windowFrame = 98, RULE_frameBound = 99,
            RULE_qualifiedName = 100, RULE_identifier = 101, RULE_strictIdentifier = 102,
            RULE_quotedIdentifier = 103, RULE_number = 104, RULE_nonReserved = 105;
    public static final String[] ruleNames = {
            "root", "jsonQueryStatementAssignment", "jsonQueryStatementAssignment_query",
            "statementAssignment", "statementAssignment_tableAlias", "statementAssignment_queryType",
            "statementAssignment_queryEngine", "statementAssignment_query", "configSetting",
            "fileAssignment", "fileAssignment_tableAlias", "fileAssignment_fileType",
            "fileAssignment_fileLocation", "actionStatement", "actionStatement_param",
            "jsonObject", "jsonArray", "jsonPair", "jsonValue", "singleStatement",
            "singleExpression", "singleTableIdentifier", "singleDataType", "statement",
            "unsupportedHiveNativeCommands", "createTableHeader", "bucketSpec", "skewSpec",
            "locationSpec", "query", "insertInto", "partitionSpecLocation", "partitionSpec",
            "partitionVal", "describeFuncName", "describeColName", "ctes", "namedQuery",
            "tableProvider", "tablePropertyList", "tableProperty", "tablePropertyKey",
            "tablePropertyValue", "constantList", "nestedConstantList", "createFileFormat",
            "fileFormat", "storageHandler", "resource", "queryNoWith", "queryOrganization",
            "multiInsertQueryBody", "queryTerm", "queryPrimary", "sortItem", "querySpecification",
            "fromClause", "aggregation", "groupingSet", "lateralView", "setQuantifier",
            "relation", "joinType", "joinCriteria", "sample", "identifierList", "identifierSeq",
            "orderedIdentifierList", "orderedIdentifier", "identifierCommentList",
            "identifierComment", "relationPrimary", "inlineTable", "rowFormat", "tableIdentifier",
            "namedExpression", "namedExpressionSeq", "expression", "booleanExpression",
            "predicated", "predicate", "valueExpression", "primaryExpression", "constant",
            "comparisonOperator", "arithmeticOperator", "predicateOperator", "booleanValue",
            "interval", "intervalField", "intervalValue", "dataType", "colTypeList",
            "colType", "whenClause", "windows", "namedWindow", "windowSpec", "windowFrame",
            "frameBound", "qualifiedName", "identifier", "strictIdentifier", "quotedIdentifier",
            "number", "nonReserved"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00f8\u08fa\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT" +
                    "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4" +
                    "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t" +
                    "k\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00e0\n\2\f\2\16\2\u00e3\13" +
                    "\2\3\2\3\2\3\2\7\2\u00e8\n\2\f\2\16\2\u00eb\13\2\3\2\3\2\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\4\7\4\u00f6\n\4\f\4\16\4\u00f9\13\4\3\4\3\4\3\5\3\5\3\5\3" +
                    "\5\3\5\5\5\u0102\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\7\t\u010d\n\t" +
                    "\f\t\16\t\u0110\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3" +
                    "\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17" +
                    "\3\17\3\17\3\17\7\17\u012f\n\17\f\17\16\17\u0132\13\17\3\17\3\17\5\17" +
                    "\u0136\n\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u013e\n\21\f\21\16\21\u0141" +
                    "\13\21\3\21\3\21\3\21\3\21\5\21\u0147\n\21\3\22\3\22\3\22\3\22\7\22\u014d" +
                    "\n\22\f\22\16\22\u0150\13\22\3\22\3\22\3\22\3\22\5\22\u0156\n\22\3\23" +
                    "\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0162\n\24\3\25\3\25" +
                    "\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\5\31\u0178\n\31\3\31\3\31\3\31\5\31\u017d\n\31\3" +
                    "\31\5\31\u0180\n\31\3\31\3\31\3\31\5\31\u0185\n\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0192\n\31\3\31\3\31\5\31\u0196" +
                    "\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u019d\n\31\3\31\3\31\3\31\5\31\u01a2" +
                    "\n\31\3\31\3\31\3\31\5\31\u01a7\n\31\3\31\5\31\u01aa\n\31\3\31\3\31\3" +
                    "\31\3\31\5\31\u01b0\n\31\3\31\3\31\3\31\5\31\u01b5\n\31\3\31\5\31\u01b8" +
                    "\n\31\3\31\5\31\u01bb\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01c4" +
                    "\n\31\3\31\3\31\5\31\u01c8\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01d0" +
                    "\n\31\3\31\5\31\u01d3\n\31\3\31\5\31\u01d6\n\31\3\31\5\31\u01d9\n\31\3" +
                    "\31\5\31\u01dc\n\31\3\31\5\31\u01df\n\31\3\31\3\31\5\31\u01e3\n\31\3\31" +
                    "\5\31\u01e6\n\31\3\31\5\31\u01e9\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u01f0" +
                    "\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01fa\n\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\5\31\u0202\n\31\5\31\u0204\n\31\3\31\3\31\3\31\3" +
                    "\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3" +
                    "\31\3\31\3\31\3\31\5\31\u021b\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31" +
                    "\u0223\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u022b\n\31\3\31\3\31\3" +
                    "\31\3\31\5\31\u0231\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\5\31\u023e\n\31\3\31\6\31\u0241\n\31\r\31\16\31\u0242\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u024c\n\31\3\31\6\31\u024f\n\31\r" +
                    "\31\16\31\u0250\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\5\31\u0261\n\31\3\31\3\31\3\31\7\31\u0266\n\31\f\31\16" +
                    "\31\u0269\13\31\3\31\5\31\u026c\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31" +
                    "\u0274\n\31\3\31\3\31\3\31\7\31\u0279\n\31\f\31\16\31\u027c\13\31\3\31" +
                    "\3\31\3\31\3\31\5\31\u0282\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31" +
                    "\u028b\n\31\3\31\3\31\5\31\u028f\n\31\3\31\3\31\3\31\3\31\5\31\u0295\n" +
                    "\31\3\31\3\31\3\31\3\31\5\31\u029b\n\31\3\31\5\31\u029e\n\31\3\31\3\31" +
                    "\3\31\3\31\5\31\u02a4\n\31\3\31\3\31\5\31\u02a8\n\31\3\31\3\31\5\31\u02ac" +
                    "\n\31\3\31\3\31\3\31\5\31\u02b1\n\31\3\31\3\31\5\31\u02b5\n\31\3\31\3" +
                    "\31\3\31\3\31\3\31\3\31\5\31\u02bd\n\31\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\5\31\u02c6\n\31\3\31\3\31\3\31\5\31\u02cb\n\31\3\31\3\31\3\31\3" +
                    "\31\5\31\u02d1\n\31\3\31\3\31\3\31\3\31\5\31\u02d7\n\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\7\31\u02e1\n\31\f\31\16\31\u02e4\13\31\5\31" +
                    "\u02e6\n\31\3\31\3\31\5\31\u02ea\n\31\3\31\3\31\3\31\5\31\u02ef\n\31\3" +
                    "\31\3\31\3\31\5\31\u02f4\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u02fb\n\31" +
                    "\3\31\5\31\u02fe\n\31\3\31\5\31\u0301\n\31\3\31\3\31\3\31\3\31\5\31\u0307" +
                    "\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0310\n\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\5\31\u0318\n\31\3\31\3\31\3\31\3\31\5\31\u031e\n\31\3" +
                    "\31\3\31\5\31\u0322\n\31\3\31\3\31\5\31\u0326\n\31\3\31\3\31\5\31\u032a" +
                    "\n\31\5\31\u032c\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0335\n" +
                    "\31\3\31\3\31\3\31\3\31\5\31\u033b\n\31\3\31\3\31\3\31\5\31\u0340\n\31" +
                    "\3\31\3\31\5\31\u0344\n\31\3\31\5\31\u0347\n\31\3\31\3\31\3\31\3\31\3" +
                    "\31\7\31\u034e\n\31\f\31\16\31\u0351\13\31\3\31\3\31\5\31\u0355\n\31\3" +
                    "\31\3\31\3\31\5\31\u035a\n\31\3\31\5\31\u035d\n\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\5\31\u0367\n\31\3\31\3\31\3\31\5\31\u036c\n\31\3" +
                    "\31\3\31\3\31\3\31\5\31\u0372\n\31\3\31\3\31\3\31\3\31\5\31\u0378\n\31" +
                    "\3\31\3\31\3\31\7\31\u037d\n\31\f\31\16\31\u0380\13\31\3\31\3\31\3\31" +
                    "\7\31\u0385\n\31\f\31\16\31\u0388\13\31\3\31\3\31\7\31\u038c\n\31\f\31" +
                    "\16\31\u038f\13\31\3\31\3\31\3\31\7\31\u0394\n\31\f\31\16\31\u0397\13" +
                    "\31\5\31\u0399\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u03a1\n\32\3\32" +
                    "\3\32\5\32\u03a5\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u03ac\n\32\3\32\3" +
                    "\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3" +
                    "\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3" +
                    "\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3" +
                    "\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3" +
                    "\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3" +
                    "\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3" +
                    "\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3" +
                    "\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3" +
                    "\32\3\32\3\32\3\32\5\32\u0423\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32" +
                    "\u042b\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0433\n\32\3\32\3\32\3" +
                    "\32\3\32\3\32\3\32\3\32\5\32\u043c\n\32\3\32\3\32\3\32\3\32\3\32\3\32" +
                    "\3\32\5\32\u0445\n\32\3\32\3\32\5\32\u0449\n\32\3\32\3\32\3\32\3\32\5" +
                    "\32\u044f\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32" +
                    "\u045b\n\32\3\33\3\33\5\33\u045f\n\33\3\33\5\33\u0462\n\33\3\33\3\33\3" +
                    "\33\3\33\5\33\u0468\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34" +
                    "\u0472\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u047e" +
                    "\n\35\3\35\3\35\3\35\5\35\u0483\n\35\3\36\3\36\3\36\3\37\5\37\u0489\n" +
                    "\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u0495\n \5 \u0497\n \3 \3 \3" +
                    " \5 \u049c\n \3 \3 \5 \u04a0\n \5 \u04a2\n \3!\3!\5!\u04a6\n!\3\"\3\"" +
                    "\3\"\3\"\3\"\7\"\u04ad\n\"\f\"\16\"\u04b0\13\"\3\"\3\"\3#\3#\3#\5#\u04b7" +
                    "\n#\3$\3$\3$\3$\3$\5$\u04be\n$\3%\3%\3%\3%\5%\u04c4\n%\7%\u04c6\n%\f%" +
                    "\16%\u04c9\13%\3&\3&\3&\3&\7&\u04cf\n&\f&\16&\u04d2\13&\3\'\3\'\5\'\u04d6" +
                    "\n\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\7)\u04e3\n)\f)\16)\u04e6\13" +
                    ")\3)\3)\3*\3*\5*\u04ec\n*\3*\5*\u04ef\n*\3+\3+\3+\7+\u04f4\n+\f+\16+\u04f7" +
                    "\13+\3+\5+\u04fa\n+\3,\3,\3,\3,\5,\u0500\n,\3-\3-\3-\3-\7-\u0506\n-\f" +
                    "-\16-\u0509\13-\3-\3-\3.\3.\3.\3.\7.\u0511\n.\f.\16.\u0514\13.\3.\3.\3" +
                    "/\3/\3/\3/\3/\3/\5/\u051e\n/\3\60\3\60\3\60\3\60\3\60\5\60\u0525\n\60" +
                    "\3\61\3\61\3\61\3\61\5\61\u052b\n\61\3\62\3\62\3\62\3\63\5\63\u0531\n" +
                    "\63\3\63\3\63\3\63\3\63\3\63\6\63\u0538\n\63\r\63\16\63\u0539\5\63\u053c" +
                    "\n\63\3\64\3\64\3\64\3\64\3\64\7\64\u0543\n\64\f\64\16\64\u0546\13\64" +
                    "\5\64\u0548\n\64\3\64\3\64\3\64\3\64\3\64\7\64\u054f\n\64\f\64\16\64\u0552" +
                    "\13\64\5\64\u0554\n\64\3\64\3\64\3\64\3\64\3\64\7\64\u055b\n\64\f\64\16" +
                    "\64\u055e\13\64\5\64\u0560\n\64\3\64\3\64\3\64\3\64\3\64\7\64\u0567\n" +
                    "\64\f\64\16\64\u056a\13\64\5\64\u056c\n\64\3\64\5\64\u056f\n\64\3\64\3" +
                    "\64\5\64\u0573\n\64\3\65\5\65\u0576\n\65\3\65\3\65\3\65\3\66\3\66\3\66" +
                    "\3\66\3\66\3\66\5\66\u0581\n\66\3\66\7\66\u0584\n\66\f\66\16\66\u0587" +
                    "\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0591\n\67\38\38\5" +
                    "8\u0595\n8\39\39\39\39\39\39\39\39\39\39\59\u05a1\n9\39\59\u05a4\n9\3" +
                    "9\39\59\u05a8\n9\39\39\39\39\39\39\39\39\59\u05b2\n9\39\39\59\u05b6\n" +
                    "9\59\u05b8\n9\39\59\u05bb\n9\39\39\59\u05bf\n9\39\59\u05c2\n9\39\39\5" +
                    "9\u05c6\n9\39\39\59\u05ca\n9\39\39\59\u05ce\n9\39\39\39\59\u05d3\n9\3" +
                    "9\59\u05d6\n9\59\u05d8\n9\39\79\u05db\n9\f9\169\u05de\139\39\39\59\u05e2" +
                    "\n9\39\59\u05e5\n9\39\39\59\u05e9\n9\39\59\u05ec\n9\59\u05ee\n9\3:\3:" +
                    "\3:\3:\7:\u05f4\n:\f:\16:\u05f7\13:\3:\7:\u05fa\n:\f:\16:\u05fd\13:\3" +
                    ";\3;\3;\3;\3;\7;\u0604\n;\f;\16;\u0607\13;\3;\3;\3;\3;\3;\3;\3;\3;\3;" +
                    "\3;\7;\u0613\n;\f;\16;\u0616\13;\3;\3;\5;\u061a\n;\3<\3<\3<\3<\7<\u0620" +
                    "\n<\f<\16<\u0623\13<\5<\u0625\n<\3<\3<\5<\u0629\n<\3=\3=\3=\5=\u062e\n" +
                    "=\3=\3=\3=\3=\3=\7=\u0635\n=\f=\16=\u0638\13=\5=\u063a\n=\3=\3=\3=\5=" +
                    "\u063f\n=\3=\3=\3=\7=\u0644\n=\f=\16=\u0647\13=\5=\u0649\n=\3>\3>\3?\3" +
                    "?\3?\3?\3?\3?\5?\u0653\n?\3?\3?\3?\5?\u0658\n?\3?\3?\3?\3?\3?\5?\u065f" +
                    "\n?\7?\u0661\n?\f?\16?\u0664\13?\3@\5@\u0667\n@\3@\3@\5@\u066b\n@\3@\3" +
                    "@\3@\3@\5@\u0671\n@\3@\3@\5@\u0675\n@\3@\5@\u0678\n@\3@\5@\u067b\n@\3" +
                    "A\3A\3A\3A\3A\3A\3A\7A\u0684\nA\fA\16A\u0687\13A\3A\3A\5A\u068b\nA\3B" +
                    "\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u06a0\nB\5B" +
                    "\u06a2\nB\5B\u06a4\nB\3B\3B\3C\3C\3C\3C\3D\3D\3D\7D\u06af\nD\fD\16D\u06b2" +
                    "\13D\3E\3E\3E\3E\7E\u06b8\nE\fE\16E\u06bb\13E\3E\3E\3F\3F\5F\u06c1\nF" +
                    "\3G\3G\3G\3G\7G\u06c7\nG\fG\16G\u06ca\13G\3G\3G\3H\3H\3H\5H\u06d1\nH\3" +
                    "I\3I\5I\u06d5\nI\3I\5I\u06d8\nI\3I\5I\u06db\nI\3I\3I\3I\3I\5I\u06e1\n" +
                    "I\3I\5I\u06e4\nI\3I\5I\u06e7\nI\3I\3I\3I\3I\5I\u06ed\nI\3I\5I\u06f0\n" +
                    "I\3I\5I\u06f3\nI\3I\5I\u06f6\nI\3J\3J\3J\3J\7J\u06fc\nJ\fJ\16J\u06ff\13" +
                    "J\3J\5J\u0702\nJ\3J\3J\5J\u0706\nJ\5J\u0708\nJ\3K\3K\3K\3K\3K\3K\3K\5" +
                    "K\u0711\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u071d\nK\5K\u071f\nK\3K\3" +
                    "K\3K\3K\3K\5K\u0726\nK\3K\3K\3K\3K\3K\5K\u072d\nK\3K\3K\3K\3K\5K\u0733" +
                    "\nK\3K\3K\3K\3K\5K\u0739\nK\5K\u073b\nK\3L\3L\3L\5L\u0740\nL\3L\3L\3M" +
                    "\3M\5M\u0746\nM\3M\3M\5M\u074a\nM\5M\u074c\nM\3N\3N\3N\7N\u0751\nN\fN" +
                    "\16N\u0754\13N\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0761\nP\3P\3P\3P\3" +
                    "P\3P\3P\7P\u0769\nP\fP\16P\u076c\13P\3Q\3Q\5Q\u0770\nQ\3R\5R\u0773\nR" +
                    "\3R\3R\3R\3R\3R\3R\5R\u077b\nR\3R\3R\3R\3R\3R\7R\u0782\nR\fR\16R\u0785" +
                    "\13R\3R\3R\3R\5R\u078a\nR\3R\3R\3R\3R\3R\3R\5R\u0792\nR\3R\3R\3R\3R\5" +
                    "R\u0798\nR\3R\5R\u079b\nR\3S\3S\3S\3S\5S\u07a1\nS\3S\3S\3S\3S\3S\3S\3" +
                    "S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\7S\u07b6\nS\fS\16S\u07b9\13S\3T" +
                    "\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\6T\u07c6\nT\rT\16T\u07c7\3T\3T\3T\3T\3" +
                    "T\5T\u07cf\nT\3T\3T\3T\7T\u07d4\nT\fT\16T\u07d7\13T\5T\u07d9\nT\3T\3T" +
                    "\3T\5T\u07de\nT\3T\3T\3T\3T\3T\3T\3T\6T\u07e7\nT\rT\16T\u07e8\3T\3T\5" +
                    "T\u07ed\nT\3T\3T\3T\3T\6T\u07f3\nT\rT\16T\u07f4\3T\3T\5T\u07f9\nT\3T\3" +
                    "T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0809\nT\3T\3T\3T\3T\3T\3T\3" +
                    "T\3T\7T\u0813\nT\fT\16T\u0816\13T\3U\3U\3U\3U\3U\3U\3U\3U\6U\u0820\nU" +
                    "\rU\16U\u0821\5U\u0824\nU\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\7Z\u0830\nZ\f" +
                    "Z\16Z\u0833\13Z\3[\3[\3[\3[\5[\u0839\n[\3\\\5\\\u083c\n\\\3\\\3\\\5\\" +
                    "\u0840\n\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0851\n]\3" +
                    "]\3]\5]\u0855\n]\3]\3]\3]\3]\3]\7]\u085c\n]\f]\16]\u085f\13]\3]\5]\u0862" +
                    "\n]\5]\u0864\n]\3^\3^\3^\7^\u0869\n^\f^\16^\u086c\13^\3_\3_\5_\u0870\n" +
                    "_\3_\3_\3_\5_\u0875\n_\3`\3`\3`\3`\3`\3a\3a\3a\3a\7a\u0880\na\fa\16a\u0883" +
                    "\13a\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\7c\u0890\nc\fc\16c\u0893\13c\3c" +
                    "\3c\3c\3c\3c\7c\u089a\nc\fc\16c\u089d\13c\5c\u089f\nc\3c\3c\3c\3c\3c\7" +
                    "c\u08a6\nc\fc\16c\u08a9\13c\5c\u08ab\nc\5c\u08ad\nc\3c\5c\u08b0\nc\3c" +
                    "\5c\u08b3\nc\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u08c5" +
                    "\nd\3e\3e\3e\3e\3e\3e\3e\5e\u08ce\ne\3f\3f\3f\7f\u08d3\nf\ff\16f\u08d6" +
                    "\13f\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u08e6\ng\3h\3h\3h\5" +
                    "h\u08eb\nh\3i\3i\3j\3j\3j\3j\3j\3j\3j\5j\u08f6\nj\3k\3k\3k\7\u034f\u037e" +
                    "\u0386\u038d\u0395\7j|\u009e\u00a4\u00a6l\2\4\6\b\n\f\16\20\22\24\26\30" +
                    "\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080" +
                    "\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098" +
                    "\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0" +
                    "\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8" +
                    "\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\2\35\3\2\4\5\3\2\21\24\4\2\20\20" +
                    "\u00e9\u00e9\4\2\u00e9\u00e9\u00f2\u00f2\3\2\u00c2\u00c3\3\2UV\5\2^_\u00a9" +
                    "\u00a9\u00af\u00af\4\2\26\26((\4\2\65\65[[\4\2\u00a9\u00a9\u00af\u00af" +
                    "\4\2\27\27\u00cf\u00cf\3\2ik\3\2\64\65\3\2\31\32\3\2\u00ee\u00ef\3\2-" +
                    ".\4\2\u0086\u0087\u008c\u008c\3\2\u0088\u008b\3\2\u0086\u0087\3\2~\u0085" +
                    "\3\2\u0086\u008f\3\2&)\3\2\61\62\4\2JJ\u0096\u0096\4\2\"\"\u0094\u0094" +
                    "\3\2NO\t\2\25<??Ghl}\u008b\u008b\u0090\u00e5\u00e7\u00e8\u0a61\2\u00e1" +
                    "\3\2\2\2\4\u00ee\3\2\2\2\6\u00f7\3\2\2\2\b\u00fc\3\2\2\2\n\u0105\3\2\2" +
                    "\2\f\u0107\3\2\2\2\16\u0109\3\2\2\2\20\u010e\3\2\2\2\22\u0113\3\2\2\2" +
                    "\24\u0119\3\2\2\2\26\u011f\3\2\2\2\30\u0121\3\2\2\2\32\u0123\3\2\2\2\34" +
                    "\u0135\3\2\2\2\36\u0137\3\2\2\2 \u0146\3\2\2\2\"\u0155\3\2\2\2$\u0157" +
                    "\3\2\2\2&\u0161\3\2\2\2(\u0163\3\2\2\2*\u0166\3\2\2\2,\u0169\3\2\2\2." +
                    "\u016c\3\2\2\2\60\u0398\3\2\2\2\62\u045a\3\2\2\2\64\u045c\3\2\2\2\66\u046b" +
                    "\3\2\2\28\u0477\3\2\2\2:\u0484\3\2\2\2<\u0488\3\2\2\2>\u04a1\3\2\2\2@" +
                    "\u04a3\3\2\2\2B\u04a7\3\2\2\2D\u04b3\3\2\2\2F\u04bd\3\2\2\2H\u04bf\3\2" +
                    "\2\2J\u04ca\3\2\2\2L\u04d3\3\2\2\2N\u04db\3\2\2\2P\u04de\3\2\2\2R\u04e9" +
                    "\3\2\2\2T\u04f9\3\2\2\2V\u04ff\3\2\2\2X\u0501\3\2\2\2Z\u050c\3\2\2\2\\" +
                    "\u051d\3\2\2\2^\u0524\3\2\2\2`\u0526\3\2\2\2b\u052c\3\2\2\2d\u053b\3\2" +
                    "\2\2f\u0547\3\2\2\2h\u0575\3\2\2\2j\u057a\3\2\2\2l\u0590\3\2\2\2n\u0592" +
                    "\3\2\2\2p\u05ed\3\2\2\2r\u05ef\3\2\2\2t\u05fe\3\2\2\2v\u0628\3\2\2\2x" +
                    "\u062a\3\2\2\2z\u064a\3\2\2\2|\u064c\3\2\2\2~\u067a\3\2\2\2\u0080\u068a" +
                    "\3\2\2\2\u0082\u068c\3\2\2\2\u0084\u06a7\3\2\2\2\u0086\u06ab\3\2\2\2\u0088" +
                    "\u06b3\3\2\2\2\u008a\u06be\3\2\2\2\u008c\u06c2\3\2\2\2\u008e\u06cd\3\2" +
                    "\2\2\u0090\u06f5\3\2\2\2\u0092\u06f7\3\2\2\2\u0094\u073a\3\2\2\2\u0096" +
                    "\u073f\3\2\2\2\u0098\u0743\3\2\2\2\u009a\u074d\3\2\2\2\u009c\u0755\3\2" +
                    "\2\2\u009e\u0760\3\2\2\2\u00a0\u076d\3\2\2\2\u00a2\u079a\3\2\2\2\u00a4" +
                    "\u07a0\3\2\2\2\u00a6\u0808\3\2\2\2\u00a8\u0823\3\2\2\2\u00aa\u0825\3\2" +
                    "\2\2\u00ac\u0827\3\2\2\2\u00ae\u0829\3\2\2\2\u00b0\u082b\3\2\2\2\u00b2" +
                    "\u082d\3\2\2\2\u00b4\u0834\3\2\2\2\u00b6\u083f\3\2\2\2\u00b8\u0863\3\2" +
                    "\2\2\u00ba\u0865\3\2\2\2\u00bc\u086d\3\2\2\2\u00be\u0876\3\2\2\2\u00c0" +
                    "\u087b\3\2\2\2\u00c2\u0884\3\2\2\2\u00c4\u08b2\3\2\2\2\u00c6\u08c4\3\2" +
                    "\2\2\u00c8\u08cd\3\2\2\2\u00ca\u08cf\3\2\2\2\u00cc\u08e5\3\2\2\2\u00ce" +
                    "\u08ea\3\2\2\2\u00d0\u08ec\3\2\2\2\u00d2\u08f5\3\2\2\2\u00d4\u08f7\3\2" +
                    "\2\2\u00d6\u00d7\5\24\13\2\u00d7\u00d8\7\3\2\2\u00d8\u00e0\3\2\2\2\u00d9" +
                    "\u00da\5\4\3\2\u00da\u00db\7\3\2\2\u00db\u00e0\3\2\2\2\u00dc\u00dd\5\b" +
                    "\5\2\u00dd\u00de\7\3\2\2\u00de\u00e0\3\2\2\2\u00df\u00d6\3\2\2\2\u00df" +
                    "\u00d9\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2" +
                    "\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e9\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4" +
                    "\u00e5\5\34\17\2\u00e5\u00e6\7\3\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e4\3" +
                    "\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea" +
                    "\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\2\2\3\u00ed\3\3\2\2\2" +
                    "\u00ee\u00ef\5\n\6\2\u00ef\u00f0\7~\2\2\u00f0\u00f1\7\21\2\2\u00f1\u00f2" +
                    "\5\16\b\2\u00f2\u00f3\5\6\4\2\u00f3\5\3\2\2\2\u00f4\u00f6\5\22\n\2\u00f5" +
                    "\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2" +
                    "\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\5 \21\2\u00fb" +
                    "\7\3\2\2\2\u00fc\u00fd\5\n\6\2\u00fd\u0101\7~\2\2\u00fe\u00ff\5\f\7\2" +
                    "\u00ff\u0100\5\16\b\2\u0100\u0102\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u0102" +
                    "\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5\20\t\2\u0104\t\3\2\2\2\u0105" +
                    "\u0106\7\u00f2\2\2\u0106\13\3\2\2\2\u0107\u0108\t\2\2\2\u0108\r\3\2\2" +
                    "\2\u0109\u010a\5\u00ccg\2\u010a\17\3\2\2\2\u010b\u010d\5\22\n\2\u010c" +
                    "\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2" +
                    "\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\5\60\31\2\u0112" +
                    "\21\3\2\2\2\u0113\u0114\7u\2\2\u0114\u0115\5\u00caf\2\u0115\u0116\7~\2" +
                    "\2\u0116\u0117\5\u00a8U\2\u0117\u0118\7\3\2\2\u0118\23\3\2\2\2\u0119\u011a" +
                    "\5\26\f\2\u011a\u011b\7~\2\2\u011b\u011c\7\6\2\2\u011c\u011d\5\30\r\2" +
                    "\u011d\u011e\5\32\16\2\u011e\25\3\2\2\2\u011f\u0120\7\u00f2\2\2\u0120" +
                    "\27\3\2\2\2\u0121\u0122\t\3\2\2\u0122\31\3\2\2\2\u0123\u0124\t\4\2\2\u0124" +
                    "\33\3\2\2\2\u0125\u0126\5\u00caf\2\u0126\u0127\7\7\2\2\u0127\u0128\7\b" +
                    "\2\2\u0128\u0136\3\2\2\2\u0129\u012a\5\u00caf\2\u012a\u012b\7\7\2\2\u012b" +
                    "\u0130\5\36\20\2\u012c\u012d\7\t\2\2\u012d\u012f\5\36\20\2\u012e\u012c" +
                    "\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131" +
                    "\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\b\2\2\u0134\u0136\3\2" +
                    "\2\2\u0135\u0125\3\2\2\2\u0135\u0129\3\2\2\2\u0136\35\3\2\2\2\u0137\u0138" +
                    "\t\5\2\2\u0138\37\3\2\2\2\u0139\u013a\7\n\2\2\u013a\u013f\5$\23\2\u013b" +
                    "\u013c\7\t\2\2\u013c\u013e\5$\23\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2" +
                    "\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141" +
                    "\u013f\3\2\2\2\u0142\u0143\7\13\2\2\u0143\u0147\3\2\2\2\u0144\u0145\7" +
                    "\n\2\2\u0145\u0147\7\13\2\2\u0146\u0139\3\2\2\2\u0146\u0144\3\2\2\2\u0147" +
                    "!\3\2\2\2\u0148\u0149\7\f\2\2\u0149\u014e\5&\24\2\u014a\u014b\7\t\2\2" +
                    "\u014b\u014d\5&\24\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c" +
                    "\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151" +
                    "\u0152\7\r\2\2\u0152\u0156\3\2\2\2\u0153\u0154\7\f\2\2\u0154\u0156\7\r" +
                    "\2\2\u0155\u0148\3\2\2\2\u0155\u0153\3\2\2\2\u0156#\3\2\2\2\u0157\u0158" +
                    "\7\u00e9\2\2\u0158\u0159\7\16\2\2\u0159\u015a\5&\24\2\u015a%\3\2\2\2\u015b" +
                    "\u0162\5 \21\2\u015c\u0162\5\"\22\2\u015d\u0162\7\u00e9\2\2\u015e\u0162" +
                    "\5\u00d2j\2\u015f\u0162\5\u00b0Y\2\u0160\u0162\7\60\2\2\u0161\u015b\3" +
                    "\2\2\2\u0161\u015c\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015e\3\2\2\2\u0161" +
                    "\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\'\3\2\2\2\u0163\u0164\5\60\31" +
                    "\2\u0164\u0165\7\2\2\3\u0165)\3\2\2\2\u0166\u0167\5\u0098M\2\u0167\u0168" +
                    "\7\2\2\3\u0168+\3\2\2\2\u0169\u016a\5\u0096L\2\u016a\u016b\7\2\2\3\u016b" +
                    "-\3\2\2\2\u016c\u016d\5\u00b8]\2\u016d\u016e\7\2\2\3\u016e/\3\2\2\2\u016f" +
                    "\u0399\5<\37\2\u0170\u0171\7e\2\2\u0171\u0399\5\u00ccg\2\u0172\u0173\7" +
                    "T\2\2\u0173\u0177\7\u00c9\2\2\u0174\u0175\7}\2\2\u0175\u0176\7)\2\2\u0176" +
                    "\u0178\7+\2\2\u0177\u0174\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2" +
                    "\2\2\u0179\u017c\5\u00ccg\2\u017a\u017b\7t\2\2\u017b\u017d\7\u00e9\2\2" +
                    "\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180" +
                    "\5:\36\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0184\3\2\2\2\u0181" +
                    "\u0182\7R\2\2\u0182\u0183\7\u00b4\2\2\u0183\u0185\5P)\2\u0184\u0181\3" +
                    "\2\2\2\u0184\u0185\3\2\2\2\u0185\u0399\3\2\2\2\u0186\u0187\7o\2\2\u0187" +
                    "\u0188\7\u00c9\2\2\u0188\u0189\5\u00ccg\2\u0189\u018a\7u\2\2\u018a\u018b" +
                    "\7\u00b4\2\2\u018b\u018c\5P)\2\u018c\u0399\3\2\2\2\u018d\u018e\7h\2\2" +
                    "\u018e\u0191\7\u00c9\2\2\u018f\u0190\7}\2\2\u0190\u0192\7+\2\2\u0191\u018f" +
                    "\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\5\u00ccg" +
                    "\2\u0194\u0196\t\6\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0399" +
                    "\3\2\2\2\u0197\u019c\5\64\33\2\u0198\u0199\7\7\2\2\u0199\u019a\5\u00ba" +
                    "^\2\u019a\u019b\7\b\2\2\u019b\u019d\3\2\2\2\u019c\u0198\3\2\2\2\u019c" +
                    "\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a1\5N(\2\u019f\u01a0\7\u00b1" +
                    "\2\2\u01a0\u01a2\5P)\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a6" +
                    "\3\2\2\2\u01a3\u01a4\7\u00d1\2\2\u01a4\u01a5\7\35\2\2\u01a5\u01a7\5\u0084" +
                    "C\2\u01a6\u01a3\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8" +
                    "\u01aa\5\66\34\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u0399\3" +
                    "\2\2\2\u01ab\u01ac\5\64\33\2\u01ac\u01af\5N(\2\u01ad\u01ae\7\u00b1\2\2" +
                    "\u01ae\u01b0\5P)\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b4" +
                    "\3\2\2\2\u01b1\u01b2\7\u00d1\2\2\u01b2\u01b3\7\35\2\2\u01b3\u01b5\5\u0084" +
                    "C\2\u01b4\u01b1\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6" +
                    "\u01b8\5\66\34\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3" +
                    "\2\2\2\u01b9\u01bb\7\30\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb" +
                    "\u01bc\3\2\2\2\u01bc\u01bd\5<\37\2\u01bd\u0399\3\2\2\2\u01be\u01c3\5\64" +
                    "\33\2\u01bf\u01c0\7\7\2\2\u01c0\u01c1\5\u00ba^\2\u01c1\u01c2\7\b\2\2\u01c2" +
                    "\u01c4\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2" +
                    "\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c8\7\u00e9\2\2\u01c7\u01c5\3\2\2\2\u01c7" +
                    "\u01c8\3\2\2\2\u01c8\u01cf\3\2\2\2\u01c9\u01ca\7\u00d1\2\2\u01ca\u01cb" +
                    "\7\35\2\2\u01cb\u01cc\7\7\2\2\u01cc\u01cd\5\u00ba^\2\u01cd\u01ce\7\b\2" +
                    "\2\u01ce\u01d0\3\2\2\2\u01cf\u01c9\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2" +
                    "\3\2\2\2\u01d1\u01d3\5\66\34\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2" +
                    "\u01d3\u01d5\3\2\2\2\u01d4\u01d6\58\35\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6" +
                    "\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d9\5\u0094K\2\u01d8\u01d7\3\2\2" +
                    "\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01dc\5\\/\2\u01db\u01da" +
                    "\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01df\5:\36\2\u01de" +
                    "\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01e1\7\u00b3" +
                    "\2\2\u01e1\u01e3\5P)\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e8" +
                    "\3\2\2\2\u01e4\u01e6\7\30\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2" +
                    "\u01e6\u01e7\3\2\2\2\u01e7\u01e9\5<\37\2\u01e8\u01e5\3\2\2\2\u01e8\u01e9" +
                    "\3\2\2\2\u01e9\u0399\3\2\2\2\u01ea\u01eb\7T\2\2\u01eb\u01ef\7U\2\2\u01ec" +
                    "\u01ed\7}\2\2\u01ed\u01ee\7)\2\2\u01ee\u01f0\7+\2\2\u01ef\u01ec\3\2\2" +
                    "\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\5\u0096L\2\u01f2" +
                    "\u01f3\7-\2\2\u01f3\u01f4\5\u0096L\2\u01f4\u0399\3\2\2\2\u01f5\u01f6\7" +
                    "\u00cd\2\2\u01f6\u01f7\7U\2\2\u01f7\u01f9\5\u0096L\2\u01f8\u01fa\5B\"" +
                    "\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc" +
                    "\7\u00ce\2\2\u01fc\u0203\7\u00d0\2\2\u01fd\u0204\5\u00ccg\2\u01fe\u01ff" +
                    "\7\66\2\2\u01ff\u0201\7c\2\2\u0200\u0202\5\u0086D\2\u0201\u0200\3\2\2" +
                    "\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u01fd\3\2\2\2\u0203\u01fe" +
                    "\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0399\3\2\2\2\u0205\u0206\7o\2\2\u0206" +
                    "\u0207\t\7\2\2\u0207\u0208\5\u0096L\2\u0208\u0209\7p\2\2\u0209\u020a\7" +
                    "l\2\2\u020a\u020b\5\u0096L\2\u020b\u0399\3\2\2\2\u020c\u020d\7o\2\2\u020d" +
                    "\u020e\t\7\2\2\u020e\u020f\5\u0096L\2\u020f\u0210\7u\2\2\u0210\u0211\7" +
                    "\u00b3\2\2\u0211\u0212\5P)\2\u0212\u0399\3\2\2\2\u0213\u0214\7o\2\2\u0214" +
                    "\u0215\t\7\2\2\u0215\u0216\5\u0096L\2\u0216\u0217\7\u00b2\2\2\u0217\u021a" +
                    "\7\u00b3\2\2\u0218\u0219\7}\2\2\u0219\u021b\7+\2\2\u021a\u0218\3\2\2\2" +
                    "\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\5P)\2\u021d\u0399" +
                    "\3\2\2\2\u021e\u021f\7o\2\2\u021f\u0220\7U\2\2\u0220\u0222\5\u0096L\2" +
                    "\u0221\u0223\5B\"\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224" +
                    "\3\2\2\2\u0224\u0225\7u\2\2\u0225\u0226\7\u009b\2\2\u0226\u022a\7\u00e9" +
                    "\2\2\u0227\u0228\7R\2\2\u0228\u0229\7\u009c\2\2\u0229\u022b\5P)\2\u022a" +
                    "\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0399\3\2\2\2\u022c\u022d\7o" +
                    "\2\2\u022d\u022e\7U\2\2\u022e\u0230\5\u0096L\2\u022f\u0231\5B\"\2\u0230" +
                    "\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\7u" +
                    "\2\2\u0233\u0234\7\u009c\2\2\u0234\u0235\5P)\2\u0235\u0399\3\2\2\2\u0236" +
                    "\u0237\7o\2\2\u0237\u0238\7U\2\2\u0238\u0239\5\u0096L\2\u0239\u023d\7" +
                    "\27\2\2\u023a\u023b\7}\2\2\u023b\u023c\7)\2\2\u023c\u023e\7+\2\2\u023d" +
                    "\u023a\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0241\5@" +
                    "!\2\u0240\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0240\3\2\2\2\u0242" +
                    "\u0243\3\2\2\2\u0243\u0399\3\2\2\2\u0244\u0245\7o\2\2\u0245\u0246\7V\2" +
                    "\2\u0246\u0247\5\u0096L\2\u0247\u024b\7\27\2\2\u0248\u0249\7}\2\2\u0249" +
                    "\u024a\7)\2\2\u024a\u024c\7+\2\2\u024b\u0248\3\2\2\2\u024b\u024c\3\2\2" +
                    "\2\u024c\u024e\3\2\2\2\u024d\u024f\5B\"\2\u024e\u024d\3\2\2\2\u024f\u0250" +
                    "\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0399\3\2\2\2\u0252" +
                    "\u0253\7o\2\2\u0253\u0254\7U\2\2\u0254\u0255\5\u0096L\2\u0255\u0256\5" +
                    "B\"\2\u0256\u0257\7p\2\2\u0257\u0258\7l\2\2\u0258\u0259\5B\"\2\u0259\u0399" +
                    "\3\2\2\2\u025a\u025b\7o\2\2\u025b\u025c\7U\2\2\u025c\u025d\5\u0096L\2" +
                    "\u025d\u0260\7h\2\2\u025e\u025f\7}\2\2\u025f\u0261\7+\2\2\u0260\u025e" +
                    "\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0267\5B\"\2\u0263" +
                    "\u0264\7\t\2\2\u0264\u0266\5B\"\2\u0265\u0263\3\2\2\2\u0266\u0269\3\2" +
                    "\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026b\3\2\2\2\u0269" +
                    "\u0267\3\2\2\2\u026a\u026c\7\u00c6\2\2\u026b\u026a\3\2\2\2\u026b\u026c" +
                    "\3\2\2\2\u026c\u0399\3\2\2\2\u026d\u026e\7o\2\2\u026e\u026f\7V\2\2\u026f" +
                    "\u0270\5\u0096L\2\u0270\u0273\7h\2\2\u0271\u0272\7}\2\2\u0272\u0274\7" +
                    "+\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275" +
                    "\u027a\5B\"\2\u0276\u0277\7\t\2\2\u0277\u0279\5B\"\2\u0278\u0276\3\2\2" +
                    "\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0399" +
                    "\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027e\7o\2\2\u027e\u027f\7U\2\2\u027f" +
                    "\u0281\5\u0096L\2\u0280\u0282\5B\"\2\u0281\u0280\3\2\2\2\u0281\u0282\3" +
                    "\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\7u\2\2\u0284\u0285\5:\36\2\u0285" +
                    "\u0399\3\2\2\2\u0286\u0287\7h\2\2\u0287\u028a\7U\2\2\u0288\u0289\7}\2" +
                    "\2\u0289\u028b\7+\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c" +
                    "\3\2\2\2\u028c\u028e\5\u0096L\2\u028d\u028f\7\u00c6\2\2\u028e\u028d\3" +
                    "\2\2\2\u028e\u028f\3\2\2\2\u028f\u0399\3\2\2\2\u0290\u0291\7h\2\2\u0291" +
                    "\u0294\7V\2\2\u0292\u0293\7}\2\2\u0293\u0295\7+\2\2\u0294\u0292\3\2\2" +
                    "\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0399\5\u0096L\2\u0297" +
                    "\u029a\7T\2\2\u0298\u0299\7&\2\2\u0299\u029b\7W\2\2\u029a\u0298\3\2\2" +
                    "\2\u029a\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c\u029e\7\u00b0\2\2\u029d" +
                    "\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a3\7V" +
                    "\2\2\u02a0\u02a1\7}\2\2\u02a1\u02a2\7)\2\2\u02a2\u02a4\7+\2\2\u02a3\u02a0" +
                    "\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\5\u0096L" +
                    "\2\u02a6\u02a8\5\u008cG\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8" +
                    "\u02ab\3\2\2\2\u02a9\u02aa\7t\2\2\u02aa\u02ac\7\u00e9\2\2\u02ab\u02a9" +
                    "\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02b0\3\2\2\2\u02ad\u02ae\7\u00d1\2" +
                    "\2\u02ae\u02af\7F\2\2\u02af\u02b1\5\u0084C\2\u02b0\u02ad\3\2\2\2\u02b0" +
                    "\u02b1\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b3\7\u00b3\2\2\u02b3\u02b5" +
                    "\5P)\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6" +
                    "\u02b7\7\30\2\2\u02b7\u02b8\5<\37\2\u02b8\u0399\3\2\2\2\u02b9\u02bc\7" +
                    "T\2\2\u02ba\u02bb\7&\2\2\u02bb\u02bd\7W\2\2\u02bc\u02ba\3\2\2\2\u02bc" +
                    "\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\7\u00b0\2\2\u02bf\u02c0" +
                    "\7V\2\2\u02c0\u02c5\5\u0096L\2\u02c1\u02c2\7\7\2\2\u02c2\u02c3\5\u00ba" +
                    "^\2\u02c3\u02c4\7\b\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c1\3\2\2\2\u02c5" +
                    "\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02ca\5N(\2\u02c8\u02c9\7\u00b1" +
                    "\2\2\u02c9\u02cb\5P)\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u0399" +
                    "\3\2\2\2\u02cc\u02cd\7o\2\2\u02cd\u02ce\7V\2\2\u02ce\u02d0\5\u0096L\2" +
                    "\u02cf\u02d1\7\30\2\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2" +
                    "\3\2\2\2\u02d2\u02d3\5<\37\2\u02d3\u0399\3\2\2\2\u02d4\u02d6\7T\2\2\u02d5" +
                    "\u02d7\7\u00b0\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8" +
                    "\3\2\2\2\u02d8\u02d9\7\u00a8\2\2\u02d9\u02da\5\u00caf\2\u02da\u02db\7" +
                    "\30\2\2\u02db\u02e5\7\u00e9\2\2\u02dc\u02dd\7\u009a\2\2\u02dd\u02e2\5" +
                    "b\62\2\u02de\u02df\7\t\2\2\u02df\u02e1\5b\62\2\u02e0\u02de\3\2\2\2\u02e1" +
                    "\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e6\3\2" +
                    "\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02dc\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6" +
                    "\u0399\3\2\2\2\u02e7\u02e9\7h\2\2\u02e8\u02ea\7\u00b0\2\2\u02e9\u02e8" +
                    "\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ee\7\u00a8\2" +
                    "\2\u02ec\u02ed\7}\2\2\u02ed\u02ef\7+\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef" +
                    "\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u0399\5\u00caf\2\u02f1\u02f3\7\\\2" +
                    "\2\u02f2\u02f4\t\b\2\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5" +
                    "\3\2\2\2\u02f5\u0399\5\60\31\2\u02f6\u02f7\7a\2\2\u02f7\u02fa\7b\2\2\u02f8" +
                    "\u02f9\t\t\2\2\u02f9\u02fb\5\u00ccg\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb" +
                    "\3\2\2\2\u02fb\u0300\3\2\2\2\u02fc\u02fe\7-\2\2\u02fd\u02fc\3\2\2\2\u02fd" +
                    "\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\7\u00e9\2\2\u0300\u02fd" +
                    "\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0399\3\2\2\2\u0302\u0303\7a\2\2\u0303" +
                    "\u0306\7\u00ca\2\2\u0304\u0305\7-\2\2\u0305\u0307\7\u00e9\2\2\u0306\u0304" +
                    "\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0399\3\2\2\2\u0308\u0309\7a\2\2\u0309" +
                    "\u030a\7\u00b3\2\2\u030a\u030f\5\u0096L\2\u030b\u030c\7\7\2\2\u030c\u030d" +
                    "\5T+\2\u030d\u030e\7\b\2\2\u030e\u0310\3\2\2\2\u030f\u030b\3\2\2\2\u030f" +
                    "\u0310\3\2\2\2\u0310\u0399\3\2\2\2\u0311\u0312\7a\2\2\u0312\u0313\7c\2" +
                    "\2\u0313\u0314\t\t\2\2\u0314\u0317\5\u0096L\2\u0315\u0316\t\t\2\2\u0316" +
                    "\u0318\5\u00ccg\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0399" +
                    "\3\2\2\2\u0319\u031a\7a\2\2\u031a\u031b\7f\2\2\u031b\u031d\5\u0096L\2" +
                    "\u031c\u031e\5B\"\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0399" +
                    "\3\2\2\2\u031f\u0321\7a\2\2\u0320\u0322\5\u00ccg\2\u0321\u0320\3\2\2\2" +
                    "\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u032b\7g\2\2\u0324\u0326" +
                    "\7-\2\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0329\3\2\2\2\u0327" +
                    "\u032a\5\u00caf\2\u0328\u032a\7\u00e9\2\2\u0329\u0327\3\2\2\2\u0329\u0328" +
                    "\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u0325\3\2\2\2\u032b\u032c\3\2\2\2\u032c" +
                    "\u0399\3\2\2\2\u032d\u032e\7a\2\2\u032e\u032f\7T\2\2\u032f\u0330\7U\2" +
                    "\2\u0330\u0399\5\u0096L\2\u0331\u0332\t\n\2\2\u0332\u0334\7\u00a8\2\2" +
                    "\u0333\u0335\7\u00a9\2\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335" +
                    "\u0336\3\2\2\2\u0336\u0399\5F$\2\u0337\u0338\t\n\2\2\u0338\u033a\7\u00c9" +
                    "\2\2\u0339\u033b\7\u00a9\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b" +
                    "\u033c\3\2\2\2\u033c\u0399\5\u00ccg\2\u033d\u033f\t\n\2\2\u033e\u0340" +
                    "\t\13\2\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2\2" +
                    "\u0341\u0343\5\u0096L\2\u0342\u0344\5B\"\2\u0343\u0342\3\2\2\2\u0343\u0344" +
                    "\3\2\2\2\u0344\u0346\3\2\2\2\u0345\u0347\5H%\2\u0346\u0345\3\2\2\2\u0346" +
                    "\u0347\3\2\2\2\u0347\u0399\3\2\2\2\u0348\u0349\7\u00aa\2\2\u0349\u034a" +
                    "\7U\2\2\u034a\u0399\5\u0096L\2\u034b\u034f\7\u00aa\2\2\u034c\u034e\13" +
                    "\2\2\2\u034d\u034c\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u0350\3\2\2\2\u034f" +
                    "\u034d\3\2\2\2\u0350\u0399\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0354\7\u00ac" +
                    "\2\2\u0353\u0355\7\u00ae\2\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355" +
                    "\u0356\3\2\2\2\u0356\u0357\7U\2\2\u0357\u035c\5\u0096L\2\u0358\u035a\7" +
                    "\30\2\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b" +
                    "\u035d\5<\37\2\u035c\u0359\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0399\3\2" +
                    "\2\2\u035e\u035f\7\u00ad\2\2\u035f\u0360\7U\2\2\u0360\u0399\5\u0096L\2" +
                    "\u0361\u0362\7\u00ab\2\2\u0362\u0399\7\u00ac\2\2\u0363\u0364\7\u00dc\2" +
                    "\2\u0364\u0366\7w\2\2\u0365\u0367\7\u00e7\2\2\u0366\u0365\3\2\2\2\u0366" +
                    "\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\7\u00e8\2\2\u0369\u036b" +
                    "\7\u00e9\2\2\u036a\u036c\7\u0097\2\2\u036b\u036a\3\2\2\2\u036b\u036c\3" +
                    "\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\7Z\2\2\u036e\u036f\7U\2\2\u036f" +
                    "\u0371\5\u0096L\2\u0370\u0372\5B\"\2\u0371\u0370\3\2\2\2\u0371\u0372\3" +
                    "\2\2\2\u0372\u0399\3\2\2\2\u0373\u0374\7\u00cc\2\2\u0374\u0375\7U\2\2" +
                    "\u0375\u0377\5\u0096L\2\u0376\u0378\5B\"\2\u0377\u0376\3\2\2\2\u0377\u0378" +
                    "\3\2\2\2\u0378\u0399\3\2\2\2\u0379\u037a\t\f\2\2\u037a\u037e\5\u00ccg" +
                    "\2\u037b\u037d\13\2\2\2\u037c\u037b\3\2\2\2\u037d\u0380\3\2\2\2\u037e" +
                    "\u037f\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0399\3\2\2\2\u0380\u037e\3\2" +
                    "\2\2\u0381\u0382\7u\2\2\u0382\u0386\7\u00dd\2\2\u0383\u0385\13\2\2\2\u0384" +
                    "\u0383\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0387\3\2\2\2\u0386\u0384\3\2" +
                    "\2\2\u0387\u0399\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038d\7u\2\2\u038a" +
                    "\u038c\13\2\2\2\u038b\u038a\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038e\3" +
                    "\2\2\2\u038d\u038b\3\2\2\2\u038e\u0399\3\2\2\2\u038f\u038d\3\2\2\2\u0390" +
                    "\u0399\7v\2\2\u0391\u0395\5\62\32\2\u0392\u0394\13\2\2\2\u0393\u0392\3" +
                    "\2\2\2\u0394\u0397\3\2\2\2\u0395\u0396\3\2\2\2\u0395\u0393\3\2\2\2\u0396" +
                    "\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0398\u016f\3\2\2\2\u0398\u0170\3\2" +
                    "\2\2\u0398\u0172\3\2\2\2\u0398\u0186\3\2\2\2\u0398\u018d\3\2\2\2\u0398" +
                    "\u0197\3\2\2\2\u0398\u01ab\3\2\2\2\u0398\u01be\3\2\2\2\u0398\u01ea\3\2" +
                    "\2\2\u0398\u01f5\3\2\2\2\u0398\u0205\3\2\2\2\u0398\u020c\3\2\2\2\u0398" +
                    "\u0213\3\2\2\2\u0398\u021e\3\2\2\2\u0398\u022c\3\2\2\2\u0398\u0236\3\2" +
                    "\2\2\u0398\u0244\3\2\2\2\u0398\u0252\3\2\2\2\u0398\u025a\3\2\2\2\u0398" +
                    "\u026d\3\2\2\2\u0398\u027d\3\2\2\2\u0398\u0286\3\2\2\2\u0398\u0290\3\2" +
                    "\2\2\u0398\u0297\3\2\2\2\u0398\u02b9\3\2\2\2\u0398\u02cc\3\2\2\2\u0398" +
                    "\u02d4\3\2\2\2\u0398\u02e7\3\2\2\2\u0398\u02f1\3\2\2\2\u0398\u02f6\3\2" +
                    "\2\2\u0398\u0302\3\2\2\2\u0398\u0308\3\2\2\2\u0398\u0311\3\2\2\2\u0398" +
                    "\u0319\3\2\2\2\u0398\u031f\3\2\2\2\u0398\u032d\3\2\2\2\u0398\u0331\3\2" +
                    "\2\2\u0398\u0337\3\2\2\2\u0398\u033d\3\2\2\2\u0398\u0348\3\2\2\2\u0398" +
                    "\u034b\3\2\2\2\u0398\u0352\3\2\2\2\u0398\u035e\3\2\2\2\u0398\u0361\3\2" +
                    "\2\2\u0398\u0363\3\2\2\2\u0398\u0373\3\2\2\2\u0398\u0379\3\2\2\2\u0398" +
                    "\u0381\3\2\2\2\u0398\u0389\3\2\2\2\u0398\u0390\3\2\2\2\u0398\u0391\3\2" +
                    "\2\2\u0399\61\3\2\2\2\u039a\u039b\7T\2\2\u039b\u045b\7\u00dd\2\2\u039c" +
                    "\u039d\7h\2\2\u039d\u045b\7\u00dd\2\2\u039e\u03a0\7\u00d5\2\2\u039f\u03a1" +
                    "\7\u00dd\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u045b\3\2\2" +
                    "\2\u03a2\u03a4\7\u00d4\2\2\u03a3\u03a5\7\u00dd\2\2\u03a4\u03a3\3\2\2\2" +
                    "\u03a4\u03a5\3\2\2\2\u03a5\u045b\3\2\2\2\u03a6\u03a7\7a\2\2\u03a7\u045b" +
                    "\7\u00d5\2\2\u03a8\u03a9\7a\2\2\u03a9\u03ab\7\u00dd\2\2\u03aa\u03ac\7" +
                    "\u00d5\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u045b\3\2\2\2" +
                    "\u03ad\u03ae\7a\2\2\u03ae\u045b\7\u00e0\2\2\u03af\u03b0\7a\2\2\u03b0\u045b" +
                    "\7\u00de\2\2\u03b1\u03b2\7a\2\2\u03b2\u03b3\7P\2\2\u03b3\u045b\7\u00de" +
                    "\2\2\u03b4\u03b5\7\u00da\2\2\u03b5\u045b\7U\2\2\u03b6\u03b7\7\u00db\2" +
                    "\2\u03b7\u045b\7U\2\2\u03b8\u03b9\7a\2\2\u03b9\u045b\7\u00df\2\2\u03ba" +
                    "\u03bb\7a\2\2\u03bb\u03bc\7T\2\2\u03bc\u045b\7U\2\2\u03bd\u03be\7a\2\2" +
                    "\u03be\u045b\7\u00e1\2\2\u03bf\u03c0\7a\2\2\u03c0\u045b\7\u00e3\2\2\u03c1" +
                    "\u03c2\7a\2\2\u03c2\u045b\7\u00e4\2\2\u03c3\u03c4\7T\2\2\u03c4\u045b\7" +
                    "\u00e2\2\2\u03c5\u03c6\7h\2\2\u03c6\u045b\7\u00e2\2\2\u03c7\u03c8\7o\2" +
                    "\2\u03c8\u045b\7\u00e2\2\2\u03c9\u03ca\7\u00d6\2\2\u03ca\u045b\7U\2\2" +
                    "\u03cb\u03cc\7\u00d6\2\2\u03cc\u045b\7\u00c9\2\2\u03cd\u03ce\7\u00d7\2" +
                    "\2\u03ce\u045b\7U\2\2\u03cf\u03d0\7\u00d7\2\2\u03d0\u045b\7\u00c9\2\2" +
                    "\u03d1\u03d2\7T\2\2\u03d2\u03d3\7\u00b0\2\2\u03d3\u045b\7|\2\2\u03d4\u03d5" +
                    "\7h\2\2\u03d5\u03d6\7\u00b0\2\2\u03d6\u045b\7|\2\2\u03d7\u03d8\7\u00d8" +
                    "\2\2\u03d8\u03d9\7\u00d9\2\2\u03d9\u045b\7U\2\2\u03da\u03db\7o\2\2\u03db" +
                    "\u03dc\7U\2\2\u03dc\u03dd\5\u0096L\2\u03dd\u03de\7)\2\2\u03de\u03df\7" +
                    "\u00c4\2\2\u03df\u045b\3\2\2\2\u03e0\u03e1\7o\2\2\u03e1\u03e2\7U\2\2\u03e2" +
                    "\u03e3\5\u0096L\2\u03e3\u03e4\7\u00c4\2\2\u03e4\u03e5\7\35\2\2\u03e5\u045b" +
                    "\3\2\2\2\u03e6\u03e7\7o\2\2\u03e7\u03e8\7U\2\2\u03e8\u03e9\5\u0096L\2" +
                    "\u03e9\u03ea\7)\2\2\u03ea\u03eb\7\u00c5\2\2\u03eb\u045b\3\2\2\2\u03ec" +
                    "\u03ed\7o\2\2\u03ed\u03ee\7U\2\2\u03ee\u03ef\5\u0096L\2\u03ef\u03f0\7" +
                    "\u00b6\2\2\u03f0\u03f1\7\35\2\2\u03f1\u045b\3\2\2\2\u03f2\u03f3\7o\2\2" +
                    "\u03f3\u03f4\7U\2\2\u03f4\u03f5\5\u0096L\2\u03f5\u03f6\7)\2\2\u03f6\u03f7" +
                    "\7\u00b6\2\2\u03f7\u045b\3\2\2\2\u03f8\u03f9\7o\2\2\u03f9\u03fa\7U\2\2" +
                    "\u03fa\u03fb\5\u0096L\2\u03fb\u03fc\7)\2\2\u03fc\u03fd\7\u00b7\2\2\u03fd" +
                    "\u03fe\7\30\2\2\u03fe\u03ff\7\u00b8\2\2\u03ff\u045b\3\2\2\2\u0400\u0401" +
                    "\7o\2\2\u0401\u0402\7U\2\2\u0402\u0403\5\u0096L\2\u0403\u0404\7u\2\2\u0404" +
                    "\u0405\7\u00b6\2\2\u0405\u0406\7\u00b9\2\2\u0406\u045b\3\2\2\2\u0407\u0408" +
                    "\7o\2\2\u0408\u0409\7U\2\2\u0409\u040a\5\u0096L\2\u040a\u040b\7\u00ba" +
                    "\2\2\u040b\u040c\7J\2\2\u040c\u045b\3\2\2\2\u040d\u040e\7o\2\2\u040e\u040f" +
                    "\7U\2\2\u040f\u0410\5\u0096L\2\u0410\u0411\7\u00bb\2\2\u0411\u0412\7J" +
                    "\2\2\u0412\u045b\3\2\2\2\u0413\u0414\7o\2\2\u0414\u0415\7U\2\2\u0415\u0416" +
                    "\5\u0096L\2\u0416\u0417\7\u00bc\2\2\u0417\u0418\7J\2\2\u0418\u045b\3\2" +
                    "\2\2\u0419\u041a\7o\2\2\u041a\u041b\7U\2\2\u041b\u041c\5\u0096L\2\u041c" +
                    "\u041d\7\u00be\2\2\u041d\u045b\3\2\2\2\u041e\u041f\7o\2\2\u041f\u0420" +
                    "\7U\2\2\u0420\u0422\5\u0096L\2\u0421\u0423\5B\"\2\u0422\u0421\3\2\2\2" +
                    "\u0422\u0423\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0425\7\u00bf\2\2\u0425" +
                    "\u045b\3\2\2\2\u0426\u0427\7o\2\2\u0427\u0428\7U\2\2\u0428\u042a\5\u0096" +
                    "L\2\u0429\u042b\5B\"\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c" +
                    "\3\2\2\2\u042c\u042d\7\u00c0\2\2\u042d\u045b\3\2\2\2\u042e\u042f\7o\2" +
                    "\2\u042f\u0430\7U\2\2\u0430\u0432\5\u0096L\2\u0431\u0433\5B\"\2\u0432" +
                    "\u0431\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\7u" +
                    "\2\2\u0435\u0436\7\u00bd\2\2\u0436\u045b\3\2\2\2\u0437\u0438\7o\2\2\u0438" +
                    "\u0439\7U\2\2\u0439\u043b\5\u0096L\2\u043a\u043c\5B\"\2\u043b\u043a\3" +
                    "\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\7\27\2\2\u043e" +
                    "\u043f\7c\2\2\u043f\u045b\3\2\2\2\u0440\u0441\7o\2\2\u0441\u0442\7U\2" +
                    "\2\u0442\u0444\5\u0096L\2\u0443\u0445\5B\"\2\u0444\u0443\3\2\2\2\u0444" +
                    "\u0445\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0448\7\u00c1\2\2\u0447\u0449" +
                    "\7c\2\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u045b\3\2\2\2\u044a" +
                    "\u044b\7o\2\2\u044b\u044c\7U\2\2\u044c\u044e\5\u0096L\2\u044d\u044f\5" +
                    "B\"\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450" +
                    "\u0451\7W\2\2\u0451\u0452\7c\2\2\u0452\u045b\3\2\2\2\u0453\u0454\7x\2" +
                    "\2\u0454\u045b\7y\2\2\u0455\u045b\7z\2\2\u0456\u045b\7{\2\2\u0457\u045b" +
                    "\7\u00cb\2\2\u0458\u0459\7Y\2\2\u0459\u045b\7\26\2\2\u045a\u039a\3\2\2" +
                    "\2\u045a\u039c\3\2\2\2\u045a\u039e\3\2\2\2\u045a\u03a2\3\2\2\2\u045a\u03a6" +
                    "\3\2\2\2\u045a\u03a8\3\2\2\2\u045a\u03ad\3\2\2\2\u045a\u03af\3\2\2\2\u045a" +
                    "\u03b1\3\2\2\2\u045a\u03b4\3\2\2\2\u045a\u03b6\3\2\2\2\u045a\u03b8\3\2" +
                    "\2\2\u045a\u03ba\3\2\2\2\u045a\u03bd\3\2\2\2\u045a\u03bf\3\2\2\2\u045a" +
                    "\u03c1\3\2\2\2\u045a\u03c3\3\2\2\2\u045a\u03c5\3\2\2\2\u045a\u03c7\3\2" +
                    "\2\2\u045a\u03c9\3\2\2\2\u045a\u03cb\3\2\2\2\u045a\u03cd\3\2\2\2\u045a" +
                    "\u03cf\3\2\2\2\u045a\u03d1\3\2\2\2\u045a\u03d4\3\2\2\2\u045a\u03d7\3\2" +
                    "\2\2\u045a\u03da\3\2\2\2\u045a\u03e0\3\2\2\2\u045a\u03e6\3\2\2\2\u045a" +
                    "\u03ec\3\2\2\2\u045a\u03f2\3\2\2\2\u045a\u03f8\3\2\2\2\u045a\u0400\3\2" +
                    "\2\2\u045a\u0407\3\2\2\2\u045a\u040d\3\2\2\2\u045a\u0413\3\2\2\2\u045a" +
                    "\u0419\3\2\2\2\u045a\u041e\3\2\2\2\u045a\u0426\3\2\2\2\u045a\u042e\3\2" +
                    "\2\2\u045a\u0437\3\2\2\2\u045a\u0440\3\2\2\2\u045a\u044a\3\2\2\2\u045a" +
                    "\u0453\3\2\2\2\u045a\u0455\3\2\2\2\u045a\u0456\3\2\2\2\u045a\u0457\3\2" +
                    "\2\2\u045a\u0458\3\2\2\2\u045b\63\3\2\2\2\u045c\u045e\7T\2\2\u045d\u045f" +
                    "\7\u00b0\2\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0461\3\2\2" +
                    "\2\u0460\u0462\7\u00d2\2\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462" +
                    "\u0463\3\2\2\2\u0463\u0467\7U\2\2\u0464\u0465\7}\2\2\u0465\u0466\7)\2" +
                    "\2\u0466\u0468\7+\2\2\u0467\u0464\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469" +
                    "\3\2\2\2\u0469\u046a\5\u0096L\2\u046a\65\3\2\2\2\u046b\u046c\7\u00c4\2" +
                    "\2\u046c\u046d\7\35\2\2\u046d\u0471\5\u0084C\2\u046e\u046f\7\u00c5\2\2" +
                    "\u046f\u0470\7\35\2\2\u0470\u0472\5\u0088E\2\u0471\u046e\3\2\2\2\u0471" +
                    "\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\7Z\2\2\u0474\u0475\7\u00ee" +
                    "\2\2\u0475\u0476\7\u00b5\2\2\u0476\67\3\2\2\2\u0477\u0478\7\u00b6\2\2" +
                    "\u0478\u0479\7\35\2\2\u0479\u047a\5\u0084C\2\u047a\u047d\7F\2\2\u047b" +
                    "\u047e\5X-\2\u047c\u047e\5Z.\2\u047d\u047b\3\2\2\2\u047d\u047c\3\2\2\2" +
                    "\u047e\u0482\3\2\2\2\u047f\u0480\7\u00b7\2\2\u0480\u0481\7\30\2\2\u0481" +
                    "\u0483\7\u00b8\2\2\u0482\u047f\3\2\2\2\u0482\u0483\3\2\2\2\u04839\3\2" +
                    "\2\2\u0484\u0485\7\u00b9\2\2\u0485\u0486\7\u00e9\2\2\u0486;\3\2\2\2\u0487" +
                    "\u0489\5J&\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2" +
                    "\2\u048a\u048b\5d\63\2\u048b=\3\2\2\2\u048c\u048d\7X\2\2\u048d\u048e\7" +
                    "\u0097\2\2\u048e\u048f\7U\2\2\u048f\u0496\5\u0096L\2\u0490\u0494\5B\"" +
                    "\2\u0491\u0492\7}\2\2\u0492\u0493\7)\2\2\u0493\u0495\7+\2\2\u0494\u0491" +
                    "\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0497\3\2\2\2\u0496\u0490\3\2\2\2\u0496" +
                    "\u0497\3\2\2\2\u0497\u04a2\3\2\2\2\u0498\u0499\7X\2\2\u0499\u049b\7Z\2" +
                    "\2\u049a\u049c\7U\2\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d" +
                    "\3\2\2\2\u049d\u049f\5\u0096L\2\u049e\u04a0\5B\"\2\u049f\u049e\3\2\2\2" +
                    "\u049f\u04a0\3\2\2\2\u04a0\u04a2\3\2\2\2\u04a1\u048c\3\2\2\2\u04a1\u0498" +
                    "\3\2\2\2\u04a2?\3\2\2\2\u04a3\u04a5\5B\"\2\u04a4\u04a6\5:\36\2\u04a5\u04a4" +
                    "\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6A\3\2\2\2\u04a7\u04a8\7J\2\2\u04a8\u04a9" +
                    "\7\7\2\2\u04a9\u04ae\5D#\2\u04aa\u04ab\7\t\2\2\u04ab\u04ad\5D#\2\u04ac" +
                    "\u04aa\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04af\3\2" +
                    "\2\2\u04af\u04b1\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04b2\7\b\2\2\u04b2" +
                    "C\3\2\2\2\u04b3\u04b6\5\u00ccg\2\u04b4\u04b5\7~\2\2\u04b5\u04b7\5\u00a8" +
                    "U\2\u04b6\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7E\3\2\2\2\u04b8\u04be" +
                    "\5\u00caf\2\u04b9\u04be\7\u00e9\2\2\u04ba\u04be\5\u00aaV\2\u04bb\u04be" +
                    "\5\u00acW\2\u04bc\u04be\5\u00aeX\2\u04bd\u04b8\3\2\2\2\u04bd\u04b9\3\2" +
                    "\2\2\u04bd\u04ba\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04bc\3\2\2\2\u04be" +
                    "G\3\2\2\2\u04bf\u04c7\5\u00ccg\2\u04c0\u04c3\7\17\2\2\u04c1\u04c4\5\u00cc" +
                    "g\2\u04c2\u04c4\7\u00e9\2\2\u04c3\u04c1\3\2\2\2\u04c3\u04c2\3\2\2\2\u04c4" +
                    "\u04c6\3\2\2\2\u04c5\u04c0\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c5\3\2" +
                    "\2\2\u04c7\u04c8\3\2\2\2\u04c8I\3\2\2\2\u04c9\u04c7\3\2\2\2\u04ca\u04cb" +
                    "\7R\2\2\u04cb\u04d0\5L\'\2\u04cc\u04cd\7\t\2\2\u04cd\u04cf\5L\'\2\u04ce" +
                    "\u04cc\3\2\2\2\u04cf\u04d2\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2" +
                    "\2\2\u04d1K\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04d5\5\u00ccg\2\u04d4\u04d6" +
                    "\7\30\2\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\3\2\2\2" +
                    "\u04d7\u04d8\7\7\2\2\u04d8\u04d9\5d\63\2\u04d9\u04da\7\b\2\2\u04daM\3" +
                    "\2\2\2\u04db\u04dc\7\u009a\2\2\u04dc\u04dd\5\u00caf\2\u04ddO\3\2\2\2\u04de" +
                    "\u04df\7\7\2\2\u04df\u04e4\5R*\2\u04e0\u04e1\7\t\2\2\u04e1\u04e3\5R*\2" +
                    "\u04e2\u04e0\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5" +
                    "\3\2\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04e8\7\b\2\2\u04e8" +
                    "Q\3\2\2\2\u04e9\u04ee\5T+\2\u04ea\u04ec\7~\2\2\u04eb\u04ea\3\2\2\2\u04eb" +
                    "\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ef\5V,\2\u04ee\u04eb\3\2\2" +
                    "\2\u04ee\u04ef\3\2\2\2\u04efS\3\2\2\2\u04f0\u04f5\5\u00ccg\2\u04f1\u04f2" +
                    "\7\17\2\2\u04f2\u04f4\5\u00ccg\2\u04f3\u04f1\3\2\2\2\u04f4\u04f7\3\2\2" +
                    "\2\u04f5\u04f3\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04fa\3\2\2\2\u04f7\u04f5" +
                    "\3\2\2\2\u04f8\u04fa\7\u00e9\2\2\u04f9\u04f0\3\2\2\2\u04f9\u04f8\3\2\2" +
                    "\2\u04faU\3\2\2\2\u04fb\u0500\7\u00ee\2\2\u04fc\u0500\7\u00ef\2\2\u04fd" +
                    "\u0500\5\u00b0Y\2\u04fe\u0500\7\u00e9\2\2\u04ff\u04fb\3\2\2\2\u04ff\u04fc" +
                    "\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff\u04fe\3\2\2\2\u0500W\3\2\2\2\u0501" +
                    "\u0502\7\7\2\2\u0502\u0507\5\u00a8U\2\u0503\u0504\7\t\2\2\u0504\u0506" +
                    "\5\u00a8U\2\u0505\u0503\3\2\2\2\u0506\u0509\3\2\2\2\u0507\u0505\3\2\2" +
                    "\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2\2\2\u0509\u0507\3\2\2\2\u050a\u050b" +
                    "\7\b\2\2\u050bY\3\2\2\2\u050c\u050d\7\7\2\2\u050d\u0512\5X-\2\u050e\u050f" +
                    "\7\t\2\2\u050f\u0511\5X-\2\u0510\u050e\3\2\2\2\u0511\u0514\3\2\2\2\u0512" +
                    "\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515\3\2\2\2\u0514\u0512\3\2" +
                    "\2\2\u0515\u0516\7\b\2\2\u0516[\3\2\2\2\u0517\u0518\7\u00b7\2\2\u0518" +
                    "\u0519\7\30\2\2\u0519\u051e\5^\60\2\u051a\u051b\7\u00b7\2\2\u051b\u051c" +
                    "\7\35\2\2\u051c\u051e\5`\61\2\u051d\u0517\3\2\2\2\u051d\u051a\3\2\2\2" +
                    "\u051e]\3\2\2\2\u051f\u0520\7\u00c7\2\2\u0520\u0521\7\u00e9\2\2\u0521" +
                    "\u0522\7\u00c8\2\2\u0522\u0525\7\u00e9\2\2\u0523\u0525\5\u00ccg\2\u0524" +
                    "\u051f\3\2\2\2\u0524\u0523\3\2\2\2\u0525_\3\2\2\2\u0526\u052a\7\u00e9" +
                    "\2\2\u0527\u0528\7R\2\2\u0528\u0529\7\u009c\2\2\u0529\u052b\5P)\2\u052a" +
                    "\u0527\3\2\2\2\u052a\u052b\3\2\2\2\u052ba\3\2\2\2\u052c\u052d\5\u00cc" +
                    "g\2\u052d\u052e\7\u00e9\2\2\u052ec\3\2\2\2\u052f\u0531\5> \2\u0530\u052f" +
                    "\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\5j\66\2\u0533" +
                    "\u0534\5f\64\2\u0534\u053c\3\2\2\2\u0535\u0537\5r:\2\u0536\u0538\5h\65" +
                    "\2\u0537\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a" +
                    "\3\2\2\2\u053a\u053c\3\2\2\2\u053b\u0530\3\2\2\2\u053b\u0535\3\2\2\2\u053c" +
                    "e\3\2\2\2\u053d\u053e\7\"\2\2\u053e\u053f\7\35\2\2\u053f\u0544\5n8\2\u0540" +
                    "\u0541\7\t\2\2\u0541\u0543\5n8\2\u0542\u0540\3\2\2\2\u0543\u0546\3\2\2" +
                    "\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544" +
                    "\3\2\2\2\u0547\u053d\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0553\3\2\2\2\u0549" +
                    "\u054a\7\u0095\2\2\u054a\u054b\7\35\2\2\u054b\u0550\5\u009cO\2\u054c\u054d" +
                    "\7\t\2\2\u054d\u054f\5\u009cO\2\u054e\u054c\3\2\2\2\u054f\u0552\3\2\2" +
                    "\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550" +
                    "\3\2\2\2\u0553\u0549\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u055f\3\2\2\2\u0555" +
                    "\u0556\7\u0096\2\2\u0556\u0557\7\35\2\2\u0557\u055c\5\u009cO\2\u0558\u0559" +
                    "\7\t\2\2\u0559\u055b\5\u009cO\2\u055a\u0558\3\2\2\2\u055b\u055e\3\2\2" +
                    "\2\u055c\u055a\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u0560\3\2\2\2\u055e\u055c" +
                    "\3\2\2\2\u055f\u0555\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u056b\3\2\2\2\u0561" +
                    "\u0562\7\u0094\2\2\u0562\u0563\7\35\2\2\u0563\u0568\5n8\2\u0564\u0565" +
                    "\7\t\2\2\u0565\u0567\5n8\2\u0566\u0564\3\2\2\2\u0567\u056a\3\2\2\2\u0568" +
                    "\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056c\3\2\2\2\u056a\u0568\3\2" +
                    "\2\2\u056b\u0561\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056e\3\2\2\2\u056d" +
                    "\u056f\5\u00c0a\2\u056e\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0572" +
                    "\3\2\2\2\u0570\u0571\7$\2\2\u0571\u0573\5\u009cO\2\u0572\u0570\3\2\2\2" +
                    "\u0572\u0573\3\2\2\2\u0573g\3\2\2\2\u0574\u0576\5> \2\u0575\u0574\3\2" +
                    "\2\2\u0575\u0576\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\5p9\2\u0578\u0579" +
                    "\5f\64\2\u0579i\3\2\2\2\u057a\u057b\b\66\1\2\u057b\u057c\5l\67\2\u057c" +
                    "\u0585\3\2\2\2\u057d\u057e\f\3\2\2\u057e\u0580\t\r\2\2\u057f\u0581\5z" +
                    ">\2\u0580\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\3\2\2\2\u0582" +
                    "\u0584\5j\66\4\u0583\u057d\3\2\2\2\u0584\u0587\3\2\2\2\u0585\u0583\3\2" +
                    "\2\2\u0585\u0586\3\2\2\2\u0586k\3\2\2\2\u0587\u0585\3\2\2\2\u0588\u0591" +
                    "\5p9\2\u0589\u058a\7U\2\2\u058a\u0591\5\u0096L\2\u058b\u0591\5\u0092J" +
                    "\2\u058c\u058d\7\7\2\2\u058d\u058e\5d\63\2\u058e\u058f\7\b\2\2\u058f\u0591" +
                    "\3\2\2\2\u0590\u0588\3\2\2\2\u0590\u0589\3\2\2\2\u0590\u058b\3\2\2\2\u0590" +
                    "\u058c\3\2\2\2\u0591m\3\2\2\2\u0592\u0594\5\u009cO\2\u0593\u0595\t\16" +
                    "\2\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595o\3\2\2\2\u0596\u0597" +
                    "\7\25\2\2\u0597\u0598\7\u0098\2\2\u0598\u0599\7\7\2\2\u0599\u059a\5\u009a" +
                    "N\2\u059a\u059b\7\b\2\2\u059b\u05a1\3\2\2\2\u059c\u059d\7r\2\2\u059d\u05a1" +
                    "\5\u009aN\2\u059e\u059f\7\u0099\2\2\u059f\u05a1\5\u009aN\2\u05a0\u0596" +
                    "\3\2\2\2\u05a0\u059c\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1\u05a3\3\2\2\2\u05a2" +
                    "\u05a4\5\u0094K\2\u05a3\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a7" +
                    "\3\2\2\2\u05a5\u05a6\7\u009e\2\2\u05a6\u05a8\7\u00e9\2\2\u05a7\u05a5\3" +
                    "\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\7\u009a\2\2" +
                    "\u05aa\u05b7\7\u00e9\2\2\u05ab\u05b5\7\30\2\2\u05ac\u05b6\5\u0086D\2\u05ad" +
                    "\u05b6\5\u00ba^\2\u05ae\u05b1\7\7\2\2\u05af\u05b2\5\u0086D\2\u05b0\u05b2" +
                    "\5\u00ba^\2\u05b1\u05af\3\2\2\2\u05b1\u05b0\3\2\2\2\u05b2\u05b3\3\2\2" +
                    "\2\u05b3\u05b4\7\b\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05ac\3\2\2\2\u05b5\u05ad" +
                    "\3\2\2\2\u05b5\u05ae\3\2\2\2\u05b6\u05b8\3\2\2\2\u05b7\u05ab\3\2\2\2\u05b7" +
                    "\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05bb\5\u0094K\2\u05ba\u05b9" +
                    "\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05be\3\2\2\2\u05bc\u05bd\7\u009d\2" +
                    "\2\u05bd\u05bf\7\u00e9\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf" +
                    "\u05c1\3\2\2\2\u05c0\u05c2\5r:\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2" +
                    "\2\u05c2\u05c5\3\2\2\2\u05c3\u05c4\7\33\2\2\u05c4\u05c6\5\u009eP\2\u05c5" +
                    "\u05c3\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05ee\3\2\2\2\u05c7\u05c9\7\25" +
                    "\2\2\u05c8\u05ca\5z>\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb" +
                    "\3\2\2\2\u05cb\u05cd\5\u009aN\2\u05cc\u05ce\5r:\2\u05cd\u05cc\3\2\2\2" +
                    "\u05cd\u05ce\3\2\2\2\u05ce\u05d8\3\2\2\2\u05cf\u05d5\5r:\2\u05d0\u05d2" +
                    "\7\25\2\2\u05d1\u05d3\5z>\2\u05d2\u05d1\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3" +
                    "\u05d4\3\2\2\2\u05d4\u05d6\5\u009aN\2\u05d5\u05d0\3\2\2\2\u05d5\u05d6" +
                    "\3\2\2\2\u05d6\u05d8\3\2\2\2\u05d7\u05c7\3\2\2\2\u05d7\u05cf\3\2\2\2\u05d8" +
                    "\u05dc\3\2\2\2\u05d9\u05db\5x=\2\u05da\u05d9\3\2\2\2\u05db\u05de\3\2\2" +
                    "\2\u05dc\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05e1\3\2\2\2\u05de\u05dc" +
                    "\3\2\2\2\u05df\u05e0\7\33\2\2\u05e0\u05e2\5\u009eP\2\u05e1\u05df\3\2\2" +
                    "\2\u05e1\u05e2\3\2\2\2\u05e2\u05e4\3\2\2\2\u05e3\u05e5\5t;\2\u05e4\u05e3" +
                    "\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e8\3\2\2\2\u05e6\u05e7\7#\2\2\u05e7" +
                    "\u05e9\5\u009eP\2\u05e8\u05e6\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb" +
                    "\3\2\2\2\u05ea\u05ec\5\u00c0a\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2" +
                    "\2\u05ec\u05ee\3\2\2\2\u05ed\u05a0\3\2\2\2\u05ed\u05d7\3\2\2\2\u05eeq" +
                    "\3\2\2\2\u05ef\u05f0\7\26\2\2\u05f0\u05f5\5|?\2\u05f1\u05f2\7\t\2\2\u05f2" +
                    "\u05f4\5|?\2\u05f3\u05f1\3\2\2\2\u05f4\u05f7\3\2\2\2\u05f5\u05f3\3\2\2" +
                    "\2\u05f5\u05f6\3\2\2\2\u05f6\u05fb\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f8\u05fa" +
                    "\5x=\2\u05f9\u05f8\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb" +
                    "\u05fc\3\2\2\2\u05fcs\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u05ff\7\34\2\2" +
                    "\u05ff\u0600\7\35\2\2\u0600\u0605\5\u009cO\2\u0601\u0602\7\t\2\2\u0602" +
                    "\u0604\5\u009cO\2\u0603\u0601\3\2\2\2\u0604\u0607\3\2\2\2\u0605\u0603" +
                    "\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0619\3\2\2\2\u0607\u0605\3\2\2\2\u0608" +
                    "\u0609\7R\2\2\u0609\u061a\7!\2\2\u060a\u060b\7R\2\2\u060b\u061a\7 \2\2" +
                    "\u060c\u060d\7\36\2\2\u060d\u060e\7\37\2\2\u060e\u060f\7\7\2\2\u060f\u0614" +
                    "\5v<\2\u0610\u0611\7\t\2\2\u0611\u0613\5v<\2\u0612\u0610\3\2\2\2\u0613" +
                    "\u0616\3\2\2\2\u0614\u0612\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0617\3\2" +
                    "\2\2\u0616\u0614\3\2\2\2\u0617\u0618\7\b\2\2\u0618\u061a\3\2\2\2\u0619" +
                    "\u0608\3\2\2\2\u0619\u060a\3\2\2\2\u0619\u060c\3\2\2\2\u0619\u061a\3\2" +
                    "\2\2\u061au\3\2\2\2\u061b\u0624\7\7\2\2\u061c\u0621\5\u009cO\2\u061d\u061e" +
                    "\7\t\2\2\u061e\u0620\5\u009cO\2\u061f\u061d\3\2\2\2\u0620\u0623\3\2\2" +
                    "\2\u0621\u061f\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0625\3\2\2\2\u0623\u0621" +
                    "\3\2\2\2\u0624\u061c\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0626\3\2\2\2\u0626" +
                    "\u0629\7\b\2\2\u0627\u0629\5\u009cO\2\u0628\u061b\3\2\2\2\u0628\u0627" +
                    "\3\2\2\2\u0629w\3\2\2\2\u062a\u062b\7G\2\2\u062b\u062d\7V\2\2\u062c\u062e" +
                    "\7?\2\2\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\3\2\2\2\u062f" +
                    "\u0630\5\u00caf\2\u0630\u0639\7\7\2\2\u0631\u0636\5\u009cO\2\u0632\u0633" +
                    "\7\t\2\2\u0633\u0635\5\u009cO\2\u0634\u0632\3\2\2\2\u0635\u0638\3\2\2" +
                    "\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u063a\3\2\2\2\u0638\u0636" +
                    "\3\2\2\2\u0639\u0631\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2\2\2\u063b" +
                    "\u063c\7\b\2\2\u063c\u0648\5\u00ccg\2\u063d\u063f\7\30\2\2\u063e\u063d" +
                    "\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0645\5\u00ccg" +
                    "\2\u0641\u0642\7\t\2\2\u0642\u0644\5\u00ccg\2\u0643\u0641\3\2\2\2\u0644" +
                    "\u0647\3\2\2\2\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0649\3\2" +
                    "\2\2\u0647\u0645\3\2\2\2\u0648\u063e\3\2\2\2\u0648\u0649\3\2\2\2\u0649" +
                    "y\3\2\2\2\u064a\u064b\t\17\2\2\u064b{\3\2\2\2\u064c\u064d\b?\1\2\u064d" +
                    "\u064e\5\u0090I\2\u064e\u0662\3\2\2\2\u064f\u065e\f\4\2\2\u0650\u0653" +
                    "\7>\2\2\u0651\u0653\5~@\2\u0652\u0650\3\2\2\2\u0652\u0651\3\2\2\2\u0653" +
                    "\u0654\3\2\2\2\u0654\u0655\7=\2\2\u0655\u0657\5|?\2\u0656\u0658\5\u0080" +
                    "A\2\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065f\3\2\2\2\u0659" +
                    "\u065a\7E\2\2\u065a\u065b\5~@\2\u065b\u065c\7=\2\2\u065c\u065d\5|?\2\u065d" +
                    "\u065f\3\2\2\2\u065e\u0652\3\2\2\2\u065e\u0659\3\2\2\2\u065f\u0661\3\2" +
                    "\2\2\u0660\u064f\3\2\2\2\u0661\u0664\3\2\2\2\u0662\u0660\3\2\2\2\u0662" +
                    "\u0663\3\2\2\2\u0663}\3\2\2\2\u0664\u0662\3\2\2\2\u0665\u0667\7@\2\2\u0666" +
                    "\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u067b\3\2\2\2\u0668\u066a\7A" +
                    "\2\2\u0669\u066b\7?\2\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b" +
                    "\u067b\3\2\2\2\u066c\u066d\7A\2\2\u066d\u067b\7B\2\2\u066e\u0670\7C\2" +
                    "\2\u066f\u0671\7?\2\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u067b" +
                    "\3\2\2\2\u0672\u0674\7D\2\2\u0673\u0675\7?\2\2\u0674\u0673\3\2\2\2\u0674" +
                    "\u0675\3\2\2\2\u0675\u067b\3\2\2\2\u0676\u0678\7A\2\2\u0677\u0676\3\2" +
                    "\2\2\u0677\u0678\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067b\7\u00e6\2\2\u067a" +
                    "\u0666\3\2\2\2\u067a\u0668\3\2\2\2\u067a\u066c\3\2\2\2\u067a\u066e\3\2" +
                    "\2\2\u067a\u0672\3\2\2\2\u067a\u0677\3\2\2\2\u067b\177\3\2\2\2\u067c\u067d" +
                    "\7F\2\2\u067d\u068b\5\u009eP\2\u067e\u067f\7\u009a\2\2\u067f\u0680\7\7" +
                    "\2\2\u0680\u0685\5\u00ccg\2\u0681\u0682\7\t\2\2\u0682\u0684\5\u00ccg\2" +
                    "\u0683\u0681\3\2\2\2\u0684\u0687\3\2\2\2\u0685\u0683\3\2\2\2\u0685\u0686" +
                    "\3\2\2\2\u0686\u0688\3\2\2\2\u0687\u0685\3\2\2\2\u0688\u0689\7\b\2\2\u0689" +
                    "\u068b\3\2\2\2\u068a\u067c\3\2\2\2\u068a\u067e\3\2\2\2\u068b\u0081\3\2" +
                    "\2\2\u068c\u068d\7m\2\2\u068d\u06a3\7\7\2\2\u068e\u068f\t\20\2\2\u068f" +
                    "\u06a4\7\u0090\2\2\u0690\u0691\5\u009cO\2\u0691\u0692\7L\2\2\u0692\u06a4" +
                    "\3\2\2\2\u0693\u06a4\7\u00ed\2\2\u0694\u0695\7\u0091\2\2\u0695\u0696\7" +
                    "\u00ee\2\2\u0696\u0697\7\u0092\2\2\u0697\u0698\7\u0093\2\2\u0698\u06a1" +
                    "\7\u00ee\2\2\u0699\u069f\7F\2\2\u069a\u06a0\5\u00ccg\2\u069b\u069c\5\u00ca" +
                    "f\2\u069c\u069d\7\7\2\2\u069d\u069e\7\b\2\2\u069e\u06a0\3\2\2\2\u069f" +
                    "\u069a\3\2\2\2\u069f\u069b\3\2\2\2\u06a0\u06a2\3\2\2\2\u06a1\u0699\3\2" +
                    "\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a4\3\2\2\2\u06a3\u068e\3\2\2\2\u06a3" +
                    "\u0690\3\2\2\2\u06a3\u0693\3\2\2\2\u06a3\u0694\3\2\2\2\u06a4\u06a5\3\2" +
                    "\2\2\u06a5\u06a6\7\b\2\2\u06a6\u0083\3\2\2\2\u06a7\u06a8\7\7\2\2\u06a8" +
                    "\u06a9\5\u0086D\2\u06a9\u06aa\7\b\2\2\u06aa\u0085\3\2\2\2\u06ab\u06b0" +
                    "\5\u00ccg\2\u06ac\u06ad\7\t\2\2\u06ad\u06af\5\u00ccg\2\u06ae\u06ac\3\2" +
                    "\2\2\u06af\u06b2\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1" +
                    "\u0087\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b3\u06b4\7\7\2\2\u06b4\u06b9\5\u008a" +
                    "F\2\u06b5\u06b6\7\t\2\2\u06b6\u06b8\5\u008aF\2\u06b7\u06b5\3\2\2\2\u06b8" +
                    "\u06bb\3\2\2\2\u06b9\u06b7\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bc\3\2" +
                    "\2\2\u06bb\u06b9\3\2\2\2\u06bc\u06bd\7\b\2\2\u06bd\u0089\3\2\2\2\u06be" +
                    "\u06c0\5\u00ccg\2\u06bf\u06c1\t\16\2\2\u06c0\u06bf\3\2\2\2\u06c0\u06c1" +
                    "\3\2\2\2\u06c1\u008b\3\2\2\2\u06c2\u06c3\7\7\2\2\u06c3\u06c8\5\u008eH" +
                    "\2\u06c4\u06c5\7\t\2\2\u06c5\u06c7\5\u008eH\2\u06c6\u06c4\3\2\2\2\u06c7" +
                    "\u06ca\3\2\2\2\u06c8\u06c6\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06cb\3\2" +
                    "\2\2\u06ca\u06c8\3\2\2\2\u06cb\u06cc\7\b\2\2\u06cc\u008d\3\2\2\2\u06cd" +
                    "\u06d0\5\u00ccg\2\u06ce\u06cf\7t\2\2\u06cf\u06d1\7\u00e9\2\2\u06d0\u06ce" +
                    "\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u008f\3\2\2\2\u06d2\u06d4\5\u0096L" +
                    "\2\u06d3\u06d5\5\u0082B\2\u06d4\u06d3\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5" +
                    "\u06da\3\2\2\2\u06d6\u06d8\7\30\2\2\u06d7\u06d6\3\2\2\2\u06d7\u06d8\3" +
                    "\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06db\5\u00ceh\2\u06da\u06d7\3\2\2\2" +
                    "\u06da\u06db\3\2\2\2\u06db\u06f6\3\2\2\2\u06dc\u06dd\7\7\2\2\u06dd\u06de" +
                    "\5d\63\2\u06de\u06e0\7\b\2\2\u06df\u06e1\5\u0082B\2\u06e0\u06df\3\2\2" +
                    "\2\u06e0\u06e1\3\2\2\2\u06e1\u06e6\3\2\2\2\u06e2\u06e4\7\30\2\2\u06e3" +
                    "\u06e2\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e7\5\u00ce" +
                    "h\2\u06e6\u06e3\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06f6\3\2\2\2\u06e8" +
                    "\u06e9\7\7\2\2\u06e9\u06ea\5|?\2\u06ea\u06ec\7\b\2\2\u06eb\u06ed\5\u0082" +
                    "B\2\u06ec\u06eb\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06f2\3\2\2\2\u06ee" +
                    "\u06f0\7\30\2\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1\3" +
                    "\2\2\2\u06f1\u06f3\5\u00ceh\2\u06f2\u06ef\3\2\2\2\u06f2\u06f3\3\2\2\2" +
                    "\u06f3\u06f6\3\2\2\2\u06f4\u06f6\5\u0092J\2\u06f5\u06d2\3\2\2\2\u06f5" +
                    "\u06dc\3\2\2\2\u06f5\u06e8\3\2\2\2\u06f5\u06f4\3\2\2\2\u06f6\u0091\3\2" +
                    "\2\2\u06f7\u06f8\7S\2\2\u06f8\u06fd\5\u009cO\2\u06f9\u06fa\7\t\2\2\u06fa" +
                    "\u06fc\5\u009cO\2\u06fb\u06f9\3\2\2\2\u06fc\u06ff\3\2\2\2\u06fd\u06fb" +
                    "\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0707\3\2\2\2\u06ff\u06fd\3\2\2\2\u0700" +
                    "\u0702\7\30\2\2\u0701\u0700\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\3" +
                    "\2\2\2\u0703\u0705\5\u00ccg\2\u0704\u0706\5\u0084C\2\u0705\u0704\3\2\2" +
                    "\2\u0705\u0706\3\2\2\2\u0706\u0708\3\2\2\2\u0707\u0701\3\2\2\2\u0707\u0708" +
                    "\3\2\2\2\u0708\u0093\3\2\2\2\u0709\u070a\7Q\2\2\u070a\u070b\7]\2\2\u070b" +
                    "\u070c\7\u009b\2\2\u070c\u0710\7\u00e9\2\2\u070d\u070e\7R\2\2\u070e\u070f" +
                    "\7\u009c\2\2\u070f\u0711\5P)\2\u0710\u070d\3\2\2\2\u0710\u0711\3\2\2\2" +
                    "\u0711\u073b\3\2\2\2\u0712\u0713\7Q\2\2\u0713\u0714\7]\2\2\u0714\u071e" +
                    "\7\u009f\2\2\u0715\u0716\7\u00a0\2\2\u0716\u0717\7\u00a1\2\2\u0717\u0718" +
                    "\7\35\2\2\u0718\u071c\7\u00e9\2\2\u0719\u071a\7\u00a5\2\2\u071a\u071b" +
                    "\7\35\2\2\u071b\u071d\7\u00e9\2\2\u071c\u0719\3\2\2\2\u071c\u071d\3\2" +
                    "\2\2\u071d\u071f\3\2\2\2\u071e\u0715\3\2\2\2\u071e\u071f\3\2\2\2\u071f" +
                    "\u0725\3\2\2\2\u0720\u0721\7\u00a2\2\2\u0721\u0722\7\u00a3\2\2\u0722\u0723" +
                    "\7\u00a1\2\2\u0723\u0724\7\35\2\2\u0724\u0726\7\u00e9\2\2\u0725\u0720" +
                    "\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u072c\3\2\2\2\u0727\u0728\7r\2\2\u0728" +
                    "\u0729\7\u00a4\2\2\u0729\u072a\7\u00a1\2\2\u072a\u072b\7\35\2\2\u072b" +
                    "\u072d\7\u00e9\2\2\u072c\u0727\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u0732" +
                    "\3\2\2\2\u072e\u072f\7\u00a6\2\2\u072f\u0730\7\u00a1\2\2\u0730\u0731\7" +
                    "\35\2\2\u0731\u0733\7\u00e9\2\2\u0732\u072e\3\2\2\2\u0732\u0733\3\2\2" +
                    "\2\u0733\u0738\3\2\2\2\u0734\u0735\7\60\2\2\u0735\u0736\7\u00d3\2\2\u0736" +
                    "\u0737\7\30\2\2\u0737\u0739\7\u00e9\2\2\u0738\u0734\3\2\2\2\u0738\u0739" +
                    "\3\2\2\2\u0739\u073b\3\2\2\2\u073a\u0709\3\2\2\2\u073a\u0712\3\2\2\2\u073b" +
                    "\u0095\3\2\2\2\u073c\u073d\5\u00ccg\2\u073d\u073e\7\17\2\2\u073e\u0740" +
                    "\3\2\2\2\u073f\u073c\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0741\3\2\2\2\u0741" +
                    "\u0742\5\u00ccg\2\u0742\u0097\3\2\2\2\u0743\u074b\5\u009cO\2\u0744\u0746" +
                    "\7\30\2\2\u0745\u0744\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0749\3\2\2\2" +
                    "\u0747\u074a\5\u00ccg\2\u0748\u074a\5\u0084C\2\u0749\u0747\3\2\2\2\u0749" +
                    "\u0748\3\2\2\2\u074a\u074c\3\2\2\2\u074b\u0745\3\2\2\2\u074b\u074c\3\2" +
                    "\2\2\u074c\u0099\3\2\2\2\u074d\u0752\5\u0098M\2\u074e\u074f\7\t\2\2\u074f" +
                    "\u0751\5\u0098M\2\u0750\u074e\3\2\2\2\u0751\u0754\3\2\2\2\u0752\u0750" +
                    "\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u009b\3\2\2\2\u0754\u0752\3\2\2\2\u0755" +
                    "\u0756\5\u009eP\2\u0756\u009d\3\2\2\2\u0757\u0758\bP\1\2\u0758\u0759\7" +
                    ")\2\2\u0759\u0761\5\u009eP\7\u075a\u0761\5\u00a0Q\2\u075b\u075c\7+\2\2" +
                    "\u075c\u075d\7\7\2\2\u075d\u075e\5<\37\2\u075e\u075f\7\b\2\2\u075f\u0761" +
                    "\3\2\2\2\u0760\u0757\3\2\2\2\u0760\u075a\3\2\2\2\u0760\u075b\3\2\2\2\u0761" +
                    "\u076a\3\2\2\2\u0762\u0763\f\5\2\2\u0763\u0764\7\'\2\2\u0764\u0769\5\u009e" +
                    "P\6\u0765\u0766\f\4\2\2\u0766\u0767\7&\2\2\u0767\u0769\5\u009eP\5\u0768" +
                    "\u0762\3\2\2\2\u0768\u0765\3\2\2\2\u0769\u076c\3\2\2\2\u076a\u0768\3\2" +
                    "\2\2\u076a\u076b\3\2\2\2\u076b\u009f\3\2\2\2\u076c\u076a\3\2\2\2\u076d" +
                    "\u076f\5\u00a4S\2\u076e\u0770\5\u00a2R\2\u076f\u076e\3\2\2\2\u076f\u0770" +
                    "\3\2\2\2\u0770\u00a1\3\2\2\2\u0771\u0773\7)\2\2\u0772\u0771\3\2\2\2\u0772" +
                    "\u0773\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\7,\2\2\u0775\u0776\5\u00a4" +
                    "S\2\u0776\u0777\7\'\2\2\u0777\u0778\5\u00a4S\2\u0778\u079b\3\2\2\2\u0779" +
                    "\u077b\7)\2\2\u077a\u0779\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077c\3\2" +
                    "\2\2\u077c\u077d\7(\2\2\u077d\u077e\7\7\2\2\u077e\u0783\5\u009cO\2\u077f" +
                    "\u0780\7\t\2\2\u0780\u0782\5\u009cO\2\u0781\u077f\3\2\2\2\u0782\u0785" +
                    "\3\2\2\2\u0783\u0781\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0786\3\2\2\2\u0785" +
                    "\u0783\3\2\2\2\u0786\u0787\7\b\2\2\u0787\u079b\3\2\2\2\u0788\u078a\7)" +
                    "\2\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078b\3\2\2\2\u078b" +
                    "\u078c\7(\2\2\u078c\u078d\7\7\2\2\u078d\u078e\5<\37\2\u078e\u078f\7\b" +
                    "\2\2\u078f\u079b\3\2\2\2\u0790\u0792\7)\2\2\u0791\u0790\3\2\2\2\u0791" +
                    "\u0792\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0794\t\21\2\2\u0794\u079b\5" +
                    "\u00a4S\2\u0795\u0797\7/\2\2\u0796\u0798\7)\2\2\u0797\u0796\3\2\2\2\u0797" +
                    "\u0798\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u079b\7\60\2\2\u079a\u0772\3" +
                    "\2\2\2\u079a\u077a\3\2\2\2\u079a\u0789\3\2\2\2\u079a\u0791\3\2\2\2\u079a" +
                    "\u0795\3\2\2\2\u079b\u00a3\3\2\2\2\u079c\u079d\bS\1\2\u079d\u07a1\5\u00a6" +
                    "T\2\u079e\u079f\t\22\2\2\u079f\u07a1\5\u00a4S\t\u07a0\u079c\3\2\2\2\u07a0" +
                    "\u079e\3\2\2\2\u07a1\u07b7\3\2\2\2\u07a2\u07a3\f\b\2\2\u07a3\u07a4\t\23" +
                    "\2\2\u07a4\u07b6\5\u00a4S\t\u07a5\u07a6\f\7\2\2\u07a6\u07a7\t\24\2\2\u07a7" +
                    "\u07b6\5\u00a4S\b\u07a8\u07a9\f\6\2\2\u07a9\u07aa\7\u008d\2\2\u07aa\u07b6" +
                    "\5\u00a4S\7\u07ab\u07ac\f\5\2\2\u07ac\u07ad\7\u008f\2\2\u07ad\u07b6\5" +
                    "\u00a4S\6\u07ae\u07af\f\4\2\2\u07af\u07b0\7\u008e\2\2\u07b0\u07b6\5\u00a4" +
                    "S\5\u07b1\u07b2\f\3\2\2\u07b2\u07b3\5\u00aaV\2\u07b3\u07b4\5\u00a4S\4" +
                    "\u07b4\u07b6\3\2\2\2\u07b5\u07a2\3\2\2\2\u07b5\u07a5\3\2\2\2\u07b5\u07a8" +
                    "\3\2\2\2\u07b5\u07ab\3\2\2\2\u07b5\u07ae\3\2\2\2\u07b5\u07b1\3\2\2\2\u07b6" +
                    "\u07b9\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u00a5\3\2" +
                    "\2\2\u07b9\u07b7\3\2\2\2\u07ba\u07bb\bT\1\2\u07bb\u0809\5\u00a8U\2\u07bc" +
                    "\u0809\7\u0088\2\2\u07bd\u07be\5\u00caf\2\u07be\u07bf\7\17\2\2\u07bf\u07c0" +
                    "\7\u0088\2\2\u07c0\u0809\3\2\2\2\u07c1\u07c2\7\7\2\2\u07c2\u07c5\5\u009c" +
                    "O\2\u07c3\u07c4\7\t\2\2\u07c4\u07c6\5\u009cO\2\u07c5\u07c3\3\2\2\2\u07c6" +
                    "\u07c7\3\2\2\2\u07c7\u07c5\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07c9\3\2" +
                    "\2\2\u07c9\u07ca\7\b\2\2\u07ca\u0809\3\2\2\2\u07cb\u07cc\5\u00caf\2\u07cc" +
                    "\u07d8\7\7\2\2\u07cd\u07cf\5z>\2\u07ce\u07cd\3\2\2\2\u07ce\u07cf\3\2\2" +
                    "\2\u07cf\u07d0\3\2\2\2\u07d0\u07d5\5\u009cO\2\u07d1\u07d2\7\t\2\2\u07d2" +
                    "\u07d4\5\u009cO\2\u07d3\u07d1\3\2\2\2\u07d4\u07d7\3\2\2\2\u07d5\u07d3" +
                    "\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u07d9\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d8" +
                    "\u07ce\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07dd\7\b" +
                    "\2\2\u07db\u07dc\7I\2\2\u07dc\u07de\5\u00c4c\2\u07dd\u07db\3\2\2\2\u07dd" +
                    "\u07de\3\2\2\2\u07de\u0809\3\2\2\2\u07df\u07e0\7\7\2\2\u07e0\u07e1\5<" +
                    "\37\2\u07e1\u07e2\7\b\2\2\u07e2\u0809\3\2\2\2\u07e3\u07e4\78\2\2\u07e4" +
                    "\u07e6\5\u00a4S\2\u07e5\u07e7\5\u00be`\2\u07e6\u07e5\3\2\2\2\u07e7\u07e8" +
                    "\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07ec\3\2\2\2\u07ea" +
                    "\u07eb\7;\2\2\u07eb\u07ed\5\u009cO\2\u07ec\u07ea\3\2\2\2\u07ec\u07ed\3" +
                    "\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07ef\7<\2\2\u07ef\u0809\3\2\2\2\u07f0" +
                    "\u07f2\78\2\2\u07f1\u07f3\5\u00be`\2\u07f2\u07f1\3\2\2\2\u07f3\u07f4\3" +
                    "\2\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f8\3\2\2\2\u07f6" +
                    "\u07f7\7;\2\2\u07f7\u07f9\5\u009cO\2\u07f8\u07f6\3\2\2\2\u07f8\u07f9\3" +
                    "\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\7<\2\2\u07fb\u0809\3\2\2\2\u07fc" +
                    "\u07fd\7`\2\2\u07fd\u07fe\7\7\2\2\u07fe\u07ff\5\u009cO\2\u07ff\u0800\7" +
                    "\30\2\2\u0800\u0801\5\u00b8]\2\u0801\u0802\7\b\2\2\u0802\u0809\3\2\2\2" +
                    "\u0803\u0809\5\u00ccg\2\u0804\u0805\7\7\2\2\u0805\u0806\5\u009cO\2\u0806" +
                    "\u0807\7\b\2\2\u0807\u0809\3\2\2\2\u0808\u07ba\3\2\2\2\u0808\u07bc\3\2" +
                    "\2\2\u0808\u07bd\3\2\2\2\u0808\u07c1\3\2\2\2\u0808\u07cb\3\2\2\2\u0808" +
                    "\u07df\3\2\2\2\u0808\u07e3\3\2\2\2\u0808\u07f0\3\2\2\2\u0808\u07fc\3\2" +
                    "\2\2\u0808\u0803\3\2\2\2\u0808\u0804\3\2\2\2\u0809\u0814\3\2\2\2\u080a" +
                    "\u080b\f\6\2\2\u080b\u080c\7\f\2\2\u080c\u080d\5\u00a4S\2\u080d\u080e" +
                    "\7\r\2\2\u080e\u0813\3\2\2\2\u080f\u0810\f\4\2\2\u0810\u0811\7\17\2\2" +
                    "\u0811\u0813\5\u00ccg\2\u0812\u080a\3\2\2\2\u0812\u080f\3\2\2\2\u0813" +
                    "\u0816\3\2\2\2\u0814\u0812\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u00a7\3\2" +
                    "\2\2\u0816\u0814\3\2\2\2\u0817\u0824\7\60\2\2\u0818\u0824\5\u00b2Z\2\u0819" +
                    "\u081a\5\u00ccg\2\u081a\u081b\7\u00e9\2\2\u081b\u0824\3\2\2\2\u081c\u0824" +
                    "\5\u00d2j\2\u081d\u0824\5\u00b0Y\2\u081e\u0820\7\u00e9\2\2\u081f\u081e" +
                    "\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u081f\3\2\2\2\u0821\u0822\3\2\2\2\u0822" +
                    "\u0824\3\2\2\2\u0823\u0817\3\2\2\2\u0823\u0818\3\2\2\2\u0823\u0819\3\2" +
                    "\2\2\u0823\u081c\3\2\2\2\u0823\u081d\3\2\2\2\u0823\u081f\3\2\2\2\u0824" +
                    "\u00a9\3\2\2\2\u0825\u0826\t\25\2\2\u0826\u00ab\3\2\2\2\u0827\u0828\t" +
                    "\26\2\2\u0828\u00ad\3\2\2\2\u0829\u082a\t\27\2\2\u082a\u00af\3\2\2\2\u082b" +
                    "\u082c\t\30\2\2\u082c\u00b1\3\2\2\2\u082d\u0831\7\67\2\2\u082e\u0830\5" +
                    "\u00b4[\2\u082f\u082e\3\2\2\2\u0830\u0833\3\2\2\2\u0831\u082f\3\2\2\2" +
                    "\u0831\u0832\3\2\2\2\u0832\u00b3\3\2\2\2\u0833\u0831\3\2\2\2\u0834\u0835" +
                    "\5\u00b6\\\2\u0835\u0838\5\u00ccg\2\u0836\u0837\7l\2\2\u0837\u0839\5\u00cc" +
                    "g\2\u0838\u0836\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u00b5\3\2\2\2\u083a" +
                    "\u083c\t\24\2\2\u083b\u083a\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083d\3" +
                    "\2\2\2\u083d\u0840\t\20\2\2\u083e\u0840\7\u00e9\2\2\u083f\u083b\3\2\2" +
                    "\2\u083f\u083e\3\2\2\2\u0840\u00b7\3\2\2\2\u0841\u0842\7q\2\2\u0842\u0843" +
                    "\7\u0082\2\2\u0843\u0844\5\u00b8]\2\u0844\u0845\7\u0084\2\2\u0845\u0864" +
                    "\3\2\2\2\u0846\u0847\7r\2\2\u0847\u0848\7\u0082\2\2\u0848\u0849\5\u00b8" +
                    "]\2\u0849\u084a\7\t\2\2\u084a\u084b\5\u00b8]\2\u084b\u084c\7\u0084\2\2" +
                    "\u084c\u0864\3\2\2\2\u084d\u0854\7s\2\2\u084e\u0850\7\u0082\2\2\u084f" +
                    "\u0851\5\u00ba^\2\u0850\u084f\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852" +
                    "\3\2\2\2\u0852\u0855\7\u0084\2\2\u0853\u0855\7\u0080\2\2\u0854\u084e\3" +
                    "\2\2\2\u0854\u0853\3\2\2\2\u0855\u0864\3\2\2\2\u0856\u0861\5\u00ccg\2" +
                    "\u0857\u0858\7\7\2\2\u0858\u085d\7\u00ee\2\2\u0859\u085a\7\t\2\2\u085a" +
                    "\u085c\7\u00ee\2\2\u085b\u0859\3\2\2\2\u085c\u085f\3\2\2\2\u085d\u085b" +
                    "\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0860\3\2\2\2\u085f\u085d\3\2\2\2\u0860" +
                    "\u0862\7\b\2\2\u0861\u0857\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0864\3\2" +
                    "\2\2\u0863\u0841\3\2\2\2\u0863\u0846\3\2\2\2\u0863\u084d\3\2\2\2\u0863" +
                    "\u0856\3\2\2\2\u0864\u00b9\3\2\2\2\u0865\u086a\5\u00bc_\2\u0866\u0867" +
                    "\7\t\2\2\u0867\u0869\5\u00bc_\2\u0868\u0866\3\2\2\2\u0869\u086c\3\2\2" +
                    "\2\u086a\u0868\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u00bb\3\2\2\2\u086c\u086a" +
                    "\3\2\2\2\u086d\u086f\5\u00ccg\2\u086e\u0870\7\16\2\2\u086f\u086e\3\2\2" +
                    "\2\u086f\u0870\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0874\5\u00b8]\2\u0872" +
                    "\u0873\7t\2\2\u0873\u0875\7\u00e9\2\2\u0874\u0872\3\2\2\2\u0874\u0875" +
                    "\3\2\2\2\u0875\u00bd\3\2\2\2\u0876\u0877\79\2\2\u0877\u0878\5\u009cO\2" +
                    "\u0878\u0879\7:\2\2\u0879\u087a\5\u009cO\2\u087a\u00bf\3\2\2\2\u087b\u087c" +
                    "\7H\2\2\u087c\u0881\5\u00c2b\2\u087d\u087e\7\t\2\2\u087e\u0880\5\u00c2" +
                    "b\2\u087f\u087d\3\2\2\2\u0880\u0883\3\2\2\2\u0881\u087f\3\2\2\2\u0881" +
                    "\u0882\3\2\2\2\u0882\u00c1\3\2\2\2\u0883\u0881\3\2\2\2\u0884\u0885\5\u00cc" +
                    "g\2\u0885\u0886\7\30\2\2\u0886\u0887\5\u00c4c\2\u0887\u00c3\3\2\2\2\u0888" +
                    "\u08b3\5\u00ccg\2\u0889\u08ac\7\7\2\2\u088a\u088b\7\u0095\2\2\u088b\u088c" +
                    "\7\35\2\2\u088c\u0891\5\u009cO\2\u088d\u088e\7\t\2\2\u088e\u0890\5\u009c" +
                    "O\2\u088f\u088d\3\2\2\2\u0890\u0893\3\2\2\2\u0891\u088f\3\2\2\2\u0891" +
                    "\u0892\3\2\2\2\u0892\u08ad\3\2\2\2\u0893\u0891\3\2\2\2\u0894\u0895\t\31" +
                    "\2\2\u0895\u0896\7\35\2\2\u0896\u089b\5\u009cO\2\u0897\u0898\7\t\2\2\u0898" +
                    "\u089a\5\u009cO\2\u0899\u0897\3\2\2\2\u089a\u089d\3\2\2\2\u089b\u0899" +
                    "\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u089f\3\2\2\2\u089d\u089b\3\2\2\2\u089e" +
                    "\u0894\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08aa\3\2\2\2\u08a0\u08a1\t\32" +
                    "\2\2\u08a1\u08a2\7\35\2\2\u08a2\u08a7\5n8\2\u08a3\u08a4\7\t\2\2\u08a4" +
                    "\u08a6\5n8\2\u08a5\u08a3\3\2\2\2\u08a6\u08a9\3\2\2\2\u08a7\u08a5\3\2\2" +
                    "\2\u08a7\u08a8\3\2\2\2\u08a8\u08ab\3\2\2\2\u08a9\u08a7\3\2\2\2\u08aa\u08a0" +
                    "\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ad\3\2\2\2\u08ac\u088a\3\2\2\2\u08ac" +
                    "\u089e\3\2\2\2\u08ad\u08af\3\2\2\2\u08ae\u08b0\5\u00c6d\2\u08af\u08ae" +
                    "\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08b3\7\b\2\2\u08b2" +
                    "\u0888\3\2\2\2\u08b2\u0889\3\2\2\2\u08b3\u00c5\3\2\2\2\u08b4\u08b5\7K" +
                    "\2\2\u08b5\u08c5\5\u00c8e\2\u08b6\u08b7\7L\2\2\u08b7\u08c5\5\u00c8e\2" +
                    "\u08b8\u08b9\7K\2\2\u08b9\u08ba\7,\2\2\u08ba\u08bb\5\u00c8e\2\u08bb\u08bc" +
                    "\7\'\2\2\u08bc\u08bd\5\u00c8e\2\u08bd\u08c5\3\2\2\2\u08be\u08bf\7L\2\2" +
                    "\u08bf\u08c0\7,\2\2\u08c0\u08c1\5\u00c8e\2\u08c1\u08c2\7\'\2\2\u08c2\u08c3" +
                    "\5\u00c8e\2\u08c3\u08c5\3\2\2\2\u08c4\u08b4\3\2\2\2\u08c4\u08b6\3\2\2" +
                    "\2\u08c4\u08b8\3\2\2\2\u08c4\u08be\3\2\2\2\u08c5\u00c7\3\2\2\2\u08c6\u08c7" +
                    "\7M\2\2\u08c7\u08ce\t\33\2\2\u08c8\u08c9\7P\2\2\u08c9\u08ce\7Q\2\2\u08ca" +
                    "\u08cb\5\u009cO\2\u08cb\u08cc\t\33\2\2\u08cc\u08ce\3\2\2\2\u08cd\u08c6" +
                    "\3\2\2\2\u08cd\u08c8\3\2\2\2\u08cd\u08ca\3\2\2\2\u08ce\u00c9\3\2\2\2\u08cf" +
                    "\u08d4\5\u00ccg\2\u08d0\u08d1\7\17\2\2\u08d1\u08d3\5\u00ccg\2\u08d2\u08d0" +
                    "\3\2\2\2\u08d3\u08d6\3\2\2\2\u08d4\u08d2\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5" +
                    "\u00cb\3\2\2\2\u08d6\u08d4\3\2\2\2\u08d7\u08e6\5\u00ceh\2\u08d8\u08e6" +
                    "\7\u00e6\2\2\u08d9\u08e6\7D\2\2\u08da\u08e6\7@\2\2\u08db\u08e6\7A\2\2" +
                    "\u08dc\u08e6\7B\2\2\u08dd\u08e6\7C\2\2\u08de\u08e6\7E\2\2\u08df\u08e6" +
                    "\7=\2\2\u08e0\u08e6\7>\2\2\u08e1\u08e6\7F\2\2\u08e2\u08e6\7i\2\2\u08e3" +
                    "\u08e6\7k\2\2\u08e4\u08e6\7j\2\2\u08e5\u08d7\3\2\2\2\u08e5\u08d8\3\2\2" +
                    "\2\u08e5\u08d9\3\2\2\2\u08e5\u08da\3\2\2\2\u08e5\u08db\3\2\2\2\u08e5\u08dc" +
                    "\3\2\2\2\u08e5\u08dd\3\2\2\2\u08e5\u08de\3\2\2\2\u08e5\u08df\3\2\2\2\u08e5" +
                    "\u08e0\3\2\2\2\u08e5\u08e1\3\2\2\2\u08e5\u08e2\3\2\2\2\u08e5\u08e3\3\2" +
                    "\2\2\u08e5\u08e4\3\2\2\2\u08e6\u00cd\3\2\2\2\u08e7\u08eb\7\u00f2\2\2\u08e8" +
                    "\u08eb\5\u00d0i\2\u08e9\u08eb\5\u00d4k\2\u08ea\u08e7\3\2\2\2\u08ea\u08e8" +
                    "\3\2\2\2\u08ea\u08e9\3\2\2\2\u08eb\u00cf\3\2\2\2\u08ec\u08ed\7\u00f3\2" +
                    "\2\u08ed\u00d1\3\2\2\2\u08ee\u08f6\7\u00ef\2\2\u08ef\u08f6\7\u00f0\2\2" +
                    "\u08f0\u08f6\7\u00ee\2\2\u08f1\u08f6\7\u00ea\2\2\u08f2\u08f6\7\u00eb\2" +
                    "\2\u08f3\u08f6\7\u00ec\2\2\u08f4\u08f6\7\u00f1\2\2\u08f5\u08ee\3\2\2\2" +
                    "\u08f5\u08ef\3\2\2\2\u08f5\u08f0\3\2\2\2\u08f5\u08f1\3\2\2\2\u08f5\u08f2" +
                    "\3\2\2\2\u08f5\u08f3\3\2\2\2\u08f5\u08f4\3\2\2\2\u08f6\u00d3\3\2\2\2\u08f7" +
                    "\u08f8\t\34\2\2\u08f8\u00d5\3\2\2\2\u0130\u00df\u00e1\u00e9\u00f7\u0101" +
                    "\u010e\u0130\u0135\u013f\u0146\u014e\u0155\u0161\u0177\u017c\u017f\u0184" +
                    "\u0191\u0195\u019c\u01a1\u01a6\u01a9\u01af\u01b4\u01b7\u01ba\u01c3\u01c7" +
                    "\u01cf\u01d2\u01d5\u01d8\u01db\u01de\u01e2\u01e5\u01e8\u01ef\u01f9\u0201" +
                    "\u0203\u021a\u0222\u022a\u0230\u023d\u0242\u024b\u0250\u0260\u0267\u026b" +
                    "\u0273\u027a\u0281\u028a\u028e\u0294\u029a\u029d\u02a3\u02a7\u02ab\u02b0" +
                    "\u02b4\u02bc\u02c5\u02ca\u02d0\u02d6\u02e2\u02e5\u02e9\u02ee\u02f3\u02fa" +
                    "\u02fd\u0300\u0306\u030f\u0317\u031d\u0321\u0325\u0329\u032b\u0334\u033a" +
                    "\u033f\u0343\u0346\u034f\u0354\u0359\u035c\u0366\u036b\u0371\u0377\u037e" +
                    "\u0386\u038d\u0395\u0398\u03a0\u03a4\u03ab\u0422\u042a\u0432\u043b\u0444" +
                    "\u0448\u044e\u045a\u045e\u0461\u0467\u0471\u047d\u0482\u0488\u0494\u0496" +
                    "\u049b\u049f\u04a1\u04a5\u04ae\u04b6\u04bd\u04c3\u04c7\u04d0\u04d5\u04e4" +
                    "\u04eb\u04ee\u04f5\u04f9\u04ff\u0507\u0512\u051d\u0524\u052a\u0530\u0539" +
                    "\u053b\u0544\u0547\u0550\u0553\u055c\u055f\u0568\u056b\u056e\u0572\u0575" +
                    "\u0580\u0585\u0590\u0594\u05a0\u05a3\u05a7\u05b1\u05b5\u05b7\u05ba\u05be" +
                    "\u05c1\u05c5\u05c9\u05cd\u05d2\u05d5\u05d7\u05dc\u05e1\u05e4\u05e8\u05eb" +
                    "\u05ed\u05f5\u05fb\u0605\u0614\u0619\u0621\u0624\u0628\u062d\u0636\u0639" +
                    "\u063e\u0645\u0648\u0652\u0657\u065e\u0662\u0666\u066a\u0670\u0674\u0677" +
                    "\u067a\u0685\u068a\u069f\u06a1\u06a3\u06b0\u06b9\u06c0\u06c8\u06d0\u06d4" +
                    "\u06d7\u06da\u06e0\u06e3\u06e6\u06ec\u06ef\u06f2\u06f5\u06fd\u0701\u0705" +
                    "\u0707\u0710\u071c\u071e\u0725\u072c\u0732\u0738\u073a\u073f\u0745\u0749" +
                    "\u074b\u0752\u0760\u0768\u076a\u076f\u0772\u077a\u0783\u0789\u0791\u0797" +
                    "\u079a\u07a0\u07b5\u07b7\u07c7\u07ce\u07d5\u07d8\u07dd\u07e8\u07ec\u07f4" +
                    "\u07f8\u0808\u0812\u0814\u0821\u0823\u0831\u0838\u083b\u083f\u0850\u0854" +
                    "\u085d\u0861\u0863\u086a\u086f\u0874\u0881\u0891\u089b\u089e\u08a7\u08aa" +
                    "\u08ac\u08af\u08b2\u08c4\u08cd\u08d4\u08e5\u08ea\u08f5";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "';'", "'SQL'", "'DATAGEN'", "'FILE'", "'('", "')'", "','", "'{'",
            "'}'", "'['", "']'", "':'", "'.'", null, "'JSON'", "'TEXT'", "'CSV'",
            "'PARQUET'", "'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'DISTINCT'",
            "'WHERE'", "'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'",
            "'ORDER'", "'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null,
            "'NO'", "'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'",
            "'FALSE'", "'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'",
            "'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'",
            "'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'",
            "'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", "'ROWS'",
            "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'ROW'", "'WITH'",
            "'VALUES'", "'CREATE'", "'TABLE'", "'VIEW'", "'REPLACE'", "'INSERT'",
            "'DELETE'", "'INTO'", "'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", "'LOGICAL'",
            "'CODEGEN'", "'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'",
            "'USE'", "'PARTITIONS'", "'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'",
            "'INTERSECT'", "'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'",
            "'ARRAY'", "'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'DATA'",
            "'START'", "'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IF'",
            null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'",
            "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'^'", "'PERCENT'",
            "'BUCKET'", "'OUT'", "'OF'", "'SORT'", "'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'",
            "'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", "'SERDEPROPERTIES'",
            "'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'",
            "'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'",
            "'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'",
            "'LAZY'", "'FORMATTED'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'",
            "'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'",
            "'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'",
            "'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'",
            "'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'",
            null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'",
            "'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'",
            "'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'EXPORT'", "'IMPORT'",
            "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", "'TRANSACTIONS'",
            "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", "'LOCAL'", "'INPATH'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, "URL_STRING", "JSON", "TEXT", "CSV", "PARQUET", "SELECT",
            "FROM", "ADD", "AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING",
            "SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND",
            "IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL",
            "TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", "WHEN",
            "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "SEMI",
            "RIGHT", "FULL", "NATURAL", "ON", "LATERAL", "WINDOW", "OVER", "PARTITION",
            "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "ROW",
            "WITH", "VALUES", "CREATE", "TABLE", "VIEW", "REPLACE", "INSERT", "DELETE",
            "INTO", "DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", "CODEGEN", "CAST",
            "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "PARTITIONS", "FUNCTIONS",
            "DROP", "UNION", "EXCEPT", "INTERSECT", "TO", "TABLESAMPLE", "STRATIFY",
            "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", "COMMENT", "SET", "RESET",
            "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", "IF", "EQ",
            "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK",
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

    static {
        RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public SparkScriptSqlParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String getGrammarFileName() {
        return "SparkScriptSql.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final RootContext root() throws RecognitionException {
        RootContext _localctx = new RootContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_root);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(223);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            setState(221);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                                case 1: {
                                    {
                                        setState(212);
                                        fileAssignment();
                                        setState(213);
                                        match(T__0);
                                    }
                                }
                                break;
                                case 2: {
                                    {
                                        setState(215);
                                        jsonQueryStatementAssignment();
                                        setState(216);
                                        match(T__0);
                                    }
                                }
                                break;
                                case 3: {
                                    {
                                        setState(218);
                                        statementAssignment();
                                        setState(219);
                                        match(T__0);
                                    }
                                }
                                break;
                            }
                        }
                    }
                    setState(225);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                }
                setState(231);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DIV - 137)) | (1L << (PERCENTLIT - 137)) | (1L << (BUCKET - 137)) | (1L << (OUT - 137)) | (1L << (OF - 137)) | (1L << (SORT - 137)) | (1L << (CLUSTER - 137)) | (1L << (DISTRIBUTE - 137)) | (1L << (OVERWRITE - 137)) | (1L << (TRANSFORM - 137)) | (1L << (REDUCE - 137)) | (1L << (USING - 137)) | (1L << (SERDE - 137)) | (1L << (SERDEPROPERTIES - 137)) | (1L << (RECORDREADER - 137)) | (1L << (RECORDWRITER - 137)) | (1L << (DELIMITED - 137)) | (1L << (FIELDS - 137)) | (1L << (TERMINATED - 137)) | (1L << (COLLECTION - 137)) | (1L << (ITEMS - 137)) | (1L << (KEYS - 137)) | (1L << (ESCAPED - 137)) | (1L << (LINES - 137)) | (1L << (SEPARATED - 137)) | (1L << (FUNCTION - 137)) | (1L << (EXTENDED - 137)) | (1L << (REFRESH - 137)) | (1L << (CLEAR - 137)) | (1L << (CACHE - 137)) | (1L << (UNCACHE - 137)) | (1L << (LAZY - 137)) | (1L << (FORMATTED - 137)) | (1L << (TEMPORARY - 137)) | (1L << (OPTIONS - 137)) | (1L << (UNSET - 137)) | (1L << (TBLPROPERTIES - 137)) | (1L << (DBPROPERTIES - 137)) | (1L << (BUCKETS - 137)) | (1L << (SKEWED - 137)) | (1L << (STORED - 137)) | (1L << (DIRECTORIES - 137)) | (1L << (LOCATION - 137)) | (1L << (EXCHANGE - 137)) | (1L << (ARCHIVE - 137)) | (1L << (UNARCHIVE - 137)) | (1L << (FILEFORMAT - 137)) | (1L << (TOUCH - 137)) | (1L << (COMPACT - 137)) | (1L << (CONCATENATE - 137)) | (1L << (CHANGE - 137)) | (1L << (CASCADE - 137)) | (1L << (RESTRICT - 137)) | (1L << (CLUSTERED - 137)) | (1L << (SORTED - 137)) | (1L << (PURGE - 137)) | (1L << (INPUTFORMAT - 137)) | (1L << (OUTPUTFORMAT - 137)) | (1L << (DATABASE - 137)) | (1L << (DATABASES - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (DFS - 201)) | (1L << (TRUNCATE - 201)) | (1L << (ANALYZE - 201)) | (1L << (COMPUTE - 201)) | (1L << (LIST - 201)) | (1L << (STATISTICS - 201)) | (1L << (PARTITIONED - 201)) | (1L << (EXTERNAL - 201)) | (1L << (DEFINED - 201)) | (1L << (REVOKE - 201)) | (1L << (GRANT - 201)) | (1L << (LOCK - 201)) | (1L << (UNLOCK - 201)) | (1L << (MSCK - 201)) | (1L << (REPAIR - 201)) | (1L << (EXPORT - 201)) | (1L << (IMPORT - 201)) | (1L << (LOAD - 201)) | (1L << (ROLE - 201)) | (1L << (ROLES - 201)) | (1L << (COMPACTIONS - 201)) | (1L << (PRINCIPALS - 201)) | (1L << (TRANSACTIONS - 201)) | (1L << (INDEX - 201)) | (1L << (INDEXES - 201)) | (1L << (LOCKS - 201)) | (1L << (OPTION - 201)) | (1L << (ANTI - 201)) | (1L << (LOCAL - 201)) | (1L << (INPATH - 201)) | (1L << (IDENTIFIER - 201)) | (1L << (BACKQUOTED_IDENTIFIER - 201)))) != 0)) {
                    {
                        {
                            setState(226);
                            actionStatement();
                            setState(227);
                            match(T__0);
                        }
                    }
                    setState(233);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(234);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final JsonQueryStatementAssignmentContext jsonQueryStatementAssignment() throws RecognitionException {
        JsonQueryStatementAssignmentContext _localctx = new JsonQueryStatementAssignmentContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_jsonQueryStatementAssignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(236);
                statementAssignment_tableAlias();
                setState(237);
                match(EQ);
                setState(238);
                match(JSON);
                setState(239);
                statementAssignment_queryEngine();
                setState(240);
                jsonQueryStatementAssignment_query();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final JsonQueryStatementAssignment_queryContext jsonQueryStatementAssignment_query() throws RecognitionException {
        JsonQueryStatementAssignment_queryContext _localctx = new JsonQueryStatementAssignment_queryContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_jsonQueryStatementAssignment_query);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(245);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == SET) {
                    {
                        {
                            setState(242);
                            configSetting();
                        }
                    }
                    setState(247);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(248);
                jsonObject();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementAssignmentContext statementAssignment() throws RecognitionException {
        StatementAssignmentContext _localctx = new StatementAssignmentContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_statementAssignment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(250);
                statementAssignment_tableAlias();
                setState(251);
                match(EQ);
                setState(255);
                _la = _input.LA(1);
                if (_la == T__1 || _la == T__2) {
                    {
                        setState(252);
                        statementAssignment_queryType();
                        setState(253);
                        statementAssignment_queryEngine();
                    }
                }

                setState(257);
                statementAssignment_query();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementAssignment_tableAliasContext statementAssignment_tableAlias() throws RecognitionException {
        StatementAssignment_tableAliasContext _localctx = new StatementAssignment_tableAliasContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_statementAssignment_tableAlias);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(259);
                match(IDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementAssignment_queryTypeContext statementAssignment_queryType() throws RecognitionException {
        StatementAssignment_queryTypeContext _localctx = new StatementAssignment_queryTypeContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_statementAssignment_queryType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(261);
                _la = _input.LA(1);
                if (!(_la == T__1 || _la == T__2)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementAssignment_queryEngineContext statementAssignment_queryEngine() throws RecognitionException {
        StatementAssignment_queryEngineContext _localctx = new StatementAssignment_queryEngineContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_statementAssignment_queryEngine);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(263);
                identifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementAssignment_queryContext statementAssignment_query() throws RecognitionException {
        StatementAssignment_queryContext _localctx = new StatementAssignment_queryContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_statementAssignment_query);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(268);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(265);
                                configSetting();
                            }
                        }
                    }
                    setState(270);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                }
                setState(271);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ConfigSettingContext configSetting() throws RecognitionException {
        ConfigSettingContext _localctx = new ConfigSettingContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_configSetting);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(273);
                match(SET);
                setState(274);
                qualifiedName();
                setState(275);
                match(EQ);
                setState(276);
                constant();
                setState(277);
                match(T__0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FileAssignmentContext fileAssignment() throws RecognitionException {
        FileAssignmentContext _localctx = new FileAssignmentContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_fileAssignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(279);
                fileAssignment_tableAlias();
                setState(280);
                match(EQ);
                setState(281);
                match(T__3);
                setState(282);
                fileAssignment_fileType();
                setState(283);
                fileAssignment_fileLocation();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FileAssignment_tableAliasContext fileAssignment_tableAlias() throws RecognitionException {
        FileAssignment_tableAliasContext _localctx = new FileAssignment_tableAliasContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_fileAssignment_tableAlias);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(285);
                match(IDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FileAssignment_fileTypeContext fileAssignment_fileType() throws RecognitionException {
        FileAssignment_fileTypeContext _localctx = new FileAssignment_fileTypeContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_fileAssignment_fileType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(287);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JSON) | (1L << TEXT) | (1L << CSV) | (1L << PARQUET))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FileAssignment_fileLocationContext fileAssignment_fileLocation() throws RecognitionException {
        FileAssignment_fileLocationContext _localctx = new FileAssignment_fileLocationContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_fileAssignment_fileLocation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(289);
                _la = _input.LA(1);
                if (!(_la == URL_STRING || _la == STRING)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ActionStatementContext actionStatement() throws RecognitionException {
        ActionStatementContext _localctx = new ActionStatementContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_actionStatement);
        int _la;
        try {
            setState(307);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(291);
                    qualifiedName();
                    setState(292);
                    match(T__4);
                    setState(293);
                    match(T__5);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(295);
                    qualifiedName();
                    setState(296);
                    match(T__4);
                    setState(297);
                    actionStatement_param();
                    setState(302);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__6) {
                        {
                            {
                                setState(298);
                                match(T__6);
                                setState(299);
                                actionStatement_param();
                            }
                        }
                        setState(304);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(305);
                    match(T__5);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ActionStatement_paramContext actionStatement_param() throws RecognitionException {
        ActionStatement_paramContext _localctx = new ActionStatement_paramContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_actionStatement_param);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(309);
                _la = _input.LA(1);
                if (!(_la == STRING || _la == IDENTIFIER)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final JsonObjectContext jsonObject() throws RecognitionException {
        JsonObjectContext _localctx = new JsonObjectContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_jsonObject);
        int _la;
        try {
            setState(324);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(311);
                    match(T__7);
                    setState(312);
                    jsonPair();
                    setState(317);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__6) {
                        {
                            {
                                setState(313);
                                match(T__6);
                                setState(314);
                                jsonPair();
                            }
                        }
                        setState(319);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(320);
                    match(T__8);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(322);
                    match(T__7);
                    setState(323);
                    match(T__8);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final JsonArrayContext jsonArray() throws RecognitionException {
        JsonArrayContext _localctx = new JsonArrayContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_jsonArray);
        int _la;
        try {
            setState(339);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(326);
                    match(T__9);
                    setState(327);
                    jsonValue();
                    setState(332);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__6) {
                        {
                            {
                                setState(328);
                                match(T__6);
                                setState(329);
                                jsonValue();
                            }
                        }
                        setState(334);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(335);
                    match(T__10);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(337);
                    match(T__9);
                    setState(338);
                    match(T__10);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final JsonPairContext jsonPair() throws RecognitionException {
        JsonPairContext _localctx = new JsonPairContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_jsonPair);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(341);
                match(STRING);
                setState(342);
                match(T__11);
                setState(343);
                jsonValue();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final JsonValueContext jsonValue() throws RecognitionException {
        JsonValueContext _localctx = new JsonValueContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_jsonValue);
        try {
            setState(351);
            switch (_input.LA(1)) {
                case T__7:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(345);
                    jsonObject();
                }
                break;
                case T__9:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(346);
                    jsonArray();
                }
                break;
                case STRING:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(347);
                    match(STRING);
                }
                break;
                case BIGINT_LITERAL:
                case SMALLINT_LITERAL:
                case TINYINT_LITERAL:
                case INTEGER_VALUE:
                case DECIMAL_VALUE:
                case SCIENTIFIC_DECIMAL_VALUE:
                case DOUBLE_LITERAL:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(348);
                    number();
                }
                break;
                case TRUE:
                case FALSE:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(349);
                    booleanValue();
                }
                break;
                case NULL:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(350);
                    match(NULL);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SingleStatementContext singleStatement() throws RecognitionException {
        SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_singleStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(353);
                statement();
                setState(354);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SingleExpressionContext singleExpression() throws RecognitionException {
        SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_singleExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(356);
                namedExpression();
                setState(357);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
        SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_singleTableIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(359);
                tableIdentifier();
                setState(360);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SingleDataTypeContext singleDataType() throws RecognitionException {
        SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_singleDataType);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(362);
                dataType();
                setState(363);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_statement);
        int _la;
        try {
            int _alt;
            setState(918);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 104, _ctx)) {
                case 1:
                    _localctx = new StatementDefaultContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(365);
                    query();
                }
                break;
                case 2:
                    _localctx = new UseContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(366);
                    match(USE);
                    setState(367);
                    ((UseContext) _localctx).db = identifier();
                }
                break;
                case 3:
                    _localctx = new CreateDatabaseContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(368);
                    match(CREATE);
                    setState(369);
                    match(DATABASE);
                    setState(373);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                        case 1: {
                            setState(370);
                            match(IF);
                            setState(371);
                            match(NOT);
                            setState(372);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(375);
                    identifier();
                    setState(378);
                    _la = _input.LA(1);
                    if (_la == COMMENT) {
                        {
                            setState(376);
                            match(COMMENT);
                            setState(377);
                            ((CreateDatabaseContext) _localctx).comment = match(STRING);
                        }
                    }

                    setState(381);
                    _la = _input.LA(1);
                    if (_la == LOCATION) {
                        {
                            setState(380);
                            locationSpec();
                        }
                    }

                    setState(386);
                    _la = _input.LA(1);
                    if (_la == WITH) {
                        {
                            setState(383);
                            match(WITH);
                            setState(384);
                            match(DBPROPERTIES);
                            setState(385);
                            tablePropertyList();
                        }
                    }

                }
                break;
                case 4:
                    _localctx = new SetDatabasePropertiesContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(388);
                    match(ALTER);
                    setState(389);
                    match(DATABASE);
                    setState(390);
                    identifier();
                    setState(391);
                    match(SET);
                    setState(392);
                    match(DBPROPERTIES);
                    setState(393);
                    tablePropertyList();
                }
                break;
                case 5:
                    _localctx = new DropDatabaseContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(395);
                    match(DROP);
                    setState(396);
                    match(DATABASE);
                    setState(399);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                        case 1: {
                            setState(397);
                            match(IF);
                            setState(398);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(401);
                    identifier();
                    setState(403);
                    _la = _input.LA(1);
                    if (_la == CASCADE || _la == RESTRICT) {
                        {
                            setState(402);
                            _la = _input.LA(1);
                            if (!(_la == CASCADE || _la == RESTRICT)) {
                                _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                        }
                    }

                }
                break;
                case 6:
                    _localctx = new CreateTableUsingContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(405);
                    createTableHeader();
                    setState(410);
                    _la = _input.LA(1);
                    if (_la == T__4) {
                        {
                            setState(406);
                            match(T__4);
                            setState(407);
                            colTypeList();
                            setState(408);
                            match(T__5);
                        }
                    }

                    setState(412);
                    tableProvider();
                    setState(415);
                    _la = _input.LA(1);
                    if (_la == OPTIONS) {
                        {
                            setState(413);
                            match(OPTIONS);
                            setState(414);
                            tablePropertyList();
                        }
                    }

                    setState(420);
                    _la = _input.LA(1);
                    if (_la == PARTITIONED) {
                        {
                            setState(417);
                            match(PARTITIONED);
                            setState(418);
                            match(BY);
                            setState(419);
                            ((CreateTableUsingContext) _localctx).partitionColumnNames = identifierList();
                        }
                    }

                    setState(423);
                    _la = _input.LA(1);
                    if (_la == CLUSTERED) {
                        {
                            setState(422);
                            bucketSpec();
                        }
                    }

                }
                break;
                case 7:
                    _localctx = new CreateTableUsingContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(425);
                    createTableHeader();
                    setState(426);
                    tableProvider();
                    setState(429);
                    _la = _input.LA(1);
                    if (_la == OPTIONS) {
                        {
                            setState(427);
                            match(OPTIONS);
                            setState(428);
                            tablePropertyList();
                        }
                    }

                    setState(434);
                    _la = _input.LA(1);
                    if (_la == PARTITIONED) {
                        {
                            setState(431);
                            match(PARTITIONED);
                            setState(432);
                            match(BY);
                            setState(433);
                            ((CreateTableUsingContext) _localctx).partitionColumnNames = identifierList();
                        }
                    }

                    setState(437);
                    _la = _input.LA(1);
                    if (_la == CLUSTERED) {
                        {
                            setState(436);
                            bucketSpec();
                        }
                    }

                    setState(440);
                    _la = _input.LA(1);
                    if (_la == AS) {
                        {
                            setState(439);
                            match(AS);
                        }
                    }

                    setState(442);
                    query();
                }
                break;
                case 8:
                    _localctx = new CreateTableContext(_localctx);
                    enterOuterAlt(_localctx, 8);
                {
                    setState(444);
                    createTableHeader();
                    setState(449);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                        case 1: {
                            setState(445);
                            match(T__4);
                            setState(446);
                            ((CreateTableContext) _localctx).columns = colTypeList();
                            setState(447);
                            match(T__5);
                        }
                        break;
                    }
                    setState(453);
                    _la = _input.LA(1);
                    if (_la == COMMENT) {
                        {
                            setState(451);
                            match(COMMENT);
                            setState(452);
                            match(STRING);
                        }
                    }

                    setState(461);
                    _la = _input.LA(1);
                    if (_la == PARTITIONED) {
                        {
                            setState(455);
                            match(PARTITIONED);
                            setState(456);
                            match(BY);
                            setState(457);
                            match(T__4);
                            setState(458);
                            ((CreateTableContext) _localctx).partitionColumns = colTypeList();
                            setState(459);
                            match(T__5);
                        }
                    }

                    setState(464);
                    _la = _input.LA(1);
                    if (_la == CLUSTERED) {
                        {
                            setState(463);
                            bucketSpec();
                        }
                    }

                    setState(467);
                    _la = _input.LA(1);
                    if (_la == SKEWED) {
                        {
                            setState(466);
                            skewSpec();
                        }
                    }

                    setState(470);
                    _la = _input.LA(1);
                    if (_la == ROW) {
                        {
                            setState(469);
                            rowFormat();
                        }
                    }

                    setState(473);
                    _la = _input.LA(1);
                    if (_la == STORED) {
                        {
                            setState(472);
                            createFileFormat();
                        }
                    }

                    setState(476);
                    _la = _input.LA(1);
                    if (_la == LOCATION) {
                        {
                            setState(475);
                            locationSpec();
                        }
                    }

                    setState(480);
                    _la = _input.LA(1);
                    if (_la == TBLPROPERTIES) {
                        {
                            setState(478);
                            match(TBLPROPERTIES);
                            setState(479);
                            tablePropertyList();
                        }
                    }

                    setState(486);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (WITH - 80)) | (1L << (VALUES - 80)) | (1L << (TABLE - 80)) | (1L << (INSERT - 80)) | (1L << (MAP - 80)))) != 0) || _la == REDUCE) {
                        {
                            setState(483);
                            _la = _input.LA(1);
                            if (_la == AS) {
                                {
                                    setState(482);
                                    match(AS);
                                }
                            }

                            setState(485);
                            query();
                        }
                    }

                }
                break;
                case 9:
                    _localctx = new CreateTableLikeContext(_localctx);
                    enterOuterAlt(_localctx, 9);
                {
                    setState(488);
                    match(CREATE);
                    setState(489);
                    match(TABLE);
                    setState(493);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
                        case 1: {
                            setState(490);
                            match(IF);
                            setState(491);
                            match(NOT);
                            setState(492);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(495);
                    ((CreateTableLikeContext) _localctx).target = tableIdentifier();
                    setState(496);
                    match(LIKE);
                    setState(497);
                    ((CreateTableLikeContext) _localctx).source = tableIdentifier();
                }
                break;
                case 10:
                    _localctx = new AnalyzeContext(_localctx);
                    enterOuterAlt(_localctx, 10);
                {
                    setState(499);
                    match(ANALYZE);
                    setState(500);
                    match(TABLE);
                    setState(501);
                    tableIdentifier();
                    setState(503);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(502);
                            partitionSpec();
                        }
                    }

                    setState(505);
                    match(COMPUTE);
                    setState(506);
                    match(STATISTICS);
                    setState(513);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
                        case 1: {
                            setState(507);
                            identifier();
                        }
                        break;
                        case 2: {
                            setState(508);
                            match(FOR);
                            setState(509);
                            match(COLUMNS);
                            setState(511);
                            _la = _input.LA(1);
                            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DIV - 137)) | (1L << (PERCENTLIT - 137)) | (1L << (BUCKET - 137)) | (1L << (OUT - 137)) | (1L << (OF - 137)) | (1L << (SORT - 137)) | (1L << (CLUSTER - 137)) | (1L << (DISTRIBUTE - 137)) | (1L << (OVERWRITE - 137)) | (1L << (TRANSFORM - 137)) | (1L << (REDUCE - 137)) | (1L << (USING - 137)) | (1L << (SERDE - 137)) | (1L << (SERDEPROPERTIES - 137)) | (1L << (RECORDREADER - 137)) | (1L << (RECORDWRITER - 137)) | (1L << (DELIMITED - 137)) | (1L << (FIELDS - 137)) | (1L << (TERMINATED - 137)) | (1L << (COLLECTION - 137)) | (1L << (ITEMS - 137)) | (1L << (KEYS - 137)) | (1L << (ESCAPED - 137)) | (1L << (LINES - 137)) | (1L << (SEPARATED - 137)) | (1L << (FUNCTION - 137)) | (1L << (EXTENDED - 137)) | (1L << (REFRESH - 137)) | (1L << (CLEAR - 137)) | (1L << (CACHE - 137)) | (1L << (UNCACHE - 137)) | (1L << (LAZY - 137)) | (1L << (FORMATTED - 137)) | (1L << (TEMPORARY - 137)) | (1L << (OPTIONS - 137)) | (1L << (UNSET - 137)) | (1L << (TBLPROPERTIES - 137)) | (1L << (DBPROPERTIES - 137)) | (1L << (BUCKETS - 137)) | (1L << (SKEWED - 137)) | (1L << (STORED - 137)) | (1L << (DIRECTORIES - 137)) | (1L << (LOCATION - 137)) | (1L << (EXCHANGE - 137)) | (1L << (ARCHIVE - 137)) | (1L << (UNARCHIVE - 137)) | (1L << (FILEFORMAT - 137)) | (1L << (TOUCH - 137)) | (1L << (COMPACT - 137)) | (1L << (CONCATENATE - 137)) | (1L << (CHANGE - 137)) | (1L << (CASCADE - 137)) | (1L << (RESTRICT - 137)) | (1L << (CLUSTERED - 137)) | (1L << (SORTED - 137)) | (1L << (PURGE - 137)) | (1L << (INPUTFORMAT - 137)) | (1L << (OUTPUTFORMAT - 137)) | (1L << (DATABASE - 137)) | (1L << (DATABASES - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (DFS - 201)) | (1L << (TRUNCATE - 201)) | (1L << (ANALYZE - 201)) | (1L << (COMPUTE - 201)) | (1L << (LIST - 201)) | (1L << (STATISTICS - 201)) | (1L << (PARTITIONED - 201)) | (1L << (EXTERNAL - 201)) | (1L << (DEFINED - 201)) | (1L << (REVOKE - 201)) | (1L << (GRANT - 201)) | (1L << (LOCK - 201)) | (1L << (UNLOCK - 201)) | (1L << (MSCK - 201)) | (1L << (REPAIR - 201)) | (1L << (EXPORT - 201)) | (1L << (IMPORT - 201)) | (1L << (LOAD - 201)) | (1L << (ROLE - 201)) | (1L << (ROLES - 201)) | (1L << (COMPACTIONS - 201)) | (1L << (PRINCIPALS - 201)) | (1L << (TRANSACTIONS - 201)) | (1L << (INDEX - 201)) | (1L << (INDEXES - 201)) | (1L << (LOCKS - 201)) | (1L << (OPTION - 201)) | (1L << (ANTI - 201)) | (1L << (LOCAL - 201)) | (1L << (INPATH - 201)) | (1L << (IDENTIFIER - 201)) | (1L << (BACKQUOTED_IDENTIFIER - 201)))) != 0)) {
                                {
                                    setState(510);
                                    identifierSeq();
                                }
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
                    setState(515);
                    match(ALTER);
                    setState(516);
                    _la = _input.LA(1);
                    if (!(_la == TABLE || _la == VIEW)) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(517);
                    ((RenameTableContext) _localctx).from = tableIdentifier();
                    setState(518);
                    match(RENAME);
                    setState(519);
                    match(TO);
                    setState(520);
                    ((RenameTableContext) _localctx).to = tableIdentifier();
                }
                break;
                case 12:
                    _localctx = new SetTablePropertiesContext(_localctx);
                    enterOuterAlt(_localctx, 12);
                {
                    setState(522);
                    match(ALTER);
                    setState(523);
                    _la = _input.LA(1);
                    if (!(_la == TABLE || _la == VIEW)) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(524);
                    tableIdentifier();
                    setState(525);
                    match(SET);
                    setState(526);
                    match(TBLPROPERTIES);
                    setState(527);
                    tablePropertyList();
                }
                break;
                case 13:
                    _localctx = new UnsetTablePropertiesContext(_localctx);
                    enterOuterAlt(_localctx, 13);
                {
                    setState(529);
                    match(ALTER);
                    setState(530);
                    _la = _input.LA(1);
                    if (!(_la == TABLE || _la == VIEW)) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(531);
                    tableIdentifier();
                    setState(532);
                    match(UNSET);
                    setState(533);
                    match(TBLPROPERTIES);
                    setState(536);
                    _la = _input.LA(1);
                    if (_la == IF) {
                        {
                            setState(534);
                            match(IF);
                            setState(535);
                            match(EXISTS);
                        }
                    }

                    setState(538);
                    tablePropertyList();
                }
                break;
                case 14:
                    _localctx = new SetTableSerDeContext(_localctx);
                    enterOuterAlt(_localctx, 14);
                {
                    setState(540);
                    match(ALTER);
                    setState(541);
                    match(TABLE);
                    setState(542);
                    tableIdentifier();
                    setState(544);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(543);
                            partitionSpec();
                        }
                    }

                    setState(546);
                    match(SET);
                    setState(547);
                    match(SERDE);
                    setState(548);
                    match(STRING);
                    setState(552);
                    _la = _input.LA(1);
                    if (_la == WITH) {
                        {
                            setState(549);
                            match(WITH);
                            setState(550);
                            match(SERDEPROPERTIES);
                            setState(551);
                            tablePropertyList();
                        }
                    }

                }
                break;
                case 15:
                    _localctx = new SetTableSerDeContext(_localctx);
                    enterOuterAlt(_localctx, 15);
                {
                    setState(554);
                    match(ALTER);
                    setState(555);
                    match(TABLE);
                    setState(556);
                    tableIdentifier();
                    setState(558);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(557);
                            partitionSpec();
                        }
                    }

                    setState(560);
                    match(SET);
                    setState(561);
                    match(SERDEPROPERTIES);
                    setState(562);
                    tablePropertyList();
                }
                break;
                case 16:
                    _localctx = new AddTablePartitionContext(_localctx);
                    enterOuterAlt(_localctx, 16);
                {
                    setState(564);
                    match(ALTER);
                    setState(565);
                    match(TABLE);
                    setState(566);
                    tableIdentifier();
                    setState(567);
                    match(ADD);
                    setState(571);
                    _la = _input.LA(1);
                    if (_la == IF) {
                        {
                            setState(568);
                            match(IF);
                            setState(569);
                            match(NOT);
                            setState(570);
                            match(EXISTS);
                        }
                    }

                    setState(574);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(573);
                                partitionSpecLocation();
                            }
                        }
                        setState(576);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == PARTITION);
                }
                break;
                case 17:
                    _localctx = new AddTablePartitionContext(_localctx);
                    enterOuterAlt(_localctx, 17);
                {
                    setState(578);
                    match(ALTER);
                    setState(579);
                    match(VIEW);
                    setState(580);
                    tableIdentifier();
                    setState(581);
                    match(ADD);
                    setState(585);
                    _la = _input.LA(1);
                    if (_la == IF) {
                        {
                            setState(582);
                            match(IF);
                            setState(583);
                            match(NOT);
                            setState(584);
                            match(EXISTS);
                        }
                    }

                    setState(588);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(587);
                                partitionSpec();
                            }
                        }
                        setState(590);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == PARTITION);
                }
                break;
                case 18:
                    _localctx = new RenameTablePartitionContext(_localctx);
                    enterOuterAlt(_localctx, 18);
                {
                    setState(592);
                    match(ALTER);
                    setState(593);
                    match(TABLE);
                    setState(594);
                    tableIdentifier();
                    setState(595);
                    ((RenameTablePartitionContext) _localctx).from = partitionSpec();
                    setState(596);
                    match(RENAME);
                    setState(597);
                    match(TO);
                    setState(598);
                    ((RenameTablePartitionContext) _localctx).to = partitionSpec();
                }
                break;
                case 19:
                    _localctx = new DropTablePartitionsContext(_localctx);
                    enterOuterAlt(_localctx, 19);
                {
                    setState(600);
                    match(ALTER);
                    setState(601);
                    match(TABLE);
                    setState(602);
                    tableIdentifier();
                    setState(603);
                    match(DROP);
                    setState(606);
                    _la = _input.LA(1);
                    if (_la == IF) {
                        {
                            setState(604);
                            match(IF);
                            setState(605);
                            match(EXISTS);
                        }
                    }

                    setState(608);
                    partitionSpec();
                    setState(613);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__6) {
                        {
                            {
                                setState(609);
                                match(T__6);
                                setState(610);
                                partitionSpec();
                            }
                        }
                        setState(615);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(617);
                    _la = _input.LA(1);
                    if (_la == PURGE) {
                        {
                            setState(616);
                            match(PURGE);
                        }
                    }

                }
                break;
                case 20:
                    _localctx = new DropTablePartitionsContext(_localctx);
                    enterOuterAlt(_localctx, 20);
                {
                    setState(619);
                    match(ALTER);
                    setState(620);
                    match(VIEW);
                    setState(621);
                    tableIdentifier();
                    setState(622);
                    match(DROP);
                    setState(625);
                    _la = _input.LA(1);
                    if (_la == IF) {
                        {
                            setState(623);
                            match(IF);
                            setState(624);
                            match(EXISTS);
                        }
                    }

                    setState(627);
                    partitionSpec();
                    setState(632);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__6) {
                        {
                            {
                                setState(628);
                                match(T__6);
                                setState(629);
                                partitionSpec();
                            }
                        }
                        setState(634);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case 21:
                    _localctx = new SetTableLocationContext(_localctx);
                    enterOuterAlt(_localctx, 21);
                {
                    setState(635);
                    match(ALTER);
                    setState(636);
                    match(TABLE);
                    setState(637);
                    tableIdentifier();
                    setState(639);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(638);
                            partitionSpec();
                        }
                    }

                    setState(641);
                    match(SET);
                    setState(642);
                    locationSpec();
                }
                break;
                case 22:
                    _localctx = new DropTableContext(_localctx);
                    enterOuterAlt(_localctx, 22);
                {
                    setState(644);
                    match(DROP);
                    setState(645);
                    match(TABLE);
                    setState(648);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 56, _ctx)) {
                        case 1: {
                            setState(646);
                            match(IF);
                            setState(647);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(650);
                    tableIdentifier();
                    setState(652);
                    _la = _input.LA(1);
                    if (_la == PURGE) {
                        {
                            setState(651);
                            match(PURGE);
                        }
                    }

                }
                break;
                case 23:
                    _localctx = new DropTableContext(_localctx);
                    enterOuterAlt(_localctx, 23);
                {
                    setState(654);
                    match(DROP);
                    setState(655);
                    match(VIEW);
                    setState(658);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 58, _ctx)) {
                        case 1: {
                            setState(656);
                            match(IF);
                            setState(657);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(660);
                    tableIdentifier();
                }
                break;
                case 24:
                    _localctx = new CreateViewContext(_localctx);
                    enterOuterAlt(_localctx, 24);
                {
                    setState(661);
                    match(CREATE);
                    setState(664);
                    _la = _input.LA(1);
                    if (_la == OR) {
                        {
                            setState(662);
                            match(OR);
                            setState(663);
                            match(REPLACE);
                        }
                    }

                    setState(667);
                    _la = _input.LA(1);
                    if (_la == TEMPORARY) {
                        {
                            setState(666);
                            match(TEMPORARY);
                        }
                    }

                    setState(669);
                    match(VIEW);
                    setState(673);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 61, _ctx)) {
                        case 1: {
                            setState(670);
                            match(IF);
                            setState(671);
                            match(NOT);
                            setState(672);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(675);
                    tableIdentifier();
                    setState(677);
                    _la = _input.LA(1);
                    if (_la == T__4) {
                        {
                            setState(676);
                            identifierCommentList();
                        }
                    }

                    setState(681);
                    _la = _input.LA(1);
                    if (_la == COMMENT) {
                        {
                            setState(679);
                            match(COMMENT);
                            setState(680);
                            match(STRING);
                        }
                    }

                    setState(686);
                    _la = _input.LA(1);
                    if (_la == PARTITIONED) {
                        {
                            setState(683);
                            match(PARTITIONED);
                            setState(684);
                            match(ON);
                            setState(685);
                            identifierList();
                        }
                    }

                    setState(690);
                    _la = _input.LA(1);
                    if (_la == TBLPROPERTIES) {
                        {
                            setState(688);
                            match(TBLPROPERTIES);
                            setState(689);
                            tablePropertyList();
                        }
                    }

                    setState(692);
                    match(AS);
                    setState(693);
                    query();
                }
                break;
                case 25:
                    _localctx = new CreateTempViewUsingContext(_localctx);
                    enterOuterAlt(_localctx, 25);
                {
                    setState(695);
                    match(CREATE);
                    setState(698);
                    _la = _input.LA(1);
                    if (_la == OR) {
                        {
                            setState(696);
                            match(OR);
                            setState(697);
                            match(REPLACE);
                        }
                    }

                    setState(700);
                    match(TEMPORARY);
                    setState(701);
                    match(VIEW);
                    setState(702);
                    tableIdentifier();
                    setState(707);
                    _la = _input.LA(1);
                    if (_la == T__4) {
                        {
                            setState(703);
                            match(T__4);
                            setState(704);
                            colTypeList();
                            setState(705);
                            match(T__5);
                        }
                    }

                    setState(709);
                    tableProvider();
                    setState(712);
                    _la = _input.LA(1);
                    if (_la == OPTIONS) {
                        {
                            setState(710);
                            match(OPTIONS);
                            setState(711);
                            tablePropertyList();
                        }
                    }

                }
                break;
                case 26:
                    _localctx = new AlterViewQueryContext(_localctx);
                    enterOuterAlt(_localctx, 26);
                {
                    setState(714);
                    match(ALTER);
                    setState(715);
                    match(VIEW);
                    setState(716);
                    tableIdentifier();
                    setState(718);
                    _la = _input.LA(1);
                    if (_la == AS) {
                        {
                            setState(717);
                            match(AS);
                        }
                    }

                    setState(720);
                    query();
                }
                break;
                case 27:
                    _localctx = new CreateFunctionContext(_localctx);
                    enterOuterAlt(_localctx, 27);
                {
                    setState(722);
                    match(CREATE);
                    setState(724);
                    _la = _input.LA(1);
                    if (_la == TEMPORARY) {
                        {
                            setState(723);
                            match(TEMPORARY);
                        }
                    }

                    setState(726);
                    match(FUNCTION);
                    setState(727);
                    qualifiedName();
                    setState(728);
                    match(AS);
                    setState(729);
                    ((CreateFunctionContext) _localctx).className = match(STRING);
                    setState(739);
                    _la = _input.LA(1);
                    if (_la == USING) {
                        {
                            setState(730);
                            match(USING);
                            setState(731);
                            resource();
                            setState(736);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__6) {
                                {
                                    {
                                        setState(732);
                                        match(T__6);
                                        setState(733);
                                        resource();
                                    }
                                }
                                setState(738);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                }
                break;
                case 28:
                    _localctx = new DropFunctionContext(_localctx);
                    enterOuterAlt(_localctx, 28);
                {
                    setState(741);
                    match(DROP);
                    setState(743);
                    _la = _input.LA(1);
                    if (_la == TEMPORARY) {
                        {
                            setState(742);
                            match(TEMPORARY);
                        }
                    }

                    setState(745);
                    match(FUNCTION);
                    setState(748);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
                        case 1: {
                            setState(746);
                            match(IF);
                            setState(747);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(750);
                    qualifiedName();
                }
                break;
                case 29:
                    _localctx = new ExplainContext(_localctx);
                    enterOuterAlt(_localctx, 29);
                {
                    setState(751);
                    match(EXPLAIN);
                    setState(753);
                    _la = _input.LA(1);
                    if (_la == LOGICAL || _la == CODEGEN || _la == EXTENDED || _la == FORMATTED) {
                        {
                            setState(752);
                            _la = _input.LA(1);
                            if (!(_la == LOGICAL || _la == CODEGEN || _la == EXTENDED || _la == FORMATTED)) {
                                _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                        }
                    }

                    setState(755);
                    statement();
                }
                break;
                case 30:
                    _localctx = new ShowTablesContext(_localctx);
                    enterOuterAlt(_localctx, 30);
                {
                    setState(756);
                    match(SHOW);
                    setState(757);
                    match(TABLES);
                    setState(760);
                    _la = _input.LA(1);
                    if (_la == FROM || _la == IN) {
                        {
                            setState(758);
                            _la = _input.LA(1);
                            if (!(_la == FROM || _la == IN)) {
                                _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                            setState(759);
                            ((ShowTablesContext) _localctx).db = identifier();
                        }
                    }

                    setState(766);
                    _la = _input.LA(1);
                    if (_la == LIKE || _la == STRING) {
                        {
                            setState(763);
                            _la = _input.LA(1);
                            if (_la == LIKE) {
                                {
                                    setState(762);
                                    match(LIKE);
                                }
                            }

                            setState(765);
                            ((ShowTablesContext) _localctx).pattern = match(STRING);
                        }
                    }

                }
                break;
                case 31:
                    _localctx = new ShowDatabasesContext(_localctx);
                    enterOuterAlt(_localctx, 31);
                {
                    setState(768);
                    match(SHOW);
                    setState(769);
                    match(DATABASES);
                    setState(772);
                    _la = _input.LA(1);
                    if (_la == LIKE) {
                        {
                            setState(770);
                            match(LIKE);
                            setState(771);
                            ((ShowDatabasesContext) _localctx).pattern = match(STRING);
                        }
                    }

                }
                break;
                case 32:
                    _localctx = new ShowTblPropertiesContext(_localctx);
                    enterOuterAlt(_localctx, 32);
                {
                    setState(774);
                    match(SHOW);
                    setState(775);
                    match(TBLPROPERTIES);
                    setState(776);
                    ((ShowTblPropertiesContext) _localctx).table = tableIdentifier();
                    setState(781);
                    _la = _input.LA(1);
                    if (_la == T__4) {
                        {
                            setState(777);
                            match(T__4);
                            setState(778);
                            ((ShowTblPropertiesContext) _localctx).key = tablePropertyKey();
                            setState(779);
                            match(T__5);
                        }
                    }

                }
                break;
                case 33:
                    _localctx = new ShowColumnsContext(_localctx);
                    enterOuterAlt(_localctx, 33);
                {
                    setState(783);
                    match(SHOW);
                    setState(784);
                    match(COLUMNS);
                    setState(785);
                    _la = _input.LA(1);
                    if (!(_la == FROM || _la == IN)) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(786);
                    tableIdentifier();
                    setState(789);
                    _la = _input.LA(1);
                    if (_la == FROM || _la == IN) {
                        {
                            setState(787);
                            _la = _input.LA(1);
                            if (!(_la == FROM || _la == IN)) {
                                _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                            setState(788);
                            ((ShowColumnsContext) _localctx).db = identifier();
                        }
                    }

                }
                break;
                case 34:
                    _localctx = new ShowPartitionsContext(_localctx);
                    enterOuterAlt(_localctx, 34);
                {
                    setState(791);
                    match(SHOW);
                    setState(792);
                    match(PARTITIONS);
                    setState(793);
                    tableIdentifier();
                    setState(795);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(794);
                            partitionSpec();
                        }
                    }

                }
                break;
                case 35:
                    _localctx = new ShowFunctionsContext(_localctx);
                    enterOuterAlt(_localctx, 35);
                {
                    setState(797);
                    match(SHOW);
                    setState(799);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 83, _ctx)) {
                        case 1: {
                            setState(798);
                            identifier();
                        }
                        break;
                    }
                    setState(801);
                    match(FUNCTIONS);
                    setState(809);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DIV - 137)) | (1L << (PERCENTLIT - 137)) | (1L << (BUCKET - 137)) | (1L << (OUT - 137)) | (1L << (OF - 137)) | (1L << (SORT - 137)) | (1L << (CLUSTER - 137)) | (1L << (DISTRIBUTE - 137)) | (1L << (OVERWRITE - 137)) | (1L << (TRANSFORM - 137)) | (1L << (REDUCE - 137)) | (1L << (USING - 137)) | (1L << (SERDE - 137)) | (1L << (SERDEPROPERTIES - 137)) | (1L << (RECORDREADER - 137)) | (1L << (RECORDWRITER - 137)) | (1L << (DELIMITED - 137)) | (1L << (FIELDS - 137)) | (1L << (TERMINATED - 137)) | (1L << (COLLECTION - 137)) | (1L << (ITEMS - 137)) | (1L << (KEYS - 137)) | (1L << (ESCAPED - 137)) | (1L << (LINES - 137)) | (1L << (SEPARATED - 137)) | (1L << (FUNCTION - 137)) | (1L << (EXTENDED - 137)) | (1L << (REFRESH - 137)) | (1L << (CLEAR - 137)) | (1L << (CACHE - 137)) | (1L << (UNCACHE - 137)) | (1L << (LAZY - 137)) | (1L << (FORMATTED - 137)) | (1L << (TEMPORARY - 137)) | (1L << (OPTIONS - 137)) | (1L << (UNSET - 137)) | (1L << (TBLPROPERTIES - 137)) | (1L << (DBPROPERTIES - 137)) | (1L << (BUCKETS - 137)) | (1L << (SKEWED - 137)) | (1L << (STORED - 137)) | (1L << (DIRECTORIES - 137)) | (1L << (LOCATION - 137)) | (1L << (EXCHANGE - 137)) | (1L << (ARCHIVE - 137)) | (1L << (UNARCHIVE - 137)) | (1L << (FILEFORMAT - 137)) | (1L << (TOUCH - 137)) | (1L << (COMPACT - 137)) | (1L << (CONCATENATE - 137)) | (1L << (CHANGE - 137)) | (1L << (CASCADE - 137)) | (1L << (RESTRICT - 137)) | (1L << (CLUSTERED - 137)) | (1L << (SORTED - 137)) | (1L << (PURGE - 137)) | (1L << (INPUTFORMAT - 137)) | (1L << (OUTPUTFORMAT - 137)) | (1L << (DATABASE - 137)) | (1L << (DATABASES - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (DFS - 201)) | (1L << (TRUNCATE - 201)) | (1L << (ANALYZE - 201)) | (1L << (COMPUTE - 201)) | (1L << (LIST - 201)) | (1L << (STATISTICS - 201)) | (1L << (PARTITIONED - 201)) | (1L << (EXTERNAL - 201)) | (1L << (DEFINED - 201)) | (1L << (REVOKE - 201)) | (1L << (GRANT - 201)) | (1L << (LOCK - 201)) | (1L << (UNLOCK - 201)) | (1L << (MSCK - 201)) | (1L << (REPAIR - 201)) | (1L << (EXPORT - 201)) | (1L << (IMPORT - 201)) | (1L << (LOAD - 201)) | (1L << (ROLE - 201)) | (1L << (ROLES - 201)) | (1L << (COMPACTIONS - 201)) | (1L << (PRINCIPALS - 201)) | (1L << (TRANSACTIONS - 201)) | (1L << (INDEX - 201)) | (1L << (INDEXES - 201)) | (1L << (LOCKS - 201)) | (1L << (OPTION - 201)) | (1L << (ANTI - 201)) | (1L << (LOCAL - 201)) | (1L << (INPATH - 201)) | (1L << (STRING - 201)) | (1L << (IDENTIFIER - 201)) | (1L << (BACKQUOTED_IDENTIFIER - 201)))) != 0)) {
                        {
                            setState(803);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 84, _ctx)) {
                                case 1: {
                                    setState(802);
                                    match(LIKE);
                                }
                                break;
                            }
                            setState(807);
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
                                case BACKQUOTED_IDENTIFIER: {
                                    setState(805);
                                    qualifiedName();
                                }
                                break;
                                case STRING: {
                                    setState(806);
                                    ((ShowFunctionsContext) _localctx).pattern = match(STRING);
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                        }
                    }

                }
                break;
                case 36:
                    _localctx = new ShowCreateTableContext(_localctx);
                    enterOuterAlt(_localctx, 36);
                {
                    setState(811);
                    match(SHOW);
                    setState(812);
                    match(CREATE);
                    setState(813);
                    match(TABLE);
                    setState(814);
                    tableIdentifier();
                }
                break;
                case 37:
                    _localctx = new DescribeFunctionContext(_localctx);
                    enterOuterAlt(_localctx, 37);
                {
                    setState(815);
                    _la = _input.LA(1);
                    if (!(_la == DESC || _la == DESCRIBE)) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(816);
                    match(FUNCTION);
                    setState(818);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 87, _ctx)) {
                        case 1: {
                            setState(817);
                            match(EXTENDED);
                        }
                        break;
                    }
                    setState(820);
                    describeFuncName();
                }
                break;
                case 38:
                    _localctx = new DescribeDatabaseContext(_localctx);
                    enterOuterAlt(_localctx, 38);
                {
                    setState(821);
                    _la = _input.LA(1);
                    if (!(_la == DESC || _la == DESCRIBE)) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(822);
                    match(DATABASE);
                    setState(824);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 88, _ctx)) {
                        case 1: {
                            setState(823);
                            match(EXTENDED);
                        }
                        break;
                    }
                    setState(826);
                    identifier();
                }
                break;
                case 39:
                    _localctx = new DescribeTableContext(_localctx);
                    enterOuterAlt(_localctx, 39);
                {
                    setState(827);
                    _la = _input.LA(1);
                    if (!(_la == DESC || _la == DESCRIBE)) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(829);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 89, _ctx)) {
                        case 1: {
                            setState(828);
                            ((DescribeTableContext) _localctx).option = _input.LT(1);
                            _la = _input.LA(1);
                            if (!(_la == EXTENDED || _la == FORMATTED)) {
                                ((DescribeTableContext) _localctx).option = (Token) _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                        }
                        break;
                    }
                    setState(831);
                    tableIdentifier();
                    setState(833);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 90, _ctx)) {
                        case 1: {
                            setState(832);
                            partitionSpec();
                        }
                        break;
                    }
                    setState(836);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DIV - 137)) | (1L << (PERCENTLIT - 137)) | (1L << (BUCKET - 137)) | (1L << (OUT - 137)) | (1L << (OF - 137)) | (1L << (SORT - 137)) | (1L << (CLUSTER - 137)) | (1L << (DISTRIBUTE - 137)) | (1L << (OVERWRITE - 137)) | (1L << (TRANSFORM - 137)) | (1L << (REDUCE - 137)) | (1L << (USING - 137)) | (1L << (SERDE - 137)) | (1L << (SERDEPROPERTIES - 137)) | (1L << (RECORDREADER - 137)) | (1L << (RECORDWRITER - 137)) | (1L << (DELIMITED - 137)) | (1L << (FIELDS - 137)) | (1L << (TERMINATED - 137)) | (1L << (COLLECTION - 137)) | (1L << (ITEMS - 137)) | (1L << (KEYS - 137)) | (1L << (ESCAPED - 137)) | (1L << (LINES - 137)) | (1L << (SEPARATED - 137)) | (1L << (FUNCTION - 137)) | (1L << (EXTENDED - 137)) | (1L << (REFRESH - 137)) | (1L << (CLEAR - 137)) | (1L << (CACHE - 137)) | (1L << (UNCACHE - 137)) | (1L << (LAZY - 137)) | (1L << (FORMATTED - 137)) | (1L << (TEMPORARY - 137)) | (1L << (OPTIONS - 137)) | (1L << (UNSET - 137)) | (1L << (TBLPROPERTIES - 137)) | (1L << (DBPROPERTIES - 137)) | (1L << (BUCKETS - 137)) | (1L << (SKEWED - 137)) | (1L << (STORED - 137)) | (1L << (DIRECTORIES - 137)) | (1L << (LOCATION - 137)) | (1L << (EXCHANGE - 137)) | (1L << (ARCHIVE - 137)) | (1L << (UNARCHIVE - 137)) | (1L << (FILEFORMAT - 137)) | (1L << (TOUCH - 137)) | (1L << (COMPACT - 137)) | (1L << (CONCATENATE - 137)) | (1L << (CHANGE - 137)) | (1L << (CASCADE - 137)) | (1L << (RESTRICT - 137)) | (1L << (CLUSTERED - 137)) | (1L << (SORTED - 137)) | (1L << (PURGE - 137)) | (1L << (INPUTFORMAT - 137)) | (1L << (OUTPUTFORMAT - 137)) | (1L << (DATABASE - 137)) | (1L << (DATABASES - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (DFS - 201)) | (1L << (TRUNCATE - 201)) | (1L << (ANALYZE - 201)) | (1L << (COMPUTE - 201)) | (1L << (LIST - 201)) | (1L << (STATISTICS - 201)) | (1L << (PARTITIONED - 201)) | (1L << (EXTERNAL - 201)) | (1L << (DEFINED - 201)) | (1L << (REVOKE - 201)) | (1L << (GRANT - 201)) | (1L << (LOCK - 201)) | (1L << (UNLOCK - 201)) | (1L << (MSCK - 201)) | (1L << (REPAIR - 201)) | (1L << (EXPORT - 201)) | (1L << (IMPORT - 201)) | (1L << (LOAD - 201)) | (1L << (ROLE - 201)) | (1L << (ROLES - 201)) | (1L << (COMPACTIONS - 201)) | (1L << (PRINCIPALS - 201)) | (1L << (TRANSACTIONS - 201)) | (1L << (INDEX - 201)) | (1L << (INDEXES - 201)) | (1L << (LOCKS - 201)) | (1L << (OPTION - 201)) | (1L << (ANTI - 201)) | (1L << (LOCAL - 201)) | (1L << (INPATH - 201)) | (1L << (IDENTIFIER - 201)) | (1L << (BACKQUOTED_IDENTIFIER - 201)))) != 0)) {
                        {
                            setState(835);
                            describeColName();
                        }
                    }

                }
                break;
                case 40:
                    _localctx = new RefreshTableContext(_localctx);
                    enterOuterAlt(_localctx, 40);
                {
                    setState(838);
                    match(REFRESH);
                    setState(839);
                    match(TABLE);
                    setState(840);
                    tableIdentifier();
                }
                break;
                case 41:
                    _localctx = new RefreshResourceContext(_localctx);
                    enterOuterAlt(_localctx, 41);
                {
                    setState(841);
                    match(REFRESH);
                    setState(845);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 92, _ctx);
                    while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1 + 1) {
                            {
                                {
                                    setState(842);
                                    matchWildcard();
                                }
                            }
                        }
                        setState(847);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 92, _ctx);
                    }
                }
                break;
                case 42:
                    _localctx = new CacheTableContext(_localctx);
                    enterOuterAlt(_localctx, 42);
                {
                    setState(848);
                    match(CACHE);
                    setState(850);
                    _la = _input.LA(1);
                    if (_la == LAZY) {
                        {
                            setState(849);
                            match(LAZY);
                        }
                    }

                    setState(852);
                    match(TABLE);
                    setState(853);
                    tableIdentifier();
                    setState(858);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (WITH - 80)) | (1L << (VALUES - 80)) | (1L << (TABLE - 80)) | (1L << (INSERT - 80)) | (1L << (MAP - 80)))) != 0) || _la == REDUCE) {
                        {
                            setState(855);
                            _la = _input.LA(1);
                            if (_la == AS) {
                                {
                                    setState(854);
                                    match(AS);
                                }
                            }

                            setState(857);
                            query();
                        }
                    }

                }
                break;
                case 43:
                    _localctx = new UncacheTableContext(_localctx);
                    enterOuterAlt(_localctx, 43);
                {
                    setState(860);
                    match(UNCACHE);
                    setState(861);
                    match(TABLE);
                    setState(862);
                    tableIdentifier();
                }
                break;
                case 44:
                    _localctx = new ClearCacheContext(_localctx);
                    enterOuterAlt(_localctx, 44);
                {
                    setState(863);
                    match(CLEAR);
                    setState(864);
                    match(CACHE);
                }
                break;
                case 45:
                    _localctx = new LoadDataContext(_localctx);
                    enterOuterAlt(_localctx, 45);
                {
                    setState(865);
                    match(LOAD);
                    setState(866);
                    match(DATA);
                    setState(868);
                    _la = _input.LA(1);
                    if (_la == LOCAL) {
                        {
                            setState(867);
                            match(LOCAL);
                        }
                    }

                    setState(870);
                    match(INPATH);
                    setState(871);
                    ((LoadDataContext) _localctx).path = match(STRING);
                    setState(873);
                    _la = _input.LA(1);
                    if (_la == OVERWRITE) {
                        {
                            setState(872);
                            match(OVERWRITE);
                        }
                    }

                    setState(875);
                    match(INTO);
                    setState(876);
                    match(TABLE);
                    setState(877);
                    tableIdentifier();
                    setState(879);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(878);
                            partitionSpec();
                        }
                    }

                }
                break;
                case 46:
                    _localctx = new TruncateTableContext(_localctx);
                    enterOuterAlt(_localctx, 46);
                {
                    setState(881);
                    match(TRUNCATE);
                    setState(882);
                    match(TABLE);
                    setState(883);
                    tableIdentifier();
                    setState(885);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(884);
                            partitionSpec();
                        }
                    }

                }
                break;
                case 47:
                    _localctx = new ManageResourceContext(_localctx);
                    enterOuterAlt(_localctx, 47);
                {
                    setState(887);
                    ((ManageResourceContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == ADD || _la == LIST)) {
                        ((ManageResourceContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(888);
                    identifier();
                    setState(892);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 100, _ctx);
                    while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1 + 1) {
                            {
                                {
                                    setState(889);
                                    matchWildcard();
                                }
                            }
                        }
                        setState(894);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 100, _ctx);
                    }
                }
                break;
                case 48:
                    _localctx = new FailNativeCommandContext(_localctx);
                    enterOuterAlt(_localctx, 48);
                {
                    setState(895);
                    match(SET);
                    setState(896);
                    match(ROLE);
                    setState(900);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 101, _ctx);
                    while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1 + 1) {
                            {
                                {
                                    setState(897);
                                    matchWildcard();
                                }
                            }
                        }
                        setState(902);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 101, _ctx);
                    }
                }
                break;
                case 49:
                    _localctx = new SetConfigurationContext(_localctx);
                    enterOuterAlt(_localctx, 49);
                {
                    setState(903);
                    match(SET);
                    setState(907);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 102, _ctx);
                    while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1 + 1) {
                            {
                                {
                                    setState(904);
                                    matchWildcard();
                                }
                            }
                        }
                        setState(909);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 102, _ctx);
                    }
                }
                break;
                case 50:
                    _localctx = new ResetConfigurationContext(_localctx);
                    enterOuterAlt(_localctx, 50);
                {
                    setState(910);
                    match(RESET);
                }
                break;
                case 51:
                    _localctx = new FailNativeCommandContext(_localctx);
                    enterOuterAlt(_localctx, 51);
                {
                    setState(911);
                    unsupportedHiveNativeCommands();
                    setState(915);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 103, _ctx);
                    while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1 + 1) {
                            {
                                {
                                    setState(912);
                                    matchWildcard();
                                }
                            }
                        }
                        setState(917);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 103, _ctx);
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
        UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_unsupportedHiveNativeCommands);
        int _la;
        try {
            setState(1112);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 115, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(920);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(CREATE);
                    setState(921);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(ROLE);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(922);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(DROP);
                    setState(923);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(ROLE);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(924);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(GRANT);
                    setState(926);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 105, _ctx)) {
                        case 1: {
                            setState(925);
                            ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(ROLE);
                        }
                        break;
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(928);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(REVOKE);
                    setState(930);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 106, _ctx)) {
                        case 1: {
                            setState(929);
                            ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(ROLE);
                        }
                        break;
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(932);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                    setState(933);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(GRANT);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(934);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                    setState(935);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(ROLE);
                    setState(937);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 107, _ctx)) {
                        case 1: {
                            setState(936);
                            ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(GRANT);
                        }
                        break;
                    }
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(939);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                    setState(940);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(PRINCIPALS);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(941);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                    setState(942);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(ROLES);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(943);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                    setState(944);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(CURRENT);
                    setState(945);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(ROLES);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(946);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(EXPORT);
                    setState(947);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(948);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(IMPORT);
                    setState(949);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(950);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                    setState(951);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(COMPACTIONS);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(952);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                    setState(953);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(CREATE);
                    setState(954);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(TABLE);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(955);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                    setState(956);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TRANSACTIONS);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(957);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                    setState(958);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(INDEXES);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(959);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                    setState(960);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(LOCKS);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(961);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(CREATE);
                    setState(962);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(INDEX);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(963);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(DROP);
                    setState(964);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(INDEX);
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(965);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(966);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(INDEX);
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(967);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(LOCK);
                    setState(968);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(969);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(LOCK);
                    setState(970);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(DATABASE);
                }
                break;
                case 22:
                    enterOuterAlt(_localctx, 22);
                {
                    setState(971);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(UNLOCK);
                    setState(972);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                }
                break;
                case 23:
                    enterOuterAlt(_localctx, 23);
                {
                    setState(973);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(UNLOCK);
                    setState(974);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(DATABASE);
                }
                break;
                case 24:
                    enterOuterAlt(_localctx, 24);
                {
                    setState(975);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(CREATE);
                    setState(976);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TEMPORARY);
                    setState(977);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(MACRO);
                }
                break;
                case 25:
                    enterOuterAlt(_localctx, 25);
                {
                    setState(978);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(DROP);
                    setState(979);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TEMPORARY);
                    setState(980);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(MACRO);
                }
                break;
                case 26:
                    enterOuterAlt(_localctx, 26);
                {
                    setState(981);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(MSCK);
                    setState(982);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(REPAIR);
                    setState(983);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(TABLE);
                }
                break;
                case 27:
                    enterOuterAlt(_localctx, 27);
                {
                    setState(984);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(985);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(986);
                    tableIdentifier();
                    setState(987);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(NOT);
                    setState(988);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(CLUSTERED);
                }
                break;
                case 28:
                    enterOuterAlt(_localctx, 28);
                {
                    setState(990);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(991);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(992);
                    tableIdentifier();
                    setState(993);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(CLUSTERED);
                    setState(994);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(BY);
                }
                break;
                case 29:
                    enterOuterAlt(_localctx, 29);
                {
                    setState(996);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(997);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(998);
                    tableIdentifier();
                    setState(999);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(NOT);
                    setState(1000);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(SORTED);
                }
                break;
                case 30:
                    enterOuterAlt(_localctx, 30);
                {
                    setState(1002);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1003);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1004);
                    tableIdentifier();
                    setState(1005);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(SKEWED);
                    setState(1006);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(BY);
                }
                break;
                case 31:
                    enterOuterAlt(_localctx, 31);
                {
                    setState(1008);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1009);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1010);
                    tableIdentifier();
                    setState(1011);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(NOT);
                    setState(1012);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(SKEWED);
                }
                break;
                case 32:
                    enterOuterAlt(_localctx, 32);
                {
                    setState(1014);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1015);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1016);
                    tableIdentifier();
                    setState(1017);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(NOT);
                    setState(1018);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(STORED);
                    setState(1019);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw5 = match(AS);
                    setState(1020);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw6 = match(DIRECTORIES);
                }
                break;
                case 33:
                    enterOuterAlt(_localctx, 33);
                {
                    setState(1022);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1023);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1024);
                    tableIdentifier();
                    setState(1025);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(SET);
                    setState(1026);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(SKEWED);
                    setState(1027);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw5 = match(LOCATION);
                }
                break;
                case 34:
                    enterOuterAlt(_localctx, 34);
                {
                    setState(1029);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1030);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1031);
                    tableIdentifier();
                    setState(1032);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(EXCHANGE);
                    setState(1033);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(PARTITION);
                }
                break;
                case 35:
                    enterOuterAlt(_localctx, 35);
                {
                    setState(1035);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1036);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1037);
                    tableIdentifier();
                    setState(1038);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(ARCHIVE);
                    setState(1039);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(PARTITION);
                }
                break;
                case 36:
                    enterOuterAlt(_localctx, 36);
                {
                    setState(1041);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1042);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1043);
                    tableIdentifier();
                    setState(1044);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(UNARCHIVE);
                    setState(1045);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(PARTITION);
                }
                break;
                case 37:
                    enterOuterAlt(_localctx, 37);
                {
                    setState(1047);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1048);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1049);
                    tableIdentifier();
                    setState(1050);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(TOUCH);
                }
                break;
                case 38:
                    enterOuterAlt(_localctx, 38);
                {
                    setState(1052);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1053);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1054);
                    tableIdentifier();
                    setState(1056);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(1055);
                            partitionSpec();
                        }
                    }

                    setState(1058);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(COMPACT);
                }
                break;
                case 39:
                    enterOuterAlt(_localctx, 39);
                {
                    setState(1060);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1061);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1062);
                    tableIdentifier();
                    setState(1064);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(1063);
                            partitionSpec();
                        }
                    }

                    setState(1066);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(CONCATENATE);
                }
                break;
                case 40:
                    enterOuterAlt(_localctx, 40);
                {
                    setState(1068);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1069);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1070);
                    tableIdentifier();
                    setState(1072);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(1071);
                            partitionSpec();
                        }
                    }

                    setState(1074);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(SET);
                    setState(1075);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(FILEFORMAT);
                }
                break;
                case 41:
                    enterOuterAlt(_localctx, 41);
                {
                    setState(1077);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1078);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1079);
                    tableIdentifier();
                    setState(1081);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(1080);
                            partitionSpec();
                        }
                    }

                    setState(1083);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(ADD);
                    setState(1084);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(COLUMNS);
                }
                break;
                case 42:
                    enterOuterAlt(_localctx, 42);
                {
                    setState(1086);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1087);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1088);
                    tableIdentifier();
                    setState(1090);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(1089);
                            partitionSpec();
                        }
                    }

                    setState(1092);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(CHANGE);
                    setState(1094);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 113, _ctx)) {
                        case 1: {
                            setState(1093);
                            ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(COLUMNS);
                        }
                        break;
                    }
                }
                break;
                case 43:
                    enterOuterAlt(_localctx, 43);
                {
                    setState(1096);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                    setState(1097);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    setState(1098);
                    tableIdentifier();
                    setState(1100);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(1099);
                            partitionSpec();
                        }
                    }

                    setState(1102);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(REPLACE);
                    setState(1103);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(COLUMNS);
                }
                break;
                case 44:
                    enterOuterAlt(_localctx, 44);
                {
                    setState(1105);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(START);
                    setState(1106);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TRANSACTION);
                }
                break;
                case 45:
                    enterOuterAlt(_localctx, 45);
                {
                    setState(1107);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(COMMIT);
                }
                break;
                case 46:
                    enterOuterAlt(_localctx, 46);
                {
                    setState(1108);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ROLLBACK);
                }
                break;
                case 47:
                    enterOuterAlt(_localctx, 47);
                {
                    setState(1109);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(DFS);
                }
                break;
                case 48:
                    enterOuterAlt(_localctx, 48);
                {
                    setState(1110);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(DELETE);
                    setState(1111);
                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(FROM);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
        CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_createTableHeader);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1114);
                match(CREATE);
                setState(1116);
                _la = _input.LA(1);
                if (_la == TEMPORARY) {
                    {
                        setState(1115);
                        match(TEMPORARY);
                    }
                }

                setState(1119);
                _la = _input.LA(1);
                if (_la == EXTERNAL) {
                    {
                        setState(1118);
                        match(EXTERNAL);
                    }
                }

                setState(1121);
                match(TABLE);
                setState(1125);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 118, _ctx)) {
                    case 1: {
                        setState(1122);
                        match(IF);
                        setState(1123);
                        match(NOT);
                        setState(1124);
                        match(EXISTS);
                    }
                    break;
                }
                setState(1127);
                tableIdentifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BucketSpecContext bucketSpec() throws RecognitionException {
        BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_bucketSpec);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1129);
                match(CLUSTERED);
                setState(1130);
                match(BY);
                setState(1131);
                identifierList();
                setState(1135);
                _la = _input.LA(1);
                if (_la == SORTED) {
                    {
                        setState(1132);
                        match(SORTED);
                        setState(1133);
                        match(BY);
                        setState(1134);
                        orderedIdentifierList();
                    }
                }

                setState(1137);
                match(INTO);
                setState(1138);
                match(INTEGER_VALUE);
                setState(1139);
                match(BUCKETS);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SkewSpecContext skewSpec() throws RecognitionException {
        SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_skewSpec);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1141);
                match(SKEWED);
                setState(1142);
                match(BY);
                setState(1143);
                identifierList();
                setState(1144);
                match(ON);
                setState(1147);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 120, _ctx)) {
                    case 1: {
                        setState(1145);
                        constantList();
                    }
                    break;
                    case 2: {
                        setState(1146);
                        nestedConstantList();
                    }
                    break;
                }
                setState(1152);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 121, _ctx)) {
                    case 1: {
                        setState(1149);
                        match(STORED);
                        setState(1150);
                        match(AS);
                        setState(1151);
                        match(DIRECTORIES);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LocationSpecContext locationSpec() throws RecognitionException {
        LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_locationSpec);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1154);
                match(LOCATION);
                setState(1155);
                match(STRING);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final QueryContext query() throws RecognitionException {
        QueryContext _localctx = new QueryContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_query);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1158);
                _la = _input.LA(1);
                if (_la == WITH) {
                    {
                        setState(1157);
                        ctes();
                    }
                }

                setState(1160);
                queryNoWith();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InsertIntoContext insertInto() throws RecognitionException {
        InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_insertInto);
        int _la;
        try {
            setState(1183);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 127, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1162);
                    match(INSERT);
                    setState(1163);
                    match(OVERWRITE);
                    setState(1164);
                    match(TABLE);
                    setState(1165);
                    tableIdentifier();
                    setState(1172);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(1166);
                            partitionSpec();
                            setState(1170);
                            _la = _input.LA(1);
                            if (_la == IF) {
                                {
                                    setState(1167);
                                    match(IF);
                                    setState(1168);
                                    match(NOT);
                                    setState(1169);
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
                    setState(1174);
                    match(INSERT);
                    setState(1175);
                    match(INTO);
                    setState(1177);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 125, _ctx)) {
                        case 1: {
                            setState(1176);
                            match(TABLE);
                        }
                        break;
                    }
                    setState(1179);
                    tableIdentifier();
                    setState(1181);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(1180);
                            partitionSpec();
                        }
                    }

                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
        PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_partitionSpecLocation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1185);
                partitionSpec();
                setState(1187);
                _la = _input.LA(1);
                if (_la == LOCATION) {
                    {
                        setState(1186);
                        locationSpec();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PartitionSpecContext partitionSpec() throws RecognitionException {
        PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_partitionSpec);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1189);
                match(PARTITION);
                setState(1190);
                match(T__4);
                setState(1191);
                partitionVal();
                setState(1196);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__6) {
                    {
                        {
                            setState(1192);
                            match(T__6);
                            setState(1193);
                            partitionVal();
                        }
                    }
                    setState(1198);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1199);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PartitionValContext partitionVal() throws RecognitionException {
        PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_partitionVal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1201);
                identifier();
                setState(1204);
                _la = _input.LA(1);
                if (_la == EQ) {
                    {
                        setState(1202);
                        match(EQ);
                        setState(1203);
                        constant();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
        DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_describeFuncName);
        try {
            setState(1211);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 131, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1206);
                    qualifiedName();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1207);
                    match(STRING);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1208);
                    comparisonOperator();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1209);
                    arithmeticOperator();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1210);
                    predicateOperator();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DescribeColNameContext describeColName() throws RecognitionException {
        DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_describeColName);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1213);
                identifier();
                setState(1221);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__12) {
                    {
                        {
                            setState(1214);
                            match(T__12);
                            setState(1217);
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
                                case BACKQUOTED_IDENTIFIER: {
                                    setState(1215);
                                    identifier();
                                }
                                break;
                                case STRING: {
                                    setState(1216);
                                    match(STRING);
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                        }
                    }
                    setState(1223);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CtesContext ctes() throws RecognitionException {
        CtesContext _localctx = new CtesContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_ctes);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1224);
                match(WITH);
                setState(1225);
                namedQuery();
                setState(1230);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__6) {
                    {
                        {
                            setState(1226);
                            match(T__6);
                            setState(1227);
                            namedQuery();
                        }
                    }
                    setState(1232);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NamedQueryContext namedQuery() throws RecognitionException {
        NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_namedQuery);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1233);
                ((NamedQueryContext) _localctx).name = identifier();
                setState(1235);
                _la = _input.LA(1);
                if (_la == AS) {
                    {
                        setState(1234);
                        match(AS);
                    }
                }

                setState(1237);
                match(T__4);
                setState(1238);
                queryNoWith();
                setState(1239);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TableProviderContext tableProvider() throws RecognitionException {
        TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_tableProvider);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1241);
                match(USING);
                setState(1242);
                qualifiedName();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TablePropertyListContext tablePropertyList() throws RecognitionException {
        TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_tablePropertyList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1244);
                match(T__4);
                setState(1245);
                tableProperty();
                setState(1250);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__6) {
                    {
                        {
                            setState(1246);
                            match(T__6);
                            setState(1247);
                            tableProperty();
                        }
                    }
                    setState(1252);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1253);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TablePropertyContext tableProperty() throws RecognitionException {
        TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_tableProperty);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1255);
                ((TablePropertyContext) _localctx).key = tablePropertyKey();
                setState(1260);
                _la = _input.LA(1);
                if (_la == TRUE || _la == FALSE || _la == EQ || ((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (STRING - 231)) | (1L << (INTEGER_VALUE - 231)) | (1L << (DECIMAL_VALUE - 231)))) != 0)) {
                    {
                        setState(1257);
                        _la = _input.LA(1);
                        if (_la == EQ) {
                            {
                                setState(1256);
                                match(EQ);
                            }
                        }

                        setState(1259);
                        ((TablePropertyContext) _localctx).value = tablePropertyValue();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
        TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_tablePropertyKey);
        int _la;
        try {
            setState(1271);
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
                    setState(1262);
                    identifier();
                    setState(1267);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__12) {
                        {
                            {
                                setState(1263);
                                match(T__12);
                                setState(1264);
                                identifier();
                            }
                        }
                        setState(1269);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case STRING:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1270);
                    match(STRING);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
        TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_tablePropertyValue);
        try {
            setState(1277);
            switch (_input.LA(1)) {
                case INTEGER_VALUE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1273);
                    match(INTEGER_VALUE);
                }
                break;
                case DECIMAL_VALUE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1274);
                    match(DECIMAL_VALUE);
                }
                break;
                case TRUE:
                case FALSE:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1275);
                    booleanValue();
                }
                break;
                case STRING:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1276);
                    match(STRING);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ConstantListContext constantList() throws RecognitionException {
        ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_constantList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1279);
                match(T__4);
                setState(1280);
                constant();
                setState(1285);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__6) {
                    {
                        {
                            setState(1281);
                            match(T__6);
                            setState(1282);
                            constant();
                        }
                    }
                    setState(1287);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1288);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NestedConstantListContext nestedConstantList() throws RecognitionException {
        NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_nestedConstantList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1290);
                match(T__4);
                setState(1291);
                constantList();
                setState(1296);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__6) {
                    {
                        {
                            setState(1292);
                            match(T__6);
                            setState(1293);
                            constantList();
                        }
                    }
                    setState(1298);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1299);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CreateFileFormatContext createFileFormat() throws RecognitionException {
        CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_createFileFormat);
        try {
            setState(1307);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 144, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1301);
                    match(STORED);
                    setState(1302);
                    match(AS);
                    setState(1303);
                    fileFormat();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1304);
                    match(STORED);
                    setState(1305);
                    match(BY);
                    setState(1306);
                    storageHandler();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FileFormatContext fileFormat() throws RecognitionException {
        FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_fileFormat);
        try {
            setState(1314);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 145, _ctx)) {
                case 1:
                    _localctx = new TableFileFormatContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1309);
                    match(INPUTFORMAT);
                    setState(1310);
                    ((TableFileFormatContext) _localctx).inFmt = match(STRING);
                    setState(1311);
                    match(OUTPUTFORMAT);
                    setState(1312);
                    ((TableFileFormatContext) _localctx).outFmt = match(STRING);
                }
                break;
                case 2:
                    _localctx = new GenericFileFormatContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1313);
                    identifier();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StorageHandlerContext storageHandler() throws RecognitionException {
        StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_storageHandler);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1316);
                match(STRING);
                setState(1320);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 146, _ctx)) {
                    case 1: {
                        setState(1317);
                        match(WITH);
                        setState(1318);
                        match(SERDEPROPERTIES);
                        setState(1319);
                        tablePropertyList();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ResourceContext resource() throws RecognitionException {
        ResourceContext _localctx = new ResourceContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_resource);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1322);
                identifier();
                setState(1323);
                match(STRING);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final QueryNoWithContext queryNoWith() throws RecognitionException {
        QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_queryNoWith);
        int _la;
        try {
            setState(1337);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 149, _ctx)) {
                case 1:
                    _localctx = new SingleInsertQueryContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1326);
                    _la = _input.LA(1);
                    if (_la == INSERT) {
                        {
                            setState(1325);
                            insertInto();
                        }
                    }

                    setState(1328);
                    queryTerm(0);
                    setState(1329);
                    queryOrganization();
                }
                break;
                case 2:
                    _localctx = new MultiInsertQueryContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1331);
                    fromClause();
                    setState(1333);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(1332);
                                multiInsertQueryBody();
                            }
                        }
                        setState(1335);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == SELECT || _la == FROM || _la == INSERT || _la == MAP || _la == REDUCE);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final QueryOrganizationContext queryOrganization() throws RecognitionException {
        QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_queryOrganization);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1349);
                _la = _input.LA(1);
                if (_la == ORDER) {
                    {
                        setState(1339);
                        match(ORDER);
                        setState(1340);
                        match(BY);
                        setState(1341);
                        ((QueryOrganizationContext) _localctx).sortItem = sortItem();
                        ((QueryOrganizationContext) _localctx).order.add(((QueryOrganizationContext) _localctx).sortItem);
                        setState(1346);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__6) {
                            {
                                {
                                    setState(1342);
                                    match(T__6);
                                    setState(1343);
                                    ((QueryOrganizationContext) _localctx).sortItem = sortItem();
                                    ((QueryOrganizationContext) _localctx).order.add(((QueryOrganizationContext) _localctx).sortItem);
                                }
                            }
                            setState(1348);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1361);
                _la = _input.LA(1);
                if (_la == CLUSTER) {
                    {
                        setState(1351);
                        match(CLUSTER);
                        setState(1352);
                        match(BY);
                        setState(1353);
                        ((QueryOrganizationContext) _localctx).expression = expression();
                        ((QueryOrganizationContext) _localctx).clusterBy.add(((QueryOrganizationContext) _localctx).expression);
                        setState(1358);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__6) {
                            {
                                {
                                    setState(1354);
                                    match(T__6);
                                    setState(1355);
                                    ((QueryOrganizationContext) _localctx).expression = expression();
                                    ((QueryOrganizationContext) _localctx).clusterBy.add(((QueryOrganizationContext) _localctx).expression);
                                }
                            }
                            setState(1360);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1373);
                _la = _input.LA(1);
                if (_la == DISTRIBUTE) {
                    {
                        setState(1363);
                        match(DISTRIBUTE);
                        setState(1364);
                        match(BY);
                        setState(1365);
                        ((QueryOrganizationContext) _localctx).expression = expression();
                        ((QueryOrganizationContext) _localctx).distributeBy.add(((QueryOrganizationContext) _localctx).expression);
                        setState(1370);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__6) {
                            {
                                {
                                    setState(1366);
                                    match(T__6);
                                    setState(1367);
                                    ((QueryOrganizationContext) _localctx).expression = expression();
                                    ((QueryOrganizationContext) _localctx).distributeBy.add(((QueryOrganizationContext) _localctx).expression);
                                }
                            }
                            setState(1372);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1385);
                _la = _input.LA(1);
                if (_la == SORT) {
                    {
                        setState(1375);
                        match(SORT);
                        setState(1376);
                        match(BY);
                        setState(1377);
                        ((QueryOrganizationContext) _localctx).sortItem = sortItem();
                        ((QueryOrganizationContext) _localctx).sort.add(((QueryOrganizationContext) _localctx).sortItem);
                        setState(1382);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__6) {
                            {
                                {
                                    setState(1378);
                                    match(T__6);
                                    setState(1379);
                                    ((QueryOrganizationContext) _localctx).sortItem = sortItem();
                                    ((QueryOrganizationContext) _localctx).sort.add(((QueryOrganizationContext) _localctx).sortItem);
                                }
                            }
                            setState(1384);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1388);
                _la = _input.LA(1);
                if (_la == WINDOW) {
                    {
                        setState(1387);
                        windows();
                    }
                }

                setState(1392);
                _la = _input.LA(1);
                if (_la == LIMIT) {
                    {
                        setState(1390);
                        match(LIMIT);
                        setState(1391);
                        ((QueryOrganizationContext) _localctx).limit = expression();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
        MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_multiInsertQueryBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1395);
                _la = _input.LA(1);
                if (_la == INSERT) {
                    {
                        setState(1394);
                        insertInto();
                    }
                }

                setState(1397);
                querySpecification();
                setState(1398);
                queryOrganization();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final QueryTermContext queryTerm() throws RecognitionException {
        return queryTerm(0);
    }

    private QueryTermContext queryTerm(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
        QueryTermContext _prevctx = _localctx;
        int _startState = 104;
        enterRecursionRule(_localctx, 104, RULE_queryTerm, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    _localctx = new QueryTermDefaultContext(_localctx);
                    _ctx = _localctx;
                    _prevctx = _localctx;

                    setState(1401);
                    queryPrimary();
                }
                _ctx.stop = _input.LT(-1);
                setState(1411);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 162, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
                                ((SetOperationContext) _localctx).left = _prevctx;
                                pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
                                setState(1403);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(1404);
                                ((SetOperationContext) _localctx).operator = _input.LT(1);
                                _la = _input.LA(1);
                                if (!(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (UNION - 103)) | (1L << (EXCEPT - 103)) | (1L << (INTERSECT - 103)))) != 0))) {
                                    ((SetOperationContext) _localctx).operator = (Token) _errHandler.recoverInline(this);
                                } else {
                                    consume();
                                }
                                setState(1406);
                                _la = _input.LA(1);
                                if (_la == ALL || _la == DISTINCT) {
                                    {
                                        setState(1405);
                                        setQuantifier();
                                    }
                                }

                                setState(1408);
                                ((SetOperationContext) _localctx).right = queryTerm(2);
                            }
                        }
                    }
                    setState(1413);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 162, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final QueryPrimaryContext queryPrimary() throws RecognitionException {
        QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_queryPrimary);
        try {
            setState(1422);
            switch (_input.LA(1)) {
                case SELECT:
                case FROM:
                case MAP:
                case REDUCE:
                    _localctx = new QueryPrimaryDefaultContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1414);
                    querySpecification();
                }
                break;
                case TABLE:
                    _localctx = new TableContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1415);
                    match(TABLE);
                    setState(1416);
                    tableIdentifier();
                }
                break;
                case VALUES:
                    _localctx = new InlineTableDefault1Context(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1417);
                    inlineTable();
                }
                break;
                case T__4:
                    _localctx = new SubqueryContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1418);
                    match(T__4);
                    setState(1419);
                    queryNoWith();
                    setState(1420);
                    match(T__5);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SortItemContext sortItem() throws RecognitionException {
        SortItemContext _localctx = new SortItemContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_sortItem);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1424);
                expression();
                setState(1426);
                _la = _input.LA(1);
                if (_la == ASC || _la == DESC) {
                    {
                        setState(1425);
                        ((SortItemContext) _localctx).ordering = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == ASC || _la == DESC)) {
                            ((SortItemContext) _localctx).ordering = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final QuerySpecificationContext querySpecification() throws RecognitionException {
        QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_querySpecification);
        int _la;
        try {
            int _alt;
            setState(1515);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 185, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        {
                            setState(1438);
                            switch (_input.LA(1)) {
                                case SELECT: {
                                    setState(1428);
                                    match(SELECT);
                                    setState(1429);
                                    ((QuerySpecificationContext) _localctx).kind = match(TRANSFORM);
                                    setState(1430);
                                    match(T__4);
                                    setState(1431);
                                    namedExpressionSeq();
                                    setState(1432);
                                    match(T__5);
                                }
                                break;
                                case MAP: {
                                    setState(1434);
                                    ((QuerySpecificationContext) _localctx).kind = match(MAP);
                                    setState(1435);
                                    namedExpressionSeq();
                                }
                                break;
                                case REDUCE: {
                                    setState(1436);
                                    ((QuerySpecificationContext) _localctx).kind = match(REDUCE);
                                    setState(1437);
                                    namedExpressionSeq();
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                        }
                        setState(1441);
                        _la = _input.LA(1);
                        if (_la == ROW) {
                            {
                                setState(1440);
                                ((QuerySpecificationContext) _localctx).inRowFormat = rowFormat();
                            }
                        }

                        setState(1445);
                        _la = _input.LA(1);
                        if (_la == RECORDWRITER) {
                            {
                                setState(1443);
                                match(RECORDWRITER);
                                setState(1444);
                                ((QuerySpecificationContext) _localctx).recordWriter = match(STRING);
                            }
                        }

                        setState(1447);
                        match(USING);
                        setState(1448);
                        ((QuerySpecificationContext) _localctx).script = match(STRING);
                        setState(1461);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 170, _ctx)) {
                            case 1: {
                                setState(1449);
                                match(AS);
                                setState(1459);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 169, _ctx)) {
                                    case 1: {
                                        setState(1450);
                                        identifierSeq();
                                    }
                                    break;
                                    case 2: {
                                        setState(1451);
                                        colTypeList();
                                    }
                                    break;
                                    case 3: {
                                        {
                                            setState(1452);
                                            match(T__4);
                                            setState(1455);
                                            _errHandler.sync(this);
                                            switch (getInterpreter().adaptivePredict(_input, 168, _ctx)) {
                                                case 1: {
                                                    setState(1453);
                                                    identifierSeq();
                                                }
                                                break;
                                                case 2: {
                                                    setState(1454);
                                                    colTypeList();
                                                }
                                                break;
                                            }
                                            setState(1457);
                                            match(T__5);
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                        setState(1464);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 171, _ctx)) {
                            case 1: {
                                setState(1463);
                                ((QuerySpecificationContext) _localctx).outRowFormat = rowFormat();
                            }
                            break;
                        }
                        setState(1468);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 172, _ctx)) {
                            case 1: {
                                setState(1466);
                                match(RECORDREADER);
                                setState(1467);
                                ((QuerySpecificationContext) _localctx).recordReader = match(STRING);
                            }
                            break;
                        }
                        setState(1471);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 173, _ctx)) {
                            case 1: {
                                setState(1470);
                                fromClause();
                            }
                            break;
                        }
                        setState(1475);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 174, _ctx)) {
                            case 1: {
                                setState(1473);
                                match(WHERE);
                                setState(1474);
                                ((QuerySpecificationContext) _localctx).where = booleanExpression(0);
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
                        setState(1493);
                        switch (_input.LA(1)) {
                            case SELECT: {
                                setState(1477);
                                ((QuerySpecificationContext) _localctx).kind = match(SELECT);
                                setState(1479);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 175, _ctx)) {
                                    case 1: {
                                        setState(1478);
                                        setQuantifier();
                                    }
                                    break;
                                }
                                setState(1481);
                                namedExpressionSeq();
                                setState(1483);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 176, _ctx)) {
                                    case 1: {
                                        setState(1482);
                                        fromClause();
                                    }
                                    break;
                                }
                            }
                            break;
                            case FROM: {
                                setState(1485);
                                fromClause();
                                setState(1491);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 178, _ctx)) {
                                    case 1: {
                                        setState(1486);
                                        ((QuerySpecificationContext) _localctx).kind = match(SELECT);
                                        setState(1488);
                                        _errHandler.sync(this);
                                        switch (getInterpreter().adaptivePredict(_input, 177, _ctx)) {
                                            case 1: {
                                                setState(1487);
                                                setQuantifier();
                                            }
                                            break;
                                        }
                                        setState(1490);
                                        namedExpressionSeq();
                                    }
                                    break;
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(1498);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 180, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(1495);
                                        lateralView();
                                    }
                                }
                            }
                            setState(1500);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 180, _ctx);
                        }
                        setState(1503);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 181, _ctx)) {
                            case 1: {
                                setState(1501);
                                match(WHERE);
                                setState(1502);
                                ((QuerySpecificationContext) _localctx).where = booleanExpression(0);
                            }
                            break;
                        }
                        setState(1506);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 182, _ctx)) {
                            case 1: {
                                setState(1505);
                                aggregation();
                            }
                            break;
                        }
                        setState(1510);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 183, _ctx)) {
                            case 1: {
                                setState(1508);
                                match(HAVING);
                                setState(1509);
                                ((QuerySpecificationContext) _localctx).having = booleanExpression(0);
                            }
                            break;
                        }
                        setState(1513);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 184, _ctx)) {
                            case 1: {
                                setState(1512);
                                windows();
                            }
                            break;
                        }
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FromClauseContext fromClause() throws RecognitionException {
        FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_fromClause);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1517);
                match(FROM);
                setState(1518);
                relation(0);
                setState(1523);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 186, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1519);
                                match(T__6);
                                setState(1520);
                                relation(0);
                            }
                        }
                    }
                    setState(1525);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 186, _ctx);
                }
                setState(1529);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 187, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1526);
                                lateralView();
                            }
                        }
                    }
                    setState(1531);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 187, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AggregationContext aggregation() throws RecognitionException {
        AggregationContext _localctx = new AggregationContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_aggregation);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1532);
                match(GROUP);
                setState(1533);
                match(BY);
                setState(1534);
                ((AggregationContext) _localctx).expression = expression();
                ((AggregationContext) _localctx).groupingExpressions.add(((AggregationContext) _localctx).expression);
                setState(1539);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 188, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1535);
                                match(T__6);
                                setState(1536);
                                ((AggregationContext) _localctx).expression = expression();
                                ((AggregationContext) _localctx).groupingExpressions.add(((AggregationContext) _localctx).expression);
                            }
                        }
                    }
                    setState(1541);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 188, _ctx);
                }
                setState(1559);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 190, _ctx)) {
                    case 1: {
                        setState(1542);
                        match(WITH);
                        setState(1543);
                        ((AggregationContext) _localctx).kind = match(ROLLUP);
                    }
                    break;
                    case 2: {
                        setState(1544);
                        match(WITH);
                        setState(1545);
                        ((AggregationContext) _localctx).kind = match(CUBE);
                    }
                    break;
                    case 3: {
                        setState(1546);
                        ((AggregationContext) _localctx).kind = match(GROUPING);
                        setState(1547);
                        match(SETS);
                        setState(1548);
                        match(T__4);
                        setState(1549);
                        groupingSet();
                        setState(1554);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__6) {
                            {
                                {
                                    setState(1550);
                                    match(T__6);
                                    setState(1551);
                                    groupingSet();
                                }
                            }
                            setState(1556);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1557);
                        match(T__5);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final GroupingSetContext groupingSet() throws RecognitionException {
        GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_groupingSet);
        int _la;
        try {
            setState(1574);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 193, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1561);
                    match(T__4);
                    setState(1570);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (ASTERISK - 132)) | (1L << (DIV - 132)) | (1L << (TILDE - 132)) | (1L << (PERCENTLIT - 132)) | (1L << (BUCKET - 132)) | (1L << (OUT - 132)) | (1L << (OF - 132)) | (1L << (SORT - 132)) | (1L << (CLUSTER - 132)) | (1L << (DISTRIBUTE - 132)) | (1L << (OVERWRITE - 132)) | (1L << (TRANSFORM - 132)) | (1L << (REDUCE - 132)) | (1L << (USING - 132)) | (1L << (SERDE - 132)) | (1L << (SERDEPROPERTIES - 132)) | (1L << (RECORDREADER - 132)) | (1L << (RECORDWRITER - 132)) | (1L << (DELIMITED - 132)) | (1L << (FIELDS - 132)) | (1L << (TERMINATED - 132)) | (1L << (COLLECTION - 132)) | (1L << (ITEMS - 132)) | (1L << (KEYS - 132)) | (1L << (ESCAPED - 132)) | (1L << (LINES - 132)) | (1L << (SEPARATED - 132)) | (1L << (FUNCTION - 132)) | (1L << (EXTENDED - 132)) | (1L << (REFRESH - 132)) | (1L << (CLEAR - 132)) | (1L << (CACHE - 132)) | (1L << (UNCACHE - 132)) | (1L << (LAZY - 132)) | (1L << (FORMATTED - 132)) | (1L << (TEMPORARY - 132)) | (1L << (OPTIONS - 132)) | (1L << (UNSET - 132)) | (1L << (TBLPROPERTIES - 132)) | (1L << (DBPROPERTIES - 132)) | (1L << (BUCKETS - 132)) | (1L << (SKEWED - 132)) | (1L << (STORED - 132)) | (1L << (DIRECTORIES - 132)) | (1L << (LOCATION - 132)) | (1L << (EXCHANGE - 132)) | (1L << (ARCHIVE - 132)) | (1L << (UNARCHIVE - 132)) | (1L << (FILEFORMAT - 132)) | (1L << (TOUCH - 132)) | (1L << (COMPACT - 132)) | (1L << (CONCATENATE - 132)) | (1L << (CHANGE - 132)) | (1L << (CASCADE - 132)) | (1L << (RESTRICT - 132)) | (1L << (CLUSTERED - 132)) | (1L << (SORTED - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (PURGE - 196)) | (1L << (INPUTFORMAT - 196)) | (1L << (OUTPUTFORMAT - 196)) | (1L << (DATABASE - 196)) | (1L << (DATABASES - 196)) | (1L << (DFS - 196)) | (1L << (TRUNCATE - 196)) | (1L << (ANALYZE - 196)) | (1L << (COMPUTE - 196)) | (1L << (LIST - 196)) | (1L << (STATISTICS - 196)) | (1L << (PARTITIONED - 196)) | (1L << (EXTERNAL - 196)) | (1L << (DEFINED - 196)) | (1L << (REVOKE - 196)) | (1L << (GRANT - 196)) | (1L << (LOCK - 196)) | (1L << (UNLOCK - 196)) | (1L << (MSCK - 196)) | (1L << (REPAIR - 196)) | (1L << (EXPORT - 196)) | (1L << (IMPORT - 196)) | (1L << (LOAD - 196)) | (1L << (ROLE - 196)) | (1L << (ROLES - 196)) | (1L << (COMPACTIONS - 196)) | (1L << (PRINCIPALS - 196)) | (1L << (TRANSACTIONS - 196)) | (1L << (INDEX - 196)) | (1L << (INDEXES - 196)) | (1L << (LOCKS - 196)) | (1L << (OPTION - 196)) | (1L << (ANTI - 196)) | (1L << (LOCAL - 196)) | (1L << (INPATH - 196)) | (1L << (STRING - 196)) | (1L << (BIGINT_LITERAL - 196)) | (1L << (SMALLINT_LITERAL - 196)) | (1L << (TINYINT_LITERAL - 196)) | (1L << (INTEGER_VALUE - 196)) | (1L << (DECIMAL_VALUE - 196)) | (1L << (SCIENTIFIC_DECIMAL_VALUE - 196)) | (1L << (DOUBLE_LITERAL - 196)) | (1L << (IDENTIFIER - 196)) | (1L << (BACKQUOTED_IDENTIFIER - 196)))) != 0)) {
                        {
                            setState(1562);
                            expression();
                            setState(1567);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__6) {
                                {
                                    {
                                        setState(1563);
                                        match(T__6);
                                        setState(1564);
                                        expression();
                                    }
                                }
                                setState(1569);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(1572);
                    match(T__5);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1573);
                    expression();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LateralViewContext lateralView() throws RecognitionException {
        LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_lateralView);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1576);
                match(LATERAL);
                setState(1577);
                match(VIEW);
                setState(1579);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 194, _ctx)) {
                    case 1: {
                        setState(1578);
                        match(OUTER);
                    }
                    break;
                }
                setState(1581);
                qualifiedName();
                setState(1582);
                match(T__4);
                setState(1591);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (ASTERISK - 132)) | (1L << (DIV - 132)) | (1L << (TILDE - 132)) | (1L << (PERCENTLIT - 132)) | (1L << (BUCKET - 132)) | (1L << (OUT - 132)) | (1L << (OF - 132)) | (1L << (SORT - 132)) | (1L << (CLUSTER - 132)) | (1L << (DISTRIBUTE - 132)) | (1L << (OVERWRITE - 132)) | (1L << (TRANSFORM - 132)) | (1L << (REDUCE - 132)) | (1L << (USING - 132)) | (1L << (SERDE - 132)) | (1L << (SERDEPROPERTIES - 132)) | (1L << (RECORDREADER - 132)) | (1L << (RECORDWRITER - 132)) | (1L << (DELIMITED - 132)) | (1L << (FIELDS - 132)) | (1L << (TERMINATED - 132)) | (1L << (COLLECTION - 132)) | (1L << (ITEMS - 132)) | (1L << (KEYS - 132)) | (1L << (ESCAPED - 132)) | (1L << (LINES - 132)) | (1L << (SEPARATED - 132)) | (1L << (FUNCTION - 132)) | (1L << (EXTENDED - 132)) | (1L << (REFRESH - 132)) | (1L << (CLEAR - 132)) | (1L << (CACHE - 132)) | (1L << (UNCACHE - 132)) | (1L << (LAZY - 132)) | (1L << (FORMATTED - 132)) | (1L << (TEMPORARY - 132)) | (1L << (OPTIONS - 132)) | (1L << (UNSET - 132)) | (1L << (TBLPROPERTIES - 132)) | (1L << (DBPROPERTIES - 132)) | (1L << (BUCKETS - 132)) | (1L << (SKEWED - 132)) | (1L << (STORED - 132)) | (1L << (DIRECTORIES - 132)) | (1L << (LOCATION - 132)) | (1L << (EXCHANGE - 132)) | (1L << (ARCHIVE - 132)) | (1L << (UNARCHIVE - 132)) | (1L << (FILEFORMAT - 132)) | (1L << (TOUCH - 132)) | (1L << (COMPACT - 132)) | (1L << (CONCATENATE - 132)) | (1L << (CHANGE - 132)) | (1L << (CASCADE - 132)) | (1L << (RESTRICT - 132)) | (1L << (CLUSTERED - 132)) | (1L << (SORTED - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (PURGE - 196)) | (1L << (INPUTFORMAT - 196)) | (1L << (OUTPUTFORMAT - 196)) | (1L << (DATABASE - 196)) | (1L << (DATABASES - 196)) | (1L << (DFS - 196)) | (1L << (TRUNCATE - 196)) | (1L << (ANALYZE - 196)) | (1L << (COMPUTE - 196)) | (1L << (LIST - 196)) | (1L << (STATISTICS - 196)) | (1L << (PARTITIONED - 196)) | (1L << (EXTERNAL - 196)) | (1L << (DEFINED - 196)) | (1L << (REVOKE - 196)) | (1L << (GRANT - 196)) | (1L << (LOCK - 196)) | (1L << (UNLOCK - 196)) | (1L << (MSCK - 196)) | (1L << (REPAIR - 196)) | (1L << (EXPORT - 196)) | (1L << (IMPORT - 196)) | (1L << (LOAD - 196)) | (1L << (ROLE - 196)) | (1L << (ROLES - 196)) | (1L << (COMPACTIONS - 196)) | (1L << (PRINCIPALS - 196)) | (1L << (TRANSACTIONS - 196)) | (1L << (INDEX - 196)) | (1L << (INDEXES - 196)) | (1L << (LOCKS - 196)) | (1L << (OPTION - 196)) | (1L << (ANTI - 196)) | (1L << (LOCAL - 196)) | (1L << (INPATH - 196)) | (1L << (STRING - 196)) | (1L << (BIGINT_LITERAL - 196)) | (1L << (SMALLINT_LITERAL - 196)) | (1L << (TINYINT_LITERAL - 196)) | (1L << (INTEGER_VALUE - 196)) | (1L << (DECIMAL_VALUE - 196)) | (1L << (SCIENTIFIC_DECIMAL_VALUE - 196)) | (1L << (DOUBLE_LITERAL - 196)) | (1L << (IDENTIFIER - 196)) | (1L << (BACKQUOTED_IDENTIFIER - 196)))) != 0)) {
                    {
                        setState(1583);
                        expression();
                        setState(1588);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__6) {
                            {
                                {
                                    setState(1584);
                                    match(T__6);
                                    setState(1585);
                                    expression();
                                }
                            }
                            setState(1590);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1593);
                match(T__5);
                setState(1594);
                ((LateralViewContext) _localctx).tblName = identifier();
                setState(1606);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 199, _ctx)) {
                    case 1: {
                        setState(1596);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 197, _ctx)) {
                            case 1: {
                                setState(1595);
                                match(AS);
                            }
                            break;
                        }
                        setState(1598);
                        ((LateralViewContext) _localctx).identifier = identifier();
                        ((LateralViewContext) _localctx).colName.add(((LateralViewContext) _localctx).identifier);
                        setState(1603);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 198, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(1599);
                                        match(T__6);
                                        setState(1600);
                                        ((LateralViewContext) _localctx).identifier = identifier();
                                        ((LateralViewContext) _localctx).colName.add(((LateralViewContext) _localctx).identifier);
                                    }
                                }
                            }
                            setState(1605);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 198, _ctx);
                        }
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SetQuantifierContext setQuantifier() throws RecognitionException {
        SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_setQuantifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1608);
                _la = _input.LA(1);
                if (!(_la == ALL || _la == DISTINCT)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final RelationContext relation() throws RecognitionException {
        return relation(0);
    }

    private RelationContext relation(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        RelationContext _localctx = new RelationContext(_ctx, _parentState);
        RelationContext _prevctx = _localctx;
        int _startState = 122;
        enterRecursionRule(_localctx, 122, RULE_relation, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    _localctx = new RelationDefaultContext(_localctx);
                    _ctx = _localctx;
                    _prevctx = _localctx;

                    setState(1611);
                    relationPrimary();
                }
                _ctx.stop = _input.LT(-1);
                setState(1632);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 203, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
                                ((JoinRelationContext) _localctx).left = _prevctx;
                                pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                setState(1613);
                                if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(1628);
                                switch (_input.LA(1)) {
                                    case JOIN:
                                    case CROSS:
                                    case INNER:
                                    case LEFT:
                                    case RIGHT:
                                    case FULL:
                                    case ANTI: {
                                        setState(1616);
                                        switch (_input.LA(1)) {
                                            case CROSS: {
                                                setState(1614);
                                                match(CROSS);
                                            }
                                            break;
                                            case JOIN:
                                            case INNER:
                                            case LEFT:
                                            case RIGHT:
                                            case FULL:
                                            case ANTI: {
                                                setState(1615);
                                                joinType();
                                            }
                                            break;
                                            default:
                                                throw new NoViableAltException(this);
                                        }
                                        setState(1618);
                                        match(JOIN);
                                        setState(1619);
                                        ((JoinRelationContext) _localctx).right = relation(0);
                                        setState(1621);
                                        _errHandler.sync(this);
                                        switch (getInterpreter().adaptivePredict(_input, 201, _ctx)) {
                                            case 1: {
                                                setState(1620);
                                                joinCriteria();
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                    case NATURAL: {
                                        setState(1623);
                                        match(NATURAL);
                                        setState(1624);
                                        joinType();
                                        setState(1625);
                                        match(JOIN);
                                        setState(1626);
                                        ((JoinRelationContext) _localctx).right = relation(0);
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                    }
                    setState(1634);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 203, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final JoinTypeContext joinType() throws RecognitionException {
        JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_joinType);
        int _la;
        try {
            setState(1656);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 209, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1636);
                    _la = _input.LA(1);
                    if (_la == INNER) {
                        {
                            setState(1635);
                            match(INNER);
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1638);
                    match(LEFT);
                    setState(1640);
                    _la = _input.LA(1);
                    if (_la == OUTER) {
                        {
                            setState(1639);
                            match(OUTER);
                        }
                    }

                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1642);
                    match(LEFT);
                    setState(1643);
                    match(SEMI);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1644);
                    match(RIGHT);
                    setState(1646);
                    _la = _input.LA(1);
                    if (_la == OUTER) {
                        {
                            setState(1645);
                            match(OUTER);
                        }
                    }

                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1648);
                    match(FULL);
                    setState(1650);
                    _la = _input.LA(1);
                    if (_la == OUTER) {
                        {
                            setState(1649);
                            match(OUTER);
                        }
                    }

                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1653);
                    _la = _input.LA(1);
                    if (_la == LEFT) {
                        {
                            setState(1652);
                            match(LEFT);
                        }
                    }

                    setState(1655);
                    match(ANTI);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final JoinCriteriaContext joinCriteria() throws RecognitionException {
        JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_joinCriteria);
        int _la;
        try {
            setState(1672);
            switch (_input.LA(1)) {
                case ON:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1658);
                    match(ON);
                    setState(1659);
                    booleanExpression(0);
                }
                break;
                case USING:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1660);
                    match(USING);
                    setState(1661);
                    match(T__4);
                    setState(1662);
                    identifier();
                    setState(1667);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__6) {
                        {
                            {
                                setState(1663);
                                match(T__6);
                                setState(1664);
                                identifier();
                            }
                        }
                        setState(1669);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1670);
                    match(T__5);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SampleContext sample() throws RecognitionException {
        SampleContext _localctx = new SampleContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_sample);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1674);
                match(TABLESAMPLE);
                setState(1675);
                match(T__4);
                setState(1697);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 214, _ctx)) {
                    case 1: {
                        {
                            setState(1676);
                            ((SampleContext) _localctx).percentage = _input.LT(1);
                            _la = _input.LA(1);
                            if (!(_la == INTEGER_VALUE || _la == DECIMAL_VALUE)) {
                                ((SampleContext) _localctx).percentage = (Token) _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                            setState(1677);
                            ((SampleContext) _localctx).sampleType = match(PERCENTLIT);
                        }
                    }
                    break;
                    case 2: {
                        {
                            setState(1678);
                            expression();
                            setState(1679);
                            ((SampleContext) _localctx).sampleType = match(ROWS);
                        }
                    }
                    break;
                    case 3: {
                        setState(1681);
                        ((SampleContext) _localctx).sampleType = match(BYTELENGTH_LITERAL);
                    }
                    break;
                    case 4: {
                        {
                            setState(1682);
                            ((SampleContext) _localctx).sampleType = match(BUCKET);
                            setState(1683);
                            ((SampleContext) _localctx).numerator = match(INTEGER_VALUE);
                            setState(1684);
                            match(OUT);
                            setState(1685);
                            match(OF);
                            setState(1686);
                            ((SampleContext) _localctx).denominator = match(INTEGER_VALUE);
                            setState(1695);
                            _la = _input.LA(1);
                            if (_la == ON) {
                                {
                                    setState(1687);
                                    match(ON);
                                    setState(1693);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 212, _ctx)) {
                                        case 1: {
                                            setState(1688);
                                            identifier();
                                        }
                                        break;
                                        case 2: {
                                            setState(1689);
                                            qualifiedName();
                                            setState(1690);
                                            match(T__4);
                                            setState(1691);
                                            match(T__5);
                                        }
                                        break;
                                    }
                                }
                            }

                        }
                    }
                    break;
                }
                setState(1699);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IdentifierListContext identifierList() throws RecognitionException {
        IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_identifierList);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1701);
                match(T__4);
                setState(1702);
                identifierSeq();
                setState(1703);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IdentifierSeqContext identifierSeq() throws RecognitionException {
        IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_identifierSeq);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1705);
                identifier();
                setState(1710);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 215, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1706);
                                match(T__6);
                                setState(1707);
                                identifier();
                            }
                        }
                    }
                    setState(1712);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 215, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
        OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_orderedIdentifierList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1713);
                match(T__4);
                setState(1714);
                orderedIdentifier();
                setState(1719);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__6) {
                    {
                        {
                            setState(1715);
                            match(T__6);
                            setState(1716);
                            orderedIdentifier();
                        }
                    }
                    setState(1721);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1722);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
        OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_orderedIdentifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1724);
                identifier();
                setState(1726);
                _la = _input.LA(1);
                if (_la == ASC || _la == DESC) {
                    {
                        setState(1725);
                        ((OrderedIdentifierContext) _localctx).ordering = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == ASC || _la == DESC)) {
                            ((OrderedIdentifierContext) _localctx).ordering = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
        IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_identifierCommentList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1728);
                match(T__4);
                setState(1729);
                identifierComment();
                setState(1734);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__6) {
                    {
                        {
                            setState(1730);
                            match(T__6);
                            setState(1731);
                            identifierComment();
                        }
                    }
                    setState(1736);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1737);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IdentifierCommentContext identifierComment() throws RecognitionException {
        IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_identifierComment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1739);
                identifier();
                setState(1742);
                _la = _input.LA(1);
                if (_la == COMMENT) {
                    {
                        setState(1740);
                        match(COMMENT);
                        setState(1741);
                        match(STRING);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final RelationPrimaryContext relationPrimary() throws RecognitionException {
        RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_relationPrimary);
        try {
            setState(1779);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 229, _ctx)) {
                case 1:
                    _localctx = new TableNameContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1744);
                    tableIdentifier();
                    setState(1746);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 220, _ctx)) {
                        case 1: {
                            setState(1745);
                            sample();
                        }
                        break;
                    }
                    setState(1752);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 222, _ctx)) {
                        case 1: {
                            setState(1749);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 221, _ctx)) {
                                case 1: {
                                    setState(1748);
                                    match(AS);
                                }
                                break;
                            }
                            setState(1751);
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
                    setState(1754);
                    match(T__4);
                    setState(1755);
                    queryNoWith();
                    setState(1756);
                    match(T__5);
                    setState(1758);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 223, _ctx)) {
                        case 1: {
                            setState(1757);
                            sample();
                        }
                        break;
                    }
                    setState(1764);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 225, _ctx)) {
                        case 1: {
                            setState(1761);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 224, _ctx)) {
                                case 1: {
                                    setState(1760);
                                    match(AS);
                                }
                                break;
                            }
                            setState(1763);
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
                    setState(1766);
                    match(T__4);
                    setState(1767);
                    relation(0);
                    setState(1768);
                    match(T__5);
                    setState(1770);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 226, _ctx)) {
                        case 1: {
                            setState(1769);
                            sample();
                        }
                        break;
                    }
                    setState(1776);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 228, _ctx)) {
                        case 1: {
                            setState(1773);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 227, _ctx)) {
                                case 1: {
                                    setState(1772);
                                    match(AS);
                                }
                                break;
                            }
                            setState(1775);
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
                    setState(1778);
                    inlineTable();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InlineTableContext inlineTable() throws RecognitionException {
        InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_inlineTable);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1781);
                match(VALUES);
                setState(1782);
                expression();
                setState(1787);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 230, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1783);
                                match(T__6);
                                setState(1784);
                                expression();
                            }
                        }
                    }
                    setState(1789);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 230, _ctx);
                }
                setState(1797);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 233, _ctx)) {
                    case 1: {
                        setState(1791);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 231, _ctx)) {
                            case 1: {
                                setState(1790);
                                match(AS);
                            }
                            break;
                        }
                        setState(1793);
                        identifier();
                        setState(1795);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 232, _ctx)) {
                            case 1: {
                                setState(1794);
                                identifierList();
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final RowFormatContext rowFormat() throws RecognitionException {
        RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_rowFormat);
        try {
            setState(1848);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 241, _ctx)) {
                case 1:
                    _localctx = new RowFormatSerdeContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1799);
                    match(ROW);
                    setState(1800);
                    match(FORMAT);
                    setState(1801);
                    match(SERDE);
                    setState(1802);
                    ((RowFormatSerdeContext) _localctx).name = match(STRING);
                    setState(1806);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 234, _ctx)) {
                        case 1: {
                            setState(1803);
                            match(WITH);
                            setState(1804);
                            match(SERDEPROPERTIES);
                            setState(1805);
                            ((RowFormatSerdeContext) _localctx).props = tablePropertyList();
                        }
                        break;
                    }
                }
                break;
                case 2:
                    _localctx = new RowFormatDelimitedContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1808);
                    match(ROW);
                    setState(1809);
                    match(FORMAT);
                    setState(1810);
                    match(DELIMITED);
                    setState(1820);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 236, _ctx)) {
                        case 1: {
                            setState(1811);
                            match(FIELDS);
                            setState(1812);
                            match(TERMINATED);
                            setState(1813);
                            match(BY);
                            setState(1814);
                            ((RowFormatDelimitedContext) _localctx).fieldsTerminatedBy = match(STRING);
                            setState(1818);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 235, _ctx)) {
                                case 1: {
                                    setState(1815);
                                    match(ESCAPED);
                                    setState(1816);
                                    match(BY);
                                    setState(1817);
                                    ((RowFormatDelimitedContext) _localctx).escapedBy = match(STRING);
                                }
                                break;
                            }
                        }
                        break;
                    }
                    setState(1827);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 237, _ctx)) {
                        case 1: {
                            setState(1822);
                            match(COLLECTION);
                            setState(1823);
                            match(ITEMS);
                            setState(1824);
                            match(TERMINATED);
                            setState(1825);
                            match(BY);
                            setState(1826);
                            ((RowFormatDelimitedContext) _localctx).collectionItemsTerminatedBy = match(STRING);
                        }
                        break;
                    }
                    setState(1834);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 238, _ctx)) {
                        case 1: {
                            setState(1829);
                            match(MAP);
                            setState(1830);
                            match(KEYS);
                            setState(1831);
                            match(TERMINATED);
                            setState(1832);
                            match(BY);
                            setState(1833);
                            ((RowFormatDelimitedContext) _localctx).keysTerminatedBy = match(STRING);
                        }
                        break;
                    }
                    setState(1840);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 239, _ctx)) {
                        case 1: {
                            setState(1836);
                            match(LINES);
                            setState(1837);
                            match(TERMINATED);
                            setState(1838);
                            match(BY);
                            setState(1839);
                            ((RowFormatDelimitedContext) _localctx).linesSeparatedBy = match(STRING);
                        }
                        break;
                    }
                    setState(1846);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 240, _ctx)) {
                        case 1: {
                            setState(1842);
                            match(NULL);
                            setState(1843);
                            match(DEFINED);
                            setState(1844);
                            match(AS);
                            setState(1845);
                            ((RowFormatDelimitedContext) _localctx).nullDefinedAs = match(STRING);
                        }
                        break;
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TableIdentifierContext tableIdentifier() throws RecognitionException {
        TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_tableIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1853);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 242, _ctx)) {
                    case 1: {
                        setState(1850);
                        ((TableIdentifierContext) _localctx).db = identifier();
                        setState(1851);
                        match(T__12);
                    }
                    break;
                }
                setState(1855);
                ((TableIdentifierContext) _localctx).table = identifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NamedExpressionContext namedExpression() throws RecognitionException {
        NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_namedExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1857);
                expression();
                setState(1865);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 245, _ctx)) {
                    case 1: {
                        setState(1859);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 243, _ctx)) {
                            case 1: {
                                setState(1858);
                                match(AS);
                            }
                            break;
                        }
                        setState(1863);
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
                            case BACKQUOTED_IDENTIFIER: {
                                setState(1861);
                                identifier();
                            }
                            break;
                            case T__4: {
                                setState(1862);
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
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
        NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_namedExpressionSeq);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1867);
                namedExpression();
                setState(1872);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 246, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1868);
                                match(T__6);
                                setState(1869);
                                namedExpression();
                            }
                        }
                    }
                    setState(1874);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 246, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1875);
                booleanExpression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BooleanExpressionContext booleanExpression() throws RecognitionException {
        return booleanExpression(0);
    }

    private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
        BooleanExpressionContext _prevctx = _localctx;
        int _startState = 156;
        enterRecursionRule(_localctx, 156, RULE_booleanExpression, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1886);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 247, _ctx)) {
                    case 1: {
                        _localctx = new LogicalNotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(1878);
                        match(NOT);
                        setState(1879);
                        booleanExpression(5);
                    }
                    break;
                    case 2: {
                        _localctx = new BooleanDefaultContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1880);
                        predicated();
                    }
                    break;
                    case 3: {
                        _localctx = new ExistsContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1881);
                        match(EXISTS);
                        setState(1882);
                        match(T__4);
                        setState(1883);
                        query();
                        setState(1884);
                        match(T__5);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1896);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 249, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1894);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 248, _ctx)) {
                                case 1: {
                                    _localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
                                    ((LogicalBinaryContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                                    setState(1888);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(1889);
                                    ((LogicalBinaryContext) _localctx).operator = match(AND);
                                    setState(1890);
                                    ((LogicalBinaryContext) _localctx).right = booleanExpression(4);
                                }
                                break;
                                case 2: {
                                    _localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
                                    ((LogicalBinaryContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                                    setState(1891);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(1892);
                                    ((LogicalBinaryContext) _localctx).operator = match(OR);
                                    setState(1893);
                                    ((LogicalBinaryContext) _localctx).right = booleanExpression(3);
                                }
                                break;
                            }
                        }
                    }
                    setState(1898);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 249, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final PredicatedContext predicated() throws RecognitionException {
        PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_predicated);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1899);
                valueExpression(0);
                setState(1901);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 250, _ctx)) {
                    case 1: {
                        setState(1900);
                        predicate();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PredicateContext predicate() throws RecognitionException {
        PredicateContext _localctx = new PredicateContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_predicate);
        int _la;
        try {
            setState(1944);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 257, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1904);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(1903);
                            match(NOT);
                        }
                    }

                    setState(1906);
                    ((PredicateContext) _localctx).kind = match(BETWEEN);
                    setState(1907);
                    ((PredicateContext) _localctx).lower = valueExpression(0);
                    setState(1908);
                    match(AND);
                    setState(1909);
                    ((PredicateContext) _localctx).upper = valueExpression(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1912);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(1911);
                            match(NOT);
                        }
                    }

                    setState(1914);
                    ((PredicateContext) _localctx).kind = match(IN);
                    setState(1915);
                    match(T__4);
                    setState(1916);
                    expression();
                    setState(1921);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__6) {
                        {
                            {
                                setState(1917);
                                match(T__6);
                                setState(1918);
                                expression();
                            }
                        }
                        setState(1923);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1924);
                    match(T__5);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1927);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(1926);
                            match(NOT);
                        }
                    }

                    setState(1929);
                    ((PredicateContext) _localctx).kind = match(IN);
                    setState(1930);
                    match(T__4);
                    setState(1931);
                    query();
                    setState(1932);
                    match(T__5);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1935);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(1934);
                            match(NOT);
                        }
                    }

                    setState(1937);
                    ((PredicateContext) _localctx).kind = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == LIKE || _la == RLIKE)) {
                        ((PredicateContext) _localctx).kind = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(1938);
                    ((PredicateContext) _localctx).pattern = valueExpression(0);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1939);
                    match(IS);
                    setState(1941);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(1940);
                            match(NOT);
                        }
                    }

                    setState(1943);
                    ((PredicateContext) _localctx).kind = match(NULL);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ValueExpressionContext valueExpression() throws RecognitionException {
        return valueExpression(0);
    }

    private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
        ValueExpressionContext _prevctx = _localctx;
        int _startState = 162;
        enterRecursionRule(_localctx, 162, RULE_valueExpression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1950);
                switch (_input.LA(1)) {
                    case T__4:
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
                    case BACKQUOTED_IDENTIFIER: {
                        _localctx = new ValueExpressionDefaultContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(1947);
                        primaryExpression(0);
                    }
                    break;
                    case PLUS:
                    case MINUS:
                    case TILDE: {
                        _localctx = new ArithmeticUnaryContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1948);
                        ((ArithmeticUnaryContext) _localctx).operator = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (TILDE - 132)))) != 0))) {
                            ((ArithmeticUnaryContext) _localctx).operator = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(1949);
                        valueExpression(7);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(1973);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 260, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1971);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 259, _ctx)) {
                                case 1: {
                                    _localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
                                    ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
                                    setState(1952);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(1953);
                                    ((ArithmeticBinaryContext) _localctx).operator = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (ASTERISK - 134)) | (1L << (SLASH - 134)) | (1L << (PERCENT - 134)) | (1L << (DIV - 134)))) != 0))) {
                                        ((ArithmeticBinaryContext) _localctx).operator = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(1954);
                                    ((ArithmeticBinaryContext) _localctx).right = valueExpression(7);
                                }
                                break;
                                case 2: {
                                    _localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
                                    ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
                                    setState(1955);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(1956);
                                    ((ArithmeticBinaryContext) _localctx).operator = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((ArithmeticBinaryContext) _localctx).operator = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(1957);
                                    ((ArithmeticBinaryContext) _localctx).right = valueExpression(6);
                                }
                                break;
                                case 3: {
                                    _localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
                                    ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
                                    setState(1958);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(1959);
                                    ((ArithmeticBinaryContext) _localctx).operator = match(AMPERSAND);
                                    setState(1960);
                                    ((ArithmeticBinaryContext) _localctx).right = valueExpression(5);
                                }
                                break;
                                case 4: {
                                    _localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
                                    ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
                                    setState(1961);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(1962);
                                    ((ArithmeticBinaryContext) _localctx).operator = match(HAT);
                                    setState(1963);
                                    ((ArithmeticBinaryContext) _localctx).right = valueExpression(4);
                                }
                                break;
                                case 5: {
                                    _localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
                                    ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
                                    setState(1964);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(1965);
                                    ((ArithmeticBinaryContext) _localctx).operator = match(PIPE);
                                    setState(1966);
                                    ((ArithmeticBinaryContext) _localctx).right = valueExpression(3);
                                }
                                break;
                                case 6: {
                                    _localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
                                    ((ComparisonContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
                                    setState(1967);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(1968);
                                    comparisonOperator();
                                    setState(1969);
                                    ((ComparisonContext) _localctx).right = valueExpression(2);
                                }
                                break;
                            }
                        }
                    }
                    setState(1975);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 260, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
        return primaryExpression(0);
    }

    private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
        PrimaryExpressionContext _prevctx = _localctx;
        int _startState = 164;
        enterRecursionRule(_localctx, 164, RULE_primaryExpression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(2054);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 270, _ctx)) {
                    case 1: {
                        _localctx = new ConstantDefaultContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(1977);
                        constant();
                    }
                    break;
                    case 2: {
                        _localctx = new StarContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1978);
                        match(ASTERISK);
                    }
                    break;
                    case 3: {
                        _localctx = new StarContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1979);
                        qualifiedName();
                        setState(1980);
                        match(T__12);
                        setState(1981);
                        match(ASTERISK);
                    }
                    break;
                    case 4: {
                        _localctx = new RowConstructorContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1983);
                        match(T__4);
                        setState(1984);
                        expression();
                        setState(1987);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(1985);
                                    match(T__6);
                                    setState(1986);
                                    expression();
                                }
                            }
                            setState(1989);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == T__6);
                        setState(1991);
                        match(T__5);
                    }
                    break;
                    case 5: {
                        _localctx = new FunctionCallContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1993);
                        qualifiedName();
                        setState(1994);
                        match(T__4);
                        setState(2006);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (ASTERISK - 132)) | (1L << (DIV - 132)) | (1L << (TILDE - 132)) | (1L << (PERCENTLIT - 132)) | (1L << (BUCKET - 132)) | (1L << (OUT - 132)) | (1L << (OF - 132)) | (1L << (SORT - 132)) | (1L << (CLUSTER - 132)) | (1L << (DISTRIBUTE - 132)) | (1L << (OVERWRITE - 132)) | (1L << (TRANSFORM - 132)) | (1L << (REDUCE - 132)) | (1L << (USING - 132)) | (1L << (SERDE - 132)) | (1L << (SERDEPROPERTIES - 132)) | (1L << (RECORDREADER - 132)) | (1L << (RECORDWRITER - 132)) | (1L << (DELIMITED - 132)) | (1L << (FIELDS - 132)) | (1L << (TERMINATED - 132)) | (1L << (COLLECTION - 132)) | (1L << (ITEMS - 132)) | (1L << (KEYS - 132)) | (1L << (ESCAPED - 132)) | (1L << (LINES - 132)) | (1L << (SEPARATED - 132)) | (1L << (FUNCTION - 132)) | (1L << (EXTENDED - 132)) | (1L << (REFRESH - 132)) | (1L << (CLEAR - 132)) | (1L << (CACHE - 132)) | (1L << (UNCACHE - 132)) | (1L << (LAZY - 132)) | (1L << (FORMATTED - 132)) | (1L << (TEMPORARY - 132)) | (1L << (OPTIONS - 132)) | (1L << (UNSET - 132)) | (1L << (TBLPROPERTIES - 132)) | (1L << (DBPROPERTIES - 132)) | (1L << (BUCKETS - 132)) | (1L << (SKEWED - 132)) | (1L << (STORED - 132)) | (1L << (DIRECTORIES - 132)) | (1L << (LOCATION - 132)) | (1L << (EXCHANGE - 132)) | (1L << (ARCHIVE - 132)) | (1L << (UNARCHIVE - 132)) | (1L << (FILEFORMAT - 132)) | (1L << (TOUCH - 132)) | (1L << (COMPACT - 132)) | (1L << (CONCATENATE - 132)) | (1L << (CHANGE - 132)) | (1L << (CASCADE - 132)) | (1L << (RESTRICT - 132)) | (1L << (CLUSTERED - 132)) | (1L << (SORTED - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (PURGE - 196)) | (1L << (INPUTFORMAT - 196)) | (1L << (OUTPUTFORMAT - 196)) | (1L << (DATABASE - 196)) | (1L << (DATABASES - 196)) | (1L << (DFS - 196)) | (1L << (TRUNCATE - 196)) | (1L << (ANALYZE - 196)) | (1L << (COMPUTE - 196)) | (1L << (LIST - 196)) | (1L << (STATISTICS - 196)) | (1L << (PARTITIONED - 196)) | (1L << (EXTERNAL - 196)) | (1L << (DEFINED - 196)) | (1L << (REVOKE - 196)) | (1L << (GRANT - 196)) | (1L << (LOCK - 196)) | (1L << (UNLOCK - 196)) | (1L << (MSCK - 196)) | (1L << (REPAIR - 196)) | (1L << (EXPORT - 196)) | (1L << (IMPORT - 196)) | (1L << (LOAD - 196)) | (1L << (ROLE - 196)) | (1L << (ROLES - 196)) | (1L << (COMPACTIONS - 196)) | (1L << (PRINCIPALS - 196)) | (1L << (TRANSACTIONS - 196)) | (1L << (INDEX - 196)) | (1L << (INDEXES - 196)) | (1L << (LOCKS - 196)) | (1L << (OPTION - 196)) | (1L << (ANTI - 196)) | (1L << (LOCAL - 196)) | (1L << (INPATH - 196)) | (1L << (STRING - 196)) | (1L << (BIGINT_LITERAL - 196)) | (1L << (SMALLINT_LITERAL - 196)) | (1L << (TINYINT_LITERAL - 196)) | (1L << (INTEGER_VALUE - 196)) | (1L << (DECIMAL_VALUE - 196)) | (1L << (SCIENTIFIC_DECIMAL_VALUE - 196)) | (1L << (DOUBLE_LITERAL - 196)) | (1L << (IDENTIFIER - 196)) | (1L << (BACKQUOTED_IDENTIFIER - 196)))) != 0)) {
                            {
                                setState(1996);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 262, _ctx)) {
                                    case 1: {
                                        setState(1995);
                                        setQuantifier();
                                    }
                                    break;
                                }
                                setState(1998);
                                expression();
                                setState(2003);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__6) {
                                    {
                                        {
                                            setState(1999);
                                            match(T__6);
                                            setState(2000);
                                            expression();
                                        }
                                    }
                                    setState(2005);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(2008);
                        match(T__5);
                        setState(2011);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 265, _ctx)) {
                            case 1: {
                                setState(2009);
                                match(OVER);
                                setState(2010);
                                windowSpec();
                            }
                            break;
                        }
                    }
                    break;
                    case 6: {
                        _localctx = new SubqueryExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(2013);
                        match(T__4);
                        setState(2014);
                        query();
                        setState(2015);
                        match(T__5);
                    }
                    break;
                    case 7: {
                        _localctx = new SimpleCaseContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(2017);
                        match(CASE);
                        setState(2018);
                        valueExpression(0);
                        setState(2020);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(2019);
                                    whenClause();
                                }
                            }
                            setState(2022);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == WHEN);
                        setState(2026);
                        _la = _input.LA(1);
                        if (_la == ELSE) {
                            {
                                setState(2024);
                                match(ELSE);
                                setState(2025);
                                ((SimpleCaseContext) _localctx).elseExpression = expression();
                            }
                        }

                        setState(2028);
                        match(END);
                    }
                    break;
                    case 8: {
                        _localctx = new SearchedCaseContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(2030);
                        match(CASE);
                        setState(2032);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(2031);
                                    whenClause();
                                }
                            }
                            setState(2034);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == WHEN);
                        setState(2038);
                        _la = _input.LA(1);
                        if (_la == ELSE) {
                            {
                                setState(2036);
                                match(ELSE);
                                setState(2037);
                                ((SearchedCaseContext) _localctx).elseExpression = expression();
                            }
                        }

                        setState(2040);
                        match(END);
                    }
                    break;
                    case 9: {
                        _localctx = new CastContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(2042);
                        match(CAST);
                        setState(2043);
                        match(T__4);
                        setState(2044);
                        expression();
                        setState(2045);
                        match(AS);
                        setState(2046);
                        dataType();
                        setState(2047);
                        match(T__5);
                    }
                    break;
                    case 10: {
                        _localctx = new ColumnReferenceContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(2049);
                        identifier();
                    }
                    break;
                    case 11: {
                        _localctx = new ParenthesizedExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(2050);
                        match(T__4);
                        setState(2051);
                        expression();
                        setState(2052);
                        match(T__5);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(2066);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 272, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(2064);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 271, _ctx)) {
                                case 1: {
                                    _localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
                                    ((SubscriptContext) _localctx).value = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
                                    setState(2056);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(2057);
                                    match(T__9);
                                    setState(2058);
                                    ((SubscriptContext) _localctx).index = valueExpression(0);
                                    setState(2059);
                                    match(T__10);
                                }
                                break;
                                case 2: {
                                    _localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
                                    ((DereferenceContext) _localctx).base = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
                                    setState(2061);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(2062);
                                    match(T__12);
                                    setState(2063);
                                    ((DereferenceContext) _localctx).fieldName = identifier();
                                }
                                break;
                            }
                        }
                    }
                    setState(2068);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 272, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final ConstantContext constant() throws RecognitionException {
        ConstantContext _localctx = new ConstantContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_constant);
        try {
            int _alt;
            setState(2081);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 274, _ctx)) {
                case 1:
                    _localctx = new NullLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2069);
                    match(NULL);
                }
                break;
                case 2:
                    _localctx = new IntervalLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2070);
                    interval();
                }
                break;
                case 3:
                    _localctx = new TypeConstructorContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(2071);
                    identifier();
                    setState(2072);
                    match(STRING);
                }
                break;
                case 4:
                    _localctx = new NumericLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(2074);
                    number();
                }
                break;
                case 5:
                    _localctx = new BooleanLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(2075);
                    booleanValue();
                }
                break;
                case 6:
                    _localctx = new StringLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(2077);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                {
                                    setState(2076);
                                    match(STRING);
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(2079);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 273, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
        ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_comparisonOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2083);
                _la = _input.LA(1);
                if (!(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (EQ - 124)) | (1L << (NSEQ - 124)) | (1L << (NEQ - 124)) | (1L << (NEQJ - 124)) | (1L << (LT - 124)) | (1L << (LTE - 124)) | (1L << (GT - 124)) | (1L << (GTE - 124)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
        ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_arithmeticOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2085);
                _la = _input.LA(1);
                if (!(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (ASTERISK - 132)) | (1L << (SLASH - 132)) | (1L << (PERCENT - 132)) | (1L << (DIV - 132)) | (1L << (TILDE - 132)) | (1L << (AMPERSAND - 132)) | (1L << (PIPE - 132)) | (1L << (HAT - 132)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PredicateOperatorContext predicateOperator() throws RecognitionException {
        PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_predicateOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2087);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BooleanValueContext booleanValue() throws RecognitionException {
        BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
        enterRule(_localctx, 174, RULE_booleanValue);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2089);
                _la = _input.LA(1);
                if (!(_la == TRUE || _la == FALSE)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IntervalContext interval() throws RecognitionException {
        IntervalContext _localctx = new IntervalContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_interval);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(2091);
                match(INTERVAL);
                setState(2095);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 275, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(2092);
                                intervalField();
                            }
                        }
                    }
                    setState(2097);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 275, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IntervalFieldContext intervalField() throws RecognitionException {
        IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_intervalField);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2098);
                ((IntervalFieldContext) _localctx).value = intervalValue();
                setState(2099);
                ((IntervalFieldContext) _localctx).unit = identifier();
                setState(2102);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 276, _ctx)) {
                    case 1: {
                        setState(2100);
                        match(TO);
                        setState(2101);
                        ((IntervalFieldContext) _localctx).to = identifier();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IntervalValueContext intervalValue() throws RecognitionException {
        IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_intervalValue);
        int _la;
        try {
            setState(2109);
            switch (_input.LA(1)) {
                case PLUS:
                case MINUS:
                case INTEGER_VALUE:
                case DECIMAL_VALUE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2105);
                    _la = _input.LA(1);
                    if (_la == PLUS || _la == MINUS) {
                        {
                            setState(2104);
                            _la = _input.LA(1);
                            if (!(_la == PLUS || _la == MINUS)) {
                                _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                        }
                    }

                    setState(2107);
                    _la = _input.LA(1);
                    if (!(_la == INTEGER_VALUE || _la == DECIMAL_VALUE)) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                }
                break;
                case STRING:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2108);
                    match(STRING);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DataTypeContext dataType() throws RecognitionException {
        DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_dataType);
        int _la;
        try {
            setState(2145);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 283, _ctx)) {
                case 1:
                    _localctx = new ComplexDataTypeContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2111);
                    ((ComplexDataTypeContext) _localctx).complex = match(ARRAY);
                    setState(2112);
                    match(LT);
                    setState(2113);
                    dataType();
                    setState(2114);
                    match(GT);
                }
                break;
                case 2:
                    _localctx = new ComplexDataTypeContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2116);
                    ((ComplexDataTypeContext) _localctx).complex = match(MAP);
                    setState(2117);
                    match(LT);
                    setState(2118);
                    dataType();
                    setState(2119);
                    match(T__6);
                    setState(2120);
                    dataType();
                    setState(2121);
                    match(GT);
                }
                break;
                case 3:
                    _localctx = new ComplexDataTypeContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(2123);
                    ((ComplexDataTypeContext) _localctx).complex = match(STRUCT);
                    setState(2130);
                    switch (_input.LA(1)) {
                        case LT: {
                            setState(2124);
                            match(LT);
                            setState(2126);
                            _la = _input.LA(1);
                            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DIV - 137)) | (1L << (PERCENTLIT - 137)) | (1L << (BUCKET - 137)) | (1L << (OUT - 137)) | (1L << (OF - 137)) | (1L << (SORT - 137)) | (1L << (CLUSTER - 137)) | (1L << (DISTRIBUTE - 137)) | (1L << (OVERWRITE - 137)) | (1L << (TRANSFORM - 137)) | (1L << (REDUCE - 137)) | (1L << (USING - 137)) | (1L << (SERDE - 137)) | (1L << (SERDEPROPERTIES - 137)) | (1L << (RECORDREADER - 137)) | (1L << (RECORDWRITER - 137)) | (1L << (DELIMITED - 137)) | (1L << (FIELDS - 137)) | (1L << (TERMINATED - 137)) | (1L << (COLLECTION - 137)) | (1L << (ITEMS - 137)) | (1L << (KEYS - 137)) | (1L << (ESCAPED - 137)) | (1L << (LINES - 137)) | (1L << (SEPARATED - 137)) | (1L << (FUNCTION - 137)) | (1L << (EXTENDED - 137)) | (1L << (REFRESH - 137)) | (1L << (CLEAR - 137)) | (1L << (CACHE - 137)) | (1L << (UNCACHE - 137)) | (1L << (LAZY - 137)) | (1L << (FORMATTED - 137)) | (1L << (TEMPORARY - 137)) | (1L << (OPTIONS - 137)) | (1L << (UNSET - 137)) | (1L << (TBLPROPERTIES - 137)) | (1L << (DBPROPERTIES - 137)) | (1L << (BUCKETS - 137)) | (1L << (SKEWED - 137)) | (1L << (STORED - 137)) | (1L << (DIRECTORIES - 137)) | (1L << (LOCATION - 137)) | (1L << (EXCHANGE - 137)) | (1L << (ARCHIVE - 137)) | (1L << (UNARCHIVE - 137)) | (1L << (FILEFORMAT - 137)) | (1L << (TOUCH - 137)) | (1L << (COMPACT - 137)) | (1L << (CONCATENATE - 137)) | (1L << (CHANGE - 137)) | (1L << (CASCADE - 137)) | (1L << (RESTRICT - 137)) | (1L << (CLUSTERED - 137)) | (1L << (SORTED - 137)) | (1L << (PURGE - 137)) | (1L << (INPUTFORMAT - 137)) | (1L << (OUTPUTFORMAT - 137)) | (1L << (DATABASE - 137)) | (1L << (DATABASES - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (DFS - 201)) | (1L << (TRUNCATE - 201)) | (1L << (ANALYZE - 201)) | (1L << (COMPUTE - 201)) | (1L << (LIST - 201)) | (1L << (STATISTICS - 201)) | (1L << (PARTITIONED - 201)) | (1L << (EXTERNAL - 201)) | (1L << (DEFINED - 201)) | (1L << (REVOKE - 201)) | (1L << (GRANT - 201)) | (1L << (LOCK - 201)) | (1L << (UNLOCK - 201)) | (1L << (MSCK - 201)) | (1L << (REPAIR - 201)) | (1L << (EXPORT - 201)) | (1L << (IMPORT - 201)) | (1L << (LOAD - 201)) | (1L << (ROLE - 201)) | (1L << (ROLES - 201)) | (1L << (COMPACTIONS - 201)) | (1L << (PRINCIPALS - 201)) | (1L << (TRANSACTIONS - 201)) | (1L << (INDEX - 201)) | (1L << (INDEXES - 201)) | (1L << (LOCKS - 201)) | (1L << (OPTION - 201)) | (1L << (ANTI - 201)) | (1L << (LOCAL - 201)) | (1L << (INPATH - 201)) | (1L << (IDENTIFIER - 201)) | (1L << (BACKQUOTED_IDENTIFIER - 201)))) != 0)) {
                                {
                                    setState(2125);
                                    colTypeList();
                                }
                            }

                            setState(2128);
                            match(GT);
                        }
                        break;
                        case NEQ: {
                            setState(2129);
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
                    setState(2132);
                    identifier();
                    setState(2143);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 282, _ctx)) {
                        case 1: {
                            setState(2133);
                            match(T__4);
                            setState(2134);
                            match(INTEGER_VALUE);
                            setState(2139);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__6) {
                                {
                                    {
                                        setState(2135);
                                        match(T__6);
                                        setState(2136);
                                        match(INTEGER_VALUE);
                                    }
                                }
                                setState(2141);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                            setState(2142);
                            match(T__5);
                        }
                        break;
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ColTypeListContext colTypeList() throws RecognitionException {
        ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_colTypeList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(2147);
                colType();
                setState(2152);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 284, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(2148);
                                match(T__6);
                                setState(2149);
                                colType();
                            }
                        }
                    }
                    setState(2154);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 284, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ColTypeContext colType() throws RecognitionException {
        ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_colType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2155);
                identifier();
                setState(2157);
                _la = _input.LA(1);
                if (_la == T__11) {
                    {
                        setState(2156);
                        match(T__11);
                    }
                }

                setState(2159);
                dataType();
                setState(2162);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 286, _ctx)) {
                    case 1: {
                        setState(2160);
                        match(COMMENT);
                        setState(2161);
                        match(STRING);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WhenClauseContext whenClause() throws RecognitionException {
        WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_whenClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2164);
                match(WHEN);
                setState(2165);
                ((WhenClauseContext) _localctx).condition = expression();
                setState(2166);
                match(THEN);
                setState(2167);
                ((WhenClauseContext) _localctx).result = expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WindowsContext windows() throws RecognitionException {
        WindowsContext _localctx = new WindowsContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_windows);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(2169);
                match(WINDOW);
                setState(2170);
                namedWindow();
                setState(2175);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 287, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(2171);
                                match(T__6);
                                setState(2172);
                                namedWindow();
                            }
                        }
                    }
                    setState(2177);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 287, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NamedWindowContext namedWindow() throws RecognitionException {
        NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
        enterRule(_localctx, 192, RULE_namedWindow);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2178);
                identifier();
                setState(2179);
                match(AS);
                setState(2180);
                windowSpec();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WindowSpecContext windowSpec() throws RecognitionException {
        WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
        enterRule(_localctx, 194, RULE_windowSpec);
        int _la;
        try {
            setState(2224);
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
                    setState(2182);
                    ((WindowRefContext) _localctx).name = identifier();
                }
                break;
                case T__4:
                    _localctx = new WindowDefContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2183);
                    match(T__4);
                    setState(2218);
                    switch (_input.LA(1)) {
                        case CLUSTER: {
                            setState(2184);
                            match(CLUSTER);
                            setState(2185);
                            match(BY);
                            setState(2186);
                            ((WindowDefContext) _localctx).expression = expression();
                            ((WindowDefContext) _localctx).partition.add(((WindowDefContext) _localctx).expression);
                            setState(2191);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__6) {
                                {
                                    {
                                        setState(2187);
                                        match(T__6);
                                        setState(2188);
                                        ((WindowDefContext) _localctx).expression = expression();
                                        ((WindowDefContext) _localctx).partition.add(((WindowDefContext) _localctx).expression);
                                    }
                                }
                                setState(2193);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                        break;
                        case T__5:
                        case ORDER:
                        case PARTITION:
                        case RANGE:
                        case ROWS:
                        case SORT:
                        case DISTRIBUTE: {
                            setState(2204);
                            _la = _input.LA(1);
                            if (_la == PARTITION || _la == DISTRIBUTE) {
                                {
                                    setState(2194);
                                    _la = _input.LA(1);
                                    if (!(_la == PARTITION || _la == DISTRIBUTE)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(2195);
                                    match(BY);
                                    setState(2196);
                                    ((WindowDefContext) _localctx).expression = expression();
                                    ((WindowDefContext) _localctx).partition.add(((WindowDefContext) _localctx).expression);
                                    setState(2201);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == T__6) {
                                        {
                                            {
                                                setState(2197);
                                                match(T__6);
                                                setState(2198);
                                                ((WindowDefContext) _localctx).expression = expression();
                                                ((WindowDefContext) _localctx).partition.add(((WindowDefContext) _localctx).expression);
                                            }
                                        }
                                        setState(2203);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                }
                            }

                            setState(2216);
                            _la = _input.LA(1);
                            if (_la == ORDER || _la == SORT) {
                                {
                                    setState(2206);
                                    _la = _input.LA(1);
                                    if (!(_la == ORDER || _la == SORT)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(2207);
                                    match(BY);
                                    setState(2208);
                                    sortItem();
                                    setState(2213);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == T__6) {
                                        {
                                            {
                                                setState(2209);
                                                match(T__6);
                                                setState(2210);
                                                sortItem();
                                            }
                                        }
                                        setState(2215);
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
                    setState(2221);
                    _la = _input.LA(1);
                    if (_la == RANGE || _la == ROWS) {
                        {
                            setState(2220);
                            windowFrame();
                        }
                    }

                    setState(2223);
                    match(T__5);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WindowFrameContext windowFrame() throws RecognitionException {
        WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
        enterRule(_localctx, 196, RULE_windowFrame);
        try {
            setState(2242);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 296, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2226);
                    ((WindowFrameContext) _localctx).frameType = match(RANGE);
                    setState(2227);
                    ((WindowFrameContext) _localctx).start = frameBound();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2228);
                    ((WindowFrameContext) _localctx).frameType = match(ROWS);
                    setState(2229);
                    ((WindowFrameContext) _localctx).start = frameBound();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(2230);
                    ((WindowFrameContext) _localctx).frameType = match(RANGE);
                    setState(2231);
                    match(BETWEEN);
                    setState(2232);
                    ((WindowFrameContext) _localctx).start = frameBound();
                    setState(2233);
                    match(AND);
                    setState(2234);
                    ((WindowFrameContext) _localctx).end = frameBound();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(2236);
                    ((WindowFrameContext) _localctx).frameType = match(ROWS);
                    setState(2237);
                    match(BETWEEN);
                    setState(2238);
                    ((WindowFrameContext) _localctx).start = frameBound();
                    setState(2239);
                    match(AND);
                    setState(2240);
                    ((WindowFrameContext) _localctx).end = frameBound();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FrameBoundContext frameBound() throws RecognitionException {
        FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
        enterRule(_localctx, 198, RULE_frameBound);
        int _la;
        try {
            setState(2251);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 297, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2244);
                    match(UNBOUNDED);
                    setState(2245);
                    ((FrameBoundContext) _localctx).boundType = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == PRECEDING || _la == FOLLOWING)) {
                        ((FrameBoundContext) _localctx).boundType = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2246);
                    ((FrameBoundContext) _localctx).boundType = match(CURRENT);
                    setState(2247);
                    match(ROW);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(2248);
                    expression();
                    setState(2249);
                    ((FrameBoundContext) _localctx).boundType = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == PRECEDING || _la == FOLLOWING)) {
                        ((FrameBoundContext) _localctx).boundType = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final QualifiedNameContext qualifiedName() throws RecognitionException {
        QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
        enterRule(_localctx, 200, RULE_qualifiedName);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(2253);
                identifier();
                setState(2258);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 298, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(2254);
                                match(T__12);
                                setState(2255);
                                identifier();
                            }
                        }
                    }
                    setState(2260);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 298, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IdentifierContext identifier() throws RecognitionException {
        IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
        enterRule(_localctx, 202, RULE_identifier);
        try {
            setState(2275);
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
                    setState(2261);
                    strictIdentifier();
                }
                break;
                case ANTI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2262);
                    match(ANTI);
                }
                break;
                case FULL:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(2263);
                    match(FULL);
                }
                break;
                case INNER:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(2264);
                    match(INNER);
                }
                break;
                case LEFT:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(2265);
                    match(LEFT);
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(2266);
                    match(SEMI);
                }
                break;
                case RIGHT:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(2267);
                    match(RIGHT);
                }
                break;
                case NATURAL:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(2268);
                    match(NATURAL);
                }
                break;
                case JOIN:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(2269);
                    match(JOIN);
                }
                break;
                case CROSS:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(2270);
                    match(CROSS);
                }
                break;
                case ON:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(2271);
                    match(ON);
                }
                break;
                case UNION:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(2272);
                    match(UNION);
                }
                break;
                case INTERSECT:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(2273);
                    match(INTERSECT);
                }
                break;
                case EXCEPT:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(2274);
                    match(EXCEPT);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
        StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
        enterRule(_localctx, 204, RULE_strictIdentifier);
        try {
            setState(2280);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    _localctx = new UnquotedIdentifierContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2277);
                    match(IDENTIFIER);
                }
                break;
                case BACKQUOTED_IDENTIFIER:
                    _localctx = new QuotedIdentifierAlternativeContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2278);
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
                    setState(2279);
                    nonReserved();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
        QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
        enterRule(_localctx, 206, RULE_quotedIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2282);
                match(BACKQUOTED_IDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NumberContext number() throws RecognitionException {
        NumberContext _localctx = new NumberContext(_ctx, getState());
        enterRule(_localctx, 208, RULE_number);
        try {
            setState(2291);
            switch (_input.LA(1)) {
                case DECIMAL_VALUE:
                    _localctx = new DecimalLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2284);
                    match(DECIMAL_VALUE);
                }
                break;
                case SCIENTIFIC_DECIMAL_VALUE:
                    _localctx = new ScientificDecimalLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2285);
                    match(SCIENTIFIC_DECIMAL_VALUE);
                }
                break;
                case INTEGER_VALUE:
                    _localctx = new IntegerLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(2286);
                    match(INTEGER_VALUE);
                }
                break;
                case BIGINT_LITERAL:
                    _localctx = new BigIntLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(2287);
                    match(BIGINT_LITERAL);
                }
                break;
                case SMALLINT_LITERAL:
                    _localctx = new SmallIntLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(2288);
                    match(SMALLINT_LITERAL);
                }
                break;
                case TINYINT_LITERAL:
                    _localctx = new TinyIntLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(2289);
                    match(TINYINT_LITERAL);
                }
                break;
                case DOUBLE_LITERAL:
                    _localctx = new DoubleLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(2290);
                    match(DOUBLE_LITERAL);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NonReservedContext nonReserved() throws RecognitionException {
        NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
        enterRule(_localctx, 210, RULE_nonReserved);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2293);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LATERAL - 69)) | (1L << (WINDOW - 69)) | (1L << (OVER - 69)) | (1L << (PARTITION - 69)) | (1L << (RANGE - 69)) | (1L << (ROWS - 69)) | (1L << (UNBOUNDED - 69)) | (1L << (PRECEDING - 69)) | (1L << (FOLLOWING - 69)) | (1L << (CURRENT - 69)) | (1L << (ROW - 69)) | (1L << (WITH - 69)) | (1L << (VALUES - 69)) | (1L << (CREATE - 69)) | (1L << (TABLE - 69)) | (1L << (VIEW - 69)) | (1L << (REPLACE - 69)) | (1L << (INSERT - 69)) | (1L << (DELETE - 69)) | (1L << (INTO - 69)) | (1L << (DESCRIBE - 69)) | (1L << (EXPLAIN - 69)) | (1L << (FORMAT - 69)) | (1L << (LOGICAL - 69)) | (1L << (CODEGEN - 69)) | (1L << (CAST - 69)) | (1L << (SHOW - 69)) | (1L << (TABLES - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN - 69)) | (1L << (USE - 69)) | (1L << (PARTITIONS - 69)) | (1L << (FUNCTIONS - 69)) | (1L << (DROP - 69)) | (1L << (TO - 69)) | (1L << (TABLESAMPLE - 69)) | (1L << (STRATIFY - 69)) | (1L << (ALTER - 69)) | (1L << (RENAME - 69)) | (1L << (ARRAY - 69)) | (1L << (MAP - 69)) | (1L << (STRUCT - 69)) | (1L << (COMMENT - 69)) | (1L << (SET - 69)) | (1L << (RESET - 69)) | (1L << (DATA - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (COMMIT - 69)) | (1L << (ROLLBACK - 69)) | (1L << (MACRO - 69)) | (1L << (IF - 69)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DIV - 137)) | (1L << (PERCENTLIT - 137)) | (1L << (BUCKET - 137)) | (1L << (OUT - 137)) | (1L << (OF - 137)) | (1L << (SORT - 137)) | (1L << (CLUSTER - 137)) | (1L << (DISTRIBUTE - 137)) | (1L << (OVERWRITE - 137)) | (1L << (TRANSFORM - 137)) | (1L << (REDUCE - 137)) | (1L << (USING - 137)) | (1L << (SERDE - 137)) | (1L << (SERDEPROPERTIES - 137)) | (1L << (RECORDREADER - 137)) | (1L << (RECORDWRITER - 137)) | (1L << (DELIMITED - 137)) | (1L << (FIELDS - 137)) | (1L << (TERMINATED - 137)) | (1L << (COLLECTION - 137)) | (1L << (ITEMS - 137)) | (1L << (KEYS - 137)) | (1L << (ESCAPED - 137)) | (1L << (LINES - 137)) | (1L << (SEPARATED - 137)) | (1L << (FUNCTION - 137)) | (1L << (EXTENDED - 137)) | (1L << (REFRESH - 137)) | (1L << (CLEAR - 137)) | (1L << (CACHE - 137)) | (1L << (UNCACHE - 137)) | (1L << (LAZY - 137)) | (1L << (FORMATTED - 137)) | (1L << (TEMPORARY - 137)) | (1L << (OPTIONS - 137)) | (1L << (UNSET - 137)) | (1L << (TBLPROPERTIES - 137)) | (1L << (DBPROPERTIES - 137)) | (1L << (BUCKETS - 137)) | (1L << (SKEWED - 137)) | (1L << (STORED - 137)) | (1L << (DIRECTORIES - 137)) | (1L << (LOCATION - 137)) | (1L << (EXCHANGE - 137)) | (1L << (ARCHIVE - 137)) | (1L << (UNARCHIVE - 137)) | (1L << (FILEFORMAT - 137)) | (1L << (TOUCH - 137)) | (1L << (COMPACT - 137)) | (1L << (CONCATENATE - 137)) | (1L << (CHANGE - 137)) | (1L << (CASCADE - 137)) | (1L << (RESTRICT - 137)) | (1L << (CLUSTERED - 137)) | (1L << (SORTED - 137)) | (1L << (PURGE - 137)) | (1L << (INPUTFORMAT - 137)) | (1L << (OUTPUTFORMAT - 137)) | (1L << (DATABASE - 137)) | (1L << (DATABASES - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (DFS - 201)) | (1L << (TRUNCATE - 201)) | (1L << (ANALYZE - 201)) | (1L << (COMPUTE - 201)) | (1L << (LIST - 201)) | (1L << (STATISTICS - 201)) | (1L << (PARTITIONED - 201)) | (1L << (EXTERNAL - 201)) | (1L << (DEFINED - 201)) | (1L << (REVOKE - 201)) | (1L << (GRANT - 201)) | (1L << (LOCK - 201)) | (1L << (UNLOCK - 201)) | (1L << (MSCK - 201)) | (1L << (REPAIR - 201)) | (1L << (EXPORT - 201)) | (1L << (IMPORT - 201)) | (1L << (LOAD - 201)) | (1L << (ROLE - 201)) | (1L << (ROLES - 201)) | (1L << (COMPACTIONS - 201)) | (1L << (PRINCIPALS - 201)) | (1L << (TRANSACTIONS - 201)) | (1L << (INDEX - 201)) | (1L << (INDEXES - 201)) | (1L << (LOCKS - 201)) | (1L << (OPTION - 201)) | (1L << (LOCAL - 201)) | (1L << (INPATH - 201)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 52:
                return queryTerm_sempred((QueryTermContext) _localctx, predIndex);
            case 61:
                return relation_sempred((RelationContext) _localctx, predIndex);
            case 78:
                return booleanExpression_sempred((BooleanExpressionContext) _localctx, predIndex);
            case 81:
                return valueExpression_sempred((ValueExpressionContext) _localctx, predIndex);
            case 82:
                return primaryExpression_sempred((PrimaryExpressionContext) _localctx, predIndex);
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

    public static class RootContext extends ParserRuleContext {
        public RootContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EOF() {
            return getToken(SparkScriptSqlParser.EOF, 0);
        }

        public List<ActionStatementContext> actionStatement() {
            return getRuleContexts(ActionStatementContext.class);
        }

        public ActionStatementContext actionStatement(int i) {
            return getRuleContext(ActionStatementContext.class, i);
        }

        public List<FileAssignmentContext> fileAssignment() {
            return getRuleContexts(FileAssignmentContext.class);
        }

        public FileAssignmentContext fileAssignment(int i) {
            return getRuleContext(FileAssignmentContext.class, i);
        }

        public List<JsonQueryStatementAssignmentContext> jsonQueryStatementAssignment() {
            return getRuleContexts(JsonQueryStatementAssignmentContext.class);
        }

        public JsonQueryStatementAssignmentContext jsonQueryStatementAssignment(int i) {
            return getRuleContext(JsonQueryStatementAssignmentContext.class, i);
        }

        public List<StatementAssignmentContext> statementAssignment() {
            return getRuleContexts(StatementAssignmentContext.class);
        }

        public StatementAssignmentContext statementAssignment(int i) {
            return getRuleContext(StatementAssignmentContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_root;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterRoot(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitRoot(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitRoot(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class JsonQueryStatementAssignmentContext extends ParserRuleContext {
        public JsonQueryStatementAssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StatementAssignment_tableAliasContext statementAssignment_tableAlias() {
            return getRuleContext(StatementAssignment_tableAliasContext.class, 0);
        }

        public TerminalNode EQ() {
            return getToken(SparkScriptSqlParser.EQ, 0);
        }

        public TerminalNode JSON() {
            return getToken(SparkScriptSqlParser.JSON, 0);
        }

        public StatementAssignment_queryEngineContext statementAssignment_queryEngine() {
            return getRuleContext(StatementAssignment_queryEngineContext.class, 0);
        }

        public JsonQueryStatementAssignment_queryContext jsonQueryStatementAssignment_query() {
            return getRuleContext(JsonQueryStatementAssignment_queryContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_jsonQueryStatementAssignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterJsonQueryStatementAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitJsonQueryStatementAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitJsonQueryStatementAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class JsonQueryStatementAssignment_queryContext extends ParserRuleContext {
        public JsonQueryStatementAssignment_queryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public JsonObjectContext jsonObject() {
            return getRuleContext(JsonObjectContext.class, 0);
        }

        public List<ConfigSettingContext> configSetting() {
            return getRuleContexts(ConfigSettingContext.class);
        }

        public ConfigSettingContext configSetting(int i) {
            return getRuleContext(ConfigSettingContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_jsonQueryStatementAssignment_query;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterJsonQueryStatementAssignment_query(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitJsonQueryStatementAssignment_query(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitJsonQueryStatementAssignment_query(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementAssignmentContext extends ParserRuleContext {
        public StatementAssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StatementAssignment_tableAliasContext statementAssignment_tableAlias() {
            return getRuleContext(StatementAssignment_tableAliasContext.class, 0);
        }

        public TerminalNode EQ() {
            return getToken(SparkScriptSqlParser.EQ, 0);
        }

        public StatementAssignment_queryContext statementAssignment_query() {
            return getRuleContext(StatementAssignment_queryContext.class, 0);
        }

        public StatementAssignment_queryTypeContext statementAssignment_queryType() {
            return getRuleContext(StatementAssignment_queryTypeContext.class, 0);
        }

        public StatementAssignment_queryEngineContext statementAssignment_queryEngine() {
            return getRuleContext(StatementAssignment_queryEngineContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statementAssignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterStatementAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitStatementAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitStatementAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementAssignment_tableAliasContext extends ParserRuleContext {
        public StatementAssignment_tableAliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(SparkScriptSqlParser.IDENTIFIER, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statementAssignment_tableAlias;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterStatementAssignment_tableAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitStatementAssignment_tableAlias(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitStatementAssignment_tableAlias(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementAssignment_queryTypeContext extends ParserRuleContext {
        public StatementAssignment_queryTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statementAssignment_queryType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterStatementAssignment_queryType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitStatementAssignment_queryType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitStatementAssignment_queryType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementAssignment_queryEngineContext extends ParserRuleContext {
        public StatementAssignment_queryEngineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statementAssignment_queryEngine;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterStatementAssignment_queryEngine(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitStatementAssignment_queryEngine(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitStatementAssignment_queryEngine(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementAssignment_queryContext extends ParserRuleContext {
        public StatementAssignment_queryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public List<ConfigSettingContext> configSetting() {
            return getRuleContexts(ConfigSettingContext.class);
        }

        public ConfigSettingContext configSetting(int i) {
            return getRuleContext(ConfigSettingContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statementAssignment_query;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterStatementAssignment_query(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitStatementAssignment_query(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitStatementAssignment_query(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConfigSettingContext extends ParserRuleContext {
        public ConfigSettingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode SET() {
            return getToken(SparkScriptSqlParser.SET, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode EQ() {
            return getToken(SparkScriptSqlParser.EQ, 0);
        }

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_configSetting;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterConfigSetting(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitConfigSetting(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitConfigSetting(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FileAssignmentContext extends ParserRuleContext {
        public FileAssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FileAssignment_tableAliasContext fileAssignment_tableAlias() {
            return getRuleContext(FileAssignment_tableAliasContext.class, 0);
        }

        public TerminalNode EQ() {
            return getToken(SparkScriptSqlParser.EQ, 0);
        }

        public FileAssignment_fileTypeContext fileAssignment_fileType() {
            return getRuleContext(FileAssignment_fileTypeContext.class, 0);
        }

        public FileAssignment_fileLocationContext fileAssignment_fileLocation() {
            return getRuleContext(FileAssignment_fileLocationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fileAssignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterFileAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitFileAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitFileAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FileAssignment_tableAliasContext extends ParserRuleContext {
        public FileAssignment_tableAliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(SparkScriptSqlParser.IDENTIFIER, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fileAssignment_tableAlias;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterFileAssignment_tableAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitFileAssignment_tableAlias(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitFileAssignment_tableAlias(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FileAssignment_fileTypeContext extends ParserRuleContext {
        public FileAssignment_fileTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode JSON() {
            return getToken(SparkScriptSqlParser.JSON, 0);
        }

        public TerminalNode TEXT() {
            return getToken(SparkScriptSqlParser.TEXT, 0);
        }

        public TerminalNode CSV() {
            return getToken(SparkScriptSqlParser.CSV, 0);
        }

        public TerminalNode PARQUET() {
            return getToken(SparkScriptSqlParser.PARQUET, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fileAssignment_fileType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterFileAssignment_fileType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitFileAssignment_fileType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitFileAssignment_fileType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FileAssignment_fileLocationContext extends ParserRuleContext {
        public FileAssignment_fileLocationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public TerminalNode URL_STRING() {
            return getToken(SparkScriptSqlParser.URL_STRING, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fileAssignment_fileLocation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterFileAssignment_fileLocation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitFileAssignment_fileLocation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitFileAssignment_fileLocation(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ActionStatementContext extends ParserRuleContext {
        public ActionStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public List<ActionStatement_paramContext> actionStatement_param() {
            return getRuleContexts(ActionStatement_paramContext.class);
        }

        public ActionStatement_paramContext actionStatement_param(int i) {
            return getRuleContext(ActionStatement_paramContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_actionStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterActionStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitActionStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitActionStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ActionStatement_paramContext extends ParserRuleContext {
        public ActionStatement_paramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(SparkScriptSqlParser.IDENTIFIER, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_actionStatement_param;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterActionStatement_param(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitActionStatement_param(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitActionStatement_param(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class JsonObjectContext extends ParserRuleContext {
        public JsonObjectContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<JsonPairContext> jsonPair() {
            return getRuleContexts(JsonPairContext.class);
        }

        public JsonPairContext jsonPair(int i) {
            return getRuleContext(JsonPairContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_jsonObject;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterJsonObject(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitJsonObject(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitJsonObject(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class JsonArrayContext extends ParserRuleContext {
        public JsonArrayContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<JsonValueContext> jsonValue() {
            return getRuleContexts(JsonValueContext.class);
        }

        public JsonValueContext jsonValue(int i) {
            return getRuleContext(JsonValueContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_jsonArray;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterJsonArray(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitJsonArray(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitJsonArray(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class JsonPairContext extends ParserRuleContext {
        public JsonPairContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public JsonValueContext jsonValue() {
            return getRuleContext(JsonValueContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_jsonPair;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterJsonPair(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitJsonPair(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitJsonPair(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class JsonValueContext extends ParserRuleContext {
        public JsonValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public JsonObjectContext jsonObject() {
            return getRuleContext(JsonObjectContext.class, 0);
        }

        public JsonArrayContext jsonArray() {
            return getRuleContext(JsonArrayContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public NumberContext number() {
            return getRuleContext(NumberContext.class, 0);
        }

        public BooleanValueContext booleanValue() {
            return getRuleContext(BooleanValueContext.class, 0);
        }

        public TerminalNode NULL() {
            return getToken(SparkScriptSqlParser.NULL, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_jsonValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterJsonValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitJsonValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitJsonValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SingleStatementContext extends ParserRuleContext {
        public SingleStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(SparkScriptSqlParser.EOF, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singleStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSingleStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitSingleStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSingleStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SingleExpressionContext extends ParserRuleContext {
        public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public NamedExpressionContext namedExpression() {
            return getRuleContext(NamedExpressionContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(SparkScriptSqlParser.EOF, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singleExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSingleExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitSingleExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSingleExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SingleTableIdentifierContext extends ParserRuleContext {
        public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(SparkScriptSqlParser.EOF, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singleTableIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSingleTableIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitSingleTableIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSingleTableIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SingleDataTypeContext extends ParserRuleContext {
        public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public DataTypeContext dataType() {
            return getRuleContext(DataTypeContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(SparkScriptSqlParser.EOF, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singleDataType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSingleDataType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitSingleDataType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSingleDataType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StatementContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        public void copyFrom(StatementContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ExplainContext extends StatementContext {
        public ExplainContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode EXPLAIN() {
            return getToken(SparkScriptSqlParser.EXPLAIN, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public TerminalNode LOGICAL() {
            return getToken(SparkScriptSqlParser.LOGICAL, 0);
        }

        public TerminalNode FORMATTED() {
            return getToken(SparkScriptSqlParser.FORMATTED, 0);
        }

        public TerminalNode EXTENDED() {
            return getToken(SparkScriptSqlParser.EXTENDED, 0);
        }

        public TerminalNode CODEGEN() {
            return getToken(SparkScriptSqlParser.CODEGEN, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterExplain(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitExplain(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitExplain(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SetDatabasePropertiesContext extends StatementContext {
        public SetDatabasePropertiesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(SparkScriptSqlParser.DATABASE, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode SET() {
            return getToken(SparkScriptSqlParser.SET, 0);
        }

        public TerminalNode DBPROPERTIES() {
            return getToken(SparkScriptSqlParser.DBPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSetDatabaseProperties(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitSetDatabaseProperties(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSetDatabaseProperties(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DropDatabaseContext extends StatementContext {
        public DropDatabaseContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode DROP() {
            return getToken(SparkScriptSqlParser.DROP, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(SparkScriptSqlParser.DATABASE, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        public TerminalNode RESTRICT() {
            return getToken(SparkScriptSqlParser.RESTRICT, 0);
        }

        public TerminalNode CASCADE() {
            return getToken(SparkScriptSqlParser.CASCADE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterDropDatabase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitDropDatabase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDropDatabase(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CreateTableContext extends StatementContext {
        public ColTypeListContext columns;
        public ColTypeListContext partitionColumns;

        public CreateTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public CreateTableHeaderContext createTableHeader() {
            return getRuleContext(CreateTableHeaderContext.class, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SparkScriptSqlParser.COMMENT, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public TerminalNode PARTITIONED() {
            return getToken(SparkScriptSqlParser.PARTITIONED, 0);
        }

        public TerminalNode BY() {
            return getToken(SparkScriptSqlParser.BY, 0);
        }

        public BucketSpecContext bucketSpec() {
            return getRuleContext(BucketSpecContext.class, 0);
        }

        public SkewSpecContext skewSpec() {
            return getRuleContext(SkewSpecContext.class, 0);
        }

        public RowFormatContext rowFormat() {
            return getRuleContext(RowFormatContext.class, 0);
        }

        public CreateFileFormatContext createFileFormat() {
            return getRuleContext(CreateFileFormatContext.class, 0);
        }

        public LocationSpecContext locationSpec() {
            return getRuleContext(LocationSpecContext.class, 0);
        }

        public TerminalNode TBLPROPERTIES() {
            return getToken(SparkScriptSqlParser.TBLPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public List<ColTypeListContext> colTypeList() {
            return getRuleContexts(ColTypeListContext.class);
        }

        public ColTypeListContext colTypeList(int i) {
            return getRuleContext(ColTypeListContext.class, i);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterCreateTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitCreateTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCreateTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ResetConfigurationContext extends StatementContext {
        public ResetConfigurationContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode RESET() {
            return getToken(SparkScriptSqlParser.RESET, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterResetConfiguration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitResetConfiguration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitResetConfiguration(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DescribeDatabaseContext extends StatementContext {
        public DescribeDatabaseContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode DATABASE() {
            return getToken(SparkScriptSqlParser.DATABASE, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode DESC() {
            return getToken(SparkScriptSqlParser.DESC, 0);
        }

        public TerminalNode DESCRIBE() {
            return getToken(SparkScriptSqlParser.DESCRIBE, 0);
        }

        public TerminalNode EXTENDED() {
            return getToken(SparkScriptSqlParser.EXTENDED, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterDescribeDatabase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitDescribeDatabase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDescribeDatabase(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AlterViewQueryContext extends StatementContext {
        public AlterViewQueryContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SparkScriptSqlParser.VIEW, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterAlterViewQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitAlterViewQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitAlterViewQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DescribeTableContext extends StatementContext {
        public Token option;

        public DescribeTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode DESC() {
            return getToken(SparkScriptSqlParser.DESC, 0);
        }

        public TerminalNode DESCRIBE() {
            return getToken(SparkScriptSqlParser.DESCRIBE, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public DescribeColNameContext describeColName() {
            return getRuleContext(DescribeColNameContext.class, 0);
        }

        public TerminalNode EXTENDED() {
            return getToken(SparkScriptSqlParser.EXTENDED, 0);
        }

        public TerminalNode FORMATTED() {
            return getToken(SparkScriptSqlParser.FORMATTED, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterDescribeTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitDescribeTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDescribeTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UseContext extends StatementContext {
        public IdentifierContext db;

        public UseContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode USE() {
            return getToken(SparkScriptSqlParser.USE, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterUse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitUse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitUse(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CreateTempViewUsingContext extends StatementContext {
        public CreateTempViewUsingContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CREATE() {
            return getToken(SparkScriptSqlParser.CREATE, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SparkScriptSqlParser.TEMPORARY, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SparkScriptSqlParser.VIEW, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TableProviderContext tableProvider() {
            return getRuleContext(TableProviderContext.class, 0);
        }

        public TerminalNode OR() {
            return getToken(SparkScriptSqlParser.OR, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(SparkScriptSqlParser.REPLACE, 0);
        }

        public ColTypeListContext colTypeList() {
            return getRuleContext(ColTypeListContext.class, 0);
        }

        public TerminalNode OPTIONS() {
            return getToken(SparkScriptSqlParser.OPTIONS, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterCreateTempViewUsing(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitCreateTempViewUsing(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCreateTempViewUsing(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CreateTableLikeContext extends StatementContext {
        public TableIdentifierContext target;
        public TableIdentifierContext source;

        public CreateTableLikeContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CREATE() {
            return getToken(SparkScriptSqlParser.CREATE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SparkScriptSqlParser.LIKE, 0);
        }

        public List<TableIdentifierContext> tableIdentifier() {
            return getRuleContexts(TableIdentifierContext.class);
        }

        public TableIdentifierContext tableIdentifier(int i) {
            return getRuleContext(TableIdentifierContext.class, i);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SparkScriptSqlParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterCreateTableLike(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitCreateTableLike(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCreateTableLike(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RenameTableContext extends StatementContext {
        public TableIdentifierContext from;
        public TableIdentifierContext to;

        public RenameTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TerminalNode RENAME() {
            return getToken(SparkScriptSqlParser.RENAME, 0);
        }

        public TerminalNode TO() {
            return getToken(SparkScriptSqlParser.TO, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SparkScriptSqlParser.VIEW, 0);
        }

        public List<TableIdentifierContext> tableIdentifier() {
            return getRuleContexts(TableIdentifierContext.class);
        }

        public TableIdentifierContext tableIdentifier(int i) {
            return getRuleContext(TableIdentifierContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterRenameTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitRenameTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitRenameTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UncacheTableContext extends StatementContext {
        public UncacheTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode UNCACHE() {
            return getToken(SparkScriptSqlParser.UNCACHE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterUncacheTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitUncacheTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitUncacheTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DropFunctionContext extends StatementContext {
        public DropFunctionContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode DROP() {
            return getToken(SparkScriptSqlParser.DROP, 0);
        }

        public TerminalNode FUNCTION() {
            return getToken(SparkScriptSqlParser.FUNCTION, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SparkScriptSqlParser.TEMPORARY, 0);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterDropFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitDropFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDropFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FailNativeCommandContext extends StatementContext {
        public FailNativeCommandContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SET() {
            return getToken(SparkScriptSqlParser.SET, 0);
        }

        public TerminalNode ROLE() {
            return getToken(SparkScriptSqlParser.ROLE, 0);
        }

        public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
            return getRuleContext(UnsupportedHiveNativeCommandsContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterFailNativeCommand(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitFailNativeCommand(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitFailNativeCommand(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LoadDataContext extends StatementContext {
        public Token path;

        public LoadDataContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode LOAD() {
            return getToken(SparkScriptSqlParser.LOAD, 0);
        }

        public TerminalNode DATA() {
            return getToken(SparkScriptSqlParser.DATA, 0);
        }

        public TerminalNode INPATH() {
            return getToken(SparkScriptSqlParser.INPATH, 0);
        }

        public TerminalNode INTO() {
            return getToken(SparkScriptSqlParser.INTO, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public TerminalNode LOCAL() {
            return getToken(SparkScriptSqlParser.LOCAL, 0);
        }

        public TerminalNode OVERWRITE() {
            return getToken(SparkScriptSqlParser.OVERWRITE, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterLoadData(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitLoadData(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitLoadData(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ShowPartitionsContext extends StatementContext {
        public ShowPartitionsContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SHOW() {
            return getToken(SparkScriptSqlParser.SHOW, 0);
        }

        public TerminalNode PARTITIONS() {
            return getToken(SparkScriptSqlParser.PARTITIONS, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterShowPartitions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitShowPartitions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitShowPartitions(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DescribeFunctionContext extends StatementContext {
        public DescribeFunctionContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode FUNCTION() {
            return getToken(SparkScriptSqlParser.FUNCTION, 0);
        }

        public DescribeFuncNameContext describeFuncName() {
            return getRuleContext(DescribeFuncNameContext.class, 0);
        }

        public TerminalNode DESC() {
            return getToken(SparkScriptSqlParser.DESC, 0);
        }

        public TerminalNode DESCRIBE() {
            return getToken(SparkScriptSqlParser.DESCRIBE, 0);
        }

        public TerminalNode EXTENDED() {
            return getToken(SparkScriptSqlParser.EXTENDED, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterDescribeFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitDescribeFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDescribeFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ClearCacheContext extends StatementContext {
        public ClearCacheContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CLEAR() {
            return getToken(SparkScriptSqlParser.CLEAR, 0);
        }

        public TerminalNode CACHE() {
            return getToken(SparkScriptSqlParser.CACHE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterClearCache(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitClearCache(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitClearCache(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ShowTablesContext extends StatementContext {
        public IdentifierContext db;
        public Token pattern;

        public ShowTablesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SHOW() {
            return getToken(SparkScriptSqlParser.SHOW, 0);
        }

        public TerminalNode TABLES() {
            return getToken(SparkScriptSqlParser.TABLES, 0);
        }

        public TerminalNode FROM() {
            return getToken(SparkScriptSqlParser.FROM, 0);
        }

        public TerminalNode IN() {
            return getToken(SparkScriptSqlParser.IN, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SparkScriptSqlParser.LIKE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterShowTables(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitShowTables(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitShowTables(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementDefaultContext extends StatementContext {
        public StatementDefaultContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterStatementDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitStatementDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitStatementDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RenameTablePartitionContext extends StatementContext {
        public PartitionSpecContext from;
        public PartitionSpecContext to;

        public RenameTablePartitionContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode RENAME() {
            return getToken(SparkScriptSqlParser.RENAME, 0);
        }

        public TerminalNode TO() {
            return getToken(SparkScriptSqlParser.TO, 0);
        }

        public List<PartitionSpecContext> partitionSpec() {
            return getRuleContexts(PartitionSpecContext.class);
        }

        public PartitionSpecContext partitionSpec(int i) {
            return getRuleContext(PartitionSpecContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterRenameTablePartition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitRenameTablePartition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitRenameTablePartition(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RefreshResourceContext extends StatementContext {
        public RefreshResourceContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode REFRESH() {
            return getToken(SparkScriptSqlParser.REFRESH, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterRefreshResource(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitRefreshResource(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitRefreshResource(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TruncateTableContext extends StatementContext {
        public TruncateTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode TRUNCATE() {
            return getToken(SparkScriptSqlParser.TRUNCATE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterTruncateTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitTruncateTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTruncateTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SetTableSerDeContext extends StatementContext {
        public SetTableSerDeContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode SET() {
            return getToken(SparkScriptSqlParser.SET, 0);
        }

        public TerminalNode SERDE() {
            return getToken(SparkScriptSqlParser.SERDE, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public TerminalNode WITH() {
            return getToken(SparkScriptSqlParser.WITH, 0);
        }

        public TerminalNode SERDEPROPERTIES() {
            return getToken(SparkScriptSqlParser.SERDEPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSetTableSerDe(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitSetTableSerDe(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSetTableSerDe(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CreateViewContext extends StatementContext {
        public CreateViewContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CREATE() {
            return getToken(SparkScriptSqlParser.CREATE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SparkScriptSqlParser.VIEW, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode OR() {
            return getToken(SparkScriptSqlParser.OR, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(SparkScriptSqlParser.REPLACE, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SparkScriptSqlParser.TEMPORARY, 0);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SparkScriptSqlParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        public IdentifierCommentListContext identifierCommentList() {
            return getRuleContext(IdentifierCommentListContext.class, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SparkScriptSqlParser.COMMENT, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public TerminalNode PARTITIONED() {
            return getToken(SparkScriptSqlParser.PARTITIONED, 0);
        }

        public TerminalNode ON() {
            return getToken(SparkScriptSqlParser.ON, 0);
        }

        public IdentifierListContext identifierList() {
            return getRuleContext(IdentifierListContext.class, 0);
        }

        public TerminalNode TBLPROPERTIES() {
            return getToken(SparkScriptSqlParser.TBLPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterCreateView(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitCreateView(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCreateView(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DropTablePartitionsContext extends StatementContext {
        public DropTablePartitionsContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode DROP() {
            return getToken(SparkScriptSqlParser.DROP, 0);
        }

        public List<PartitionSpecContext> partitionSpec() {
            return getRuleContexts(PartitionSpecContext.class);
        }

        public PartitionSpecContext partitionSpec(int i) {
            return getRuleContext(PartitionSpecContext.class, i);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        public TerminalNode PURGE() {
            return getToken(SparkScriptSqlParser.PURGE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SparkScriptSqlParser.VIEW, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterDropTablePartitions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitDropTablePartitions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDropTablePartitions(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ShowCreateTableContext extends StatementContext {
        public ShowCreateTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SHOW() {
            return getToken(SparkScriptSqlParser.SHOW, 0);
        }

        public TerminalNode CREATE() {
            return getToken(SparkScriptSqlParser.CREATE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterShowCreateTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitShowCreateTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitShowCreateTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SetConfigurationContext extends StatementContext {
        public SetConfigurationContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SET() {
            return getToken(SparkScriptSqlParser.SET, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSetConfiguration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitSetConfiguration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSetConfiguration(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DropTableContext extends StatementContext {
        public DropTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode DROP() {
            return getToken(SparkScriptSqlParser.DROP, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        public TerminalNode PURGE() {
            return getToken(SparkScriptSqlParser.PURGE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SparkScriptSqlParser.VIEW, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterDropTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitDropTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDropTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ShowColumnsContext extends StatementContext {
        public IdentifierContext db;

        public ShowColumnsContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SHOW() {
            return getToken(SparkScriptSqlParser.SHOW, 0);
        }

        public TerminalNode COLUMNS() {
            return getToken(SparkScriptSqlParser.COLUMNS, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public List<TerminalNode> FROM() {
            return getTokens(SparkScriptSqlParser.FROM);
        }

        public TerminalNode FROM(int i) {
            return getToken(SparkScriptSqlParser.FROM, i);
        }

        public List<TerminalNode> IN() {
            return getTokens(SparkScriptSqlParser.IN);
        }

        public TerminalNode IN(int i) {
            return getToken(SparkScriptSqlParser.IN, i);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterShowColumns(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitShowColumns(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitShowColumns(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CreateTableUsingContext extends StatementContext {
        public IdentifierListContext partitionColumnNames;

        public CreateTableUsingContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public CreateTableHeaderContext createTableHeader() {
            return getRuleContext(CreateTableHeaderContext.class, 0);
        }

        public TableProviderContext tableProvider() {
            return getRuleContext(TableProviderContext.class, 0);
        }

        public ColTypeListContext colTypeList() {
            return getRuleContext(ColTypeListContext.class, 0);
        }

        public TerminalNode OPTIONS() {
            return getToken(SparkScriptSqlParser.OPTIONS, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public TerminalNode PARTITIONED() {
            return getToken(SparkScriptSqlParser.PARTITIONED, 0);
        }

        public TerminalNode BY() {
            return getToken(SparkScriptSqlParser.BY, 0);
        }

        public BucketSpecContext bucketSpec() {
            return getRuleContext(BucketSpecContext.class, 0);
        }

        public IdentifierListContext identifierList() {
            return getRuleContext(IdentifierListContext.class, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterCreateTableUsing(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitCreateTableUsing(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCreateTableUsing(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ShowDatabasesContext extends StatementContext {
        public Token pattern;

        public ShowDatabasesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SHOW() {
            return getToken(SparkScriptSqlParser.SHOW, 0);
        }

        public TerminalNode DATABASES() {
            return getToken(SparkScriptSqlParser.DATABASES, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SparkScriptSqlParser.LIKE, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterShowDatabases(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitShowDatabases(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitShowDatabases(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AddTablePartitionContext extends StatementContext {
        public AddTablePartitionContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode ADD() {
            return getToken(SparkScriptSqlParser.ADD, 0);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SparkScriptSqlParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        public List<PartitionSpecLocationContext> partitionSpecLocation() {
            return getRuleContexts(PartitionSpecLocationContext.class);
        }

        public PartitionSpecLocationContext partitionSpecLocation(int i) {
            return getRuleContext(PartitionSpecLocationContext.class, i);
        }

        public TerminalNode VIEW() {
            return getToken(SparkScriptSqlParser.VIEW, 0);
        }

        public List<PartitionSpecContext> partitionSpec() {
            return getRuleContexts(PartitionSpecContext.class);
        }

        public PartitionSpecContext partitionSpec(int i) {
            return getRuleContext(PartitionSpecContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterAddTablePartition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitAddTablePartition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitAddTablePartition(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RefreshTableContext extends StatementContext {
        public RefreshTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode REFRESH() {
            return getToken(SparkScriptSqlParser.REFRESH, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterRefreshTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitRefreshTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitRefreshTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ManageResourceContext extends StatementContext {
        public Token op;

        public ManageResourceContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode ADD() {
            return getToken(SparkScriptSqlParser.ADD, 0);
        }

        public TerminalNode LIST() {
            return getToken(SparkScriptSqlParser.LIST, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterManageResource(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitManageResource(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitManageResource(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CreateDatabaseContext extends StatementContext {
        public Token comment;

        public CreateDatabaseContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CREATE() {
            return getToken(SparkScriptSqlParser.CREATE, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(SparkScriptSqlParser.DATABASE, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SparkScriptSqlParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SparkScriptSqlParser.COMMENT, 0);
        }

        public LocationSpecContext locationSpec() {
            return getRuleContext(LocationSpecContext.class, 0);
        }

        public TerminalNode WITH() {
            return getToken(SparkScriptSqlParser.WITH, 0);
        }

        public TerminalNode DBPROPERTIES() {
            return getToken(SparkScriptSqlParser.DBPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterCreateDatabase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitCreateDatabase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCreateDatabase(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ShowTblPropertiesContext extends StatementContext {
        public TableIdentifierContext table;
        public TablePropertyKeyContext key;

        public ShowTblPropertiesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SHOW() {
            return getToken(SparkScriptSqlParser.SHOW, 0);
        }

        public TerminalNode TBLPROPERTIES() {
            return getToken(SparkScriptSqlParser.TBLPROPERTIES, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TablePropertyKeyContext tablePropertyKey() {
            return getRuleContext(TablePropertyKeyContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterShowTblProperties(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitShowTblProperties(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitShowTblProperties(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AnalyzeContext extends StatementContext {
        public AnalyzeContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ANALYZE() {
            return getToken(SparkScriptSqlParser.ANALYZE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode COMPUTE() {
            return getToken(SparkScriptSqlParser.COMPUTE, 0);
        }

        public TerminalNode STATISTICS() {
            return getToken(SparkScriptSqlParser.STATISTICS, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode FOR() {
            return getToken(SparkScriptSqlParser.FOR, 0);
        }

        public TerminalNode COLUMNS() {
            return getToken(SparkScriptSqlParser.COLUMNS, 0);
        }

        public IdentifierSeqContext identifierSeq() {
            return getRuleContext(IdentifierSeqContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterAnalyze(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitAnalyze(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitAnalyze(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UnsetTablePropertiesContext extends StatementContext {
        public UnsetTablePropertiesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode UNSET() {
            return getToken(SparkScriptSqlParser.UNSET, 0);
        }

        public TerminalNode TBLPROPERTIES() {
            return getToken(SparkScriptSqlParser.TBLPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SparkScriptSqlParser.VIEW, 0);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterUnsetTableProperties(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitUnsetTableProperties(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitUnsetTableProperties(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SetTableLocationContext extends StatementContext {
        public SetTableLocationContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode SET() {
            return getToken(SparkScriptSqlParser.SET, 0);
        }

        public LocationSpecContext locationSpec() {
            return getRuleContext(LocationSpecContext.class, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSetTableLocation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitSetTableLocation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSetTableLocation(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CreateFunctionContext extends StatementContext {
        public Token className;

        public CreateFunctionContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CREATE() {
            return getToken(SparkScriptSqlParser.CREATE, 0);
        }

        public TerminalNode FUNCTION() {
            return getToken(SparkScriptSqlParser.FUNCTION, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SparkScriptSqlParser.TEMPORARY, 0);
        }

        public TerminalNode USING() {
            return getToken(SparkScriptSqlParser.USING, 0);
        }

        public List<ResourceContext> resource() {
            return getRuleContexts(ResourceContext.class);
        }

        public ResourceContext resource(int i) {
            return getRuleContext(ResourceContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterCreateFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitCreateFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCreateFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ShowFunctionsContext extends StatementContext {
        public Token pattern;

        public ShowFunctionsContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SHOW() {
            return getToken(SparkScriptSqlParser.SHOW, 0);
        }

        public TerminalNode FUNCTIONS() {
            return getToken(SparkScriptSqlParser.FUNCTIONS, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SparkScriptSqlParser.LIKE, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterShowFunctions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitShowFunctions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitShowFunctions(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CacheTableContext extends StatementContext {
        public CacheTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CACHE() {
            return getToken(SparkScriptSqlParser.CACHE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode LAZY() {
            return getToken(SparkScriptSqlParser.LAZY, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterCacheTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitCacheTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCacheTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SetTablePropertiesContext extends StatementContext {
        public SetTablePropertiesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode SET() {
            return getToken(SparkScriptSqlParser.SET, 0);
        }

        public TerminalNode TBLPROPERTIES() {
            return getToken(SparkScriptSqlParser.TBLPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SparkScriptSqlParser.VIEW, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSetTableProperties(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitSetTableProperties(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSetTableProperties(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
        public Token kw1;
        public Token kw2;
        public Token kw3;
        public Token kw4;
        public Token kw5;
        public Token kw6;

        public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CREATE() {
            return getToken(SparkScriptSqlParser.CREATE, 0);
        }

        public TerminalNode ROLE() {
            return getToken(SparkScriptSqlParser.ROLE, 0);
        }

        public TerminalNode DROP() {
            return getToken(SparkScriptSqlParser.DROP, 0);
        }

        public TerminalNode GRANT() {
            return getToken(SparkScriptSqlParser.GRANT, 0);
        }

        public TerminalNode REVOKE() {
            return getToken(SparkScriptSqlParser.REVOKE, 0);
        }

        public TerminalNode SHOW() {
            return getToken(SparkScriptSqlParser.SHOW, 0);
        }

        public TerminalNode PRINCIPALS() {
            return getToken(SparkScriptSqlParser.PRINCIPALS, 0);
        }

        public TerminalNode ROLES() {
            return getToken(SparkScriptSqlParser.ROLES, 0);
        }

        public TerminalNode CURRENT() {
            return getToken(SparkScriptSqlParser.CURRENT, 0);
        }

        public TerminalNode EXPORT() {
            return getToken(SparkScriptSqlParser.EXPORT, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TerminalNode IMPORT() {
            return getToken(SparkScriptSqlParser.IMPORT, 0);
        }

        public TerminalNode COMPACTIONS() {
            return getToken(SparkScriptSqlParser.COMPACTIONS, 0);
        }

        public TerminalNode TRANSACTIONS() {
            return getToken(SparkScriptSqlParser.TRANSACTIONS, 0);
        }

        public TerminalNode INDEXES() {
            return getToken(SparkScriptSqlParser.INDEXES, 0);
        }

        public TerminalNode LOCKS() {
            return getToken(SparkScriptSqlParser.LOCKS, 0);
        }

        public TerminalNode INDEX() {
            return getToken(SparkScriptSqlParser.INDEX, 0);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TerminalNode LOCK() {
            return getToken(SparkScriptSqlParser.LOCK, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(SparkScriptSqlParser.DATABASE, 0);
        }

        public TerminalNode UNLOCK() {
            return getToken(SparkScriptSqlParser.UNLOCK, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SparkScriptSqlParser.TEMPORARY, 0);
        }

        public TerminalNode MACRO() {
            return getToken(SparkScriptSqlParser.MACRO, 0);
        }

        public TerminalNode MSCK() {
            return getToken(SparkScriptSqlParser.MSCK, 0);
        }

        public TerminalNode REPAIR() {
            return getToken(SparkScriptSqlParser.REPAIR, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode NOT() {
            return getToken(SparkScriptSqlParser.NOT, 0);
        }

        public TerminalNode CLUSTERED() {
            return getToken(SparkScriptSqlParser.CLUSTERED, 0);
        }

        public TerminalNode BY() {
            return getToken(SparkScriptSqlParser.BY, 0);
        }

        public TerminalNode SORTED() {
            return getToken(SparkScriptSqlParser.SORTED, 0);
        }

        public TerminalNode SKEWED() {
            return getToken(SparkScriptSqlParser.SKEWED, 0);
        }

        public TerminalNode STORED() {
            return getToken(SparkScriptSqlParser.STORED, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        public TerminalNode DIRECTORIES() {
            return getToken(SparkScriptSqlParser.DIRECTORIES, 0);
        }

        public TerminalNode SET() {
            return getToken(SparkScriptSqlParser.SET, 0);
        }

        public TerminalNode LOCATION() {
            return getToken(SparkScriptSqlParser.LOCATION, 0);
        }

        public TerminalNode EXCHANGE() {
            return getToken(SparkScriptSqlParser.EXCHANGE, 0);
        }

        public TerminalNode PARTITION() {
            return getToken(SparkScriptSqlParser.PARTITION, 0);
        }

        public TerminalNode ARCHIVE() {
            return getToken(SparkScriptSqlParser.ARCHIVE, 0);
        }

        public TerminalNode UNARCHIVE() {
            return getToken(SparkScriptSqlParser.UNARCHIVE, 0);
        }

        public TerminalNode TOUCH() {
            return getToken(SparkScriptSqlParser.TOUCH, 0);
        }

        public TerminalNode COMPACT() {
            return getToken(SparkScriptSqlParser.COMPACT, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public TerminalNode CONCATENATE() {
            return getToken(SparkScriptSqlParser.CONCATENATE, 0);
        }

        public TerminalNode FILEFORMAT() {
            return getToken(SparkScriptSqlParser.FILEFORMAT, 0);
        }

        public TerminalNode ADD() {
            return getToken(SparkScriptSqlParser.ADD, 0);
        }

        public TerminalNode COLUMNS() {
            return getToken(SparkScriptSqlParser.COLUMNS, 0);
        }

        public TerminalNode CHANGE() {
            return getToken(SparkScriptSqlParser.CHANGE, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(SparkScriptSqlParser.REPLACE, 0);
        }

        public TerminalNode START() {
            return getToken(SparkScriptSqlParser.START, 0);
        }

        public TerminalNode TRANSACTION() {
            return getToken(SparkScriptSqlParser.TRANSACTION, 0);
        }

        public TerminalNode COMMIT() {
            return getToken(SparkScriptSqlParser.COMMIT, 0);
        }

        public TerminalNode ROLLBACK() {
            return getToken(SparkScriptSqlParser.ROLLBACK, 0);
        }

        public TerminalNode DFS() {
            return getToken(SparkScriptSqlParser.DFS, 0);
        }

        public TerminalNode DELETE() {
            return getToken(SparkScriptSqlParser.DELETE, 0);
        }

        public TerminalNode FROM() {
            return getToken(SparkScriptSqlParser.FROM, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unsupportedHiveNativeCommands;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterUnsupportedHiveNativeCommands(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitUnsupportedHiveNativeCommands(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitUnsupportedHiveNativeCommands(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CreateTableHeaderContext extends ParserRuleContext {
        public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CREATE() {
            return getToken(SparkScriptSqlParser.CREATE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SparkScriptSqlParser.TEMPORARY, 0);
        }

        public TerminalNode EXTERNAL() {
            return getToken(SparkScriptSqlParser.EXTERNAL, 0);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SparkScriptSqlParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_createTableHeader;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterCreateTableHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitCreateTableHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCreateTableHeader(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BucketSpecContext extends ParserRuleContext {
        public BucketSpecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CLUSTERED() {
            return getToken(SparkScriptSqlParser.CLUSTERED, 0);
        }

        public List<TerminalNode> BY() {
            return getTokens(SparkScriptSqlParser.BY);
        }

        public TerminalNode BY(int i) {
            return getToken(SparkScriptSqlParser.BY, i);
        }

        public IdentifierListContext identifierList() {
            return getRuleContext(IdentifierListContext.class, 0);
        }

        public TerminalNode INTO() {
            return getToken(SparkScriptSqlParser.INTO, 0);
        }

        public TerminalNode INTEGER_VALUE() {
            return getToken(SparkScriptSqlParser.INTEGER_VALUE, 0);
        }

        public TerminalNode BUCKETS() {
            return getToken(SparkScriptSqlParser.BUCKETS, 0);
        }

        public TerminalNode SORTED() {
            return getToken(SparkScriptSqlParser.SORTED, 0);
        }

        public OrderedIdentifierListContext orderedIdentifierList() {
            return getRuleContext(OrderedIdentifierListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bucketSpec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterBucketSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitBucketSpec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitBucketSpec(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SkewSpecContext extends ParserRuleContext {
        public SkewSpecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode SKEWED() {
            return getToken(SparkScriptSqlParser.SKEWED, 0);
        }

        public TerminalNode BY() {
            return getToken(SparkScriptSqlParser.BY, 0);
        }

        public IdentifierListContext identifierList() {
            return getRuleContext(IdentifierListContext.class, 0);
        }

        public TerminalNode ON() {
            return getToken(SparkScriptSqlParser.ON, 0);
        }

        public ConstantListContext constantList() {
            return getRuleContext(ConstantListContext.class, 0);
        }

        public NestedConstantListContext nestedConstantList() {
            return getRuleContext(NestedConstantListContext.class, 0);
        }

        public TerminalNode STORED() {
            return getToken(SparkScriptSqlParser.STORED, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        public TerminalNode DIRECTORIES() {
            return getToken(SparkScriptSqlParser.DIRECTORIES, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_skewSpec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterSkewSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitSkewSpec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSkewSpec(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LocationSpecContext extends ParserRuleContext {
        public LocationSpecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode LOCATION() {
            return getToken(SparkScriptSqlParser.LOCATION, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_locationSpec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterLocationSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitLocationSpec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitLocationSpec(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class QueryContext extends ParserRuleContext {
        public QueryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public QueryNoWithContext queryNoWith() {
            return getRuleContext(QueryNoWithContext.class, 0);
        }

        public CtesContext ctes() {
            return getRuleContext(CtesContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_query;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InsertIntoContext extends ParserRuleContext {
        public InsertIntoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INSERT() {
            return getToken(SparkScriptSqlParser.INSERT, 0);
        }

        public TerminalNode OVERWRITE() {
            return getToken(SparkScriptSqlParser.OVERWRITE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SparkScriptSqlParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        public TerminalNode INTO() {
            return getToken(SparkScriptSqlParser.INTO, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_insertInto;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterInsertInto(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitInsertInto(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitInsertInto(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PartitionSpecLocationContext extends ParserRuleContext {
        public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public LocationSpecContext locationSpec() {
            return getRuleContext(LocationSpecContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_partitionSpecLocation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterPartitionSpecLocation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitPartitionSpecLocation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitPartitionSpecLocation(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PartitionSpecContext extends ParserRuleContext {
        public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PARTITION() {
            return getToken(SparkScriptSqlParser.PARTITION, 0);
        }

        public List<PartitionValContext> partitionVal() {
            return getRuleContexts(PartitionValContext.class);
        }

        public PartitionValContext partitionVal(int i) {
            return getRuleContext(PartitionValContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_partitionSpec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterPartitionSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitPartitionSpec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitPartitionSpec(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PartitionValContext extends ParserRuleContext {
        public PartitionValContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode EQ() {
            return getToken(SparkScriptSqlParser.EQ, 0);
        }

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_partitionVal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterPartitionVal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitPartitionVal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitPartitionVal(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DescribeFuncNameContext extends ParserRuleContext {
        public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public ComparisonOperatorContext comparisonOperator() {
            return getRuleContext(ComparisonOperatorContext.class, 0);
        }

        public ArithmeticOperatorContext arithmeticOperator() {
            return getRuleContext(ArithmeticOperatorContext.class, 0);
        }

        public PredicateOperatorContext predicateOperator() {
            return getRuleContext(PredicateOperatorContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_describeFuncName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterDescribeFuncName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitDescribeFuncName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDescribeFuncName(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DescribeColNameContext extends ParserRuleContext {
        public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public List<TerminalNode> STRING() {
            return getTokens(SparkScriptSqlParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(SparkScriptSqlParser.STRING, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_describeColName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterDescribeColName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitDescribeColName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDescribeColName(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CtesContext extends ParserRuleContext {
        public CtesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode WITH() {
            return getToken(SparkScriptSqlParser.WITH, 0);
        }

        public List<NamedQueryContext> namedQuery() {
            return getRuleContexts(NamedQueryContext.class);
        }

        public NamedQueryContext namedQuery(int i) {
            return getRuleContext(NamedQueryContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ctes;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterCtes(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitCtes(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCtes(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NamedQueryContext extends ParserRuleContext {
        public IdentifierContext name;

        public NamedQueryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public QueryNoWithContext queryNoWith() {
            return getRuleContext(QueryNoWithContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namedQuery;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterNamedQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitNamedQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitNamedQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TableProviderContext extends ParserRuleContext {
        public TableProviderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode USING() {
            return getToken(SparkScriptSqlParser.USING, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableProvider;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterTableProvider(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitTableProvider(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTableProvider(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TablePropertyListContext extends ParserRuleContext {
        public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TablePropertyContext> tableProperty() {
            return getRuleContexts(TablePropertyContext.class);
        }

        public TablePropertyContext tableProperty(int i) {
            return getRuleContext(TablePropertyContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tablePropertyList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterTablePropertyList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitTablePropertyList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTablePropertyList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TablePropertyContext extends ParserRuleContext {
        public TablePropertyKeyContext key;
        public TablePropertyValueContext value;

        public TablePropertyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TablePropertyKeyContext tablePropertyKey() {
            return getRuleContext(TablePropertyKeyContext.class, 0);
        }

        public TablePropertyValueContext tablePropertyValue() {
            return getRuleContext(TablePropertyValueContext.class, 0);
        }

        public TerminalNode EQ() {
            return getToken(SparkScriptSqlParser.EQ, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableProperty;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterTableProperty(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitTableProperty(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTableProperty(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TablePropertyKeyContext extends ParserRuleContext {
        public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tablePropertyKey;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterTablePropertyKey(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitTablePropertyKey(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTablePropertyKey(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TablePropertyValueContext extends ParserRuleContext {
        public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INTEGER_VALUE() {
            return getToken(SparkScriptSqlParser.INTEGER_VALUE, 0);
        }

        public TerminalNode DECIMAL_VALUE() {
            return getToken(SparkScriptSqlParser.DECIMAL_VALUE, 0);
        }

        public BooleanValueContext booleanValue() {
            return getRuleContext(BooleanValueContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tablePropertyValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterTablePropertyValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitTablePropertyValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTablePropertyValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConstantListContext extends ParserRuleContext {
        public ConstantListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ConstantContext> constant() {
            return getRuleContexts(ConstantContext.class);
        }

        public ConstantContext constant(int i) {
            return getRuleContext(ConstantContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constantList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterConstantList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitConstantList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitConstantList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NestedConstantListContext extends ParserRuleContext {
        public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ConstantListContext> constantList() {
            return getRuleContexts(ConstantListContext.class);
        }

        public ConstantListContext constantList(int i) {
            return getRuleContext(ConstantListContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nestedConstantList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterNestedConstantList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitNestedConstantList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitNestedConstantList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CreateFileFormatContext extends ParserRuleContext {
        public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode STORED() {
            return getToken(SparkScriptSqlParser.STORED, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        public FileFormatContext fileFormat() {
            return getRuleContext(FileFormatContext.class, 0);
        }

        public TerminalNode BY() {
            return getToken(SparkScriptSqlParser.BY, 0);
        }

        public StorageHandlerContext storageHandler() {
            return getRuleContext(StorageHandlerContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_createFileFormat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterCreateFileFormat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitCreateFileFormat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCreateFileFormat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FileFormatContext extends ParserRuleContext {
        public FileFormatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FileFormatContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_fileFormat;
        }

        public void copyFrom(FileFormatContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class TableFileFormatContext extends FileFormatContext {
        public Token inFmt;
        public Token outFmt;

        public TableFileFormatContext(FileFormatContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode INPUTFORMAT() {
            return getToken(SparkScriptSqlParser.INPUTFORMAT, 0);
        }

        public TerminalNode OUTPUTFORMAT() {
            return getToken(SparkScriptSqlParser.OUTPUTFORMAT, 0);
        }

        public List<TerminalNode> STRING() {
            return getTokens(SparkScriptSqlParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(SparkScriptSqlParser.STRING, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterTableFileFormat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitTableFileFormat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTableFileFormat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class GenericFileFormatContext extends FileFormatContext {
        public GenericFileFormatContext(FileFormatContext ctx) {
            copyFrom(ctx);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterGenericFileFormat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitGenericFileFormat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitGenericFileFormat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StorageHandlerContext extends ParserRuleContext {
        public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public TerminalNode WITH() {
            return getToken(SparkScriptSqlParser.WITH, 0);
        }

        public TerminalNode SERDEPROPERTIES() {
            return getToken(SparkScriptSqlParser.SERDEPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_storageHandler;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterStorageHandler(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitStorageHandler(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitStorageHandler(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ResourceContext extends ParserRuleContext {
        public ResourceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resource;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterResource(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitResource(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitResource(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class QueryNoWithContext extends ParserRuleContext {
        public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public QueryNoWithContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_queryNoWith;
        }

        public void copyFrom(QueryNoWithContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class SingleInsertQueryContext extends QueryNoWithContext {
        public SingleInsertQueryContext(QueryNoWithContext ctx) {
            copyFrom(ctx);
        }

        public QueryTermContext queryTerm() {
            return getRuleContext(QueryTermContext.class, 0);
        }

        public QueryOrganizationContext queryOrganization() {
            return getRuleContext(QueryOrganizationContext.class, 0);
        }

        public InsertIntoContext insertInto() {
            return getRuleContext(InsertIntoContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSingleInsertQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitSingleInsertQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSingleInsertQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MultiInsertQueryContext extends QueryNoWithContext {
        public MultiInsertQueryContext(QueryNoWithContext ctx) {
            copyFrom(ctx);
        }

        public FromClauseContext fromClause() {
            return getRuleContext(FromClauseContext.class, 0);
        }

        public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
            return getRuleContexts(MultiInsertQueryBodyContext.class);
        }

        public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
            return getRuleContext(MultiInsertQueryBodyContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterMultiInsertQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitMultiInsertQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitMultiInsertQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class QueryOrganizationContext extends ParserRuleContext {
        public SortItemContext sortItem;
        public List<SortItemContext> order = new ArrayList<SortItemContext>();
        public ExpressionContext expression;
        public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
        public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
        public List<SortItemContext> sort = new ArrayList<SortItemContext>();
        public ExpressionContext limit;

        public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ORDER() {
            return getToken(SparkScriptSqlParser.ORDER, 0);
        }

        public List<TerminalNode> BY() {
            return getTokens(SparkScriptSqlParser.BY);
        }

        public TerminalNode BY(int i) {
            return getToken(SparkScriptSqlParser.BY, i);
        }

        public TerminalNode CLUSTER() {
            return getToken(SparkScriptSqlParser.CLUSTER, 0);
        }

        public TerminalNode DISTRIBUTE() {
            return getToken(SparkScriptSqlParser.DISTRIBUTE, 0);
        }

        public TerminalNode SORT() {
            return getToken(SparkScriptSqlParser.SORT, 0);
        }

        public WindowsContext windows() {
            return getRuleContext(WindowsContext.class, 0);
        }

        public TerminalNode LIMIT() {
            return getToken(SparkScriptSqlParser.LIMIT, 0);
        }

        public List<SortItemContext> sortItem() {
            return getRuleContexts(SortItemContext.class);
        }

        public SortItemContext sortItem(int i) {
            return getRuleContext(SortItemContext.class, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_queryOrganization;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterQueryOrganization(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitQueryOrganization(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitQueryOrganization(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MultiInsertQueryBodyContext extends ParserRuleContext {
        public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public QuerySpecificationContext querySpecification() {
            return getRuleContext(QuerySpecificationContext.class, 0);
        }

        public QueryOrganizationContext queryOrganization() {
            return getRuleContext(QueryOrganizationContext.class, 0);
        }

        public InsertIntoContext insertInto() {
            return getRuleContext(InsertIntoContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_multiInsertQueryBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterMultiInsertQueryBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitMultiInsertQueryBody(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitMultiInsertQueryBody(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class QueryTermContext extends ParserRuleContext {
        public QueryTermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public QueryTermContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_queryTerm;
        }

        public void copyFrom(QueryTermContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class QueryTermDefaultContext extends QueryTermContext {
        public QueryTermDefaultContext(QueryTermContext ctx) {
            copyFrom(ctx);
        }

        public QueryPrimaryContext queryPrimary() {
            return getRuleContext(QueryPrimaryContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterQueryTermDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitQueryTermDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitQueryTermDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SetOperationContext extends QueryTermContext {
        public QueryTermContext left;
        public Token operator;
        public QueryTermContext right;

        public SetOperationContext(QueryTermContext ctx) {
            copyFrom(ctx);
        }

        public List<QueryTermContext> queryTerm() {
            return getRuleContexts(QueryTermContext.class);
        }

        public QueryTermContext queryTerm(int i) {
            return getRuleContext(QueryTermContext.class, i);
        }

        public TerminalNode INTERSECT() {
            return getToken(SparkScriptSqlParser.INTERSECT, 0);
        }

        public TerminalNode UNION() {
            return getToken(SparkScriptSqlParser.UNION, 0);
        }

        public TerminalNode EXCEPT() {
            return getToken(SparkScriptSqlParser.EXCEPT, 0);
        }

        public SetQuantifierContext setQuantifier() {
            return getRuleContext(SetQuantifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterSetOperation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitSetOperation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSetOperation(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class QueryPrimaryContext extends ParserRuleContext {
        public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public QueryPrimaryContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_queryPrimary;
        }

        public void copyFrom(QueryPrimaryContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class SubqueryContext extends QueryPrimaryContext {
        public SubqueryContext(QueryPrimaryContext ctx) {
            copyFrom(ctx);
        }

        public QueryNoWithContext queryNoWith() {
            return getRuleContext(QueryNoWithContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterSubquery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitSubquery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSubquery(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
        public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) {
            copyFrom(ctx);
        }

        public QuerySpecificationContext querySpecification() {
            return getRuleContext(QuerySpecificationContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterQueryPrimaryDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitQueryPrimaryDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitQueryPrimaryDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InlineTableDefault1Context extends QueryPrimaryContext {
        public InlineTableDefault1Context(QueryPrimaryContext ctx) {
            copyFrom(ctx);
        }

        public InlineTableContext inlineTable() {
            return getRuleContext(InlineTableContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterInlineTableDefault1(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitInlineTableDefault1(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitInlineTableDefault1(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TableContext extends QueryPrimaryContext {
        public TableContext(QueryPrimaryContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode TABLE() {
            return getToken(SparkScriptSqlParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SortItemContext extends ParserRuleContext {
        public Token ordering;

        public SortItemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode ASC() {
            return getToken(SparkScriptSqlParser.ASC, 0);
        }

        public TerminalNode DESC() {
            return getToken(SparkScriptSqlParser.DESC, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sortItem;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterSortItem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitSortItem(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSortItem(this);
            else return visitor.visitChildren(this);
        }
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

        public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode USING() {
            return getToken(SparkScriptSqlParser.USING, 0);
        }

        public List<TerminalNode> STRING() {
            return getTokens(SparkScriptSqlParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(SparkScriptSqlParser.STRING, i);
        }

        public TerminalNode RECORDWRITER() {
            return getToken(SparkScriptSqlParser.RECORDWRITER, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        public TerminalNode RECORDREADER() {
            return getToken(SparkScriptSqlParser.RECORDREADER, 0);
        }

        public FromClauseContext fromClause() {
            return getRuleContext(FromClauseContext.class, 0);
        }

        public TerminalNode WHERE() {
            return getToken(SparkScriptSqlParser.WHERE, 0);
        }

        public TerminalNode SELECT() {
            return getToken(SparkScriptSqlParser.SELECT, 0);
        }

        public NamedExpressionSeqContext namedExpressionSeq() {
            return getRuleContext(NamedExpressionSeqContext.class, 0);
        }

        public List<RowFormatContext> rowFormat() {
            return getRuleContexts(RowFormatContext.class);
        }

        public RowFormatContext rowFormat(int i) {
            return getRuleContext(RowFormatContext.class, i);
        }

        public List<BooleanExpressionContext> booleanExpression() {
            return getRuleContexts(BooleanExpressionContext.class);
        }

        public BooleanExpressionContext booleanExpression(int i) {
            return getRuleContext(BooleanExpressionContext.class, i);
        }

        public TerminalNode TRANSFORM() {
            return getToken(SparkScriptSqlParser.TRANSFORM, 0);
        }

        public TerminalNode MAP() {
            return getToken(SparkScriptSqlParser.MAP, 0);
        }

        public TerminalNode REDUCE() {
            return getToken(SparkScriptSqlParser.REDUCE, 0);
        }

        public IdentifierSeqContext identifierSeq() {
            return getRuleContext(IdentifierSeqContext.class, 0);
        }

        public ColTypeListContext colTypeList() {
            return getRuleContext(ColTypeListContext.class, 0);
        }

        public List<LateralViewContext> lateralView() {
            return getRuleContexts(LateralViewContext.class);
        }

        public LateralViewContext lateralView(int i) {
            return getRuleContext(LateralViewContext.class, i);
        }

        public AggregationContext aggregation() {
            return getRuleContext(AggregationContext.class, 0);
        }

        public TerminalNode HAVING() {
            return getToken(SparkScriptSqlParser.HAVING, 0);
        }

        public WindowsContext windows() {
            return getRuleContext(WindowsContext.class, 0);
        }

        public SetQuantifierContext setQuantifier() {
            return getRuleContext(SetQuantifierContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_querySpecification;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterQuerySpecification(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitQuerySpecification(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitQuerySpecification(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FromClauseContext extends ParserRuleContext {
        public FromClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FROM() {
            return getToken(SparkScriptSqlParser.FROM, 0);
        }

        public List<RelationContext> relation() {
            return getRuleContexts(RelationContext.class);
        }

        public RelationContext relation(int i) {
            return getRuleContext(RelationContext.class, i);
        }

        public List<LateralViewContext> lateralView() {
            return getRuleContexts(LateralViewContext.class);
        }

        public LateralViewContext lateralView(int i) {
            return getRuleContext(LateralViewContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fromClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterFromClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitFromClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitFromClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AggregationContext extends ParserRuleContext {
        public ExpressionContext expression;
        public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
        public Token kind;

        public AggregationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode GROUP() {
            return getToken(SparkScriptSqlParser.GROUP, 0);
        }

        public TerminalNode BY() {
            return getToken(SparkScriptSqlParser.BY, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode WITH() {
            return getToken(SparkScriptSqlParser.WITH, 0);
        }

        public TerminalNode SETS() {
            return getToken(SparkScriptSqlParser.SETS, 0);
        }

        public List<GroupingSetContext> groupingSet() {
            return getRuleContexts(GroupingSetContext.class);
        }

        public GroupingSetContext groupingSet(int i) {
            return getRuleContext(GroupingSetContext.class, i);
        }

        public TerminalNode ROLLUP() {
            return getToken(SparkScriptSqlParser.ROLLUP, 0);
        }

        public TerminalNode CUBE() {
            return getToken(SparkScriptSqlParser.CUBE, 0);
        }

        public TerminalNode GROUPING() {
            return getToken(SparkScriptSqlParser.GROUPING, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_aggregation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterAggregation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitAggregation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitAggregation(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class GroupingSetContext extends ParserRuleContext {
        public GroupingSetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_groupingSet;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterGroupingSet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitGroupingSet(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitGroupingSet(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LateralViewContext extends ParserRuleContext {
        public IdentifierContext tblName;
        public IdentifierContext identifier;
        public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();

        public LateralViewContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode LATERAL() {
            return getToken(SparkScriptSqlParser.LATERAL, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SparkScriptSqlParser.VIEW, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode OUTER() {
            return getToken(SparkScriptSqlParser.OUTER, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lateralView;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterLateralView(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitLateralView(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitLateralView(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SetQuantifierContext extends ParserRuleContext {
        public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode DISTINCT() {
            return getToken(SparkScriptSqlParser.DISTINCT, 0);
        }

        public TerminalNode ALL() {
            return getToken(SparkScriptSqlParser.ALL, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_setQuantifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSetQuantifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitSetQuantifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSetQuantifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RelationContext extends ParserRuleContext {
        public RelationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public RelationContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_relation;
        }

        public void copyFrom(RelationContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class RelationDefaultContext extends RelationContext {
        public RelationDefaultContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        public RelationPrimaryContext relationPrimary() {
            return getRuleContext(RelationPrimaryContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterRelationDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitRelationDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitRelationDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class JoinRelationContext extends RelationContext {
        public RelationContext left;
        public RelationContext right;

        public JoinRelationContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        public List<RelationContext> relation() {
            return getRuleContexts(RelationContext.class);
        }

        public RelationContext relation(int i) {
            return getRuleContext(RelationContext.class, i);
        }

        public TerminalNode JOIN() {
            return getToken(SparkScriptSqlParser.JOIN, 0);
        }

        public TerminalNode NATURAL() {
            return getToken(SparkScriptSqlParser.NATURAL, 0);
        }

        public JoinTypeContext joinType() {
            return getRuleContext(JoinTypeContext.class, 0);
        }

        public TerminalNode CROSS() {
            return getToken(SparkScriptSqlParser.CROSS, 0);
        }

        public JoinCriteriaContext joinCriteria() {
            return getRuleContext(JoinCriteriaContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterJoinRelation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitJoinRelation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitJoinRelation(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class JoinTypeContext extends ParserRuleContext {
        public JoinTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INNER() {
            return getToken(SparkScriptSqlParser.INNER, 0);
        }

        public TerminalNode LEFT() {
            return getToken(SparkScriptSqlParser.LEFT, 0);
        }

        public TerminalNode OUTER() {
            return getToken(SparkScriptSqlParser.OUTER, 0);
        }

        public TerminalNode SEMI() {
            return getToken(SparkScriptSqlParser.SEMI, 0);
        }

        public TerminalNode RIGHT() {
            return getToken(SparkScriptSqlParser.RIGHT, 0);
        }

        public TerminalNode FULL() {
            return getToken(SparkScriptSqlParser.FULL, 0);
        }

        public TerminalNode ANTI() {
            return getToken(SparkScriptSqlParser.ANTI, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_joinType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterJoinType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitJoinType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitJoinType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class JoinCriteriaContext extends ParserRuleContext {
        public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ON() {
            return getToken(SparkScriptSqlParser.ON, 0);
        }

        public BooleanExpressionContext booleanExpression() {
            return getRuleContext(BooleanExpressionContext.class, 0);
        }

        public TerminalNode USING() {
            return getToken(SparkScriptSqlParser.USING, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_joinCriteria;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterJoinCriteria(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitJoinCriteria(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitJoinCriteria(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SampleContext extends ParserRuleContext {
        public Token percentage;
        public Token sampleType;
        public Token numerator;
        public Token denominator;

        public SampleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode TABLESAMPLE() {
            return getToken(SparkScriptSqlParser.TABLESAMPLE, 0);
        }

        public TerminalNode BYTELENGTH_LITERAL() {
            return getToken(SparkScriptSqlParser.BYTELENGTH_LITERAL, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode OUT() {
            return getToken(SparkScriptSqlParser.OUT, 0);
        }

        public TerminalNode OF() {
            return getToken(SparkScriptSqlParser.OF, 0);
        }

        public TerminalNode PERCENTLIT() {
            return getToken(SparkScriptSqlParser.PERCENTLIT, 0);
        }

        public TerminalNode ROWS() {
            return getToken(SparkScriptSqlParser.ROWS, 0);
        }

        public TerminalNode BUCKET() {
            return getToken(SparkScriptSqlParser.BUCKET, 0);
        }

        public List<TerminalNode> INTEGER_VALUE() {
            return getTokens(SparkScriptSqlParser.INTEGER_VALUE);
        }

        public TerminalNode INTEGER_VALUE(int i) {
            return getToken(SparkScriptSqlParser.INTEGER_VALUE, i);
        }

        public TerminalNode DECIMAL_VALUE() {
            return getToken(SparkScriptSqlParser.DECIMAL_VALUE, 0);
        }

        public TerminalNode ON() {
            return getToken(SparkScriptSqlParser.ON, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sample;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterSample(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitSample(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSample(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierListContext extends ParserRuleContext {
        public IdentifierListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IdentifierSeqContext identifierSeq() {
            return getRuleContext(IdentifierSeqContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifierList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterIdentifierList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitIdentifierList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitIdentifierList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierSeqContext extends ParserRuleContext {
        public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifierSeq;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterIdentifierSeq(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitIdentifierSeq(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitIdentifierSeq(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class OrderedIdentifierListContext extends ParserRuleContext {
        public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<OrderedIdentifierContext> orderedIdentifier() {
            return getRuleContexts(OrderedIdentifierContext.class);
        }

        public OrderedIdentifierContext orderedIdentifier(int i) {
            return getRuleContext(OrderedIdentifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderedIdentifierList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterOrderedIdentifierList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitOrderedIdentifierList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitOrderedIdentifierList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class OrderedIdentifierContext extends ParserRuleContext {
        public Token ordering;

        public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode ASC() {
            return getToken(SparkScriptSqlParser.ASC, 0);
        }

        public TerminalNode DESC() {
            return getToken(SparkScriptSqlParser.DESC, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderedIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterOrderedIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitOrderedIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitOrderedIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierCommentListContext extends ParserRuleContext {
        public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<IdentifierCommentContext> identifierComment() {
            return getRuleContexts(IdentifierCommentContext.class);
        }

        public IdentifierCommentContext identifierComment(int i) {
            return getRuleContext(IdentifierCommentContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifierCommentList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterIdentifierCommentList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitIdentifierCommentList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitIdentifierCommentList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierCommentContext extends ParserRuleContext {
        public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SparkScriptSqlParser.COMMENT, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifierComment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterIdentifierComment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitIdentifierComment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitIdentifierComment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RelationPrimaryContext extends ParserRuleContext {
        public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public RelationPrimaryContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_relationPrimary;
        }

        public void copyFrom(RelationPrimaryContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class InlineTableDefault2Context extends RelationPrimaryContext {
        public InlineTableDefault2Context(RelationPrimaryContext ctx) {
            copyFrom(ctx);
        }

        public InlineTableContext inlineTable() {
            return getRuleContext(InlineTableContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterInlineTableDefault2(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitInlineTableDefault2(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitInlineTableDefault2(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AliasedRelationContext extends RelationPrimaryContext {
        public AliasedRelationContext(RelationPrimaryContext ctx) {
            copyFrom(ctx);
        }

        public RelationContext relation() {
            return getRuleContext(RelationContext.class, 0);
        }

        public SampleContext sample() {
            return getRuleContext(SampleContext.class, 0);
        }

        public StrictIdentifierContext strictIdentifier() {
            return getRuleContext(StrictIdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterAliasedRelation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitAliasedRelation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitAliasedRelation(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AliasedQueryContext extends RelationPrimaryContext {
        public AliasedQueryContext(RelationPrimaryContext ctx) {
            copyFrom(ctx);
        }

        public QueryNoWithContext queryNoWith() {
            return getRuleContext(QueryNoWithContext.class, 0);
        }

        public SampleContext sample() {
            return getRuleContext(SampleContext.class, 0);
        }

        public StrictIdentifierContext strictIdentifier() {
            return getRuleContext(StrictIdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterAliasedQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitAliasedQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitAliasedQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TableNameContext extends RelationPrimaryContext {
        public TableNameContext(RelationPrimaryContext ctx) {
            copyFrom(ctx);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public SampleContext sample() {
            return getRuleContext(SampleContext.class, 0);
        }

        public StrictIdentifierContext strictIdentifier() {
            return getRuleContext(StrictIdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterTableName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitTableName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTableName(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InlineTableContext extends ParserRuleContext {
        public InlineTableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode VALUES() {
            return getToken(SparkScriptSqlParser.VALUES, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        public IdentifierListContext identifierList() {
            return getRuleContext(IdentifierListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inlineTable;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterInlineTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitInlineTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitInlineTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RowFormatContext extends ParserRuleContext {
        public RowFormatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public RowFormatContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_rowFormat;
        }

        public void copyFrom(RowFormatContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class RowFormatSerdeContext extends RowFormatContext {
        public Token name;
        public TablePropertyListContext props;

        public RowFormatSerdeContext(RowFormatContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ROW() {
            return getToken(SparkScriptSqlParser.ROW, 0);
        }

        public TerminalNode FORMAT() {
            return getToken(SparkScriptSqlParser.FORMAT, 0);
        }

        public TerminalNode SERDE() {
            return getToken(SparkScriptSqlParser.SERDE, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        public TerminalNode WITH() {
            return getToken(SparkScriptSqlParser.WITH, 0);
        }

        public TerminalNode SERDEPROPERTIES() {
            return getToken(SparkScriptSqlParser.SERDEPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterRowFormatSerde(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitRowFormatSerde(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitRowFormatSerde(this);
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

        public RowFormatDelimitedContext(RowFormatContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ROW() {
            return getToken(SparkScriptSqlParser.ROW, 0);
        }

        public TerminalNode FORMAT() {
            return getToken(SparkScriptSqlParser.FORMAT, 0);
        }

        public TerminalNode DELIMITED() {
            return getToken(SparkScriptSqlParser.DELIMITED, 0);
        }

        public TerminalNode FIELDS() {
            return getToken(SparkScriptSqlParser.FIELDS, 0);
        }

        public List<TerminalNode> TERMINATED() {
            return getTokens(SparkScriptSqlParser.TERMINATED);
        }

        public TerminalNode TERMINATED(int i) {
            return getToken(SparkScriptSqlParser.TERMINATED, i);
        }

        public List<TerminalNode> BY() {
            return getTokens(SparkScriptSqlParser.BY);
        }

        public TerminalNode BY(int i) {
            return getToken(SparkScriptSqlParser.BY, i);
        }

        public TerminalNode COLLECTION() {
            return getToken(SparkScriptSqlParser.COLLECTION, 0);
        }

        public TerminalNode ITEMS() {
            return getToken(SparkScriptSqlParser.ITEMS, 0);
        }

        public TerminalNode MAP() {
            return getToken(SparkScriptSqlParser.MAP, 0);
        }

        public TerminalNode KEYS() {
            return getToken(SparkScriptSqlParser.KEYS, 0);
        }

        public TerminalNode LINES() {
            return getToken(SparkScriptSqlParser.LINES, 0);
        }

        public TerminalNode NULL() {
            return getToken(SparkScriptSqlParser.NULL, 0);
        }

        public TerminalNode DEFINED() {
            return getToken(SparkScriptSqlParser.DEFINED, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        public List<TerminalNode> STRING() {
            return getTokens(SparkScriptSqlParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(SparkScriptSqlParser.STRING, i);
        }

        public TerminalNode ESCAPED() {
            return getToken(SparkScriptSqlParser.ESCAPED, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterRowFormatDelimited(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitRowFormatDelimited(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitRowFormatDelimited(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TableIdentifierContext extends ParserRuleContext {
        public IdentifierContext db;
        public IdentifierContext table;

        public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterTableIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitTableIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTableIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NamedExpressionContext extends ParserRuleContext {
        public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public IdentifierListContext identifierList() {
            return getRuleContext(IdentifierListContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namedExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterNamedExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitNamedExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitNamedExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NamedExpressionSeqContext extends ParserRuleContext {
        public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<NamedExpressionContext> namedExpression() {
            return getRuleContexts(NamedExpressionContext.class);
        }

        public NamedExpressionContext namedExpression(int i) {
            return getRuleContext(NamedExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namedExpressionSeq;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterNamedExpressionSeq(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitNamedExpressionSeq(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitNamedExpressionSeq(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpressionContext extends ParserRuleContext {
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BooleanExpressionContext booleanExpression() {
            return getRuleContext(BooleanExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BooleanExpressionContext extends ParserRuleContext {
        public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BooleanExpressionContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_booleanExpression;
        }

        public void copyFrom(BooleanExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class LogicalNotContext extends BooleanExpressionContext {
        public LogicalNotContext(BooleanExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode NOT() {
            return getToken(SparkScriptSqlParser.NOT, 0);
        }

        public BooleanExpressionContext booleanExpression() {
            return getRuleContext(BooleanExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterLogicalNot(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitLogicalNot(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitLogicalNot(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BooleanDefaultContext extends BooleanExpressionContext {
        public BooleanDefaultContext(BooleanExpressionContext ctx) {
            copyFrom(ctx);
        }

        public PredicatedContext predicated() {
            return getRuleContext(PredicatedContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterBooleanDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitBooleanDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitBooleanDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExistsContext extends BooleanExpressionContext {
        public ExistsContext(BooleanExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterExists(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitExists(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitExists(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LogicalBinaryContext extends BooleanExpressionContext {
        public BooleanExpressionContext left;
        public Token operator;
        public BooleanExpressionContext right;

        public LogicalBinaryContext(BooleanExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<BooleanExpressionContext> booleanExpression() {
            return getRuleContexts(BooleanExpressionContext.class);
        }

        public BooleanExpressionContext booleanExpression(int i) {
            return getRuleContext(BooleanExpressionContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(SparkScriptSqlParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(SparkScriptSqlParser.OR, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterLogicalBinary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitLogicalBinary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitLogicalBinary(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PredicatedContext extends ParserRuleContext {
        public PredicatedContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ValueExpressionContext valueExpression() {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public PredicateContext predicate() {
            return getRuleContext(PredicateContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_predicated;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterPredicated(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitPredicated(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitPredicated(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PredicateContext extends ParserRuleContext {
        public Token kind;
        public ValueExpressionContext lower;
        public ValueExpressionContext upper;
        public ValueExpressionContext pattern;

        public PredicateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode AND() {
            return getToken(SparkScriptSqlParser.AND, 0);
        }

        public TerminalNode BETWEEN() {
            return getToken(SparkScriptSqlParser.BETWEEN, 0);
        }

        public List<ValueExpressionContext> valueExpression() {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i) {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public TerminalNode NOT() {
            return getToken(SparkScriptSqlParser.NOT, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode IN() {
            return getToken(SparkScriptSqlParser.IN, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode RLIKE() {
            return getToken(SparkScriptSqlParser.RLIKE, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SparkScriptSqlParser.LIKE, 0);
        }

        public TerminalNode IS() {
            return getToken(SparkScriptSqlParser.IS, 0);
        }

        public TerminalNode NULL() {
            return getToken(SparkScriptSqlParser.NULL, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_predicate;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterPredicate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitPredicate(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitPredicate(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ValueExpressionContext extends ParserRuleContext {
        public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ValueExpressionContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_valueExpression;
        }

        public void copyFrom(ValueExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ValueExpressionDefaultContext extends ValueExpressionContext {
        public ValueExpressionDefaultContext(ValueExpressionContext ctx) {
            copyFrom(ctx);
        }

        public PrimaryExpressionContext primaryExpression() {
            return getRuleContext(PrimaryExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterValueExpressionDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitValueExpressionDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitValueExpressionDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ComparisonContext extends ValueExpressionContext {
        public ValueExpressionContext left;
        public ValueExpressionContext right;

        public ComparisonContext(ValueExpressionContext ctx) {
            copyFrom(ctx);
        }

        public ComparisonOperatorContext comparisonOperator() {
            return getRuleContext(ComparisonOperatorContext.class, 0);
        }

        public List<ValueExpressionContext> valueExpression() {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i) {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterComparison(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitComparison(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitComparison(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArithmeticBinaryContext extends ValueExpressionContext {
        public ValueExpressionContext left;
        public Token operator;
        public ValueExpressionContext right;

        public ArithmeticBinaryContext(ValueExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ValueExpressionContext> valueExpression() {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i) {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public TerminalNode ASTERISK() {
            return getToken(SparkScriptSqlParser.ASTERISK, 0);
        }

        public TerminalNode SLASH() {
            return getToken(SparkScriptSqlParser.SLASH, 0);
        }

        public TerminalNode PERCENT() {
            return getToken(SparkScriptSqlParser.PERCENT, 0);
        }

        public TerminalNode DIV() {
            return getToken(SparkScriptSqlParser.DIV, 0);
        }

        public TerminalNode PLUS() {
            return getToken(SparkScriptSqlParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SparkScriptSqlParser.MINUS, 0);
        }

        public TerminalNode AMPERSAND() {
            return getToken(SparkScriptSqlParser.AMPERSAND, 0);
        }

        public TerminalNode HAT() {
            return getToken(SparkScriptSqlParser.HAT, 0);
        }

        public TerminalNode PIPE() {
            return getToken(SparkScriptSqlParser.PIPE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterArithmeticBinary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitArithmeticBinary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitArithmeticBinary(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArithmeticUnaryContext extends ValueExpressionContext {
        public Token operator;

        public ArithmeticUnaryContext(ValueExpressionContext ctx) {
            copyFrom(ctx);
        }

        public ValueExpressionContext valueExpression() {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SparkScriptSqlParser.MINUS, 0);
        }

        public TerminalNode PLUS() {
            return getToken(SparkScriptSqlParser.PLUS, 0);
        }

        public TerminalNode TILDE() {
            return getToken(SparkScriptSqlParser.TILDE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterArithmeticUnary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitArithmeticUnary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitArithmeticUnary(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrimaryExpressionContext extends ParserRuleContext {
        public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public PrimaryExpressionContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_primaryExpression;
        }

        public void copyFrom(PrimaryExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class DereferenceContext extends PrimaryExpressionContext {
        public PrimaryExpressionContext base;
        public IdentifierContext fieldName;

        public DereferenceContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public PrimaryExpressionContext primaryExpression() {
            return getRuleContext(PrimaryExpressionContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterDereference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitDereference(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDereference(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SimpleCaseContext extends PrimaryExpressionContext {
        public ExpressionContext elseExpression;

        public SimpleCaseContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CASE() {
            return getToken(SparkScriptSqlParser.CASE, 0);
        }

        public ValueExpressionContext valueExpression() {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(SparkScriptSqlParser.END, 0);
        }

        public List<WhenClauseContext> whenClause() {
            return getRuleContexts(WhenClauseContext.class);
        }

        public WhenClauseContext whenClause(int i) {
            return getRuleContext(WhenClauseContext.class, i);
        }

        public TerminalNode ELSE() {
            return getToken(SparkScriptSqlParser.ELSE, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterSimpleCase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitSimpleCase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSimpleCase(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CastContext extends PrimaryExpressionContext {
        public CastContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CAST() {
            return getToken(SparkScriptSqlParser.CAST, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        public DataTypeContext dataType() {
            return getRuleContext(DataTypeContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterCast(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitCast(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitCast(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConstantDefaultContext extends PrimaryExpressionContext {
        public ConstantDefaultContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterConstantDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitConstantDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitConstantDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ColumnReferenceContext extends PrimaryExpressionContext {
        public ColumnReferenceContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterColumnReference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitColumnReference(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitColumnReference(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RowConstructorContext extends PrimaryExpressionContext {
        public RowConstructorContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterRowConstructor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitRowConstructor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitRowConstructor(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
        public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterParenthesizedExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitParenthesizedExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitParenthesizedExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StarContext extends PrimaryExpressionContext {
        public StarContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ASTERISK() {
            return getToken(SparkScriptSqlParser.ASTERISK, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterStar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitStar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitStar(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SubscriptContext extends PrimaryExpressionContext {
        public PrimaryExpressionContext value;
        public ValueExpressionContext index;

        public SubscriptContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public PrimaryExpressionContext primaryExpression() {
            return getRuleContext(PrimaryExpressionContext.class, 0);
        }

        public ValueExpressionContext valueExpression() {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterSubscript(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitSubscript(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSubscript(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionCallContext extends PrimaryExpressionContext {
        public FunctionCallContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode OVER() {
            return getToken(SparkScriptSqlParser.OVER, 0);
        }

        public WindowSpecContext windowSpec() {
            return getRuleContext(WindowSpecContext.class, 0);
        }

        public SetQuantifierContext setQuantifier() {
            return getRuleContext(SetQuantifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SearchedCaseContext extends PrimaryExpressionContext {
        public ExpressionContext elseExpression;

        public SearchedCaseContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CASE() {
            return getToken(SparkScriptSqlParser.CASE, 0);
        }

        public TerminalNode END() {
            return getToken(SparkScriptSqlParser.END, 0);
        }

        public List<WhenClauseContext> whenClause() {
            return getRuleContexts(WhenClauseContext.class);
        }

        public WhenClauseContext whenClause(int i) {
            return getRuleContext(WhenClauseContext.class, i);
        }

        public TerminalNode ELSE() {
            return getToken(SparkScriptSqlParser.ELSE, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterSearchedCase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitSearchedCase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSearchedCase(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SubqueryExpressionContext extends PrimaryExpressionContext {
        public SubqueryExpressionContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSubqueryExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitSubqueryExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSubqueryExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConstantContext extends ParserRuleContext {
        public ConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ConstantContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_constant;
        }

        public void copyFrom(ConstantContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class NullLiteralContext extends ConstantContext {
        public NullLiteralContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode NULL() {
            return getToken(SparkScriptSqlParser.NULL, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterNullLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitNullLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitNullLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringLiteralContext extends ConstantContext {
        public StringLiteralContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        public List<TerminalNode> STRING() {
            return getTokens(SparkScriptSqlParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(SparkScriptSqlParser.STRING, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterStringLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitStringLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitStringLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TypeConstructorContext extends ConstantContext {
        public TypeConstructorContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterTypeConstructor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitTypeConstructor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTypeConstructor(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IntervalLiteralContext extends ConstantContext {
        public IntervalLiteralContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        public IntervalContext interval() {
            return getRuleContext(IntervalContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterIntervalLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitIntervalLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitIntervalLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NumericLiteralContext extends ConstantContext {
        public NumericLiteralContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        public NumberContext number() {
            return getRuleContext(NumberContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterNumericLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitNumericLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitNumericLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BooleanLiteralContext extends ConstantContext {
        public BooleanLiteralContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        public BooleanValueContext booleanValue() {
            return getRuleContext(BooleanValueContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterBooleanLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitBooleanLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitBooleanLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ComparisonOperatorContext extends ParserRuleContext {
        public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EQ() {
            return getToken(SparkScriptSqlParser.EQ, 0);
        }

        public TerminalNode NEQ() {
            return getToken(SparkScriptSqlParser.NEQ, 0);
        }

        public TerminalNode NEQJ() {
            return getToken(SparkScriptSqlParser.NEQJ, 0);
        }

        public TerminalNode LT() {
            return getToken(SparkScriptSqlParser.LT, 0);
        }

        public TerminalNode LTE() {
            return getToken(SparkScriptSqlParser.LTE, 0);
        }

        public TerminalNode GT() {
            return getToken(SparkScriptSqlParser.GT, 0);
        }

        public TerminalNode GTE() {
            return getToken(SparkScriptSqlParser.GTE, 0);
        }

        public TerminalNode NSEQ() {
            return getToken(SparkScriptSqlParser.NSEQ, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comparisonOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterComparisonOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitComparisonOperator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitComparisonOperator(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArithmeticOperatorContext extends ParserRuleContext {
        public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PLUS() {
            return getToken(SparkScriptSqlParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SparkScriptSqlParser.MINUS, 0);
        }

        public TerminalNode ASTERISK() {
            return getToken(SparkScriptSqlParser.ASTERISK, 0);
        }

        public TerminalNode SLASH() {
            return getToken(SparkScriptSqlParser.SLASH, 0);
        }

        public TerminalNode PERCENT() {
            return getToken(SparkScriptSqlParser.PERCENT, 0);
        }

        public TerminalNode DIV() {
            return getToken(SparkScriptSqlParser.DIV, 0);
        }

        public TerminalNode TILDE() {
            return getToken(SparkScriptSqlParser.TILDE, 0);
        }

        public TerminalNode AMPERSAND() {
            return getToken(SparkScriptSqlParser.AMPERSAND, 0);
        }

        public TerminalNode PIPE() {
            return getToken(SparkScriptSqlParser.PIPE, 0);
        }

        public TerminalNode HAT() {
            return getToken(SparkScriptSqlParser.HAT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arithmeticOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterArithmeticOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitArithmeticOperator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitArithmeticOperator(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PredicateOperatorContext extends ParserRuleContext {
        public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OR() {
            return getToken(SparkScriptSqlParser.OR, 0);
        }

        public TerminalNode AND() {
            return getToken(SparkScriptSqlParser.AND, 0);
        }

        public TerminalNode IN() {
            return getToken(SparkScriptSqlParser.IN, 0);
        }

        public TerminalNode NOT() {
            return getToken(SparkScriptSqlParser.NOT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_predicateOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterPredicateOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitPredicateOperator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitPredicateOperator(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BooleanValueContext extends ParserRuleContext {
        public BooleanValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode TRUE() {
            return getToken(SparkScriptSqlParser.TRUE, 0);
        }

        public TerminalNode FALSE() {
            return getToken(SparkScriptSqlParser.FALSE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_booleanValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterBooleanValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitBooleanValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitBooleanValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IntervalContext extends ParserRuleContext {
        public IntervalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INTERVAL() {
            return getToken(SparkScriptSqlParser.INTERVAL, 0);
        }

        public List<IntervalFieldContext> intervalField() {
            return getRuleContexts(IntervalFieldContext.class);
        }

        public IntervalFieldContext intervalField(int i) {
            return getRuleContext(IntervalFieldContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interval;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterInterval(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitInterval(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitInterval(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IntervalFieldContext extends ParserRuleContext {
        public IntervalValueContext value;
        public IdentifierContext unit;
        public IdentifierContext to;

        public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IntervalValueContext intervalValue() {
            return getRuleContext(IntervalValueContext.class, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode TO() {
            return getToken(SparkScriptSqlParser.TO, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_intervalField;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterIntervalField(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitIntervalField(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitIntervalField(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IntervalValueContext extends ParserRuleContext {
        public IntervalValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INTEGER_VALUE() {
            return getToken(SparkScriptSqlParser.INTEGER_VALUE, 0);
        }

        public TerminalNode DECIMAL_VALUE() {
            return getToken(SparkScriptSqlParser.DECIMAL_VALUE, 0);
        }

        public TerminalNode PLUS() {
            return getToken(SparkScriptSqlParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SparkScriptSqlParser.MINUS, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_intervalValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterIntervalValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitIntervalValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitIntervalValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DataTypeContext extends ParserRuleContext {
        public DataTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public DataTypeContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_dataType;
        }

        public void copyFrom(DataTypeContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ComplexDataTypeContext extends DataTypeContext {
        public Token complex;

        public ComplexDataTypeContext(DataTypeContext ctx) {
            copyFrom(ctx);
        }

        public List<DataTypeContext> dataType() {
            return getRuleContexts(DataTypeContext.class);
        }

        public DataTypeContext dataType(int i) {
            return getRuleContext(DataTypeContext.class, i);
        }

        public TerminalNode ARRAY() {
            return getToken(SparkScriptSqlParser.ARRAY, 0);
        }

        public TerminalNode MAP() {
            return getToken(SparkScriptSqlParser.MAP, 0);
        }

        public TerminalNode STRUCT() {
            return getToken(SparkScriptSqlParser.STRUCT, 0);
        }

        public TerminalNode NEQ() {
            return getToken(SparkScriptSqlParser.NEQ, 0);
        }

        public ColTypeListContext colTypeList() {
            return getRuleContext(ColTypeListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterComplexDataType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitComplexDataType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitComplexDataType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrimitiveDataTypeContext extends DataTypeContext {
        public PrimitiveDataTypeContext(DataTypeContext ctx) {
            copyFrom(ctx);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public List<TerminalNode> INTEGER_VALUE() {
            return getTokens(SparkScriptSqlParser.INTEGER_VALUE);
        }

        public TerminalNode INTEGER_VALUE(int i) {
            return getToken(SparkScriptSqlParser.INTEGER_VALUE, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterPrimitiveDataType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitPrimitiveDataType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitPrimitiveDataType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ColTypeListContext extends ParserRuleContext {
        public ColTypeListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ColTypeContext> colType() {
            return getRuleContexts(ColTypeContext.class);
        }

        public ColTypeContext colType(int i) {
            return getRuleContext(ColTypeContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_colTypeList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterColTypeList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitColTypeList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitColTypeList(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ColTypeContext extends ParserRuleContext {
        public ColTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public DataTypeContext dataType() {
            return getRuleContext(DataTypeContext.class, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SparkScriptSqlParser.COMMENT, 0);
        }

        public TerminalNode STRING() {
            return getToken(SparkScriptSqlParser.STRING, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_colType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterColType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitColType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitColType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WhenClauseContext extends ParserRuleContext {
        public ExpressionContext condition;
        public ExpressionContext result;

        public WhenClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode WHEN() {
            return getToken(SparkScriptSqlParser.WHEN, 0);
        }

        public TerminalNode THEN() {
            return getToken(SparkScriptSqlParser.THEN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whenClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterWhenClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitWhenClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitWhenClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WindowsContext extends ParserRuleContext {
        public WindowsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode WINDOW() {
            return getToken(SparkScriptSqlParser.WINDOW, 0);
        }

        public List<NamedWindowContext> namedWindow() {
            return getRuleContexts(NamedWindowContext.class);
        }

        public NamedWindowContext namedWindow(int i) {
            return getRuleContext(NamedWindowContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windows;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterWindows(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitWindows(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitWindows(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NamedWindowContext extends ParserRuleContext {
        public NamedWindowContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        public WindowSpecContext windowSpec() {
            return getRuleContext(WindowSpecContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namedWindow;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterNamedWindow(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitNamedWindow(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitNamedWindow(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WindowSpecContext extends ParserRuleContext {
        public WindowSpecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public WindowSpecContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowSpec;
        }

        public void copyFrom(WindowSpecContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class WindowRefContext extends WindowSpecContext {
        public IdentifierContext name;

        public WindowRefContext(WindowSpecContext ctx) {
            copyFrom(ctx);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterWindowRef(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitWindowRef(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitWindowRef(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WindowDefContext extends WindowSpecContext {
        public ExpressionContext expression;
        public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();

        public WindowDefContext(WindowSpecContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CLUSTER() {
            return getToken(SparkScriptSqlParser.CLUSTER, 0);
        }

        public List<TerminalNode> BY() {
            return getTokens(SparkScriptSqlParser.BY);
        }

        public TerminalNode BY(int i) {
            return getToken(SparkScriptSqlParser.BY, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public WindowFrameContext windowFrame() {
            return getRuleContext(WindowFrameContext.class, 0);
        }

        public List<SortItemContext> sortItem() {
            return getRuleContexts(SortItemContext.class);
        }

        public SortItemContext sortItem(int i) {
            return getRuleContext(SortItemContext.class, i);
        }

        public TerminalNode PARTITION() {
            return getToken(SparkScriptSqlParser.PARTITION, 0);
        }

        public TerminalNode DISTRIBUTE() {
            return getToken(SparkScriptSqlParser.DISTRIBUTE, 0);
        }

        public TerminalNode ORDER() {
            return getToken(SparkScriptSqlParser.ORDER, 0);
        }

        public TerminalNode SORT() {
            return getToken(SparkScriptSqlParser.SORT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterWindowDef(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitWindowDef(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitWindowDef(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WindowFrameContext extends ParserRuleContext {
        public Token frameType;
        public FrameBoundContext start;
        public FrameBoundContext end;

        public WindowFrameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode RANGE() {
            return getToken(SparkScriptSqlParser.RANGE, 0);
        }

        public List<FrameBoundContext> frameBound() {
            return getRuleContexts(FrameBoundContext.class);
        }

        public FrameBoundContext frameBound(int i) {
            return getRuleContext(FrameBoundContext.class, i);
        }

        public TerminalNode ROWS() {
            return getToken(SparkScriptSqlParser.ROWS, 0);
        }

        public TerminalNode BETWEEN() {
            return getToken(SparkScriptSqlParser.BETWEEN, 0);
        }

        public TerminalNode AND() {
            return getToken(SparkScriptSqlParser.AND, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowFrame;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterWindowFrame(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitWindowFrame(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitWindowFrame(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FrameBoundContext extends ParserRuleContext {
        public Token boundType;

        public FrameBoundContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode UNBOUNDED() {
            return getToken(SparkScriptSqlParser.UNBOUNDED, 0);
        }

        public TerminalNode PRECEDING() {
            return getToken(SparkScriptSqlParser.PRECEDING, 0);
        }

        public TerminalNode FOLLOWING() {
            return getToken(SparkScriptSqlParser.FOLLOWING, 0);
        }

        public TerminalNode ROW() {
            return getToken(SparkScriptSqlParser.ROW, 0);
        }

        public TerminalNode CURRENT() {
            return getToken(SparkScriptSqlParser.CURRENT, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_frameBound;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterFrameBound(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitFrameBound(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitFrameBound(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class QualifiedNameContext extends ParserRuleContext {
        public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_qualifiedName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterQualifiedName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitQualifiedName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitQualifiedName(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierContext extends ParserRuleContext {
        public IdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StrictIdentifierContext strictIdentifier() {
            return getRuleContext(StrictIdentifierContext.class, 0);
        }

        public TerminalNode ANTI() {
            return getToken(SparkScriptSqlParser.ANTI, 0);
        }

        public TerminalNode FULL() {
            return getToken(SparkScriptSqlParser.FULL, 0);
        }

        public TerminalNode INNER() {
            return getToken(SparkScriptSqlParser.INNER, 0);
        }

        public TerminalNode LEFT() {
            return getToken(SparkScriptSqlParser.LEFT, 0);
        }

        public TerminalNode SEMI() {
            return getToken(SparkScriptSqlParser.SEMI, 0);
        }

        public TerminalNode RIGHT() {
            return getToken(SparkScriptSqlParser.RIGHT, 0);
        }

        public TerminalNode NATURAL() {
            return getToken(SparkScriptSqlParser.NATURAL, 0);
        }

        public TerminalNode JOIN() {
            return getToken(SparkScriptSqlParser.JOIN, 0);
        }

        public TerminalNode CROSS() {
            return getToken(SparkScriptSqlParser.CROSS, 0);
        }

        public TerminalNode ON() {
            return getToken(SparkScriptSqlParser.ON, 0);
        }

        public TerminalNode UNION() {
            return getToken(SparkScriptSqlParser.UNION, 0);
        }

        public TerminalNode INTERSECT() {
            return getToken(SparkScriptSqlParser.INTERSECT, 0);
        }

        public TerminalNode EXCEPT() {
            return getToken(SparkScriptSqlParser.EXCEPT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StrictIdentifierContext extends ParserRuleContext {
        public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StrictIdentifierContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_strictIdentifier;
        }

        public void copyFrom(StrictIdentifierContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
        public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) {
            copyFrom(ctx);
        }

        public QuotedIdentifierContext quotedIdentifier() {
            return getRuleContext(QuotedIdentifierContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterQuotedIdentifierAlternative(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitQuotedIdentifierAlternative(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitQuotedIdentifierAlternative(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UnquotedIdentifierContext extends StrictIdentifierContext {
        public UnquotedIdentifierContext(StrictIdentifierContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(SparkScriptSqlParser.IDENTIFIER, 0);
        }

        public NonReservedContext nonReserved() {
            return getRuleContext(NonReservedContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterUnquotedIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitUnquotedIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitUnquotedIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class QuotedIdentifierContext extends ParserRuleContext {
        public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode BACKQUOTED_IDENTIFIER() {
            return getToken(SparkScriptSqlParser.BACKQUOTED_IDENTIFIER, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_quotedIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterQuotedIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitQuotedIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitQuotedIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NumberContext extends ParserRuleContext {
        public NumberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public NumberContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_number;
        }

        public void copyFrom(NumberContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class DecimalLiteralContext extends NumberContext {
        public DecimalLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode DECIMAL_VALUE() {
            return getToken(SparkScriptSqlParser.DECIMAL_VALUE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterDecimalLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitDecimalLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDecimalLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BigIntLiteralContext extends NumberContext {
        public BigIntLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode BIGINT_LITERAL() {
            return getToken(SparkScriptSqlParser.BIGINT_LITERAL, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterBigIntLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitBigIntLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitBigIntLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TinyIntLiteralContext extends NumberContext {
        public TinyIntLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode TINYINT_LITERAL() {
            return getToken(SparkScriptSqlParser.TINYINT_LITERAL, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterTinyIntLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitTinyIntLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitTinyIntLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DoubleLiteralContext extends NumberContext {
        public DoubleLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode DOUBLE_LITERAL() {
            return getToken(SparkScriptSqlParser.DOUBLE_LITERAL, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterDoubleLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitDoubleLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitDoubleLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IntegerLiteralContext extends NumberContext {
        public IntegerLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode INTEGER_VALUE() {
            return getToken(SparkScriptSqlParser.INTEGER_VALUE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterIntegerLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitIntegerLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitIntegerLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SmallIntLiteralContext extends NumberContext {
        public SmallIntLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SMALLINT_LITERAL() {
            return getToken(SparkScriptSqlParser.SMALLINT_LITERAL, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterSmallIntLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitSmallIntLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitSmallIntLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ScientificDecimalLiteralContext extends NumberContext {
        public ScientificDecimalLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode SCIENTIFIC_DECIMAL_VALUE() {
            return getToken(SparkScriptSqlParser.SCIENTIFIC_DECIMAL_VALUE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).enterScientificDecimalLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener)
                ((SparkScriptSqlListener) listener).exitScientificDecimalLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitScientificDecimalLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NonReservedContext extends ParserRuleContext {
        public NonReservedContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode SHOW() {
            return getToken(SparkScriptSqlParser.SHOW, 0);
        }

        public TerminalNode TABLES() {
            return getToken(SparkScriptSqlParser.TABLES, 0);
        }

        public TerminalNode COLUMNS() {
            return getToken(SparkScriptSqlParser.COLUMNS, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(SparkScriptSqlParser.COLUMN, 0);
        }

        public TerminalNode PARTITIONS() {
            return getToken(SparkScriptSqlParser.PARTITIONS, 0);
        }

        public TerminalNode FUNCTIONS() {
            return getToken(SparkScriptSqlParser.FUNCTIONS, 0);
        }

        public TerminalNode DATABASES() {
            return getToken(SparkScriptSqlParser.DATABASES, 0);
        }

        public TerminalNode ADD() {
            return getToken(SparkScriptSqlParser.ADD, 0);
        }

        public TerminalNode OVER() {
            return getToken(SparkScriptSqlParser.OVER, 0);
        }

        public TerminalNode PARTITION() {
            return getToken(SparkScriptSqlParser.PARTITION, 0);
        }

        public TerminalNode RANGE() {
            return getToken(SparkScriptSqlParser.RANGE, 0);
        }

        public TerminalNode ROWS() {
            return getToken(SparkScriptSqlParser.ROWS, 0);
        }

        public TerminalNode PRECEDING() {
            return getToken(SparkScriptSqlParser.PRECEDING, 0);
        }

        public TerminalNode FOLLOWING() {
            return getToken(SparkScriptSqlParser.FOLLOWING, 0);
        }

        public TerminalNode CURRENT() {
            return getToken(SparkScriptSqlParser.CURRENT, 0);
        }

        public TerminalNode ROW() {
            return getToken(SparkScriptSqlParser.ROW, 0);
        }

        public TerminalNode MAP() {
            return getToken(SparkScriptSqlParser.MAP, 0);
        }

        public TerminalNode ARRAY() {
            return getToken(SparkScriptSqlParser.ARRAY, 0);
        }

        public TerminalNode STRUCT() {
            return getToken(SparkScriptSqlParser.STRUCT, 0);
        }

        public TerminalNode LATERAL() {
            return getToken(SparkScriptSqlParser.LATERAL, 0);
        }

        public TerminalNode WINDOW() {
            return getToken(SparkScriptSqlParser.WINDOW, 0);
        }

        public TerminalNode REDUCE() {
            return getToken(SparkScriptSqlParser.REDUCE, 0);
        }

        public TerminalNode TRANSFORM() {
            return getToken(SparkScriptSqlParser.TRANSFORM, 0);
        }

        public TerminalNode USING() {
            return getToken(SparkScriptSqlParser.USING, 0);
        }

        public TerminalNode SERDE() {
            return getToken(SparkScriptSqlParser.SERDE, 0);
        }

        public TerminalNode SERDEPROPERTIES() {
            return getToken(SparkScriptSqlParser.SERDEPROPERTIES, 0);
        }

        public TerminalNode RECORDREADER() {
            return getToken(SparkScriptSqlParser.RECORDREADER, 0);
        }

        public TerminalNode DELIMITED() {
            return getToken(SparkScriptSqlParser.DELIMITED, 0);
        }

        public TerminalNode FIELDS() {
            return getToken(SparkScriptSqlParser.FIELDS, 0);
        }

        public TerminalNode TERMINATED() {
            return getToken(SparkScriptSqlParser.TERMINATED, 0);
        }

        public TerminalNode COLLECTION() {
            return getToken(SparkScriptSqlParser.COLLECTION, 0);
        }

        public TerminalNode ITEMS() {
            return getToken(SparkScriptSqlParser.ITEMS, 0);
        }

        public TerminalNode KEYS() {
            return getToken(SparkScriptSqlParser.KEYS, 0);
        }

        public TerminalNode ESCAPED() {
            return getToken(SparkScriptSqlParser.ESCAPED, 0);
        }

        public TerminalNode LINES() {
            return getToken(SparkScriptSqlParser.LINES, 0);
        }

        public TerminalNode SEPARATED() {
            return getToken(SparkScriptSqlParser.SEPARATED, 0);
        }

        public TerminalNode EXTENDED() {
            return getToken(SparkScriptSqlParser.EXTENDED, 0);
        }

        public TerminalNode REFRESH() {
            return getToken(SparkScriptSqlParser.REFRESH, 0);
        }

        public TerminalNode CLEAR() {
            return getToken(SparkScriptSqlParser.CLEAR, 0);
        }

        public TerminalNode CACHE() {
            return getToken(SparkScriptSqlParser.CACHE, 0);
        }

        public TerminalNode UNCACHE() {
            return getToken(SparkScriptSqlParser.UNCACHE, 0);
        }

        public TerminalNode LAZY() {
            return getToken(SparkScriptSqlParser.LAZY, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SparkScriptSqlParser.TEMPORARY, 0);
        }

        public TerminalNode OPTIONS() {
            return getToken(SparkScriptSqlParser.OPTIONS, 0);
        }

        public TerminalNode GROUPING() {
            return getToken(SparkScriptSqlParser.GROUPING, 0);
        }

        public TerminalNode CUBE() {
            return getToken(SparkScriptSqlParser.CUBE, 0);
        }

        public TerminalNode ROLLUP() {
            return getToken(SparkScriptSqlParser.ROLLUP, 0);
        }

        public TerminalNode EXPLAIN() {
            return getToken(SparkScriptSqlParser.EXPLAIN, 0);
        }

        public TerminalNode FORMAT() {
            return getToken(SparkScriptSqlParser.FORMAT, 0);
        }

        public TerminalNode LOGICAL() {
            return getToken(SparkScriptSqlParser.LOGICAL, 0);
        }

        public TerminalNode FORMATTED() {
            return getToken(SparkScriptSqlParser.FORMATTED, 0);
        }

        public TerminalNode CODEGEN() {
            return getToken(SparkScriptSqlParser.CODEGEN, 0);
        }

        public TerminalNode TABLESAMPLE() {
            return getToken(SparkScriptSqlParser.TABLESAMPLE, 0);
        }

        public TerminalNode USE() {
            return getToken(SparkScriptSqlParser.USE, 0);
        }

        public List<TerminalNode> TO() {
            return getTokens(SparkScriptSqlParser.TO);
        }

        public TerminalNode TO(int i) {
            return getToken(SparkScriptSqlParser.TO, i);
        }

        public TerminalNode BUCKET() {
            return getToken(SparkScriptSqlParser.BUCKET, 0);
        }

        public TerminalNode PERCENTLIT() {
            return getToken(SparkScriptSqlParser.PERCENTLIT, 0);
        }

        public TerminalNode OUT() {
            return getToken(SparkScriptSqlParser.OUT, 0);
        }

        public TerminalNode OF() {
            return getToken(SparkScriptSqlParser.OF, 0);
        }

        public TerminalNode SET() {
            return getToken(SparkScriptSqlParser.SET, 0);
        }

        public TerminalNode RESET() {
            return getToken(SparkScriptSqlParser.RESET, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SparkScriptSqlParser.VIEW, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(SparkScriptSqlParser.REPLACE, 0);
        }

        public TerminalNode IF() {
            return getToken(SparkScriptSqlParser.IF, 0);
        }

        public TerminalNode NO() {
            return getToken(SparkScriptSqlParser.NO, 0);
        }

        public TerminalNode DATA() {
            return getToken(SparkScriptSqlParser.DATA, 0);
        }

        public TerminalNode START() {
            return getToken(SparkScriptSqlParser.START, 0);
        }

        public TerminalNode TRANSACTION() {
            return getToken(SparkScriptSqlParser.TRANSACTION, 0);
        }

        public TerminalNode COMMIT() {
            return getToken(SparkScriptSqlParser.COMMIT, 0);
        }

        public TerminalNode ROLLBACK() {
            return getToken(SparkScriptSqlParser.ROLLBACK, 0);
        }

        public TerminalNode SORT() {
            return getToken(SparkScriptSqlParser.SORT, 0);
        }

        public TerminalNode CLUSTER() {
            return getToken(SparkScriptSqlParser.CLUSTER, 0);
        }

        public TerminalNode DISTRIBUTE() {
            return getToken(SparkScriptSqlParser.DISTRIBUTE, 0);
        }

        public TerminalNode UNSET() {
            return getToken(SparkScriptSqlParser.UNSET, 0);
        }

        public TerminalNode TBLPROPERTIES() {
            return getToken(SparkScriptSqlParser.TBLPROPERTIES, 0);
        }

        public TerminalNode SKEWED() {
            return getToken(SparkScriptSqlParser.SKEWED, 0);
        }

        public TerminalNode STORED() {
            return getToken(SparkScriptSqlParser.STORED, 0);
        }

        public TerminalNode DIRECTORIES() {
            return getToken(SparkScriptSqlParser.DIRECTORIES, 0);
        }

        public TerminalNode LOCATION() {
            return getToken(SparkScriptSqlParser.LOCATION, 0);
        }

        public TerminalNode EXCHANGE() {
            return getToken(SparkScriptSqlParser.EXCHANGE, 0);
        }

        public TerminalNode ARCHIVE() {
            return getToken(SparkScriptSqlParser.ARCHIVE, 0);
        }

        public TerminalNode UNARCHIVE() {
            return getToken(SparkScriptSqlParser.UNARCHIVE, 0);
        }

        public TerminalNode FILEFORMAT() {
            return getToken(SparkScriptSqlParser.FILEFORMAT, 0);
        }

        public TerminalNode TOUCH() {
            return getToken(SparkScriptSqlParser.TOUCH, 0);
        }

        public TerminalNode COMPACT() {
            return getToken(SparkScriptSqlParser.COMPACT, 0);
        }

        public TerminalNode CONCATENATE() {
            return getToken(SparkScriptSqlParser.CONCATENATE, 0);
        }

        public TerminalNode CHANGE() {
            return getToken(SparkScriptSqlParser.CHANGE, 0);
        }

        public TerminalNode CASCADE() {
            return getToken(SparkScriptSqlParser.CASCADE, 0);
        }

        public TerminalNode RESTRICT() {
            return getToken(SparkScriptSqlParser.RESTRICT, 0);
        }

        public TerminalNode BUCKETS() {
            return getToken(SparkScriptSqlParser.BUCKETS, 0);
        }

        public TerminalNode CLUSTERED() {
            return getToken(SparkScriptSqlParser.CLUSTERED, 0);
        }

        public TerminalNode SORTED() {
            return getToken(SparkScriptSqlParser.SORTED, 0);
        }

        public TerminalNode PURGE() {
            return getToken(SparkScriptSqlParser.PURGE, 0);
        }

        public TerminalNode INPUTFORMAT() {
            return getToken(SparkScriptSqlParser.INPUTFORMAT, 0);
        }

        public TerminalNode OUTPUTFORMAT() {
            return getToken(SparkScriptSqlParser.OUTPUTFORMAT, 0);
        }

        public TerminalNode DBPROPERTIES() {
            return getToken(SparkScriptSqlParser.DBPROPERTIES, 0);
        }

        public TerminalNode DFS() {
            return getToken(SparkScriptSqlParser.DFS, 0);
        }

        public TerminalNode TRUNCATE() {
            return getToken(SparkScriptSqlParser.TRUNCATE, 0);
        }

        public TerminalNode COMPUTE() {
            return getToken(SparkScriptSqlParser.COMPUTE, 0);
        }

        public TerminalNode LIST() {
            return getToken(SparkScriptSqlParser.LIST, 0);
        }

        public TerminalNode STATISTICS() {
            return getToken(SparkScriptSqlParser.STATISTICS, 0);
        }

        public TerminalNode ANALYZE() {
            return getToken(SparkScriptSqlParser.ANALYZE, 0);
        }

        public TerminalNode PARTITIONED() {
            return getToken(SparkScriptSqlParser.PARTITIONED, 0);
        }

        public TerminalNode EXTERNAL() {
            return getToken(SparkScriptSqlParser.EXTERNAL, 0);
        }

        public TerminalNode DEFINED() {
            return getToken(SparkScriptSqlParser.DEFINED, 0);
        }

        public TerminalNode RECORDWRITER() {
            return getToken(SparkScriptSqlParser.RECORDWRITER, 0);
        }

        public TerminalNode REVOKE() {
            return getToken(SparkScriptSqlParser.REVOKE, 0);
        }

        public TerminalNode GRANT() {
            return getToken(SparkScriptSqlParser.GRANT, 0);
        }

        public TerminalNode LOCK() {
            return getToken(SparkScriptSqlParser.LOCK, 0);
        }

        public TerminalNode UNLOCK() {
            return getToken(SparkScriptSqlParser.UNLOCK, 0);
        }

        public TerminalNode MSCK() {
            return getToken(SparkScriptSqlParser.MSCK, 0);
        }

        public TerminalNode REPAIR() {
            return getToken(SparkScriptSqlParser.REPAIR, 0);
        }

        public TerminalNode EXPORT() {
            return getToken(SparkScriptSqlParser.EXPORT, 0);
        }

        public TerminalNode IMPORT() {
            return getToken(SparkScriptSqlParser.IMPORT, 0);
        }

        public TerminalNode LOAD() {
            return getToken(SparkScriptSqlParser.LOAD, 0);
        }

        public TerminalNode VALUES() {
            return getToken(SparkScriptSqlParser.VALUES, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SparkScriptSqlParser.COMMENT, 0);
        }

        public TerminalNode ROLE() {
            return getToken(SparkScriptSqlParser.ROLE, 0);
        }

        public TerminalNode ROLES() {
            return getToken(SparkScriptSqlParser.ROLES, 0);
        }

        public TerminalNode COMPACTIONS() {
            return getToken(SparkScriptSqlParser.COMPACTIONS, 0);
        }

        public TerminalNode PRINCIPALS() {
            return getToken(SparkScriptSqlParser.PRINCIPALS, 0);
        }

        public TerminalNode TRANSACTIONS() {
            return getToken(SparkScriptSqlParser.TRANSACTIONS, 0);
        }

        public TerminalNode INDEX() {
            return getToken(SparkScriptSqlParser.INDEX, 0);
        }

        public TerminalNode INDEXES() {
            return getToken(SparkScriptSqlParser.INDEXES, 0);
        }

        public TerminalNode LOCKS() {
            return getToken(SparkScriptSqlParser.LOCKS, 0);
        }

        public TerminalNode OPTION() {
            return getToken(SparkScriptSqlParser.OPTION, 0);
        }

        public TerminalNode LOCAL() {
            return getToken(SparkScriptSqlParser.LOCAL, 0);
        }

        public TerminalNode INPATH() {
            return getToken(SparkScriptSqlParser.INPATH, 0);
        }

        public TerminalNode ASC() {
            return getToken(SparkScriptSqlParser.ASC, 0);
        }

        public TerminalNode DESC() {
            return getToken(SparkScriptSqlParser.DESC, 0);
        }

        public TerminalNode LIMIT() {
            return getToken(SparkScriptSqlParser.LIMIT, 0);
        }

        public TerminalNode RENAME() {
            return getToken(SparkScriptSqlParser.RENAME, 0);
        }

        public TerminalNode SETS() {
            return getToken(SparkScriptSqlParser.SETS, 0);
        }

        public TerminalNode AT() {
            return getToken(SparkScriptSqlParser.AT, 0);
        }

        public TerminalNode NULLS() {
            return getToken(SparkScriptSqlParser.NULLS, 0);
        }

        public TerminalNode OVERWRITE() {
            return getToken(SparkScriptSqlParser.OVERWRITE, 0);
        }

        public TerminalNode ALL() {
            return getToken(SparkScriptSqlParser.ALL, 0);
        }

        public TerminalNode ALTER() {
            return getToken(SparkScriptSqlParser.ALTER, 0);
        }

        public TerminalNode AS() {
            return getToken(SparkScriptSqlParser.AS, 0);
        }

        public TerminalNode BETWEEN() {
            return getToken(SparkScriptSqlParser.BETWEEN, 0);
        }

        public TerminalNode BY() {
            return getToken(SparkScriptSqlParser.BY, 0);
        }

        public TerminalNode CREATE() {
            return getToken(SparkScriptSqlParser.CREATE, 0);
        }

        public TerminalNode DELETE() {
            return getToken(SparkScriptSqlParser.DELETE, 0);
        }

        public TerminalNode DESCRIBE() {
            return getToken(SparkScriptSqlParser.DESCRIBE, 0);
        }

        public TerminalNode DROP() {
            return getToken(SparkScriptSqlParser.DROP, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SparkScriptSqlParser.EXISTS, 0);
        }

        public TerminalNode FALSE() {
            return getToken(SparkScriptSqlParser.FALSE, 0);
        }

        public TerminalNode FOR() {
            return getToken(SparkScriptSqlParser.FOR, 0);
        }

        public TerminalNode GROUP() {
            return getToken(SparkScriptSqlParser.GROUP, 0);
        }

        public TerminalNode IN() {
            return getToken(SparkScriptSqlParser.IN, 0);
        }

        public TerminalNode INSERT() {
            return getToken(SparkScriptSqlParser.INSERT, 0);
        }

        public TerminalNode INTO() {
            return getToken(SparkScriptSqlParser.INTO, 0);
        }

        public TerminalNode IS() {
            return getToken(SparkScriptSqlParser.IS, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SparkScriptSqlParser.LIKE, 0);
        }

        public TerminalNode NULL() {
            return getToken(SparkScriptSqlParser.NULL, 0);
        }

        public TerminalNode ORDER() {
            return getToken(SparkScriptSqlParser.ORDER, 0);
        }

        public TerminalNode OUTER() {
            return getToken(SparkScriptSqlParser.OUTER, 0);
        }

        public List<TerminalNode> TABLE() {
            return getTokens(SparkScriptSqlParser.TABLE);
        }

        public TerminalNode TABLE(int i) {
            return getToken(SparkScriptSqlParser.TABLE, i);
        }

        public TerminalNode TRUE() {
            return getToken(SparkScriptSqlParser.TRUE, 0);
        }

        public List<TerminalNode> WITH() {
            return getTokens(SparkScriptSqlParser.WITH);
        }

        public TerminalNode WITH(int i) {
            return getToken(SparkScriptSqlParser.WITH, i);
        }

        public TerminalNode RLIKE() {
            return getToken(SparkScriptSqlParser.RLIKE, 0);
        }

        public TerminalNode AND() {
            return getToken(SparkScriptSqlParser.AND, 0);
        }

        public TerminalNode CASE() {
            return getToken(SparkScriptSqlParser.CASE, 0);
        }

        public TerminalNode CAST() {
            return getToken(SparkScriptSqlParser.CAST, 0);
        }

        public TerminalNode DISTINCT() {
            return getToken(SparkScriptSqlParser.DISTINCT, 0);
        }

        public TerminalNode DIV() {
            return getToken(SparkScriptSqlParser.DIV, 0);
        }

        public TerminalNode ELSE() {
            return getToken(SparkScriptSqlParser.ELSE, 0);
        }

        public TerminalNode END() {
            return getToken(SparkScriptSqlParser.END, 0);
        }

        public TerminalNode FUNCTION() {
            return getToken(SparkScriptSqlParser.FUNCTION, 0);
        }

        public TerminalNode INTERVAL() {
            return getToken(SparkScriptSqlParser.INTERVAL, 0);
        }

        public TerminalNode MACRO() {
            return getToken(SparkScriptSqlParser.MACRO, 0);
        }

        public TerminalNode OR() {
            return getToken(SparkScriptSqlParser.OR, 0);
        }

        public TerminalNode STRATIFY() {
            return getToken(SparkScriptSqlParser.STRATIFY, 0);
        }

        public TerminalNode THEN() {
            return getToken(SparkScriptSqlParser.THEN, 0);
        }

        public TerminalNode UNBOUNDED() {
            return getToken(SparkScriptSqlParser.UNBOUNDED, 0);
        }

        public TerminalNode WHEN() {
            return getToken(SparkScriptSqlParser.WHEN, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(SparkScriptSqlParser.DATABASE, 0);
        }

        public TerminalNode SELECT() {
            return getToken(SparkScriptSqlParser.SELECT, 0);
        }

        public TerminalNode FROM() {
            return getToken(SparkScriptSqlParser.FROM, 0);
        }

        public TerminalNode WHERE() {
            return getToken(SparkScriptSqlParser.WHERE, 0);
        }

        public TerminalNode HAVING() {
            return getToken(SparkScriptSqlParser.HAVING, 0);
        }

        public TerminalNode NOT() {
            return getToken(SparkScriptSqlParser.NOT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nonReserved;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).enterNonReserved(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SparkScriptSqlListener) ((SparkScriptSqlListener) listener).exitNonReserved(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SparkScriptSqlVisitor)
                return ((SparkScriptSqlVisitor<? extends T>) visitor).visitNonReserved(this);
            else return visitor.visitChildren(this);
        }
    }
}
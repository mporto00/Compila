/* Generated By:JavaCC: Do not edit this line. FunConstants.java */
package parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface FunConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int ASSIGN = 12;
  /** RegularExpression Id. */
  int GT = 13;
  /** RegularExpression Id. */
  int LT = 14;
  /** RegularExpression Id. */
  int EQ = 15;
  /** RegularExpression Id. */
  int LE = 16;
  /** RegularExpression Id. */
  int GE = 17;
  /** RegularExpression Id. */
  int NEQ = 18;
  /** RegularExpression Id. */
  int PLUS = 19;
  /** RegularExpression Id. */
  int MINUS = 20;
  /** RegularExpression Id. */
  int MULTIPLY = 21;
  /** RegularExpression Id. */
  int DIVIDE = 22;
  /** RegularExpression Id. */
  int REM = 23;
  /** RegularExpression Id. */
  int AND = 24;
  /** RegularExpression Id. */
  int OR = 25;
  /** RegularExpression Id. */
  int XOR = 26;
  /** RegularExpression Id. */
  int NOT = 27;
  /** RegularExpression Id. */
  int SEMICOLON = 28;
  /** RegularExpression Id. */
  int COMMA = 29;
  /** RegularExpression Id. */
  int LPAREN = 30;
  /** RegularExpression Id. */
  int RPAREN = 31;
  /** RegularExpression Id. */
  int LBRACKET = 32;
  /** RegularExpression Id. */
  int RBRACKET = 33;
  /** RegularExpression Id. */
  int LBRACE = 34;
  /** RegularExpression Id. */
  int RBRACE = 35;
  /** RegularExpression Id. */
  int DOT = 36;
  /** RegularExpression Id. */
  int BREAK = 37;
  /** RegularExpression Id. */
  int CLASS = 38;
  /** RegularExpression Id. */
  int CONSTRUCTOR = 39;
  /** RegularExpression Id. */
  int ELSE = 40;
  /** RegularExpression Id. */
  int EXTENDS = 41;
  /** RegularExpression Id. */
  int FOR = 42;
  /** RegularExpression Id. */
  int IF = 43;
  /** RegularExpression Id. */
  int INT = 44;
  /** RegularExpression Id. */
  int NEW = 45;
  /** RegularExpression Id. */
  int PRINT = 46;
  /** RegularExpression Id. */
  int READ = 47;
  /** RegularExpression Id. */
  int RETURN = 48;
  /** RegularExpression Id. */
  int STRING = 49;
  /** RegularExpression Id. */
  int SUPER = 50;
  /** RegularExpression Id. */
  int END = 51;
  /** RegularExpression Id. */
  int SUB = 52;
  /** RegularExpression Id. */
  int LET = 53;
  /** RegularExpression Id. */
  int CALL = 54;
  /** RegularExpression Id. */
  int THEN = 55;
  /** RegularExpression Id. */
  int CASE = 56;
  /** RegularExpression Id. */
  int INPUT = 57;
  /** RegularExpression Id. */
  int SELECT = 58;
  /** RegularExpression Id. */
  int STATIC = 59;
  /** RegularExpression Id. */
  int WHILE = 60;
  /** RegularExpression Id. */
  int DO = 61;
  /** RegularExpression Id. */
  int SWITCH = 62;
  /** RegularExpression Id. */
  int DEFAULTT = 63;
  /** RegularExpression Id. */
  int DOUBLE = 64;
  /** RegularExpression Id. */
  int BYTE = 65;
  /** RegularExpression Id. */
  int SHORT = 66;
  /** RegularExpression Id. */
  int LONG = 67;
  /** RegularExpression Id. */
  int FINAL = 68;
  /** RegularExpression Id. */
  int PUBLIC = 69;
  /** RegularExpression Id. */
  int PRIVATE = 70;
  /** RegularExpression Id. */
  int PROTECTED = 71;
  /** RegularExpression Id. */
  int DIGIT = 72;
  /** RegularExpression Id. */
  int CONSTANT = 73;
  /** RegularExpression Id. */
  int IDENTIFIER = 74;
  /** RegularExpression Id. */
  int LETTER = 75;
  /** RegularExpression Id. */
  int FLOAT = 76;
  /** RegularExpression Id. */
  int LOGIC_CONSTANT = 77;
  /** RegularExpression Id. */
  int CHAR = 78;
  /** RegularExpression Id. */
  int byte_constant = 79;
  /** RegularExpression Id. */
  int short_constant = 80;
  /** RegularExpression Id. */
  int int_constant = 81;
  /** RegularExpression Id. */
  int long_constant = 82;
  /** RegularExpression Id. */
  int float_constant = 83;
  /** RegularExpression Id. */
  int double_constant = 84;
  /** RegularExpression Id. */
  int char_constant = 85;
  /** RegularExpression Id. */
  int string_constant = 86;
  /** RegularExpression Id. */
  int null_constant = 87;
  /** RegularExpression Id. */
  int INVALID_LEXICAL = 88;
  /** RegularExpression Id. */
  int INVALID_CONST = 89;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int multilinecomment = 1;
  /** Lexical state. */
  int singlelinecomment = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\f\"",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 8>",
    "\"//\"",
    "<token of kind 10>",
    "<token of kind 11>",
    "\"=\"",
    "\">\"",
    "\"<\"",
    "\"==\"",
    "\"<=\"",
    "\">=\"",
    "\"!=\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"&&\"",
    "\"||\"",
    "\"^\"",
    "\"!\"",
    "\";\"",
    "\",\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"{\"",
    "\"}\"",
    "\".\"",
    "\"break\"",
    "\"class\"",
    "\"constructor\"",
    "\"else\"",
    "\"extends\"",
    "\"for\"",
    "\"if\"",
    "\"int\"",
    "\"new\"",
    "\"print\"",
    "\"read\"",
    "\"return\"",
    "\"string\"",
    "\"super\"",
    "\"end\"",
    "\"sub\"",
    "\"let\"",
    "\"call\"",
    "\"then\"",
    "\"case\"",
    "\"input\"",
    "\"select\"",
    "\"static\"",
    "\"while\"",
    "\"do\"",
    "\"switch\"",
    "\"default\"",
    "\"double\"",
    "\"byte\"",
    "\"short\"",
    "\"long\"",
    "\"final\"",
    "\"public\"",
    "\"private\"",
    "\"protected\"",
    "<DIGIT>",
    "<CONSTANT>",
    "<IDENTIFIER>",
    "<LETTER>",
    "<FLOAT>",
    "<LOGIC_CONSTANT>",
    "<CHAR>",
    "<byte_constant>",
    "<short_constant>",
    "<int_constant>",
    "<long_constant>",
    "<float_constant>",
    "<double_constant>",
    "<char_constant>",
    "<string_constant>",
    "\"null\"",
    "<INVALID_LEXICAL>",
    "<INVALID_CONST>",
  };

}

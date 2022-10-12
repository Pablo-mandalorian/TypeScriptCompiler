/**
   This is a small example of a standalone text substitution scanner 
   It reads a name after the keyword name and substitutes all occurences 
   of "hello" with "hello <name>!". There is a sample input file 
   "sample.inp" provided in this directory 
*/

package back.analizador;
import lexico.*;
import java_cup.runtime.*;
import jflex.sym;


%%

%public
%class Lexico
%cup
%unicode
%column
%line
%char
%unicode

%{

StringBuffer string = new StringBuffer();

      private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
      }
      private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
      }

%}

/* comments */
    Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
    TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    // Comment can be the last line of the file, without line terminator.
    EndOfLineComment     = "//"
    DocumentationComment = "/**" {CommentContent} "*"+ "/"
    CommentContent       = ( [^*] | \*+ [^/*] )*
    WhiteSpace = [\n\r\t ] 

    Identifier = [:jletter:] [:jletterdigit:]*

    DecIntegerLiteral = 0 | [1-9][0-9]*

%state STRING

%%

/* RESERVED WORDS */
    "case"           { return symbol(ReservedWords.CASE.value,yytext()); }
    "catch"        { return symbol(ReservedWords.CATCH.value,yytext()); }
    "break"          { return symbol(ReservedWords.BREAK.value,yytext()); }
    "class"           { return symbol(ReservedWords.CLASS.value,yytext()); }
    "const"        { return symbol(ReservedWords.CONST.value,yytext()); }
    "continue"          { return symbol(ReservedWords.CONTINUE.value,yytext()); }
    "debugger"           { return symbol(ReservedWords.DEBUGGER.value,yytext()); }
    "default"        { return symbol(ReservedWords.DEFAULT.value,yytext()); }
    "delete"          { return symbol(ReservedWords.DELETE.value,yytext()); }
    "do"           { return symbol(ReservedWords.DO.value,yytext()); }
    "else"        { return symbol(ReservedWords.ELSE.value,yytext()); }
    "enum"          { return symbol(ReservedWords.ENUM.value,yytext()); }  
    "export"           { return symbol(ReservedWords.EXPORT.value,yytext()); }
    "extends"        { return symbol(ReservedWords.EXTENDS.value,yytext()); }
    "false"          { return symbol(ReservedWords.FALSE.value,yytext()); }
    "finally"           { return symbol(ReservedWords.FINALLY.value,yytext()); }
    "for"        { return symbol(ReservedWords.FOR.value,yytext()); }
    "function"          { return symbol(ReservedWords.FUNCTION.value,yytext()); }
    "if"           { return symbol(ReservedWords.IF.value,yytext()); }
    "import"        { return symbol(ReservedWords.IMPORT.value,yytext()); }
    "in"          { return symbol(ReservedWords.IN.value,yytext()); }
    "instanceof"           { return symbol(ReservedWords.INSTANCEOF.value,yytext()); }
    "null"        { return symbol(ReservedWords.NULL.value,yytext()); }
    "new"          { return symbol(ReservedWords.NEW.value,yytext()); }
    "return"           { return symbol(ReservedWords.RETURN.value,yytext()); }
    "super"        { return symbol(ReservedWords.SUPER.value,yytext()); }
    "switch"          { return symbol(ReservedWords.SWITCH.value,yytext()); }
    "this"           { return symbol(ReservedWords.THIS.value,yytext()); }
    "throw"        { return symbol(ReservedWords.THROW.value,yytext()); }
    "true"          { return symbol(ReservedWords.TRUE.value,yytext()); }
    "try"           { return symbol(ReservedWords.TRY.value,yytext()); }
    "typeof"        { return symbol(ReservedWords.TYPEOF.value,yytext()); }
    "var"          { return symbol(ReservedWords.VAR.value,yytext()); }
    "void"           { return symbol(ReservedWords.VOID.value,yytext()); }
    "while"        { return symbol(ReservedWords.WHILE.value,yytext()); }
    "with"          { return symbol(ReservedWords.WITH.value,yytext()); }
    "case"           { return symbol(ReservedWords.CASE.value,yytext()); }
    "catch"        { return symbol(ReservedWords.CATCH.value,yytext()); }
    "break"          { return symbol(ReservedWords.BREAK.value,yytext()); }
    /* Operators */
    "+"        { return symbol(ReservedWords.SUMA.value,yytext()); }
    "-"          { return symbol(ReservedWords.RESTA.value,yytext()); }
    "/"           { return symbol(ReservedWords.DIVISION.value,yytext()); }
    "*"        { return symbol(ReservedWords.MULTIPLICACION.value,yytext()); }
    ">"          { return symbol(ReservedWords.MAYOR.value,yytext()); }
    "<"           { return symbol(ReservedWords.MENOR.value,yytext()); }
    "<="        { return symbol(ReservedWords.MENORIGUAL.value,yytext()); }
    ">="          { return symbol(ReservedWords.MAYORIGUAL.value,yytext()); }
    "!="           { return symbol(ReservedWords.DIFERENTEDE.value,yytext()); }
    "%"        { return symbol(ReservedWords.MODULO.value,yytext()); }
    "=="          { return symbol(ReservedWords.IGUALIGUAL.value,yytext()); }

/* CONTEXTUAL KEYWORDS */
    "any"           { return symbol(ContextualKeywords.ANY.value,yytext()); }
    "boolean"        { return symbol(ContextualKeywords.BOOLEAN.value,yytext()); }
    "constructor"          { return symbol(ContextualKeywords.CONSTRUCTOR.value,yytext()); }
    "declare"           { return symbol(ContextualKeywords.DECLARE.value,yytext()); }
    "get"        { return symbol(ContextualKeywords.GET.value,yytext()); }
    "module"          { return symbol(ContextualKeywords.MODULE.value,yytext()); }
    "require"           { return symbol(ContextualKeywords.REQUIRE.value,yytext()); }
    "number"        { return symbol(ContextualKeywords.NUMBER.value,yytext()); }
    "set"          { return symbol(ContextualKeywords.SET.value,yytext()); }
    "string"           { return symbol(ContextualKeywords.STRING.value,yytext()); }
    "type"        { return symbol(ContextualKeywords.TYPE.value,yytext()); }
    "from"          { return symbol(ContextualKeywords.FROM.value,yytext()); }
    "of"           { return symbol(ContextualKeywords.OF.value,yytext()); }

/* STRIC MODE RESERVED KEYWORDS */
    <YYINITIAL> "as"           { return symbol(StrictmodeReservedwords.AS.value,yytext()); }
    <YYINITIAL> "implements"        { return symbol(StrictmodeReservedwords.IMPLEMENTS.value,yytext()); }
    <YYINITIAL> "let"          { return symbol(StrictmodeReservedwords.LET.value,yytext()); }
    <YYINITIAL> "package"           { return symbol(StrictmodeReservedwords.PACKAGE.value,yytext()); }
    <YYINITIAL> "private"        { return symbol(StrictmodeReservedwords.PRIVATE.value,yytext()); }
    <YYINITIAL> "protected"          { return symbol(StrictmodeReservedwords.PROTECTED.value,yytext()); }
    <YYINITIAL> "public"           { return symbol(StrictmodeReservedwords.PUBLIC.value,yytext()); }
    <YYINITIAL> "static"        { return symbol(StrictmodeReservedwords.STATIC.value,yytext()); }
    <YYINITIAL> "yield"          { return symbol(StrictmodeReservedwords.YIELD.value,yytext()); }
    <YYINITIAL> "console"          { return symbol(StrictmodeReservedwords.CONSOLE.value,yytext()); }
    <YYINITIAL> "log"          { return symbol(StrictmodeReservedwords.LOG.value,yytext()); }

    /* Simbolos */ 
    "{"          { return symbol(StrictmodeReservedwords.LLAVE_APERTURA.value,yytext()); }
    "}"          { return symbol(StrictmodeReservedwords.LLAVE_CIERRE.value,yytext()); }
    "("          { return symbol(StrictmodeReservedwords.PARENTESIS_APERTURA.value,yytext()); }
    ")"          { return symbol(StrictmodeReservedwords.PARENTESIS_CIERRE.value,yytext()); }
    ";"          { return symbol(StrictmodeReservedwords.PUNTO_COMA.value,yytext()); }
    ":"          { return symbol(StrictmodeReservedwords.DOS_PUNTOS.value,yytext()); }
    "."          { return symbol(StrictmodeReservedwords.PUNTO.value,yytext()); }
    "'"          { return symbol(StrictmodeReservedwords.COMILLA_SIMPLE.value,yytext()); }
    "\";\""      { return symbol(StrictmodeReservedwords.COMILLAS_DOBLES.value,yytext()); }
    ","          { return symbol(StrictmodeReservedwords.COMA.value,yytext()); }
    "="          { return symbol(StrictmodeReservedwords.IGUAL.value,yytext()); }

    /* Comments */
    {Comment}               { return symbol(StrictmodeReservedwords.COMENTARIO.value,yytext()); }

    /* WhiteSpace */ 
    {WhiteSpace}            { return symbol(StrictmodeReservedwords.ESPACIO.value,yytext()); }
    
     /* Identificador */
    {Identifier}    { return symbol(StrictmodeReservedwords.IDENTIFICADOR.value,yytext()); }

    /* Numeros */
    {DecIntegerLiteral}    { return symbol(StrictmodeReservedwords.NUMEROS.value,yytext()); }

    <STRING> {
      \"                             { yybegin(YYINITIAL); 
                                       return symbol(StrictmodeReservedwords.STRING_LITERAL.value, 
                                       string.toString()); }
      [^\n\r\"\\]+                   { string.append( yytext() ); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }

      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
    }

    /* error fallback */
    [^]                              { throw new Error("Illegal character **"+
                                                        yytext()+"**"); }
    
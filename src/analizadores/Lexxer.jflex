package analizadores;
import java_cup.runtime.Symbol; 

%% 
%class Lexico
%public 
%line 
%char 
%cup 
%unicode
%ignorecase

%init{ 
    yyline = 1; 
    yychar = 1; 
%init} 
 
BLANCOS=[ \r\t]+
CADENACOMILLASDOBLES = [\"]([^\"\n]|(\\\"))*[\"]
D=[0-9]+
DD=[0-9]+("."[  |0-9]+)?
ID=[A-Za-z]+["_"0-9A-Za-z]*
COMENTUNILINEA =("//".*\r\n)|("//".*\n)|("//".*\r)
COMENTMULTILINEA ="/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"
%%

{COMENTUNILINEA} {} 
{COMENTMULTILINEA} {}  
{CADENACOMILLASDOBLES} {return new Symbol(sym.CADENA,yyline,yychar, (yytext()).substring(1,yytext().length()-1));} 

"console.log" {return new Symbol(sym.RIMPRIMIR,yyline,yychar, yytext());} 
"number" {return new Symbol(sym.RNUMERO,yyline,yychar, yytext());} 
"while" {return new Symbol(sym.RMIENTRAS,yyline,yychar, yytext());} 
"if" {return new Symbol(sym.RIF,yyline,yychar, yytext());} 
"else" {return new Symbol(sym.RELSE,yyline,yychar, yytext());} 

";" {return new Symbol(sym.PTCOMA,yyline,yychar, yytext());} 
"{" {return new Symbol(sym.LLAVIZQ,yyline,yychar, yytext());} 
"}" {return new Symbol(sym.LLAVDER,yyline,yychar, yytext());} 
"(" {return new Symbol(sym.PARIZQ,yyline,yychar, yytext());} 
")" {return new Symbol(sym.PARDER,yyline,yychar, yytext());} 
"+" {return new Symbol(sym.MAS,yyline,yychar, yytext());} 
"-" {return new Symbol(sym.MENOS,yyline,yychar, yytext());} 
"*" {return new Symbol(sym.POR,yyline,yychar, yytext());} 
"/" {return new Symbol(sym.DIVIDIDO,yyline,yychar, yytext());} 
"&" {return new Symbol(sym.CONCAT,yyline,yychar, yytext());} 
"<" {return new Symbol(sym.MENQUE,yyline,yychar, yytext());} 
">" {return new Symbol(sym.MAYQUE,yyline,yychar, yytext());} 
"=" {return new Symbol(sym.IGUAL,yyline,yychar, yytext());}
"==" {return new Symbol(sym.IGUALQUE,yyline,yychar, yytext());}
"!=" {return new Symbol(sym.NIGUALQUE,yyline,yychar, yytext());}

/* RESERVED WORDS */
"case"           { return symbol(sym.CASE,yyline,yychar,yytext()); }
"catch"        { return symbol(sym.CATCH,yyline,yychar,yytext()); }
"break"          { return symbol(sym.BREAK,yyline,yychar,yytext()); }
"class"           { return symbol(sym.CLASS,yyline,yychar,yytext()); }
"const"        { return symbol(sym.CONST,yyline,yychar,yytext()); }
"continue"          { return symbol(sym.CONTINUE,yyline,yychar,yytext()); }
"debugger"           { return symbol(sym.DEBUGGER,yyline,yychar,yytext()); }
"default"        { return symbol(sym.DEFAULT,yyline,yychar,yytext()); }
"delete"          { return symbol(sym.DELETE,yyline,yychar,yytext()); }
"do"           { return symbol(sym.DO,yyline,yychar,yytext()); }
"enum"          { return symbol(sym.ENUM,yyline,yychar,yytext()); }  
"export"           { return symbol(sym.EXPORT,yyline,yychar,yytext()); }
"extends"        { return symbol(sym.EXTENDS,yyline,yychar,yytext()); }
"false"          { return symbol(sym.FALSE,yyline,yychar,yytext()); }
"finally"           { return symbol(sym.FINALLY,yyline,yychar,yytext()); }
"for"        { return symbol(sym.FOR,yyline,yychar,yytext()); }
"function"          { return symbol(sym.FUNCTION,yyline,yychar,yytext()); }
"import"        { return symbol(sym.IMPORT,yyline,yychar,yytext()); }
"in"          { return symbol(sym.IN,yyline,yychar,yytext()); }
"instanceof"           { return symbol(sym.INSTANCEOF,yyline,yychar,yytext()); }
"null"        { return symbol(sym.NULL,yyline,yychar,yytext()); }
"new"          { return symbol(sym.NEW,yyline,yychar,yytext()); }
"return"           { return symbol(sym.RETURN,yyline,yychar,yytext()); }
"super"        { return symbol(sym.SUPER,yyline,yychar,yytext()); }
"switch"          { return symbol(sym.SWITCH,yyline,yychar,yytext()); }
"this"           { return symbol(sym.THIS,yyline,yychar,yytext()); }
"throw"        { return symbol(sym.THROW,yyline,yychar,yytext()); }
"true"          { return symbol(sym.TRUE,yyline,yychar,yytext()); }
"try"           { return symbol(sym.TRY,yyline,yychar,yytext()); }
"typeof"        { return symbol(sym.TYPEOF,yyline,yychar,yytext()); }
"var"          { return symbol(sym.VAR,yyline,yychar,yytext()); }
"void"           { return symbol(sym.VOID,yyline,yychar,yytext()); }
"with"          { return symbol(sym.WITH,yyline,yychar,yytext()); }
"case"           { return symbol(sym.CASE,yyline,yychar,yytext()); }
"break"          { return symbol(sym.BREAK,yyline,yychar,yytext()); }
   

/* CONTEXTUAL KEYWORDS */
"any"           { return symbol(sym.ANY,yyline,yychar,yytext()); }
"boolean"        { return symbol(sym.BOOLEAN,yyline,yychar,yytext()); }
"constructor"          { return symbol(sym.CONSTRUCTOR,yyline,yychar,yytext()); }
"declare"           { return symbol(sym.DECLARE,yyline,yychar,yytext()); }
"get"        { return symbol(sym.GET,yyline,yychar,yytext()); }
"module"          { return symbol(sym.MODULE,yyline,yychar,yytext()); }
"require"           { return symbol(sym.REQUIRE,yyline,yychar,yytext()); }
"set"          { return symbol(sym.SET,yyline,yychar,yytext()); }
"string"           { return symbol(sym.STRING,yyline,yychar,yytext()); }
"type"        { return symbol(sym.TYPE,yyline,yychar,yytext()); }
"from"          { return symbol(sym.FROM,yyline,yychar,yytext()); }
"of"           { return symbol(sym.OF,yyline,yychar,yytext()); }

/* STRIC MODE RESERVED KEYWORDS */
"as"           { return symbol(sym.AS,yyline,yychar,yytext()); }
"implements"        { return symbol(sym.IMPLEMENTS,yyline,yychar,yytext()); }
"let"          { return symbol(sym.LET,yyline,yychar,yytext()); }
"package"           { return symbol(sym.PACKAGE,yyline,yychar,yytext()); }
"private"        { return symbol(sym.PRIVATE,yyline,yychar,yytext()); }
"protected"          { return symbol(sym.PROTECTED,yyline,yychar,yytext()); }
"public"           { return symbol(sym.PUBLIC,yyline,yychar,yytext()); }
"static"        { return symbol(sym.STATIC,yyline,yychar,yytext()); }
"yield"          { return symbol(sym.YIELD,yyline,yychar,yytext()); }

/* Simbolos */ 
":"          { return symbol(sym.DOS_PUNTOS,yyline,yychar,yytext()); }
"."          { return symbol(sym.PUNTO,yyline,yychar,yytext()); }
"'"          { return symbol(sym.COMILLA_SIMPLE,yyline,yychar,yytext()); } 
","          { return symbol(sym.COMA,yyline,yychar,yytext()); }

\n {yychar=1;}

{BLANCOS} {} 
{ID} {return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());} 
{D} {return new Symbol(sym.ENTERO,yyline,yychar, yytext());} 
{DD} {return new Symbol(sym.DECIMAL,yyline,yychar, yytext());} 

. {
    System.err.println("Este es un error lexico: "+yytext()+", en la linea: "+yyline+", en la columna: "+yychar);
}
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
"for"        { return new Symbol(sym.FOR,yyline,yychar,yytext()); }

";" {return new Symbol(sym.PTCOMA,yyline,yychar, yytext());} 
"{" {return new Symbol(sym.LLAVIZQ,yyline,yychar, yytext());} 
"}" {return new Symbol(sym.LLAVDER,yyline,yychar, yytext());} 
"(" {return new Symbol(sym.PARIZQ,yyline,yychar, yytext());} 
")" {return new Symbol(sym.PARDER,yyline,yychar, yytext());} 
"+" {return new Symbol(sym.MAS,yyline,yychar, yytext());} 
"++" {return new Symbol(sym.MASMAS,yyline,yychar, yytext());}
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
"case"           { return new Symbol(sym.CASE,yyline,yychar,yytext()); }
"catch"        { return new Symbol(sym.CATCH,yyline,yychar,yytext()); }
"break"          { return new Symbol(sym.BREAK,yyline,yychar,yytext()); }
"class"           { return new Symbol(sym.CLASS,yyline,yychar,yytext()); }
"const"        { return new Symbol(sym.CONST,yyline,yychar,yytext()); }
"continue"          { return new Symbol(sym.CONTINUE,yyline,yychar,yytext()); }
"debugger"           { return new Symbol(sym.DEBUGGER,yyline,yychar,yytext()); }
"default"        { return new Symbol(sym.DEFAULT,yyline,yychar,yytext()); }
"delete"          { return new Symbol(sym.DELETE,yyline,yychar,yytext()); }
"do"           { return new Symbol(sym.DO,yyline,yychar,yytext()); }
"enum"          { return new Symbol(sym.ENUM,yyline,yychar,yytext()); }  
"export"           { return new Symbol(sym.EXPORT,yyline,yychar,yytext()); }
"extends"        { return new Symbol(sym.EXTENDS,yyline,yychar,yytext()); }
"false"          { return new Symbol(sym.FALSE,yyline,yychar,yytext()); }
"finally"           { return new Symbol(sym.FINALLY,yyline,yychar,yytext()); }
"function"          { return new Symbol(sym.FUNCTION,yyline,yychar,yytext()); }
"import"        { return new Symbol(sym.IMPORT,yyline,yychar,yytext()); }
"in"          { return new Symbol(sym.IN,yyline,yychar,yytext()); }
"instanceof"           { return new Symbol(sym.INSTANCEOF,yyline,yychar,yytext()); }
"null"        { return new Symbol(sym.NULL,yyline,yychar,yytext()); }
"new"          { return new Symbol(sym.NEW,yyline,yychar,yytext()); }
"return"           { return new Symbol(sym.RETURN,yyline,yychar,yytext()); }
"super"        { return new Symbol(sym.SUPER,yyline,yychar,yytext()); }
"switch"          { return new Symbol(sym.SWITCH,yyline,yychar,yytext()); }
"this"           { return new Symbol(sym.THIS,yyline,yychar,yytext()); }
"throw"        { return new Symbol(sym.THROW,yyline,yychar,yytext()); }
"true"          { return new Symbol(sym.TRUE,yyline,yychar,yytext()); }
"try"           { return new Symbol(sym.TRY,yyline,yychar,yytext()); }
"typeof"        { return new Symbol(sym.TYPEOF,yyline,yychar,yytext()); }
"var"          { return new Symbol(sym.VAR,yyline,yychar,yytext()); }
"void"           { return new Symbol(sym.VOID,yyline,yychar,yytext()); }
"with"          { return new Symbol(sym.WITH,yyline,yychar,yytext()); }
"case"           { return new Symbol(sym.CASE,yyline,yychar,yytext()); }
"break"          { return new Symbol(sym.BREAK,yyline,yychar,yytext()); }
   

/* CONTEXTUAL KEYWORDS */
"any"           { return new Symbol(sym.ANY,yyline,yychar,yytext()); }
"boolean"        { return new Symbol(sym.BOOLEAN,yyline,yychar,yytext()); }
"constructor"          { return new Symbol(sym.CONSTRUCTOR,yyline,yychar,yytext()); }
"declare"           { return new Symbol(sym.DECLARE,yyline,yychar,yytext()); }
"get"        { return new Symbol(sym.GET,yyline,yychar,yytext()); }
"module"          { return new Symbol(sym.MODULE,yyline,yychar,yytext()); }
"require"           { return new Symbol(sym.REQUIRE,yyline,yychar,yytext()); }
"set"          { return new Symbol(sym.SET,yyline,yychar,yytext()); }
"string"           { return new Symbol(sym.STRING,yyline,yychar,yytext()); }
"type"        { return new Symbol(sym.TYPE,yyline,yychar,yytext()); }
"from"          { return new Symbol(sym.FROM,yyline,yychar,yytext()); }
"of"           { return new Symbol(sym.OF,yyline,yychar,yytext()); }

/* STRIC MODE RESERVED KEYWORDS */
"as"           { return new Symbol(sym.AS,yyline,yychar,yytext()); }
"implements"        { return new Symbol(sym.IMPLEMENTS,yyline,yychar,yytext()); }
"let"          { return new Symbol(sym.LET,yyline,yychar,yytext()); }
"package"           { return new Symbol(sym.PACKAGE,yyline,yychar,yytext()); }
"private"        { return new Symbol(sym.PRIVATE,yyline,yychar,yytext()); }
"protected"          { return new Symbol(sym.PROTECTED,yyline,yychar,yytext()); }
"public"           { return new Symbol(sym.PUBLIC,yyline,yychar,yytext()); }
"static"        { return new Symbol(sym.STATIC,yyline,yychar,yytext()); }
"yield"          { return new Symbol(sym.YIELD,yyline,yychar,yytext()); }

/* Simbolos */ 
":"          { return new Symbol(sym.DOS_PUNTOS,yyline,yychar,yytext()); }
"."          { return new Symbol(sym.PUNTO,yyline,yychar,yytext()); }
"'"          { return new Symbol(sym.COMILLA_SIMPLE,yyline,yychar,yytext()); } 
","          { return new Symbol(sym.COMA,yyline,yychar,yytext()); }

\n {yychar=1;}

{BLANCOS} {} 
{ID} {return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());} 
{D} {return new Symbol(sym.ENTERO,yyline,yychar, yytext());} 
{DD} {return new Symbol(sym.DECIMAL,yyline,yychar, yytext());} 

. {
    System.err.println("Este es un error lexico: "+yytext()+", en la linea: "+yyline+", en la columna: "+yychar);
}
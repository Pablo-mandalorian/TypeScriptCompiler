
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Oct 16 20:48:35 CDT 2022
//----------------------------------------------------

package analizadores;

import arbol.Asignacion;
import arbol.Declaracion;
import arbol.Imprimir;
import arbol.If;
import arbol.Instruccion;
import arbol.Mientras;
import arbol.Operacion;
import arbol.Simbolo.Tipo;
import arbol.TablaDeSimbolos;
import java.util.LinkedList;
import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Oct 16 20:48:35 CDT 2022
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\007\000\002\004\011" +
    "\000\002\004\006\000\002\004\006\000\002\004\011\000" +
    "\002\004\015\000\002\004\003\000\002\005\004\000\002" +
    "\005\005\000\002\005\005\000\002\005\005\000\002\005" +
    "\005\000\002\005\005\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\006\005\000\002\006\003\000" +
    "\002\006\003\000\002\007\005\000\002\007\005\000\002" +
    "\007\005\000\002\007\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\102\000\014\003\007\032\012\033\013\035\004\040" +
    "\010\001\002\000\004\005\073\001\002\000\016\002\000" +
    "\003\007\032\012\033\013\035\004\040\010\001\002\000" +
    "\004\002\072\001\002\000\020\002\ufff7\003\ufff7\010\ufff7" +
    "\032\ufff7\033\ufff7\035\ufff7\040\ufff7\001\002\000\006\011" +
    "\065\037\064\001\002\000\020\002\ufffe\003\ufffe\010\ufffe" +
    "\032\ufffe\033\ufffe\035\ufffe\040\ufffe\001\002\000\004\005" +
    "\054\001\002\000\004\005\014\001\002\000\014\005\017" +
    "\016\021\026\023\027\022\040\020\001\002\000\004\006" +
    "\047\001\002\000\022\015\025\016\027\017\030\020\026" +
    "\022\040\023\037\024\041\025\042\001\002\000\014\005" +
    "\017\016\021\026\023\027\022\040\020\001\002\000\030" +
    "\004\uffee\006\uffee\015\uffee\016\uffee\017\uffee\020\uffee\021" +
    "\uffee\022\uffee\023\uffee\024\uffee\025\uffee\001\002\000\014" +
    "\005\017\016\021\026\023\027\022\040\020\001\002\000" +
    "\030\004\uffef\006\uffef\015\uffef\016\uffef\017\uffef\020\uffef" +
    "\021\uffef\022\uffef\023\uffef\024\uffef\025\uffef\001\002\000" +
    "\030\004\ufff0\006\ufff0\015\ufff0\016\ufff0\017\ufff0\020\ufff0" +
    "\021\ufff0\022\ufff0\023\ufff0\024\ufff0\025\ufff0\001\002\000" +
    "\030\004\ufff6\006\ufff6\015\ufff6\016\ufff6\017\ufff6\020\ufff6" +
    "\021\ufff6\022\ufff6\023\ufff6\024\ufff6\025\ufff6\001\002\000" +
    "\014\005\017\016\021\026\023\027\022\040\020\001\002" +
    "\000\014\005\017\016\021\026\023\027\022\040\020\001" +
    "\002\000\014\005\017\016\021\026\023\027\022\040\020" +
    "\001\002\000\014\005\017\016\021\026\023\027\022\040" +
    "\020\001\002\000\030\004\ufff3\006\ufff3\015\ufff3\016\ufff3" +
    "\017\ufff3\020\ufff3\021\ufff3\022\ufff3\023\ufff3\024\ufff3\025" +
    "\ufff3\001\002\000\030\004\ufff4\006\ufff4\015\ufff4\016\ufff4" +
    "\017\030\020\026\021\ufff4\022\ufff4\023\ufff4\024\ufff4\025" +
    "\ufff4\001\002\000\030\004\ufff2\006\ufff2\015\ufff2\016\ufff2" +
    "\017\ufff2\020\ufff2\021\ufff2\022\ufff2\023\ufff2\024\ufff2\025" +
    "\ufff2\001\002\000\030\004\ufff5\006\ufff5\015\ufff5\016\ufff5" +
    "\017\030\020\026\021\ufff5\022\ufff5\023\ufff5\024\ufff5\025" +
    "\ufff5\001\002\000\014\006\036\015\025\016\027\017\030" +
    "\020\026\001\002\000\030\004\ufff1\006\ufff1\015\ufff1\016" +
    "\ufff1\017\ufff1\020\ufff1\021\ufff1\022\ufff1\023\ufff1\024\ufff1" +
    "\025\ufff1\001\002\000\014\005\017\016\021\026\023\027" +
    "\022\040\020\001\002\000\014\005\017\016\021\026\023" +
    "\027\022\040\020\001\002\000\014\005\017\016\021\026" +
    "\023\027\022\040\020\001\002\000\014\005\017\016\021" +
    "\026\023\027\022\040\020\001\002\000\014\006\uffe7\015" +
    "\025\016\027\017\030\020\026\001\002\000\014\006\uffe8" +
    "\015\025\016\027\017\030\020\026\001\002\000\014\006" +
    "\uffe9\015\025\016\027\017\030\020\026\001\002\000\014" +
    "\006\uffea\015\025\016\027\017\030\020\026\001\002\000" +
    "\004\007\050\001\002\000\014\003\007\032\012\033\013" +
    "\035\004\040\010\001\002\000\016\003\007\010\052\032" +
    "\012\033\013\035\004\040\010\001\002\000\020\002\ufffc" +
    "\003\ufffc\010\ufffc\032\ufffc\033\ufffc\035\ufffc\040\ufffc\001" +
    "\002\000\020\002\uffff\003\uffff\010\uffff\032\uffff\033\uffff" +
    "\035\uffff\040\uffff\001\002\000\016\005\017\016\021\026" +
    "\023\027\022\030\057\040\020\001\002\000\016\006\uffeb" +
    "\015\025\016\027\017\030\020\026\021\uffeb\001\002\000" +
    "\006\006\060\021\061\001\002\000\006\006\uffec\021\uffec" +
    "\001\002\000\004\004\063\001\002\000\016\005\017\016" +
    "\021\026\023\027\022\030\057\040\020\001\002\000\006" +
    "\006\uffed\021\uffed\001\002\000\020\002\ufffd\003\ufffd\010" +
    "\ufffd\032\ufffd\033\ufffd\035\ufffd\040\ufffd\001\002\000\014" +
    "\005\017\016\021\026\023\027\022\040\020\001\002\000" +
    "\004\034\066\001\002\000\004\004\067\001\002\000\020" +
    "\002\ufffb\003\ufffb\010\ufffb\032\ufffb\033\ufffb\035\ufffb\040" +
    "\ufffb\001\002\000\014\004\071\015\025\016\027\017\030" +
    "\020\026\001\002\000\020\002\ufffa\003\ufffa\010\ufffa\032" +
    "\ufffa\033\ufffa\035\ufffa\040\ufffa\001\002\000\004\002\001" +
    "\001\002\000\014\005\017\016\021\026\023\027\022\040" +
    "\020\001\002\000\004\006\075\001\002\000\004\007\076" +
    "\001\002\000\014\003\007\032\012\033\013\035\004\040" +
    "\010\001\002\000\016\003\007\010\100\032\012\033\013" +
    "\035\004\040\010\001\002\000\022\002\ufff9\003\ufff9\010" +
    "\ufff9\032\ufff9\033\ufff9\035\ufff9\036\101\040\ufff9\001\002" +
    "\000\004\007\102\001\002\000\014\003\007\032\012\033" +
    "\013\035\004\040\010\001\002\000\016\003\007\010\104" +
    "\032\012\033\013\035\004\040\010\001\002\000\020\002" +
    "\ufff8\003\ufff8\010\ufff8\032\ufff8\033\ufff8\035\ufff8\040\ufff8" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\102\000\010\002\005\003\004\004\010\001\001\000" +
    "\002\001\001\000\004\004\052\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\005\015\007\014" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\034\001\001\000\002\001\001\000\004\005\023\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\033\001\001\000\004\005\032\001\001\000\004" +
    "\005\031\001\001\000\004\005\030\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\005\045\001" +
    "\001\000\004\005\044\001\001\000\004\005\043\001\001" +
    "\000\004\005\042\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\003\050\004\010\001\001\000\004\004\052\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\005\054" +
    "\006\055\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\005\054\006\061" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\067\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\005\015\007\073\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\003\076\004\010\001\001\000" +
    "\004\004\052\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\003\102\004\010\001\001\000\004\004\052\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /**
     * Variable en la que se almacena el arbol de sintaxis abstracta que se 
     * genera luego del analisis sintáctico.
     */
    public LinkedList<Instruccion> AST;
    /**
     * Método al que se llama automáticamente ante algún error sintactico.
     **/ 
    public void syntax_error(Symbol s){ 
            System.err.println("Error Sintáctico en la Línea " + (s.left) +" Columna "+s.right+ ". No se esperaba este componente: " +s.value+"."); 
    } 
    /**
     * Método al que se llama en el momento en que ya no es posible una recuperación de errores.
     **/ 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
            System.err.println("Error síntactico irrecuperable en la Línea " + (s.left)+ " Columna "+s.right+". Componente " + s.value + " no reconocido."); 
    }  
    /**
     * Método que devuelve el AST que se generó después de realizar el análisis sintáctico. 
     * @return árbol de sintaxis abstacta que será utilizado posteriormente en la ejecución.
     */
    public LinkedList<Instruccion> getAST() {
        return AST;
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expresion_logica ::= expresion_numerica NIGUALQUE expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,b, Operacion.Tipo_operacion.NO_IGUAL_QUE);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_logica",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expresion_logica ::= expresion_numerica IGUALQUE expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,b, Operacion.Tipo_operacion.IGUAL_QUE);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_logica",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expresion_logica ::= expresion_numerica MENQUE expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,b, Operacion.Tipo_operacion.MENOR_QUE);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_logica",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion_logica ::= expresion_numerica MAYQUE expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,b, Operacion.Tipo_operacion.MAYOR_QUE);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_logica",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion_cadena ::= expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=a;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_cadena",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion_cadena ::= CADENA 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,Operacion.Tipo_operacion.CADENA);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_cadena",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion_cadena ::= expresion_cadena CONCAT expresion_cadena 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,b,Operacion.Tipo_operacion.CONCATENACION);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_cadena",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion_numerica ::= IDENTIFICADOR 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,Operacion.Tipo_operacion.IDENTIFICADOR);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expresion_numerica ::= DECIMAL 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(new Double(a));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion_numerica ::= ENTERO 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(new Double(a));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expresion_numerica ::= PARIZQ expresion_numerica PARDER 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=a;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion_numerica ::= expresion_numerica DIVIDIDO expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,b,Operacion.Tipo_operacion.DIVISION);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion_numerica ::= expresion_numerica POR expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,b,Operacion.Tipo_operacion.MULTIPLICACION);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expresion_numerica ::= expresion_numerica MENOS expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,b,Operacion.Tipo_operacion.RESTA);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expresion_numerica ::= expresion_numerica MAS expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,b,Operacion.Tipo_operacion.SUMA);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expresion_numerica ::= MENOS expresion_numerica 
            {
              Operacion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Operacion(a,Operacion.Tipo_operacion.NEGATIVO);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_numerica",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // instruccion ::= error 
            {
              Instruccion RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // instruccion ::= RIF PARIZQ expresion_logica PARDER LLAVIZQ instrucciones LLAVDER RELSE LLAVIZQ instrucciones LLAVDER 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		LinkedList<Instruccion> b = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList<Instruccion> c = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=new If(a,b,c);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // instruccion ::= RIF PARIZQ expresion_logica PARDER LLAVIZQ instrucciones LLAVDER 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList<Instruccion> b = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=new If(a,b);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instruccion ::= IDENTIFICADOR IGUAL expresion_numerica PTCOMA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Operacion b = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=new Asignacion(a,b);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instruccion ::= IDENTIFICADOR DOS_PUNTOS RNUMERO PTCOMA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		RESULT=new Declaracion(a,Tipo.NUMERO);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= RMIENTRAS PARIZQ expresion_logica PARDER LLAVIZQ instrucciones LLAVDER 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList<Instruccion> b = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=new Mientras(a,b);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= RIMPRIMIR PARIZQ expresion_cadena PARDER PTCOMA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Operacion a = (Operacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		RESULT=new Imprimir(a);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instrucciones ::= instruccion 
            {
              LinkedList<Instruccion> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion a = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new LinkedList<>(); RESULT.add(a);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instrucciones ::= instrucciones instruccion 
            {
              LinkedList<Instruccion> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList<Instruccion> a = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion b = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=a; RESULT.add(b);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= instrucciones 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		LinkedList<Instruccion> a = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    //se guarda el AST, que es la lista principal de instrucciones en la variable
    //AST que se definió dentro del parser
    parser.AST=a;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}


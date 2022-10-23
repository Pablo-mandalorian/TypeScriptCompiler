package analizadorSintacto;

import funciones.Instruccion;
import funciones.TablaDeSimbolos;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

/**
 * Clase principal de la aplicación
 */
public class InterpreteSencillo {

    /**
     * Método principal de la aplicación
     * @param args los argumentos de la línea de comando
     */
    public static void main(String[] args) {
        interpretar("entrada.txt");
    }
    /**
     * Método que lee el contenido de un archivo de texto y ejecuta las 
     * instrucciones que contiene.
     * @param path ruta del archivo de texto que se desea interpretar
     */
    private static void interpretar(String path) {
        analizadores.parser pars;
        LinkedList<Instruccion> AST_arbolSintaxisAbstracta=null;
        try {
            pars=new analizadores.parser(new analizadores.Lexico(new FileReader(new File(path))));
            pars.parse();        
            AST_arbolSintaxisAbstracta=pars.getAST();
        } catch (Exception ex) {
            System.out.println("Error fatal en compilación de entrada.");
        } 
        ejecutarAST(AST_arbolSintaxisAbstracta);
    }
    /**
     * Recibe una lista de instrucciones y la ejecuta
     * @param ast lista de instrucciones
     */
    private static void ejecutarAST(LinkedList<Instruccion> ast) {
        if(ast==null){
            System.out.println("No es posible ejecutar las instrucciones porque\r\n"
                    + "el árbol no fue cargado de forma adecuada por la existencia\r\n"
                    + "de errores léxicos o sintácticos.");
            return;
        }
        //Se crea una tabla de símbolos global para ejecutar las instrucciones.
        TablaDeSimbolos ts=new TablaDeSimbolos();
        //Se ejecuta cada instruccion en el ast, es decir, cada instruccion de 
        //la lista principal de instrucciones.
        for(Instruccion ins:ast){
            //Si existe un error léxico o sintáctico en cierta instrucción esta
            //será inválida y se cargará como null, por lo tanto no deberá ejecutarse
            //es por esto que se hace esta validación.
            if(ins!=null)
                ins.ejecutar(ts);
        }
    }
}
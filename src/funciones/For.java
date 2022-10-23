/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.LinkedList;

/**
 *
 * @author andrestellesrivera
 */
public class For implements Instruccion {

    private final int a;
    private final int b;
    private final LinkedList<Instruccion> listaInstrucciones;
    
    public For(int a, int b, LinkedList<Instruccion> c){
        this.a =a;
        this.b = b;
        this.listaInstrucciones = c;
    }

    public For(Operacion a, Operacion b, LinkedList<Instruccion> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Object ejecutar(TablaDeSimbolos ts) {
        for(int x=a; x<b; x++){
            TablaDeSimbolos tablaLocal=new TablaDeSimbolos();
            tablaLocal.addAll(ts);
            for(Instruccion ins:listaInstrucciones){
                ins.ejecutar(tablaLocal);
            }
        }
        return null;
    }
    
}

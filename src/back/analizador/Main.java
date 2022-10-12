/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package back.analizador;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author andrestellesrivera
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String rutaLexer = "/Users/andrestellesrivera/NetBeansProjects/Compileeer/src/back/analizador/Lexxer.jflex";
        String rutaCup = "/Users/andrestellesrivera/NetBeansProjects/Compileeer/src/back/analizador/";
        //generarJavaLexer(rutaLexer);
        generarJavaCup(rutaCup);
    }
    
    public static void generarJavaLexer(String rutaLexer){
        File archivo = new File(rutaLexer);
        jflex.Main.generate(archivo);
    }
    
    public static void generarJavaCup(String rutaCup){
        try {
            String opcCup[] = {"-destdir", rutaCup, "-parser", "parser", rutaCup + "sintaxis.cup"};
            java_cup.Main.main(opcCup);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

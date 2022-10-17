/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lexico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author andrestellesrivera
 */
public class AnalisisLexico{
       
    private static File file;
    private static BufferedReader bf;
    private static Lexico lexico;
    
    public static void main(String[] args){
        try {
            file = new File("src/lexico/codigo.txt");
            bf = new BufferedReader(new FileReader(file));
            lexico = new Lexico(bf);
            loop: while(true){
               Symbol token = lexico.next_token();
                System.out.print("Texto: \n" + token.toString() + " " + token.value);
                switch (token.sym) {
                    case 1 -> System.out.println(" Break \n");
                    case 2 -> System.out.println(" Case \n");
                    case 3 -> System.out.println(" Catch \n");
                    case 4 -> System.out.println(" Class \n");
                    case 5 -> System.out.println(" Const \n");
                    case 6 -> System.out.println(" Continue \n");
                    case 7 -> System.out.println(" Debugger \n");
                    case 8 -> System.out.println(" Default \n");
                    case 9 -> System.out.println(" Delete \n");
                    case 10 -> System.out.println(" Do \n");
                    case 11 -> System.out.println(" Else \n");
                    case 12 -> System.out.println(" Enum \n");
                    case 13 -> System.out.println(" EXPORT \n");
                    case 14 -> System.out.println(" EXTENDS \n");
                    case 15 -> System.out.println(" False \n");
                    case 16 -> System.out.println(" Finally \n");
                    case 17 -> System.out.println(" For \n");
                    case 18 -> System.out.println(" Function \n");
                    case 19 -> System.out.println(" If \n");
                    case 20 -> System.out.println(" Import \n");
                    case 21 -> System.out.println(" In \n");
                    case 22 -> System.out.println(" INSTANCEOF \n");
                    case 23 -> System.out.println(" New \n");
                    case 24 -> System.out.println(" Null \n");
                    case 25 -> System.out.println(" Return \n");
                    case 26 -> System.out.println(" Super \n");
                    case 27 -> System.out.println(" SWITCH \n");
                    case 28 -> System.out.println(" This \n");
                    case 29 -> System.out.println(" Throw \n");
                    case 30 -> System.out.println(" True \n");
                    case 31 -> System.out.println(" Try \n");
                    case 32 -> System.out.println(" Typeof \n");
                    case 33 -> System.out.println(" Var \n");
                    case 34 -> System.out.println(" Void \n");
                    case 35 -> System.out.println(" While \n");
                    case 36 -> System.out.println(" With \n");
                    case 37 -> System.out.println(" + \n");
                    case 38 -> System.out.println(" - \n");
                    case 39 -> System.out.println(" / \n");
                    case 40 -> System.out.println(" * \n");
                    case 41 -> System.out.println(" % \n");
                    case 42 -> System.out.println(" > \n");
                    case 43 -> System.out.println(" < \n");
                    case 44 -> System.out.println(" <= \n");
                    case 45 -> System.out.println(" >= \n");
                    case 46 -> System.out.println(" == \n");
                    case 47 -> System.out.println(" != \n");
                    case 48 -> System.out.println(" Any \n");
                    case 49 -> System.out.println(" Boolean \n");
                    case 50 -> System.out.println(" Constructor \n");
                    case 51 -> System.out.println(" Declare \n");
                    case 52 -> System.out.println(" Get \n");
                    case 53 -> System.out.println(" Module \n");
                    case 54 -> System.out.println(" Require \n");
                    case 55 -> System.out.println(" Number \n");
                    case 56 -> System.out.println(" Set \n");
                    case 57 -> System.out.println(" String \n");
                    case 58 -> System.out.println(" Type \n");
                    case 59 -> System.out.println(" From \n");
                    case 60 -> System.out.println(" Of \n");
                    case 61 -> System.out.println(" As \n");
                    case 62 -> System.out.println(" Implements \n");
                    case 63 -> System.out.println(" Let \n");
                    case 64 -> System.out.println(" Package \n");
                    case 65 -> System.out.println(" Private \n");
                    case 66 -> System.out.println(" Protected \n");
                    case 67 -> System.out.println(" Public \n");
                    case 68 -> System.out.println(" Static \n");
                    case 69 -> System.out.println(" Yield \n");
                    case 70 -> System.out.println(" STRING_LITERAL \n");
                    case 71 -> System.out.println(" LLAVE_APERTURA \n");
                    case 72 -> System.out.println(" LLAVE_CIERRE \n");
                    case 73 -> System.out.println(" PARENTESIS_APERTURA \n");
                    case 74 -> System.out.println(" PARENTESIS_CIERRE \n");
                    case 75 -> System.out.println(" PUNTO_COMA \n");
                    case 76 -> System.out.println(" Punto \n");
                    case 77 -> System.out.println(" Console \n");
                    case 78 -> System.out.println(" log \n");
                    case 79 -> System.out.println(" COMILLA_SIMPLE \n");
                    case 80 -> System.out.println(" COMILLAS_DOBLES \n");
                    case 81 -> System.out.println(" IDENTIFICADOR \n");
                    case 82 -> System.out.println(" COMA \n");
                    case 83 -> System.out.println(" COMENTARIO \n");
                    case 84 -> System.out.println("ESPACIO \n");
                    case 85 -> System.out.println(" Igual \n");
                    case 86 -> System.out.println(" Numero \n");
                    case 87 -> System.out.println(" Dos Puntos \n");
                    case 88 -> System.out.println("Console.log");
                    default -> {
                        System.out.println("\nFin del Archivo \n");
                        break loop;
                    }
                }
                // Reserved Words
                // Contextual Words
                // Strict Mode Reserved Words
                            }           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AnalisisLexico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnalisisLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

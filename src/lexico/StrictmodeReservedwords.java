/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package lexico;

/**
 *
 * @author andrestellesrivera
 */
public enum StrictmodeReservedwords {
    AS(61), IMPLEMENTS(62), LET(63), PACKAGE(64), PRIVATE(65), PROTECTED(66), PUBLIC(67), STATIC(68), YIELD(69), 
    STRING_LITERAL(70), LLAVE_APERTURA(71), LLAVE_CIERRE(72), PARENTESIS_APERTURA(73), PARENTESIS_CIERRE(74),
    PUNTO_COMA(75), PUNTO(76), CONSOLE(77), LOG(78), COMILLA_SIMPLE(79), COMILLAS_DOBLES(80), IDENTIFICADOR(81),
    COMA(82), COMENTARIO(83), ESPACIO(84), IGUAL(85), NUMEROS(86), DOS_PUNTOS(87), CONSOLE_PUNTO_LOG(88);
    
    public int value;

    private StrictmodeReservedwords(int value) {
        this.value = value;
    }
    
}

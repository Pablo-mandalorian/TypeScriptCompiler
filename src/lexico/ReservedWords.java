/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package lexico;

/**
 *
 * @author andrestellesrivera
 */
public enum ReservedWords {
    
    BREAK(1), CASE(2), CATCH(3), CLASS(4), CONST(5), CONTINUE(6), DEBUGGER(7), DEFAULT(8), DELETE(9), DO(10), ELSE(11), ENUM(12),
    EXPORT(13), EXTENDS(14), FALSE(15), FINALLY(16), FOR(17), FUNCTION(18), IF(19), IMPORT(20), IN(21), INSTANCEOF(22), NEW(23), NULL(24),
    RETURN(25), SUPER(26), SWITCH(27), THIS(28), THROW(29), TRUE(30), TRY(31), TYPEOF(32), VAR(33), VOID(34), WHILE(35), WITH(36), SUMA(37), RESTA(38),
    DIVISION(39),MULTIPLICACION(40), MODULO(41), MAYOR(42), MENOR(43), MENORIGUAL(44), MAYORIGUAL(45), IGUALIGUAL(46), DIFERENTEDE(47);
    
    public int value;
   
    private ReservedWords(int value) {
        this.value = value;
    }
}

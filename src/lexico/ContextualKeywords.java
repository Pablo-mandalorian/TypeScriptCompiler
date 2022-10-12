/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package lexico;

/**
 *
 * @author andrestellesrivera
 */
public enum ContextualKeywords {
ANY(48), BOOLEAN(49), CONSTRUCTOR(50), DECLARE(51), GET(52), MODULE(53), REQUIRE(54), NUMBER(55), SET(56), STRING(57),
TYPE(58), FROM(59), OF(60);

public int value;

    private ContextualKeywords(int value) {
        this.value = value;
    }
   
}

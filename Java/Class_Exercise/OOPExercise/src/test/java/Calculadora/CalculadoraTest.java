/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author userx
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSumarDosNumeros() {
        int resultadoSuma = Calculadora.sumar(2,7);
        assertEquals(9, resultadoSuma);
    }
    
    @Test
    public void testSumarDosNumerosConUnoNegativo() {
        int resultadoSuma = Calculadora.sumar(-1,5);
        assertEquals(4, resultadoSuma,"Se esperaba que la suma diera 4");
    }
    @Test
    public void testSumarTresNumeros() {
        int resultadoSuma = Calculadora.sumar(2,7,-5);
        assertEquals(4, resultadoSuma,"Se esperaba que la suma diera 4");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP VICTUS GAMER
 */
public class IndicadorFinancieroTest {
    
    public IndicadorFinancieroTest() {
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

    /**
     * Test of getNombre method, of class IndicadorFinanciero.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        IndicadorFinanciero instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcular method, of class IndicadorFinanciero.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        IndicadorFinanciero instance = null;
        double expResult = 0.0;
        double result = instance.calcular();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IndicadorFinancieroImpl extends IndicadorFinanciero {

        public IndicadorFinancieroImpl() {
            super("");
        }

        public double calcular() {
            return 0.0;
        }
    }
    
}

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
public class PeriodoFinancieroTest {
    
    public PeriodoFinancieroTest() {
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
     * Test of getAnio method, of class PeriodoFinanciero.
     */
    @Test
    public void testGetAnio() {
        System.out.println("getAnio");
        PeriodoFinanciero instance = null;
        int expResult = 0;
        int result = instance.getAnio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpresa method, of class PeriodoFinanciero.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        PeriodoFinanciero instance = null;
        String expResult = "";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class PeriodoFinanciero.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        PeriodoFinanciero instance = null;
        BalanceGeneral expResult = null;
        BalanceGeneral result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultados method, of class PeriodoFinanciero.
     */
    @Test
    public void testGetResultados() {
        System.out.println("getResultados");
        PeriodoFinanciero instance = null;
        EstadoResultados expResult = null;
        EstadoResultados result = instance.getResultados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnio method, of class PeriodoFinanciero.
     */
    @Test
    public void testSetAnio() {
        System.out.println("setAnio");
        int anio = 0;
        PeriodoFinanciero instance = null;
        instance.setAnio(anio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpresa method, of class PeriodoFinanciero.
     */
    @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        String empresa = "";
        PeriodoFinanciero instance = null;
        instance.setEmpresa(empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBalance method, of class PeriodoFinanciero.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        BalanceGeneral balance = null;
        PeriodoFinanciero instance = null;
        instance.setBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResultados method, of class PeriodoFinanciero.
     */
    @Test
    public void testSetResultados() {
        System.out.println("setResultados");
        EstadoResultados resultados = null;
        PeriodoFinanciero instance = null;
        instance.setResultados(resultados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PeriodoFinanciero.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PeriodoFinanciero instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

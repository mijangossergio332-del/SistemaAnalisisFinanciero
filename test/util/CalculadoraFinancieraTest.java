/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package util;

import modelo.BalanceGeneral;
import modelo.EstadoResultados;
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
public class CalculadoraFinancieraTest {
    
    public CalculadoraFinancieraTest() {
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
     * Test of razonCirculante method, of class CalculadoraFinanciera.
     */
    @Test
    public void testRazonCirculante() {
        System.out.println("razonCirculante");
        BalanceGeneral bg = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.razonCirculante(bg);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pruebaAcida method, of class CalculadoraFinanciera.
     */
    @Test
    public void testPruebaAcida() {
        System.out.println("pruebaAcida");
        BalanceGeneral bg = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.pruebaAcida(bg);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capitalTrabajo method, of class CalculadoraFinanciera.
     */
    @Test
    public void testCapitalTrabajo() {
        System.out.println("capitalTrabajo");
        BalanceGeneral bg = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.capitalTrabajo(bg);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endeudamiento method, of class CalculadoraFinanciera.
     */
    @Test
    public void testEndeudamiento() {
        System.out.println("endeudamiento");
        BalanceGeneral bg = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.endeudamiento(bg);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apalancamiento method, of class CalculadoraFinanciera.
     */
    @Test
    public void testApalancamiento() {
        System.out.println("apalancamiento");
        BalanceGeneral bg = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.apalancamiento(bg);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ROA method, of class CalculadoraFinanciera.
     */
    @Test
    public void testROA() {
        System.out.println("ROA");
        BalanceGeneral bg = null;
        EstadoResultados er = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.ROA(bg, er);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ROE method, of class CalculadoraFinanciera.
     */
    @Test
    public void testROE() {
        System.out.println("ROE");
        BalanceGeneral bg = null;
        EstadoResultados er = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.ROE(bg, er);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of margenBruto method, of class CalculadoraFinanciera.
     */
    @Test
    public void testMargenBruto() {
        System.out.println("margenBruto");
        EstadoResultados er = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.margenBruto(er);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of margenOperativo method, of class CalculadoraFinanciera.
     */
    @Test
    public void testMargenOperativo() {
        System.out.println("margenOperativo");
        EstadoResultados er = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.margenOperativo(er);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of margenNeto method, of class CalculadoraFinanciera.
     */
    @Test
    public void testMargenNeto() {
        System.out.println("margenNeto");
        EstadoResultados er = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.margenNeto(er);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotacionActivos method, of class CalculadoraFinanciera.
     */
    @Test
    public void testRotacionActivos() {
        System.out.println("rotacionActivos");
        BalanceGeneral bg = null;
        EstadoResultados er = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.rotacionActivos(bg, er);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotacionInventarios method, of class CalculadoraFinanciera.
     */
    @Test
    public void testRotacionInventarios() {
        System.out.println("rotacionInventarios");
        BalanceGeneral bg = null;
        EstadoResultados er = null;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.rotacionInventarios(bg, er);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of porcentajeIntegral method, of class CalculadoraFinanciera.
     */
    @Test
    public void testPorcentajeIntegral() {
        System.out.println("porcentajeIntegral");
        double cuenta = 0.0;
        double total = 0.0;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.porcentajeIntegral(cuenta, total);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tendencia method, of class CalculadoraFinanciera.
     */
    @Test
    public void testTendencia() {
        System.out.println("tendencia");
        double actual = 0.0;
        double base = 0.0;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.tendencia(actual, base);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crecimiento method, of class CalculadoraFinanciera.
     */
    @Test
    public void testCrecimiento() {
        System.out.println("crecimiento");
        double actual = 0.0;
        double anterior = 0.0;
        double expResult = 0.0;
        double result = CalculadoraFinanciera.crecimiento(actual, anterior);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of porcentaje method, of class CalculadoraFinanciera.
     */
    @Test
    public void testPorcentaje() {
        System.out.println("porcentaje");
        double valor = 0.0;
        String expResult = "";
        String result = CalculadoraFinanciera.porcentaje(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moneda method, of class CalculadoraFinanciera.
     */
    @Test
    public void testMoneda() {
        System.out.println("moneda");
        double valor = 0.0;
        String expResult = "";
        String result = CalculadoraFinanciera.moneda(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

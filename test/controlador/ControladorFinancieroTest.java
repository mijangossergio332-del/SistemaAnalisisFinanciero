/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.PeriodoFinanciero;
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
public class ControladorFinancieroTest {
    
    public ControladorFinancieroTest() {
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
     * Test of agregarPeriodo method, of class ControladorFinanciero.
     */
    @Test
    public void testAgregarPeriodo() {
        System.out.println("agregarPeriodo");
        PeriodoFinanciero periodo = null;
        ControladorFinanciero instance = new ControladorFinanciero();
        instance.agregarPeriodo(periodo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeriodos method, of class ControladorFinanciero.
     */
    @Test
    public void testGetPeriodos() {
        System.out.println("getPeriodos");
        ControladorFinanciero instance = new ControladorFinanciero();
        ArrayList<PeriodoFinanciero> expResult = null;
        ArrayList<PeriodoFinanciero> result = instance.getPeriodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorAnio method, of class ControladorFinanciero.
     */
    @Test
    public void testBuscarPorAnio() {
        System.out.println("buscarPorAnio");
        int anio = 0;
        ControladorFinanciero instance = new ControladorFinanciero();
        PeriodoFinanciero expResult = null;
        PeriodoFinanciero result = instance.buscarPorAnio(anio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPeriodo method, of class ControladorFinanciero.
     */
    @Test
    public void testEliminarPeriodo() {
        System.out.println("eliminarPeriodo");
        int anio = 0;
        ControladorFinanciero instance = new ControladorFinanciero();
        instance.eliminarPeriodo(anio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarPeriodo method, of class ControladorFinanciero.
     */
    @Test
    public void testActualizarPeriodo() {
        System.out.println("actualizarPeriodo");
        PeriodoFinanciero nuevoPeriodo = null;
        ControladorFinanciero instance = new ControladorFinanciero();
        instance.actualizarPeriodo(nuevoPeriodo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiarPeriodos method, of class ControladorFinanciero.
     */
    @Test
    public void testLimpiarPeriodos() {
        System.out.println("limpiarPeriodos");
        ControladorFinanciero instance = new ControladorFinanciero();
        instance.limpiarPeriodos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalPeriodos method, of class ControladorFinanciero.
     */
    @Test
    public void testTotalPeriodos() {
        System.out.println("totalPeriodos");
        ControladorFinanciero instance = new ControladorFinanciero();
        int expResult = 0;
        int result = instance.totalPeriodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existePeriodo method, of class ControladorFinanciero.
     */
    @Test
    public void testExistePeriodo() {
        System.out.println("existePeriodo");
        int anio = 0;
        ControladorFinanciero instance = new ControladorFinanciero();
        boolean expResult = false;
        boolean result = instance.existePeriodo(anio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

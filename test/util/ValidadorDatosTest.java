/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package util;

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
public class ValidadorDatosTest {
    
    public ValidadorDatosTest() {
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
     * Test of validarNumero method, of class ValidadorDatos.
     */
    @Test
    public void testValidarNumero() {
        System.out.println("validarNumero");
        double valor = 0.0;
        boolean expResult = false;
        boolean result = ValidadorDatos.validarNumero(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of corregir method, of class ValidadorDatos.
     */
    @Test
    public void testCorregir() {
        System.out.println("corregir");
        double valor = 0.0;
        double expResult = 0.0;
        double result = ValidadorDatos.corregir(valor);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of textoVacio method, of class ValidadorDatos.
     */
    @Test
    public void testTextoVacio() {
        System.out.println("textoVacio");
        String texto = "";
        boolean expResult = false;
        boolean result = ValidadorDatos.textoVacio(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarAnio method, of class ValidadorDatos.
     */
    @Test
    public void testValidarAnio() {
        System.out.println("validarAnio");
        int anio = 0;
        boolean expResult = false;
        boolean result = ValidadorDatos.validarAnio(anio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarPorcentaje method, of class ValidadorDatos.
     */
    @Test
    public void testValidarPorcentaje() {
        System.out.println("validarPorcentaje");
        double valor = 0.0;
        boolean expResult = false;
        boolean result = ValidadorDatos.validarPorcentaje(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

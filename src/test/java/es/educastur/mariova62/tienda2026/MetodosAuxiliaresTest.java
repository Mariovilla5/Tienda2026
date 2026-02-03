/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package es.educastur.mariova62.tienda2026;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 1dawd07
 */
public class MetodosAuxiliaresTest {
    
    public MetodosAuxiliaresTest() {
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
     * Test of esInt method, of class MetodosAuxiliares.
     */
    @Test
    public void testEsInt() {
        assertTrue(MetodosAuxiliares.esInt("5"));
        assertTrue(MetodosAuxiliares.esInt("-5"));
        assertFalse(MetodosAuxiliares.esInt("5.5"));
        assertFalse(MetodosAuxiliares.esInt("jfkjsefjksd"));
    }

    /**
     * Test of esDouble method, of class MetodosAuxiliares.
     */
    @Test
    public void testEsDouble() {
        assertTrue(MetodosAuxiliares.esDouble("5"));
        assertTrue(MetodosAuxiliares.esDouble("-5"));
        assertTrue(MetodosAuxiliares.esDouble("5.5"));
        assertFalse(MetodosAuxiliares.esDouble("jfkjsefjksd"));   
    }

    /**
     * Test of validarDNI method, of class MetodosAuxiliares.
     */
    @Test
    public void testValidarDNI() {
        assertTrue(MetodosAuxiliares.validarDNI("80580845T"));
        assertTrue(MetodosAuxiliares.validarDNI("36347775R"));
        assertFalse(MetodosAuxiliares.validarDNI("54328911E"));
        assertFalse(MetodosAuxiliares.validarDNI("12345678A"));  
    }
    



}

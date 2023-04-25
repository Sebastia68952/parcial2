package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class FibonacciUnitTest {

    private MainActivity fibonacci;
    @Test
    public void testFibonacciVacio() {
        fibonacci.txtfibonnaci(" ");
        String nombreCompleto = formulario.getNombreCompleto();
    }

    @Test
    public void testFibonacciLleno() {
        fibonacci.("1");
        String mensajeBienvenida = formulario.getMensajeBienvenida();
        assertEquals("¡Bienvenido, Juan Perez! Tienes 30 años.",
                mensajeBienvenida);
    }
}





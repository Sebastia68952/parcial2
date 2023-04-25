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
    }

    @Test
    public void testFibonacciLleno() {
        fibonacci.txtfibonnaci("1");
    }
}





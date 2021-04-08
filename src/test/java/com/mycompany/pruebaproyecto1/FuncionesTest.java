/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaproyecto1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rocío
 */
public class FuncionesTest {
    
    public FuncionesTest() {
    }

     @Test
    public void testfactorialOperador() {
        System.out.println("factorialOperador");
        String cadena = "(defun_factorial (5))";
        Funciones instance = new Funciones();
        instance.factorialOperador(cadena);
        String expResult = "120!";
        //String result = instance.factorialOperador(cadena);
        //assertEquals(expResult, result);
       
        
        
    }


    @Test
    public void fibonacciOperador() {
        System.out.println("fibonacciOperador");
        String cadena = "(defun_fibonacci (5))";
        Funciones instance = new Funciones();
        String expResult = "1, 1, 2, 3, 5";
        //String result = instance.fibonacciOperador(cadena);
        //assertEquals(expResult, result);
    }
    
    @Test
    public void celciusOperador() {
        System.out.println("celciusOperador");
        String cadena = "(defun_FtoC (32))";
        Funciones instance = new Funciones();
        String expResult = "0";
        //String result = instance.celciusOperador(cadena);
        //assertEquals(expResult, result);
    }
    
    @Test
    public void farenheithOperador() {
        System.out.println("farenheithOperador");
        String cadena = "(defun_farenheith (10))";
        Funciones instance = new Funciones();
        String expResult = "50";
        //String result = instance.farenheithOperador(cadena);
        //assertEquals(expResult, result);
    }
    
    
    @Test
    public void testSomeMethod() {
    }
    
}

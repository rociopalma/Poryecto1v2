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
public class EscrituraTest {
    
    public EscrituraTest() {
    }
    
    @Test
    public void testquoteOperador() {
        System.out.println("quoteOperador");
        String cadena = "(quote (Hola Mundo))";
        Escritura instance = new Escritura();
        instance.quoteOperador(cadena);
        String expResult = "(Hola Mundo)";
        //String result = instance.quoteOperador(cadena);
        //assertEquals(expResult, result);
       
        
        
    }


    @Test
    public void testwriteOperador() {
        System.out.println("writeOperador");
        String cadena = "(write (Hola Mundo))";
        Escritura instance = new Escritura();
        String expResult = "Hola Mundo";
        //String result = instance.writeOperador(cadena);
        //assertEquals(expResult, result);
    }
    

    @Test
    public void testSomeMethod() {
    }
    
}

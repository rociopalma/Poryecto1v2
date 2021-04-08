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
public class OperacionesTest {

    public OperacionesTest() {
    }

    @Test
    public void testformatOperador() {
        System.out.println("formatOperador");
        String cadena = "(format_t " +"\"Resultado\"" + " (* 6 9))";
        Operaciones instance = new Operaciones();
        instance.formatOperador(cadena);
        String expResult = "(54)";
        //String result = instance.formatOperador(cadena);
        //assertEquals(expResult, result);

        
    }
        
    


    
}

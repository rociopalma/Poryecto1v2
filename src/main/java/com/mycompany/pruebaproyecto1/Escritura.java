/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaproyecto1;

/**
 *
 * @author Rocío
 */
public class Escritura {
   
    
    public void quoteOperador(String dato) {
        System.out.println("\t> " + dato);
    }

    public void writeOperador(String dato) {
        dato = dato.substring(1, dato.length() - 1);
        System.out.println("\t> " + dato);
    }
    
}

/*
 * La clase Escritura se manda a llamar cuando el comando detectado debe imprmir en pantalla lo que recibe.
 *//*Github: https://github.com/rociopalma/Poryecto1v2*/
package com.mycompany.pruebaproyecto1;

/**
 *
 * @author Rocío
 */
public class Escritura {
   
    /* Este metodo imprime el comando quote 
    @param dato es lo que el usuario agregó en quote*/
    public void quoteOperador(String dato) {
        System.out.println("\t> " + dato);
    }
    
    /* Este metodo imprime el comando write o print
    @param dato es lo que el usuario agregó en write o print*/
    public void writeOperador(String dato) {
        dato = dato.substring(1, dato.length() - 1);
        System.out.println("\t> " + dato);
    }
    
}

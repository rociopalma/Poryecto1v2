/*
 * La clase funciones se manda a llamar cuando el comando detectado es una función, contiene las operaciones de todas las funciones del intérprete.
 *//*Github: https://github.com/rociopalma/Poryecto1v2*/
package com.mycompany.pruebaproyecto1;

/**
 *
 * @author Rocío
 */
public class Funciones {

    /* Este metodo obtiene el número que se quiere operar y lo convierte a int, manda a operarlo y luego imprime la respuesta
    @param dato es lo que el usuario agregó al usar la función factorial*/
    public void factorialOperador(String dato) {
        dato = dato.substring(1, dato.length() - 1);
        int variable = factorial(Integer.valueOf(dato));
        System.out.println("\t> " + variable + "!");

    }

    /* Este metodo opera el número propuesto por el usuario 
    @param dato es el número a operar en factorial*/
    private int factorial(int dato) {

        if (dato <= 1) {
            return 1;
        }
        int res = dato * factorial(dato - 1);
        return res;
    }

    /* Este metodo obtiene el número que se quiere operar y lo convierte a int, manda a operarlo a otro método
    @param dato es lo que el usuario agregó al usar la función fibonacci*/
    public void fibonacciOperador(String dato) {
        dato = dato.substring(1, dato.length() - 1);
        fibonacciRecursivo(Integer.valueOf(dato));
    }

    /* Este metodo imprime la respuesta del fibonacci 
    @param dato es el número a operar en fibonacci*/
    public void fibonacciRecursivo(int serie) {

        String result = "";
        for (int i = 1; i <= serie; i++) {
            if (i == serie) {

                result += String.valueOf(calculaFibonacci(i));
            } else {

                result += String.valueOf(calculaFibonacci(i)) + ", ";
            }
        }
        System.out.println(result);
    }

    /* Este metodo opera el número propuesto por el usuario 
    @param dato es el número a operar en fibonacci*/
    private int calculaFibonacci(int serie) {
        //CASO BASE, si es cero devuelve un cero
        //puedes poner n<=0 tambien para incluir negativos
        if (serie == 0) {

            return 0;
            //CASO BASE, si es 1 devuelve un 1  
        } else if (serie == 1) {

            return 1;
        } else {
            //hago la suma 

            return calculaFibonacci(serie - 1) + calculaFibonacci(serie - 2);
        }
    }

    /* Este metodo opera el número propuesto por el usuario 
        @param dato es el número a operar de farenheith a celcius*/
    public void celciusOperador(String dato) {
        dato = dato.substring(1, dato.length() - 1);
        int numero = Integer.valueOf(dato);
        int op1 = numero - 32;
        int res = op1 * 5 / 9;
        System.out.println("Son " + res + " grados centígrados");
    }
    /* Este metodo opera el número propuesto por el usuario 
    @param dato es el número a operar de celcius a farenheith*/
    public void farenheithOperador(String dato) {
        dato = dato.substring(1, dato.length() - 1);
        int numero = Integer.valueOf(dato);
        int op1 = numero * 9 / 5;
        int res = op1 + 32;
        System.out.println("Son " + res + " grados farenheith");
    }
}

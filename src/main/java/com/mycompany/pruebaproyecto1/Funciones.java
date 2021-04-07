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
public class Funciones {
    
    
    public void factorialOperador(String dato) {
        dato = dato.substring(1, dato.length() - 1);
        int variable = factorial(Integer.valueOf(dato));
        System.out.println("\t> " + variable + "!");
        
    }
    
    private int factorial(int dato){
        
        if (dato<=1) {return 1;}
        int res = dato* factorial(dato-1);
        return res;
    } 
    
    
    public void fibonacciOperador(String dato){
        dato = dato.substring(1, dato.length() - 1);
        int variable = calculaFibonacci(Integer.valueOf(dato));
    }
    
    public void fibonacciRecursivo(int serie){
        for (int i = 1; i<=serie; i++){
            System.out.println(calculaFibonacci(i));
        }
        
    }
    
    private int calculaFibonacci(int serie){
        //CASO BASE, si es cero devuelve un cero
        //puedes poner n<=0 tambien para incluir negativos
        if (serie ==0){
            return 0;
            //CASO BASE, si es 1 devuelve un 1  
        } else if (serie == 1){
            return 1;
        } else {
            //hago la suma 
            return calculaFibonacci(serie - 1) + calculaFibonacci(serie - 2);
        }
    }
    
    
    
    public void celciusOperador(String dato){
       dato = dato.substring(1, dato.length() - 1); 
       int numero = Integer.valueOf(dato);
        int op1 = numero - 32;
        int res = op1 * 5/9;
        System.out.println("Son "+res+" grados centígrados");
    }
    
    public void farenheithOperador(String dato){
        dato = dato.substring(1, dato.length() - 1);
        int numero = Integer.valueOf(dato);
        int op1 = numero * 9/5;
        int res = op1 + 32;
        System.out.println("Son "+res+" grados farenheith");
    }
}

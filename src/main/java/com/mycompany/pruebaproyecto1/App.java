/* La clase app inizializa el intérprete, dejando que el usuario escriba el comando que desea interpretar. Identifica el comando 
y manda a llamar la clase necesaria para interpretarlo.*/
/*Github: https://github.com/rociopalma/Poryecto1v2*/

package com.mycompany.pruebaproyecto1;

import java.text.BreakIterator;
import java.util.Scanner;

public class App {

    Scanner Leer = new Scanner(System.in);
    Escritura Escritura = new Escritura();
    Operaciones Operaciones = new Operaciones();
    Funciones Funciones = new Funciones();
    
    public static void main(String[] args) throws Exception {
        (new App()).init();
    }

    /* Este metodo le aparece al usuario para simular un compilador, puede comenzar a escribir y  su comando se leerá para ser interpretado*/
    
    public void init() {
        String enunciado = "";
        System.out.println("LISP COMPILER");
        System.out.println("Language: Common Lisp          Layout: Vertical   ver comandos presione 1    Para salir escriba (EXIT)");
        Leer.useDelimiter("\n");
        System.out.println(" ");
        while (!enunciado.toUpperCase().equals("EXIT")) {

            enunciado = Leer.next();
            comandoEscritura(enunciado);
        }

        
    }//fin de init

    /* Este metodo lee e identifica el comando escrito por el usuario, mandando a llamar las clases que necesita para interpretarlo
    @param cadena es el comando que el usuario manda y se lee*/
    public void comandoEscritura(String cadena) {
        String aux = "";

        if (cadena.substring(0, 1).equals("(")
                && cadena.substring(cadena.length() - 1, cadena.length()).equals(")")) {
            aux = cadena.substring(1, cadena.length() - 1);
            //System.out.println(aux);
            String comando = aux.split(" ")[0].toUpperCase();
            switch (comando) {
                case "QUOTE":
                    //System.out.println(comando);
                    Escritura.quoteOperador(aux.substring(comando.length() + 1, aux.length()));
                    break;
                case "PRINT":
                case "WRITE":
                    //System.out.println(comando);
                    Escritura.writeOperador(aux.substring(comando.length() + 1, aux.length()));
                    break;
                case "DEFUN":
                    comandoEscritura(aux.substring(comando.length() + 1, aux.length()));
                    break;
                case "DEFUN_FACTORIAL":
                    Funciones.factorialOperador(aux.substring(comando.length() + 1, aux.length()));
                    break;
                    
                case "DEFUN_FIBONACCI":
                    Funciones.fibonacciOperador(aux.substring(comando.length() + 1, aux.length()));
                    break;
                    
                case "DEFUN_FTOC":
                    Funciones.celciusOperador(aux.substring(comando.length() + 1, aux.length()));
                    break;
                    
                case "DEFUN_CTOF":
                    Funciones.farenheithOperador(aux.substring(comando.length() + 1, aux.length()));
                    break;
                
                case "FORMAT_T":
                    Operaciones.formatOperador(aux.substring(comando.length() + 1, aux.length()));
                    break;
                default:
                    System.out.println("Comando no encontrado");
                    comandosAceptados();
                    break;
            }//fin de switch
        } else if (cadena.toUpperCase().equals("EXIT")) {
            System.out.println("Saliendo del sistema...");
        } else if (cadena.equals("1")) {
            comandosAceptados();
        } else {
            System.out.println("Comando incorrecto");
            comandosAceptados();
        }

    }


    /* Este metodo imprime los comandos que se pueden usar en este intérprete, al escribir mal un comando se imprime automáticamente o aparece al escribir 
    el número 1*/
    public void comandosAceptados() {
        System.out.println("\tCOMANDOS ACEPTADOS");
        System.out.println("\t\t>(format_t " +"\"mensaje\"" + " (op.mat num1 num2))");
        System.out.println("\t\t>(write (enunciado))");
        System.out.println("\t\t>(print (enunciado))");
        System.out.println("\t\t>(quote (enunciado))");
        System.out.println("\t\t>(defun_factorial (numero))");
        System.out.println("\t\t>(defun_fibonacci (numero))");
        System.out.println("\t\t>(defun_FtoC (numero))");
        System.out.println("\t\t>(defun_CtoF (numero))");
        System.out.println("\t\t>exit");
    }
}//fin de clase

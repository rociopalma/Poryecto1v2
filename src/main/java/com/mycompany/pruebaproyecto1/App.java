package com.mycompany.pruebaproyecto1;

import java.text.BreakIterator;
import java.util.Scanner;

public class App {

    Scanner Leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        (new App()).init();
    }

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

        /*String cadena ="(quote (Hola Mundo))";    
        cadena ="(print (Hola Mundo))";  */
    }//fin de init

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
                    quoteOperador(aux.substring(comando.length() + 1, aux.length()));
                    break;
                case "PRINT":
                case "WRITE":
                    //System.out.println(comando);
                    writeOperador(aux.substring(comando.length() + 1, aux.length()));
                    break;
                case "DEFUN":
                    comandoEscritura(aux.substring(comando.length() + 1, aux.length()));
                    break;
                case "DEFUN_FACTORIAL":
                    factorialOperador(aux.substring(comando.length() + 1, aux.length()));
                    break;
                
                case "FORMAT_T":
                    formatOperador(aux.substring(comando.length() + 1, aux.length()));
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

    public void quoteOperador(String dato) {
        System.out.println("\t> " + dato);
    }

    public void writeOperador(String dato) {
        dato = dato.substring(1, dato.length() - 1);
        System.out.println("\t> " + dato);
    }

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

    public void formatOperador(String dato) {
        String mensaje = obtenerMensaje(dato);
        dato = dato.substring(mensaje.length()+3);

        dato = dato.substring(1, dato.length() - 1);
        String[] cadenaDescompuesta = dato.split(" ");
        int aux = 0;
        float auxf = 0;

        switch (cadenaDescompuesta[0]) {
            case "+":
                aux = Integer.valueOf(cadenaDescompuesta[1]) + Integer.valueOf(cadenaDescompuesta[2]);

                //System.out.println("\t> "+mensaje+" "+aux);
                System.out.println("\t> " + mensaje + " "+aux);
                break;

            case "-":

                aux = Integer.valueOf(cadenaDescompuesta[1]) - Integer.valueOf(cadenaDescompuesta[2]);

                System.out.println("\t> " + mensaje + " "+aux);
                break;

            case "*":
                aux = Integer.valueOf(cadenaDescompuesta[1]) * Integer.valueOf(cadenaDescompuesta[2]);

                System.out.println("\t> "+ mensaje + " "+aux);
                break;
            case "/":
                auxf = Integer.valueOf(cadenaDescompuesta[1]) / Integer.valueOf(cadenaDescompuesta[2]);

                System.out.println("\t> " + mensaje + " "+auxf);
                break;

            case "^":
                auxf = (int) Math.pow(Integer.valueOf(cadenaDescompuesta[1]), Integer.valueOf(cadenaDescompuesta[2]));

                System.out.println("\t> " + mensaje + " "+auxf);
                break;

            default:
                System.out.println("Comando incorrecto, sintaxis del comando: \n(format_t (op.mat num1 num2))");

        }//fin switch
    }//fin format operados

    /*public String obtenerMensajeFormat(String dato){
        int contador = 0;
        boolean mensajeEncontrado = false;
        String Mensaje = "";
        String delimitador = "\"";
        int valorInicial = 0;
        int valorFinal = 0;
        while(!mensajeEncontrado){
            if(dato.charAt(contador)==delimitador.charAt(0)){
               if(valorInicial ==0){
                   valorInicial = contador;
               }else{
                   valorFinal = contador;
                   mensajeEncontrado = true;
               } 
            }//fin primer if
            contador++;
        }//fin de while
            if(mensajeEncontrado){
                Mensaje = dato.substring(valorInicial, valorFinal);
            }
        return Mensaje;
    }*/
    public String obtenerMensaje(String dato) {
        String mensaje = "";
        //Indicador para finalizar el proceso para obtener el mensaje de format_t "Mensjae"
        boolean msjEncontrado = false;
        String delimitador = "\"";
        //varialbes para determinad donde comenzar y donde finalizar para hacer el substring
        //se inicializa con -1 para poder capturar las posiciones correctas.
        int inicio = -1, fin = -1;
        //variable para llevar el control de recorrido para el String.
        int contador = 0;

        while (!msjEncontrado) {
            //Tambien se puede usar fi( dato.charAt(contador) == (char)34 )
            if (dato.charAt(contador) == delimitador.charAt(0)) {
                if (inicio == -1) {
                    //se captura el inicio del mensaje sumando una posicion para quitar " inicial
                    inicio = contador + 1;
                } else {
                    fin = contador;
                    msjEncontrado = true;
                }
            }
            contador++;
        }

        if (msjEncontrado) {
            mensaje = dato.substring(inicio, fin);
        }
        return mensaje;

    }

    public void comandosAceptados() {
        System.out.println("\tCOMANDOS ACEPTADOS");
        System.out.println("\t\t>(format_t (op.mat num1 num2))");
        System.out.println("\t\t>(write (enunciado))");
        System.out.println("\t\t>(print (enunciado))");
        System.out.println("\t\t>(quote (enunciado))");
        System.out.println("\t\t>exit");
    }
}//fin de clase

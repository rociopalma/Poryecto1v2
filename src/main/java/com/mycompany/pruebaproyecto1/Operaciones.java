/*
La clase operaciones se manda a llamar cuando el comando detectado  es una operación escrita en lenguaje lisp
 *//*Github: https://github.com/rociopalma/Poryecto1v2*/
package com.mycompany.pruebaproyecto1;

/**
 *
 * @author Rocío
 */
public class Operaciones {

    /* Este metodo opera el número propuesto por el usuario, dependiendo de la operación hará algo distinto
    @param dato es lo que el usuario introdujo para ser operado*/
    public void formatOperador(String dato) {
        String mensaje = obtenerMensaje(dato);
        dato = dato.substring(mensaje.length() + 3);

        dato = dato.substring(1, dato.length() - 1);
        String[] cadenaDescompuesta = dato.split(" ");
        int aux = 0;
        float auxf = 0;

        switch (cadenaDescompuesta[0]) {
            case "+":
                aux = Integer.valueOf(cadenaDescompuesta[1]) + Integer.valueOf(cadenaDescompuesta[2]);

                //System.out.println("\t> "+mensaje+" "+aux);
                System.out.println("\t> " + mensaje + " " + aux);
                break;

            case "-":

                aux = Integer.valueOf(cadenaDescompuesta[1]) - Integer.valueOf(cadenaDescompuesta[2]);

                System.out.println("\t> " + mensaje + " " + aux);
                break;

            case "*":
                aux = Integer.valueOf(cadenaDescompuesta[1]) * Integer.valueOf(cadenaDescompuesta[2]);

                System.out.println("\t> " + mensaje + " " + aux);
                break;
            case "/":
                auxf = Integer.valueOf(cadenaDescompuesta[1]) / Integer.valueOf(cadenaDescompuesta[2]);

                System.out.println("\t> " + mensaje + " " + auxf);
                break;

            case "^":
                auxf = (int) Math.pow(Integer.valueOf(cadenaDescompuesta[1]), Integer.valueOf(cadenaDescompuesta[2]));

                System.out.println("\t> " + mensaje + " " + auxf);
                break;

            default:
                System.out.println("Comando incorrecto, sintaxis del comando: \n(format_t (op.mat num1 num2))");

        }//fin switch
    }//fin format operados

    /* Este metodo captura el mensaje entre comillas dentro de la función de format t, para luego ser impreso junto con la respuesta de la operación
    @param dato es el mensaje introducido por el usuario*/
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

}

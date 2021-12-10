package com.ejercicios;

public class Sesion3 {

    /* Ejercicio Tema 3

    En este ejercicio tenéis que crear un bucle que permita concatenar textos
    e imprima el resultado final por consola.
    Tened en cuenta que los textos pueden venir de un array de tipo String.
    Por ejemplo: String[] nombres = {"", "", "", ""}

     */

        public static void main(String[] args) {

            String nombre1 = "Francisco ";
            String nombre2 = "Javier ";
            String apellido1 = "Muñoz ";
            String apellido2 = "Rodríguez";

            String[] completo = new String[]{ nombre1, nombre2, apellido1, apellido2};

            for(int i = 0 ; i < completo.length; i++){

                System.out.println(" "); // línea en blanco

                System.out.println(completo[i]);

               }
           
        }
    }


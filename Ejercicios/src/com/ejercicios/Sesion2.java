package com.ejercicios;

public class Sesion2 {

        public static void main(String[] args) {

            float precio = 100.00f;
            float precioFinal = precioReal(precio);
        }
        static float precioReal(float precio){
            float iva = (21 * precio / 100);
            float PrecioMasIva = (precio + iva);
            System.out.println("El precio del producto sin IVA es: " + precio);
            System.out.println("El IVA es: " + iva);
            System.out.println("El precio final del producto (IVA incluido) es: " + PrecioMasIva);
            return PrecioMasIva;
        }
    }



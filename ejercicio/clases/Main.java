/*
Ejercicio tema 4

1.- En este ejercicio tendréis que crear una clase SmartDevice.             OK
2.- Dentro crearéis las clases hijas: SmartPhone y SmartWatch.              OK
3.- Agregaréis atributos tal cual tendrían esos objetos en la realidad.     OK
4.- Crear constructor vacío y con todos los parámetros para cada clase.     OK
5.- Desde una clase Main: crearéis objetos de cada una y
    los utilizaréis para imprimir sus valores por consola.                  OK
 */

package poo.ejercicio.clases;

import poo.ejercicio.herencia.SmartPhone;
import poo.ejercicio.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone IPhoneX = new SmartPhone("Manzana", "X", 12.6, "Rojo", 256, 2021, "A estrenar", 1399.95, true,98.6  );
        System.out.println(IPhoneX.fabricante);

        SmartPhone Samsung300 = new SmartPhone(true,143.5);
        System.out.println(Samsung300.year);

        SmartWatch AppleWatch3 = new SmartWatch("Manzana","Series 3", 40, "Negro",32, 2022, "Segunda mano", 390.1, true, true);
        System.out.println(AppleWatch3.modelo);



    }
}

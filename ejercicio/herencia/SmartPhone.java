package poo.ejercicio.herencia;

import poo.ejercicio.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    boolean bluetooth;
    double peso;

    public SmartPhone(){

    }

    public SmartPhone(boolean bluetooth, double peso) {
        this.bluetooth = bluetooth;
        this.peso = peso;
    }

    public SmartPhone(String fabricante, String modelo, double tamanoPantalla, String color, int capacidadGB, int year, String estado, double precio, boolean bluetooth, double peso) {
        super(fabricante, modelo, tamanoPantalla, color, capacidadGB, year, estado, precio);
        this.bluetooth = bluetooth;
        this.peso = peso;
    }
}

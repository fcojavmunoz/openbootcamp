package poo.ejercicio.herencia;

import poo.ejercicio.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    boolean NikeEdition;
    boolean musica;

    public SmartWatch(){

    }

    public SmartWatch(boolean nikeEdition, boolean musica) {
        NikeEdition = nikeEdition;
        this.musica = musica;
    }

    public SmartWatch(String fabricante, String modelo, double tamanoPantalla, String color, int capacidadGB, int year, String estado, double precio, boolean nikeEdition, boolean musica) {
        super(fabricante, modelo, tamanoPantalla, color, capacidadGB, year, estado, precio);
        NikeEdition = nikeEdition;
        this.musica = musica;
    }
}

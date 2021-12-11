

package poo.ejercicio.clases;

public class SmartDevice {

    protected String fabricante;
    protected String modelo;
    protected double tamanoPantalla;
    protected String color;
    protected int capacidadGB;
    protected int year;
    protected String estado;
    protected double precio;

    public SmartDevice() {

    }

    public SmartDevice(String fabricante, String modelo, double tamanoPantalla, String color, int capacidadGB, int year, String estado, double precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tamanoPantalla = tamanoPantalla;
        this.color = color;
        this.capacidadGB = capacidadGB;
        this.year = year;
        this.estado = estado;
        this.precio = precio;
    }
}

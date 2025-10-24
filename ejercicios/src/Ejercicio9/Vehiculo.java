package Ejercicio9;

public class Vehiculo {

    private String marca;
    private String color;
    private double velocidadMaxima;


    public Vehiculo(String marcaInicial, String colorInicial, double velocidadInicial) {
        this.marca = marcaInicial;
        this.color = colorInicial;
        this.velocidadMaxima = velocidadInicial;
    }

    public void setColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El color ha sido cambiado a: " + nuevoColor);
    }

    public String getColor() {
        return this.color;
    }


}
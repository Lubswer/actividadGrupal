package Ejercicio2;

public class Vehiculo {
    private String color;

    public Vehiculo(String colorInicial) {
        this.color = colorInicial;
    }


    public void setColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public String getColor() {
        return this.color;
    }

    public static void main(String[] args) {
        // Se crea el objeto (la instancia)
        Vehiculo miCoche = new Vehiculo("rojo");
        miCoche.setColor("azul");
        System.out.println("Nuevo color del coche: " + miCoche.getColor());
    }
}
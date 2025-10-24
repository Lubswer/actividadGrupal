package Ejercicio2;

public class UtilidadNumerica {

    public static double calcularRaiz(double numero) {
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        // Se llama directamente desde la Clase
        double resultado = UtilidadNumerica.calcularRaiz(9);
        System.out.println("Raíz cuadrada de 9: " + resultado);
    }
}
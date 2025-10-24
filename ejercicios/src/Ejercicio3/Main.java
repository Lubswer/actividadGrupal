package Ejercicio3;

public class Main {


    public static int duplicar(int numeroOriginal) {
        int resultado = numeroOriginal * 2;
        return resultado;
    }

    public static void main(String[] args) {
        int valorInicial = 5;
        int valorFinal = Main.duplicar(valorInicial);

        System.out.println("El doble de " + valorInicial + " es: " + valorFinal);
    }
}
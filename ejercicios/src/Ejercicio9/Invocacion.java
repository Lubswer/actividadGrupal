package Ejercicio9;
public class Invocacion {
    public static void main(String[] args) {

        // --- 1. LLAMADA ESTÁTICA (Función) ---
        // Se usa el nombre de la Clase (Math) para acceder al método (sqrt).
        double resultado = Math.sqrt(81);
        System.out.println("La raíz es: " + resultado); // Output: 9.0

        // --- 2. LLAMADA DE INSTANCIA (Método) ---
        // 1. Creamos la instancia (el objeto)
        Vehiculo miCoche = new Vehiculo("Nissan", "Rojo", 200);

        // 2. Usamos el objeto para llamar al método de instancia.
        miCoche.setColor("Azul");


    }
}

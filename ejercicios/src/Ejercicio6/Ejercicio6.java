package Ejercicio6;
public class Ejercicio6{
    public static void modificarPrimitivo(int edad) {
        edad = 100;
    }

    //Método para objetos El objeto original si será modificado
    public static void modificarObjeto(Artista artista) {
        artista.setNombre("Artista Modificado");
    }

    public static void main(String[] args) {

        int edadOriginal = 30;
        modificarPrimitivo(edadOriginal);
        System.out.println("Edad original: " + edadOriginal); // Output: 30 (Demuestra Paso por Valor)

        Artista creador = new Artista("Original", "Pop", 5000);
        modificarObjeto(creador);
        System.out.println("Nombre después: " + creador.getNombre()); // Output: Artista Modificado (Demuestra el efecto de Paso por Referencia)
    }



}
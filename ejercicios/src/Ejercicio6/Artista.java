package Ejercicio6;

public class Artista {
    // --- Atributos Privados (Encapsulamiento) ---
    String nombre;
    String genero;
    int seguidores;

    // --- Constructor ---
    // Se ejecuta al crear el objeto para inicializar su estado.
    public Artista(String nombre, String genero, int seguidores) {
        this.nombre = nombre;
        this.genero = genero;
        this.seguidores = seguidores;
    }

    // --- Métodos Públicos (Interfaz) ---

    /**
     * Getter para leer el nombre.
     * @return El nombre del artista.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Setter para modificar el nombre.
     * @param nombre El nuevo nombre del artista.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // (Otros Getters y Setters para 'genero' y 'seguidores' irían aquí)
}
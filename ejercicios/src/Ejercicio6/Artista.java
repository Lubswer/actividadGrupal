package Ejercicio6;

public class Artista {
   
    String nombre;
    String genero;
    int seguidores;


    public Artista(String nombre, String genero, int seguidores) {
        this.nombre = nombre;
        this.genero = genero;
        this.seguidores = seguidores;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}

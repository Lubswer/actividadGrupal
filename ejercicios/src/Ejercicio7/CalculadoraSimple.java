package Ejercicio7;
public class CalculadoraSimple{

    // 1. Método que devuelve un valor numérico (int)
    public int calcularSuma(int a, int b) {
        // La lógica se ejecuta y se devuelve el resultado
        return a + b;
    }

    // 2. Método que devuelve texto (String)
    public String crearMensaje(String nombre) {
        // Se construye el texto y se devuelve
        return "Bienvenido, " + nombre + "!";
    }

    public static void main(String[] args) {
        CalculadoraSimple calc = new CalculadoraSimple();


        int resultadoSuma = calc.calcularSuma(10, 5);
        String mensaje = calc.crearMensaje("Lubswer");

        System.out.println("El resultado de la suma es: " + resultadoSuma); // Salida: 15
        System.out.println(mensaje); // Salida: Bienvenido, Lubswer!
    }
}
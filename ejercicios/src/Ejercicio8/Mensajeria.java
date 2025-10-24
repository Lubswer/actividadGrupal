package Ejercicio8;
public class Mensajeria {

    // Versión 1: Envía un mensaje de texto a un número de teléfono (long).
    public void enviarMensaje(String texto, long numeroDestino) {
        System.out.println("Enviando SMS al número: " + numeroDestino);
        System.out.println("Tipo de envío: SMS");
    }

    // Versión 2: Sobrecargada por TIPO. Envía el mismo mensaje a un correo (String).
    public void enviarMensaje(String texto, String emailDestino) {
        System.out.println("Enviando Email a: " + emailDestino);
        System.out.println("Tipo de envío: Correo Electrónico");
    }

    // Versión 3: Sobrecargada por NÚMERO. Envía un mensaje simple sin destinatario.
    public void enviarMensaje(String texto) {
        System.out.println("Enviando Notificación General: '" + texto + "'");
    }

    public static void main(String[] args) {
        Mensajeria app = new Mensajeria();

        // Java llama automáticamente a la versión correcta:
        app.enviarMensaje("El sistema se reiniciará en 5 minutos."); // Llama a Versión 3
        app.enviarMensaje("Tu código es 1234.", 593991234567L); // Llama a Versión 1 (long)
        app.enviarMensaje("Revisa tu bandeja de entrada.", "usuario@empresa.com"); // Llama a Versión 2 (String)
    }
}
package Ejercicio4;

public class CuentaBancaria {

    // ATRIBUTO PRIVADO: El dato está oculto. Nadie fuera de esta clase puede accederlo directamente.
    private double saldo = 0.0;
    private String titular;

    public CuentaBancaria(String titular) {
        this.titular = titular;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("Monto inválido.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
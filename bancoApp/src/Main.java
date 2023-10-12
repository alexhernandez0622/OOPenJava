// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear una cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria(12345, 1000.0);

        // Realizar operaciones en la cuenta
        cuenta.depositar(500.0);
        cuenta.retirar(200.0);
        cuenta.retirar(800.0);
    }
}
public class CuentaBancaria
{
    private int numeroCuenta;
    private double saldo;

    /**
     * Constructor de la clase CuentaBancaria.
     * @param numeroCuenta El número de cuenta.
     * @param saldo El saldo inicial de la cuenta.
     */
    public CuentaBancaria(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    /**
     * Obtiene el número de cuenta.
     * @return El número de cuenta.
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Obtiene el saldo de la cuenta.
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Deposita una cantidad en la cuenta.
     * @param cantidad La cantidad a depositar.
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito de " + cantidad + " realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("Error: La cantidad a depositar debe ser mayor que cero.");
        }
    }

    /**
     * Retira una cantidad de la cuenta.
     * @param cantidad La cantidad a retirar.
     */
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + " realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("Error: La cantidad a retirar es inválida o insuficiente saldo.");
        }
    }
}

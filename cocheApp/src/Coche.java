public class Coche
{
    private String modelo;
    private int velocidad;
    private boolean motorEncendido;

    /**
     * Constructor de la clase Coche.
     * @param modelo El modelo del coche.
     */
    public Coche(String modelo) {
        this.modelo = modelo;
        this.velocidad = 0;
        this.motorEncendido = false;
    }

    /**
     * Enciende el motor del coche.
     */
    public void encenderMotor() {
        motorEncendido = true;
        System.out.println("Motor encendido.");
    }

    /**
     * Apaga el motor del coche.
     */
    public void apagarMotor() {
        motorEncendido = false;
        velocidad = 0;
        System.out.println("Motor apagado.");
    }

    /**
     * Acelera el coche aumentando su velocidad.
     * @param incremento La cantidad en la que se incrementa la velocidad.
     */
    public void acelerar(int incremento) {
        if (motorEncendido) {
            velocidad += incremento;
            System.out.println("Acelerando. Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("Error: El motor está apagado, no se puede acelerar.");
        }
    }

    /**
     * Frena el coche disminuyendo su velocidad.
     * @param decremento La cantidad en la que se reduce la velocidad.
     */
    public void frenar(int decremento) {
        if (motorEncendido) {
            if (velocidad >= decremento) {
                velocidad -= decremento;
                System.out.println("Frenando. Velocidad actual: " + velocidad + " km/h");
            } else {
                System.out.println("Error: Velocidad insuficiente para frenar.");
            }
        } else {
            System.out.println("Error: El motor está apagado, no se puede frenar.");
        }
    }
}

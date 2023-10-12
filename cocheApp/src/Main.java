// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        // Crear un coche
        Coche miCoche = new Coche("Toyota Fortuner 2024");

        // Encender el motor
        miCoche.encenderMotor();

        // Acelerar y frenar
        miCoche.acelerar(50);
        miCoche.frenar(20);
        miCoche.acelerar(80);

        // Apagar el motor
        miCoche.apagarMotor();
    }
}
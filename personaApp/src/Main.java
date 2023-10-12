// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        // Crear objetos Persona
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("María", 25);

        // Mostrar información de las personas
        System.out.println("Persona 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());

        System.out.println("\nPersona 2:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
    }
}
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        // Crear una lista de libros
        List<Libro> biblioteca = new ArrayList<>();

        // Agregar libros a la lista
        biblioteca.add(new Libro("El Gran Gatsby", "F. Scott Fitzgerald", 1925));
        biblioteca.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        biblioteca.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));

        // Mostrar los libros en la biblioteca
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
    }
}
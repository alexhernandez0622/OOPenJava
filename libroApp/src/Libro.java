public class Libro
{
    private String titulo;
    private String autor;
    private int anioPublicacion;

    /**
     * Constructor de la clase Libro.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param anioPublicacion El año de publicación del libro.
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Obtiene el título del libro.
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el autor del libro.
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Obtiene el año de publicación del libro.
     * @return El año de publicación del libro.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * Representación en cadena del libro.
     * @return Una cadena que representa el libro.
     */
    @Override
    public String toString() {
        return "Libro: " + titulo + " - Autor: " + autor + " - Año: " + anioPublicacion;
    }
}

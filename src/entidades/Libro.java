package entidades;

public class Libro {
    public String ISBN;
    public String titulo;
    public String autor;
    public String genero;
    public boolean disponible;

    public Libro(String ISBN, String titulo, String autor, String genero, boolean disponible) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = disponible;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", Titulo: " + titulo + ", Autor: " + autor + ", Genero: " + genero + ", Disponible: " + disponible;
    }
}

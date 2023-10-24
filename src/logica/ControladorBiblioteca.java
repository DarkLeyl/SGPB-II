package logica;

import entidades.*;
import java.util.List;
import persistencia.*;

public class ControladorBiblioteca {
    private final RepositorioBiblioteca repositorio;

    public ControladorBiblioteca() {
        this.repositorio = new RepositorioBiblioteca();
    }

    public void agregarLibro(Libro libro) {
        repositorio.agregarLibro(libro);
    }

    public void quitarLibro(Libro libro) {
        repositorio.quitarLibro(libro);
    }

    public void agregarPersona(Persona persona) {
        repositorio.agregarPersona(persona);
    }

    public void quitarPersona(Persona persona) {
        repositorio.quitarPersona(persona);
    }

    public void realizarReserva(Libro libro, Persona persona) {
        repositorio.realizarReserva(libro, persona);
    }

    public void cancelarReserva(Reserva reserva) {
        repositorio.cancelarReserva(reserva);
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        return repositorio.buscarLibroPorTitulo(titulo);
    }

    public List<Libro> buscarLibroPorAutor(String autor) {
        return repositorio.buscarLibroPorAutor(autor);
    }

    public List<Libro> buscarLibroPorGenero(String genero) {
        return repositorio.buscarLibroPorGenero(genero);
    }

    public Persona buscarPersonaPorDni(String dni) {
        return repositorio.buscarPersonaPorDni(dni);
    }
}

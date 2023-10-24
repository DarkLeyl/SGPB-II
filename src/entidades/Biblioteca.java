package entidades;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public List<Libro> listaDeLibros;
    public List<Persona> listaDePersonas;
    public List<Reserva> listaDeReservas;

    public Biblioteca() {
        listaDeLibros = new ArrayList<>();
        listaDePersonas = new ArrayList<>();
        listaDeReservas = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        listaDeLibros.add(libro);
    }

    public void quitarLibro(Libro libro) {
        listaDeLibros.remove(libro);
    }

    public void agregarPersona(Persona persona) {
        listaDePersonas.add(persona);
    }

    public void quitarPersona(Persona persona) {
        listaDePersonas.remove(persona);
    }

    public void realizarReserva(Libro libro, Persona persona) {
        int idReserva = listaDeReservas.size() + 1;
        Reserva reserva = new Reserva(idReserva, libro, persona);
        listaDeReservas.add(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        listaDeReservas.remove(reserva);
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : listaDeLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public List<Libro> buscarLibroPorAutor(String autor) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : listaDeLibros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public List<Libro> buscarLibroPorGenero(String genero) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : listaDeLibros) {
            if (libro.getGenero().equalsIgnoreCase(genero)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public Persona buscarPersonaPorDni(String dni) {
        for (Persona persona : listaDePersonas) {
            if (persona.getDni().equals(dni)) {
                return persona;
            }
        }
        return null;
    }
}

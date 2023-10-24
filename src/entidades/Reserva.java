package entidades;


public class Reserva {
    public int idReserva;
    public Libro libro;
    public Persona persona;

    public Reserva(int idReserva, Libro libro, Persona persona) {
        this.idReserva = idReserva;
        this.libro = libro;
        this.persona = persona;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public Libro getLibro() {
        return libro;
    }

    public Persona getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return "ID de Reserva: " + idReserva + "\nLibro: " + libro + "\nPersona: " + persona;
    }
}


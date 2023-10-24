package entidades;

public class Persona {
    public String nombreCompleto;
    public int edad;
    public String dni;

    public Persona(String nombreCompleto, int edad, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto + ", Edad: " + edad + ", DNI: " + dni;
    }
}


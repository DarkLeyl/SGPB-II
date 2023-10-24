package entidades;

public class Estudiante extends Persona {
    public String matricula;
    public String carrera;

    public Estudiante(String nombreCompleto, int edad, String dni, String matricula, String carrera) {
        super(nombreCompleto, edad, dni);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matricula: " + matricula + ", Carrera: " + carrera;
    }
}


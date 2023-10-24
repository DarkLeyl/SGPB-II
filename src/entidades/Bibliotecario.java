package entidades;

public class Bibliotecario extends Persona {
    public String puesto;

    public Bibliotecario(String nombreCompleto, int edad, String dni, String puesto) {
        super(nombreCompleto, edad, dni);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    @Override
    public String toString() {
        return super.toString() + ", Puesto: " + puesto;
    }
}

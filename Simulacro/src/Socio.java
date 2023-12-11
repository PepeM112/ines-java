import java.time.LocalDate;

public class Socio extends Usuario {
    protected LocalDate inicioSuscripcion;
    protected LocalDate finSuscripcion;

    public Socio(String nombre, int edad, int id, LocalDate inicioSuscripcion) {
        super(nombre, edad, id);
        this.inicioSuscripcion = inicioSuscripcion;
    }

    public void calcularFinSuscripcion() {

    }

    public boolean puedeAsignarClase(Clase c) {

    }

    public void asignarClase(Clase c) {

    }

}


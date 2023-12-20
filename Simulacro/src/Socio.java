import java.time.LocalDate;

public class Socio extends Usuario {
    protected LocalDate inicioSuscripcion;
    protected LocalDate finSuscripcion;

    public Socio(String nombre, int edad, int id, LocalDate inicioSuscripcion) {
        super(nombre, edad, id);
        this.inicioSuscripcion = inicioSuscripcion;
        calcularFinSuscripcion();
    }

    public void calcularFinSuscripcion() {
        this.finSuscripcion = inicioSuscripcion.plusMonths(6);
    }

    public boolean puedeAsignarClase(Clase c) {
        if (this.getClasesAsignadas().size() >= 5) {
            return false;
        }
        return true;
    }

    public void asignarClase(Clase c) {
        this.getClasesAsignadas().add(c);
    }

}


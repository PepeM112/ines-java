import java.time.LocalDate;

public class SocioVIP extends Socio {

    private Entrenador entrenadorAsignado;

    public SocioVIP(String nombre, int edad, int id, LocalDate inicioSuscripcion) {
        super(nombre, edad, id, inicioSuscripcion);
        calcularFinSuscripcion();
    }

    public void asignarEntrenador(Entrenador entrenador, Horario horario) throws EntrenadorNoDisponibleException {
        boolean a = true;
        if (entrenador.getHorario() != horario || entrenador.getAlumnosAsignados() >= 5) {
            throw new EntrenadorNoDisponibleException();
        }
        this.entrenadorAsignado = entrenador;
    }

    public void calcularFinSuscripcion() {
        this.finSuscripcion = inicioSuscripcion.plusMonths(12);
    }

    public boolean puedeAsignarClase(Clase c) {
        if (this.getClasesAsignadas().size() >= 10) {
            return false;
        }
        return true;
    }

    public void asignarClase(Clase c) {
        getClasesAsignadas().add(c);
    }
}

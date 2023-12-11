import java.time.LocalDate;

public class SocioVIP extends Socio {

    private Entrenador entrenadorAsignado;

    public SocioVIP(String nombre, int edad, int id, LocalDate inicioSuscripcion) {
        super(nombre, edad, id, inicioSuscripcion);
    }

    public void asignarEntrenador(Entrenador entrenador, Horario horario) {

    }

    public void calcularFinSuscripcion() {

    }

    public boolean puedeAsignarClase(Clase c) {

    }

    public void asignarClase(Clase c) {

    }


}

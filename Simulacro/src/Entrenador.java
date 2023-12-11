public class Entrenador extends Usuario {

    private int alumnosAsignados;
    private Horario horario;
    private int numeroEntrenadores;

    public Entrenador(String nombre, int edad, int id, Horario horario) {
        super(nombre, edad, id);
        this.alumnosAsignados = 0;
        this.horario = horario;
    }

    public boolean puedeAsignarClase(Clase c) {

    }

    public void asignarClase(Clase c) {

    }
}

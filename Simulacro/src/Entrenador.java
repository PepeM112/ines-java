public class Entrenador extends Usuario {

    private int alumnosAsignados;
    private Horario horario;

    public Entrenador(String nombre, int edad, int id, Horario horario) {
        super(nombre, edad, id);
        this.alumnosAsignados = 0;
        this.horario = horario;
    }

    public Horario getHorario() {
        return this.horario;
    }

    public int getAlumnosAsignados() {
        return this.alumnosAsignados;
    }

    public boolean puedeAsignarClase(Clase c) {
        if (this.getClasesAsignadas().size() >= 4) {
            return false;
        }
        return true;
    }

    public void asignarClase(Clase c) {

    }
}

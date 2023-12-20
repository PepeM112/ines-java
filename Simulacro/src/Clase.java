public class Clase {
    private String nombre;
    private Horario horario;
    private int apuntados;
    private Entrenador instructor;

    public Clase(String nombre, Horario horario) {
        this.nombre = nombre;
        this.horario = horario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void añadirAlumno() {
        System.out.println("Escribe el ID del usuario:");
        int idUsuario = Principal.sc.nextInt();
        Usuario u = Principal.getUsuarioPorID(idUsuario);
        if (u == null) return;

        if (u.puedeAsignarClase(this) && apuntados < 15) {
            apuntados++;
            u.asignarClase(this);
        }
    }

    public void asignarInstructor(Entrenador e) {

    }

}

import java.util.ArrayList;

public abstract class Usuario {
    protected String nombre;
    protected int edad;
    protected int id;
    protected ArrayList<Clase> clasesAsignadas;

    public Usuario(String nombre, int edad, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.clasesAsignadas = new ArrayList<Clase>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Clase> getClasesAsignadas() {
        return clasesAsignadas;
    }

    public abstract boolean puedeAsignarClase(Clase c);

    public abstract void asignarClase(Clase c);


}

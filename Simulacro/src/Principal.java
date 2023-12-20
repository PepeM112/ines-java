import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static ArrayList<Usuario> usuariosRegistrados;
    private static ArrayList<Clase> clasesDisponibles;
    protected static final Scanner sc = new Scanner(System.in);

    public static void mostrarMenu() {
        System.out.println("Bienvenido al gimnasio");
        System.out.println("1. Ver lista de usuarios registrados.");
        System.out.println("2. Apuntar a un usuario a una clase.");
        System.out.println("3. Asignar entrenador a socio VIP.");
        System.out.println("0. Salir del programa.");
    }

    public static void verUsuariosRegistrados() {
        System.out.println("Lista de usuarios registrados:");
        for (Usuario u : usuariosRegistrados) {
            System.out.println(u);
        }
    }

    public static void asignarEntrenadorASocioVIP() {
        System.out.println("Escribe el ID del Socio:");
        int idSocio = sc.nextInt();
        Usuario u = getUsuarioPorID(idSocio);
        if (u == null) return;
        SocioVIP s;
        if (u instanceof SocioVIP) {
            s = (SocioVIP) u;
        } else {
            System.out.println("El usuario no es un socio VIP");
            return;
        }

        System.out.println("Escribe el ID del Entrenador:");
        int idEntrenador = sc.nextInt();
        u = getUsuarioPorID(idEntrenador);
        if (u == null) return;
        Entrenador e;
        if (u instanceof Entrenador) {
            e = (Entrenador) u;
        } else {
            System.out.println("El usuario no es un entrenador");
            return;
        }

        System.out.println("¿Qué horario quieres?");
        System.out.println("0 - MAÑANA");
        System.out.println("1 - TARDE");
        int horario = sc.nextInt();
        Horario h = Horario.values()[0];
        try {
            s.asignarEntrenador(e, h);
        } catch (EntrenadorNoDisponibleException ende) {
            System.err.println(ende);
        }
        System.out.println("Entrenador asignado con éxito.");
    }

    public static void apuntarUsuarioAClase() {
        System.out.println("Escribe el nombre de la clase:");
        String nombreClase = sc.nextLine();
        //Buscar clase
        for (Clase clase : clasesDisponibles) {
            if (clase.getNombre().equals(nombreClase)) {
                clase.añadirAlumno();
                return;
            }
        }
        System.out.println("No existe esta clase.");
    }

    public static ArrayList<Usuario> leerArchivoUsuarios() {

    }

    public static ArrayList<Clase> leerArchivoClases() {

    }

    public static Usuario getUsuarioPorID(int id) {
        for (Usuario u : usuariosRegistrados) {
            if (u.id == id) {
                return u;
            }
        }
        System.out.println("Usuario no encontrado");
        return null;
    }

    public static void main(String[] args) {
        usuariosRegistrados = leerArchivoUsuarios();
        clasesDisponibles = leerArchivoClases();

        while (true) {
            mostrarMenu();
            //Elegir opción
            int opcion = 0;
            switch (opcion) {
                case 1 -> {
                    verUsuariosRegistrados();
                }
                case 2 -> {
                    apuntarUsuarioAClase();
                }
                case 3 -> {
                    asignarEntrenadorASocioVIP();
                }
                case 0 -> {
                    System.exit(0);
                }
            }
        }
    }
}

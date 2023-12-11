import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static ArrayList<Usuario> usuariosRegistrados;
    private static ArrayList<Clase> clasesDisponibles;
    private static final Scanner sc = new Scanner(System.in);

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

    public static ArrayList<Usuario> leerArchivoUsuarios() {

    }

    public static ArrayList<Clase> leerArchivoClases() {

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

                }
                case 3 -> {

                }
                case 0 -> {
                    System.exit(0);
                }
            }
        }
    }
}

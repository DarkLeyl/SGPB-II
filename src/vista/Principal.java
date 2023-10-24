package vista;

import java.util.Scanner;
import logica.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControladorBiblioteca controlador = new ControladorBiblioteca();

        int opcion;
        do {
            System.out.println("Menu Principal:");
            System.out.println("1. Gestionar Usuarios");
            System.out.println("2. Gestionar Libros");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    MenuUsuarios.ejecutar(controlador, scanner);
                    break;
                case 2:
                    MenuLibros.ejecutar(controlador, scanner);
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 3);
    }
}

class MenuUsuarios {
    public static void ejecutar(ControladorBiblioteca controlador, Scanner scanner) {
        int opcion;
        do {
            System.out.println("\nMenu de Gestion de Usuarios:");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Agregar Bibliotecario");
            System.out.println("3. Realizar Reserva");
            System.out.println("4. Cancelar Reserva");
            System.out.println("5. Regresar al Menu Principal");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    MenuUsuarios.agregarEstudiante(controlador, scanner);
                    break;
                case 2:
                    MenuUsuarios.agregarBibliotecario(controlador, scanner);
                    break;
                case 3:
                    MenuUsuarios.realizarReserva(controlador, scanner);
                    break;
                case 4:
                    MenuUsuarios.cancelarReserva(controlador, scanner);
                    break;
                case 5:
                    System.out.println("Regresando al Menu Principal...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }

    public static void agregarEstudiante(ControladorBiblioteca controlador, Scanner scanner) {
    
    }

    public static void agregarBibliotecario(ControladorBiblioteca controlador, Scanner scanner) {
    
    }

    public static void realizarReserva(ControladorBiblioteca controlador, Scanner scanner) {
    
    }

    public static void cancelarReserva(ControladorBiblioteca controlador, Scanner scanner) {
    
    }
}

class MenuLibros {
    public static void ejecutar(ControladorBiblioteca controlador, Scanner scanner) {
        int opcion;
        do {
            System.out.println("\nMenu de Gestion de Libros:");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Quitar Libro");
            System.out.println("3. Buscar Libros por Titulo");
            System.out.println("4. Buscar Libros por Autor");
            System.out.println("5. Buscar Libros por Genero");
            System.out.println("6. Regresar al Menu Principal");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    MenuLibros.agregarLibro(controlador, scanner);
                    break;
                case 2:
                    MenuLibros.quitarLibro(controlador, scanner);
                    break;
                case 3:
                    MenuLibros.buscarLibrosPorTitulo(controlador, scanner);
                    break;
                case 4:
                    MenuLibros.buscarLibrosPorAutor(controlador, scanner);
                    break;
                case 5:
                    MenuLibros.buscarLibrosPorGenero(controlador, scanner);
                    break;
                case 6:
                    System.out.println("Regresando al Menu Principal...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 6);
    }

    public static void agregarLibro(ControladorBiblioteca controlador, Scanner scanner) {
    
    }

    public static void quitarLibro(ControladorBiblioteca controlador, Scanner scanner) {
    
    }

    public static void buscarLibrosPorTitulo(ControladorBiblioteca controlador, Scanner scanner) {
    
    }

    public static void buscarLibrosPorAutor(ControladorBiblioteca controlador, Scanner scanner) {
    
    }

    public static void buscarLibrosPorGenero(ControladorBiblioteca controlador, Scanner scanner) {
    
    }
}

package javapracticaalumno;

import java.util.Scanner;

/**
 * @author sulbaranjc
 */
public class JavaPracticaAlumno {

    public static Scanner scanner = new Scanner(System.in);

    /**
     * Este es el método principal de la aplicación.
     * @param args los argumentos de línea de comando
     */
    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Crear Alumno");
            System.out.println("2. Listar Alumnos");
            System.out.println("3. Actualizar Alumno");
            System.out.println("4. Eliminar Alumno");
            System.out.println("5. Cargar Datos de Ejemplo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    // Código para crear un alumno
                    break;
                case 2:
                    // Código para ver los alumnos
                    break;
                case 3:
                    // Código para actualizar un alumno
                    break;
                case 4:
                    // Código para eliminar un alumno
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.out.println("Gracias por usar el programa.");
                    salir = true;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
    
}

package practica_clases;
import java.util.Scanner;
public class Practica_clases {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("     BIENVENIDO A LA ESCUELA ARTE GRANADA     ");
        System.out.println("==============================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de aulas en la escuela: ");
        int numAulas = sc.nextInt();
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- MENÚ ESCUELA ---");
            System.out.println("1. Agregar Alumno");
            System.out.println("2. Agregar Profesor");
            System.out.println("3. Agregar Curso");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    Alumno alumno = CrearAlumno();
                    escuela.agregarAlumno(alumno);
                    break;
                case 2:
                    Profesor profesor = CrearProfesor();
                    escuela.agregarProfesor(profesor);
                    break;
                case 3:
                    Curso curso = CrearCurso();
                    escuela.agregarCurso(curso);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
        sc.close();
    }
    
    //Metodos para crear los objetos con las restricciones.
    public static Asignaturas CrearAsignatura(){
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor ingrese el nombre:");
        String nombre = sc.nextLine();
        System.out.println("por favor ingrese el codigo:");
        int cod = sc.nextInt();
        System.out.println("por favor ingrese el numero de horas de la asignatura:");
        int h = sc.nextInt();
        Asignaturas asig = new Asignaturas(h,cod,nombre);
        System.out.println(asig.toString());
        return asig;
    }
    public static Profesor CrearProfesor(){
        Scanner sc = new Scanner(System.in);
        String dni, nombre;
        int sueldo;

        System.out.print("Ingrese DNI: ");
        dni = sc.nextLine();
        
        System.out.print("Ingrese Nombre: ");
        nombre = sc.nextLine();

        // Validación de sueldo
        do {
            System.out.print("Ingrese sueldo por hora (minimo 10€): ");
            sueldo = sc.nextInt();
            if (sueldo < 10) {
                System.out.println("ERROR: El sueldo debe ser al menos 10€/h.");
            }
        } while (sueldo < 10);

        // Crear  Profesor
        Profesor profe = new Profesor(dni, nombre, sueldo);
        System.out.println("Profesor creado correctamente.");
        return profe;
    }
    public static Alumno CrearAlumno(){
        Scanner sc = new Scanner(System.in);
        String dni, nombre, apellidos, pago = "";
        int año;
        System.out.println("Ingrese el nombre del alumno: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el DNI del alumno: ");
        dni = sc.nextLine();
        System.out.println("Ingrese el apeliido del alumno");
        apellidos = sc.nextLine();
        System.out.println("Ingrese el año de su alumno: ");
        año = sc.nextInt();
        do {
            System.out.print("Ingrese el tipo de pago de su alumno 1/Completo 2/Plazos");
            System.out.println("Para seleccionar ingrese (1) o (2)");
            int trig = sc.nextInt();
            if (trig == 1) {
                pago = "Completo";
            }
            if (trig == 2) {
                pago = "Plazos";
            }
            else{
                System.out.println("ERROR: Opcion invalida, intente nuevamente: ");
                System.out.println("");
            }
        } while (!pago.equals("Plazos") && !pago.equals("Completo"));
        Alumno alumno = new Alumno(dni, nombre, apellidos, año, pago);
        return alumno;
    }
}

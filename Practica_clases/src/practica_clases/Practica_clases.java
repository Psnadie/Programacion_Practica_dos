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
        Profesor[] profes = new Profesor[numAulas];
        Asignaturas[] asig = new Asignaturas[numAulas*5];
        Alumno[] alum = new Alumno[numAulas*30];
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- MENÚ ESCUELA ---");
            System.out.println("1. Agregar Alumno");
            System.out.println("2. Agregar Profesor");
            System.out.println("3. Agregar Curso");
            System.out.println("4. Agregar Asignatura");
            System.out.println("5. Opciones de presupuesto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            int opcion2;
            sc.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    System.out.println("\n--- MENÚ ALUMNOS ---");
                    System.out.println("1. Agregar Alumno");
                    System.out.println("2. Eliminar Alumno");
                    System.out.println("3. Ver Alumnos");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            Rellenar(alum, CrearAlumno());
                            break;
                        case 2: 
                            break;
                        case 3:
                            ImprimirAlumnos(alum);
                            break;
                        case 4: 
                            break;  
                    }
                    break;
                case 2:
                    System.out.println("\n--- MENÚ PROFESOR ---");
                    System.out.println("1. Agregar Profesor");
                    System.out.println("2. Delegar Profesor");
                    System.out.println("3. Eliminar Profesor");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            break;
                        case 2: 
                            break;
                        case 3:
                            break;
                        case 4: 
                            break;  
                    }
                    break;
                case 3:
                    System.out.println("\n--- MENÚ CURSO ---");
                    System.out.println("1. Crear Curso");
                    System.out.println("2. Añadir Alumno al Curso");
                    System.out.println("3. Agregar Curso");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            break;
                        case 2: 
                            break;
                        case 3:
                            break;
                        case 4: 
                            break;  
                    }
                    break;
                case 4:
                    System.out.println("\n--- MENÚ ASIGNATURAS ---");
                    System.out.println("1. Crear Asignatura");
                    System.out.println("2. Eliminar Asignatura");
                    System.out.println("3. Salir");
                    System.out.print("Seleccione una opción: ");
                    salir = true;
                    break;
                case 5:
                    System.out.println("\n--- MENÚ PRESUPUESTO ---");
                    System.out.println("1. Crear Curso");
                    System.out.println("2. Añadir Alumno al Curso");
                    System.out.println("3. Agregar Curso");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            break;
                        case 2: 
                            break;
                        case 3:
                            break;
                        case 4: 
                            break;  
                    }
                    break;
                case 6:
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
            System.out.println("Ingrese el tipo de pago de su alumno 1/Completo 2/Plazos");
            System.out.println("Para seleccionar ingrese (1) o (2)");
            int trig = sc.nextInt();
            if (trig == 1) {
                pago = "Completo";
            }
            else if (trig == 2) {
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
    
    //Metodo para encontrar espacios en los arrays
    
    public static void Rellenar(Alumno[] alumnos, Alumno al){
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = al;
                break;
            }
        }
    }
    
    //Metodos para imprimir los arrays de objetos

    public static void ImprimirAlumnos(Alumno[] alumnos) {
    System.out.println("\n--- LISTA DE ALUMNOS ---");
    boolean hayAlumnos = false;  // Variable para verificar si hay alumnos en la lista
    for (int i = 0; i < alumnos.length; i++) {
        if (alumnos[i] != null) {  // Si el alumno en esa posición no es null
            System.out.println(alumnos[i].toString());  // Imprime la información del alumno
            hayAlumnos = true;
        }
    }
    
    if (!hayAlumnos) {
        System.out.println("No hay alumnos registrados.");
    }
}
}

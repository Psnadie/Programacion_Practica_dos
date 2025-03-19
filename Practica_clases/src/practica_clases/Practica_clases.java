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
        sc.nextLine();
        String[] aulas = new String[numAulas];
        Profesor[] profes = new Profesor[numAulas];
        Asignaturas[] asig = new Asignaturas[numAulas*5];
        Alumno[] alum = new Alumno[numAulas*30];
        Curso[] cursos = new Curso[numAulas];
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- MENÚ ESCUELA ---");
            System.out.println("1. Opciones Alumno");
            System.out.println("2. Opciones Profesor");
            System.out.println("3. Opciones Curso");
            System.out.println("4. Opciones Asignatura");
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
                            sc.nextLine();
                            System.out.println("Ingrese el DNI del Alumno a eliminar: ");
                            String d = sc.nextLine();
                            Eliminar(alum, d);
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
                    System.out.println("4. Ver Profesores");
                    System.out.println("5. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            Rellenar(profes, CrearProfesor());
                            break;
                        case 2: 
                                sc.nextLine();
                                System.out.println("Ingrese el DNI del Profesor que desea asignar: ");
                                String dn = sc.nextLine();
                                System.out.println("Ingrese el codigo de la Asignatura: ");
                                int codigo = sc.nextInt();
                                Asignar(asig, profes, dn, codigo);
                            break;
                        case 3:
                            sc.nextLine();
                            System.out.println("Ingrese el DNI del Profesor a eliminar");
                            String p = sc.nextLine();
                            Eliminar(profes,p);
                            break;
                        case 4: 
                            ImprimirProfesores(profes);
                            break;  
                        case 5:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\n--- MENÚ CURSO ---");
                    System.out.println("1. Crear Curso");
                    System.out.println("2. Ver Curso");
                    System.out.println("3. Agregar Curso");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            Curso c = CrearCurso(asig, alum, 1);
                            if (c == null) {
                                System.out.println("creacion del curso abortada");
                            }
                            else{
                                Rellenar(cursos, c);
                                System.out.println("creacion del curso exitosa");
                                System.out.println("Creacion del segundo año: ");
                                Curso c2 = CrearCurso(asig, alum, 2);;
                                if (c == null) {
                                    System.out.println("creacion del curso abortada");
                                }
                                else{
                                    Rellenar(cursos, c);
                                    System.out.println("creacion del curso exitosa");
                                }
                                break;
                            }
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
                    System.out.println("3. Ver Asignaturas");
                    System.out.println("3. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                                Rellenar(asig, CrearAsignatura());
                            break;
                        case 2: 
                            sc.nextLine();
                            System.out.println("Ingrese el codigo de la Asignatura a eliminar");
                            int a = sc.nextInt();
                            Eliminar(asig,a);
                            break;
                        case 3:
                            ImprimirAsignaturas(asig);
                            break;
                        case 4: 
                            break;  
                    }
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
    
public static Curso CrearCurso(Asignaturas[] asig, Alumno[] alumnos, int año) {
    Scanner sc = new Scanner(System.in);
    int contAsig = 0;
    int contAlum = 0;
    System.out.println("Ingrese el nombre del curso: ");
    String nom = sc.nextLine();

    System.out.println("Ingrese el número de la sala: ");
    int sala = sc.nextInt();
    sc.nextLine();

    System.out.println("Ingrese el costo de la matricula: ");
    int matricula = sc.nextInt();
    sc.nextLine();
    Asignaturas[] a = new Asignaturas[5];
    do {
        System.out.println("Ingrese el código de la asignatura (Ingrese -1 para salir):");
        int cod = sc.nextInt();
        sc.nextLine();
        if (cod == -1) {
            return null;
        }
        boolean asignada = false;
        for (int j = 0; j < asig.length; j++) {
            if (asig[j] != null && asig[j].Coincide(cod)) {
                if (asig[j].getProfesor() == null) {
                    System.out.println("Esta asignatura no tiene un profesor asignado");
                }
                else{
                    a[contAsig] = asig[j];
                    contAsig++;
                    asignada = true;
                    System.out.println("Asignatura designada exitosamente.");
                    break;
                }
            }
        }
        if (!asignada) {
            System.out.println("Código de asignatura no válido. Intente nuevamente.");
        }
    } while (contAsig < 5);

    // Creando array de alumnos para el curso
    Alumno[] alu = new Alumno[30];
    do {
        System.out.println("Ingrese el DNI del estudiante ('No' para no ingresar mas estudiantes):");
        String dni = sc.nextLine();
        if (dni.equalsIgnoreCase("No")) {
            return null;
        }
        boolean agregado = false;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].Coincide(dni)) {
                alu[contAlum] = alumnos[i];
                contAlum++;
                agregado = true;
                System.out.println("Alumno agregado exitosamente.");
                break;
            }
        }
        if (!agregado) {
            System.out.println("DNI no encontrado. Intente nuevamente.");
        }

        // Si se alcanzan 30 alumnos, preguntar si se quiere crear un curso extra
        if (contAlum == 30) {
            System.out.println("Se ha alcanzado el máximo de 30 alumnos. ¿Desea crear un nuevo curso? (Si/No)");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("Si")) {
                return CrearCurso(asig, alumnos, año); // Crear un cruso extra
            }
        }
    } while (contAlum < 10);

    // Crear y retornar el curso
    Curso curso = new Curso(nom, a, alu, año, sala, matricula);
    return curso;
}

    
    //Metodo para asignar un profesor a una asignatura 
    
    public static void Asignar(Asignaturas[] asig, Profesor[] profe, String dni, int cod){
        for (int i = 0; i < profe.length ; i++) {
            if (profe[i] != null) {
                if (profe[i].Coincide(dni)) {
                    for (int j = 0; j < asig.length; j++) {
                        if (asig[j] != null) {
                            if (asig[j].Coincide(cod)) {
                               asig[j].setProfesor(profe[i]);
                               int h = asig[j].getNumero_horas();
                               int ht = h + profe[i].getHoras_trabajo();
                               profe[i].setHoras_trabajo(ht);
                               System.out.println("Profesor designado exitosamente");
                            }
                        }
                    }
                }
            }
        }
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
    
    public static void Rellenar(Profesor[] p, Profesor profe){
        for (int i = 0; i < p.length; i++) {
            if (p[i] == null) {
                p[i] = profe;
                break;
            }
        }
    }
    
    public static void Rellenar(Asignaturas[] a, Asignaturas asig){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                a[i] = asig;
                break;
            }
        }
    }
    
    public static void Rellenar(Curso[] c, Curso curso){
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = curso;
                break;
            }
        }
    }
    
    
    //Metodos de eliminacion de elementos
    
    public static void Eliminar(Alumno[] alumnos, String dni){
        for (int i = 0; i < alumnos.length ; i++) {
            if (alumnos[i] != null) {
                if (alumnos[i].Coincide(dni)) {
                    alumnos[i] = null;
                    System.out.println("Alumno eliminado exitosamente");
                }
            }
        }
    }
    public static void Eliminar(Profesor[] p, String dni){
        for (int i = 0; i < p.length ; i++) {
            if (p[i] != null) {
                if (p[i].Coincide(dni)) {
                    p[i] = null;
                    System.out.println("Profesor eliminado exitosamente");
                }
            }
        }
    }
    public static void Eliminar(Asignaturas[] a, int cod){
        for (int i = 0; i < a.length ; i++) {
            if (a[i] != null) {
                if (a[i].Coincide(cod)) {
                    a[i] = null;
                    System.out.println("Asignatura eliminada exitosamente");
                }
            }
        }
    }
    
    //Metodos para imprimir los arrays de objetos

    public static void ImprimirAlumnos(Alumno[] alumnos) {
        System.out.println("\n--- LISTA DE ALUMNOS ---");
        boolean hayAlumnos = false;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) { 
                System.out.println(alumnos[i].toString());
                hayAlumnos = true;
            }
        }

        if (!hayAlumnos) {
            System.out.println("No hay alumnos registrados.");
        }
    }
    
    public static void ImprimirProfesores(Profesor[] profes) {
        System.out.println("\n--- LISTA DE PROFESORES ---");
        boolean hayProfes = false; 
        for (int i = 0; i < profes.length; i++) {
            if (profes[i] != null) {
                System.out.println(profes[i].toString());
                hayProfes = true;
            }
        }

        if (!hayProfes) {
            System.out.println("No hay profesores registrados.");
        }
    }
    
    public static void ImprimirAsignaturas(Asignaturas[] asig) {
        System.out.println("\n--- LISTA DE ASIGNATURAS ---");
        boolean hayProfes = false;
        for (int i = 0; i < asig.length; i++) {
            if (asig[i] != null) {
                System.out.println(asig[i].toString());
                hayProfes = true;
            }
        }

        if (!hayProfes) {
            System.out.println("No hay asignaturas registradas.");
        }
    }
    
}

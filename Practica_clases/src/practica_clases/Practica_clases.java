package practica_clases;
import java.util.Scanner;
public class Practica_clases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Asignaturas a = CrearAsignatura();
        System.out.println(a.toString());
    }
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
    public static Asignaturas[] CrearLoteAsignatura(){
        Scanner sc = new Scanner(System.in);
        Asignaturas[] asig  = new Asignaturas[10];
        return asig;
    }
}

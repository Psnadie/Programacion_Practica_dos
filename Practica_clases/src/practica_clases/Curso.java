package practica_clases;
public class Curso {
    private String nombre;
    private Profesor prof;
    private Asignaturas[] asig;
    private Alumno[] alumnos;
    private int año;
    private String aula;
    
    public Curso(){
        nombre = "";
        asig = new Asignaturas[5];
        alumnos = new Alumno[30];
        año = 0;
        aula = "N/A";
    }
    public Curso(String nom, Asignaturas[] a, Alumno[] alu, int añ, String aul){
        nombre = nom;
        asig = a;
        alumnos = alu;
        año = añ;
        aula = aul;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProf() {
        return prof;
    }

    public void setProf(Profesor prof) {
        this.prof = prof;
    }

    public Asignaturas[] getAsig() {
        return asig;
    }

    public void setAsig(Asignaturas[] asig) {
        this.asig = asig;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public int getAño() {
        return año;
    }


    public void setAño(int año) {
        this.año = año;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
    
    
}

package practica_clases;
public class Asignaturas {
    private int numero_horas;
    private Profesor profesor;
    private int codigo;
    private String nombre;
    
    Asignaturas(){
        this.numero_horas = 0;
        this.profesor = new Profesor();
        this.codigo = 0;
        this.nombre = "";
    }
    
    Asignaturas(int num, int cod, String nom){
        this.numero_horas = num;
        this.codigo = cod;
        this.nombre = nom;
    }
    @Override
    public String toString(){
        String str = "";
        str += this.nombre + " " + this.numero_horas + " " + this.codigo;
        return str;
    }
    public int getNumero_horas() {
        return numero_horas;
    }

    public void setNumero_horas(int numero_horas) {
        this.numero_horas = numero_horas;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

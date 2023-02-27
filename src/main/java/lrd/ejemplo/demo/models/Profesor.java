package lrd.ejemplo.demo.models;

public class Profesor extends Persona{

    private String codigoProfesor;
    private String titulo;

    private int idProfesor;

    private static int contadorId;

    public Profesor(String codigoProfesor, String titulo, String nombre, String apellido, int edad, String email) {
        super(nombre, apellido, edad, email);
        //TODO Auto-generated constructor stub

        this.codigoProfesor = codigoProfesor;
        this.titulo = titulo;

        this.idProfesor = ++Profesor.contadorId;
    }

    public String getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(String codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

   

    
    
}

package lrd.ejemplo.demo.models;

public class Estudiante extends Persona{

    private String codigoEstudiante;
    private String carrera;

    private int idEstudiante;

    private static int contadorId;

    public Estudiante(String codigoEstudiante, String carrera, String nombre, String apellido, int edad, String email) {
        super(nombre, apellido, edad, email);
        //TODO Auto-generated constructor stub

        this.codigoEstudiante = codigoEstudiante;
        this.carrera = carrera;

        this.idEstudiante = ++Estudiante.contadorId;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    

    
    
}

package entidad;

public class Estudiante {

    //Atributos
    private String nombre;
    private double notaFinal;

    //Constructores
    public Estudiante() {
    }

    public Estudiante(String nombre, double notaFinal) {
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    //toString
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", notaFinal=" + notaFinal + '}';
    }

}

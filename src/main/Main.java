package main;

import entidad.Estudiante;
import servicio.EstudianteServicio;

public class Main {

    public static void main(String[] args) {

        EstudianteServicio es = new EstudianteServicio();
        int n = 8;

        //Instanciación de 8 objetos de tipo "Estudiante".
        Estudiante est1 = es.crearEstudiante("Javier", 2);
        Estudiante est2 = es.crearEstudiante("Ana", 9);
        Estudiante est3 = es.crearEstudiante("Laura", 3);
        Estudiante est4 = es.crearEstudiante("Juan", 8);
        Estudiante est5 = es.crearEstudiante("Adriana", 3);
        Estudiante est6 = es.crearEstudiante("Agustina", 2);
        Estudiante est7 = es.crearEstudiante("Mariana", 5);
        Estudiante est8 = es.crearEstudiante("Leandro", 10);
        
        //Arreglo de objetos de tipo "Estudiante".
        Estudiante[] arrayEstudiantes = new Estudiante[n];
        arrayEstudiantes[0] = est1;
        arrayEstudiantes[1] = est2;
        arrayEstudiantes[2] = est3;
        arrayEstudiantes[3] = est4;
        arrayEstudiantes[4] = est5;
        arrayEstudiantes[5] = est6;
        arrayEstudiantes[6] = est7;
        arrayEstudiantes[7] = est8;
        
        for (Estudiante e : arrayEstudiantes) {
            System.out.println(e);
        }
        
        //Promedio de notas de los 8 estudiantes.
        double notaPromedio = es.promedioNotas(arrayEstudiantes);
        System.out.println("PROMEDIO DE NOTAS DE LOS ALUMNOS: " + notaPromedio);

        //Alumnos que recibieron nota mayor al promedio del curso
        int g = es.cantidadGenios(arrayEstudiantes, notaPromedio);
        String[] arrayGenios = new String[g];
        
        es.almacenarGenios(arrayEstudiantes, arrayGenios, notaPromedio);
        
        System.out.println(".:ALUMNOS CON NOTAS POR ENCIMA DEL PROMEDIO:.");
        for (String o : arrayGenios) {
            System.out.println("[" + o + "]");
        }

    }

}

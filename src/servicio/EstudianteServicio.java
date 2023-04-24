package servicio;

import entidad.Estudiante;

public class EstudianteServicio {

    public Estudiante crearEstudiante(String nombre, double nota) {
        return new Estudiante(nombre, nota);
    }

    public double promedioNotas(Estudiante[] arrayEstudiantes) {
        double sumaNotas = 0;
        for (int i = 0; i < arrayEstudiantes.length; i++) {
            sumaNotas += arrayEstudiantes[i].getNotaFinal();
        }
        return (sumaNotas / arrayEstudiantes.length);
    }

    public int cantidadGenios(Estudiante[] arrayEstudiantes, double notaPromedio) {
        int contador = 0;
        for (int i = 0; i < arrayEstudiantes.length; i++) {
            if (arrayEstudiantes[i].getNotaFinal() > notaPromedio) {
                contador++;
            }
        }
        return contador;
    }

    public void almacenarGenios(Estudiante[] arrayEstudiantes, String[] arrayGenios, double notaPromedio) {
        int j = 0;
        for (int i = 0; i < arrayEstudiantes.length; i++) {
            if (arrayEstudiantes[i].getNotaFinal() > notaPromedio) {
                arrayGenios[j] = arrayEstudiantes[i].getNombre();
                j++;
            }

        }
    }

}

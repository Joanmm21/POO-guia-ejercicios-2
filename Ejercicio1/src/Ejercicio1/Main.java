package Ejercicio1;
import Ejercicio1.Estudiante;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Lista de estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // Crear estudiantes
        estudiantes.add(new Estudiante("Joan Martinez", "MM120395", "Ingenieria", new double[]{9.5, 8.0, 6.5}));
        estudiantes.add(new Estudiante("Karla Claros", "MM151037", "Derecho", new double[]{7.8, 9.0, 9.5}));
        estudiantes.add(new Estudiante("Ruben Valiente", "VR120010", "Idiomas", new double[]{6.1, 6.5, 4.0}));

        // informacion de cada estudiante
        for (Estudiante est : estudiantes) {
            est.mostrarInformacion();
        }
    }
}

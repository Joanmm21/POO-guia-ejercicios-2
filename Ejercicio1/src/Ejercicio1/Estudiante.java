package Ejercicio1;

import java.util.Scanner;

public class Estudiante {
    private String nombreCompleto;
    private String carnet;
    private String carrera;
    private double[] notas;

    //Metodo constructor
    public Estudiante(String nombreCompleto, String carnet, String carrera, double[] notas) {
        this.nombreCompleto = nombreCompleto;
        this.carnet = carnet;
        this.carrera = carrera;
        this.notas = notas;
    }
    //Metodos getters y setters para los atributos
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    //Metodo que calcula el promedio de notas
    public double calcularPromedio(){
        double suma=0;
        for(double nota:notas){
            suma+=nota;
        }
        return suma/notas.length;
    }
    //Metodo que indica si el estudiante aprueba o reprueba
    public String Aprobacion() {
        return calcularPromedio() >= 6.0 ? "Aprobado" : "Reprobado";
    }
    // Metodo para mostrar informacion del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Carnet: " + carnet);
        System.out.println("Carrera: " + carrera);
        System.out.println("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("  Materia " + (i + 1) + ": " + notas[i]);
        }
        System.out.printf("Promedio: %.2f\n", calcularPromedio());
        System.out.println("Estado: " + Aprobacion());
        System.out.println("-----------------------------");
    }
}





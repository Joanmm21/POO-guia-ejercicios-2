package Ejercicio3;

import javax.swing.*;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    //Metodo constructor
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    public int getId() {
        return id;
    }
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nPuesto: " + puesto + "\nSalario: $" + salario + "\n";
    }
}

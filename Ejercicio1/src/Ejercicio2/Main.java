package Ejercicio2;
import Ejercicio2.Rectangulo;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 2- Clase Rectangulo
        Rectangulo rectangulo = new Rectangulo(6, 4); // base y altura
        Rectangulo cuadrado = new Rectangulo(5);      // solo un lado

        System.out.println("\nEJERCICIO 2: INFORMACION DE FIGURAS GEOMETRICAS");

        System.out.println("\nRectangulo:");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        System.out.println("\nCuadrado:");
        System.out.println("Lado: " + cuadrado.getBase());
        System.out.println("Area: " + cuadrado.calcularArea());
        System.out.println("Perimetro: " + cuadrado.calcularPerimetro());
    }
}


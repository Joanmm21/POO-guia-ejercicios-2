package Ejercicio2;

public class Rectangulo {

    private double base;
    private double altura;
    //Metodo constructor del rectangulo
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //Segundo metodo constructor del cuadrado que recibe un solo valor
    public Rectangulo(double lado){
        this.base = lado;
        this.altura = lado;
    }
    //Metodo para poder calcular el area
    public double calcularArea(){
        return base*altura;
    }
    //metodo para poder calcular el perimetro
    public double calcularPerimetro(){
        return 2* (base + altura);
    }
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}

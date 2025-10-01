package Ejercicio4;

public class Auto extends Vehiculo {
    private int numPuertas;


    public Auto(String marca, String modelo, int año, int numPuertas) {
        super(marca, modelo, año);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println();
    }
}
package Ejercicio4;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String marca, String modelo, int año, int cilindraje) {
        super(marca, modelo, año);
        this.cilindraje = cilindraje;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println();
    }
}
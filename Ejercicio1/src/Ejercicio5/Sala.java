package Ejercicio5;

public class Sala {
    private int numero;
    private int capacidadTotal;
    private int capacidadDisponible;

    public Sala(int numero, int capacidadTotal) {
        this.numero = numero;
        this.capacidadTotal = capacidadTotal;
        this.capacidadDisponible = capacidadTotal;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public int getCapacidadDisponible() {
        return capacidadDisponible;
    }

    public void setCapacidadDisponible(int capacidadDisponible) {
        this.capacidadDisponible = capacidadDisponible;
    }

    @Override
    public String toString() {
        return "Sala " + numero + " (Total: " + capacidadTotal + ", Disponible: " + capacidadDisponible + ")";
    }
}
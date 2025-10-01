package Ejercicio5;

public class Reserva {
    private String nombreCliente;
    private Pelicula pelicula;
    private Sala sala;
    private int asientosReservados;

    public Reserva(String nombreCliente, Pelicula pelicula, Sala sala, int asientosReservados) {
        this.nombreCliente = nombreCliente;
        this.pelicula = pelicula;
        this.sala = sala;
        this.asientosReservados = asientosReservados;
    }

    // Getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreCliente + ", Película: " + pelicula.getTitulo() +
                ", Sala: " + sala.getNumero() + ", Asientos: " + asientosReservados;
    }
}
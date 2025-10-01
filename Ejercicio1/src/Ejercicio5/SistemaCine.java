package Ejercicio5;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCine {
    static ArrayList<Pelicula> peliculas = new ArrayList<>();
    static ArrayList<Sala> salas = new ArrayList<>();
    static ArrayList<Reserva> reservas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Sistema de Reservas de Cine ---");
            System.out.println("1. Agregar Película");
            System.out.println("2. Agregar Sala");
            System.out.println("3. Realizar Reserva");
            System.out.println("4. Cancelar Reserva");
            System.out.println("5. Mostrar Reservas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> agregarPelicula();
                case 2 -> agregarSala();
                case 3 -> realizarReserva();
                case 4 -> cancelarReserva();
                case 5 -> mostrarReservas();
                case 0 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        } while (true);
    }

    static void agregarPelicula() {
        System.out.print("Código: ");
        String codigo = sc.nextLine();
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();
        System.out.print("Duración (minutos): ");
        int duracion;
        try {
            duracion = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Duración inválida.");
            return;
        }

        peliculas.add(new Pelicula(codigo, titulo, genero, duracion));
        System.out.println("Película agregada con éxito.");
    }

    static void agregarSala() {
        System.out.print("Número de sala: ");
        int numero;
        try {
            numero = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Número de sala inválido.");
            return;
        }

        System.out.print("Capacidad total: ");
        int capacidad;
        try {
            capacidad = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Capacidad inválida.");
            return;
        }

        salas.add(new Sala(numero, capacidad));
        System.out.println("Sala agregada con éxito.");
    }

    static void realizarReserva() {
        if (peliculas.isEmpty() || salas.isEmpty()) {
            System.out.println("Debe agregar al menos una película y una sala primero.");
            return;
        }

        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.println("Películas disponibles:");
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println("[" + i + "] " + peliculas.get(i));
        }

        int indicePelicula;
        try {
            System.out.print("Ingrese el número de la película que desea ver (índice entre corchetes): ");
            indicePelicula = Integer.parseInt(sc.nextLine());
            if (indicePelicula < 0 || indicePelicula >= peliculas.size()) {
                System.out.println("Número fuera de rango. Seleccione un índice válido de la lista.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número válido para la película.");
            return;
        }

        System.out.println("Salas disponibles:");
        for (int i = 0; i < salas.size(); i++) {
            System.out.println("[" + i + "] " + salas.get(i));
        }

        int indiceSala;
        try {
            System.out.print("Ingrese el número de la sala que desea reservar (índice entre corchetes): ");
            indiceSala = Integer.parseInt(sc.nextLine());
            if (indiceSala < 0 || indiceSala >= salas.size()) {
                System.out.println("Número fuera de rango. Seleccione un índice válido de la lista.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número válido para la sala.");
            return;
        }

        int asientos;
        try {
            System.out.print("Cantidad de asientos para reservar: ");
            asientos = Integer.parseInt(sc.nextLine());
            if (asientos <= 0) {
                System.out.println("Debe reservar al menos 1 asiento.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número válido para los asientos.");
            return;
        }

        Sala salaSeleccionada = salas.get(indiceSala);
        if (salaSeleccionada.getCapacidadDisponible() >= asientos) {
            salaSeleccionada.setCapacidadDisponible(
                    salaSeleccionada.getCapacidadDisponible() - asientos
            );
            reservas.add(new Reserva(nombre, peliculas.get(indicePelicula), salaSeleccionada, asientos));
            System.out.println("Reserva realizada con éxito.");
        } else {
            System.out.println("No hay suficientes asientos disponibles en la sala.");
        }
    }

    static void cancelarReserva() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas para cancelar.");
            return;
        }

        System.out.println("Reservas registradas:");
        for (int i = 0; i < reservas.size(); i++) {
            System.out.println("[" + i + "] " + reservas.get(i));
        }

        int indice;
        try {
            System.out.print("Ingrese el número de la reserva que desea cancelar (índice entre corchetes): ");
            indice = Integer.parseInt(sc.nextLine());
            if (indice < 0 || indice >= reservas.size()) {
                System.out.println("Número fuera de rango. Seleccione un índice válido de la lista.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Número inválido.");
            return;
        }

        Reserva reserva = reservas.remove(indice);
        reserva.getSala().setCapacidadDisponible(
                reserva.getSala().getCapacidadDisponible() + reserva.getAsientosReservados()
        );

        System.out.println("Reserva cancelada con éxito.");
    }

    static void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            System.out.println("Reservas registradas:");
            for (Reserva r : reservas) {
                System.out.println(r);
            }
        }
    }
}
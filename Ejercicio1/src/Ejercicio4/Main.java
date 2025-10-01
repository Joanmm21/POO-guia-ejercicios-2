package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Hyundai", "Accent", 2016, 4);
        Auto auto2 = new Auto("Honda", "Civic", 1994, 2);

        Moto moto1 = new Moto("Ducati", "V4RS", 2022, 321);
        Moto moto2 = new Moto("Kawasaki", "Ninja", 2024, 649);

        System.out.println("Información de Autos:");
        auto1.mostrarInfo();
        auto2.mostrarInfo();

        System.out.println("Información de Motos:");
        moto1.mostrarInfo();
        moto2.mostrarInfo();
    }
}

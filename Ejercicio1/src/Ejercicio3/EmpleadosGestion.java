package Ejercicio3;
import javax.swing.*;
import java.util.ArrayList;

public class EmpleadosGestion {
    private static ArrayList<Empleado> empleados = new ArrayList<>();

        public static void main(String[] args) {
            String opcion;

            do {
                opcion = JOptionPane.showInputDialog(
                        "Menú de Gestión de Empleados\n" +
                                "1. Agregar empleado\n" +
                                "2. Listar empleados\n" +
                                "3. Buscar empleado por ID\n" +
                                "4. Eliminar empleado\n" +
                                "5. Salir\n" +
                                "Ingrese una opción:");

                if (opcion == null) break;

                switch (opcion) {
                    case "1":
                        agregarEmpleado();
                        break;
                    case "2":
                        listarEmpleados();
                        break;
                    case "3":
                        buscarEmpleadoPorId();
                        break;
                    case "4":
                        eliminarEmpleado();
                        break;
                    case "5":
                        JOptionPane.showMessageDialog(null, "Programa finalizado.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Por favor ingrese opción del 1 al 5");
                }
            } while (!"5".equals(opcion));
        }
    private static void agregarEmpleado() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del empleado:"));
            if (buscarEmpleado(id) != null) {
                JOptionPane.showMessageDialog(null, "El ID ya existe. No se puede duplicar, favor de ingresar otro número de ID");
                return;
            }

            // Validacion del nombre
            String nombre;
            while (true) {
                nombre = JOptionPane.showInputDialog("Ingrese nombre del empleado:");
                if (nombre != null && nombre.matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$") && !nombre.trim().isEmpty() && !nombre.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Nombre inválido. Favor de ingresar nombre del empleado");
                }
            }
            // Validacion del puesto
            String puesto;
            while (true) {
                puesto = JOptionPane.showInputDialog("Ingrese puesto del empleado:");
                if (puesto != null && puesto.matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$") && !puesto.trim().isEmpty() && !puesto.matches(".*\\d.*")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Puesto inválido. Favor de ingresar puesto del empleado");
                }
            }
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario del empleado:"));
            Empleado emp = new Empleado(id, nombre.trim(), puesto.trim(), salario);
            empleados.add(emp);
            JOptionPane.showMessageDialog(null, "Empleado agregado correctamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Intente de nuevo.");
        }
    }

    private static void listarEmpleados() {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
            return;
        }
        StringBuilder lista = new StringBuilder("Lista de Empleados:\n\n");
        for (Empleado emp : empleados) {
            lista.append(emp.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }
    private static void buscarEmpleadoPorId() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese ID a buscar:"));
            Empleado emp = buscarEmpleado(id);

            if (emp != null) {
                JOptionPane.showMessageDialog(null, emp.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID inválido.");
        }
    }
    private static void eliminarEmpleado() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese ID a eliminar:"));
            Empleado emp = buscarEmpleado(id);
            if (emp != null) {
                empleados.remove(emp);
                JOptionPane.showMessageDialog(null, "Empleado eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID inválido.");
        }
    }
    private static Empleado buscarEmpleado(int id) {
        for (Empleado emp : empleados) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }
}
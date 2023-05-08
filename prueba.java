package Tareas;

import javax.swing.JOptionPane;

public class prueba {
    public static void main(String[] args) {
        prueba2 prueba = new prueba2();
        boolean seguir = true;
        while (seguir) {
            String opcion = JOptionPane.showInputDialog(
                "Seleccione una opción:\n" +
                "1. Registrar usuario\n" +
                "2. Modificar usuario\n" +
                "3. Mostrar usuarios\n" +
                "4. Contar usuarios\n" +
                "5. Salir"
            );
            switch (opcion) {
                case "1":
                    prueba.registrarUsuario();
                    break;
                case "2":
                    String rut = JOptionPane.showInputDialog("Ingrese el RUT del usuario que desea modificar");
                    prueba.modificarUsuario(rut);
                    break;
                case "3":
                    prueba.mostrarUsuarios();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "La cantidad de usuarios registrados es: " + prueba.contarUsuarios());
                    break;
                case "5":
                    seguir = false;
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        }
    }
}
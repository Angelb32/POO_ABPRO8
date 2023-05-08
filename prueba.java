package Tareas;

import javax.swing.JOptionPane;

public class prueba {
    private String[][] usuarios = new String[100][10];
    private int numUsuarios = 0;

    public static void main(String[] args) {
        prueba prueba = new prueba();
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione una opción:\n" +
                "1. Registrar usuario\n" +
                "2. Mostrar usuarios\n" +
                "3. Contar usuarios por categoría\n" +
                "4. Modificar usuario\n" +
                "5. Eliminar usuario\n" +
                "6. Salir"
            ));

            switch (opcion) {
                case 1:
                    prueba.registrarUsuario();
                    break;
                case 2:
                    prueba.mostrarUsuarios();
                    break;
                case 3:
                    prueba.contarUsuariosPorCategoria();
                    break;
                case 4:
                    prueba.modificarUsuario();
                    break;
                case 5:
                    prueba.eliminarUsuario();
                    break;
                case 6:
                    System.exit(opcion);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo");
            }
        } while (opcion != 6);
    }

    public void registrarUsuario() {
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(
            "Seleccione un tipo de usuario:\n" +
            "1. Cliente\n" +
            "2. Profesional\n" +
            "3. Administrativo"
        ));

        String[] datosComunes = pedirDatosComunes();

        switch (tipo) {
            case 1:
                String[] datosCliente = pedirDatosCliente();
                agregarUsuario(datosComunes, datosCliente);
                break;
            case 2:
                String[] datosProfesional = pedirDatosProfesional();
                agregarUsuario(datosComunes, datosProfesional);
                break;
            case 3:
                String[] datosAdministrativo = pedirDatosAdministrativo();
                agregarUsuario(datosComunes, datosAdministrativo);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo");
        }
    }

    private String[] pedirDatosComunes() {
        String[] datosComunes = new String[3];
        datosComunes[0] = JOptionPane.showInputDialog("Ingrese el nombre");
        datosComunes[1] = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (dd/mm/yyyy)");
        datosComunes[2] = JOptionPane.showInputDialog("Ingrese el RUN");

        return datosComunes;
    }

    private String[] pedirDatosCliente() {
        String[] datosCliente = new String[3];
        datosCliente[0] = JOptionPane.showInputDialog("Ingrese la dirección");
        datosCliente[1] = JOptionPane.showInputDialog("Ingrese el teléfono");
        datosCliente[2] = JOptionPane.showInputDialog("Ingrese la cantidad de empleados");

        return datosCliente;
    }

    private String[] pedirDatosProfesional() {
        String[] datosProfesional = new String[2];
        datosProfesional[0] = JOptionPane.showInputDialog("Ingrese los años de experiencia");
        datosProfesional[1] = JOptionPane.showInputDialog("Ingrese el departamento");

        return datosProfesional;
    }

    private String[] pedirDatosAdministrativo() {
        String[] datosAdministrativo = new String[2];
        datosAdministrativo[0] = JOptionPane.showInputDialog("Ingrese la función");
        datosAdministrativo[1] = JOptionPane.showInputDialog("Ingrese el nombre del superior");

        return datosAdministrativo;
    }
    
    private void agregarUsuario(String[] datosComunes, String[] datosEspecificos) {
        String[] usuario = new String[10];
        for (int i = 0; i < datosComunes.length; i++) {
            usuario[i] = datosComunes[i];
        }
        for (int i = 0; i < datosEspecificos.length; i++) {
            usuario[i+3] = datosEspecificos[i];
        }
        usuario[9] = Integer.toString(numUsuarios + 1);
        usuarios[numUsuarios] = usuario;
        numUsuarios++;
    }
    
    private void eliminarUsuario() {
        String usuario = JOptionPane.showInputDialog("Ingrese el nombre del usuario a eliminar");
        for (int i = 0; i < numUsuarios; i++) {
            if (usuarios[i][0].equals(usuario)) {
                for (int j = i; j < numUsuarios-1; j++) {
                    usuarios[j] = usuarios[j+1];
                }
                usuarios[numUsuarios-1] = null;
                numUsuarios--;
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró el usuario");
    }

    public void mostrarUsuarios() {
        String[] titulos = {"Nombre", "Fecha de nacimiento", "RUN", "Dirección", "Teléfono", "Cantidad de empleados", "Años de experiencia", "Departamento", "Función", "Nombre del superior"};
        String[][] datos = new String[numUsuarios][10];

        for (int i = 0; i < numUsuarios; i++) {
            String[] usuario = usuarios[i];
            for (int j = 0; j < 3; j++) {
                datos[i][j] = usuario[j];
            }
            switch (usuario[3]) {
                case "1":
                    for (int j = 0; j < 3; j++) {
                        datos[i][j+3] = usuario[j+4];
                    }
                    datos[i][6] = "-";
                    datos[i][7] = "-";
                    datos[i][8] = "-";
                    datos[i][9] = "-";
                    break;
                case "2":
                    for (int j = 0; j < 2; j++) {
                        datos[i][j+6] = usuario[j+4];
                    }
                    datos[i][3] = "-";
                    datos[i][4] = "-";
                    datos[i][5] = "-";
                    datos[i][8] = "-";
                    datos[i][9] = "-";
                    break;
                case "3":
                    for (int j = 0; j < 2; j++) {
                        datos[i][j+8] = usuario[j+4];
                    }
                    datos[i][3] = "-";
                    datos[i][4] = "-";
                    datos[i][5] = "-";
                    datos[i][6] = "-";
                    datos[i][7] = "-";
                    break;
            }
        }

        String listado = "";

        for (int i = 0; i < 10; i++) {
            listado += titulos[i] + "\t";
        }

        listado += "\n";

        for (int i = 0; i < numUsuarios; i++) {
            for (int j = 0; j < 10; j++) {
                listado += datos[i][j] + "\t";
            }
            listado += "\n";
        }

        JOptionPane.showMessageDialog(null, listado);
    }
    
    public void contarUsuariosPorCategoria() {
        int numClientes = 0;
        int numProfesionales = 0;
        int numAdministrativos = 0;

        for (int i = 0; i < numUsuarios; i++) {
            switch (usuarios[i][3]) {
                case "1":
                    numClientes++;
                    break;
                case "2":
                    numProfesionales++;
                    break;
                case "3":
                    numAdministrativos++;
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Clientes: " + numClientes + "\nProfesionales: " + numProfesionales + "\nAdministrativos: " + numAdministrativos);
    }

    public void modificarUsuario() {
        String run = JOptionPane.showInputDialog("Ingrese el RUN del usuario a modificar");

        for (int i = 0; i < numUsuarios; i++) {
            if (usuarios[i][2].equals(run)) {
                int tipo = Integer.parseInt(usuarios[i][3]);

                String[] datosComunes = pedirDatosComunes();

                switch (tipo) {
                    case 1:
                        String[] datosCliente = pedirDatosCliente();
                        actualizarUsuario(i, datosComunes, datosCliente);
                        break;
                    case 2:
                        String[] datosProfesional = pedirDatosProfesional();
                        actualizarUsuario(i, datosComunes, datosProfesional);
                        break;
                    case 3:
                        String[] datosAdministrativo = pedirDatosAdministrativo();
                        actualizarUsuario(i, datosComunes, datosAdministrativo);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo");
                }

                JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con ese RUN");
    }

    private void actualizarUsuario(int indice, String[] datosComunes, String[] datosEspecificos) {
        for (int i = 0; i < 3; i++) {
            usuarios[indice][i] = datosComunes[i];
        }

        for (int i = 0; i < datosEspecificos.length; i++) {
            usuarios[indice][i+4] = datosEspecificos[i];
        }
    }
}
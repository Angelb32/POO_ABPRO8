package Tareas;

import javax.swing.JOptionPane;

public class prueba2 {
    private String[][] usuarios = new String[100][10];
    private int numUsuarios = 0;

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

    public void mostrarUsuarios() {
        String usuariosTexto = "";
        for (int i = 0; i < numUsuarios; i++) {
            String[] usuario = usuarios[i];
            usuariosTexto += "Usuario #" + usuario[9] + "\n";
            usuariosTexto += "Nombre: " + usuario[0] + "\n";
            usuariosTexto += "Fecha de nacimiento: " + usuario[1] + "\n";
            usuariosTexto += "RUN: " + usuario[2] + "\n";

            if (usuario[3] != null) {
                usuariosTexto += "Dirección: " + usuario[3] + "\n";
                usuariosTexto += "Teléfono: " + usuario[4] + "\n";
                usuariosTexto += "Cantidad de empleados: " + usuario[5] + "\n";
            } else if (usuario[6] != null) {
                usuariosTexto += "Años de experiencia: " + usuario[6] + "\n";
                usuariosTexto += "Departamento: " + usuario[7] + "\n";
            } else if (usuario[8] != null) {
                usuariosTexto += "Función: " + usuario[8] + "\n";
                usuariosTexto += "Nombre del superior: " + usuario[9] + "\n";
            }
            usuariosTexto += "\n";
        }
        JOptionPane.showMessageDialog(null, usuariosTexto);
    }
}
package Tareas;

public class UsuarioAdmin_POO_ABPRO8 extends Usuario_POO_ABPRO8 {
    private String nombreUsuario;
    private String contrasena;

    public UsuarioAdmin_POO_ABPRO8(String nombre, String nombreUsuario, String contrasena) {
        super(nombre);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Contraseña: " + contrasena);
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Análisis de usuario administrador");
    }
}
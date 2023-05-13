package Tareas;

	public class UsuarioAdmin_POO_ABPRO8 extends Usuario_POO_ABPRO8 {

    private String permisos;

    public UsuarioAdmin_POO_ABPRO8(String nombre, String username, String password, String permisos) {
        super(nombre, username, password);
        this.permisos = permisos;
    }

    public void asignarPermisos(String permisos) {
        this.permisos = permisos;
    }

    public void revocarPermisos() {
        this.permisos = "";
    }

    // otros métodos específicos de usuario administrativo
}
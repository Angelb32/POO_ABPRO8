package Tareas;

	public class UsuarioNormal_POO_ABPRO8 extends Usuario_POO_ABPRO8 {

    private int nivel;

    public UsuarioNormal_POO_ABPRO8(String nombre, String username, String password, int nivel) {
        super(nombre, username, password);
        this.nivel = nivel;
    }

    public void aumentarNivel() {
        this.nivel++;
    }

    // otros métodos específicos de usuario normal
}
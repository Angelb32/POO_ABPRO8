package Tareas;

	import java.util.ArrayList;

	public class Listado_POO_ABPRO8 {
    private ArrayList<Asesoria_POO_ABPRO8> usuarios;

    public Listado_POO_ABPRO8() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Asesoria_POO_ABPRO8 usuario) {
        usuarios.add(usuario);
    }

    public void analizarUsuarios() {
        for (Asesoria_POO_ABPRO8 usuario : usuarios) {
            usuario.analizarUsuario();
        }
    }
}
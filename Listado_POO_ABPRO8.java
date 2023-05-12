package Tareas;

import java.util.ArrayList;

	public class Listado_POO_ABPRO8 {
    private ArrayList<Asesoria_POO_ABPRO8> listaUsuarios;

    public Listado_POO_ABPRO8() {
        this.listaUsuarios = new ArrayList<Asesoria_POO_ABPRO8>();
    }

    public void agregarUsuario(Asesoria_POO_ABPRO8 usuario) {
        this.listaUsuarios.add(usuario);
    }

    public void analizarUsuarios() {
        for (Asesoria_POO_ABPRO8 usuario : listaUsuarios) {
            usuario.analizarUsuario();
        }
    }
}
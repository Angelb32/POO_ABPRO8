package Tareas;

import java.util.ArrayList;

public class Listado_POO_ABPRO8 {
    private ArrayList<Usuario_POO_ABPRO8> listaUsuarios;

    public Listado_POO_ABPRO8() {
        listaUsuarios = new ArrayList<Usuario_POO_ABPRO8>();
    }

    public void agregarElemento(Usuario_POO_ABPRO8 usuario) {
        listaUsuarios.add(usuario);
    }

    public void llamarAnalizarUsuario() {
        for (Usuario_POO_ABPRO8 usuario : listaUsuarios) {
            usuario.analizarUsuario();
        }
    }
}
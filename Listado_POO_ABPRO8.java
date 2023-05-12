package Tareas;

import java.util.ArrayList;
import java.util.List;

public class Listado_POO_ABPRO8 {

    private List<Asesoria_POO_ABPRO8> listaUsuarios;

    public Listado_POO_ABPRO8() {
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Asesoria_POO_ABPRO8 usuario) {
        listaUsuarios.add(usuario);
    }

    public void analizarUsuarios() {
        for (Asesoria_POO_ABPRO8 usuario : listaUsuarios) {
            usuario.analizarUsuario();
        }
    }

    public void brindarAsesorias() {
        for (Asesoria_POO_ABPRO8 usuario : listaUsuarios) {
            usuario.brindarAsesoria();
        }
    }
}
package Tareas;

public class Principal_POO_ABPRO8 {
    public static void main(String[] args) {
    	Usuario_POO_ABPRO8 usuario1 = new UsuarioAdmin_POO_ABPRO8("admin", "123456", 1);
        Usuario_POO_ABPRO8 usuario2 = new UsuarioNormal_POO_ABPRO8("usuario", "abcdef");

        Listado_POO_ABPRO8 listado = new Listado_POO_ABPRO8();
        listado.agregarUsuario(usuario1);
        listado.agregarUsuario(usuario2);

        listado.analizarUsuarios();
    }
}
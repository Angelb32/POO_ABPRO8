package Tareas;

	public class Usuario_POO_ABPRO8 implements Asesoria_POO_ABPRO8 {
    private String nombreUsuario;

    public Usuario_POO_ABPRO8(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " + nombreUsuario);
    }
}

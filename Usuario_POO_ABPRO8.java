package Tareas;

	public abstract class Usuario_POO_ABPRO8 implements Asesoria {

    private String nombreUsuario;

    public Usuario_POO_ABPRO8(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public abstract void mostrarInformacion();

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " + nombreUsuario);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
package Tareas;

	public class Usuario_POO_ABPRO8 implements Asesoria_POO_ABPRO8 {
    private String nombre;
    private String correo;

    public Usuario_POO_ABPRO8(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " + nombre);
    }
}
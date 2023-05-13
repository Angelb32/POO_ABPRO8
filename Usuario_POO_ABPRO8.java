package Tareas;

	public class Usuario_POO_ABPRO8 implements Asesoria_POO_ABPRO8 {
    protected String nombre;
    protected String username;
    protected String email;

    public Usuario_POO_ABPRO8(String nombre, String username, String email) {
        this.nombre = nombre;
        this.username = username;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " + getUsername());
    }
}
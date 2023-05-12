package Tareas;

public class Usuario_POO_ABPRO8 implements Asesoria_POO_ABPRO8 {

    private String nombreUsuario;
    private String clave;

    public Usuario_POO_ABPRO8(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Tipo de usuario: Normal");
    }

    @Override
    public String getTitulo() {
        return "N/A";
    }

    @Override
    public String getFechaIngreso() {
        return "N/A";
    }
}

package Tareas;

public abstract class Usuario_POO_ABPRO8 {
    private String nombre;

    public Usuario_POO_ABPRO8(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre de usuario: " + nombre);
    }

    public void analizarUsuario() {
        System.out.println("Análisis de usuario");
    }
}
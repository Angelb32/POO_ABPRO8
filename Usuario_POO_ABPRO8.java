package Tareas;

public abstract class Usuario_POO_ABPRO8 {
    // Atributos de la clase Usuario
    private String nombre;

    // Constructor
    public Usuario_POO_ABPRO8(String nombre) {
        this.nombre = nombre;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para analizar el usuario
    public abstract void analizarUsuario();

    // Método para mostrar información del usuario
    public void mostrarInformacion() {
        // Mostramos el nombre del usuario
        System.out.println("Nombre: " + nombre);
    }
}
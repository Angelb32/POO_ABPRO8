package Tareas;

public class Profesional_POO_ABPRO8 extends Usuario_POO_ABPRO8 implements Asesoria_POO_ABPRO8 {
    private String titulo;
    private String fechaIngreso;

    public Profesional_POO_ABPRO8(String nombreUsuario, String clave, String titulo, String fechaIngreso) {
        super(nombreUsuario, clave);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }
}

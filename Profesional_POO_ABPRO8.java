package Tareas;

	public class Profesional_POO_ABPRO8 extends Usuario_POO_ABPRO8 implements Asesoria_POO_ABPRO8 {

    private String titulo;
    private String fechaIngreso;

    public Profesional_POO_ABPRO8(String nombre, String username, String email, String titulo, String fechaIngreso) {
        super(nombre, username, email);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
package Tareas;

import java.time.LocalDate;

	public class Profesional_POO_ABPRO8 extends Usuario_POO_ABPRO8 {
    private String titulo;
    private LocalDate fechaIngreso;

    public Profesional_POO_ABPRO8(String nombre, String username, String email, String titulo, LocalDate fechaIngreso) {
        super(nombre, username, email);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + getTitulo());
        System.out.println("Fecha de ingreso: " + getFechaIngreso());
    }
}
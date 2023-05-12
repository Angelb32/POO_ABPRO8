package Tareas;

	public class Profesional_POO_ABPRO8 extends Usuario_POO_ABPRO8 {

    private String titulo;
    private int añosExperiencia;

    public Profesional_POO_ABPRO8(String nombre, String correo, String titulo, int añosExperiencia) {
        super(nombre, correo);
        this.titulo = titulo;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Tipo: Profesional");
        System.out.println("Título: " + titulo);
        System.out.println("Años de experiencia: " + añosExperiencia);
    }
}

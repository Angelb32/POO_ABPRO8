package Tareas;

	public class Administrativo_POO_ABPRO8 extends Usuario_POO_ABPRO8 implements 	Asesoria_POO_ABPRO8 {
    private String area;
    private int experienciaPrev;

    public Administrativo_POO_ABPRO8(String nombre, String usuario, String contraseña, String 	area, int experienciaPrev) {
        super(nombre, usuario, contraseña);
        this.area = area;
        this.experienciaPrev = experienciaPrev;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrev + " años");
    }

    // Getters y setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getExperienciaPrev() {
        return experienciaPrev;
    }

    public void setExperienciaPrev(int experienciaPrev) {
        this.experienciaPrev = experienciaPrev;
    }
}
package Tareas;

	public class Administrativo_POO_ABPRO8 extends Usuario_POO_ABPRO8 {
    private String area;
    private String experienciaPrev;

    public Administrativo_POO_ABPRO8(String nombreUsuario, String area, String experienciaPrev) {
        super(nombreUsuario);
        this.area = area;
        this.experienciaPrev = experienciaPrev;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrev() {
        return experienciaPrev;
    }

    public void setExperienciaPrev(String experienciaPrev) {
        this.experienciaPrev = experienciaPrev;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrev);
    }
}
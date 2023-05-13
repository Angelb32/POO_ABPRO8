package Tareas;

	public class Administrativo_POO_ABPRO8 extends Usuario_POO_ABPRO8 {

    private String area;
    private String experienciaPrevia;

    public Administrativo_POO_ABPRO8(String nombreUsuario, String area, String 	experienciaPrevia) {
        super(nombreUsuario);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public void mostrarInformacion() {
    	System.out.println("Nombre de usuario: " + getNombre());
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }
}
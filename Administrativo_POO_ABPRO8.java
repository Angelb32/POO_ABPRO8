package Tareas;

public class Administrativo_POO_ABPRO8 extends Usuario_POO_ABPRO8 {
    private String area;
    private String experienciaPrevia;

    public Administrativo_POO_ABPRO8(String nombreUsuario, String contraseña, String area, String experienciaPrevia) {
        super(nombreUsuario, contraseña);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getArea() {
        return area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }
}
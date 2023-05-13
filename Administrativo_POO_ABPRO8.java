package Tareas;

public class Administrativo_POO_ABPRO8 extends Usuario_POO_ABPRO8 {
    private String area;
    private String experienciaPrevia;

    public Administrativo_POO_ABPRO8(String nombre, String username, String email, String 	area, String experienciaPrevia) {
        super(nombre, username, email);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getArea() {
        return area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + getArea());
        System.out.println("Experiencia previa: " + getExperienciaPrevia());
    }
}

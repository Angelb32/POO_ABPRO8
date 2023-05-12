package Tareas;

public class UsuarioAdmin_POO_ABPRO8 extends Usuario_POO_ABPRO8 {

    private int nivelDeAcceso;

    public UsuarioAdmin_POO_ABPRO8(String nombreUsuario, String contraseña, int nivelDeAcceso) {
        super(nombreUsuario, contraseña);
        this.nivelDeAcceso = nivelDeAcceso;
    }

    public int getNivelDeAcceso() {
        return nivelDeAcceso;
    }

    public void setNivelDeAcceso(int nivelDeAcceso) {
        this.nivelDeAcceso = nivelDeAcceso;
    }

    public void reiniciarContraseña() {
        // Código para reiniciar la contraseña del usuario
    }
}
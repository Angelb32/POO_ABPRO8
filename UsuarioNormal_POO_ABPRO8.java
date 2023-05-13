package Tareas;

public class UsuarioNormal_POO_ABPRO8 extends Usuario_POO_ABPRO8 {
    private String nombreUsuario;
    private String contraseña;
    private int nivel;

    public UsuarioNormal_POO_ABPRO8(String nombre, String nombreUsuario, String contraseña, int nivel) {
        super(nombre);
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.nivel = nivel;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Contraseña: " + contraseña);
        System.out.println("Nivel: " + nivel);
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Análisis de usuario normal");
    }
}

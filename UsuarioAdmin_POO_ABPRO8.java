package Tareas;

	public class UsuarioAdmin_POO_ABPRO8 extends Usuario_POO_ABPRO8 implements Asesoria_POO_ABPRO8 {

    public UsuarioAdmin_POO_ABPRO8(String nombre, String email, String contrasenia) {
        super(nombre, email, contrasenia);
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Usuario Administrativo: " + this.getNombre());
    }

    @Override
    public void brindarAsesoria() {
        System.out.println("Brindando asesoría como usuario administrativo...");
    }
}
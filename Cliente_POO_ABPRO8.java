package Tareas;

	public class Cliente_POO_ABPRO8 extends Usuario_POO_ABPRO8 implements Asesoria_POO_ABPRO8 {

    public Cliente_POO_ABPRO8(String nombreUsuario) {
        super(nombreUsuario);
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre de Usuario: " + this.getNombreUsuario());
        System.out.println("Tipo de Usuario: Cliente");
    }
}
package Tareas;

	public class Cliente_POO_ABPRO8 extends Usuario_POO_ABPRO8 {

    private int antiguedad;
    private String tipoCliente;

    public Cliente_POO_ABPRO8(String nombre, String correo, int antiguedad, String tipoCliente) {
        super(nombre, correo);
        this.antiguedad = antiguedad;
        this.tipoCliente = tipoCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Tipo: Cliente");
        System.out.println("Antigüedad: " + antiguedad + " años");
        System.out.println("Tipo de cliente: " + tipoCliente);
    }
}
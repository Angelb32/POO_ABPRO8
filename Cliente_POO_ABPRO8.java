package Tareas;

	public class Cliente_POO_ABPRO8 extends Usuario_POO_ABPRO8 {
    // Atributos propios de la clase Cliente
    private String empresa;

    // Constructor
    public Cliente_POO_ABPRO8(String nombre, String empresa) {
        // Invocamos el constructor de la clase padre
        super(nombre);
        this.empresa = empresa;
    }

    // Métodos
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    // Implementación del método analizarUsuario de la interface Asesoria
    @Override
    public void analizarUsuario() {
        // Mostramos el nombre del usuario
        System.out.println("Nombre: " + getNombre());
        // Mostramos la empresa del cliente
        System.out.println("Empresa: " + empresa);
    }
}
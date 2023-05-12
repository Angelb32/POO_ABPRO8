package Tareas;

	public class Administrativo_POO_ABPRO8 extends Usuario_POO_ABPRO8 {

    private String puesto;
    private String departamento;

    public Administrativo_POO_ABPRO8(String nombre, String correo, String puesto, String departamento) {
        super(nombre, correo);
        this.puesto = puesto;
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Tipo: Administrativo");
        System.out.println("Puesto: " + puesto);
        System.out.println("Departamento: " + departamento);
    }
}

package Tareas;

	public class Cliente_POO_ABPRO8 extends Usuario_POO_ABPRO8 implements Asesoria_POO_ABPRO8 {

    private String empresa;
    private String rubro;

    public Cliente_POO_ABPRO8(String rut, String nombre, String apellido, String email, String telefono, String empresa, String rubro) {
        super(rut, nombre, apellido, email, telefono);
        this.empresa = empresa;
        this.rubro = rubro;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getRubro() {
        return rubro;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Empresa: " + empresa);
        System.out.println("Rubro: " + rubro);
    }
}
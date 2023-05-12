package Tareas;

public class Cliente_POO_ABPRO8 extends Usuario_POO_ABPRO8 {
    private String empresa;
    
    public Cliente_POO_ABPRO8(String nombreUsuario, String contraseña, String empresa) {
        super(nombreUsuario, contraseña);
        this.empresa = empresa;
    }
    
    public String getEmpresa() {
        return empresa;
    }
    
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Tipo de usuario: Cliente");
        System.out.println("Empresa: " + empresa);
    }
}

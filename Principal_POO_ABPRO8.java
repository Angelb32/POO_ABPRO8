package Tareas;

	public class Principal_POO_ABPRO8 {
	public static void main(String[] args) {
    // Crear instancia de Listado
    Listado_POO_ABPRO8 listado = new Listado_POO_ABPRO8();
    
    // Crear instancias de diferentes tipos de usuarios
    Cliente_POO_ABPRO8 cliente1 = new Cliente_POO_ABPRO8("Juan Pérez", "12345678-9");
    Profesional_POO_ABPRO8 profesional1 = new Profesional_POO_ABPRO8("María González", "98765432-1", "Ingeniera Civil", "01/01/2020");
    Administrativo_POO_ABPRO8 administrativo1 = new Administrativo_POO_ABPRO8("Pedro García", "23456789-0", "Contabilidad", "3 años de experiencia");
    UsuarioAdmin_POO_ABPRO8 admin1 = new UsuarioAdmin_POO_ABPRO8("admin", "admin123");
    UsuarioNormal_POO_ABPRO8 normal1 = new UsuarioNormal_POO_ABPRO8("usuario", "password123");

    // Agregar las instancias al listado
    listado.agregarElemento(cliente1);
    listado.agregarElemento(profesional1);
    listado.agregarElemento(administrativo1);
    listado.agregarElemento(admin1);
    listado.agregarElemento(normal1);

    // Llamar al método analizarUsuario() de todas las instancias registradas en el listado
    listado.llamarAnalizarUsuario();
  }
}
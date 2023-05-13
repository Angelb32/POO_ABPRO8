package Tareas;	

	public static void Principal_POO_ABPRO8(String[] args) {
    Listado listado = new Listado();

    // Crear instancias de diferentes tipos de usuarios
    Usuario_POO_ABPRO8 cliente = new Cliente_POO_ABPRO8("Juan", "juan123", "juan@correo.com", "987654321");
    Usuario_POO_ABPRO8 profesional = new Profesional_POO_ABPRO8("Pedro", "pedro456", "pedro@correo.com", "Ingeniero", LocalDate.now());
    Usuario_POO_ABPRO8 administrativo = new Administrativo_POO_ABPRO8("María", "maria789", "maria@correo.com", "Recursos Humanos", 2);

    // Agregar instancias al listado
    listado.agregarUsuario(cliente);
    listado.agregarUsuario(profesional);
    listado.agregarUsuario(administrativo);

    // Llamar al método que despliega los datos
    listado.analizarUsuarios();
	}
}
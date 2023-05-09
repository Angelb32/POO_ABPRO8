package POO_ABPRO5;

public class Main {
    public static void main(String[] args) {
    	// Crear instancia de Cliente
    	Cliente cliente1 = new Cliente(12345678-9, "Angel", "Brito", "987654321", "AFP Provida", 1, "Av. Libertador 123", "Santiago", 30);

    	// Crear instancia de Usuario
    	Usuario usuario1 = new Usuario("Luis", "1990-05-12", "12345678-9");

    	// Crear instancia de Capacitación
    	Capacitacion capacitacion1 = new Capacitacion(1, 261841568, "2023-05-08", "09:00 AM", "Sala 101", 2, 10);

    	// Desplegar datos de Cliente
    	System.out.println("Datos de Cliente:");
    	System.out.println(cliente1.toString());

    	// Desplegar datos de Usuario
    	System.out.println("Datos de Usuario:");
    	System.out.println(usuario1.toString());

    	// Desplegar datos de Capacitación
    	System.out.println("Datos de Capacitación:");
    	System.out.println(capacitacion1.toString());
    }
}
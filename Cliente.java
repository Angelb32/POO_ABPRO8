package POO_ABPRO5;

/**
 * Clase que representa a un cliente de la empresa de asesorías en prevención de riesgos.
 * 
 * @version 1.0
 * @author Angel Brito
 */
public class Cliente {

    /** RUT del cliente */
    private int rut;
    
    /** Nombres del cliente */
    private String nombres;
    
    /** Apellidos del cliente */
    private String apellidos;
    
    /** Teléfono del cliente */
    private String telefono;
    
    /** AFP del cliente */
    private String afp;
    
    /** Sistema de salud del cliente: 1 (Fonasa) o 2 (Isapre) */
    private int sistemaSalud;
    
    /** Dirección del cliente */
    private String direccion;
    
    /** Comuna del cliente */
    private String comuna;
    
    /** Edad del cliente */
    private int edad;
    
    /**
     * Constructor sin parámetros de la clase Cliente.
     */
    public Cliente() {
        
    }
    
    /**
     * Constructor de la clase Cliente que recibe todos los atributos como parámetros.
     * 
     * @param rut RUT del cliente
     * @param nombres Nombres del cliente
     * @param apellidos Apellidos del cliente
     * @param telefono Teléfono del cliente
     * @param afp AFP del cliente
     * @param sistemaSalud Sistema de salud del cliente
     * @param direccion Dirección del cliente
     * @param comuna Comuna del cliente
     * @param edad Edad del cliente
     */
    public Cliente(int rut, String nombres, String apellidos, String telefono, String afp,
            int sistemaSalud, String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }
    
    /**
     * Método toString que retorna una representación en String del objeto Cliente.
     * 
     * @return Representación en String del objeto Cliente.
     */
    @Override
    public String toString() {
        return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos
                + ", telefono=" + telefono + ", afp=" + afp + ", sistemaSalud=" + sistemaSalud
                + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + "]";
    }
    
}
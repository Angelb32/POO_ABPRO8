package POO_ABPRO6;

public class Cliente {
    private int rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;
    
    public Cliente() {
        // Constructor vacío
    }
    
    public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
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
    
    public int getRut() {
        return rut;
    }
    
    public void setRut(int rut) {
        this.rut = rut;
    }
    
    public String getNombres() {
        return nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getAfp() {
        return afp;
    }
    
    public void setAfp(String afp) {
        this.afp = afp;
    }
    
    public int getSistemaSalud() {
        return sistemaSalud;
    }
    
    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getComuna() {
        return comuna;
    }
    
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String obtenerNombre() {
        return this.nombres + " " + this.apellidos;
    }
    
    public void obtenerSistemaSalud() {
        if (this.sistemaSalud == 1) {
            System.out.println("El cliente tiene sistema de salud Fonasa.");
        } else if (this.sistemaSalud == 2) {
            System.out.println("El cliente tiene sistema de salud Isapre.");
        } else {
            System.out.println("Tipo de sistema de salud no registrado.");
        }
    }
    
    public String toString() {
        return "RUT: " + this.rut + ", Nombres: " + this.nombres + ", Apellidos: " + this.apellidos + ", Teléfono: " + this.telefono + ", AFP: " + this.afp + ", Sistema de salud: " + this.sistemaSalud + ", Dirección: " + this.direccion + ", Comuna: " + this.comuna + ", Edad: " + this.edad;
    }
}
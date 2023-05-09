package POO_ABPRO5;

/**
 * Clase que representa un usuario de la empresa de asesorías en prevención de riesgos.
 * Contiene los atributos: nombre, fecha de nacimiento y RUN.
 */
public class Usuario {
    /** Nombre del usuario. */
    private String nombre;
    /** Fecha de nacimiento del usuario. */
    private String fechaNacimiento;
    /** RUN del usuario. */
    private String run;

    /**
     * Constructor sin argumentos de la clase Usuario.
     */
    public Usuario() {}

    /**
     * Constructor de la clase Usuario que recibe todos los atributos de la clase como parámetros.
     * @param nombre Nombre del usuario.
     * @param fechaNacimiento Fecha de nacimiento del usuario en formato "dd/MM/yyyy".
     * @param run RUN del usuario.
     */
    public Usuario(String nombre, String fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    /**
     * Retorna el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * @param nombre El nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna la fecha de nacimiento del usuario en formato "dd/MM/yyyy".
     * @return La fecha de nacimiento del usuario en formato "dd/MM/yyyy".
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del usuario en formato "dd/MM/yyyy".
     * @param fechaNacimiento La fecha de nacimiento del usuario en formato "dd/MM/yyyy".
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Retorna el RUN del usuario.
     * @return El RUN del usuario.
     */
    public String getRun() {
        return run;
    }

    /**
     * Establece el RUN del usuario.
     * @param run El RUN del usuario.
     */
    public void setRun(String run) {
        this.run = run;
    }

    /**
     * Retorna una representación en String del objeto Usuario.
     * @return Una representación en String del objeto Usuario.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nFecha de nacimiento: " + fechaNacimiento + "\nRUN: " + run;
    }
}
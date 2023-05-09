package POO_ABPRO5;

/**
 * La clase Capacitacion representa una capacitación realizada por la empresa de asesorías en prevención de riesgos.
 * Contiene información sobre el identificador de la capacitación, el RUT del cliente, el día, la hora, el lugar,
 * la duración y la cantidad de asistentes.
 * 
 * Atributos:
 * - identificador: el número interno de la capacitación manejado por la empresa
 * - rutCliente: el RUT del cliente que participa en la capacitación
 * - dia: el día en que se realiza la capacitación
 * - hora: la hora en que se realiza la capacitación
 * - lugar: el lugar donde se realiza la capacitación
 * - duracion: la duración de la capacitación en horas
 * - cantAsistentes: la cantidad de asistentes a la capacitación
 * 
 * Métodos:
 * - toString(): devuelve una cadena de caracteres con la información de la capacitación.
 * - Constructor sin parámetros: inicializa los atributos con valores predeterminados.
 * - Constructor con parámetros: inicializa los atributos con los valores especificados.
 * 
 * Autor: [Tu nombre]
 * Versión: 1.0
 */

public class Capacitacion {
    
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantAsistentes;
    
    /**
     * Constructor sin parámetros de la clase Capacitacion. Inicializa los atributos con valores predeterminados.
     */
    public Capacitacion() {
        this.identificador = 0;
        this.rutCliente = 0;
        this.dia = "";
        this.hora = "";
        this.lugar = "";
        this.duracion = 0;
        this.cantAsistentes = 0;
    }
    
    /**
     * Constructor con parámetros de la clase Capacitacion. Inicializa los atributos con los valores especificados.
     * @param identificador el identificador de la capacitación
     * @param rutCliente el RUT del cliente que participa en la capacitación
     * @param dia el día en que se realiza la capacitación
     * @param hora la hora en que se realiza la capacitación
     * @param lugar el lugar donde se realiza la capacitación
     * @param duracion la duración de la capacitación en horas
     * @param cantAsistentes la cantidad de asistentes a la capacitación
     */
    public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, int duracion, int cantAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantAsistentes = cantAsistentes;
    }
    
    /**
     * Método toString de la clase Capacitacion. Devuelve una cadena de caracteres con la información de la capacitación.
     * @return una cadena de caracteres con la información de la capacitación
     */
    @Override
    public String toString() {
        return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
                + hora + ", lugar=" + lugar + ", duracion=" + duracion+", cantAsistentes=" + cantAsistentes + "]";
    }

    /**

    Método getter del atributo identificador de la clase Capacitacion.
    @return el identificador de la capacitación
    */
    public int getIdentificador() {
    return identificador;
    }
    /**

    Método setter del atributo identificador de la clase Capacitacion.
    @param identificador el identificador de la capacitación
    */
    public void setIdentificador(int identificador) {
    this.identificador = identificador;
    }
    /**

    Método getter del atributo rutCliente de la clase Capacitacion.
    @return el RUT del cliente que participa en la capacitación
    */
    public int getRutCliente() {
    return rutCliente;
    }
    /**

    Método setter del atributo rutCliente de la clase Capacitacion.
    @param rutCliente el RUT del cliente que participa en la capacitación
    */
    public void setRutCliente(int rutCliente) {
    this.rutCliente = rutCliente;
    }
    /**

    Método getter del atributo dia de la clase Capacitacion.
    @return el día en que se realiza la capacitación
    */
    public String getDia() {
    return dia;
    }
    /**

    Método setter del atributo dia de la clase Capacitacion.
    @param dia el día en que se realiza la capacitación
    */
    public void setDia(String dia) {
    this.dia = dia;
    }
    /**

    Método getter del atributo hora de la clase Capacitacion.
    @return la hora en que se realiza la capacitación
    */
    public String getHora() {
    return hora;
    }
    /**

    Método setter del atributo hora de la clase Capacitacion.
    @param hora la hora en que se realiza la capacitación
    */
    public void setHora(String hora) {
    this.hora = hora;
    }
    /**

    Método getter del atributo lugar de la clase Capacitacion.
    @return el lugar donde se realiza la capacitación
    */
    public String getLugar() {
    return lugar;
    }
    /**

    Método setter del atributo lugar de la clase Capacitacion.
    @param lugar el lugar donde se realiza la capacitación
    */
    public void setLugar(String lugar) {
    this.lugar = lugar;
    }
    /**

    Método getter del atributo duracion de la clase Capacitacion.
    @return la duración de la capacitación en horas
    */
    public int getDuracion() {
    return duracion;
    }
    /**

    Método setter del atributo duracion de la clase Capacitacion.
    @param duracion la duración de la capacitación en horas
    */
    public void setDuracion(int duracion) {
    this.duracion = duracion;
    }
    /**

    Método getter del atributo cantAsistentes de la clase Capacitacion.
    @return la cantidad de asistentes a la capacitación
    */
    public int getCantAsistentes() {
    return cantAsistentes;
    }
    /**

    Método setter del atributo cantAsistentes de la clase Capacitacion.
    @param cantAsistentes la cantidad de asistentes a la capacitación
    */
    public void setCantAsistentes(int cantAsistentes) {
    	this.cantAsistentes = cantAsistentes;
    }
    /**
     * Método que devuelve el total de horas de la capacitación.
     * @return el total de horas de la capacitación
     */
    public int getTotalHoras() {
        return duracion * cantAsistentes;
    }
}
package POO_ABPRO6;

public class Usuario {
private String nombre;
private String fechaNacimiento;
private int run;

public Usuario() {
}

public Usuario(String nombre, String fechaNacimiento, int run) {
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.run = run;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getFechaNacimiento() {
    return fechaNacimiento;
}

public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}

public int getRun() {
    return run;
}

public void setRun(int run) {
    this.run = run;
}

public int calcularEdad() {
    String now = "2023-05-10";
    int anioActual = Integer.parseInt(now.substring(0, 4));
    int anioNacimiento = Integer.parseInt(fechaNacimiento.substring(0, 4));
    int edad = anioActual - anioNacimiento;
    return edad;
}

public String mostrarEdad() {
    int edad = calcularEdad();
    return "El usuario tiene " + edad + " años";
}

@Override
public String toString() {
    return "Usuario{" +
            "nombre='" + nombre + '\'' +
            ", fechaNacimiento='" + fechaNacimiento + '\'' +
            ", run=" + run +
            '}';
	}
}
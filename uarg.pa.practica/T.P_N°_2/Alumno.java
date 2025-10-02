public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private int telefono;
    private String direccion;

public Alumno(String nombre, String apellido, int edad, String carrera, int telefono, String direccion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.carrera = carrera;
    this.telefono = telefono;
    this.direccion = direccion;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public String getCarrera() {
    return carrera;
}

public void setCarrera(String carrera) {
    this.carrera = carrera;
}

public int getTelefono() {
    return telefono;
}

public void setTelefono(int telefono) {
    this.telefono = telefono;
}
public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public String mostrarDatos() {
  System.out.println ("Nombre: " + getNombre());
  System.out.println ("Apellido: " + getApellido());
  System.out.println ("Edad: " + getEdad());
  System.out.println ("Carrera: " + getCarrera());
  System.out.println ("Telefono: " + getTelefono());
  System.out.println ("Direccion: " + getDireccion());
  return null;
}
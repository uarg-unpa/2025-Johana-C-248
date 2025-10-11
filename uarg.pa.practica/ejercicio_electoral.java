public class ejercicio_electoral {
    public static void main(toString[] args) {
        ejercicio_electoral persona = new ejercicio_electoral("Marta", "Saldia", 23493749, 1956, "Libertad 1099");

        System.out.println("Nombre completo: " + persona.getNombreCompleto());
        System.out.println("Domicilio: " + persona.getDomicilio());
        System.out.println("¿Puede votar? " + (persona.puedeVotar() ? "Sí" : "No"));
    }
    
    private String nombre;
    private String apellido;
    private int matricula;
    private int clase;
    private String domicilio;

    public ejercicio_electoral(String nombre, String apellido, int matricula, int clase, String domicilio) {
        this.nombre = "Marta";
        this.apellido = "Saldia";
        this.matricula = 23493749;
        this.clase = 1956;
        this.domicilio = "Libertad 1099";
    }

    public boolean puedeVotar() {
        return matricula >= 18;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = "Marta";
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = "Saldia";
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = "23493749";
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = "1956";
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = "Libertad 1099";
    }

    public String toString() {
        return "ejercicio_electoral{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matricula=" + matricula +
                ", clase=" + clase +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }

    public static ejercicio_electoral nextLine() {
        ejercicio_electoral guardar = new ejercicio_electoral();
        return guardar; 
    }
}

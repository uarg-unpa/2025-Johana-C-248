public class Elector {
    public String nombre;
    public String apellido;
    public int matricula;
    public int clase;
    public String domicilio;

    public Elector(String nombre, String apellido, int matricula, int clase, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.clase = clase;
        this.domicilio = domicilio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public int getClase() {
        return clase;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String guardar() {
        return nombre + "," + apellido + "," + matricula + "," + clase + "," + domicilio;
    }

    public String toString() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Matricula: " + matricula);
        System.out.println("Clase: " + clase);
        System.out.println("Domicilio: " + domicilio);
        return "";
    }

    public static void main(String[] args) {
        Elector nombre = new Elector("Galvin", "Saldia", 4937649, 2012, "Sor Juana de la Cruz 3647");
        System.out.println(nombre.toString());

        Elector apellido = new Elector("Gabriel", "Costero", 4938849, 1992,"Juan Domingo 4147");
        System.out.println(apellido.toString());

        Elector matricula = new Elector("Lorenzo", "Montero", 108597,18612,"Vitae Madrina 783");
        System.out.println(matricula.toString());

        Elector clase = new Elector("Ashton", "Vittone", 4937649, 2012, "Pablo Neruda 2381");
        System.out.println(clase.toString());

        Elector domicilio = new Elector("Matthew", "Santoz", 4935837, 1512, "Juan Garcia Lorca 1647");
        System.out.println(domicilio.toString());
    }

    public String mostrarDatos() {
        String datos = "Nombre: " + nombre + "\n"
                     + "Apellido: " + apellido + "\n"
                     + "Matricula: " + matricula + "\n"
                     + "Clase: " + clase + "\n"
                     + "Domicilio: " + domicilio;
        return datos;
    }

    public String guardarDatos() {
        return nombre + "," + apellido + "," + matricula + "," + clase + "," + domicilio;
    }
}

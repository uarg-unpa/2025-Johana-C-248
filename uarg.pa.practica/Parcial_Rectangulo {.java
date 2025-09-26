public class Rectangulo {
    private double base,
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    private void setBase(double base) {
        this.base = base;
    }

    private double getBase() {
        return base;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    private double getAltura() {
        return altura;
    }

    public double calcularArea() {
        base = getBase();
        altura = getAltura();
        return base * altura;
    }

    public double calcularPerimetro() {
        base = getBase();
        altura = getAltura();
        return 2 * (base + altura);
    }

    esMayorElArea(Rectangulo r) {
        if (this.calcularArea() > r.calccularArea()) {
            return true;
        } else {
            return false;
        }

        }

public static void main(String[] args) {
    Scanner Rectangulo.R1 = new Rectangulo.R1(System.in);
    Scanner Rectangulo.R2 = new Rectangulo.R2(System.in);

    System.out.print("Ingrese la base del rectangulo 1: ");
    double base1 = Rectangulo.R1.nextDouble();
    System.out.print("Ingrese la altura del rectangulo 1: ");
    double altura1 = Rectangulo.R1.nextDouble();
    Rectangulo R1 = new Rectangulo.R1(base1, altura1);

    System.out.print("Ingrese la base del rectangulo 2: ");
    double base2 = Rectangulo.R2.nextDouble();
    System.out.print("Ingrese la altura del rectangulo 2: ");
    double altura2 = Rectangulo.R2.nextDouble();
    Rectangulo R2 = new Rectangulo.R2(base2, altura2);

    System.out.println("El area del rectangulo 1 es: " + R1.calcularArea());
    System.out.println("El perimetro del rectangulo 2 es: " + R2.calcularPerimetro());
    System.out.println("El area mayor del rectangulo es: " + R1.esMayorElArea(R2));
}
}
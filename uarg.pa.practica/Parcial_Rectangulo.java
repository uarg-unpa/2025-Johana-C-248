import java.util.Scanner;

public class Parcial_Rectangulo {
    private double base,
    private double altura;

    public Parcial_Rectangulo(double base, double altura) {
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

    public boolean esMayorElArea(Parcial_Rectangulo  r) {
        if (this.calcularArea() > r.calcularArea()) {
            return true;
        } else {
            return false;
        }
        }

public static void main(String[] args) {
    Scanner R1 = new Scanner(System.in);

    System.out.println("Ingrese la base del rectangulo 1: ");
    double base1 = R1.nextDouble();
    System.out.println("Ingrese la altura del rectangulo 1: ");
    double altura1 = R1.nextDouble();
    Parcial_Rectangulo R1 = new Parcial_Rectangulo(base1, altura1);

    Scanner R2 = new Scanner(System.in);

    System.out.print("Ingrese la base del rectangulo 2: ");
    double base2 = R2.nextDouble();
    System.out.print("Ingrese la altura del rectangulo 2: ");
    double altura2 = R2.nextDouble();
    Parcial_Rectangulo R2 = new Parcial_Rectangulo(base2, altura2);
    
    System.out.println("El area del rectangulo 1 es: " + R1.calcularArea());
    System.out.println("El perimetro del rectangulo 2 es: " + R2.calcularPerimetro());
    System.out.println("El area mayor del rectangulo es: " + R1.esMayorElArea(R2));
}
}
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
    Scanner Rectangulo R1 = new Rectangulo R1(sistem.out.println("Ingrese la base del rectangulo 1: "), sistem.out.println("Ingrese la altura del rectangulo 1: "));
    Scanner Rectangulo R2 = new Rectangulo R2(sistem.out.println("Ingrese la base del rectangulo 2: "), sistem.out.println("Ingrese la altura del rectangulo 2: "));
    sistem.out.println("El area del rectangulo 1 es: " + R1.calcularArea());
    sistem.out.println("El perimetro del rectangulo 2 es: " + R1.calcularPerimetro());
    sistem.out.println("El area mayor del rectangulo es: " + R1.esMayorElArea(R2));  
    }
}
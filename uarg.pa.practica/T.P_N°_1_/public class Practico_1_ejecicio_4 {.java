impot java.util.Scanner;

public class Practico_1_ejecicio_4 {
    public static void main (String[] args) {
        public int NUMRO1;
        public int NUMRO2;
        public int NUMRO3;

        public 
        System.out.println("Ingrese 3 números enteros: ");
        Scanner numero = new Scanner(System.in);
        int numero1 = numero.nextInt();
        int numero2 = numero.nextInt();
        int numero3 = numero.nextInt();

        NUMRO1 = numero1;
        NUMRO2 = numero2;
        NUMRO3 = numero3;

        if (NUMRO1 > NUMRO2 & NUMRO1 > NUMRO3) {
            System.out.println("El número 1 es el mayor." + NUMRO1);
            String NUMRO1 = numero.nextLine();
            
        } else if (NUMRO2 > NUMRO1 & NUMRO2 > NUMRO3) {
            System.out.println("El número 2 es el mayor." + NUMRO2);
            String NUMRO2 = numero.nextLine();

        } else {
            System.out.println("El número 3 es el mayor." + NUMRO3);
            String NUMRO3 = numero.nextLine();
        }
        numero.close();
}

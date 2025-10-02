public class ColaInt {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 0;

    public ColaInt() {
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estavacia() {
        return fin == 0; // vacia si no se ha encontrado nada
    }

    public boolean estaLlena() {
        return fin == MAX; // llena si fin llega al final
    }

    public void encolar (int elem) {
        elementos[fin] = elem;
        fin++; //avanza linealmente
    }

    public int desencolar() {
        int aux = elementos[frente]; //toma el primer elemento
        //desplaza los elementos restantes hacia la izquierda
        for (int i = 0; i < fin - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fin--; // reduce fin tras el desplazamiento
        return aux;

public class Cola{
    private final int maxcola=5;
    private int frente, ultimo;
    private int []elementos;

    public Cola() {
        frente=0;
        ultimo=0;
        elementos=new int[maxcola];
    }
    private int siguiente(int subind)
    {
       (....)
    }
    public boolean estaVacia()
    {
       (....)
    }
    public boolean estaLlena()
    {
       (....)
    }
    public void insertar(int numero)
    {
       (...)
    }
    public int borrar()
    {
       (...)
    }
}

}
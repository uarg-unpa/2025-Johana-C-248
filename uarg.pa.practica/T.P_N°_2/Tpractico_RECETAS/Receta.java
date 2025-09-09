 public class Receta {
     private String nombre;
     private int tiempo;
     private String dificultad;
     private String ingredientes;
   
    public Receta(String nombre, int tiempo, String dificultad, String ingredientes) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.dificultad = dificultad;
        this.ingredientes = ingredientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    public String getNombre() {
        return nombre;
    }     

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }
    
    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getDificultad() {
        return dificultad;
    }
 
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
     }
    
    public String getIngredientes() { 
        return ingredientes;
    }

    public String esTiempo() {
        if (this.tiempo < 30) {
            return "receta rapida";
    } else if (this.tiempo <60) {
        return "receta intermedia";
    } else {
        return "receta larga";
    }    
}

public void aumentarTiempo(int minutos) {
    this.tiempo += minutos;
}

public static void main(String[] args) {
    Receta receta1 = new Receta(nombre:"tarta de manzana", tiempo:45, dificultad:"media", ingredientes:5);
    Receta receta2 = new Receta(nombre:"pizza casera", tiempo:90, dificultad:"media", ingredientes:7);
  
    System.out.println("el nombre de la receta es: " + receta1.getNombre());
    System.out.println("el tiempo de la receta es: " + receta1.getTiempo());
    System.out.println("la dificultad de la receta es: " + receta1.getDificultad());
    System.out.println("la cantidad de ingredientes de la receta es; " + receta1.getIngredientes());
    System.out.println(receta1.esTiempo());
    receta1.aumentarTiempo(20);
    System.out.println("el nuevo tiempo de la receta es: " + receta1.getTiempo());
    System.out.println(receta1.esTiempo());
   
    System.out.println("el nombre de la receta es: " + receta2.getNombre());
    System.out.println("el tiempo de la receta es: " + receta2.getTtiempo());
    System.out.println("la dificultad de la receta es: " + receta2.getDificultad());
    System.out.println("la cantidad de ingredientes de la receta es: " + receta2.getIngredientes());
    System.out.println(receta2.esTiempo());
    receta2.aumentarTiempo(0);
    System.out.println("el nuevo tiempo de la receta es: " + receta2.getTiempo());
    System.out.println(receta2.esTiempo());
    }
}
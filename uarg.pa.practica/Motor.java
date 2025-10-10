public class Motor {
    public int cilindrada;
    public String tipo;
    public int modelo;
    public String marca;
    public double serie;

    public String toString() {
        return "Motor{" +
                "cilindrada=" + cilindrada +
                ", tipo='" + tipo + '\'' +
                ", modelo=" + modelo +
                ", marca='" + marca + '\'' +
                ", serie=" + serie +
                '}';
    }

    public Motor(int cilindrada, String tipo, int modelo, String marca, double serie) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.serie = serie;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
   public int getCilindrada() {
        return cilindrada;
   }

   public void setTipo(String tipo) {
       this.tipo = tipo;
   }

   public String getTipo() {
       return tipo;
   }
   public void setModelo(int modelo) {
       this.modelo = modelo;
   }

   public int getModelo() {
       return modelo;
   }

   public void setMarca(String marca) {
       this.marca = marca;
   }

   public String getMarca() {
       return marca;
    }
    
    public void setSerie(double serie) {
         this.serie = serie;
    }

    public double getSerie() {
         return serie;
   }
   
    public Boolean esPotente() {
        if (this.cilindrada > 1500) {
            System.out.println(this + " es potente");
            return true;  
        } else {
            if (this.esAntiguo().equals("Diesel")) {
                noesPotente = cilindrada + 500;
            } else {
                actualizarTipodeMotor("Gasolina");
            }   
        }
    }

    public Motor calcularConsumo(double km, double litros) {
        double consumo = km / litros;
        if (consumo > 15) {
            System.out.println("El motor es eficiente");
        } else {
            System.out.println("El motor no es eficiente");
        }
        return this;
    }

    public static void main(String[] args) {
        Motor motor1 = new Motor(1600, "Gasolina", 2020, "Toyota", 12345);
        System.out.println(motor1.toString());
        
        while (motor1.calcularConsumo(300, 20)) {
            if (motor1.esPotente()) {
                System.out.println("El motor es potente");
            } else {
                System.out.println("El motor no es potente");
            }
        }

        Motor marca = new Motor(0, "Desconocido", 0, "",getMarca, 0);
        System.out.println(marca.getMarca());

        if (marca.getMarca().isEmpty()) {
            System.out.println("La marca no está definida");
        } else {
            System.out.println("La marca es: " + marca.getMarca());
        }
        
        Motor modelo = new Motor(0, "Desconocido", 2020, "Desconocido", 0);
        System.out.println(modelo.getModelo());

        if (modelo.getModelo() >= 2020) {
            System.out.println("El modelo es reciente");
        } else {
            System.out.println("El modelo es antiguo");
        }
        
        Motor cilindrada = new Motor(1600, "Desconocido", 0, "Desconocido", 0);
        System.out.println(cilindrada.getCilindrada());

        if (cilindrada.getCilindrada() > 1000) {
            System.out.println("La cilindrada es alta");
        } else {
            System.out.println("La cilindrada es baja");
        }
        
        Motor tipo = new Motor(0, "Gasolina", 0, "Desconocido", 0);
        System.out.println(tipo.getTipo());
       
        if (tipo.getTipo().equals("Gasolina")) {
            System.out.println("El tipo de motor es Gasolina");
        } else {
            System.out.println("El tipo de motor es Diesel");
        }
        
        Motor serie = new Motor(0, "Desconocido", 0, "Desconocido", 12345);
        System.out.println(serie.getSerie());

        if (serie.getSerie() > 0) {
            System.out.println("El número de serie es válido");
        } else {
            System.out.println("El número de serie no es válido");
        }
    }
}
         
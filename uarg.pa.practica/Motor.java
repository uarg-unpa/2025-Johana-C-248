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
   public void setMarca(string marca) {
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
        if (this.MotorPotencia > 1500) {
            return true;
        } else {
            if (this.esAntiguo().equals("Diesel")) {
                
            } else {
                return false;
            }
        }
    }

    public Static String void tipoDeMotor() {
        if (this.tipo.equals("Diesel")) {
            return "Diesel";
        } else {
            if (this.tipo.equals("Gasolina")) {
                return "Gasolina";
            } else {
                return "Electrico";
            }
        }
    }

    public Boolean esAntiguo() {
        if (this.modelo < 2000) {
            return true;
        } else {
            return false;
        }
    }

}
         
public class libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int aniodepublicacion;

public libro(String titulo, String autor, String editorial, int aniodepublicacion) {
    this.titulo = titulo;
    this.autor = autor;
    this.editorial = editorial;
    this.aniodepublicacion = aniodepublicacion;
}

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

        
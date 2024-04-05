package WebPeliculas.logica;

public class Productos {

    private int codigo;
    private String titulo;
    private String productora;
    private int anioPelicula;
    private String categoria;

    public Productos() {
    }

    public Productos(int codigo, String titulo, String productora, int anioPelicula, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.productora = productora;
        this.anioPelicula = anioPelicula;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getAnioPelicula() {
        return anioPelicula;
    }

    public void setAnioPelicula(int anioPelicula) {
        this.anioPelicula = anioPelicula;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", productora='" + productora + '\'' +
                ", anioPelicula=" + anioPelicula +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

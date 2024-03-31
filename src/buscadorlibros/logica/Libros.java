package buscadorlibros.logica;

public class Libros {

    private int codigo;
    private String titulo;
    private String Editorial;
    private int paginasLibro;
    private String categoria;

    @Override
    public String toString() {
        return "Libros{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", Editorial='" + Editorial + '\'' +
                ", paginasLibro=" + paginasLibro +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public Libros() {
    }

    public Libros(int codigo, String titulo, String editorial, int paginasLibro, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        Editorial = editorial;
        this.paginasLibro = paginasLibro;
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

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public int getPaginasLibro() {
        return paginasLibro;
    }

    public void setPaginasLibro(int paginasLibro) {
        this.paginasLibro = paginasLibro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

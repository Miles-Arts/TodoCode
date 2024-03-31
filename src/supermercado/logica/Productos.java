package supermercado.logica;

public class Productos {

    private int codigo;
    private String producto;
    private String marca;
    private int peso;
    private String categoria;

    @Override
    public String toString() {
        return "Productos{" +
                "codigo=" + codigo +
                ", producto='" + producto + '\'' +
                ", marca='" + marca + '\'' +
                ", peso=" + peso +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public Productos() {
    }

    public Productos(int codigo, String producto, String marca, int peso, String categoria) {
        this.codigo = codigo;
        this.producto = producto;
        this.marca = marca;
        this.peso = peso;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

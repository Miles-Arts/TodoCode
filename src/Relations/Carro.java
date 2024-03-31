package Relations;

import java.util.List;

public class Carro {

    private Long id;
    private String marca;
    private String modelo;

    private List<Propietaria> listaPropietarias;


    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", listaPropietarias=" + listaPropietarias +
                '}';
    }

    public Carro() {
    }



    public Carro(Long id, String marca, String modelo, List<Propietaria> listaPropietarias) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarias = listaPropietarias;
    }

    /*  public Carro(Long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }*/

    public List<Propietaria> getListaPropietarias() {
        return listaPropietarias;
    }

    public void setListaPropietarias(List<Propietaria> listaPropietarias) {
        this.listaPropietarias = listaPropietarias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

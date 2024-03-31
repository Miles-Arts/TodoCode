package Relations;

import java.util.List;

public class Carro {

    private Long id;
    private String marca;
    private String modelo;

    private List<Propietaria> litaPropietarias;

    public Carro() {
    }

    public Carro(Long id, String marca, String modelo, List<Propietaria> litaPropietarias) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.litaPropietarias = litaPropietarias;
    }

    /*  public Carro(Long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }*/

    public List<Propietaria> getLitaPropietarias() {
        return litaPropietarias;
    }

    public void setLitaPropietarias(List<Propietaria> litaPropietarias) {
        this.litaPropietarias = litaPropietarias;
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

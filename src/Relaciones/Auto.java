package Relaciones;

import java.util.List;

public class Auto {

    private Long id;
    private String marca;
    private String modelo;

    private List<Propietario> listaPropietarios;

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }
//private Propietario prop;  //Declarar un OBJETO de otra class
    //private Propietario propietario = new Propietario();

    public Auto() {
    }

    public Auto(Long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

 /*   public Auto(Long id, String marca, String modelo, Propietario prop) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.prop = prop;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }*/

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

package Relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {

        Auto automovil = new Auto();

        automovil.setId(1L); //L mayuscula por LONG
        automovil.setMarca("Mercedes Benz");
        automovil.setModelo("S600 - W140");

        List<Propietario> listaPropietarios = new ArrayList<Propietario>();

        Propietario propietario1 = new Propietario();
        Propietario propietario2 = new Propietario();
        Propietario propietario3 = new Propietario();

        propietario1.setId(20L);
        propietario1.setName("Luciana Mirrol");
        propietario1.setLastName("Mirrol");

        propietario2.setId(21L);
        propietario2.setName("Luca");
        propietario2.setLastName("Rittovi");

        propietario3.setId(22L);
        propietario3.setName("Carol");
        propietario3.setLastName("de Paula");

        listaPropietarios.add(propietario1);
        listaPropietarios.add(propietario2);
        listaPropietarios.add(propietario3);

        automovil.setListaPropietarios(listaPropietarios);

        System.out.println("El auto " + automovil.getMarca() + " " + automovil.getModelo() + " tiene como propietarios a: " + automovil.getListaPropietarios().toString());

    }
}

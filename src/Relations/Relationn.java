package Relations;

import java.util.ArrayList;
import java.util.List;

public class Relationn {

    public static void main(String[] args) {


        Carro carros = new Carro();

        carros.setId(10L);
        carros.setMarca("Ferrari");
        carros.setModelo("Testa Rosa");

        List<Propietaria> listaPropetarias = new ArrayList<Propietaria>();

        Propietaria propietarias = new Propietaria();
        Propietaria propietarias1 = new Propietaria();
        Propietaria propietarias2 = new Propietaria();


        propietarias.setId(20L);
        propietarias.setNombre("Italia");
        propietarias.setApellido("Marin");

        propietarias1.setId(20L);
        propietarias1.setNombre("Francia");
        propietarias1.setApellido("White");

        propietarias2.setId(30L);
        propietarias2.setNombre("Martha");
        propietarias2.setApellido("Argos");


        listaPropetarias.add(propietarias);
        listaPropetarias.add(propietarias1);
        listaPropetarias.add(propietarias2);

        carros.setListaPropietarias(listaPropetarias);

        System.out.println("El carro: " + carros.getMarca() + " " + carros.getModelo() + ".");
        System.out.println("Tiene como dueños a: ");
        System.out.println(carros.getListaPropietarias().toString());


    }
}

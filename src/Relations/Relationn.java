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

        propietarias.setId(20L);
        propietarias.setNombre("Italia");
        propietarias.setApellido("Marin");

        propietarias1.setId(20L);
        propietarias1.setNombre("Francia");
        propietarias1.setApellido("White");


        listaPropetarias.add(propietarias);
        listaPropetarias.add(propietarias1);

        carros.setListaPropietarias(listaPropetarias);

        System.out.println("el carro " + carros.getMarca() + " " + carros.getModelo() + " tiene como dueños a: " + carros.getListaPropietarias().toString());


    }
}

package RelacionesS;

import ArrayList.ArrayLists;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RelacionesS {

    public static void main(String[] args) {

        Casa casas = new Casa();

        casas.setId(100L);
        casas.setBarrio("Blue Skay");
        casas.setDireccion("Torre 1 | apt 1200");

        List<DuenhoCasa> listaDuenhosCasas = new ArrayList<DuenhoCasa>();

        DuenhoCasa propietario1 = new DuenhoCasa();
        DuenhoCasa propietario2 = new DuenhoCasa();
        DuenhoCasa propietario3 = new DuenhoCasa();

        propietario1.setId(001L);
        propietario1.setName("Nana");
        propietario1.setLatsName("Ramirez");

        propietario2.setId(002L);
        propietario2.setName("Margarita");
        propietario2.setLatsName("Villar");

        propietario3.setId(003L);
        propietario3.setName("Marcos");
        propietario3.setLatsName("Mendoza");


        listaDuenhosCasas.add(propietario1);
        listaDuenhosCasas.add(propietario2);
        listaDuenhosCasas.add(propietario3);

        casas.setListaDuenhoCasas(listaDuenhosCasas);

        System.out.println("La casa " + casas.getBarrio() + " " + casas.getDireccion() + " tiene como propietario a: " + casas.getListaDuenhoCasa().toString());

    }
}

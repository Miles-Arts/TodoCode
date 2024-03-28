package ExampleArrayAndLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListz {

    public static void main(String[] args) {

        List<Personas> listaArray = new ArrayList<Personas>();

        listaArray.add(new Personas(1, "Ana", 20));
        listaArray.add(new Personas(2, "Juanita", 22));
        listaArray.add(new Personas(3, "Luciana", 30));
        listaArray.add(new Personas(4, "Sol", 25));


        List<Personas> listaLinked = new LinkedList<Personas>();
        listaLinked.add(new Personas(1, "Ana", 20));
        listaLinked.add(new Personas(2, "Juanita", 22));
        listaLinked.add(new Personas(3, "Luciana", 30));
        listaLinked.add(new Personas(4, "Sol", 25));

        //Remove ArrayList number 1
        listaArray.remove(1);

        String nombreBorrar = "Ana";
        for(Personas persona1: listaLinked) {
            if(persona1.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona1);
                break;
            }
        }
        System.out.println("----To END----");
    }
}

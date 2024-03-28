package ExampleArrayAndLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListz {

    public static void main(String[] args) {

        List<Personas> listaArray = new ArrayList<Personas>();

        //System.out.println("----ArrayList----");
        listaArray.add(new Personas(1, "Ana", 20));
        listaArray.add(new Personas(2, "Juanita", 22));
        listaArray.add(new Personas(3, "Luciana", 30));
        listaArray.add(new Personas(4, "Sol", 25));

        //System.out.println(listaArray.getNombre());
        //System.out.println("----LinkedList----");


        List<Personas> listaLinked = new LinkedList<Personas>();
        listaLinked.add(new Personas(1, "Ana", 20));
        listaLinked.add(new Personas(2, "Juanita", 22));
        listaLinked.add(new Personas(3, "Luciana", 30));
        listaLinked.add(new Personas(4, "Sol", 25));
        System.out.println(listaLinked);

        //Remove ArrayList number 1
        listaArray.remove(1);

        String nombreBorrar = "Ana";
        for(Personas persona1: listaLinked) {
            if(persona1.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona1);
                break; //BREAK - Romper para que Java reordene los punteros y volver a recorrer el LinkedList si se necesita
            }
        }
        System.out.println("----After To Removed----");
        //Recorrido FOREACH
        System.out.println("------ArrayList------");
            for(Personas persona : listaArray) {
                System.out.println("Prueba " + persona.getNombre());
            }

        System.out.println();
        System.out.println("------LinkedList------");
            for(Personas persona : listaLinked) {
                System.out.println("Prueba " + persona.getNombre());
            }
    }
}

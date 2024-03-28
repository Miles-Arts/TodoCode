package LinkedLists;

import java.util.ArrayList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();

        //Agregar persona al final de la lista
        lista.add(new Persona(1, "Luisa Andrea", 24 ));
        lista.add(new Persona(2, "Sol Camila", 29));
        lista.add(new Persona(3, "Paula Joana", 22));
        lista.add(new Persona(3, "Nataly Sofia", 27));

        System.out.println("------FOREACH------");
        //Recorrido foreach
            for(Persona persona:lista){
                System.out.println("Prueba " + persona.getNombre());
            }


    }

}

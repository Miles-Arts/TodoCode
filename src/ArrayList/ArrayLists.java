package ArrayList;

import java.util.ArrayList;
import java.util.List;


public class ArrayLists {

    public static void main(String[] args) {


        List<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona(1, "Carol Ruiz", 24 ));
        lista.add(new Persona(2, "Margarita Molina", 22));
        lista.add(new Persona(3, "Sonia Ruiz", 26));
        lista.add(new Persona(4, "Lina Molina", 23));

        //RECORRER POR ÍNDICE

        System.out.println("---------FOR----------");
        for(int i = 0; i < lista.size(); i++  ) {
            System.out.println("Prueba " + lista.get(i).getNombre());
        }

        System.out.println();
        System.out.println("---------FOREACH----------");
        //RECORRIDO FOREACH

        for (Persona persona : lista) {
            System.out.println("Revisión: " + persona.getNombre());
        }
    }
}

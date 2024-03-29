package PruebaHashMapp;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

    public static void main(String[] arg) {

        //MAP la Interfaz  ---
        //First = KEY or ID
        //Second = Value
        Map<Integer, String>  mapaEmpleados = new HashMap<>();

        mapaEmpleados.put(100, "Catalina");
        mapaEmpleados.put(101, "Rocio");
        mapaEmpleados.put(102, "Manuela");
        mapaEmpleados.put(103, "Nataly");


        //VALUE
        //boolean SiONo = mapaEmpleados.containsValue("Armenia");
        //boolean SiONo = mapaEmpleados.containsValue("Cali");

        //KEY
        //boolean SiONo = mapaEmpleados.containsKey(1000);
      /*  boolean SiONo = mapaEmpleados.containsKey(102);

        if(SiONo == true ) {

            System.out.println("Sí se encuentra ese VALOR: " + SiONo);
        } else {
            System.out.println("No se encuentra ese VALOR: " + SiONo);
        }

        //System.out.println(mapaEmpleados.values());
        System.out.println(mapaEmpleados.keySet());*/

        //si quiero saber el Valor STRING
        //Debo declarar una variable con STRING
        String nombre = mapaEmpleados.get(100);



        if(mapaEmpleados.containsValue(nombre)) {
            System.out.println("El empleado buscado es: " + nombre);
        } else {
            System.out.println("El empleado buscado no existe");
        }




    }
}

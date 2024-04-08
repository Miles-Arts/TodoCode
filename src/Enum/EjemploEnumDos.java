package Enum;

public class EjemploEnumDos {

    //Nombre de enum en MAYUSCULA CAMEL-CASE
    enum ListaDias {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }


    public static void main(String[] args) {

     ListaDias listadia = ListaDias.DOMINGO;

        System.out.println("Día evento: " + listadia);
        System.out.println();

        for( ListaDias dias : ListaDias.values() )

            System.out.println("Días disponibles agua: " + dias);

    }
}

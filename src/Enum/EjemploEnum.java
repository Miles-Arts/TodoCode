package Enum;

public class EjemploEnum {


    enum Color {
        ROJO, AZUL, VERDE, AMARILLO, ANARANJADO, NEGRO, BLANCO
    }

    public static void main(String[] args) {


      /*  Color color = Color.ROJO;

        System.out.println("El color es: " + color);*/



        for( Color colores : Color.values() ) {
            System.out.println(colores);
        }



    }
}

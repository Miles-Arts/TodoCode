package conversioness;

public class Conversiones {

    public static void main(String[] args) {


        double num = 1.67;

        int numInt = (int) num;

        long numLog = (long) num;


        System.out.println("-----Convertir-----");
        System.out.println("Double: " + num);
        System.out.println("INT: " +numInt);
        System.out.println("LONG: " +numLog);
        System.out.println("");


        System.out.println("-----Convertir--STRING-----");

        String cantidad = "200";
        String precio = "300.27";

        int cantidadNumero = Integer.parseInt(cantidad);
        double precioNumero = Double.parseDouble(precio);

        System.out.println("De String a INT: " + cantidadNumero);
        System.out.println("De String a DOUBLE: " + precioNumero);
        System.out.println("Valor de Compra: $" + (cantidadNumero * precioNumero));


        System.out.println("-----STRING-at-Número-----");

        int edad = 30;
        double estatura = 1.67;

        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);

        System.out.println("Edad persona: " + edadString);
        System.out.println("Estatura Persona: " + estaturaString);


    }
}

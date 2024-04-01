package conversiones;

public class Conversiones {

    public static void main(String[] args) {

/*        //Conversiones entre tipos de Datos

        //CASTING or CASTEO
        double numero = 1.67;

        //Casteo a entero
        int numeroEntero = (int) numero;


        //Casteo a LONG
        long numeroLong = (long) numero;

        //String numeroString = (String) numero;


        System.out.println("Double: " + numero);
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número Long: " + numeroLong);
        //System.out.println(numeroString);*/

       /* String cantidad = "15";
        String precio = "150.27";

        //PARSEO convertir String a INT
        int cantidadEntero = Integer.parseInt(cantidad);

        //PASEO STRING a DOUBLE
        double precioDouble = Double.parseDouble(precio);

        double totalCompra = cantidadEntero * precioDouble;


        System.out.println("-----STRING-----");
        System.out.println("Cantidad String: " + cantidad);
        System.out.println("Precio String: " + precio);

        System.out.println("");

        System.out.println("-----NÚMERO-----");
        System.out.println("Cantidad Entero int: " + cantidad);
        System.out.println("Precio Double: " + precio);

        System.out.println("Valor de la compra: $" + totalCompra);
        System.out.println("Total a pagar: $" + (precioDouble * cantidadEntero));*/


        //NUMERICOS a STRING
        int edad = 30;
        double estatura = 1.67;

        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);

        System.out.println("Pasar de  INT a STRING: " + edadString);
        System.out.println("Pasar de  DOUBLE a STRING: " + estaturaString);
    }
}

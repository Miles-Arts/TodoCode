package convertir;

public class Conversiones {

    public static void main(String[] args) {

        double numEstatura = 1.67;

        //Casteo a Entero
        int numInt = (int) numEstatura;


        //Casteo a LONG
        long numInte = 20;
        int numInteLong = (int) numInte;
        long numLong = (long) numEstatura;



        System.out.println("Estatura en Double: " + numEstatura);
        //System.out.println("En INT, se quita los números despues del punto. los flotantes de la DERECHA");
        System.out.println("Double a INT: " + numInt);
        //System.out.println("En LONG, se quita los números despues del punto. los flotantes de la DERECHA");
        System.out.println("Double a LONG: " + numLong);
        System.out.println("De INT a LONG: " + numInteLong);


        System.out.println("----String----");
        String cantidad = "20";
        String precio = "100.0";
        System.out.println(cantidad);
        System.out.println(precio);


        System.out.println("----String---INT----");

        int intCantidad = Integer.parseInt(cantidad);
        double intPrecio = Double.parseDouble (precio);

        System.out.println("String a INT: " + intCantidad);
        System.out.println("String a INT: " + intPrecio);
        System.out.println("El total es: "+ intCantidad * intPrecio);




    }
}

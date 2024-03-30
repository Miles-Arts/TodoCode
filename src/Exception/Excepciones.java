package Exception;

public class Excepciones {

    public static void main(String[] args) {

       // int resultado = 3/0;

        //Crear el try

   /*     try {
            int resultado = 3/0;
        } catch (Exception e) {

            System.out.println("----Exception:----");
            System.out.println("No se puede dividir por CERO.");

        } finally {
            System.out.println("Salir");
        }*/

        //VECTOR
        int edades [] = {25, 19, 29, 34};

        try {
            System.out.println("La edad de la posición 4 es: " + edades[4]);
        } catch (Exception e) {
            System.out.println("Este índice no existe:");
        }
    }
}

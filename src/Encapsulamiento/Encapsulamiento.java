package Encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {

        Alumno alumno30 = new Alumno();
        Alumno alumno59 = new Alumno(15, "Margarita", "Fierro");

        System.out.println("Id: " + alumno59.getId());
        System.out.println("Nombre: " + alumno59.getName());
        System.out.println("Apellido: " + alumno59.getLastName());

    }
}

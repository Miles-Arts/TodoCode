package Logica;

public class POO {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(5, "Luisa", "Marcus");
        System.out.println("La ID del alumno 2 es: " + alumno2.getId());
        System.out.println("El nombre es: " + alumno2.getName());
        System.out.println("El apellido es: " + alumno2.getLastName());

        alumno1.setId(11);
        alumno1.setName("Lorena");
        alumno1.setLastName("Hernandez");

        System.out.println("----------------");
        System.out.println("La ID del alumno 1 es: " + alumno1.getId());
        System.out.println("El nombre es: " + alumno1.getName());
        System.out.println("El apellido es: " + alumno1.getLastName());

        System.out.println("----------------");
        alumno2.setId(64);
        System.out.println("La ID del alumno 2 es: " + alumno2.getId());
        System.out.println("El nombre es: " + alumno2.getName());
        System.out.println("El apellido es: " + alumno2.getLastName());


    }
}

package Herencia;

public class Herencia {

    public static void main(String[] args) {


       /* Empleado empleado1 = new Empleado();
        Consultor consultor1 = new Consultor();

        empleado1.getNume_legajo();
        empleado1.getName();

        consultor1.getNumConsultor();
        consultor1.getName();*/
//
//        String vector[] = new  String[3];
//        vector[0] = 1;

        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        //vector[5] = "hola";

        Persona persona11 = new Persona();
        Consultor consultor2 = new Consultor();

        persona11 = consultor2;






    }

}

package Logica;

public class Alumno {

    int id;
    String name;
    String lastName;

    public Alumno() {
    }

    public Alumno(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void mostrarNombre() {

        System.out.println("Soy un Alumno de LATAM");
    }

    public void haberAprobado(double calificacion) {

        if (calificacion >= 6) {
            System.out.println("Aprobó la Materia - Felicidades");
        } else {
            System.out.println("No fue Aprobado");
        }

    }

}

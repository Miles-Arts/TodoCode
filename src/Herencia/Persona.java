package Herencia;

public class Persona {

    int id;
    String dni;
    String name;
    String lastName;
    String domicilio;
    String telefono;

    public Persona() {
    }

    public Persona(int id, String dni, String name, String lastName, String domicilio, String telefono) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getIdJefe() {
        return id;
    }

    public void setIdJefe(int idJefe) {
        this.id = idJefe;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

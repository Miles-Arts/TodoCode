package Herencia;

public class Empleado extends Persona {

    int nume_legajo;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int id, String dni, String name, String lastName, String domicilio, String telefono, int nume_legajo, String cargo, Double sueldo) {
        super(id, dni, name, lastName, domicilio, telefono);
        this.nume_legajo = nume_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNume_legajo() {
        return nume_legajo;
    }

    public void setNume_legajo(int nume_legajo) {
        this.nume_legajo = nume_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}

package Herencia;

public class Jefe extends Persona {

    int idJefe;
    String departamentoJefe;

    public Jefe() {
    }

    public Jefe(int id, String dni, String name, String lastName, String domicilio, String telefono, int id1, String departamentoJefe) {
        super(id, dni, name, lastName, domicilio, telefono);
        this.idJefe = id1;
        this.departamentoJefe = departamentoJefe;
    }

    @Override
    public int getIdJefe() {
        return idJefe;
    }

    @Override
    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getDepartamentoJefe() {
        return departamentoJefe;
    }

    public void setDepartamentoJefe(String departamentoJefe) {
        this.departamentoJefe = departamentoJefe;
    }
}

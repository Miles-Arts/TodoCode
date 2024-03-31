package RelacionesS;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    private Long id;
    private String barrio;
    private String direccion;
    //private DuenhoCasa duenho;

    private List<DuenhoCasa> listaDuenhoCasa;

    @Override
    public String toString() {
        return "Casa{" +
                "id=" + id +
                ", barrio='" + barrio + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listaDuenhoCasa=" + listaDuenhoCasa +
                '}';
    }

    public Casa() {
    }



   /*  public Casa(Long id, String barrio, String direccion) {
        this.id = id;
        this.barrio = barrio;
        this.direccion = direccion;
    }*/



    public Casa(Long id, String barrio, String direccion, List<DuenhoCasa> listaDuenhoCasa) {
        this.id = id;
        this.barrio = barrio;
        this.direccion = direccion;
        this.listaDuenhoCasa = listaDuenhoCasa;
    }

    public List<DuenhoCasa> getListaDuenhoCasa() {
        return listaDuenhoCasa;
    }

    public void setListaDuenhoCasas(List<DuenhoCasa> listaDuenhoCasa) {
        this.listaDuenhoCasa = listaDuenhoCasa;
    }

    /*public Casa(Long id, String barrio, String direccion, DuenhoCasa duenho) {
        this.id = id;
        this.barrio = barrio;
        this.direccion = direccion;
        this.duenho = duenho;
    }*/

 /*   public DuenhoCasa getDuenho() {
        return duenho;
    }

    public void setDuenho(RelacionesS.DuenhoCasa duenho) {
        this.duenho = duenho;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

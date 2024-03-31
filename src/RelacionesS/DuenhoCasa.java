package RelacionesS;

public class DuenhoCasa {

    private Long id;
    private String name;
    private String latsName;

    @Override
    public String toString() {
        return "DuenhoCasa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latsName='" + latsName + '\'' +
                '}';
    }

    public DuenhoCasa() {
    }



    public DuenhoCasa(Long id, String name, String latsName) {
        this.id = id;
        this.name = name;
        this.latsName = latsName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatsName() {
        return latsName;
    }

    public void setLatsName(String latsName) {
        this.latsName = latsName;
    }
}

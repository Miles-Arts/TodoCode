package SobreCargaYSobreEscritura;

public abstract class Animale {

    private int idAnimal;
    private String descrpcion;

    public Animale() {
    }

    public Animale(int idAnimal, String descrpcion) {
        this.idAnimal = idAnimal;
        this.descrpcion = descrpcion;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public abstract void hacerSonido();

}

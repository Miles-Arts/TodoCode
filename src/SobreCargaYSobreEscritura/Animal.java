package SobreCargaYSobreEscritura;

public class Animal {

    private int idAnimal;
    private String descrpcion;

    public Animal() {
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

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void hacerSonido(String nombreAnimal) {
        System.out.println("El animal" + nombreAnimal + "hace un sonido");
    }

    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("El animal " + nombreAnimal + " hace un sonido de tipo " + tipoSonido);
    }

}

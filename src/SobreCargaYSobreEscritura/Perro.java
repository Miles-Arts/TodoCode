package SobreCargaYSobreEscritura;

public class Perro extends Animale {

    private String nombrePerro;
    private double peso;
    private double raza;
    private double sexo;

    public Perro() {
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro y ladro: Guau Guau");
    }

    public Perro(String nombrePerro, double peso, double raza, double sexo) {
        this.nombrePerro = nombrePerro;
        this.peso = peso;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public double getSexo() {
        return sexo;
    }

    public void setSexo(double sexo) {
        this.sexo = sexo;
    }



}

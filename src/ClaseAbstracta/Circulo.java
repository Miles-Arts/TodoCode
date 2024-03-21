package ClaseAbstracta;

public class Circulo implements Figura, Dibujable ,Rotable {


    private double radio;

    public Circulo() {
    }
 /*   public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }
*/
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        double pi = 3.4;
        double resultado = pi * radio * radio;

        return resultado;
    }

    @Override
    public void rotar() {
        System.out.println("Dibujando un círculo");
    }

    @Override
    public void dibujar() {
        System.out.println("Rotando un círculo");
    }
}

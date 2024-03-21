package ClaseAbstracta;

/*public class Cuadrado extends Figura {*/
public class Cuadrado implements Figura,  Dibujable {

    private double lado;
    public Cuadrado() {
    }

/*    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }*/

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un cuadrado");
    }
}

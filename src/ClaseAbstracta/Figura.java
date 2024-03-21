package ClaseAbstracta;

public abstract class Figura {

    protected double x; // Posiicón en X
    protected double y; // Posición en Y

    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();

}

package Plantas;

public class Flor extends Planta{


    private String colorPetalos;
    private double cantidadPromedioPetalos;
    private String colorPistilo;
    private String variedadFlor;
    private String estacionFlorece;


    public Flor() {
    }

    public Flor(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String colorPetalos, double cantidadPromedioPetalos, String colorPistilo, String variedadFlor, String estacionFlorece) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
        this.colorPistilo = colorPistilo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public double getCantidadPromedioPetalos() {
        return cantidadPromedioPetalos;
    }

    public void setCantidadPromedioPetalos(double cantidadPromedioPetalos) {
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public void decirLoQueSoy() {

    }
}

package Plantas;

public class Arbusto extends Planta {


    private double anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private boolean sePodaONO;

    public Arbusto() {
    }

    public Arbusto(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, double anchoArbusto, boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePodaONO) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePodaONO = sePodaONO;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePodaONO() {
        return sePodaONO;
    }

    public void setSePodaONO(boolean sePodaONO) {
        this.sePodaONO = sePodaONO;
    }

    @Override
    public void decirLoQueSoy() {

    }
}

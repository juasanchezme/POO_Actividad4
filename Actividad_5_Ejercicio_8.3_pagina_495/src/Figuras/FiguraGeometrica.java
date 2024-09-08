// Clase: FiguraGeometrica
package Figuras;

/**
 * Esta clase denominada FiguraGeometrica modela una figura
 * geometrica que cuenta con un volumen y una superficie a ser
 * calculados de acuerdo al tipo de figura geometrica.
 * @version 1.2/2020
 */
public class FiguraGeometrica {
    private double volumen; // Atributo que identifica el volumen de una figura geometrica
    private double superficie; // Atributo que identifica la superficie de una figura geometrica

    /**
     * Metodo para establecer el volumen de una figura geometrica
     * @param volumen Parametro que define el volumen de una figura geometrica
     */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    /**
     * Metodo para establecer la superficie de una figura geometrica
     * @param superficie Parametro que define la superficie de una figura geometrica
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Metodo para obtener el volumen de una figura geometrica
     * @return El volumen de una figura geometrica
     */
    public double getVolumen() {
        return this.volumen;
    }

    /**
     * Metodo para obtener la superficie de una figura geometrica
     * @return La superficie de una figura geometrica
     */
    public double getSuperficie() {
        return this.superficie;
    }
}
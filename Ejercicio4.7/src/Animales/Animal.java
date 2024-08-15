package Animales;

public abstract class Animal {
    protected String sonido;           // Atributo que identifica el sonido emitido por un animal
    protected String alimentos;        // Atributo que identifica los alimentos que consume un animal
    protected String habitat;          // Atributo que identifica el habitat de un animal
    protected String nombreCientifico; // Atributo que identifica el nombre cientifico de un animal

    /**
     * Metodo abstracto que permite obtener el nombre cientifico del animal
     * @return El nombre cientifico del animal
     */
    public abstract String getNombreCientifico();

    /**
     * Metodo abstracto que permite obtener el sonido producido por el animal
     * @return El sonido producido por el animal
     */
    public abstract String getSonido();

    /**
     * Metodo abstracto que permite obtener los alimentos que consume un animal
     * @return Los alimentos que consume el animal
     */
    public abstract String getAlimentos();

    /**
     * Metodo abstracto que permite obtener el habitat de un animal
     * @return El habitat del animal
     */
    public abstract String getHabitat();
}

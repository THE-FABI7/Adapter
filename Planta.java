
/**
 * Ser vegetal que se encuentra en un parque natural
 */
public class Planta {
    private String especie;
    private String beneficios;
    private double dimension;

    public Planta(String especie, String beneficios, double dimension) {
        this.especie = especie;
        this.beneficios = beneficios;
        this.dimension = dimension;
    }

    /**
     * Consultar el tiempo que se demora en adaptarse al hábitat
     * @return los meses de adaptación requeridos
     */
    public int mesesAdaptacion(){
        switch (this.especie){
            case "Conífera": return 20;
            case "Pasto": return 2;
            case "Frutal": return 6;
            default: return 12;
        }
    }

    /**
     * Consultar la cantidad estimada de individuos de esta planta en el parque
     * @param factor	un factor estimado de dispersión
     */
    public double calcularCantidad(double factor){
        return dimension * factor;
    }

    public String getBeneficios() {
        return beneficios;
    }
}

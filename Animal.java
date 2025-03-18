/**
 * Ser vivo que habita o visita un parque natural
 */
public class Animal implements SerVivo{
    private String especie;
    private boolean habitante;
    private int cantidadEstimada;

    public Animal(String especie, boolean habitante, int cantidadEstimada) {
        this.especie = especie;
        this.habitante = habitante;
        this.cantidadEstimada = cantidadEstimada;
    }

    public boolean isHabitante() {
        return habitante;
    }

    public int getCantidadEstimada() {
        return cantidadEstimada;
    }

    /**
     * Consultar el tiempo que se demora en adaptarse al hábitat
     * @return los días de adaptación requeridos
     */
    public int diasAdaptacion(){
        switch (this.especie){
            case "Felino": return 30;
            case "Mamífero": return 60;
            default: return 20;
        }
    }
}

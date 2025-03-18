
import java.util.ArrayList;
import java.util.List;

/**
 * Parque Natural que tiene animales y plantas.
 */
public class ParqueNatural {

    private List<Animal> animales;
    private List<Planta> plantas;
    private List<SerVivo> serVivos;

    public ParqueNatural() {
        this.animales = new ArrayList<>();
        this.plantas = new ArrayList<>();
        this.serVivos = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal){
        this.animales.add(animal);
        this.serVivos.add(animal);
    }

    public void adicionarPlanta(Planta planta){
        this.plantas.add(planta);
        this.serVivos.add(new PlantaAdater(planta));
    }

    // ESCRIBIR LOS MÉTODOS PARA EL REPORTE SOLICITADO
//    public double promedioDiasAdaptacion()
//    public int cantidadTotalSeresVivos()
         /**
     * Calcula el promedio de días de adaptación de todos los animales en el parque.
     * @return el promedio de días de adaptación.
     */
    public double promedioDiasAdaptacion() {
        if (serVivos.isEmpty()) {
            return 0.0;
        }
        double totalDias = 0;
        for (SerVivo servivo : serVivos) {
            totalDias += servivo.diasAdaptacion();
        }
        return totalDias / serVivos.size();
    }

    /**
     * Calcula la cantidad total de seres vivos en el parque (animales y plantas).
     * @return la cantidad total de seres vivos.
     */
    public int cantidadTotalSeresVivos() {
        double total = 0;
        for (SerVivo ser : serVivos) {
            total += ser.getCantidadEstimada();
        }
        return (int) total;
    }


}

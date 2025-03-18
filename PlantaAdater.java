public class PlantaAdater implements SerVivo {
    private Planta planta;

    public  PlantaAdater(Planta planta) {
        this.planta = planta;
    }

    
    public int diasAdaptacion() {
        // Convertir meses a días
        return planta.mesesAdaptacion() * 30;
    }

    @Override
    public int getCantidadEstimada() {
        // Usar un factor de 100 para plantas
        return (int) planta.calcularCantidad(100);
    }

}

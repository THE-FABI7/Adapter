
public class ReporteParque {

    public static void main(String[] args) {
        ParqueNatural parque = new ParqueNatural();

        Animal animal = new Animal("Felino",false,2);
        parque.adicionarAnimal(animal);
        animal = new Animal("Mamífero",true,50);
        parque.adicionarAnimal(animal);

        Planta planta = new Planta("Frutal","Fuente de vitaminas",160);
        parque.adicionarPlanta(planta);
        planta = new Planta("Pasto","Alimento para ganado",20);
        parque.adicionarPlanta(planta);

        System.out.println("REPORTE CONSOLIDADO");
        // Debe dar 82.5 días de adaptación y 18052 total seres vivos
        System.out.println("Días de adaptación: " + parque.promedioDiasAdaptacion());
        System.out.println("Total seres vivos: " + parque.cantidadTotalSeresVivos());

    }
}

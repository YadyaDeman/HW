package HomeW;

public class Truck extends Car {

    int maxWeight;
   int maxFuel;
   String owner;

    public Truck(String model, String manufacturer, int year, String color, int maxWeight, int maxFuel, String owner) {
        super(model,manufacturer,year,color);
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }
    public void transfer(){
        System.out.println("Mainly for the transportation of goods - animals, other vehicles, products.");
    }
    @Override
    public String toString() {
        return "The selected truck has the following characteristics: model '" + model +", manufacturer '" + manufacturer +", year " + year +
                ", color '" +color +"maxWeight "+maxWeight+"t., maxFuel "+maxFuel+"lt., owner '"+ owner;
    }
}

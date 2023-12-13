package HomeW;

public class Car {
    String model;
    String manufacturer;
    int year;
    String color;

    public Car(String model, String manufacturer, int year, String color) {
    }

    public void transfer(){
        System.out.println("Trucks carry cargo, and passengers cars carry people.");}
    @Override
    public String toString() {
        return "The car has the following characteristics: model '" + model +", manufacturer '" + manufacturer +", year " + year +
                ", color '" +color;
    }
}

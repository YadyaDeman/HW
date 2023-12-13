package HomeW;

public class PassengerCar extends Car{
// korobka peredach auto true boolean

    int passengerSeats;
    int maxSpeed;
    boolean sportCar = true;

    public PassengerCar(String model, String manufacturer, int year, String color,int passengerSeats,int maxSpeed, boolean sportCar){
        super(model,manufacturer,year,color);
        this.passengerSeats=passengerSeats;
        this.maxSpeed = maxSpeed;
        this.sportCar= sportCar;
    }
    public void transfer(){
        System.out.println("Mainly for transporting people, maybe a little cargo.");
    }
    public String toString(){
        return "The selected car has the following characteristics: model '" + model +", manufacturer '" + manufacturer +", year " + year +
            ", color '" +color+", passenger seats "+passengerSeats+ ", max Speed " +maxSpeed+ "km."+ "Its sport Car - " +sportCar; }








}

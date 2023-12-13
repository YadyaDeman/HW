package HomeW;

public class main {
    public static void main(String[] args) {
    /*Задача 1
Внести изменения в наш проект Trucks( см. урок 21) таким образом, чтобы класс Truck стал дочерним классом.
Кроме него, также создать еще один дочерний класс , например PassengerCar.
Определить, какие переменные и методы в этом случае должны быть в родительском классе, а какие в дочерних.*/



        Car timberTruck = new Truck("Timber truck", "Mersedes-Benz", 2020, "Yelow", 3500, 500, "right");
        Car carTransporter = new Truck("Car transporter", "Volvo", 2022, "White", 5000, 500, "right");
        Car livestockTruck = new Truck("Livestock truck", "Renault", 2021, "Black", 4000, 500, "right");
        Car audi = new PassengerCar("Sedan", "Toyota Corolla Hybrid", 2021, "Silver", 4, 240, false);
        Car volkswagen = new PassengerCar("Sedan", "VW Passat CC", 2022, "Grey", 4, 240, false);
        Car lamborghini = new PassengerCar("Sprt", "Lamborghini Aventador", 2022, "Red", 2, 350, true);


        Car[] main = {timberTruck, carTransporter, livestockTruck, audi, volkswagen, lamborghini};
        for (Car salon : main) {
            System.out.println(salon);
        }
        System.out.println("All cars can transport cargo and people.");
        for (Car salon : main) {
            salon.transfer();
        }
    }
}
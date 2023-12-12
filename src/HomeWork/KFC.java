package HomeWork;

public class KFC extends FastFood{
    @Override
    public void food() {
        System.out.println("You can eat delicious food here - chicken wings.");
    }

    @Override
    public void cheap() {
        System.out.println("The cheapest position - 5 euro.");
    }
}

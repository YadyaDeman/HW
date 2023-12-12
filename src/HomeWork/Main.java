package HomeWork;

public class Main {
    public static void main(String[] args) {


FastFood fastFood=new FastFood();
Macdonalds macdonalds= new Macdonalds();
KFC kfc=new KFC();
PizzaRestoran pizzaRestoran=new PizzaRestoran();

fastFood.food();
macdonalds.food();
kfc.food();
pizzaRestoran.food();

fastFood.cheap();
macdonalds.cheap();
kfc.cheap();
pizzaRestoran.cheap();




    }
}

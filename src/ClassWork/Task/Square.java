package ClassWork.Task;

public class Square extends Figur {
    //S=a*a
   double aSquare;

    public Square(){
        super();
    }
    public Square(double aSquare){
        super();
        this.aSquare=aSquare;
    }
    public void area(){
        System.out.println("Square has -  "+(aSquare*aSquare));
    }
}

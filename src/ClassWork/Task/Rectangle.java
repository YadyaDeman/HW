package ClassWork.Task;

public class Rectangle extends Figur{
    //S= a*b

    double aRectangle;
    double bRectangle;

    public Rectangle(){
        super();
    }
    public Rectangle(double aRectangle, double bRectangle){
        super();
        this.aRectangle=aRectangle;
        this.bRectangle=bRectangle;
    }
    public void area(){
        System.out.println("Rectangle has - "+aRectangle*bRectangle);
    }
}

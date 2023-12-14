package ClassWork.Task;

public class Circle extends Figur {
    //S = PI*(r*r)

    double PI;
    double radius;

    public Circle(){
        super();
    }
    public Circle(double PI, double radius){
        super();
        this.PI=PI;
        this.radius=radius;
    }
    public void area(){
        System.out.println("Circle has - " + PI*(radius*radius));
    }
    }

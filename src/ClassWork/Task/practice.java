package ClassWork.Task;

public class practice {
/* Создать классы Circle, Rectangle, Square , содержащие соответствующие методы.
    Затем в методе main создать маcсив из нескольких фигур и вывести на печать площади каждой фигуры и название ее
    примерно в таком виде :
    Circle has area of 100.0
    Rectangle has area of 400.0
    Square has area of 340.0
     */
    public static void main(String[] args) {

        Figur circle =new Circle(2,7);
        circle.area();
        Figur rectangle = new Rectangle(5,10);
        rectangle.area();
        Figur square = new Square(7);
        square.area();

    }

}

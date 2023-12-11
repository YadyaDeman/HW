package HomeWork;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1,"+", 3);
        System.out.println(calculator);
    }
    /*Задача 1
Создать класс Калькулятор, способный Выполнить два арифметических действия
- сложение двух чисел, вычитание двух чисел, а также сложение трех чисел и вычитание трех чисел.
Калькулятор должен работать как для целых чисел, так и для чисел с запятой.
(т.е. в классе надо создать соответствующие методы и затем сохранить их в основном методе)*/
    //konstruktor dlya dvuch chisel i konstruktor dla trech chisel

    int num1;
    int num2;
    int num3;

    String plus;
    String minus;

    public Calculator(int num1, String plus, int num2) {
        this.num1 = num1;
        this.plus = plus;
        this.num2 = num2;
    }

    public Calculator(int num1, String plus, int num2, int num3) {
        this(num1, plus, num2);
        this.num3 = num3;
    }

    public String toString() {
        if ( plus ){
            return num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3);
        }
        if (minus){
            return num1 + " - " + num2 + " - " + num3 + " = " + (num1 - num2 - num3);
        }

        return null;
    }
}

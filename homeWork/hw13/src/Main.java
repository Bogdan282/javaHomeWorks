public class Main {
    public static void main(String[] args) {
        //Створити порожній проект в IntelliJ
        //Створити базовий інтерфейс для геометричної фігури, в якому є метод, який повертає площу фігури.
        //Створити 3 класи, які реалізують цей інтерфейс: коло, трикутник, квадрат.
        //Створити масив фігур, і написати метод який виведе сумарну площу всіх фігур у цьому масиві
        //Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.

        /*
        System.out.println("Площа трикутника: " + Triangle.triangleCalc() + " сантиметрів.");
        System.out.println("Площа квадрата: " + Square.squareCalc() + " сантиметрів.");
        System.out.println("Площа кола: " + Circle.CircleCalc() + " сантиметра.");
        */
        totalArea();

    }
    public interface Area{
        static double squareArea(double height, double width){
            return height * width;
        }
        static double circleArea(double radius) {
            return Math.PI*(Math.pow(radius,2));
        }
        static double triangleArea (double base, double height){
            double Area = 0.5*base*height;
            return Area;
        }
    }
    public static void totalArea(){
        Double[] Objects= new Double[3];

        Objects[0] = Triangle.triangleCalc();
        Objects[1] = Square.squareCalc();
        Objects[2] = Circle.CircleCalc();

        Double totalSum = 0.0;
        for(int i = 0; i < Objects.length; i++){
            totalSum += Objects[i];
        }
        System.out.printf("Загальна площа фігур: %.2f", totalSum);
    }
}
import java.util.Scanner;

public class Square implements Main.Area {
    public static double squareCalc(){
        Scanner sc = new Scanner(System.in);

        System.out.println("[Площа квадрата]");
        System.out.print("Введіть першу сторону: ");
        double height = sc.nextDouble();
        System.out.print("Введіть другу сторону: ");
        double width = sc.nextDouble();

        return Main.Area.squareArea(height, width);
    }
}

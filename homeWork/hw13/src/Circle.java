import java.util.Scanner;

public class Circle implements Main.Area {
    public static double CircleCalc(){
        Scanner sc = new Scanner(System.in);

        System.out.println("[Площа кола]");
        System.out.print("Введіть радіус кола: ");
        int radius = sc.nextInt();

        return Main.Area.circleArea(radius);
    }
}

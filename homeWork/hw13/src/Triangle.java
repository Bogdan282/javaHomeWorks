import java.util.Scanner;

public class Triangle implements Main.Area {
    public static double triangleCalc(){
        Scanner sc = new Scanner(System.in);

        System.out.println("[Площа трикутника]");
        System.out.print("Введіть основу трикутника: ");
        double base = sc.nextDouble();
        System.out.print("Введіть висоту трикутника: ");
        double height = sc.nextDouble();

        return Main.Area.triangleArea(base, height);
    }
}

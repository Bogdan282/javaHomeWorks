package app;

public class Main {
    public static void main(String[] args) {
        int days;
        double totalEUR, byDay;

        //Сума продажів товару дорівнює добутку кількості (шт) та ціни.

        //Product No 1: smartphone,
        //total sales for 5 days is EUR 12153,41,
        //sales by day is EUR 2430,68.
        //Product No 2: laptop,
        //total sales for 7 days is EUR 10486,85,
        //sales by day is EUR 1498,12.

        days = 5;
        byDay = 2430.68;
        totalEUR = days * byDay;
        System.out.println("Product No 1: smartphone,");
        System.out.printf("total sales for %d days is EUR %.2f,%n", days, totalEUR);
        System.out.printf("sales by day is EUR %.2f.%n", byDay);

        days = 7;
        byDay = 1498.12;
        totalEUR = days * byDay;
        System.out.println("Product No 2: laptop,");
        System.out.printf("total sales for %d days is EUR %.2f,%n", days, totalEUR);
        System.out.printf("sales by day is EUR %.2f.%n", byDay);
    }
}
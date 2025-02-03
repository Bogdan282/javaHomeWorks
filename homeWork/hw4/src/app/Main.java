package app;

public class Main {
    public static void main(String[] args) {
        int days;
        double totalEUR, byDay;

        days = 5;
        byDay = 2430.68;
        totalEUR = days * byDay;
        System.out.printf("Product No 1: smartphone,%n" +
                "total sales for %d days is EUR %,.2f,%n" +
                "sales by day is EUR %,.2f.%n", days, totalEUR, byDay);

        days = 7;
        byDay = 1498.12;
        totalEUR = days * byDay;
        System.out.printf("Product No 2: laptop,%n" +
                "total sales for %d days is EUR %,.2f,%n" +
                "sales by day is EUR %,.2f.%n", days, totalEUR, byDay);
    }
}
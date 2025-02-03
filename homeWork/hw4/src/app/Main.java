package app;

public class Main {
    public static void main(String[] args) {
        int days;
        float totalEUR, byDay;

        //Вираховування прибутку в день маючи кількість днів та загальний прибуток

        days = 5;
        totalEUR = 12153.41f;
        byDay = totalEUR / days;
        System.out.println("Product No 1: smartphone,");
        System.out.println("total sales for " + days + " days is EUR " + totalEUR + ",");
        System.out.println("sales by day is EUR " + byDay + ".");

        days = 7;
        totalEUR = 10486.85f;
        byDay = totalEUR / days;
        System.out.println("Product No 2: laptop,");
        System.out.println("total sales for " + days + " days is EUR " + totalEUR + ",");
        System.out.println("sales by day is EUR " + byDay + ".");
    }
}
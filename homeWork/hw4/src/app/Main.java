package app;

public class Main {
    public static void main(String[] args) {
        int days;
        float totalEUR, byDay;

        //Вираховування прибутку в день маючи кількість днів та загальний прибуток

        days = 5;
        byDay = 2430.68f;
        totalEUR = days * byDay;
        System.out.println("Product No 1: smartphone," +
                "\ntotal sales for " + days + " days is EUR " + totalEUR + "," +
                "\nsales by day is EUR " + byDay + ".");

        days = 7;
        byDay = 1498.12f;
        totalEUR = days * byDay;
        System.out.println("Product No 2: laptop," +
                "\ntotal sales for " + days + " days is EUR " + totalEUR + "," +
                "\nsales by day is EUR " + byDay + ".");
    }
}
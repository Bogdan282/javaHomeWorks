package app;


import javax.xml.transform.stax.StAXResult;

public class Main {
    public static void main(String[] args) {
//        int money;

        System.out.println("""
                Доходи оподатковуются за прогресивною шкалою оподаткування:\s
                від 0 до 10000, включно, за ставкою 2,5%.
                від 10000, виключно, до 25000, включно, за ставкою 4,3%.
                більше 25000, за ставкою 6,7%.\s
                """);


        taxRate(3200);
        taxRate(12590);
        taxRate(32000);

/*        money = 7200;
        System.out.println("Наприклад якщо ваш дохід буде 7200 гривень, то податок становитиме: " + (money <= 10000 ? "2,5%" : "") + (money > 10000 && money < 25000 ? "4,3%" : "") + (money > 25000 ? "6,7%" : ""));
        System.out.println("А саме: " + (money * 2.5 / 100) + " гривень.");

        money = 12000;
        System.out.println("Наприклад якщо ваш дохід буде 12000 гривень, то податок становитиме: " + (money <= 10000 ? "2,5%" : "") + (money > 10000 && money < 25000 ? "4,3%" : "") + (money > 25000 ? "6,7%" : ""));
        System.out.println("А саме: " + (money * 4.3 / 100) + " гривень.");

        money = 27000;
        System.out.println("Наприклад якщо ваш дохід буде 27000 гривень, то податок становитиме: " + (money <= 10000 ? "2.5" : "") + (money > 10000 && money < 25000 ? "4,3%" : "") + (money > 25000 ? "6,7%" : ""));
        System.out.println("А саме: " + (money * 6.7 / 100) + " гривень.");;
*/
    }
    public static void taxRate(int money){
        double taxRate = (money <= 10000) ? 2.5 : (money <= 25000) ? 4.3 : 6.7;
        System.out.printf("Вся сума: %d%nВідсоток податку: %.2f%nСума податку: %.2f%n", money, taxRate, (money * taxRate / 100));
    }
}
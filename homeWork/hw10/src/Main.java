import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Створіть Java програму з використанням методів, яка виконує наступні завдання:
        //Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
        //Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
        //Напишіть метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
        //Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок, який складається з букв цього рядка у зворотньому порядку.
        //Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
        //Напишіть метод, який приймає параметри: ціле число n і рядок text. Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.
        //Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.

        //1. Введіть ціле число: 5
        //  Квадрат числа 5 дорівнює 25.
        //2. Об'єм циліндра з радіусом 3.5 і висотою 10.0 дорівнює 384.81334713945307.
        //3. Масив чисел: [10, 20, 30, 40, 50]
        //  Сума всіх елементів масиву дорівнює 150.
        //4. Введіть рядок: Hello, World!
        //  Рядок в зворотньому порядку: !dlroW ,olleH
        //5. Введіть a: 2
        //  Введіть b: 3
        //  Результат 2^3 дорівнює 8.
        //6. Введіть ціле число n: 4
        //  Введіть текстовий рядок: Java програмування
        //  Java програмування
        //  Java програмування
        //  Java програмування
        //  Java програмування

        Scanner scn = new Scanner(System.in);

        System.out.print("1. Введіть ціле число: ");
        int num = scn.nextInt();
        System.out.println("Квадрат числа " + num + " дорівнює " + numQuad(num));

        CylGet();
        printMasivCalc();

    }
    public static int numQuad(int num){
        return num * num;
    }
    public static double Cyl(double cylRad, double cylHigh) {
        return Math.PI * Math.pow(cylRad, 2) * cylHigh;
    }
    public static void CylGet(){
        Scanner scn = new Scanner(System.in);

        System.out.print("2. Введіть висоту циліндра: ");
        double cylHigh = scn.nextDouble();
        System.out.print("2.1 Введіть радіус циліндру: ");
        double cylRad = scn.nextDouble();
        System.out.println("2.2 Об'єм циліндра з радіусом " + cylRad + " і висотою " + cylHigh + " дорівнює "+ Cyl(cylRad,cylHigh) + ".");
    }
    public static int masivCalc(int num1, int num2, int num3, int num4, int num5){
        int[] masivNum = new int[5];
        masivNum[0] = num1;
        masivNum[1] = num2;
        masivNum[2] = num3;
        masivNum[3] = num4;
        masivNum[4] = num5;
        int totalNum = 0;
        for (int i = 0; i < masivNum.length; i++) {
            totalNum += masivNum[i];
        }
        return totalNum;
    }
    public static void printMasivCalc(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int num1 = scn.nextInt();
        System.out.print("Введіть друге число: ");
        int num2 = scn.nextInt();
        System.out.print("Введіть третє число: ");
        int num3 = scn.nextInt();
        System.out.print("Введіть четверте число: ");
        int num4 = scn.nextInt();
        System.out.print("Введіть п'яте: ");
        int num5 = scn.nextInt();

        masivCalc(num1, num2, num3, num4, num5);
        System.out.println("Сума введених чисел: " + masivCalc(num1, num2, num3, num4, num5));
    }
}
package app;

public class Main {
    public static void main(String[] args) {
        //Є діапазон чисел від 1 до 6, включно. За допомогою циклу розрахуйте суму чисел наростаючим підсумком та загальну суму чисел.
        // Виведення окремого пункту переліку чисел має бути пронумероване. Виведення має такий вигляд:
        //1) Num is 1, sum is 1
        //2) Num is 2, sum is 3
        //3) Num is 3, sum is 6
        //4) Num is 4, sum is 10
        //5) Num is 5, sum is 15
        //6) Num is 6, sum is 21
        //Sum of numbers is 21

/*        System.out.println("1) Num is 1, sum is " + Rozrah(1));
        System.out.println("2) Num is 2, sum is " + Rozrah(2));
        System.out.println("3) Num is 3, sum is " + Rozrah(3));
        System.out.println("4) Num is 4, sum is " + Rozrah(4));
        System.out.println("5) Num is 5, sum is " + Rozrah(5));
        System.out.println("6) Num is 6, sum is " + Rozrah(6));
 */

        for (int i = 1; i <= 6; i++){
            System.out.println(i + ") Num is " + i +", sum is " + Rozrah(i));
        }
    }

    public static int Rozrah(int Num) {
        int sum = 0;
        for (int i = 1; i <= Num; i++) {
            sum += i;
        }
        return sum;
    }
}
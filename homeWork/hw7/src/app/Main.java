package app;

import java.util.Arrays;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        //Створіть Java програму, яка виконує наступні завдання:
        //
        //Створіть масив цілих чисел з 20 елементами.
        //Заповніть масив випадковими цілими числами в діапазоні від -100 до 100.
        //Знайдіть та виведіть суму всіх від'ємних чисел в масиві.
        //Знайдіть та виведіть кількість парних і непарних чисел в масиві.
        //Знайдіть найбільший та найменший елементи масиву та їхні індекси.
        //Знайдіть і виведіть середнє арифметичне чисел, розташованих після першого від'ємного числа у масиві (або повідомте, якщо від'ємних чисел немає).
        //Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
        //Приклад:
        //
        //Елементи масиву: [34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8]
        //Сума від'ємних чисел: -138
        //Кількість парних чисел: 11
        //Кількість непарних чисел: 9
        //Найменший елемент: -50 (з індексом 12)
        //Найбільший елемент: 99 (з індексом 14)
        //Середнє арифметичне чисел після першого від'ємного числа: 20.39

        int[] Num= new int[20];
        int min = -100;
        int max = 100;
        int sumMinus = 0;
        int pairCount = 0;
        int maxElement = 0;
        int maxElementIndex = 0;
        int minElement = Num[1];
        int minElementIndex = 0;
        int firstMinusIndex = 0;
        int avarage = 0;

        for (int i = 0; i < Num.length; i++) {
            Num[i] = min + (int) (Math.random() * (max - min + 1));
        }
        System.out.println("Елементи масиву: " + Arrays.toString(Num));

        for (int i =0; i < Num.length; i++) {
            if (Num[i] < 0) {
                sumMinus += Num[i];
            }
        }
        System.out.println("Сума всіх від'ємних чисел: " + sumMinus);

        for (int i = 0; i < Num.length; i++) {
            if (Num[i] % 2 == 0) {
                pairCount ++;
            }
        }
        System.out.println("Кількість парних чисел: " + pairCount);
        System.out.println("Кількість непарних чисел: " + (Num.length - pairCount));

        for (int i = 0; i < Num.length; i++) {
            if (Num[i] > maxElement) {
                maxElement = Num[i];
                maxElementIndex = i;
            }
        }
        System.out.println("Найбільше число в масиві: " + maxElement + ". Його індекс: " + maxElementIndex);

        for (int i = 0; i < Num.length; i++) {
            if (minElement > Num[i]) {
                minElement = Num[i];
                minElementIndex = i;
            }
        }
        System.out.println("Найменше число в масиві: " +minElement + ". Його йндекс: " + minElementIndex);

        for (int i = 0; i < Num.length; i++) {
            if (Num[i] < 0) {
                firstMinusIndex = i;
                break;
            }
        }
        if (firstMinusIndex == -1) {
            System.out.printf("В масиві немає від'ємних чисел.");
        } else {
            for (int i = firstMinusIndex; i < Num.length; i++) {
                avarage += Num[i];
            }
            System.out.println("Середнє арифметичне після першого від'ємного числа: " + (avarage / (Num.length - firstMinusIndex)));
        }
    }
}
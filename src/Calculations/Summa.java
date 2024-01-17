package Calculations;

import java.util.Scanner;

public class Summa {
    public static void welcome() {
        System.out.println("Способ решения - Сложения");
        System.out.println("Введите значения A и B:");
        float countA = takeA();
        float countB = takeB();
        result(countA, countB);
    }

    public static float takeA() {
        System.out.print("Значение A: ");
        Scanner in = new Scanner(System.in);
        return in.nextFloat();
    }

    public static float takeB() {
        System.out.print("Значение B: ");
        Scanner in = new Scanner(System.in);
        return in.nextFloat();
    }

    public static void result(float countA, float countB) {
        float resultSum = countA + countB;
        System.out.println("Результат: " + resultSum);
    }
}

package ixter;

import ixter.helpers.Helpers;

import java.math.BigInteger;


public class Main {

    public static void main(String[] args) {
//        task_01();
//        task_02();
//        task_03();
    }

    /**
     * Решение 1 задачи
     */
    public static void task_01() {
        String[] arrWords = Helpers.enter_text("Введите через пробел слова: ").trim().split(" ");
        for (int i = 0; i < arrWords.length / 2; i++) {
            String temp = arrWords[i];
            arrWords[i] = arrWords[arrWords.length - 1 - i];
            arrWords[arrWords.length - 1 - i] = temp;
        }
        System.out.println(String.join(" ", arrWords));
    }

    public static void task_02() {
        boolean isFinish = true;
        int a = 0, b = 0, s = 0;
        while (isFinish) {
            int num = Helpers.enter_number("Введи число и нажми enter: ");
            if (num == 0) {
                isFinish = false;
            } else {
                if (b == 0 && a != 0) {
                    b = num;
                }
                if (a == 0) {
                    a = num;
                }
                if (a != 0 && b != 0) {
                    if (a > b) {
                        s += a;
                    } else if (a < b) {
                        s += b;
                    } else if (a == b) {
                        s += a;
                    }
                    b = a = 0;
                }
            }
        }
        System.out.println(s);
    }

    public static void task_03() {
        String a = Helpers.enter_text("Введите число(пример 11)");
        String b = Helpers.enter_text("Введите число(пример 1)");
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        System.out.println("Вывод ");
        System.out.println(sum.toString(2));
    }
}
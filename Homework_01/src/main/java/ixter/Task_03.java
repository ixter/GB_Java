package ixter;

import ixter.helpers.Helpers;

import java.math.BigInteger;


public class Task_03 {

    public static void main(String[] args) {
        task_03();
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
package ixter;

import ixter.helpers.Helpers;

import java.math.BigInteger;


public class Task_01 {

    public static void main(String[] args) {
        task_01();
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

}
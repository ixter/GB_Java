package ixter;

import ixter.helpers.Helpers;

import java.math.BigInteger;


public class Task_02 {

    public static void main(String[] args) {
        task_02();
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
}
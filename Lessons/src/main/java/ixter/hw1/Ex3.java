package ixter.hw1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString1 = sc.nextLine();
        String inputString2 = sc.nextLine();
        String res = addBinary(inputString1, inputString2);
        System.out.println(res);
    }

    public static String addBinary(String a, String b) {
        int sizeA = a.length();
        int sizeB = b.length();
        String res = "";
        String symA, symB;
        int intA, intB, bonus = 0;
        for (int i = 0; i < Integer.max(sizeA, sizeB); i++) {
            if (i < sizeA) {
                symA = a.substring(sizeA - 1 - i, sizeA - i);
                intA = Integer.parseInt(symA);
            } else intA = 0;
            if (i < sizeB) {
                symB = b.substring(sizeB - 1 - i, sizeB - i);
                intB = Integer.parseInt(symB);
            } else intB = 0;

            int sum = intA + intB + bonus;
            bonus = 0;
            switch (sum) {
                case 0 -> res = "0" + res;
                case 1 -> res = "1" + res;
                case 2 -> {
                    res = "0" + res;
                    bonus = 1;
                }
                case 3 -> {
                    res = "1" + res;
                    bonus = 1;
                }
            }

        }
        if (bonus > 0) res = "1" + res;
        return res;
    }
}

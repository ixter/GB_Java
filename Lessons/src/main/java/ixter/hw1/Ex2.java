package ixter.hw1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        int b;
        do {
            b = sc.nextInt();
            if (b < 0 & a > 0) sum += a;
        } while (b != 0);
        System.out.println("result: " + sum);
    }
}

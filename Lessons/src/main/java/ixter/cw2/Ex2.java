package ixter.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0, a,b;
        int N = sc.nextInt();
        a = sc.nextInt();
        for (int i = 0; i < N-1; i++) {
            b = sc.nextInt();
            if (b % 10 == 5 && a % 2 == 0) sum += a;
        }
        System.out.println("sum = " + sum);
    }
}

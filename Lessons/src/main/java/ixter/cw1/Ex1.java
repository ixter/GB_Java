package ixter.cw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(substractProductAndSum(n));
    }

    /**
     * @param n число
     * @return
     * @apiNote test
     */
    public static int substractProductAndSum(int n) {
        int sum = 0, mult = 1;
        while (n != 0) {
            int number = n % 10;
            n = n / 10;
            sum += number;
            mult *= number;
        }
        return mult - sum;
    }
}

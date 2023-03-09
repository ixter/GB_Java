package ixter.cw1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String sub1;
        String sub2;
        String mid = "";
        if (str.length() % 2 != 0) {
            sub1 = str.substring(0, str.length() / 2);
            mid = str.substring(str.length() / 2, str.length() / 2 + 1);
            sub2 = str.substring(str.length() / 2 + 1);
        } else {
            sub1 = str.substring(0, str.length() / 2);
            sub2 = str.substring(str.length() / 2);
        }

        var res = sub2 + mid + sub1;
        System.out.println(res);
    }
}

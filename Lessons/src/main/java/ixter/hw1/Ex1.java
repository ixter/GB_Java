package ixter.hw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println(ReverseWords(inputString));
    }

    public static String ReverseWords(String inputString) {
        String[] words = inputString.split(" ");
        int size = words.length;
        String res = "";
        for (int i = size - 1; i >= 0; i--) {
            String word = words[i].trim();
            if (word != "") res += word + " ";
        }
        return res;
    }
}

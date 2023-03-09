package ixter.cw1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 2, 1};
        System.out.println(isSymetric(arr));

    }

    public static boolean isSymetric(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

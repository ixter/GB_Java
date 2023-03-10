package ixter.hw2;

import static ixter.helpers.Helper.printArray;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, -3, -4, 5, 6, -7, 8, 9, 10};
        printArray(array);
        replaceNegative(array);
        printArray(array);
    }

    private static void replaceNegative(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if ((10 <= array[i] && array[i] <= 99) || (-99 <= array[i] && array[i] <= -10)) {
                sum += i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = sum;
        }

    }
}

package ixter.cw1;

import static ixter.helpers.Helper.printArray;

public class Ex5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] newArr = RunningSum(arr);
        printArray(newArr);
    }

    public static int[] RunningSum(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res[i] = res[i - 1] + arr[i];
        }
        return res;
    }
}

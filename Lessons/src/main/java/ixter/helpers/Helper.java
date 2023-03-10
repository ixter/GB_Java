package ixter.helpers;



public class Helper {
    /**
     * Печать массива в консоль
     * @param array массив числовой
     */
    public static void printArray(int  [] array) {
        StringBuilder res = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            res.append(array[i]).append(i == array.length - 1 ? "]" : ",");
        }
        System.out.println(res);
    }
}

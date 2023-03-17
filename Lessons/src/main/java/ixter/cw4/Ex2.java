package ixter.cw4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sum = 0;
        for (Integer el : integerList) {
            if (el % 2 != 0) {
                sum += el;
            }
        }
        System.out.println(sum);
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 3 != 0) {
                integerList.set(i, sum);
            }
        }
        System.out.println(integerList);
    }

}

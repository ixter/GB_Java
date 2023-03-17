package ixter.cw4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
 */
public class Ex4 {
    public static void main(String[] args) {
        List<Integer> someList = new LinkedList<>(Arrays.asList(1, -2, -3, 4, -5, 6, 7, -8, -9));
        System.out.println(solution12(someList));
        System.out.println(solution13(someList));
    }

    private static List<Integer> solution12(List<Integer> someList) {
        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i) < 0) {
                someList.remove(i);
                i--;
            }
        }
        return someList;
    }

    private static List<Integer> solution13(List<Integer> someList) {
        for (int i = someList.size() - 1; i >= 0; i--) {
            if (someList.get(i) < 0) {
                someList.remove(i);
            }
        }
        return someList;
    }
}

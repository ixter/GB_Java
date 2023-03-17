package ixter.hw4;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i < 5; i++) {
            list.add(i);
        }
        LinkedList<Integer> list2 = new LinkedList<>(list);
        System.out.println("Созданный лист: " + list);

        variant1(list);
        variant2(list2);

    }

    /**
     * Реверс листа вариат 2
     * @param list на вход созданный лист 1 2 3 4
     *             результат печати листа в обратном порядке
     */
    private static void variant2(LinkedList<Integer> list) {
        Deque<Integer> revers = new LinkedList<>();
        for (Integer integer : list) {
            revers.addFirst(integer);
        }
        System.out.println("Реверс №2 лист: " + revers);
    }

    /**
     * Реверс листа вариат 1
     * @param list на вход созданный лист 1 2 3 4
     *             результат печати листа в обратном порядке
     */
    private static void variant1(LinkedList<Integer> list) {
        LinkedList<Integer> revers = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revers.add(list.get(i));
            list.remove(i);
        }
        System.out.println("Реверс №1 лист: " + revers);
    }
}

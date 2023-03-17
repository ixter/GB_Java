package ixter.cw4;

import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            integerList.add(i);
        }
        System.out.println("peek = " + integerList.peek()); // посмотреть начальный элемент
        System.out.println(integerList);
        System.out.println("pop = " + integerList.pop()); // удалить начальный элемент
        System.out.println(integerList);
        integerList.addFirst(3); // в начале добавит элемент
        System.out.println("add First " + integerList);
        integerList.addLast(7); // в конец добавит элемент
        System.out.println("add Last " + integerList);
        integerList.remove((Integer) 3); // удаление по индексу
        System.out.println("remove " + integerList);
        System.out.println(integerList.contains(2)); // проверка на наличие 2
    }
}

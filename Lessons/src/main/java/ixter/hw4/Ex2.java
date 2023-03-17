package ixter.hw4;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Учитывая строку s, содержащую только символы '(', ')', '{', '}', '[' и ']', определите,
 * допустима ли входная строка. Входная строка действительна, если: Открытые скобки должны быть
 * закрыты однотипными скобками. Открытые скобки должны быть закрыты в правильном порядке.
 * Каждой закрывающей скобке соответствует открытая скобка того же типа.
 */
public class Ex2 {
    public static void main(String[] args) {
        String text1 = "())";
        String text2 = "()[]{}";
        String text3 = "(]";
        String text4 = "([)]";
        String text5 = "";
        String text6 = "([])";

        System.out.println("1 = " + parenthesisCheck(text1));
        System.out.println("2 = " + parenthesisCheck(text2));
        System.out.println("3 = " + parenthesisCheck(text3));
        System.out.println("4 = " + parenthesisCheck(text4));
        System.out.println("5 = " + parenthesisCheck(text5));
        System.out.println("6 = " + parenthesisCheck(text6));
    }

    /**
     * Провека на правельность (пар) скобок
     *
     * @param text входит строка символов
     * @return True \ False
     */
    private static boolean parenthesisCheck(String text) {
        Deque<Character> list = new LinkedList<>();
        for (Character symbol : text.toCharArray()) {
            if (symbol == '(') list.add(')');
            else if (symbol == '[') list.add(']');
            else if (symbol == '{') list.add('}');
            else if (list.isEmpty() || list.pop() != symbol) return false;
        }
        return true;
    }
}


package ixter.hw5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 1) Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 */
public class Ex1 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.".toLowerCase();
        Map<String, Integer> count = countWords(text);
        System.out.println("Решение 1");
        System.out.println(count);
        System.out.println();
        System.out.println("Решение 2");
        anotherSolution(text);
    }

    /**
     * Первый вариант решения задачи
     * @param text строка для подсчёта
     * @return <String, Integer>
     */
    private static Map<String, Integer> countWords(String text) {
        Map<String, Integer> count = new HashMap<>();
        for (String longWord : text.split(" ")) {
            String word = longWord.replaceAll("[^А-Яа-яЁё]","");
            if (word.isEmpty()) continue;
            Integer item = count.get(word);
            if (item == null) item = 0;
            count.put(word, ++item);
        }
        return count;
    }

    /**
     * Второй вариант решения задачи
     * @param text строка для подсчёта
     */
    private static void anotherSolution(String text) {
        String[] words = text.split("\\s+|\\.|,|\\?|:|;");
        Hashtable<String, Integer> wordCountTable = new Hashtable<>();
        for (String word : words)
        {
            String uniqueWord = word.toLowerCase();
            if (uniqueWord.length() > 2)
            {
                if (wordCountTable.containsKey(uniqueWord))	{
                    wordCountTable.replace(uniqueWord, wordCountTable.get(uniqueWord),
                            wordCountTable.get(uniqueWord) + 1);
                } else {
                    wordCountTable.put(uniqueWord, 1);
                }
            }
        }
        wordCountTable.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
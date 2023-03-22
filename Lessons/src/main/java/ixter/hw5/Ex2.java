package ixter.hw5;

import java.util.HashMap;
import java.util.Map;

import static ixter.helpers.Helper.enterText;

/**
 * 2) Подсчитать количество искомого слова, через map (наполнением значение,
 * где искомое слово будет являться ключом), вносить все слова не нужно
 */
public class Ex2 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        System.out.println(text);
        String search = enterText("Введите искомое слово:");
        Integer count = searchWord(text.toLowerCase(), search.toLowerCase());
        if (count != null)
            System.out.println(search + ": " + count);
        else
            System.out.println("Нет вхождений");
    }

    /**
     * Функция поиска указанного слова
     * @param text входной текст
     * @param search искомое слово
     * @return Integer количество вхождений
     */
    private static Integer searchWord(String text, String search) {
        Map<String, Integer> count = new HashMap<>();
        for (String longWord : text.split(" ")) {
            String word = longWord.replaceAll("[^А-Яа-яЁё]", "");
            if (word.equals(search)) {
                Integer item = count.get(word);
                if (item == null) item = 0;
                count.put(word, ++item);
            }
        }
        return count.get(search);
    }
}

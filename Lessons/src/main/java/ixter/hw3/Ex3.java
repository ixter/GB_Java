package ixter.hw3;

import ixter.hw3.model.Book;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import static ixter.helpers.Helper.isSimpleNumber;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
 * и год издания после 2010 г, включительно.
 */
public class Ex3 {
    public static void main(String[] args) {
        List<Book> listBooks = new ArrayList<>();
        listBooks.add(new Book("Евгений Онегин", "Пушкин Александр Сергеевич", 100, 1900, 1500));
        listBooks.add(new Book("Анна Каренина", "Толстой Лев Николаевич", 100, 1950, 17));
        listBooks.add(new Book("Лирика. Поэмы", "Ахматова Анна Андреевна", 100, 2010, 17));
        listBooks.add(new Book("Красная книжица", "Мао Цзэдун", 100, 2010, 37));
        listBooks.add(new Book("Герой нашего времени", "Лермонтов Михаил Юрьевич", 100, 2015, 47));
        listBooks.add(new Book("Преступление и наказание. Идиот", "Достоевский Федор Михайлович", 922, 2022, 46));
        System.out.println(findBooks(listBooks));
    }

    /**
     * Функция поиска книг по условию задачи
     *
     * @param listBooks массив книг
     * @return массив названий книг по условию
     */
    private static @NotNull List<String> findBooks(@NotNull List<Book> listBooks) {
        List<String> result = new ArrayList<>();
        for (Book book : listBooks) {
            boolean containsA = (book.getAuthor().contains("А") | book.getAuthor().contains("а"));
            int pageCount = book.getPageCount();
            int year = book.getYear();
            String name = book.getName();
            if (isSimpleNumber(pageCount) & containsA & year >= 2010) {
                result.add(name);
            }
        }
        return result;
    }
}
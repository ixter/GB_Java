package ixter.hw3;

import ixter.hw3.model.Goods;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import static ixter.helpers.Helper.enterNumber;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Ex2 {
    public static void main(String[] args) {
        List<Goods> listGoods = new ArrayList<>();
        int searchSort = enterNumber("Введите сорт от 1 до 3:");
        listGoods.add(new Goods("Товар1", 10.0, 1, 10, "Россия"));
        listGoods.add(new Goods("Высший1", 20.0, 2, 100, "Индия"));
        listGoods.add(new Goods("Товар2", 30.0, 3, 1500, "Индия"));
        listGoods.add(new Goods("Товар3", 40.0, 1, 20, "Македония"));
        listGoods.add(new Goods("Высший2", 20.0, 2, 280, "Россия"));
        listGoods.add(new Goods("Товар4", 60.0, 3, 6000, "Россия"));
        if (searchSort <= 3 & searchSort >= 1) {
            System.out.println("Найменования товаров с наименьшей ценой: " + calculateMinPrice(listGoods, searchSort));
        } else {
            System.out.println("Введено не корректное число");
        }
    }

    /**
     * Функция получение по указанной сортировке товаров с найменьшей ценой
     *
     * @param listGoods  List<Goods>  массив товаров
     * @param searchSort int указанная сортировка
     * @return List<String> возвращает массив названий товаров
     */
    private static @NotNull List<String> calculateMinPrice(@NotNull List<Goods> listGoods, int searchSort) {
        List<String> result = new ArrayList<>();
        double minPrice = -1;
        for (Goods good : listGoods) {
            int sort = good.getSort();
            double price = good.getPrice();
            String name = good.getName();
            if (sort == searchSort) {
                if (minPrice == -1) {
                    minPrice = price;
                }

                if (price < minPrice) {
                    minPrice = price;
                    result.clear();
                    result.add(name);
                } else if (price == minPrice) {
                    result.add(name);
                }
            }
        }
        return result;
    }
}
package ixter.hw3;

import ixter.hw3.model.Goods;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 * название которых содержит «Высший».
 */
public class Ex1 {
    public static void main(String[] args) {
        List<Goods> listGoods = new ArrayList<>();
        listGoods.add(new Goods("Товар1", 10.0, 1, 10, "Россия"));
        listGoods.add(new Goods("Высший", 20.0, 2, 100, "Индия"));
        listGoods.add(new Goods("Товар1", 30.0, 3, 1500, "Индия"));
        listGoods.add(new Goods("Товар1", 40.0, 1, 20, "Македония"));
        listGoods.add(new Goods("Высший", 50.0, 2, 280, "Россия"));
        listGoods.add(new Goods("Товар1", 60.0, 3, 6000, "Россия"));
        System.out.println("Максимальная цена: " + calculateMaxPrice(listGoods));
    }

    /**
     * Функция подсчёта максимальной цены
     *
     * @param listGoods массив товаров
     * @return double число с запятой
     */
    private static double calculateMaxPrice(@NotNull List<Goods> listGoods) {
        double maxPrice = 0;
        for (Goods good : listGoods) {
            int sort = good.getSort();
            double price = good.getPrice();
            String name = good.getName();
            if (name.contains("Высший") & (sort == 1 | sort == 2) & price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }
}
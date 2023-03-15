package ixter.cw3;

import ixter.cw3.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Даны сведения об экспортируемых товарах: указывается наименование товара, страна, экспортирующая
 * товар, и объем поставляемой партии в штуках. Найти страны, которые экспортируют
 * данный(введенный с кл-ы) товар, и общий объем его экспорта.
 */
public class Ex1 {
    public static void main(String[] args) {
        Items items1 = new Items("arq1", "dfg1", 1.0);
        Items items2 = new Items("arq2", "dfg2", 2.0);
        Items items3 = new Items("arq1", "dfg3", 3.0);
        Items items4 = new Items("arq2", "dfg4", 4.0);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);

        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();
        int sumVolume = 0;
        List<String> country = new ArrayList<>();

        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().equals(searchName)) {
                country.add(itemsList.get(i).getCountry());
                sumVolume += itemsList.get(i).getVolume();
            }
        }
        System.out.println(sumVolume);
        System.out.println(country);
    }
}
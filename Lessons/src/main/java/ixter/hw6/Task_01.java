package ixter.hw6;
import ixter.hw6.model.Laptop;
import ixter.hw6.helper.LaptopFilter;


import java.util.*;

public class Task_01 {
    /*
     * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
     * Создать множество ноутбуков.
     * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
     * отвечающие фильтру. Критерии фильтрации можно хранить в Map.
     * Например: “Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
     * фильтрации можно также в Map.
     * Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
     * */
    static Set<Laptop> laptopSet = new LinkedHashSet<>();


    public static void main(String[] args) {

        LaptopFilter laptopFilter = new LaptopFilter();

        for (int i = 0; i < 100; i++) {
            laptopSet.add(new Laptop());  // Генерация
        }

        System.out.println(laptopSet.size());

        filterMenu(laptopFilter);

    }

    /**
     * Меню
     * @param laptopFilter объект фильтра ноутбука
     */
    public static void filterMenu(LaptopFilter laptopFilter) {
        int item = 0;
        Scanner scanner = new Scanner(System.in);

        while (item != 6) {
            System.out.println("-= Укажите номер параметра для фильтра: =- ");
            System.out.println("1 - RAM");
            System.out.println("2 - HDD Size");
            System.out.println("3 - OS Name");
            System.out.println("4 - Color");
            System.out.println("5 - Manufacturer");
            System.out.println("6 - Run Filter");

            try {
                item = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод!!! Введите номер 1-6");
            }

            switch (item) {
                case 1 -> laptopFilter.add("ram", enterIntData(Laptop.ramSizes));
                case 2 -> laptopFilter.add("hddSize", enterIntData(Laptop.hddSizes));
                case 3 -> laptopFilter.add("os", enterStrData(Laptop.osNames));
                case 4 -> laptopFilter.add("color", enterStrData(Laptop.colors));
                case 5 -> laptopFilter.add("manufacturer", enterStrData(Laptop.manufacturers));
                case 6 -> {
                    System.out.println(laptopFilter.filterSet);
                    showFiltered(laptopSet, laptopFilter);
                }
            }
        }
        scanner.close();
    }

    /**
     * Показать отфильтрованное
     * @param laptops Ноуты
     * @param filter Фильтр
     */
    private static void showFiltered(Set<Laptop> laptops, LaptopFilter filter) {
        Laptop sample = filter.getFilterSample();

        for (Laptop laptop :
                laptops) {
            if (laptop.corresponds(sample))
                System.out.println(laptop);
        }
    }

    /**
     * Ввод
     * @param strArr массив строчный
     * @return строку
     */
    private static String enterStrData(String[] strArr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение из списка (" + Arrays.toString(strArr) + ")");
        return scanner.nextLine();
    }

    /**
     * Ввод
     * @param intArr массив числовой
     * @return строку
     */
    private static String enterIntData(int[] intArr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение из списка (" + Arrays.toString(intArr) + ")");
        String data = scanner.nextLine();
        try {
            Integer.parseInt(data);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод!!! Введите номер от " + Arrays.toString(intArr));
            return "";
        }
        return data;
    }



}
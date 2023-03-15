package ixter.cw3;

import ixter.cw3.model.Cubes;

import java.util.*;

/**
 * 4. Напишите метод, который на вход получает коллекцию объектов,
 * а возвращает коллекцию уже без дубликатов.
 */
public class Ex4 {
    public static void main(String[] args) {
        Cubes cube1 = new Cubes("красный", 3, "дерево");
        Cubes cube2 = new Cubes("желтый", 4, "метал");
        Cubes cube3 = new Cubes("желтый", 5, "картон");
        Cubes cube5 = new Cubes("желтый", 5, "картон");
        Cubes cube6 = new Cubes("желтый", 5, "картон");
        Cubes cube4 = new Cubes("зеленый", 6, "метал");

        List<Cubes> listCubes = new ArrayList<>();
        listCubes.add(cube1);
        listCubes.add(cube2);
        listCubes.add(cube3);
        listCubes.add(cube4);
        listCubes.add(cube5);
        listCubes.add(cube6);

        System.out.println("уникальные: " + uniqueCollection(listCubes));
    }

    private static Collection<Cubes> uniqueCollection(List<Cubes> listCubes) {
        return new HashSet<>(listCubes);
    }
}

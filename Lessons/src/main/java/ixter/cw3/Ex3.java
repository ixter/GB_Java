package ixter.cw3;

import ixter.cw3.model.Cubes;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Даны следующие сведения о кубиках: размер каждого кубика
 * (длина ребра в целых сантиметрах), его цвет (красный, желтый, зеленый тд)
 * и материал (деревянный, металлический, картонный и тд.). Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 * - количество деревянных кубиков с ребром 3 см
 */
public class Ex3 {
    public static void main(String[] args) {
        Cubes cube1 = new Cubes("красный", 3, "дерево");
        Cubes cube2 = new Cubes("желтый", 4, "метал");
        Cubes cube3 = new Cubes("желтый", 5, "картон");
        Cubes cube4 = new Cubes("зеленый", 6, "метал");

        List<Cubes> listCubes = new ArrayList<>();
        listCubes.add(cube1);
        listCubes.add(cube2);
        listCubes.add(cube3);
        listCubes.add(cube4);

        int countyellow = 0;
        int sumYellow = 0;
        int countWood = 0;
        for (Cubes cube : listCubes) {
            if (cube.getColor().equals("желтый")) {
                countyellow++;
                sumYellow += cube.getVolume();
            }
            if (cube.getMaterial().equals("дерево")) {
                countWood++;
            }
        }
        System.out.println("кол Желтых: " + countyellow);
        System.out.println("объем Желтых: " + sumYellow);
        System.out.println("кол дерев: " + countWood);
    }
}
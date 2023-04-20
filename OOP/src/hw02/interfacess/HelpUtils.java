package hw02.interfacess;

import java.util.Random;
import java.util.Scanner;

public interface HelpUtils {
    static String getRandomColor() {
        int i = new Random().nextInt(6);
        switch (i) {
            case 1 -> {
                return "red";
            }
            case 2 -> {
                return "blue";
            }
            case 3 -> {
                return "yellow";
            }
            case 4 -> {
                return "gold";
            }
            case 5 -> {
                return "purple";
            }
            default -> {
                return "black";
            }
        }
    }

    static String askString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }


    static Integer askInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}

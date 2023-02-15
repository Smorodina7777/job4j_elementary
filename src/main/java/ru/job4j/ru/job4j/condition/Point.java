package ru.job4j.ru.job4j.condition;

public class Point {

    public static int difference(int x1, int x2) {
        return x2 - x1;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(difference(x1, x2), 2)
                + Math.pow(difference(y1, y2), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
         result = Point.distance(5, 6, 2, 2);
        System.out.println("result (5, 6) to (2, 2) " + result);
        result = Point.distance(0, 1, 3, 1);
        System.out.println("result (0, 1) to (3, 1) " + result);
        result = Point.distance(8, 1, 3, 4);
        System.out.println("result (8, 1) to (3, 4) " + result);
    }
}

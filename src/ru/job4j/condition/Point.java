package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double three = Math.pow(first, 2);
        double four = Math.pow(second, 2);
        double five = three + four;
        double rsl = Math.sqrt(five);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(-1, -2, 1, 2);
        double result3 = Point.distance(-3, -4, 1, 1);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (-1, -2) to (1, 2) " + result2);
        System.out.println("result (-3, -4) to (1, 1) " + result3);
    }
}

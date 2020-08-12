package ru.job4j.condition;

public class Test {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        if (abs(a - 10) > abs(b - 10))
            System.out.println(b);
        else System.out.println(a);

        if (abs(a - 10) == abs(b - 10)) System.out.println(a);
    }
    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
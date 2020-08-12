package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int div = 1; div <= n; div++) {
            result = result * div;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
        System.out.println(calc(10));
        System.out.println(calc(0));
        System.out.println(calc(25));

    }
}

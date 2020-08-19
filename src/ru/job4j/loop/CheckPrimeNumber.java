package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int num = 2; num <= (number - 1); num++) {
            if (number % num == 0) {
                return false;
            }
        }
        return prime;
    }
}

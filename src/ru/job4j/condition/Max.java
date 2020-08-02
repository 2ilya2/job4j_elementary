package ru.job4j.condition;

public class Max {

        public static int max(int x, int y) {
            int result = x >= y ?  x :  y;
            return result;
        }

        public static void main(String[] args) {
            int msg = Max.max(1, 2);
            System.out.println(msg);
        }
}

package ru.job4j.condition;

    public class MultiMax {
        public static int max(int first, int second, int third) {
            int max1 = first > second ? first : second;
            int result = third > max1 ? third : max1;
                    return result;

        }

        public static void main(String[] args) {
            System.out.println(MultiMax.max(1, 2, 3));
        }
}

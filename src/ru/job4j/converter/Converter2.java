package ru.job4j.converter;

public class Converter2 {

    public static double rubleToEuro(double value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return value / 60;
    }

    public static void main(String[] args) {
        double euro = Converter2.rubleToEuro(140);
        double dollar = Converter2.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");

        double in1 = 140;
        double expected1 = 2;
        double out1 = rubleToEuro(in1);
        boolean passed1 = expected1 == out1;

        double in2 = 140;
        double expected2 = 2.3333333333333335;
        double out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;

        System.out.println("140 rubles are 2. Test result : " + passed1);
        System.out.println("140 rubles are 2.3333333333333335 Test result : " + passed2);

    }

}

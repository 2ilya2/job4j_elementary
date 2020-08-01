package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class TrgAreaTest {

    @Test
    public void area() {
        double a = 2;
        double b = 2;
        double c = 2;

        double expected = 1.7320508075688772;
        double out = TrgArea.area(a, b, c);
        Assert.assertEquals(expected, out, 0.01);

    }
}
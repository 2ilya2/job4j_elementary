package ru.job4j.loop;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void testToFive() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, is(expected));
    }

    @Test
    public void testToZero() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, is(expected));
    }

    @Test
    public void testToTwentyFive() {
        int rsl = Factorial.calc(25);
        int expected = 2076180480;
        assertThat(rsl, is(expected));
    }
}


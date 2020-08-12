package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void testOne() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void testTwo() {
        int rsl = Counter.sumByEven(5, 6);
        int expected = 6;
        assertThat(rsl, is(expected));
    }

    @Test
    public void testThree() {
        int rsl = Counter.sumByEven(-2, 2);
        int expected = 0;
        assertThat(rsl, is(expected));
    }
}
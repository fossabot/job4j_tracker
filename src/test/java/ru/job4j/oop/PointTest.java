package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to71then6() {
        int expexted = 6;
        Point a = new Point(1, 1);
        Point b = new Point(7, 1);
        double out = a.distance(b);
        Assert.assertEquals(expexted, out, 0.01);
    }

    @Test
    public void whenMinus13toMinus4Minus1then5() {
        int expexted = 5;
        Point a = new Point(-1, 3);
        Point b = new Point(-4, -1);
        double out = a.distance(b);
        Assert.assertEquals(expexted, out, 0.01);
    }

    @Test
    public void when22to23then1() {
        int expexted = 1;
        Point a = new Point(2, 2);
        Point b = new Point(2, 3);
        double out = a.distance(b);
        Assert.assertEquals(expexted, out, 0.01);
    }
}
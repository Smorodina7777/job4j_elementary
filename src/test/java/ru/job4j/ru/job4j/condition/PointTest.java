package ru.job4j.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when56to22then5() {
        int x1 = 5;
        int y1 = 6;
        int x2 = 2;
        int y2 = 2;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to31then3() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 3;
        int y2 = 1;
        double expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when81to34then5() {
        int x1 = 8;
        int y1 = 1;
        int x2 = 3;
        int y2 = 4;
        double expected = 5.83;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
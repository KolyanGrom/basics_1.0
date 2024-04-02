package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {
    @Test
    public void test_1() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = 100;
        int expected = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test_2() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int actual = 999;
        int expected = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test_3() {
        CashbackHackService service = new CashbackHackService();

        int amount = 10_000;

        int actual = 1000;
        int expected = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test_4() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = 1000;
        int expected = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }
}
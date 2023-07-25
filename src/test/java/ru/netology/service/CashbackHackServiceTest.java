package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testThereIsEnoughMoney() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testAddMoney() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 725;

        int actual = cashbackHackService.remain(amount);
        int expected = 275;

        assertEquals(expected, actual);
    }
}
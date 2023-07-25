package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testThereIsEnoughMoney() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testAddMoney() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 630;

        int actual = cashbackHackService.remain(amount);
        int expected = 370;

        assertEquals(actual, expected);
    }
}
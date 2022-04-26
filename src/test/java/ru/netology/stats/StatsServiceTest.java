package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calcAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = (8);
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSumMonthMinAvgSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = (5);
        //StatsService.calcAverage(sales);
        int actual = service.sumMonthMinAvgSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSumMonthMaxAvgSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = (5);
        //StatsService.calcAverage(sales);
        int actual = service.sumMonthMinAvgSale(sales);
        assertEquals(expected, actual);
    }
}
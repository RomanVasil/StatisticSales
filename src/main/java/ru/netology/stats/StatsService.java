package ru.netology.stats;

public class StatsService {

    //Сумма всех продаж
    public static int calcSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public static int calcAverage(long[] sales) {
        return calcSum(sales) / sales.length;
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int sumMonthMinAvgSale(long[] sales) {
        int sumMonthMinAvgSale = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {

            if (sale < StatsService.calcAverage(sales)) {
                sumMonthMinAvgSale += 1;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return sumMonthMinAvgSale;
    }

    //Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int sumMonthMaxAvgSale(long[] sales) {
        int sumMonthMaxAvgSale = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale < StatsService.calcAverage(sales)) {
                sumMonthMaxAvgSale += 1;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return sumMonthMaxAvgSale;
    }
}
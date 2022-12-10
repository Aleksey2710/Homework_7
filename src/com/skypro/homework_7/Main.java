package com.skypro.homework_7;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");

        int invest = 15_000;
        int month = 0;
        int total = 0;
        int investFinal = 2_459_000;
        while (total <= investFinal) {
            month++;
            total += total / 100; //условно 12% годовых.
            total += invest;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Всего нужно " + month + " месяцев, чтобы накопить " + total + " рублей.");
    }
    public static void task2 () {
        System.out.println("Задача 2");

        int number = 0;
        while (number < 10) {
            number += 1;
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void task3 () {
        System.out.println("Задача 3");

        int countryY = 12_000_000;
        int fertilityYear = countryY / 1_000 * 17;
        int mortalityYear = countryY / 1_000 * 8;
        int peopleYearPlus = fertilityYear - mortalityYear;
        int year = 0;
        System.out.println("Первоначальная численность " + countryY + " человек.");
        while (year < 10) {
            year++;
            countryY += peopleYearPlus;
            System.out.println("Год " + year + ", численность населения составляет " + countryY + " человек.");
        }
        System.out.println("За " + year + " лет численность населения будет " + countryY + " человек.");
    }
    public static void task4 () {
        System.out.println("Задача 4"); /*Будем считать, что по условию задачи Василий просто положил 15000
                                        рублей под процент и ЖДЕТ! не докладывая деньги на вклад!!! */
        int invest = 15_000;
        int month = 0;
        int investFinal = 12_000_000;
        int percentInMonth = 7;
        while (invest < investFinal) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + invest + " рублей.");
            invest = invest + invest * percentInMonth / 100; //7% в месяц - 84% годовых (хотел бы я такой вклад)
            month++;
        }
        System.out.println("Всего нужно " + month + " месяцев, чтобы накопить " + invest + " рублей.");
    }
    public static void task5 () {
        System.out.println("Задача 5");

        int invest = 15_000;
        int month = 0;
        int investFinal = 12_000_000;
        int percentInMonth = 7;
        while (invest < 12_000_000) {
            invest = invest + invest * percentInMonth / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + invest + " рублей.");
            }
        }
        System.out.println("Всего нужно " + month + " месяцев, чтобы накопить " + invest + " рублей.");
    }

    public static void task6 () {
        System.out.println("Задача 6");

        int invest = 15_000;
        int year = 9;
        int month = 0;
        while (month < (year * 12)) {
            invest = invest + invest * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + invest + " рублей.");
            }
        }
        System.out.println("За " + month + " месяцев (с таким шикарным процентом) Василий накопит " + invest + " рублей.");
    }
    public static void task7 () {
        System.out.println("Задача 7");

        // Условно возьмем месяц декабрь 2022 года, где первая пятница выпадает на 2-е число.
        int month = 31;
        for (int friday = 2; friday <= month; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8 () {  // Получилось два решения, но первое нравится больше
        System.out.println("Задача 8");

        int todayYear = 2022;
        int beforeTodayYear = 200;
        int afterTodayYear = 100;
        int year = 0;

        for (; year <= (todayYear + afterTodayYear); year = year + 79) {
            if (year >= (todayYear - beforeTodayYear)) {
                System.out.println(year);
            }
        }
    }
}

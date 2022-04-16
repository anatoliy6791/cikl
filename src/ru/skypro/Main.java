package ru.skypro;

public class Main {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        ;
        {
            System.out.println();
        }

        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        {
            System.out.println();
        }
        int day = 1;
        for (; day < 31; day = day + 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        int year = 0;
        for (; year < 2022; year = year + 79) {
            if (year > 1822) {
                System.out.println(year);}
                int next = year + 79;
            if (next > 2022)
                {
                    System.out.println(next);
                }
            }
        }
    }


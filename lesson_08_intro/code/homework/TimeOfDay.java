package homework;

//Определение времени суток. Напишите программу, которая принимает на вход текущий час (от 0 до 23)
// и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).

import java.util.Scanner;

public class TimeOfDay
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input current hour (0 to 23): ");
        int time = in.nextInt();

        // вариант 1

        if ( (time >= 0) && (time <= 3))
            System.out.println("Good night!");
        if ( (time >= 4) && (time <= 11))
            System.out.println("Good morning!");
        if ( (time >= 12) && (time <= 16))
            System.out.println("Good afternoon!");
        if ( (time >= 17) && (time <= 23))
            System.out.println("Good evening!");

        System.out.println("---------------------------------------------------------");

        // вариант 2

        switch (time)
        {
            case 0, 1, 2, 3 -> System.out.println("Good night!");

            case 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 -> System.out.println("Good afternoon!");

            case 17, 18, 19, 20, 21, 22, 23 -> System.out.println("Good evening!");
        }

    }
}

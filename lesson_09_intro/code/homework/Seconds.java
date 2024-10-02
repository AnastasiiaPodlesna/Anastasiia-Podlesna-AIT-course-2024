package homework;

// В программе задаются часы, минуты и секунды. Нужно вывести общее количество секунд,
// прошедших с начала суток. Вычисление произведите в методе, который получает на вход часы,
// минуты и секунды.

import java.util.Scanner;

public class Seconds
{
    public static void main(String[] args)
    {
        int secondsDay;
        int hours, minutes, seconds;
        Scanner in = new Scanner(System.in);

        System.out.println("Input hours from 0 to 23 : ");
        hours = in.nextInt();

        while (( hours < 0) || ( hours > 23))
        {
            System.out.println("Wrong input! Try again hours, please...");
            hours = in.nextInt();
        }

        System.out.println("Input minutes from 0 to 60: ");
        minutes = in.nextInt();

        while ( (minutes < 0) || ( (minutes > 60) && (hours >= 23) ) )
        {
            System.out.println("Wrong input! Try again minutes, please...");
            minutes = in.nextInt();
        }
        if (minutes == 60)
        {
            minutes = 0;
            hours++;
        }

        System.out.println("Input seconds from 0 to 60: "); //  секунды
        seconds = in.nextInt();

        while ( (seconds < 0) || ( (seconds >= 60) && (minutes >= 59) && (hours >= 23)))
        {
            System.out.println("Wrong input! Try again seconds, please...");
            seconds = in.nextInt();
        }
        if ( (seconds == 60) && (minutes) != 0)
        {
            seconds = 0;
            minutes++;
        }
        else
        if ( (seconds == 60) && (minutes) == 0)
        {
            seconds = 0;
        }

        secondsDay = secondsCalculator(hours, minutes, seconds);
        System.out.println("You entered the time: " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
        System.out.println("Total number of seconds: " + secondsDay);
    }

    private static int secondsCalculator(int hours, int minutes, int seconds)
    {
        return seconds + minutes * 60 + hours * 3600;
    }

}



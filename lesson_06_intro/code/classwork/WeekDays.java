package classwork;

//Написать программу, которая по введенной цифре от 1 до 7 определяет день недели.
//Второй вариант - на цифры от 1 до 5 программа сообщает, что это будний день, а на 6 и 7, что это выходной.

import java.util.Scanner;

public class WeekDays
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of day: ");
        int weekDay  = in.nextInt();

        switch(weekDay)
        {
            case 1 ->
            {
                System.out.println("This is Monday.");
            }
            case 2 ->
            {
                System.out.println("This is Tuesday.");
            }
            case 3 ->
            {
                System.out.println("This is Wednesday.");
            }
            case 4 ->
            {
                System.out.println("This is Thursday.");
            }
            case 5 ->
            {
                System.out.println("This is Freiday.");
            }
            case 6 ->
            {
                System.out.println("This is Satuday.");
            }
            case 7 ->
            {
                System.out.println("This is Satuday.");
            }
            default -> System.out.println("Wrong input!");
        }

        switch (weekDay)
        {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("Thus is working day");
            }
            case 6, 7 -> {
                System.out.println("Thus is weekend");
            }
            //default -> System.out.println("Wrong input!");
        }
    }
}

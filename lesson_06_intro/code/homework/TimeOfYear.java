package homework;

//Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает, какому времени года
//принадлежит введенный месяц.

import java.util.Scanner;

public class TimeOfYear
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of month: ");
        int monthNumber  = in.nextInt();

        switch(monthNumber)
        {
            case 1 ->
            {
                System.out.println("This is January.");
            }
            case 2 ->
            {
                System.out.println("This is February.");
            }
            case 3 ->
            {
                System.out.println("This is March.");
            }
            case 4 ->
            {
                System.out.println("This is April.");
            }
            case 5 ->
            {
                System.out.println("This is May.");
            }
            case 6 ->
            {
                System.out.println("This is June.");
            }
            case 7 ->
            {
                System.out.println("This is July.");
            }
            case 8 ->
            {
                System.out.println("This is August.");
            }
            case 9 ->
            {
                System.out.println("This is September.");
            }
            case 10 ->
            {
                System.out.println("This is October.");
            }
            case 11 ->
            {
                System.out.println("This is November.");
            }
            case 12 ->
            {
                System.out.println("This is December.");
            }
            default -> System.out.println("Wrong input!");
        }

        switch (monthNumber)
        {
            case 12, 1, 2 ->
            {
                System.out.println("It's Winter! ");
            }
            case 3, 4, 5 ->
            {
                System.out.println("It's Spring! ");
            }
            case 6, 7, 8 ->
            {
                System.out.println("It's Summer! ");
            }
            case 9, 10, 11 -> {
                System.out.println("It's Autumn");
            }

        }


    }
}

package classwork;

//Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.

import java.util.Scanner;

public class Digits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input positive integer number:  ");
        int  Digit  = in.nextInt();

        int count = 0;

        while (Digit > 0)
        {
            Digit = Digit / 10;
            count++;
        }
        System.out.println("Number have " + count + " digits");




    }
}

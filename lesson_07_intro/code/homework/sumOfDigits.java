package homework;

// Вводится положительное целое число, найдите сумму его цифр.
// Пример: 1725, сумма цифр = 15

import java.util.Scanner;

public class sumOfDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number  = in.nextInt();

        int summ = 0;

        while (number > 0)
        {
            summ = summ + number % 10;
            number = number / 10;

        }

        System.out.println("Sum of digits ist " + summ);









    }
}

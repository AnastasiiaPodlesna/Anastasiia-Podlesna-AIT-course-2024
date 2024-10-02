package homework;


//  Составьте программу, которая вычисляет сумму чисел от 1 до 1/n, n вводится с клавиатуры.
//  Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Использовать цикл for.

import java.util.Scanner;

public class SumOfNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input integer n > 0: ");
        double n = scanner.nextInt();

        while (n <= 0)
        {
            System.out.println("Error 401! repeat data input!");
            n = scanner.nextInt();
        }

        double sum = 0.0;

        for (double i = 1; i <= n; i++)
        {
            sum = sum + 1 / i;
            System.out.print("1/" + i);
            if (i < n) System.out.print(" + ");
        }
        System.out.printf(" =  %.2f", sum);
    }
}

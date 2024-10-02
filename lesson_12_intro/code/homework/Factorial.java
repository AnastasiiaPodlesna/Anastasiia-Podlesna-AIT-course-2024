package homework;

// Вводится n - натуральное число. Напишите метод, который получает на вход n и вычисляет
// n! = 1 * 2 * 3 *... * n. Вызовите полученный метод.
// При каком значении n происходит переполнение памяти, выделяемой для значения n! типа int?
// Использовать цикл for.

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input integer n >= 0: ");
        int n = scanner.nextInt();

        while (n < 0)
        {
            System.out.println("Error 401! repeat data input!");
            n = scanner.nextInt();
        }

        factorial(n);
    }

    private static void factorial(int n)
    {
        int res = 1;
        boolean nFactorial = true;
        System.out.print(n+"! = ");

        for (int i = 1; i <= n; i++)
        {
            if (Integer.MAX_VALUE / i < res)
            {
                nFactorial = false;
                break;
            }
            res = res * i;
        }
        if (nFactorial == true) System.out.println(res);
        else System.out.println(" -> STACK OVERVLOW !!! ");
    }
}

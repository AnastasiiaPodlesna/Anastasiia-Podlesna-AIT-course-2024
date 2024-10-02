package classwork;

import java.util.Scanner;

public class TernaryExample
{
//    В программе задаются два целых числа.
//    Найдите минимальное из них с помощью тернарного оператора.
//    Дополните программу возможностью ввода чисел пользователем.

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st number a: ");
        int a  = in.nextInt();
        System.out.print("Input 2nd number  b: ");
        int b  = in.nextInt();

        int min = min(a, b);
        System.out.println("Minimum number ist "+ min);
    }

    private static int min(int a, int b)
    {
    return (a < b) ? a : b;
    }

}

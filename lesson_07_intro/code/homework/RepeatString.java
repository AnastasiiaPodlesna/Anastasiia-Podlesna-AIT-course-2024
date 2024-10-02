package homework;

//Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.
// Пример: строка - молоко, кол-во раз 3 молоко молоко молоко

import java.util.Scanner;

public class RepeatString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string please:  ");
        String str  = in.nextLine();

        System.out.print("Input the number of repetitions of this string:  ");
        int numberOfRepetitions = in.nextInt();

        int step = 1;

        while (numberOfRepetitions > 0)
        {
            System.out.println(step + " - " + str);
            numberOfRepetitions--;
            step++;
        }


    }
}

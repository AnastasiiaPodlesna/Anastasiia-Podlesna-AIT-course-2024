package classwork;

// Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
// Запросите у пользователя какое-то натуральное число.
// Определите, есть ли это число в массиве.
// Создайте и используйте метод searchInArray, который получает на вход массив и искомое число, а возвращает
// ответ - нашлось ли это число в массиве.

import java.util.Random;
import java.util.Scanner;

public class RandomNumber
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = random.nextInt(100) + 1;
            System.out.print(numbers[i] + " ");
        }

        System.out.println("Input positive integer number: ");
        int num = scanner.nextInt();

        boolean isInArray = seachInArray(numbers, num);
        System.out.println("" + isInArray);
    }

    private static boolean seachInArray(int[] numbers, int num)
    {

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == num) return true;
        }
        return  false;
    }


}

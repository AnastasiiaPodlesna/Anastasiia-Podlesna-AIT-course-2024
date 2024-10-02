package homework;

// Написать метод, принимающий массив целых чисел, и "разворачивающий" его.
// Последний элемент становится нулевым, предпоследний, первым, и т. д.
// Подсказка: этот метод должен изменить полученный массив, а не распечатать его в обратном порядке.

import java.util.Scanner;

public class UnfoldsArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nHow many elements do you want to input in the array? ");
        int number = scanner.nextInt();  // количество элементов массива, задается пользователем
        int[] array = new int[number];
        for (int i = 0, j = 1; i < number; i++)
        {
            System.out.print("\nInout please " + j + " elements of the array: ");
            array[i] = scanner.nextInt();
            j++;
        }

        for (int i = 0; i < number; i++)          // печать заданного массива
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");


        unfoldsArray (array);                    // вызов функции, разворачивающей массив


        for (int k = 0; k < array.length; k++)  // печать развернутого массива
        {
            System.out.print(array[k] + " ");
        }
        System.out.println("");
    }


    private static void unfoldsArray (int[] array)
    {
        int j = array.length;
        int temp;

        for (int i = 0; i < j / 2; i++)
        {
            temp = array[i];
            array[i] = array[j - 1 - i];
            array[j - 1 - i] = temp;
        }

    }
}

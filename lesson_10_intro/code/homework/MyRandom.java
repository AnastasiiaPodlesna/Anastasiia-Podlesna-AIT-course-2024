package homework;

// Создайте массив из 20 случайных(*) целых чисел в интервале от 10 до 30.
// Выведите массив на печать. Поменяйте местами первый и последний элементы массива
// и снова выведите массив на печать.

import java.util.Random;

public class MyRandom
{
    static int [] array = new int[20];

    public static void main(String[] args)
    {
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(30 - 10) + 10;
        }

        sorting(array[0], array[array.length-1]);
        System.out.println(" ");
        sorting(array[array.length-1], array[0]);
    }

    private static void sorting (int f, int e)
    {
        array[0] = f; array[array.length-1] = e;

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

}

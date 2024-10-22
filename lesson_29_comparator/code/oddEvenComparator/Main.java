package oddEvenComparator;

import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] array = new int[10];

        //  массив случайных чисел от 1 до 100
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Array as is:  " + Arrays.toString(array));
        System.out.println("---------------------------------------------------");

        Integer[] timeArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++)
        {
            timeArray[i] = array[i];
        }

        // Сортируем массив
        Arrays.sort(timeArray, new OddEvenComparator());

        // Преобразуем обратно в int массив
        for (int i = 0; i < timeArray.length; i++)
        {
            array[i] = timeArray[i];
        }
        System.out.println("Sorted array: " + Arrays.toString(array));










    }
}

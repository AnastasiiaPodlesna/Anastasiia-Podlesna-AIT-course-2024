package homework.array100RandomIntegers;

// Создайте массив из 100 случайных целых чисел в интервале от -10 до 10.
// Подсчитайте, сколько в этом массиве оказалось:
// положительных чисел;
// отрицательных чисел;
// четных чисел;
// нулей.
// Реализуйте все подсчеты методами и напишите для них тесты.

import java.util.Random;

public class Array100RandomIntegers
{
    private int[] intArray;

    public Array100RandomIntegers()
    {
        this.intArray = newRandomArray();
    }

    public int[] getIntArray()
    {
        return intArray;
    }

    public void setIntArray(int[] intArray)
    {
        this.intArray = intArray;
    }

    // метод генерирующий массив числами от -10 до 10
    int[] newRandomArray()
    {
        Random random = new Random();
        int[] array = new int[100];

        System.out.println("Elements of array: ");

        for(int i = 0; i < array.length; i ++)
        {
            array[i] = random.nextInt(21)-10;
            System.out.print(array[i] + " ");
        }
        return array;
    }

    // кол-во положительных чисел в массиве
    public int countPositiveNumbers()
    {
        int count = 0;

        for (int element : intArray)
        {
            if(element > 0)
            {
                count++;
            }
        }
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("Count of positive numbers: " + count);

        return count;
    }

    // кол-во отрицательных чисел в массиве
    public int countNegativeNumbers()
    {
        int count = 0;

        for (int element : intArray)
        {
            if(element < 0)
            {
                count++;
            }
        }
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("Count of negative numbers: " + count);

        return count;
    }

    // кол-во четных чисел в массиве
    public int countEvenNumbers()
    {
        int count = 0;

        for (int element : intArray)
        {
            if(element % 2 == 0)
            {
                count++;
            }
        }
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("Count of even numbers: " + count);

        return count;
    }

    // кол-во нулей в массиве
    public int countZerosNumbers() // кол-во нулей в массиве
    {
        int count = 0;

        for (int element : intArray)
        {
            if(element == 0)
            {
                count++;
            }
        }
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("Count of zeros: " + count);

        return count;
    }
}

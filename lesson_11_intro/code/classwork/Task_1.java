package classwork;

// Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
// Найдите минимальный элемент массива и его индекс.
// Каков будет результат, если в массиве несколько одинаковых минимальных элементов?
// Найдите максимальный элемент массива и его индекс.
// Поменяйте местами минимальный и максимальный элементы, распечатайте массив.

public class Task_1
{
    public static void main(String[] args)
    {
        int[] array = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59, -145};

        int min = array[0];
        int max = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
                index = i;
            }
        }
        System.out.println("The minimum array element " + min + " and its index " + index);

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
                index = i;
            }
        }
        System.out.println("The maximum array element " + max + " and its index " + index);
    }
}

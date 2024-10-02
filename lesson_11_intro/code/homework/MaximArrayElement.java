package homework;

// Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
// Найдите максимальный элемент массива и его индекс. Поставьте этот элемент в начало массива.

public class MaximArrayElement
{
    public static void main(String[] args)
    {
      int[] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};
      int max = 0;
      int index = 0;

        for (int i = 0; i < array.length; i++) // максимальный элемент массива и его индекс
        {
            if (array[i] > max)
            {
                max = array[i];
                index = i;
            }
        }

        for (int i = index; i > 0; i--)  // сдвиг элементов массива, занесение максим.элемента в начало массива
        {
            array[i] = array[i - 1];
        }
        array[0] = max;

        System.out.println("Maximal element of the array is  " + max + " and its index " + index);
        System.out.println("New array: ");

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

    }
}

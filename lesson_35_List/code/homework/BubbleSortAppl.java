package homework;

import java.util.Random;

// Дополните метод bubbleSort() счетчиком, который позволяет узнать, сколько операций было выполнено по ходу сортировки. Выполните сортировку элементов массивов, в которых содержатся 10, 100 и 1000 элементов. Массивы заполните случайными целыми числами в интервале от 0 до 1000. Как растет количество операций при сортировке при росте количества элементов массива?

public class BubbleSortAppl
{
    public static void main(String[] args)
    {
        int[] sizesOfArrays = {10, 100, 1000};

        for (int size : sizesOfArrays)
        {
            int[] array = createRandomArray(size);
            int count = bubbleSort(array);
            System.out.println("Size of array: " + size + ", => operations: " + count);
        }
    }

    public static int bubbleSort(int[] array)
    {
        int n = array.length;
        int count = 0; // Счетчик операций

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
            {
                count++; // Увеличиваем счетчик при каждой сравнении
                if (array[j] > array[j + 1])
                {
                    // Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return count;
    }

    private static int[] createRandomArray(int size)
    {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = random.nextInt(1001);
        }
        return array;
    }

}

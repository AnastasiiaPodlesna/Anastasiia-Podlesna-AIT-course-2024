package classwork;

public class ArrayMethods
{
    // разворот массива - array turnaround, reverse

    public static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void reverseArray(int[] array)
    {
        for (int i = 0, j = array.length - 1; i < j; i++, j--)
        {
            swap(array, i, j);
        }
    }



    // пузырьковый метод

    public static void bubbleSort (int[] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length - 1 - i; j++)
            {
                if(array[j] > array[j + 1])
                { // compare 2 elements of array, if left > right => swap
                    //swapping
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


// бинарный метод

 public static int binarySearch(int[] array, int n)
 {
     int leftIndex = 0;
     int rightIndex = array.length-1;

     while (leftIndex <= rightIndex)
     {
         int midIndex = (leftIndex + rightIndex) / 2;
         if (array[midIndex] == n) return midIndex;
         else if (n < array[midIndex]) // правую часть массива отбросим
              rightIndex = midIndex - 1;
         else leftIndex = midIndex + 1;
     }
     return -leftIndex-1; // если не найден

 }

 //--------------------------------------------------------------------------------------------------

// Линейный способ, возвращает индекс элемента, который он найдет (или возвращает -1, если элемент не найден)


public static int linearSearch(int[] array, int n)
{
    for (int i = 0; i < array.length; i++)
    {
        if (array[i] == n) return i;
    }
    return -1;
}

// -----------------------------------------------------------------------------------------

//  - заполнение массива случайными целыми числами из интервала от a до b
//  - печать массива целых чисел
//  - поиск элемента



    public static int[] fillArray(int a, int b, int n) // заполнение массива рандомными числами
    {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++)
        {
            res[i] = (int)(Math.random()*(b - a + 1) + a);
        }
        return res;
    }

    public static void printArray (int [] array)   // печать элементов массива
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------");
    }

    public static boolean searchInArray(int[] array, int n) // поиск элемента в массиве
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == n) return true;
        }
        return false;
    }

    //------------------------------------------------------------------------------------

    public static double[] calculatePercent(double[] array, int x)
    {
        double[] arrayWithPercent = new double[array.length];

        for (int i = 0; i < array.length; i++)
        {
            arrayWithPercent[i] = array[i] + array[i] * x /100;
        }
        return arrayWithPercent;
    }

    //-------------------------------------------------------------------------------------

    public static int sumArray(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        return sum;
    }
    //-------------------------------------------------------------------------------------

    public static double averageValue(double[] array) // среднее арифметическое
    {
        double sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        return sum / array.length;
    }


}

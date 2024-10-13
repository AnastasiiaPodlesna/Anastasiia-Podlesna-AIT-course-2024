package homework.max_min_element_index;

// Разработайте тесты для методов обрабатывающих массивы:
// поиск минимального (максимального) элемента
// поиск индекса минимального (максимального) элемента

import java.util.Arrays;

public class Max_Min_Element_Index
{
    private int[] array;

    // constructor
    public Max_Min_Element_Index(int[] array)
    {
        this.array = array;
    }

    public int[] getArray()
    {
        return array;
    }

    public void setArray(int[] array)
    {
        this.array = array;
    }

    public int maxElementSearch(int[] array)
    {
        int maxElement = array[0];

        for (int element : array)
        {
            if (element > maxElement)
            {
                maxElement = element;
            }
        }
        return maxElement;
    }

    public int maxIndexSearch(int[] array)
    {
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[maxIndex])
            {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int minElementSearch(int[] array)
    {
        int minElement = array[0];

        for (int element : array)
        {
            if (element < minElement )
            {
                minElement = element;
            }
        }
        return minElement;
    }

    public int minIndexSearch(int[] array)
    {
        int minIndex = 0;

        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < array[minIndex])
            {
                minIndex = i;
            }
        }
        return minIndex;
    }


}

package homework.arrayMethods;

// Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
// сумма всех элементов массива с нечетными индексами;
// поиск 5-го элемента в массиве. Разработайте тесты для этих методов.

public class ArrayMethods
{
    private int[] array;

    public ArrayMethods(int[] array)
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


    public int sumAllElementsArrayWithOddIndices(int[] array)
    {
        int sumElementsArray = 0;
        if (array.length < 2)
        {
            return 0;
        }
        for (int i = 1; i < array.length; i += 2)
        {
            sumElementsArray += array[i];
        }
        return sumElementsArray;
    }

    public int search5thElementArray(int[] array)
    {
        if (array.length >= 5)
        {
            return array[4];
        }
        return 0;
    }
}


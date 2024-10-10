package classwork.arrays_TDD;

import java.util.Arrays;
import java.util.Objects;

public class ArrayTDD
{

    private int[] array;

    public ArrayTDD(int[] array)
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

    @Override
    public String toString()
    {
        return "classwork.arrays_TDD.ArrayTDD{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof ArrayTDD arrayTDD)) return false;
        return Objects.deepEquals(array, arrayTDD.array);
    }

    @Override
    public int hashCode()
    {
        return Arrays.hashCode(array);
    }

    // count positive numbers in array
    public int countPositive(int[] array)
    {
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > 0)
                count++;
        }
        return count;
    }



}

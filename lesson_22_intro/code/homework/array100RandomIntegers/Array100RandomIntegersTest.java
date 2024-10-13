package homework.array100RandomIntegers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Array100RandomIntegersTest
{
    private static Array100RandomIntegers array100RandomIntegers;

    @BeforeAll
    public static void setUp()
    {   // создаем объект с массивом из 100 случайных чисел
        array100RandomIntegers = new Array100RandomIntegers();
    }

    @Test
    void countPositiveNumbers()
    {
        int sumPositiveElement = 0;
        for (int element : array100RandomIntegers.getIntArray())
        {
            if (element > 0)
               sumPositiveElement ++;
        }
        assertEquals(sumPositiveElement, array100RandomIntegers.countPositiveNumbers());
    }

    @Test
    void countNegativeNumbers()
    {
        int sumNegativeElement = 0;
        for (int element :  array100RandomIntegers.getIntArray())
        {
            if (element < 0)
                sumNegativeElement ++;
        }
        assertEquals(sumNegativeElement, array100RandomIntegers.countNegativeNumbers());
    }

    @Test
    void countEvenNumbers()
    {
        int sumEvenElement = 0;
        for (int element :  array100RandomIntegers.getIntArray())
        {
            if (element % 2 == 0)
                sumEvenElement ++;
        }
        assertEquals(sumEvenElement, array100RandomIntegers.countEvenNumbers());
    }

    @Test
    void countZerosNumbers()
    {
        int sumZerosElement = 0;
        for (int element :  array100RandomIntegers.getIntArray())
        {
            if (element == 0)
                sumZerosElement ++;
        }
        assertEquals(sumZerosElement, array100RandomIntegers.countZerosNumbers());
    }
}
package classwork.arrays_TDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTDDTest
{
    ArrayTDD arrayTDD;

    @BeforeEach
    void setUp()
    {
        int[] array = {10, -10, 20, -15, 45}; // 3
        arrayTDD = new ArrayTDD(array);
    }

    @Test
    void countPositive()
    {
        int[] array = {10, -10, 20, -15, 45};
        // expected
        int expected = 4;
        //actual
        int actual = arrayTDD.countPositive(array);
        assertEquals(expected, actual, "Bad info: ");
    }
}
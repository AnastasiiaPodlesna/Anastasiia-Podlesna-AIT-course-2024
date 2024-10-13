package homework.arrayMethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest
{
    int[] array = {10, -24, 24, 5, 1, -7, 0, 55, 11, 1};

    ArrayMethods arrayMethods = new ArrayMethods(array);

    @Test
    void testSumAllElementsArrayWithOddIndices()  // valid array with all odd indices
    {
        // -24 + 5  -7 + 55 + 1 = 30;
        arrayMethods.setArray(array);
        assertEquals(30, arrayMethods.sumAllElementsArrayWithOddIndices(array));
    }

    @Test
    void testWithEmptyArray() // empty array
    {
        int[] invalidArray = {};
        arrayMethods.setArray(invalidArray);
        assertEquals(0, arrayMethods.sumAllElementsArrayWithOddIndices(invalidArray));
    }

    @Test
    void testWithOneElementArray() // 1 element in array
    {
        int[] invalidArray = {50};
        arrayMethods.setArray(invalidArray);
        assertEquals(0, arrayMethods.sumAllElementsArrayWithOddIndices(invalidArray));
    }

    @Test
    void testWithTwoElementsArray() // 2 elements in array
    {
        int[] invalidArray = {50, -72};
        arrayMethods.setArray(invalidArray);
        assertEquals(-72, arrayMethods.sumAllElementsArrayWithOddIndices(invalidArray));
    }

    @Test
    void testSearchFifthElementArray()
    {
        arrayMethods.setArray(array);
        assertEquals(1, arrayMethods.search5thElementArray(array));  //  5th element = 1
    }

    @Test
    void testNoFifthElementArray()
    {
        int[] invalidArray = {10, 24, 1, 0};
        arrayMethods.setArray(invalidArray);
        assertEquals(0, arrayMethods.search5thElementArray(invalidArray) );  // no 5th element
    }
}
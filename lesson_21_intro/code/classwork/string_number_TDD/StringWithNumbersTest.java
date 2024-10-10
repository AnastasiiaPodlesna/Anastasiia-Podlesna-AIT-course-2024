package classwork.string_number_TDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringWithNumbersTest
{
    StringWithNumbers stringWithNumbers; // object of test


    @BeforeEach
    void setUp()
    {
      stringWithNumbers = new StringWithNumbers("123 321 10"); // 454
    }

    @Test
    void sumOfNumbersInString()
    {
        String str = "123 321 10";
        int expected = 454;
        int actual = stringWithNumbers.sumOfNumbersInString(str);
        assertEquals(expected, actual);
    }

}
package homework.max_min_element_index;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Max_Min_Element_IndexTest
{
    Max_Min_Element_Index max_min_element_index;
    int[] array = {10, 12, 1, 9, -45, 0};

    @BeforeEach
    void setUp()
    {
        max_min_element_index = new Max_Min_Element_Index(array);
    }

    @Test
    void maxElementSearch()
    {
        assertEquals(12, max_min_element_index.maxElementSearch(array));
    }

    @Test
    void maxIndexSearch()
    {
        assertEquals(1, max_min_element_index.maxIndexSearch(array));
    }

    @Test
    void minElementSearch()
    {
        assertEquals(-45, max_min_element_index.minElementSearch(array));
    }

    @Test
    void minIndexSearch()
    {
        assertEquals(4, max_min_element_index.minIndexSearch(array));
    }
}
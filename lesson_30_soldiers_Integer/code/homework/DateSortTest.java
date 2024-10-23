package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class DateSortTest
{
Comparator<String> comparator;

        @BeforeEach
        void setUp()
        {
            comparator = (s1, s2) ->
            {
                int y1 = Integer.parseInt(s1.substring(6, 10));// parseInt - для преобразования строки в целое число
                int m1 = Integer.parseInt(s1.substring(3, 5));
                int d1 = Integer.parseInt(s1.substring(0, 2));

                int y2 = Integer.parseInt(s2.substring(6, 10));
                int m2 = Integer.parseInt(s2.substring(3, 5));
                int d2 = Integer.parseInt(s2.substring(0, 2));

                //сравнение по годам, месяцам и дням
                if (y1 != y2) return Integer.compare(y1, y2);
                if (m1 != m2) return Integer.compare(m1, m2);
                return Integer.compare(d1, d2);
        };
        }

        @Test
        void testDateSort()
        {
            String[] dates =
            {
                    "07-05-1990",
                    "28-01-2010",
                    "11-08-1990",
                    "15-01-2010",
                    "16-06-1970"
            };
            String[] expected =
            {
                    "16-06-1970",
                    "07-05-1990",
                    "11-08-1990",
                    "15-01-2010",
                    "28-01-2010"
            };
            Arrays.sort(dates, comparator);
            assertArrayEquals(expected, dates);
        }

}

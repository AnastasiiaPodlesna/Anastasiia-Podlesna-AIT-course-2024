package oddEvenComparator;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer x1, Integer x2)
    {
        // Сравниваем четные и нечетные числа
        if (x1 % 2 == 0 && x2 % 2 != 0)
        {
            return -1; // x1 - четное, x2 - нечетное
        }
        else if (x1 % 2 != 0 && x2 % 2 == 0)
        {
            return 1; // x1 - нечетное, x2 - четное
        }
        else
        {
            return 0; // оба четные или оба нечетные
        }


    }
}

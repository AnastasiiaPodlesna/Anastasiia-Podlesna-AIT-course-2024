package homework.primeNumber;

// Для метода проверки, является ли число простым, написать тест.
// Использовать assert для логических выражений.

import com.sun.source.tree.BreakTree;

public class PrimeNumber
{
    private int numbers;

    public PrimeNumber(int numbers)
    {
        this.numbers = numbers;
    }

    public int getNumbers()
    {
        return numbers;
    }

    public void setNumbers(int numbers)
    {
        this.numbers = numbers;
    }

    public static boolean isPrimeNumber (int number)
    {
        if (number < 2)
        {
            return false;
        }

        for (int i  = 2; i <= Math.sqrt(number); i++)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

}



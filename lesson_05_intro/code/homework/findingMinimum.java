package homework;

// Написать метод, возвращающий минимальное из двух целых чисел. Числа задаются в программе.

public class findingMinimum
{
    public static void main(String[] args)
    {
        int a = 19; int b = 9;

        int min_number = findingMinimumValue(a, b);
        if (min_number != 0)
            System.out.println("The minimum number is " + min_number + " \n");
        else
            System.out.println("The numbers are equal. The minimum number cannot be determined");
    }

    private static int findingMinimumValue(int a, int b)
    {
        int result = 0;

        if (a < b) { result = a; }
        else if (a > b) { result = b; }

        return result;
    }
}
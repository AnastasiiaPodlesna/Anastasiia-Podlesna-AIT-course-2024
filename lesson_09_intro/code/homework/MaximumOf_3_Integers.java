package homework;

//Написать программу, выводящую на экран максимальное из трех целых чисел.
//Числа задайте самостоятельно внутри программы.
//Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.

public class MaximumOf_3_Integers
{
    public static void main(String[] args)
    {
        int a = 5, b = 7, c = -9;
        int max =0;

        if ( (a > b) && (a > c) )
        {
            max = a;
        }
        else
        if ( (b > a) && (b > c) )
        {
            max = b;
        }
        else
        if ( (c > a) && (c > b) )
        {
            max = c;
        }

        System.out.println("The maximum of 3 integers ist: " + max);

        //-----------------------------------------------------------------------------

        max = 0;
        max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The maximum of 3 integers ist: " + max);



    }
}

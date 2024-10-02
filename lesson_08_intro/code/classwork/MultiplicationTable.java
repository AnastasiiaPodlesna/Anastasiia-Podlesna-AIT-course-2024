package classwork;

// Распечатать в консоли таблицу умножения от 1 до 10.

public class MultiplicationTable
{
    public static void main(String[] args)
    {

        int i = 1, j = 1;

        while (i <= 10)
        {
            while (j <= 10)
            {
                System.out.print(i + " x " + j + " = " + i*j + "  | ");
                j++;
            }
            j = 1;
            i++;
            System.out.println(" ");
        }


    }

}

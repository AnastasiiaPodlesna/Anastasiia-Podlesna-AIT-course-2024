package classwork;

//Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.

public class Numbers
{
    public static void main(String[] args)
    {
        int number = 5;

        while (number <= 100)
        {
            System.out.print(number + " ");
            number += 5;
        }
    }
}

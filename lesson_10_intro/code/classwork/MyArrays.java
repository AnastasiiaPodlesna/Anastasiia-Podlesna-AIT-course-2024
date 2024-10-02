package classwork;

// Создайте массив и заполните его целыми числами от 1 до 20.

public class MyArrays
{
    public static void main(String[] args)
    {
        int[] numbers = new int[20]; // length = 20, indexes 0 till 19

        for (int i = 1; i < numbers.length; i++)
        {
            numbers[i] = i;
        }

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i] + " ");
        }

    }
}

package homework;

//Распечатайте все натуральные числа меньшие 200 и кратные 13. Используйте циклы while и do while.

public class NaturalNumbers
{
    public static void main(String[] args)
    {
        int number = 13;
        System.out.println("Using the While cycle: ");

        while (number < 200)
        {
            System.out.print(number + " ");
            number += 13;
        }

        number = 13;
        System.out.println("\nUsing the do While cycle: ");

       do
        {
            System.out.print(number + " ");
            number += 13;
        }
       while (number < 200);


    }
}

package classwork;

//Проверка положительное или отрицательное число

public class UslovnyOperatory {

    public static void main(String[] args)
    {
        int x = 56;

        // неполный условный оператор

        if (x >= 0)
        {
            System.out.println("x = " + x + " is positive number");
        }
        if (x < 0)
        {
            System.out.println(STR."x = \{x} is negative number");
        }

        x = -56;

        // полный условный оператор

        if (x >= 0)
        {
            System.out.println("x = " + x + " is positive number");
        }
        else
        {
            System.out.println("x = " + x + " is negative number");
        }

        //Проверка четное или нечетное целое число

        x = 111;

        if (x % 2 == 0)
        {
            System.out.println("x = " + x + " is even");
        }
        else
        {
            System.out.println("x = " + x + " is odd");
        }







    }











}

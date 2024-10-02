package classwork;

// Доработать калькулятор так, чтобы он продолжал работать после выполнения одного действия с парой чисел.

import java.util.Scanner;

public class Calculator
{
    static int num1, num2, action, result;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean flag = true;

        while (flag)
        {
            System.out.println("continue? y/n");
            char ch = in.next().charAt(0); // take 1st symbol
            if (ch == 'y') {
                System.out.println("Input 1st number or 0 for exit");
                num1 = in.nextInt();
                System.out.println("Input 2st number or for exit");
                num2 = in.nextInt();
                System.out.println("Input action or for exit");
                System.out.println("1 = '+' ");
                System.out.println("2 = '-' ");
                System.out.println("3 = '*' ");
                System.out.println("4 = '/' ");
                System.out.println("5 = '%' ");
                System.out.println("0 = 'Exit' ");

                action = in.nextInt();

                switch (action) {
                    case 1 -> result = sum(num1, num2);
                    case 2 -> result = deduct(num1, num2);
                    case 3 -> result = multiplay(num1, num2);
                    case 4 -> result = division(num1, num2);
                    case 5 -> result = restOfDivision(num1, num2);
                    case 0 -> flag = false;
                    default -> System.out.println("Wrong input...");
                }
                System.out.println("Result = " + result);
                System.out.println(" ");
            }
            else
            {
                flag = false;
            }
        }
    }

    private static int sum (int num1, int num2)
    {
        return num1 + num2;
    }
    private static int deduct (int num1, int num2)
    {
        return num1 - num2;
    }
    private static int multiplay (int num1, int num2)
    {
        return num1 * num2;
    }
    private static int division (int num1, int num2)
    {
        return num1 / num2;
    }
    private static int restOfDivision (int num1, int num2)
    {
        return num1 % num2;
    }

}

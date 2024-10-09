package homework.strings_to_Int;

// Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит
// сумму всех этих введенных чисел. Используйте классы-обёртки для преобразования строк в
// соответствующие примитивы.

import java.util.Scanner;

public class GoStrToInt
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input integers: ");
        String integersLine = scanner.nextLine();

        System.out.println("The sum of the numbers in the string: " + numberAdder(integersLine));
    }

    // метод, выделяющий числа в строке и суммирующий их

    public static int numberAdder(String integersLine)
    {
        String[] str;
        Integer integer = 0;

        str = integersLine.split("[-;+,. /]");  // собираем массив из чисел, с разделителем

        for (int i = 0; i < str.length; i++)
        {
            integer += Integer.parseInt(str[i]);
        }
        return integer;
    }
}

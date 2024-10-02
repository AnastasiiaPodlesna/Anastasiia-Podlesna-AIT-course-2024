package classwork;

//Пользователь вводит с клавиатуры строку.
//Распечатайте каждую букву строки на новой строчке.
//Используйте методы length и charAt() класса String.

import java.util.Scanner;

public class Strings
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = in.nextLine();

        System.out.println(str);

        int l = str.length();  // strings length
        System.out.println(l);
        int i = 0;

        while(i < l)
        {
            System.out.println(str.charAt(i));
            i++;
        }

    }
}

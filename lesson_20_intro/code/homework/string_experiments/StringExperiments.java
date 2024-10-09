package homework.string_experiments;

// Разработайте приложение, которое принимает от пользователя строку (предложение) и выводит:
// количество символов в строке;
// количество символов в верхнем регистре;
// количество цифр в строке;
// количество пробелов в строке (код пробела = 32);
// в зависимости от последнего символа в строке сообщает, какое это предложение:
// повествовательное;
// вопросительное;
// восклицательное.
// Используйте методы класса Character.

import java.util.Scanner;

public class StringExperiments
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String string = scanner.nextLine();
        System.out.println(" ");

        // количество символов в строке
        System.out.println("The sum of the numbers in the string: " + numberOfCharInString(string));
        System.out.println("-------------------------------------------------------------------------");

        // количество символов в верхнем регистре
        System.out.println("The sum of uppercase characters: " + numberOfUppercase(string));
        System.out.println("-------------------------------------------------------------------------");

        // количество цифр в строке
        System.out.println("The sum of digits in the string: " + numberOfDigitsInString(string));
        System.out.println("-------------------------------------------------------------------------");

        // количество пробелов в строке (код пробела = 32)
        System.out.println("The sum of spaces in the string: " + numberOfSpacesInString(string));
        System.out.println("-------------------------------------------------------------------------");

        // в зависимости от последнего символа в строке получаем, какое это предложение:
        // повествовательное; вопросительное; восклицательное.
        System.out.println(ThisSentence(string));
        System.out.println("-------------------------------------------------------------------------");

    }

    private static int numberOfCharInString(String str)
    {
        int sum = 0;

        for (char ch : str.toCharArray())
        {
            if (Character.isDefined(ch)) // => str.length(); проверка является ли символ из набора Unicode
                sum++;
        }
        return sum;
    }

    private static int numberOfUppercase(String str)
    {
        int sum = 0;

        for (char ch : str.toCharArray())
        {
            if (Character.isUpperCase(ch))   // => if (ch >= 'A' && ch <= 'Z'); проверка верхнего регистра
                sum++;
        }
        return sum;
    }

    private static int numberOfDigitsInString(String str)
    {
        int sum = 0;

        for (char ch : str.toCharArray())
        {
            if (Character.isDigit(ch)) // проверка, является ли символ цифрой
                sum++;
        }
        return sum;
    }

    private static int numberOfSpacesInString(String str)
    {
        int sum = 0;

        for (char ch : str.toCharArray())
        {
            if (Character.isSpaceChar(ch)) // сравнение символа с пробелом
                sum++;
        }
        return sum;
    }

    private static String ThisSentence(String str)
    {
        char sentenceIntonation = str.charAt(numberOfCharInString(str)-1); // последний символ строки

        if (Character.valueOf(sentenceIntonation) == '!')
            return "This sentence is exclamation (!)";
        else if (Character.valueOf(sentenceIntonation) == '?')
            return "This sentence is interrogative (?)";
        else if (Character.valueOf(sentenceIntonation) == '.')
            return "This sentence is declarative (.)";
        else return "Sentence intonation is undefined...";
    }
}

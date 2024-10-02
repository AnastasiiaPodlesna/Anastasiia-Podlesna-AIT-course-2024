package homework;

// Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
// Выполнить практикум с этой строкой:
// Распечатать последний символ строки.
// Найти позицию подстроки “Java” в строке.
// Проверить, содержит ли заданная строка подстроку “Java”.
// Заменить все символы “o” на “a”.
// Преобразуйте строку к верхнему регистру.
// Преобразуйте строку к нижнему регистру.
// Вырезать подстроку Java c помощью метода substring().
// Проверить, заканчивается ли строка подстрокой “!!!”.
// Проверить, начинается ли строка подстрокой “I'm proud”.

import javax.xml.transform.Source;

public class StringsMethods
{
    public static void main(String[] args)
    {
        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";

        // Распечатать последний символ строки
        System.out.println(str.charAt(str.length()-1));
        System.out.println("----------------------");

        // Найти позицию подстроки “Java” в строке

        String word = "Java";
        int step = str.indexOf(word);

        while (step != -1)
        {
            System.out.println("Найдена подстрока по индексу: " + step);
            step = str.indexOf(word, step + 1);
        }
        System.out.println("----------------------");

        //Проверить, содержит ли заданная строка подстроку “Java”.

        System.out.println(str.contains("Java"));
        System.out.println("----------------------");

        // Заменить все символы “o” на “a”.

        System.out.println(str.replace('o', 'a'));
        System.out.println("----------------------");

        // Преобразуйте строку к верхнему регистру.

        System.out.println(str.toUpperCase());
        System.out.println("----------------------");

        // Преобразуйте строку к нижнему регистру.

        System.out.println(str.toLowerCase());
        System.out.println("----------------------");

        // Вырезать подстроку Java c помощью метода substring().

        word = "Java";
        step = str.indexOf(word);

        while  (step != -1)
        {
            str = str.substring(0, step) + str.substring(step + word.length());
            step = str.indexOf(word);
        }
        System.out.println(str);
        System.out.println("----------------------");

        // Проверить, заканчивается ли строка подстрокой “!!!”

        if (str.lastIndexOf("!!!") != -1) System.out.println("Yes");
        else System.out.println("No");

        System.out.println("----------------------");

        // Проверить, начинается ли строка подстрокой “I'm proud”.

        word = "I'm proud";

        if (str.indexOf(0, word.length()) != 0) System.out.println("Yes");
        else System.out.println("No");

        System.out.println("----------------------");















    }
}

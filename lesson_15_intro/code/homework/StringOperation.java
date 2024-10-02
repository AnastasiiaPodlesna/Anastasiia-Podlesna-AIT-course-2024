package homework;

// Напишите программу, которая запрашивает строку от пользователя и затем:
// сообщает сколько слов в строке
// сообщает сколько букв (символов) в строке
// печатает строку задом наперед, начиная с последнего слова.

import javax.xml.transform.Source;
import java.util.Scanner;

public class StringOperation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str;
        int sumWords;
        int sumChars;
        System.out.print("Input string: ");
        str = scanner.nextLine();  // задали строку

        String[] words = str.split(" "); // занесли в массив слова разделенные " "
        sumWords = words.length;  // посчитали длину массива (состоящего из слов)
        System.out.println("Numbers of words in sentence: " + sumWords);
        System.out.println("--------------------------------------------------");

        String[] letters = str.split(""); //  все буквы и пробелы разделяет и загоняет в массив
        sumChars = letters.length;
        System.out.println("Numbers of letters in sentence: " + sumChars);
        System.out.println("--------------------------------------------------");

        int i = words.length-1;
        while (i >= 0)
        {
            System.out.print(words[i] + " ");
            i--;
        }














    }
}


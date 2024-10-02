package string_methods;

public class AstringAppl
{
    public static void main(String[] args)
    {
        String str1 = "Hello,";
        char[] chars = {32, 'W', 'o', 'r', 'l', 'd', '!'};  // 32 - код пробела в ASCII
        String str2 = new String(chars);

        System.out.println(str1);
        System.out.println(str2);

        // concat - объединение, склеивание строк

        String str = str1 + str2; // 1 вариант
        System.out.println(str);

        System.out.println(str1.concat(str2)); // 2 вариант

        int l = str.length(); // длина строки

        char ch = str.charAt(0); //  первый символ строки
        System.out.println("First symbol: " + ch);

        ch = str.charAt(str.length()-1); // последний символ
        System.out.println("Last symbol: " + ch);

        for (int i = 0; i < str.length(); i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        // check equals  сравнение строк

        String str3 = " worLD!";
        boolean checker = str3.equals(str2);
        System.out.println(checker);

        // symbol in position

        System.out.println(str);
        int index = str.indexOf("W");
        System.out.println(index); // индекс 7

        index = str.lastIndexOf('W'); // при поиске идем справа на лево

        System.out.println("----------------substring-------------------");
        System.out.println(str.substring(7));  // подстрока
        System.out.println(str.substring(7,10));

        System.out.println("-----------------replace--------------------");
        System.out.println(str.replace("o", "o-o-o-o")); // замена

        System.out.println("-----------------split--------------------");
        String str4 = "I love string in Java";
        String[] words = str4.split(" "); // разделение
        int w = words.length;
        System.out.println("Numbers of words in sentence: " + w);

        // количество букв

        String[] letters = str4.split(""); // просто все буквы и пробелы разделяет и загоняет в массив
        int let = letters.length;
        System.out.println("Numbers of letters in sentence: " + let);

        // Вставьте в строку дату полета Гагарина в виде:
        // "Дата полета Гагарина в космос: число – месяц – год." и напечатайте ее в консоли.
        // Используйте String.format()

        int day = 12;
        String month = "April";
        int year = 1961;

        String gagarinDay = String.format("Дата полета Гагарина в космос: %d - %s - %d", day, month, year);
        System.out.println(gagarinDay);











    }
}

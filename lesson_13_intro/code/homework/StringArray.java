package homework;

// Написать метод, принимающий на вход массив строк. Метод должен вернуть массив,
// состоящий из самой короткой и самой длинной строки изначального массива.
// Создайте массив типа String и заполните его названиями знакомых вам городов.
// Проверьте работу написанного метода на этом массиве.

public class StringArray
{
    public static void main(String[] args)
    {
        String[] cities = {"Berlin", "Dortmund", "Brandenburg", "Dresden", "Hessen", "Köln"};

        System.out.println("\nThe shortest strings: " + citySearch(cities)[0]);
        System.out.println("The longest strings: " + citySearch(cities)[1]);
    }

    private static String[] citySearch(String[] citiesArray)
    {
        String[] tempLength = new String[2];

        tempLength[0] = citiesArray[0]; // самая короткая строка

        for (int i = 1; i < citiesArray.length; i++)
        {
            if (tempLength[0].length() > citiesArray[i].length())
                tempLength[0] = citiesArray[i];
        }

        tempLength[1] = citiesArray[0]; // самая длинная строка

        for (int i = 1; i < citiesArray.length; i++)
        {
            if (tempLength[1].length() < citiesArray[i].length())
                tempLength[1] = citiesArray[i];
        }
        return tempLength;
    }
}

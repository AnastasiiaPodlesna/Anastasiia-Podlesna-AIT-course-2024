package citiesOfGermany;

//  В классе GermanyAppl cоздать LinkedList, содержащий города - столицы земель Германии.
//  Опробовать на нем методы, которые доступны для класса LinkedList. Добавить вольный
//  город Гамбург в начало, в середину списка, в конец списка. Отсортировать список по
//  алфавиту и в обратном порядке.

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GermanyAppl
{
    public static void main(String[] args)
    {
        List<String> citiesOfGermany = new LinkedList<>(); // список городов

        citiesOfGermany.addAll(Arrays.asList("Berlin","München", "Mainz", "Stuttgart", "Dresden", "Düsseldorf"));
        System.out.println("A list of the cities:");
        printList(citiesOfGermany);

        // добавляем Hamburg в начало списка
        citiesOfGermany.add(0,"Hamburg");
        // добавляем Hamburg в конец списка
        citiesOfGermany.add("Hamburg");
        // добавляем Hamburg в середину списка
        citiesOfGermany.add(citiesOfGermany.size() / 2, "Hamburg");

        System.out.println("Add 'Hamburg' to the beginning, to the middle, to the end of the list:");
        printList(citiesOfGermany);

        // сортировка по алфавиту
        System.out.println("Sort the list alphabetically :");
        citiesOfGermany.sort((city1, city2) -> city1.compareTo(city2));
        // citiesOfGermany.sort(Comparator.naturalOrder());   // или так!
        printList(citiesOfGermany);
        System.out.println("---------------------------------------------------------");


        System.out.println("Sort the list in reverse order :");
        citiesOfGermany.sort(Comparator.reverseOrder()); // сортировка в обратном порядке
        printList(citiesOfGermany);
    }

    private static void printList(List<String> cityList)
    {
        for (String city: cityList)
        {
            System.out.print(city + " ");
        }
        System.out.println("\n------------------------------------------------------------------------");
    }
}

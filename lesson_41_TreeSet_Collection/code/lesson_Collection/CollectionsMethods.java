package lesson_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMethods
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("papaya");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("apricot");
        fruits.add("peach");
        fruits.add("pear");
        fruits.add("banana");

        System.out.println("-----------------------------------------------------");
        fruits.forEach(System.out::println);

        System.out.println("-------------------- sorting -------------------------");

        Comparator<String> fruitComparator2 = String::compareTo;
        Collections.sort(fruits, fruitComparator2);
        fruits.forEach(System.out::println);

        System.out.println("------------------ sorting reverse ----------------");

        Comparator<String> fruitComparator = new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                return -o1.compareTo(o2);
            }
        };

        Collections.sort(fruits, fruitComparator);
        fruits.forEach(System.out::println);

        System.out.println("------------------ max --------------------");
        System.out.println(Collections.max(fruits));

        Collections.reverse(fruits);
        fruits.forEach(System.out::println);

        System.out.println("------------------ shuffle --------------------");
        Collections.shuffle(fruits);
        fruits.forEach(System.out::println);
    }
}

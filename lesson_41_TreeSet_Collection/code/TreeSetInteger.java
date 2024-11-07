import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetInteger
{
    public static void main(String[] args)
    {
        List<Integer> num = new ArrayList<>(Arrays.asList(10, 20, 30, -80, -230, 0));
        TreeSet<Integer> number = new TreeSet<>(num);

        System.out.println(number);
        System.out.println(number.size());

        number.add(13);
        number.add(100500);

        System.out.println(number);
        System.out.println(number.size());

        for (Integer n : number)
        {

            System.out.println(n + " ");
        }

        System.out.println(number.first()); // -230
        System.out.println(number.last());  // 100500

        System.out.println(number.ceiling(0)); // "потолок" - минимальное число >= указанного, которое еть во множестве
        System.out.println(number.contains(5)); // false
        System.out.println(number.floor(5)); // наибольшее число в коллекции, которое <= > заданному значению (похожее на округление вниз) = 0

        System.out.println(number.tailSet(5)); // 10, 13, 20,....
      //  System.out.println(number.subSet(-50, 30)); // [0, 10, 13, 20]
        System.out.println(number.subSet(-50, true, 30, true)); // [0, 10, 13, 20]




    }





}

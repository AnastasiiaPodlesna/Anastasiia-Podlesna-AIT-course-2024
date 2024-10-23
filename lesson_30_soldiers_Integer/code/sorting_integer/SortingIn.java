package sorting_integer;

import java.util.Arrays;

public class SortingIn
{
    public static void main(String[] args)
    {
        Integer[] numbers = {-100, 2, Integer.MAX_VALUE, 2, 15, 35, Integer.MIN_VALUE, 71};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // отсортировали массив от меньшего к большему

        Arrays.sort(numbers, (n1, n2) -> Integer.compare(n2, n1));
        System.out.println(Arrays.toString(numbers)); // отсортировали массив наоборот

      for (Integer step: numbers)
      {
          System.out.print(step + " ");
      }




    }
}

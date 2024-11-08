package map_examples.homework;

// В классе DigitsFreqApp сгенерировать один миллион положительных целых чисел в интервале от 100 до 1000, и подсчитать частоту встречаемости цифр в этих числах.

import java.util.*;

public class DigitsFreqApp
{
    private static int sum;
    public static void main(String[] args)
    {
        Random random = new Random();
        List<Integer> positiveIntegers = new ArrayList<>();
        Map<Integer, Integer> positiveIntegersMap = new HashMap<>();

        for (int i = 0; i < 1_000_000; i++)
        {
            positiveIntegers.add(random.nextInt(100, 1001));
            //System.out.print(positiveIntegers.get(i) + " ");
        }

        for (int i : positiveIntegers)
        {
            positiveIntegersMap.put(i, positiveIntegersMap.getOrDefault(i,0) + 1);
        }

        positiveIntegersMap.forEach((i, number) ->
        {
            System.out.println(String.format("Digit '%d' repeated %d times", i, number));
            sum += positiveIntegersMap.getOrDefault(i, 0);
        });

        System.out.println("----------------------------------------");
        System.out.println("Total sum of positive integers is " + sum);
    }
}

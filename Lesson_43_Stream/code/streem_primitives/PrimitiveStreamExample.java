package streem_primitives;

// Стримы примитивов Integer, Long, Double
//- получить случайные целые числа в интервале от min = 1, до max = 10 в нужном количестве
//- получение простейших статистических данных с помощью summaryStatistics
//- моделирование лотереи 6 из 49

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;

public class PrimitiveStreamExample
{
    private static final int MIN = 1;
    private static final int MAX = 10;
    private static final int N_Numbers = 20;

    public static void main(String[] args)
    {
        Stream<Integer> numbers = getRandomNumber(MIN, MAX + 1, N_Numbers);
       // numbers.forEach(System.out::println);
      //  numbers.forEach(n -> System.out.print(n + " "));
      //  numbers.forEach(number ->
      //          System.out.print(String.format(" %d", number)));

        System.out.println("------------------- sum of numbers -------------------------");
        int sum = numbers
                .mapToInt(Integer::intValue)
                .sum();

        System.out.print("Sum = " + sum);

        System.out.println("------------------- SummaryStatistics -------------------------");
        IntSummaryStatistics intSummaryStatistics = getRandomNumber(MIN, MAX, N_Numbers)
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Min value: " + intSummaryStatistics.getMin());
        System.out.println("Max value: " + intSummaryStatistics.getMax());
        System.out.println("Count: " + intSummaryStatistics.getCount());
        System.out.println("Sum: " + intSummaryStatistics.getSum());

        System.out.println("-------------- моделирование лотереи 6 из 49 ----------------");
        Stream<Integer> lotteryNumbers = getRandomNumber(1, 50, 6)
                .distinct()
                .limit(6);

        lotteryNumbers.forEach(System.out::println);

    }

    private static Stream<Integer> getRandomNumber(int min, int max, int nNumbers)
    {
        return new Random().ints(nNumbers, min, max).boxed();
    }


//    Методы .ints(), .doubles(), и аналогичные в классе java.util.Random используются для генерации потоков случайных чисел различных типов, таких как int, double, и long. Эти методы полезны для получения последовательностей случайных чисел, которые можно обработать как потоки (Stream), что особенно удобно для работы с большими наборами данных.


}

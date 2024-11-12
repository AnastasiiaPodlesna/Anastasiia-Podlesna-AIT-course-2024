package homework.EntireNumbers;

// Имеется набор целых чисел: 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20.
// Требуется из этого списка отобрать только простые числа. Используйте методы stream()

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class EntireNumbers
{
    public static void main(String[] args)
    {
        List<Integer> entireNumbers = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> simpleNumbers = entireNumbers.stream()
                .filter(EntireNumbers::isPrime)
               // .collect(Collectors.toList());
                  .toList();

        // Выводим простые числа
        System.out.println("Simple numbers: " + simpleNumbers);
    }

    static boolean isPrime(int number)
    {
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number))// создает поток чисел от 2 до квадратного корня числа number
                .noneMatch(n -> (number % n == 0)); // проверяет, если ни одно число в потоке не делит number нацело, то число считается простым.
    }

}

package homework;

// Заполните структуру типа ArrayList 20-ю случайными целыми числами в интервале от 1 до 10. Удалите из полученного списка дубликаты.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomListNumberApll
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbersList = new ArrayList<>();
        Random random = new Random();

        // заполнение списка 20-ю случайными числами от 1 до 10
        for (int i = 0; i < 20; i++)
        {
            int number = random.nextInt(11);
            numbersList.add(number); // добавляем в наш лист числа
        }

        // удаление дубликатов
        HashSet<Integer> numSet = new HashSet<>(numbersList);
        ArrayList<Integer> numList = new ArrayList<>(numSet);

        System.out.println("Original List: " + numbersList); // было
        System.out.println("Unique List: " + numList);  // стало
    }

}

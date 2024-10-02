package homework;

// У стрелка есть 10 попыток поразить мишень. Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
// Ответьте на вопрос, сколько очков набрал стрелок? Попал ли он хоть раз в центр мишени?

import java.util.Random;

public class Shooter
{
    public static void main(String[] args)  // 10 - прямое попадание, 0 - мимо
    {
        Random random = new Random();
        int[] array = new int[10];
        int points = 0;
        int targetHit = 0;

        System.out.print("\n10 shots using a random number sensor: ");

        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(10) + 1;  // заполняем массив результатами выстрелов
            System.out.print(array[i] + " ");
            points = points + array[i];                // считаем очки

            if (array[i] == 10)  targetHit++;          // считаем кол-во попаданий в центр мишени
        }

        System.out.printf("\nThe shooter scored: %d points", points);
        System.out.printf("\nHits in the center of the target: %d\n", targetHit);




    }
}

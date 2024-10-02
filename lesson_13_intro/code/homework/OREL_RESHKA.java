package homework;

//  Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел и сколько решка.
//  Запишите результаты в массив. Рассчитайте вероятность выпадения орла и решки.
//  1 - орел, 0 - решка

import java.util.Random;

public class OREL_RESHKA
{
    public static void main(String[] args)
    {

        int[] headsOrTails = new int[100];
        Random random = new Random();
        int heads = 0, tails = 0;

        for (int i = 0; i < headsOrTails.length; i++)
        {
            headsOrTails[i] = random.nextInt(2);
            System.out.print(headsOrTails[i] + " ");
            if (headsOrTails [i] == 0) heads ++;
            else tails++;
        }
        System.out.println("\nThe Heads has lands: " + heads + ", the Tails has lands:: " + tails);
        System.out.println("Probability of landing on heads: " + heads +"%");
        System.out.println("Probability of landing on tails: " + tails +"%");

    }
}

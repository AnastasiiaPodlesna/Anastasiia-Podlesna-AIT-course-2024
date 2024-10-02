package classwork;

import java.util.Random;

public class Dice
{
    public static void main(String[] args)
    {
        int[] toss = new int[20];
        Random random = new Random();

        for (int i = 0; i < toss.length; i++)
        {
            int n = random.nextInt(6) + 1;
            toss[i] = n;
            System.out.print(n + " ");
        }
        System.out.println();

        int sum = 0;

        for (int j = 1; j <= 6; j++)
        {
            for (int i = 0; i < toss.length; i++)
        {
            if (toss[i] == j) sum ++;
        }
            System.out.println(j + " = " + sum);
            sum = 0;
        }
    }
}

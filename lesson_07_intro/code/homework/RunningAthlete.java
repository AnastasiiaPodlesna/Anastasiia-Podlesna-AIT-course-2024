package homework;

//В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 %
// от предыдущего значения. Определите номер того дня, на который пробег спортсмена составит
// не менее target километров. Программа получает на вход действительные числа s и target и должна
// вывести одно натуральное число.

import java.util.Scanner;

public class RunningAthlete
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many kilometers did the athlete run on the 1st day?");
        double minKilometers = in.nextDouble();
        System.out.println("How many kilometers did the athlete run ?");
        double maxKilometers = in.nextDouble();


        int dayCount = 1;

        while (minKilometers < maxKilometers)
        {
            dayCount++;
            minKilometers = minKilometers + minKilometers * 0.1;
        }

        System.out.printf("In %s days, the athlete will run %.2f", dayCount, minKilometers);





    }
}

package classwork;

//Рассчитайте величину скидки и стоимость покупки с учетом скидки по следующим правилам:
//сумма покупки до 100 евро - скидка 0%
//сумма покупки от 101 евро до 200 евро - скидка 2%
//сумма покупки от 201 евро до 500 евро - скидка 5%
//сумма покупки от 501 евро до 1000 евро - скидка 10%
//сумма покупки от более 1000 евро - скидка 20%
//Сумма покупки вводится с клавиатуры

import java.util.Scanner;

public class Shopping
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input amount of purchase:  ");
        double sum  = in.nextDouble();

        double discount = 0;

        if (sum > 0 && sum <= 100)
        {
            discount = 0;

        }
        else if (sum > 100 && sum <= 200)
        {
            discount = 0.02;
        }
        else if (sum > 200 && sum <= 500)
        {
            discount = 0.05;
        }
        else if (sum > 500 && sum <= 1000)
        {
            discount = 0.1;
        }
        else if (sum > 1000)
        {
            discount = 0.2;
        }
        System.out.println("discount is " + discount);

    }
}

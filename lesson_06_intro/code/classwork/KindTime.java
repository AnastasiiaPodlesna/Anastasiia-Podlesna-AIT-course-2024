package classwork;

//Родители позволяют ребенку играть на компьютере 1 час.
//Напишите программу, которая будет реагировать на полученную в школе оценку:
//1. "Молодец!", время для игр на компьютере увеличивается на 30 мин.
//2. "Хорошо", ты можешь играть на компьютере обычные 60 минут.
//3. "Посредственно.", время для игр уменьшается на 30 мин.
//4. "Плохо!", сегодня никаких игр на компьютере.
//5. "Позор семьи!", никаких игр на компьютере 2 дня.

import java.util.Scanner;

public class KindTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Which mark did you got today (1 ,2, 3, 4, 5)?");
        int mark = in.nextInt();

        result (mark);
    }

    private static void result (int mark)
    {
        int timeForGame = 60;
        switch (mark)
        {
            case 1:
            {
                System.out.println("Good job!");
                timeForGame = timeForGame + 30;
                System.out.println("Time for Game: " + timeForGame);
                break;
            }
            case 2:
            {
                System.out.println("Good!");
                System.out.println("Time for Game: " + timeForGame);
                break;
            }
            case 3:
            {
                System.out.println("Okay...");
                timeForGame = timeForGame - 30;
                System.out.println("Time for Game: " + timeForGame);
                break;
            }
            case 4:
            {
                System.out.println("Very bad!");
                timeForGame = 0;
                System.out.println("No game today!");
                break;
            }
            case 5:
            {
                System.out.println("Shame on you!");
                timeForGame = 0;
                System.out.println("Two days no game!");
                break;
            }
            default:
            {
                System.out.println("Wrong input!");
            }
        }
    }
}

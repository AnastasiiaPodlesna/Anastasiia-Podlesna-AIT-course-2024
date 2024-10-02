package homework;

//Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
//упаковки в желтый бак
//пищевые отходы в коричневый бак
//бумага в зеленый бак
//прочие отходы в черный бак
// Используйте цифры для кодирования вариантов действий.

import java.util.Scanner;

public class GarbageSorting
{
    public static void main(String[] args)
    {
        boolean flag = true;

        while (flag)
        {
            System.out.println("\nHi, I'm the bot Constantine! I'll be helping you throw your trash in different colored bins!");
            System.out.println("Select the type of trash by entering the trash number (1-4):");
            System.out.println("packaging(1), food waste(2), paper(3), other waste(4), Exit(0) ");
            Scanner in = new Scanner(System.in);

            switch (in.nextInt())
            {
                case 1 -> System.out.println("Put the packaging in the yellow garbage can!");
                case 2 -> System.out.println("Put the food waste in the yellow garbage can!");
                case 3 -> System.out.println("Put the paper in the yellow garbage can!");
                case 4 -> System.out.println("Put the other waste in the yellow garbage can!");
                case 0 ->
                {
                    System.out.println("Planet Earth is grateful to you! Bye!");
                    flag = false;
                }

            }
        }




    }
}

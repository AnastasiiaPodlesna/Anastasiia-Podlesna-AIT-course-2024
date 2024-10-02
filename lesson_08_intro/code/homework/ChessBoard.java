package homework;

//Напечатайте на экране шахматную доску размером 8х8.
// 0 - белая клеточка, 1 - черная.
// Левая верхняя клеточка должна быть 0, левая нижняя - 1.

public class ChessBoard
{
    public static void main(String[] args)
    {

        // вариант 1  :-)

            String str1 = "0 1 0 1 0 1 0 1";
            String str2 = "1 0 1 0 1 0 1 0";
            int i = 1; int j;

        System.out.println("_________________");
             while (i <= 4)
             {
                 System.out.println("|" + str1 + "|");
                 System.out.println("|" + str2 + "|");
                 i++;
             }
        System.out.println("-----------------");

//---------------------------------------------------------------------------------------------------
        // вариант 2

        int whiteCell = 0, blackCell = 1;
        i = 1; j = 1;

        System.out.println("_________________________________");
        while (i <= 8)
        {
            System.out.print("| ");
            if ( (i & 1) == 0)
            {
                while (j <= 4)
                {
                   System.out.print(blackCell + " | " + whiteCell + " | ");
                   j++;
                }
            }
            else
            {
                while (j <= 4)
                {
                    System.out.print(whiteCell + " | " + blackCell + " | ");
                    j++;
                }
            }
            System.out.println();
            i++;
            j=1;
        }
        System.out.println("---------------------------------");







    }
}

package homework;

// Вводится шестизначное число (номер автобусного билета).
// Определите, является ли этот билет "счастливым"
// (сумма первых трех цифр равна сумме трех последних цифр).

import java.util.Scanner;

public class sixDigitNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a six-digit number (bus ticket number): ");
        int ticket = in.nextInt();             // считываем номер билета

        int characterCountLeft = 0;            // счетчик цифр слева
        int characterCountRight = 0;           // счетчик цифр справа
        int strLength;                         // длина строки

        strLength = String.valueOf(ticket).length();  // находим количество цифр в номере билета, преобразовав в строку

        if (strLength == 6)
        {
            strLength = 1;

            while (strLength <= 3)
            {
                characterCountRight = characterCountRight + ticket % 10;
                ticket = ticket / 10;
                strLength++;
            }
            while (strLength <= 6)
            {
                characterCountLeft = characterCountLeft + ticket % 10;
                ticket = ticket / 10;
                strLength++;
            }

            System.out.println("The sum of the three digits on the ticket to the left: " + characterCountLeft);
            System.out.println("The sum of the three digits on the ticket to the right: " + characterCountRight);

            if (characterCountLeft == characterCountRight)
                System.out.println("This ticket is a lucky ticket!");
            else System.out.println("This ticket is not a lucky ticket!");
        }
        else System.out.println("Input the correct ticket number...");

    }

}

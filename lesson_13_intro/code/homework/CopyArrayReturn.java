package homework;

// Написать метод copyOfArray. Метод принимает на вход массив целых чисел и целое число -
// длину нового массива newLength. Метод должен создать новый массив длиной newLength.
// В новый массив должны быть скопированы элементы из входящего массива:
// Пример: Исходный массив: {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

import java.util.Random;
import java.util.Scanner;

public class CopyArrayReturn
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("\nInput the length of the starting array of integers: ");
        int startingLength = scanner.nextInt();
        int[] startingArray = new int[startingLength];
        int newLength;

        System.out.print("Starting array: ");
        for (int i = 0; i < startingArray.length; i++)
        {
            startingArray[i] = random.nextInt(31);
            System.out.print(startingArray[i]);
            if (i < startingArray.length - 1) System.out.print(", ");
        }

        System.out.print("\nInput the length of the new array of integers: ");
        newLength = scanner.nextInt();
        System.out.print("New array: ");
        for (int i = 0; i < newLength; i++)
        {
            System.out.print(copyOfArray(startingArray, newLength)[i]);
            if (i < newLength - 1) System.out.print(", ");
        }

    }

    private static int[] copyOfArray(int[] startingArray, int newLength)
    {
        int[] newArray = new int[newLength];

        for (int i = 0; i < newArray.length ; i++)
        {
            newArray[i] = startingArray[i];
        }
        return newArray;
    }
}

package classwork.array_methods;

import java.util.Random;
import java.util.Scanner;

public class ArrayMethodApp
{
    public static void main(String[] args)
    {

        // разворот массива

        int[] newArray = ArrayMethods.fillArray(1, 20, 6);

        ArrayMethods.printArray(newArray);

        ArrayMethods.reverseArray(newArray);

        ArrayMethods.printArray(newArray);



        // пузырьковый метод

        int[] myArray = ArrayMethods.fillArray(0,100,10);

        ArrayMethods.printArray(myArray);

        ArrayMethods.bubbleSort(myArray);

        ArrayMethods.printArray(myArray);



// --------------------------------------------------------------------------------------

//        int[] myArray = {10, 20, 30, 40, 50};
//        System.out.println(ArrayMethods.linearSearch(myArray, 20));

    //------------------------------------------------------------------------------------------

        int index = ArrayMethods.binarySearch(myArray, 20);
        System.out.println("---------------------------------------------------------");
        System.out.println(index);


        ArrayMethods.printArray(myArray);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for searching: ");
        int n = scanner.nextInt();
        boolean isInArray = ArrayMethods.searchInArray(myArray, n);
        System.out.println("Number " + n + "is in array: " + isInArray);

        //-----------------------------------------------------------------------
        System.out.println(" ");

        System.out.print("input percent: "); // возвращаем остатки на счетах с начисленными X процентами
        int x = scanner.nextInt();
        Random random = new Random();
        double[] accountBalances = new double[10];
        System.out.println("Account balances: ");
        for (int i = 0; i < accountBalances.length; i++)
        {
           accountBalances[i] = random.nextDouble(800);
           System.out.printf("%.2f", accountBalances[i]);
           if (i < accountBalances.length - 1) System.out.print(" | ");
        }
        System.out.println("\nPlus " + x + " percent: ");
        double[] arrayWithPercent = ArrayMethods.calculatePercent(accountBalances,x);
        for (int i = 0; i < arrayWithPercent.length; i++)
        {
            System.out.printf("%.2f", arrayWithPercent[i]);
            if (i < arrayWithPercent.length - 1) System.out.print(" | ");
        }

        //-------------------------------------------------------------------------------------

        System.out.println(" ");
        System.out.println(" ");

        for (int i = 0; i < myArray.length; i++)  // сумма элементов массива
        {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\nSum of array elements: " + ArrayMethods.sumArray(myArray));

        //-------------------------------------------------------------------------------------

        System.out.println(" ");

        for (int i = 0; i < accountBalances.length; i++)  // среднее арифметическое
        {
            System.out.printf("%.2f ", accountBalances[i]);
        }
        System.out.printf("\nAverage Value: %.2f", ArrayMethods.averageValue(accountBalances));

    }
}

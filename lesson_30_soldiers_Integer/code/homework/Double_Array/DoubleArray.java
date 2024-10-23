package homework.Double_Array;

import java.util.Arrays;

public class DoubleArray
{
    public static void main(String[] args)
    {
        Double[] realNumbers = new Double[10];

        for (int i = 0; i < realNumbers.length; i++)
        {
            realNumbers[i] = Math.random() * 100;
        }
        System.out.println("----------------- Print as is ------------------------");
        printArray(realNumbers);

        // sorting ascending
        Arrays.sort(realNumbers);
        System.out.println("------------ Print after sorting ascending --------------");
        printArray(realNumbers);

        // sorting descending
        Arrays.sort(realNumbers, (x1, x2) -> Double.compare(x2, x1));
        System.out.println("------------ Print after sorting descending --------------");
        printArray(realNumbers);
    }

    public static void printArray(Double[] array)
        {
        for (Double number : array)
        {
            System.out.printf("%.2f ", number);
        }
        System.out.println();
    }

}


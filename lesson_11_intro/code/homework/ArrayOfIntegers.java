package homework;

// Написать метод, принимающий массив целых чисел, и возвращающий среднее арифметическое всех
// его элементов. Проверьте его работу на массиве
// ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

public class ArrayOfIntegers
{
    public static void main(String[] args)
    {
        int[] ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

        double arithmetic_mean = arithmeticMean(ageOfGroup);

        System.out.printf("Arithmetic mean of all elements is %.2f", arithmetic_mean);
    }

    private static double arithmeticMean(int[] geOfGroup)
    {
        double count = 0;

        for (int i = 0; i < geOfGroup.length; i++)
        {
            count = count + geOfGroup[i];
        }
        return count / geOfGroup.length;
    }

}

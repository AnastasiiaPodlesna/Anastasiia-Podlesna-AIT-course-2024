package classwork;

// Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
// Реализуйте метод, который получает на вход исходный массив и возвращает массив,
// содержащий только положительные числа из исходного массива.

public class PositiveNumbers
{
    public static void main(String[] args) {
        int[] numbers = ArrayMethods.fillArray(-100, 100, 20);
        ArrayMethods.printArray(numbers);
        int positive = countPositiveNumbers(numbers);

        System.out.println("Positive numbers in array: " + positive);


        int[] newArray = new int[positive];

        for (int i = 0, j = 0; i < numbers.length; i++)
        {
            if (numbers[i] >= 0)
            {
                newArray[j] = numbers[i];
                j++;
            }
        }

        ArrayMethods.printArray(newArray);
    }
        public static int countPositiveNumbers(int[] array)
        {
            int count = 0;
            for (int i = 0; i < array.length; i++)
            {
                if (array[i] > 0) count++;
            }
            return count;
        }


}

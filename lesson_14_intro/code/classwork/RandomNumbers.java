package classwork;

public class RandomNumbers

{

// Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
// Выполните сортировку полученного массива.
// Попало ли число 0 в этот массив? (выяснить с помощью binary search)
// Если да, то на какое место (индекс) в массиве?
// Если нет, то на какой индекс его следует поставить?

public static void main(String[] args)
{

    int[] numbers = new int[20];
    numbers =ArrayMethods.fillArray(-100, 100, 20);

    ArrayMethods.printArray(numbers);
    ArrayMethods.bubbleSort(numbers);
    ArrayMethods.printArray(numbers);

    int index = ArrayMethods.binarySearch(numbers, 0);

    index = (index > 0) ? index: -index -1;
    System.out.println(index);
}

}


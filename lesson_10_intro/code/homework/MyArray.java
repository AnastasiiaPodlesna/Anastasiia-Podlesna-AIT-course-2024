package homework;

//Заполнить массив четными числами от 0 до 50.
// Распечатать массив в порядке возрастания, затем в порядке убывания.

public class MyArray
{
    public static void main(String[] args)
    {
        int [] array = new int[26];

        for (int i = 0, j =0; i <= 50; i++)
        {
            if (i % 2 == 0)
            {
               array[j] = i;
               j++;

            }
        }

        for (int i = 0; i < array.length; i++)  // ↑
        {
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");

        for (int i = array.length-1; i >= 0; i--) // ↓
        {
           System.out.print(array[i] + " ");
        }

    }

}

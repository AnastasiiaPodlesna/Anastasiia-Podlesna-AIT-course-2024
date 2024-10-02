package classwork;

//Возведите 3 в степень 10, выведите на печать все промежуточные результаты.

public class Power
{
    public static void main(String[] args)
    {
        // int pow = (int) Math.pow(3,10);

        int count = 0;
        int res = 1;

        while (count < 10)
        {
            res = res * 3;
            count++;
            System.out.println(res + " = 3 in power" + count);
        }



    }
}

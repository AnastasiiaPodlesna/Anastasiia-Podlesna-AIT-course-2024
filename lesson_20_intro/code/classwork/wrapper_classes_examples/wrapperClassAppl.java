package classwork.wrapper_classes_examples;

import java.math.BigInteger;

public class wrapperClassAppl
{
    public static void main(String[] args)
    {
        int k = 1234567890;
        System.out.println(k);
        System.out.println("----------------------------------------------------");

        Integer integer = Integer.parseInt("1234567890");
        System.out.println(integer);
        integer = integer + 15;
        System.out.println(integer);

        int value1=123;
        Integer a = new Integer(value1);
        System.out.println(value1);
        System.out.println("----------------------------------------------------");

        // автоупаковка

        Integer x = 5;
        System.out.println(x * 10);
        
        // автораспаковка

        integer = 7;
        int z = x + integer;
        System.out.println(z);
        System.out.println("----------------------------------------------------");

        BigInteger myBigInt = new BigInteger("12345678901234567890");
        System.out.println(myBigInt);

         // количество цифр в числе
         int b = 1234567890;
         Integer bInt = b;
         // смена типа
        String str = bInt.toString();
        int l = str.length();
        System.out.println("Number: " + b + " contains " + l + " digits.");
        System.out.println("----------------------------------------------------");
        System.out.println("Max value of int: " + bInt.MAX_VALUE);
        System.out.println("Min value of int: " + bInt.MIN_VALUE);

        Double d = 0.0;
        System.out.println("Max value of double: " + d.MAX_VALUE);
        System.out.println("Max value of double: " + d.MIN_VALUE);
        System.out.println("----------------------------------------------------");

        int n = 20;
        Integer m = 10;

        m = m + n;
        System.out.println(m);

        n = n + m;
        System.out.println(n);

        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.printf("Length of corcle: %.2f", circleLength);
        System.out.println("\n----------------------------------------------------");

        // NaN и Infinite

        double p = 20 / 0.0;    // аналогично 

        if (Double.isNaN(p) || Double.isInfinite(p))
            System.out.println("Wrong operation dividion by Zero");
        else System.out.println(p);
        System.out.println("----------------------------------------------------");

        // перевод String в число

        String str1 = "0098765432100";
        long num = Long.parseLong(str1);
        System.out.println(num);








        

    }
}

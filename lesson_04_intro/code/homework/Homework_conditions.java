package homework;

public class Homework_conditions
{

    public static void main(String[] args)
    {
    int a;
    int b;
    int c;


        // 1. Поиск минимального числа

        a = 15; b = 19;

        int min_number =  findingMinimumValue(a, b);
        if (min_number != 0)
            System.out.println("The minimum number is  " + min_number + " \n");
        else
            System.out.println("The numbers are equal. The minimum number cannot be determined");


        // 2. Проверка выполнимости неравенства треугольника

        a = 3; b = 5; c = 7;

        boolean truFalse = checkingTriangleInequality(a,b,c);
        if (truFalse) System.out.println("the triangle inequality holds...\n");
        else System.out.println("The triangle inequality does not hold...\n");

        // 3. Расчет покупки товаров со скидками

// Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
// Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро,
// то полагается дополнительная скидка 5%. Вычислите итоговую стоимость покупки и
// величину полученной скидки.

        int item_Qty_1 = 10; int price_item_1 = 4; int item_disc_1 = 15;
        int item_Qty_2 = 15; int price_item_2 = 7; int item_disc_2 = 10;

        double total_price;      // общая стоимость покупки (со скидками на товары, без дополнительной скидки)
        double total_price_end;  // общая стоимость покупки (с учетом всех скидок)
        double Discount;

        double total_price_1 = totalPurchasePricePlusDiscount(item_Qty_1, price_item_1, item_disc_1);
        System.out.println("Стоимость покупки первого товара, с учетом скидки, составила " + total_price_1 + " Евро");

        double total_price_2 = totalPurchasePricePlusDiscount(item_Qty_2, price_item_2, item_disc_2);
        System.out.println("Стоимость покупки второго товара, с учетом скидки, составила " + total_price_2 + " Евро\n");

        total_price = total_price_1 + total_price_2; // Общая стоимость покупки без дополн. скидки
        System.out.println("Общая стоимость Вашей покупки составила: " + total_price + " Евро");

        if (total_price > 100)
        {
            System.out.println("значит Вам полагается дополнительная скидка 5% !");
            total_price_end = (double) Math.round(total_price * 0.95 * 100) / 100;
        }
        else total_price_end = total_price;

        System.out.println("Стоимость Вашего заказа с учетом всех скидок составила: " + total_price_end + " Евро");
        Discount = totalPurchasePricePlusDiscount(item_Qty_1, price_item_1, 0) + totalPurchasePricePlusDiscount(item_Qty_2, price_item_2, 0) - total_price_end;
        System.out.println("Общая скидка составила: " + Math.round(Discount * 100) / 100 + " Евро\n");

        // 4. Конвертация валюты евро в другие

        double course_euro_dollar = 1.11;
        double course_euro_britishPounds = 0.84;
        double course_euro_chineseYuan = 7.86;
        double total_euro = 450;

        double currency1 = currencyExchange(total_euro, course_euro_dollar);
        System.out.println("Exchange:" + total_euro + " euro = " + Math.round(currency1 * 100) / 100 + " dollars");

        double currency2 = currencyExchange(total_euro, course_euro_britishPounds);
        System.out.println("Exchange:" + total_euro + " euro = " + Math.round(currency2 * 100) / 100 + " british pounds");

        double currency3 = currencyExchange(total_euro, course_euro_chineseYuan);
        System.out.println("Exchange:" + total_euro + " euro = " + Math.round(currency3* 100) / 100 + " chinese yuan\n");

        // 5. Перевод градусов Цельсия в градусы по Фаренгейту

        double degrees_Celsius = 40;

        double degrees_Fahrenheit = degreeConversion(degrees_Celsius);
        System.out.println(degrees_Celsius + " degrees Celsius is " + degrees_Fahrenheit + " degrees Fahringet\n");

        // 6. Пересчет морских миль в километры. 1 морская миля = 1852 метра.

        double nautical_miles = 1400;

        double kilometers = distanceConversion(nautical_miles);
        System.out.println(nautical_miles + " nautical miles is " + kilometers + " kilometers\n");
    }


    // 1. Метод поиска минимального числа
    private static int findingMinimumValue(int a, int b)
    {
        int result = 0;

        if (a < b) result = a;
        else if (a > b) result = b;
        return result;
    }

    // 2. Метод выдает True/False, проверка на выполнимость неравенства треугольника
    private static boolean checkingTriangleInequality(int a, int b, int c)
    {
        return (a < (b + c)) && (b <  (a + c)) && (c < (a + b));
    }

    // 3. Метод выдает общую стоимость товара с учетом скидки
    private static double totalPurchasePricePlusDiscount (int item_Qty, int price_item, int item_disc)
    {
        return (double) (item_Qty * price_item * (100 - item_disc)) / 100;
    }

    // 4. Метод обмена валюты
    private static double currencyExchange(double total, double course)
    {
        return total * course;
    }

    // 5. Метод, который переводит градусы Цельсия в градусы по Фаренгейту

    private static double degreeConversion(double degree)
    {
        return degree * 1.8 + 32;
    }

    // 6. Метод, который пересчитывает морские мили в километры.

    private static double distanceConversion(double distance)
    {
        return distance * 1852 / 1000;
    }



}

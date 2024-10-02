package homework;

//Сделайте расчет покупки товаров со скидками.
//Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
//Клиент взял N товаров A и M товаров B.
//Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
//Вычислите итоговую стоимость покупки и величину полученной скидки.

public class CalculatePurchaseDiscountedItems
{
    public static void main(String[] args)
    {
        int item_Qty_1 = 10; int price_item_1 = 4; int item_disc_1 = 15; // информация по первому товару
        int item_Qty_2 = 15; int price_item_2 = 7; int item_disc_2 = 10; // информация по второму товару

        double total_price;      // общая стоимость покупки, без учета дополнительной скидки
        double total_price_end;  // общая стоимость покупки с учетом всех скидок
        double Discount;         // общая скидка

        double total_price_1 = totalPurchasePricePlusDiscount(item_Qty_1, price_item_1, item_disc_1);
        System.out.println("Стоимость покупки первого товара, с учетом скидки, составила " + total_price_1 + " Евро");

        double total_price_2 = totalPurchasePricePlusDiscount(item_Qty_2, price_item_2, item_disc_2);
        System.out.println("Стоимость покупки второго товара, с учетом скидки, составила " + total_price_2 + " Евро\n");

        total_price = total_price_1 + total_price_2; // Общая стоимость покупки без дополнительной скидки
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
    }

    private static double totalPurchasePricePlusDiscount (int item_Qty, int price_item, int item_disc)
    {
        return (double) (item_Qty * price_item * (100 - item_disc) / 100);
    }

}

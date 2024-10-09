package homework.Product;

import homework.Product.model.Food;
import homework.Product.model.MeatFood;
import homework.Product.model.MilkFood;
import homework.Product.model.Product;

import java.util.Scanner;

public class MarketAppl
{
    public static void main(String[] args) {
        // создаем массив с продуктами

        Product[] products = new Product[5];
        products[0] = new Product(2.00, "cream", 1000L);
        products[1] = new Food(2.40, "butter", 1002L, "09.10.2024");
        products[2] = new MilkFood(2.70, "cheese", 1003L, "29.10.2024", "lactose-free", 40.00);
        products[3] = new MeatFood(17.50, "sausage", 1004L, "01.11.2024", "young goat's meat");
        products[4] = new MeatFood(17.50, "sausage", 1004L, "01.11.2024", "young goat's meat");


        System.out.println("------------------------------------------------------------------------");

        // метод печати всех продуктов

        printProdukts(products);

        System.out.println("------------------------------------------------------------------------");

        // метод расчета суммы цен всех продуктов

        System.out.println("Total price = " + getTotalPrice(products));

        System.out.println("------------------------------------------------------------------------");

        // метод сравнения всех продуктов

        compareProducts(products);

        System.out.println("\n----------------------------------------------------------------------");

        // метод проверки на пищевитость продукта :)

        nonFoodProducts(products);

        System.out.println("----------------------------------------------------------------------");

        // метод принимающий баркод и возвращающий продукт с данным баркодом

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Barcode of the product: ");
        long barcode = scanner.nextLong();

        Product foundProduct = Product.barCodeSearch(products, barcode);

        if (foundProduct != null)
        {
            System.out.println("Product found: " + foundProduct);
        }
        else
        {
            System.out.println("Product with barcode " + barcode + " not found.");
        }
    }

    public static void printProdukts(Product[] products)
    {
        double totalprice = 0;

        for (int i = 0; i < products.length; i++)
        {
            totalprice += products[i].getPrice();
            System.out.println(products[i]);
        }
    }

    public static double getTotalPrice(Product[] products)
    {
        double totalPrice = 0;

        for (Product item : products)
        {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public static void compareProducts(Product[] products)
    {
        for (int i = 0; i < products.length; i++)
        {
            for (int j = i + 1; j < products.length; j++)
            {
                System.out.printf("\nProduct '%s' and product '%s' are equal: %b", products[i].getName(), products[j].getName(), products[i].equals(products[j])); // сравнение
            }
        }
    }

    public static void nonFoodProducts(Product[] products)
    {
        for (Product item : products)
        {
            if (!(item instanceof Food))
                System.out.println("Non-food product: " + item);
        }
    }









}

package supermarket;

import supermarket.dao.SupermarketImpl;
import supermarket.model.Food;
import supermarket.model.MeatFood;
import supermarket.model.MilkFood;
import supermarket.model.Product;

import java.time.LocalDate;

public class SupermarketAppl
{
    public static void main(String[] args)
    {
        Product[] products;
        Product[] expDateProduct;
        SupermarketImpl supermarket;

        products = new Product[5];
        supermarket = new SupermarketImpl(6);

        products[0] = new Food(1000L, "Broad", 3.0, LocalDate.of(2024,9,11));
        products[1] = new MilkFood(1001L,"Milk",2.40, LocalDate.of(2025,1,23),"LactoFree");
        products[2] = new MilkFood(1002L, "Milk", 2.70, LocalDate.of(2024,10,22), "Goat's milk");
        products[3] = new MeatFood(1003L,"Sausage", 8.45, LocalDate.of(2024,11,1), "young goat's meat");
        products[4] = new MeatFood(1004L, "Sausage", 15.99, LocalDate.of(2024,7,3), "pork");

        for (int i = 0; i < products.length; i++)
        {
            supermarket.addProduct(products[i]);
        }

        System.out.println("\n---------------- Products by ExpDate -------------------\n");

        expDateProduct = supermarket.findProductsByExpDate();
        for (int i = 0; i < expDateProduct.length; i++)
        {
            expDateProduct[i].display();
        }
        System.out.println("\n------------- Total cost of all products ----------------");
        System.out.printf("=>  %.2f", supermarket.totalCostOfAllProducts());

        System.out.println("\n------------- Average cost of all products ----------------");
        System.out.printf("=>  %.2f", supermarket.averageCostOfAllProducts());

        System.out.println("\n------------------------------------------------------------");












    }
}

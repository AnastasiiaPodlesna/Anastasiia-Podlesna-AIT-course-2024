package supermarket.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import supermarket.dao.SupermarketImpl;
import supermarket.model.Food;
import supermarket.model.MeatFood;
import supermarket.model.MilkFood;
import supermarket.model.Product;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest
{
    Product[] products;
    SupermarketImpl supermarket;

    @BeforeEach
    void setUp()
    {
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

    }

    @Test
    void addProductTest()
    {
        assertFalse(supermarket.addProduct(null));      // не добавлять null
        assertFalse(supermarket.addProduct(products[2]));  //  не добавлять дубликат
        // добавляем еще
        Product newproduct = new MilkFood(1005L,"Milk",2.40, LocalDate.of(2025,1,23),"LactoFree");
        assertTrue(supermarket.addProduct(newproduct));
        // добавляем еще, сверх возможности capacity
        Product oneMoreProduct = new MeatFood(1006L, "Sausage", 15.99, LocalDate.of(2024,7,3),"pork");
        assertFalse(supermarket.addProduct(oneMoreProduct)); // нет места
    }

    @Test
    void findProductTest()
    {
        Product foundProduct = supermarket.findProduct(1002L);
        assertEquals(products[2], foundProduct);// книга есть в библиотеке
        assertNull(supermarket.findProduct(1009L));  // нет книги, возвращает нуль
    }

    @Test
    void updateProductTest()
    {
        Product newProduct = new MeatFood(1006L, "Sausage", 15.99, LocalDate.of(2024,7,3), "pork");
        assertTrue(supermarket.updateProduct(1003L, newProduct)); // нашли и заменили
        assertFalse(supermarket.updateProduct(1009L, newProduct));// не нашли, не заменили
    }

    @Test
    void removeProduct()
    {
        // удаление существующего продукта existed book
        assertTrue(supermarket.removeProduct(1001L));
        // удаление несуществующего продукта absent book
        assertFalse(supermarket.removeProduct(10010L));
    }

    @Test
    void findProductsByExpDate()
    {
        Product[] expDateProducts = {products[0], products[4]};
        assertArrayEquals(expDateProducts, supermarket.findProductsByExpDate());
        // массив просроченных продуктов

        SupermarketImpl supermarket1 = new SupermarketImpl(2);
        supermarket1.addProduct(products[1]);
        supermarket1.addProduct(products[2]);

        assertNull(supermarket1.findProductsByExpDate()); // все продукты свежие
    }

    @Test
    void totalCostOfAllProducts()
    {
        assertEquals(32.54, supermarket.totalCostOfAllProducts());
    }

    @Test
    void averageCostOfAllProducts()
    {
        assertEquals(6.508, supermarket.averageCostOfAllProducts());
    }

}
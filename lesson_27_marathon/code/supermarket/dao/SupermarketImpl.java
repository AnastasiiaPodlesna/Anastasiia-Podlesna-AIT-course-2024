package supermarket.dao;

import supermarket.model.Product;

import java.time.LocalDate;
import java.util.function.Predicate;

public class SupermarketImpl implements SuperMarket
{
    Product[] products;
    SuperMarket superMarket;
    int size;
    final LocalDate CURRENT_DATE = LocalDate.now();

    public SupermarketImpl(int capacity)
    {
        products = new Product[capacity];
        size = 0;
    }

    @Override
    public boolean addProduct(Product product)
    {
        if (product == null || size == products.length || findProduct(product.getBarCode()) != null)
        {
            return false;
        }
        products[size] = product; //  добавляем в массив
        size++;
        return true;
    }

    @Override
    public Product findProduct(long barCode)
    {
        for (int i = 0; i < size; i++) {
            if (products[i].getBarCode() == barCode)
            {
                return products[i]; // нашли
            }
        }
        return null;  // не нашли
    }

    @Override
    public boolean updateProduct(long barCode, Product updatedProduct)
    {
        for (int i = 0; i < size; i++)
        {
            if (products[i].getBarCode() == barCode)
            {
                products[i] = updatedProduct; // обновляем
                return true; // получилось обновить
            }
        }
        return false; // не удалось обновить
    }

    @Override
    public boolean removeProduct(long barCode)
    {
        for (int i = 0; i < size; i++) {
            if (products[i].getBarCode() == barCode)
            {
                Product victim = products[i];
                products[i] = products[size - 1]; // последн. ставим на место удаляемого
                products[size - 1] = null; // затираем последний элемент массива
                size--;
                return true;
            }
        }
        return false; // не удалили
    }

    @Override
    public Product[] findProductsByExpDate() // ищем просроченные продукты
    {
        return findProductsByPredicate(product -> product.getExp_date().isBefore(CURRENT_DATE));
    }

    @Override
    public double totalCostOfAllProducts()
    {
        double totalCost = 0.0;
        for (int i = 0; i < size; i++)
        {
           totalCost+=  products[i].getPrice();
        }
        return totalCost;
    }

    @Override
    public Double averageCostOfAllProducts()
    {
        return totalCostOfAllProducts() / size;
    }

    private Product[] findProductsByPredicate(Predicate <Product> predicate)
    {
        int count = 0;
        for (int i = 0; i < size; i++)
        {
            if(predicate.test(products[i]))
            { // объект проходит тест
                count++;
            }
        }
        if (count == 0)
        {
            return null;
        }

        Product[] foundProducts = new Product[count];
        for (int i = 0, j = 0 ; j < foundProducts.length; i++)
        {
            if(predicate.test(products[i]))
            {
                foundProducts[j++] = products[i];
            }
        }
        return foundProducts;
    }

    @Override
    public void display()
    {
        superMarket.display();
    }
}

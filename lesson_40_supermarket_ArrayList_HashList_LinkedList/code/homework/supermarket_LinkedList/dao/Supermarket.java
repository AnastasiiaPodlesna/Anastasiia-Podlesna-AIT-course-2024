package homework.supermarket_LinkedList.dao;

import homework.supermarket_LinkedList.model.Product;

public interface Supermarket
{
    boolean addProduct(Product product);
    Product removeProduct(long barCode);
    Product findByBarCode(long barCode);
    Iterable<Product> findByCategory(String category);
    Iterable<Product> findByBrand(String brand);
    Iterable<Product> findProductsWithExpiredDate();
    int skuQuantity();
}

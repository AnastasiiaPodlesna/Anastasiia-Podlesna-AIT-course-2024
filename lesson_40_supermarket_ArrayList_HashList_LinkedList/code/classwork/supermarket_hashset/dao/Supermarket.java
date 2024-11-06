package classwork.supermarket_hashset.dao;

import classwork.supermarket_hashset.model.Product;

public interface Supermarket extends Iterable<Product>
{

    boolean addProduct(Product product);

    Product removeProduct(long barCode);

    Product findByBarcode(long barCode);

    Iterable<Product> findByCategory(String category);

    Iterable<Product> findByBrand(String brand);

    Iterable<Product> findProductWithExpiredDay();

    int skuQuantity();
}

package supermarket.dao;


import supermarket.model.Product;

public interface SuperMarket
{
    boolean addProduct (Product product);

    Product findProduct (long barCode);

    boolean updateProduct (long barCode, Product updatedProduct);

    boolean removeProduct (long barCode);

    Product[] findProductsByExpDate ();

    double totalCostOfAllProducts();

    Double averageCostOfAllProducts();

    void display();
}

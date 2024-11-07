package homework.supermarket_LinkedList.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product
{
    private long barCode;
    private String name;
    private String category;
    private String brand;
    private double price;
    private LocalDate expDate;

    public Product(long barCode,
            String name,
            String category,
            String brand,
            double price,
            LocalDate expDate)
    {
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.expDate = expDate;
    }

    public long getBarCode()
    {
        return barCode;
    }

    public String getName()
    {
        return name;
    }

    public String getCategory()
    {
        return category;
    }

    public String getBrand()
    {
        return brand;
    }

    public double getPrice()
    {
        return price;
    }

    public LocalDate getExpDate()
    {
        return expDate;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return String.format("Product: barCode %d, name '%s', category '%s', brand '%s', price %.2f, expDate %s\n", barCode, name, category, brand, price, expDate);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(barCode);
    }
}

package supermarket.model;

import java.time.LocalDate;

public abstract class Product
{
    private long barCode;
    private String name;
    private double price;
    private LocalDate exp_date;

    public Product(long barCode,
            String name,
            double price,
            LocalDate exp_date)
    {
        this.barCode = barCode;
        this.name = name;
        this.price = price;
        this.exp_date = exp_date;
    }

    public void setBarCode(long barCode)
    {
        this.barCode = barCode;
    }

    public LocalDate getExp_date()
    {
        return exp_date;
    }

    public void setExp_date(LocalDate exp_date)
    {
        this.exp_date = exp_date;
    }

    public long getBarCode()
    {
        return barCode;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void display()
    {
        System.out.printf("barCode: %d, name: %s, price: %.2f, exp date: ^(\\d{4})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])$", barCode, name, price);
    }

}

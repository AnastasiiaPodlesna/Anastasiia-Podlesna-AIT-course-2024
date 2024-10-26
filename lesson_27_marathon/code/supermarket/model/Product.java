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

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("supermarket.model.Product{");
//        sb.append("barCode=").append(barCode);
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", price=").append(price);
//        sb.append(", exp_date=").append(exp_date);
//        sb.append('}');
//        return sb.toString();
//    }

    public void display()
    {
        System.out.printf("barCode: %d, name: %s, price: %.2f, exp date: %s%n", barCode, name, price, exp_date.toString());
    }

}

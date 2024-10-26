package supermarket.model;

import java.time.LocalDate;

public class MilkFood extends Product
{
    private String milkType;

    public MilkFood(long barCode,
            String name,
            double price,
            LocalDate exp_date,
            String milkType)
    {
        super(barCode, name, price, exp_date);
        this.milkType = milkType;
    }

    public String getMilkType()
    {
        return milkType;
    }

    public void setMilkType(String milkType)
    {
        this.milkType = milkType;
    }

    public void display()
    {
        System.out.printf("barCode: %d, name: %s, price: %.2f, meat type: %s, expiration_date: %s%n", getBarCode(), getName(), getPrice(), milkType, getExp_date().toString());
    }
}

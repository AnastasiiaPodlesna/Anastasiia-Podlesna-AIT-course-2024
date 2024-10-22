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
        System.out.printf("barCode: %d, name: %s, price: %.2f, meat type: %s,expiration_date:" + "^(\\d{4})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])$", getBarCode(), getName(), getPrice(), milkType, getExp_date());
    }
}

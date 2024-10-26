package supermarket.model;

import java.time.LocalDate;

public class MeatFood extends Product
{
    private String meatType; // хранит тип мяса, из которого изготовлен

    public MeatFood(long barCode,
            String name,
            double price,
            LocalDate exp_date,
            String meatType)
    {
        super(barCode, name, price, exp_date);
        this.meatType = meatType;
    }

    public String getMeatType()
    {
        return meatType;
    }

    public void setMeatType(String meatType)
    {
        this.meatType = meatType;
    }


    public void display()
    {
        System.out.printf("barCode: %d, name: %s, price: %.2f, meat type: %s, expiration_date:  %s%n", getBarCode(), getName(), getPrice(), meatType, getExp_date().toString());
    }

}

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
        System.out.printf("barCode: %d, name: %s, price: %.2f, meat type: %s,expiration_date:" + "^(\\d{4})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])$", getBarCode(), getName(), getPrice(), meatType, getExp_date());
    }

}

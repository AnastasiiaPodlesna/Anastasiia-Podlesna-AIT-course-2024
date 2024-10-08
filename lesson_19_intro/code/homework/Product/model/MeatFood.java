package homework.Product.model;

import java.util.Objects;

public class MeatFood extends Food
{
    private String meatType; // хранит тип мяса, из которого изготовлен продукт

    public MeatFood(double price,
            String name,
            long barCode,
            String expDate,
            String meatType)
    {
        super(price, name, barCode, expDate);
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

    @Override
    public String toString() {
        return "homework.Product.model.MeatFood{" +
                "meatType='" + meatType + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof MeatFood meatFood)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(meatType, meatFood.meatType);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), meatType);
    }
}

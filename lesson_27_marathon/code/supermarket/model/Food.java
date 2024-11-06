
package supermarket.model;

import java.time.LocalDate;

public class Food extends Product
{
    public Food(long barCode,
            String name,
            double price,
            LocalDate exp_date)
    {
        super(barCode, name, price, exp_date);
    }



    public void display()
    {
        System.out.printf("barCode: %d, name: %s, price: %.2f, expiration_date: %s%n", getBarCode(), getName(), getPrice(), getExp_date().toString());
    }
}


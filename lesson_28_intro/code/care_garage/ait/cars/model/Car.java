package care_garage.ait.cars.model;

import java.util.Objects;

public class Car implements Comparable<Car>
{
    private String regNumber;
    private String model;
    private String company;
    private Double price;
    private String color;
    private int yearOfManufacture;

    public Car(String regNumber,
            String model,
            String company,
            Double price,
            String color,
            int yearOfManufacture)
    {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.price = price;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYearOfManufacture()
    {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture)
    {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getRegNumber()
    {
        return regNumber;
    }

    public String getModel()
    {
        return model;
    }

    public String getCompany()
    {
        return company;
    }

    public Double getPrice()
    {
        return price;
    }

    public String getColor()
    {
        return color;
    }

    public void setRegNumber(String regNumber)
    {
        this.regNumber = regNumber;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("care_garage.ait.cars.model.Car{");
        sb.append("regNumber='").append(regNumber).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", price=").append(price);
        sb.append(", color='").append(color).append('\'');
        sb.append(", yearOfManufacture=").append(yearOfManufacture);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(regNumber, car.regNumber) && Objects.equals(model, car.model) && Objects.equals(company, car.company) && Objects.equals(price, car.price) && Objects.equals(color, car.color) && Objects.equals(yearOfManufacture, car.yearOfManufacture);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(regNumber, model, company, price, color, yearOfManufacture);
    }

    @Override
    public int compareTo(Car car) {
        return this.getYearOfManufacture() - car.getYearOfManufacture();
    }
}

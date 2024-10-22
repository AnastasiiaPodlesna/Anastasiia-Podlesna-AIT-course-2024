package care_garage.ait.cars.model;

import java.util.Objects;

public class Car
{
    private String regNumber;
    private String model;
    private String company;
    private Double engine;
    private String color;

    public Car(String regNumber,
            String model,
            String company,
            Double engine,
            String color)
    {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
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

    public Double getEngine()
    {
        return engine;
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
        sb.append(", engine=").append(engine);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(regNumber);
    }


}

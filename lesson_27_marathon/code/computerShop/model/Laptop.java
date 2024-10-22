package computerShop.model;

public class Laptop extends Computer
{
    private String color;

    public Laptop(String cpu,
            int ram,
            int ssd,
            String brand,
            double price,
            long stockNumber,
            double discount,
            String color) {
        super(cpu, ram, ssd, brand, price, stockNumber, discount);
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("computerShop.model.Laptop{");
        sb.append("color='").append(color).append('\'');
        sb.append('}');
        return sb.toString() + super.toString();
    }
}

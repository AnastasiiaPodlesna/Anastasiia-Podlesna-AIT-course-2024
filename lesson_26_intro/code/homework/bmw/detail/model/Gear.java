package homework.bmw.detail.model;

public class Gear extends Detail   // шестеренка
{
    private double radius;
    private int tooth; // зубец

    public Gear(long barCode,
            double size,
            String material,
            String vendor,
            double weight,
            double radius,
            int tooth)
    {
        super(barCode, size, material, vendor, weight);
        this.radius = radius;
        this.tooth = tooth;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public int getTooth()
    {
        return tooth;
    }

    public void setTooth(int tooth)
    {
        this.tooth = tooth;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("homework.bmw.detail.model.Gear{");
        sb.append("radius=").append(radius);
        sb.append(", tooth=").append(tooth);
        sb.append('}');
        return sb.toString() + super.toString();
    }
}


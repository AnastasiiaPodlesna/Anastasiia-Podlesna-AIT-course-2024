package homework.cube.model;

public class Cube
{
    private double a;

    public Cube(double a)
    {
        this.a = a;
    }

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public void display(double p, double s, double v)
    {
        System.out.printf("Side of cube a = %.2f => perimeter = %.2f; area = %.2f; volume = %.2f", a, p, s, v);
    }

    public double perimeter()
    {
        return 12 * a;
    }

    public double area()
    {
        return  6 * a * a;
    }

    public double volume()
    {
        return a * a * a;
    }
}


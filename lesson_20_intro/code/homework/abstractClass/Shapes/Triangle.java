package homework.abstractClass.Shapes;

public class Triangle extends Shape
{
    private double b, c;

    public Triangle(double a,
            double b,
            double c)
    {
        super(a);
        this.b = b;
        this.c = c;
    }

    public double calcArea()
    {
        double p = calcPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));  // площадь треугольника - формула Герона
    }

    public double calcPerimeter()                          // периметр треугольника
    {
        return a + b + c;
    }

}

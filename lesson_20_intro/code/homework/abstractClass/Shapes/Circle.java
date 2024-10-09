package homework.abstractClass.Shapes;

public class Circle extends Shape
{
    public Circle(double radius)
    {
        super(radius);
    }

    @Override
    public double calcArea()        // площадь круга
    {
        return Math.PI * a * a;
    }

    @Override
    public double calcPerimeter()  // периметр круга
    {
        return 2 * Math.PI * a;
    }
}

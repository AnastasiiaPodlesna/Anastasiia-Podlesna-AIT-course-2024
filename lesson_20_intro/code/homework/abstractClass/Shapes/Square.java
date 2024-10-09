package homework.abstractClass.Shapes;

public class Square extends Shape
{
    public Square(double a)
    {
        super(a);
    }

    public double calcArea()
    {
        return a * a;
    }

    public double calcPerimeter()
    {
        return 4 * a;
    }
}

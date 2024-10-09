package homework.abstractClass.Shapes;

public abstract class Shape
{
    protected double a;

    public Shape(double a)
    {
            this.a = a;
    }

    public abstract double calcArea();
    public abstract double calcPerimeter();


}
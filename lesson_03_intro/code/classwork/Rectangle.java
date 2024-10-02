package classwork;

public class Rectangle
{
    public static void main(String[] args)
    {
        double a = 125.37;
        double b = 35.0;
        double area = a * b;

        System.out.println("Area of rectangle: " + area);

        area = areaOfRectangle(a, b);
        System.out.println("Area of rectangle: " + area);

    }

    public static double areaOfRectangle(double a, double b)
    {
    double res = a * b;
    return res;
    }




}

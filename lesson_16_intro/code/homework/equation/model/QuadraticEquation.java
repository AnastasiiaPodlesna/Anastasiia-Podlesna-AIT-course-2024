package homework.equation.model;

public class QuadraticEquation
{
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    public double getC()
    {
        return c;
    }

    public void setC(double c)
    {
        this.c = c;
    }

    public void display()
    {
       if ( (getB() > 0) && (getC() > 0))
           System.out.printf("y = %.2f*x² + %.2f*х + %.2f%n", a, b, c);

       if ( (getB() < 0) && (getC() > 0))
           System.out.printf("y = %.2f*x² %.2f*х + %.2f", a, b, c);

        if ( (getB() < 0) && (getC() < 0))
            System.out.printf("y = %.2f*x² %.2f*х %.2f", a, b, c);

        if ( (getB() > 0) && (getC() < 0))
            System.out.printf("y =  %.2f*x² + %.2f*х %.2f", a, b, c);

        if ( (getB() == 0) && (getC() < 0))
            System.out.printf("y =  %.2f*x² %.2f", a, c);

        if ( (getB() == 0) && (getC() > 0))
            System.out.printf("y =  %.2f*x² + %.2f", a, c);

        if ( (getB() > 0) && (getC() == 0))
            System.out.printf("y =  %.2f*x² + %.2f*х", a, b);

        if ( (getB() < 0) && (getC() == 0))
            System.out.printf("y =  %.2f*x² %.2f*x", a, b);

        if (getA() == 0) System.out.println("It's not a quadratic equation !");
    }

    //------------------------------------------------------

    public double delta(double a, double b, double c)
    {
        double d = b * b - 4 * a * c;
        return d;
    }

    public int quantityRoots(double d)
    {
        int result = 3;

        if (d > 0) result = 2;
        if (d == 0) result = 1;
        if (d < 0) result = 0;

        return result;
    }
}

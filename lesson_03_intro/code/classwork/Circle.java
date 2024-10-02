package classwork;

public class Circle
{
    public static void main(String[] args)
    {
       double pi = 3.14159;
       double r = 100;
       double lengthOfCircle = 2 * pi * r;

       System.out.println(lengthOfCircle);
       
       //*****************************************
        
       double l = length_Circle(r);
       System.out.println("Length of circle = " + l);
    }

    private static double length_Circle(double r)
    {
        return 2 * Math.PI * r;
    }


}

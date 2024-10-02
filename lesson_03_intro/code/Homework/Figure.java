package Homework;

import java.util.Scanner;


public class Figure
{
    double squareSide;      // сторона квадрата
    double circleRadius;    // радиус круга
    double rectangleSideA;  // сторона прямоугольника a
    double rectangleSideB;  // сторона прямоугольника b
       int angleTriangleA;  // угол треугольника A
       int angleTriangleB;  // угол треугольника B



    public static void main(String[] args)
    {
        Figure cls = new Figure();
        square_area();              // метод "Площадь квадрата"
        System.out.println(" ");
        circle_area();              // метод "Площадь круга"
        System.out.println(" ");
        rectangle_perimeter();      // метод "Периметр прямоугольника"
        System.out.println(" ");
        angleTriangle();            // метод "Нахождение 3-го угла в треугольнике "
    }

    public static void square_area()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сторону квадрата a: ");
        double squareSide = in.nextDouble();
        double rez = squareSide*squareSide;
        System.out.println("Площадь квадрата с заданной стороной a = " + squareSide +
                           " составляет: " + Math.round(rez * 100.0) / 100.0);
    }

    public static void circle_area()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус круга R: ");
        double circleRadius = in.nextDouble();
        double rez = circleRadius * circleRadius * Math.PI;
        System.out.println("Площадь круга с заданным радиусом R = " + circleRadius +
                           " составляет " + Math.round(rez * 100.0) / 100.0);
    }

    public static void rectangle_perimeter()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сторону прямоугольника а: ");
        double rectangleSideA = in.nextDouble();
        System.out.print("Введите сторону прямоугольника b: ");
        double rectangleSideB = in.nextDouble();
        double rez = 2 * (rectangleSideA + rectangleSideB);
        System.out.println("Периметр прямоугольника с заданной стороной a = " +
                      rectangleSideA + " и со стороной b = " + rectangleSideB +
                      " составляет " + Math.round(rez * 100.0) / 100.0);
    }

    public static void angleTriangle()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение угла треугольника А: ");
        int angleTriangleA = in.nextInt();
            if (angleTriangleA >= 180 || angleTriangleA <= 0)
            {
                System.out.println("Введено не правильное значение угла. Повторите ввод...");
                angleTriangle();
            }
        System.out.print("Введите значение угла треугольника B: ");
        int angleTriangleB = in.nextInt();
            if (angleTriangleB >= 180 || angleTriangleB <= 0 ||
                    (angleTriangleB == angleTriangleA && angleTriangleB == 90) ||
                    (angleTriangleA + angleTriangleB) >= 180)
            {
            System.out.println("Введены неправильные значения углов. Начните заново.");
            angleTriangle();
            }
        int rez = 180 - (angleTriangleA + angleTriangleB);
        System.out.println("В треугольнике, у которого заданы два угла: А = " +
                         angleTriangleA + " градусов и В = " + angleTriangleB +
                         " градусов, третий угол С = " + rez + " градусов");
    }









}

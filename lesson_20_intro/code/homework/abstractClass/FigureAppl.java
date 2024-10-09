package homework.abstractClass;

// Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea
// и calcPerimeter.
// Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
// Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга,
// один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.
// Рассчитайте общую площадь кругов из задачи.

import Homework.Figure;
import homework.abstractClass.Shapes.Circle;
import homework.abstractClass.Shapes.Shape;
import homework.abstractClass.Shapes.Square;
import homework.abstractClass.Shapes.Triangle;

public class FigureAppl
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(12);
        shapes[1] = new Circle(6);
        shapes[2] = new Triangle(4, 7, 9);
        shapes[3] = new Square(5);

        // вычисляем общую площадь и периметр

        double SumArea = 0;
        double SumPerimeter = 0;

        for (Shape shape : shapes)
        {
            SumArea += shape.calcArea();
            SumPerimeter += shape.calcPerimeter();
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Total area: %.2f%n", SumArea);
        System.out.printf("Total perimeter: %.2f%n", SumPerimeter);
        System.out.println("---------------------------------------------------------------");

        SumArea = 0;

        for (Shape circle : shapes)
        {
            if (circle instanceof Circle)
                SumArea += circle.calcArea();
        }

        System.out.printf("Total area of the circles: %.2f%n", SumArea);
        //System.out.println("---------------------------------------------------------------");
    }
}

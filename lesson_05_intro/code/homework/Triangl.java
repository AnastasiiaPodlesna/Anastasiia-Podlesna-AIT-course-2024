package homework;

//Задать в программе три стороны треугольника.
//Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
//Сообщить результат - существует или нет треугольник с заданными сторонами.

public class Triangl {

    public static void main(String[] args) {

        int a = 3; int b = 5; int c = 7;

        boolean truFalse = checkingTriangleInequality(a, b, c);
        if (truFalse) System.out.println("the triangle inequality holds...\n");
        else System.out.println("The triangle inequality does not hold...\n");
    }

    private static boolean checkingTriangleInequality(int a, int b, int c)
    {
        return (a < (b + c)) && (b < (a + c)) && (c < (a + b));
    }


}
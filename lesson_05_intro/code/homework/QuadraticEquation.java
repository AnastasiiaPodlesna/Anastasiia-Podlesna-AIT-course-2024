package homework;

//Разработать аппликацию для решения квадратного уравнения по коэффициентам квадратного трехчлена а, b и с.
//Дискриминант вычислить по формуле: d = bb - 4ac
//Если d > 0, то x1 = (-b + Math.sqrt(d))/(2a), x2 = (-b - Math.sqrt(d))/(2a).
//Если d = 0, то x = -b / (2a). Если d < 0, то сообщить, что корней нет.

import java.util.Scanner;

public class QuadraticEquation
{
    public static void main(String[] args)
    {
        int a;
        int b;
        int c;
        double root;  // корень
        int discriminant; // дискриминант

        Scanner in = new Scanner(System.in); // ввод данных из консоли
        System.out.print("Введите первый коээфициет квадратного уравнения a: ");
        a = in.nextInt();
        System.out.print("Введите второй коээфициет квадратного уравнения b: ");
        b = in.nextInt();
        System.out.print("Введите третий коээфициет квадратного уравнения c: ");
        c = in.nextInt();

        discriminant = discriminantSearch(a, b, c);          // Дискриминант

        if (discriminant > 0)
        {
            root = squareEquationRoot1(a, b, discriminant); // Первый корень
            System.out.println("Корень X1 = " + root);

            root = squareEquationRoot2(a, b, discriminant); // Второй корень
            System.out.println("Корень X2 = " + root);
        }
        else if (discriminant == 0)
        {
            root = squareEquationRoot1(a, b, discriminant);
            System.out.println("Квадратное уравнение имеет только один корень X = " + root);
        }
        else
        {
            System.out.println("Квадратное уравнение не имеет корней...");
        }
    }

    public static int discriminantSearch(int a, int b, int c)                  // Метод вычисления дискриминанта
    {
        return  b * b - 4 * a * c;
    }

    public static double squareEquationRoot1(int a, int b, int discriminant)  // Метод вычисления X1
    {
       return (-1 * b + Math.sqrt(discriminant)) / 2 * a;
    }

    public static double squareEquationRoot2(int a, int b, int discriminant)  // Метод вычисления X2
    {
        return (-1 * b - Math.sqrt(discriminant)) / 2 * a;
    }

}

package homework.equation;

import homework.equation.model.QuadraticEquation;

public class EquationAppl
{
    public static void main(String[] args)
    {
        QuadraticEquation[] quadraticEquation = new QuadraticEquation[3];
        quadraticEquation[0] = new QuadraticEquation(3, 7, -6);
        quadraticEquation[1] = new QuadraticEquation(4, 4, 1);
        quadraticEquation[2] = new QuadraticEquation(9, 0, 7);

        System.out.println("---------------------------------------------------");
        for (int i = 0; i < quadraticEquation.length; i++)
        {
            // печать формулы уравнения
            quadraticEquation[i].display();
            // вызов метода поиска дискриминанта
            double discriminant = quadraticEquation[i].delta(quadraticEquation[i].getA(), quadraticEquation[i].getB(), quadraticEquation[i].getC());
            System.out.println("\nDiscriminant = " + discriminant);
            int roots = quadraticEquation[i].quantityRoots(discriminant);
            System.out.println("Number of roots = " + roots);
            System.out.println("---------------------------------------------------");
        }







    }
}

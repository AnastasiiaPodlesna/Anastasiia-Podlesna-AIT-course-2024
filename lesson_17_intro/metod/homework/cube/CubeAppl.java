package homework.cube;

// Создать класс Cube, описывающий куб cо стороной a.
// Реализовать в нем методы определения периметра p (сумма длин всех ребер),
// площади s (сумма площадей всех граней) и объема v.
// Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

import homework.cube.model.Cube;

public class CubeAppl
{
    public static void main(String[] args)
    {
        Cube cube1 = new Cube(3);
        Cube cube2 = new Cube(1.2);

        cube1.display(cube1.perimeter(), cube1.area(), cube1.volume());
        System.out.println("\n-------------------------------------------------------------------------");

        cube2.display(cube2.perimeter(), cube2.area(), cube2.volume());
        System.out.println("\n-------------------------------------------------------------------------");
    }
}

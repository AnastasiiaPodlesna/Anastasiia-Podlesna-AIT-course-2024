package planets.model;

// Занести планеты солнечной системы в список, содержащий:
// наименование;
// расстояние до Солнца;
// массу;
// количество спутников.
// Вывести список планет отсортированный по:
//
// порядку расположения в солнечной системе;
// алфавиту;
// массе;
// количеству спутников.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetAppl
{
    public static void main(String[] args)
    {
        List<Planet> planets = new ArrayList<>();

        planets.add(new Planet("Mercury", 57.9, 0.33, 0));
        planets.add(new Planet("Venus", 108.2, 4.87, 0));
        planets.add(new Planet("Earth", 149.6, 5.97, 1));
        planets.add(new Planet("Mars", 227.9, 0.64, 2));
        planets.add(new Planet("Jupiter", 778.5, 1898, 79));

        System.out.println("Sorted by order of location in the solar system:");
        planets.sort(Comparator.comparing(Planet::getDistanceToTheSun));
        display(planets);

        System.out.println("Sorted by alphabet:");
        planets.sort(Comparator.comparing(Planet::getName));
        display(planets);

        System.out.println("Sorted by mass:");
        planets.sort(Comparator.comparing(Planet::getMass));
        display(planets);

        System.out.println("Sorted by number of satellites:");
        planets.sort(Comparator.comparing(Planet::getNumberOfSatellites));
        display(planets);

    }

    public static void display(List<Planet> planets)
    {
        for (Planet p : planets)
        {
            System.out.println(p);
        }
        System.out.println("----------------------------------------------------------");
    }
}

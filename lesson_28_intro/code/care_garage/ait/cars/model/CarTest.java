package care_garage.ait.cars.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CarTest
{
    private Car[] cars;

    @BeforeEach
    void setUp()
    {
        cars = new Car[4];

        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red", 2013);
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green", 1980);
        cars[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red",2020);
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green", 2024);

    }

    @Test
    void printCars()
    {
        for (int i = 0; i < cars.length; i++)
        {
            System.out.println(cars[i]);
        }
    }

    @Test
    void sortCarsByYearOfManufacture()
    {
        System.out.println("---------- List cars as is --------------");
        printCars(); // print as is

        Arrays.sort(cars); // sorting
        System.out.println("---------- List wines sorted by year of manufacture ------------");
        printCars(); // print after sorting
    }

    @Test
    void sortCarsByModel()
    {
        Comparator<Car> sortCarsByModel = new Comparator<Car>()
        {
            @Override
            public int compare(Car model1, Car model2)
            {
                return model1.getModel().compareTo(model2.getModel());
            }
        };

        Arrays.sort(cars, sortCarsByModel);
        System.out.println("---------- List wines sorted by model --------------");
        printCars(); // print after sorting
    }

    @Test
    void sortCarsByColor()
    {
        Comparator<Car> sortCarsByColor = new Comparator<Car>()
        {
            @Override
            public int compare(Car color1, Car color2)
            {
                return color1.getColor().compareTo(color2.getColor());
            }
        };

        Arrays.sort(cars, sortCarsByColor);
        System.out.println("---------- List wines sorted by color --------------");
        printCars(); // print after sorting
    }

    @Test
    void sortCarsByPrice()
    {
        Comparator<Car> sortCarsByPrice = new Comparator<Car>()
        {
            @Override
            public int compare(Car price1, Car price2)
            {
                return Double.compare(price1.getPrice(), price2.getPrice());
            }
        };

        Arrays.sort(cars, sortCarsByPrice);
        System.out.println("---------- List wines sorted by price --------------");
        printCars(); // print after sorting
    }

}
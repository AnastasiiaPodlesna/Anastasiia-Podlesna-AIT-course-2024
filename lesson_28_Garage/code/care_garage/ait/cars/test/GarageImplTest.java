package care_garage.ait.cars.test;

import care_garage.ait.cars.dao.Garage;
import care_garage.ait.cars.dao.GarageImpl;
import care_garage.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest
{
    private Garage garage;
    private Car[] cars;

    @BeforeEach
    void setUp()
    {
        garage = new GarageImpl(5);
        cars = new Car[4];

        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red", 2013);
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green", 1980);
        cars[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red", 2020);
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Yellow", 2024);

        for (int i = 0; i < cars.length; i++)
        {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void addCarTest()
    {
        assertFalse(garage.addCar(null));       // не добавлять пустое
        assertFalse(garage.addCar(cars[2]));  // не добавлять дубликат
        // добавляем еще
        Car newCar = new Car("Number5", "Model5", "Company5", 2.7, "Yellow", 2021);
        assertTrue(garage.addCar(newCar)); // +
        // добавляем еще документ, сверх возможности capacity
        Car oneMoreCar = new Car("Number6", "Model6", "Company6", 3.0, "Red", 2020);
        assertFalse(garage.addCar(oneMoreCar)); // -, нет места
    }

    @Test
    void removeCarTest()
    {
        // удаление существующего
        assertEquals(cars[1], garage.removeCar("Number2"));
        // удаление несуществующего документа
        assertNull(garage.removeCar("Number9"));
    }

    @Test
    void findCarByNumberTest()
    {
        Car foundCar = garage.findCarByRegNumber("Number3");
        assertEquals(cars[2], foundCar);  // found
        assertNull(garage.findCarByRegNumber("Number9")); // null
    }

    @Test
    void findCarsByModelTest()
    {
        Car[] expected = {cars[0], cars[2]};
        Car [] actual = garage.findCarsByModel("Model1");
        assertArrayEquals(expected, actual);
        assertArrayEquals(new Car[0], garage.findCarsByModel("Model7"));
    }

    @Test
    void findCarsByCompanyTest()
    {
        Car[] expected = {cars[2], cars[3]};
        Car [] actual = garage.findCarsByCompany("Company2");
        assertArrayEquals(expected, actual);
        assertArrayEquals(new Car[0], garage.findCarsByCompany("Company7"));
    }

    @Test
    void findCarsByColorTest()
    {
        Car[] expected = {cars[0], cars[2]};
        Car [] actual = garage.findCarsByColor("Red");
        assertArrayEquals(expected, actual);
        assertArrayEquals(new Car[0], garage.findCarsByColor("Yellow"));
    }

    @Test
    void sizeTest()
    {
        assertEquals(4, garage.size());
    }


//----------------------------------------------------------------------------------------
    @Test
    void sortingByCarColorTest()
    {
        Car[] choosingCarsByColors = new Car[]
        {
                new Car("Number2", "Model2", "Company1", 2.5, "Green", 1980),
                new Car("Number1", "Model1", "Company1", 1.5, "Red", 2013),
                new Car("Number3", "Model1", "Company2", 1.5, "Red", 2020),
                new Car("Number4", "Model4", "Company2", 2.0, "Yellow", 2024)
        };
      assertArrayEquals(choosingCarsByColors, garage.sortingByCarColor(cars));
      garage.printCars(choosingCarsByColors, "Sorting by color");

    }

    @Test
    void sortingByCompany()
    {
        Car[] choosingCarsByCompany = new Car[]
        {
                new Car("Number1", "Model1", "Company1", 1.5, "Red", 2013),
                new Car("Number2", "Model2", "Company1", 2.5, "Green", 1980),
                new Car("Number3", "Model1", "Company2", 1.5, "Red", 2020),
                new Car("Number4", "Model4", "Company2", 2.0, "Yellow", 2024)
        };

        assertArrayEquals(choosingCarsByCompany, garage.sortingByCompany(cars));
        garage.printCars(choosingCarsByCompany, "Data source");
    }

    @Test
    void sortingByCarModel()
    {
        Car[] choosingCarsByModel = new Car[]
        {
                new Car("Number1", "Model1", "Company1", 1.5, "Red", 2013),
                new Car("Number3", "Model1", "Company2", 1.5, "Red", 2020),
                new Car("Number2", "Model2", "Company1", 2.5, "Green", 1980),
                new Car("Number4", "Model4", "Company2", 2.0, "Yellow", 2024)
        };

        assertArrayEquals(choosingCarsByModel, garage.sortingByCarModel(cars));
        garage.printCars(choosingCarsByModel, "Sorting by model");
    }
}

package care_garage.ait.cars;

import care_garage.ait.cars.dao.Garage;
import care_garage.ait.cars.dao.GarageImpl;
import care_garage.ait.cars.model.Car;

public class CarsAppl
{
    private static Garage garage;
    private static Car[] cars;

    public static void main(String[] args)
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

        // первоначальный вид данных
        garage.printCars(cars, "Data source");

        // сортировка по цвету
        garage.sortingByCarColor(cars);

        // сортировка по компании
        garage.sortingByCompany(cars);

        // сортировка по модели
        garage.sortingByCarModel(cars);
    }

}

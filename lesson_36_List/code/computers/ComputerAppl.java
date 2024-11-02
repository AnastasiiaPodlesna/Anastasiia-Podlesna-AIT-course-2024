package computers;

// На основе класса Computer:
// создать собственный ArrayList;
// добавить в него не менее 6 элементов;
// отсортировать список по бренду;
// отсортировать список по размеру RAM, затем размеру SSD при равенстве RAM;
// подсчитать общий суммарный объем и среднее значение SSD.

import computers.model.Computer;

import java.util.*;

public class ComputerAppl
{
    public static void main(String[] args)
    {
        Computer computer;
        List<Computer> computers = new ArrayList<>(6);

        computers.add(new Computer("I7", 128, 512, "HP", 1000.0, 100L));
        computers.add(new Computer("I5", 256, 256, "Apple", 1200.0, 101L));
        computers.add(new Computer("AMD", 128, 256, "IBM", 1100.0, 102L));
        computers.add(new Computer("I7", 256, 512, "HP", 1500.0, 103L));
        computers.add(new Computer("I7", 128, 256, "Dell", 1100.0, 104L));
        computers.add(new Computer("AMD", 256, 512, "Lenovo", 1050.0, 105L));

        System.out.println("Sort computers by brand:");
        computers.sort(Comparator.comparing(Computer::getBrand));
        display(computers);

        System.out.println("Sort computers by RAM size, then by SSD size if RAM is equal:");
        computers.sort(Comparator.comparing(Computer::getRam).thenComparing(Computer::getSsd));
        display(computers);

        int totalVolumeSSD = 0, count = 0;

        for (Computer c : computers)
        {
            totalVolumeSSD += c.getSsd();
            count++;
        }
        System.out.printf("Total volume SSD value: %d, average SSD value: %.2f", totalVolumeSSD, (double) totalVolumeSSD /count);

    }

    public static void display(List<Computer> computers)
    {
        for (Computer c : computers)
        {
            System.out.println(c);
        }
        System.out.println("----------------------------------------------------------");
    }
}

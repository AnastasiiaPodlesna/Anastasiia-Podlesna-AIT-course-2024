package classwork.computer_shop;

//Создать несколько экземпляров каждого класса.
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?

// Найти общий вес всех мобильных устройств в ComputerShop.

import classwork.computer_shop.model.Computer;
import classwork.computer_shop.model.Laptop;
import classwork.computer_shop.model.Smartphone;

public class ShopAppl
{
    public static void main(String[] args)
    {
        Computer computer = new Computer("i7", 8, 256, "Aser", 1200);
        System.out.println(computer);

        Laptop laptop = new Laptop("M2", 8, 256, "Apple AirBook", 2200, 14, 1.50, 10, "blue");
        System.out.println(laptop);

        Smartphone smartphone = new Smartphone("Apple A16 Bionic", 8, 512,"Apple",  1300, 6.1, 2.40, 2, "Rosa Gold", 1213184875);
        System.out.println(smartphone);


        Computer[] computers = new Computer[6];
        computers[0] = new Computer("i7", 8, 256, "Aser", 1200);
        computers[1] = new Computer("i5", 16, 256, "HP", 1500);
        computers[2] = new Computer("AMD", 8, 256, "NoName", 2000);
        computers[3] = new Laptop("Apple", 8, 256, "MacBook", 2000, 14, 1.5, 10, "white");    // down casting
        computers[4] = new Laptop("Apple", 16, 256, "MackBook Air", 2300, 12, 1.1, 12, "black");   // down casting
        computers[5] = new Smartphone("Apple A16 Bionic", 8, 512,"Apple",  1300, 6.1, 3.00, 2, "Rosa Gold", 1213184875);    // down casting

        double totalWeight = 0;
        for (int i = 0; i < computers.length; i++)
        {
            if (computers[i] instanceof Laptop)
            {
                Laptop myLaptop = (Laptop) computers[i];    //   upper casting
                totalWeight += myLaptop.getWeight();
            }
        }

        System.out.println("Total weigth = " + totalWeight);

        System.out.println("---------------------------------------------------------------");

        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++)
        {
            totalSsd += computers[i].getSsd();
        }

        System.out.println("Total ssd: " + totalSsd);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++)
        {
            totalPrice += computers[i].getPrice();
        }

        System.out.println("Total price: " + totalPrice);

        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < computers.length; i++)
        {
            System.out.println(computers[i]);
        }

//        System.out.println("------------------------------------------------------------------");
//        for (int i = 0; i < computers.length; i++)
//        {
//            System.out.println(computers[i].getBrand());
//        }

    }
}

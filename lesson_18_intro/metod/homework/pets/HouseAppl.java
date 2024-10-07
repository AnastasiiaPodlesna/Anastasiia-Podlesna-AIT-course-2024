package homework.pets;

import homework.pets.model.Cat;
import homework.pets.model.Dog;
import homework.pets.model.Pet;

public class HouseAppl
{
    public static void main(String[] args)
    {
        Pet[] pets = new Pet[5];
        pets[0] = new Dog(001, "dog", 7, "Bobik", "Mongrel", 58, 12);
        pets[1] = new Dog(002, "dog", 10, "Maila", "Jack Rassel", 45, 9);
        pets[2] = new Cat(0001, "cat", 12, "Murka", "Maine Coon", 62, 18);
        pets[3] = new Cat(0002, "cat", 1, "Batonchik", "Scottish lop", 30, 4);
        pets[4] = new Cat(0003, "cat", 3, "Milka", "Bengal", 31, 6);

        for (int i = 0; i < pets.length; i++)
        {
                if (pets[i].getType() == "dog")
                {
                    System.out.println(pets[i].toString());
                    pets[i].voice();
                    System.out.println("----------------------------------------------");
                }
                else if (pets[i].getType() == "cat")
                {
                    System.out.println(pets[i].toString());
                    pets[i].voice();
                    System.out.println("----------------------------------------------");
                }
        }

    }
}

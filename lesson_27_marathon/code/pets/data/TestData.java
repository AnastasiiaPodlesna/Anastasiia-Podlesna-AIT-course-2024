package pets.data;

import pets.model.Cat;
import pets.model.Dog;
import pets.model.Pet;

public class TestData
{
    public static Pet[] getTestPets()
    {
        return new Pet[]
                {
                        new Dog(1, "dog", 7, "Bobik", "Mongrel", 58, 12),
                        new Dog(2, "dog", 10, "Maila", "Jack Russell", 45, 9),
                        new Cat(3, "cat", 12, "Murka", "Maine Coon", 62, 18),
                        new Cat(4, "cat", 1, "Batonchik", "Scottish Fold", 30, 4),
                        new Cat(5, "cat", 3, "Milka", "Bengal", 31, 6),
                        new Cat(6, "cat", 12, "Mura", "Maine Coon", 60, 19)
                };
    }
}

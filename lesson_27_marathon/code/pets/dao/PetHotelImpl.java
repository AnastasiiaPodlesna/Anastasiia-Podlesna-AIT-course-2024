package pets.dao;

import pets.model.Cat;
import pets.model.Dog;
import pets.model.Pet;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class PetHotelImpl implements PetHotel
{
    private Pet[] pets = new Pet[10]; // максимум 10 питомцев
    private int petCount; // счетчик добавленных питомцев
    private double pricePerDay = 30.0; // цена за день в отеле

    public PetHotelImpl(int capacity)
    {
        pets = new Pet[capacity];
        petCount = 0;
    }


    public Pet[] getPets()
    {
        return pets;
    }

    public void setPets(Pet[] pets)
    {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof PetHotelImpl petHotel)) return false;
        return Objects.deepEquals(pets, petHotel.pets);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(pets);
    }

    @Override
    public void addPet(Pet pet)
    {
        if (petCount < pets.length)
        {
            pets[petCount++] = pet; // добавляем питомца и увеличиваем счетчик
        }
        else
        {
            System.out.println("No more space for new pets...");
        }
    }

    @Override
    public double calculateRevenue() // считаем доход
    {
        double revenue = 0;
        for (int i = 0; i < petCount; i++)
        {
            revenue += pricePerDay * pets[i].getAge(); // пример расчета
        }
        return revenue;
    }

    @Override
    public Pet[] findPetsByBreed(String breed) // поиск по породе
     {
         return findPetsByPredicate(pet -> pet instanceof Cat && ((Cat) pet).getBreed().equals(breed) || pet instanceof Dog && ((Dog) pet).getBreed().equals(breed));
     }

    @Override
    public Pet[] catsByBreed()
    {
        return findPetsByPredicate(pet -> pet instanceof Cat);
    }

    @Override
    public Pet[] dogsByBreed() {
        return findPetsByPredicate(pet -> pet instanceof Dog);
    }


    private Pet[] findPetsByPredicate(Predicate<Pet> petPredicate)
    {
        int count = 0;
        for (int i = 0; i < petCount; i++)
        {
            if (petPredicate.test(pets[i]))
            {
                count++;
            }
        }

        if (count == 0) return null;

        Pet[] foundPets = new Pet[count];
        for (int i = 0, j = 0 ; j < foundPets.length; i++)
        {
            if(petPredicate.test(pets[i]))
            {
                foundPets[j++] = pets[i];
            }
        }
        return foundPets;
    }


}
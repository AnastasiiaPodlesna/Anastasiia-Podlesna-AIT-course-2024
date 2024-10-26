package pets.dao;

import pets.model.Cat;
import pets.model.Dog;
import pets.model.Pet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;

public class PetHotelImpl implements PetHotel
{
    private Pet[] pets; // максимум 10 питомцев
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
    public int hashCode()
    {
        return Arrays.hashCode(pets);
    }
//---------------------------------------------------------------------------------------

    @Override
    public Boolean addPet(Pet pet)
    {
        if (pet == null || petCount == pets.length || findPet(pet.getId()) != null)
        {
            return false;
        }
        pets[petCount] = pet; // иначе добавляем в массив
        petCount++;
        return true; // добавили
    }

    @Override
    public Boolean removePet(int id)
    {
        for (int i = 0; i < petCount; i++)
        {
            Pet pet = pets[i];
            if (pet != null && pet.getId() == id)
            {
                // сдвигаем элементы влево
                System.arraycopy(pets, i + 1, pets, i, petCount - i - 1);
                pets[--petCount] = null; // уменьшаем счетчик, нуль в конец
                return true; // удалено
            }
        }
        return false; // Не удалили
    }

    @Override
    public Pet findPet(int id)
    {
        for (Pet pet : pets)
            if (pet instanceof Cat && ((Cat) pet).getId() == id ||
                pet instanceof Dog && ((Dog) pet).getId() == id)
            {
                return pet;
            }
        return null;
    }

    @Override
    public int CountPets()
    {
        return petCount;
    }

    @Override
    public void printPets()
    {
        for (int i = 0; i < petCount; i++)
        {
            System.out.println(pets[i]);
        }
    }


    @Override
    public double calculateRevenue() // считаем доход
    {
        double revenue = 0;
        for (int i = 0; i < petCount; i++)
        {
            revenue += pricePerDay; // пример расчета
        }
        return revenue;
    }

    @Override
    public Pet[] findPetsByBreed(String breed) // поиск по породе
     {
         return findPetsByPredicate(pet -> pet instanceof Cat && ((Cat) pet).getBreed().equals(breed) || pet instanceof Dog && ((Dog) pet).getBreed().equals(breed));
     }


    @Override
    public String[] catsByBreed() // массив пород кошек
    {
        Pet[] allCats = findPetsByPredicate(pet -> pet instanceof Cat); //все кошки из тестового списка

        String[] catBreeds = new String[allCats.length];
        int breedCount = 0;
        String breed;

        for (Pet pet : allCats)
        {
            breed = ((Cat) pet).getBreed();
            catBreeds[breedCount++] = breed; // создали стринговый массив с названиями пород
        }
        // используем Set для хранения уникальных названий пород, для этого преобразуем массив в список и передаем в коструктор HashSet (автоматически удаляем все дубликаты)
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(catBreeds));

        // преобразуем Set обратно в массив
        String[] uniqueCatsBreed = uniqueSet.toArray(new String[0]);

        return uniqueCatsBreed;
    }

    @Override
    public String[] dogsByBreed() // массив пород собак
    {
        Pet[] allDogs = findPetsByPredicate(pet -> pet instanceof Dog); //все собаки из тестового списка

        String[] dogBreeds = new String[allDogs.length];
        int breedCount = 0;
        String breed;

        for (Pet pet : allDogs)
        {
            breed = ((Dog) pet).getBreed();
            dogBreeds[breedCount++] = breed; // создали стринговый массив с названиями пород
        }
        // используем Set для хранения уникальных названий пород, для этого преобразуем массив в список и передаем в коструктор HashSet (автоматически удаляем все дубликаты)
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(dogBreeds));

        // преобразуем Set обратно в массив
        String[] uniqueDogsBreed = uniqueSet.toArray(new String[0]);

        return uniqueDogsBreed;
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
    //------------------------------------------------------------------------



}
package pets;

import pets.dao.PetHotelImpl;
import pets.data.TestData;
import pets.model.Pet;

import java.util.Scanner;

public class PetHotelAppl
{
    public static void main(String[] args)
    {
        PetHotelImpl petHotel = new PetHotelImpl(TestData.getTestPets().length);

        String[] breedCats = {"Maine Coon", "Scottish Fold", "Bengal"};
        String[] breedDogs = {"Mongrel", "Jack Russell"};

        for (Pet pet : TestData.getTestPets())
        {
            petHotel.addPet(pet); // добавляем питомцев в отель
        }

        // считываем выручку
        double revenue = petHotel.calculateRevenue();
        System.out.printf("Total revenue: %.2f%n", revenue);

        // находим животных по породе
        int choicePets = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of pet are you interested in ? ");
        System.out.println("1 => cat, 2 => dog");
        choicePets = scanner.nextInt();

        Pet[] cats = petHotel.catsByBreed();
        Pet[] dogs = petHotel.dogsByBreed();

        if (choicePets == 1)
        {
            if (cats != null && cats.length > 0)
            {
                //  доступные породы
                System.out.println("What kind of cat are you interested in?");
                for (int i = 0; i < breedCats.length; i++)
                {
                        System.out.printf("%d => %s%n", i + 1, breedCats[i]);
                }
                // запрашиваем выбор пользователя
                int choiceBreed = scanner.nextInt();

                // проверяем корректность ввода
                if (choiceBreed > 0 && choiceBreed <= breedCats.length)
                {
                    System.out.println("You selected a " + breedCats[choiceBreed-1]);
                    System.out.println("Cats by breed: " );
                    for (int i = 0; i < petHotel.findPetsByBreed(breedCats[choiceBreed-1]).length; i++)
                    {
                        System.out.println(petHotel.findPetsByBreed(breedCats[choiceBreed-1])[i]);
                    }
                } else
                {
                    System.out.println("Invalid choice, please select a valid option.");
                }
            } else
            {
                System.out.println("No cats available.");
            }
            scanner.close();
        }
        else if (choicePets == 2)
        {
            if (dogs != null && dogs.length > 0)
            {
                //  доступные породы
                System.out.println("What kind of dog are you interested in?");
                for (int i = 0; i < breedDogs.length; i++)
                {
                    System.out.printf("%d => %s%n", i + 1, breedDogs[i]);
                }
                // запрашиваем выбор пользователя
                int choiceBreed = scanner.nextInt();

                // проверяем корректность ввода
                if (choiceBreed > 0 && choiceBreed <= breedDogs.length)
                {
                    System.out.println("You selected a " + breedDogs[choiceBreed - 1]);
                    System.out.println("Cats by breed: ");
                    for (int i = 0; i < petHotel.findPetsByBreed(breedDogs[choiceBreed - 1]).length; i++) {
                        System.out.println(petHotel.findPetsByBreed(breedDogs[choiceBreed - 1])[i]);
                    }
                }
                    else
                {
                    System.out.println("Invalid choice, please select a valid option.");
                }
            } else
            {
                System.out.println("No dogs available.");
            }
            scanner.close();
        }
    }
}

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

        for (Pet pet : TestData.getTestPets())
        {
            petHotel.addPet(pet); // добавляем питомцев в отель
        }

        // считываем выручку
        double revenue = petHotel.calculateRevenue();
        System.out.println("-------------------------------------------------");
        System.out.printf("Total revenue: %.2f%n", revenue);
        System.out.println("-------------------------------------------------");

        // находим животных по породе
        int choicePets = 0;

        //System.out.println(Arrays.toString(petHotel.catsByBreed()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of pet are you interested in ? ");
        System.out.println("1 => cat, 2 => dog");
        choicePets = scanner.nextInt();

        if (choicePets == 1)
        {
            //  доступные породы
            System.out.println("What kind of cat are you interested in?");

            for (int i = 0; i < petHotel.catsByBreed().length; i++)
            {
                System.out.printf("%d => %s%n", i + 1, petHotel.catsByBreed()[i]);
            }
            // запрашиваем выбор пользователя
            int choiceBreed = scanner.nextInt();

            // проверяем корректность ввода
            if (choiceBreed > 0 && choiceBreed <= petHotel.catsByBreed().length)
            {
                System.out.println("-------------------------------------------------");
                System.out.println("Cats by breed: " );
                for (int i = 0; i < petHotel.findPetsByBreed(petHotel.catsByBreed()[choiceBreed-1]).length; i++)
                {
                    System.out.println(petHotel.findPetsByBreed(petHotel.catsByBreed()[choiceBreed-1])[i]);
                }
                System.out.println("-------------------------------------------------");
            }
            scanner.close();
        }
        else if (choicePets == 2)
        {
            //  доступные породы
            System.out.println("What kind of dog are you interested in?");
            for (int i = 0; i < petHotel.dogsByBreed().length; i++) {
                System.out.printf("%d => %s%n", i + 1, petHotel.dogsByBreed()[i]);
            }
            // запрашиваем выбор пользователя
            int choiceBreed = scanner.nextInt();

            // проверяем корректность ввода
            if (choiceBreed > 0 && choiceBreed <= petHotel.dogsByBreed().length) {
                System.out.println("-------------------------------------------------");
                System.out.println("Dogs by breed: ");
                for (int i = 0; i < petHotel.findPetsByBreed(petHotel.dogsByBreed()[choiceBreed - 1]).length; i++)
                {
                    System.out.println(petHotel.findPetsByBreed(petHotel.dogsByBreed()[choiceBreed - 1])[i]);
                    System.out.println("-------------------------------------------------");
                }
            }
            scanner.close();
        }
        else
        {
            System.out.println("Invalid choice, please select a valid option.");
        }

    }
}

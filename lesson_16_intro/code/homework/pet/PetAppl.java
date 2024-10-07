package homework.pet;

import homework.pets.model.Pet;

import java.util.Scanner;

public class PetAppl
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many animals do you have? ");
        int total = scanner.nextInt();

        Pet[] pets = new Pet[total]; // создали массив для хранения объектов

        System.out.println("Fill in the data: ");
        for (int i = 0; i < total; i++)
        {
            System.out.printf("Fill ID of the %d pet: ", i+1);
            int id = scanner.nextInt();

            System.out.printf("Fill Type of the %s pet: ", i+1);
            scanner.nextLine();
            String type = scanner.nextLine();

            System.out.printf("Fill Age of the %d pet: ", i+1);
            int age = scanner.nextInt();

            System.out.printf("Fill Name of the %s pet: ", i+1);
            scanner.nextLine();
            String name = scanner.nextLine();

            pets[i] = new Pet(id, type, age, name); // создали новый объект массива
        }
        for (int i = 0; i < pets.length; i++)
        {
            System.out.printf("\nInformation about %d pet: %s :", i+1, pets[i].toString());
            System.out.println("\nPet's day: ");
           // Pet.PetDays();
        }
    }


}

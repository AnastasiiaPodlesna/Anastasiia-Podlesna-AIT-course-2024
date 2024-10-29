package coffeemashine;

import java.util.Scanner;

public class CoffeAppl
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Coffee Shop!");

        Coffee[] coffees = Coffee.values();

        Scanner scanner = new Scanner(System.in);


        while (true)
        {
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1, 2, 3, 4 ->
                {
                    System.out.println("Your choice is: " + coffees[choice - 1].getTitle());
                    System.out.println("Pls, make pauyment: " + coffees[choice - 1].getPrice());
                }

                default ->
                {
                    System.out.println("Wrong choice");
                    scanner.close();
                    break;
                }
            }
        }
    }


}

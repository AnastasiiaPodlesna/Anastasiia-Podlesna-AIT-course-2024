package classwork.compare_computers;

import java.util.Scanner;

public class CompareComputers
{
    public static void main(String[] args)
    {
        Computer comp1 = new Computer("i7", 32, 1024, "HP", 1500);
        System.out.println("comp1: " + comp1);
        Computer comp3 = new Computer("",0,0,"",0);
        System.out.println("comp3: " + comp3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input CPU: ");
        String cpu = scanner.nextLine();

        System.out.println("Input RAM: ");
        int ram = scanner.nextInt();

        System.out.println("Input SSD: ");
        int ssd = scanner.nextInt();

        System.out.println("Input brand: ");
        String brand = scanner.nextLine();

        System.out.println("Input price: ");
        double price = scanner.nextDouble();

        Computer comp2 = new Computer(cpu, ram, ssd, brand, price);

        System.out.println("----------------------------------------------------------");
        System.out.println("Input price comp3: ");
        comp3.setPrice(scanner.nextDouble());
        System.out.println("comp3: " + comp3);
        System.out.println("----------------------------------------------------------");

        // boolean checker = (comp1 == comp2);

        boolean checker = comp1.equals(comp2);
        System.out.println(checker);
        

        

    }
}

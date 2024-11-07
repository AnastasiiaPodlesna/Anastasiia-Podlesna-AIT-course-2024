package homework.supermarket_LinkedList;

import homework.supermarket_LinkedList.dao.Menu;
import homework.supermarket_LinkedList.dao.Supermarket;
import homework.supermarket_LinkedList.dao.SupermarketImpl;
import homework.supermarket_LinkedList.model.Product;

import java.time.LocalDate;
import java.util.*;

public class SupermarketAppl
{
    public static void main(String[] args)
    {
        LocalDate now = LocalDate.now();
        Supermarket supermarket = new SupermarketImpl();
        Collection<Product> products = new LinkedList<>();
        Menu[] menu = Menu.values();
        Scanner scanner = new Scanner(System.in);

        products.add(new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5)));
        products.add(new Product(222222, "ChocoMilk", "Dairy", "MilkLand", 13, now.minusDays(3)));
        products.add(new Product(333333, "Cheese Gouda", "Dairy", "Farmer", 22.5, now.plusDays(50)));
        products.add(new Product(444444, "Cheese Cheddar", "Dairy", "MilkLand", 30, now.plusDays(85)));
        products.add(new Product(555555, "Sweet Beans", "Bread", "Kolosok", 18.3, now.minusDays(25)));

        products.forEach(supermarket::addProduct);


        //menu
        System.out.println(Arrays.toString(menu));

        while (true)
        {
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();

            if (choice < 0 || choice > 6)
            {
                System.out.println("Wrong input...");
                continue;
            }

            switch (choice)
            {
                case 1 ->
                {
                    System.out.println("Your choice is: " + menu[choice - 1].getNum() + " => " + menu[choice - 1].getMenu() + "\n");

                    System.out.println(products);
                    System.out.println("--------------------------------------------");
                }
                case 2 ->
                {
                    System.out.println("Your choice is: " + menu[choice - 1].getNum() + " => " + menu[choice - 1].getMenu()+ "\n");
                    System.out.println(supermarket.findProductsWithExpiredDate());
                    System.out.println("-----------------------------------------------");
                }
                case 3 ->
                {
                    System.out.println("Your choice is: " + menu[choice - 1].getNum() + " => " + menu[choice - 1].getMenu() + "\n");

                    int step = 1;
                    for (String category : uniqueCategory(products))
                    {
                        System.out.println(step++ + " => " + category);
                    }

                    int choice3 = scanner.nextInt();

                    if (choice3 < 0 || choice3 > step)
                    {
                        System.out.println("Wrong input...");
                        break;
                    }

                    System.out.println(supermarket.findByCategory(selection(choice3, uniqueCategory(products))));
                    System.out.println("-----------------------------------------------");

                }
                case 4 ->
                {
                    System.out.println("Your choice is: " + menu[choice - 1].getNum() + " => " + menu[choice - 1].getMenu() + "\n");

                    int step = 1;
                    for (String brand :uniqueBrand(products))
                    {
                        System.out.println(step++ + " => " + brand);
                    }

                    int choice4 = scanner.nextInt();

                    if (choice4 < 0 || choice4 > step)
                    {
                        System.out.println("Wrong input...");
                        break;
                    }

                    System.out.println(supermarket.findByBrand(selection(choice4, uniqueBrand(products))));
                    System.out.println("-----------------------------------------------");
                }
                case 5 ->
                {
                    System.out.println("Your choice is: " + menu[choice - 1].getNum() + " => " + menu[choice - 1].getMenu() + "\n");

                    int step = 1;
                    for (String bc : uniqueBarCode(products))
                    {
                        System.out.println(step++ + " => " + bc);
                    }

                    int choice5 = scanner.nextInt();

                    if (choice5 < 0 || choice5 > step)
                    {
                        System.out.println("Wrong input...");
                        break;
                    }

                    System.out.println(supermarket.findByBarCode(Long.parseLong(selection(choice5, uniqueBarCode(products)))));
                    System.out.println("-----------------------------------------------");
                }
                case 6 ->
                {
                    System.out.println("Good by...");
                    return;
                }
            }
        }

    }


    // поиск категории по индексу из уникального множества категорий
    private static String selection(int choice, Set<String> list)
    {
        String select = null;
        int index = 1;
        for (String str : list)
        {
            if (index == choice)
            {
                select = str;
                break;
            }
            index++;
        }
        return select;
    }

    // уникальное множество категорий продуктов
    public static HashSet<String> uniqueCategory(Collection<Product> products)
    {
        HashSet<String> uniqueCategory = new HashSet<>();

        for (Product category : products)
        {
            uniqueCategory.add(category.getCategory());
        }
        return uniqueCategory;
    }

    // уникальное множество брендов продуктов
    public static HashSet<String> uniqueBrand(Collection<Product> products)
    {
        HashSet<String> uniqueBrand = new HashSet<>();

        for (Product brand : products)
        {
            uniqueBrand.add(brand.getBrand());
        }
        return uniqueBrand;
    }

    // уникальное множество баркодов продуктов
    public static HashSet<String> uniqueBarCode(Collection<Product> products)
    {
        HashSet<String> uniqueBarCode = new HashSet<>();

        for (Product bc : products)
        {
            uniqueBarCode.add(String.valueOf(bc.getBarCode()));
        }
        return uniqueBarCode;
    }

}

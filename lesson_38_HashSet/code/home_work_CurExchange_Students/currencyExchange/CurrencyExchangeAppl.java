package home_work_CurExchange_Students.currencyExchange;

// Создайте enum с кодами валют и их текущими курсами к евро. Убедитесь, что в списке нет дублирующихся кодов валют. Выведите список валют и их курсов на экран.
// Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество
// и узнать, сколько он получит при обмене на евро.

import java.util.*;

public class CurrencyExchangeAppl
{
    public static void main(String[] args)
    {
        List<CurrencyExchange> currencyExchangeList = new ArrayList<>(); // список валют с курсами из ENUM
        Scanner scanner = new Scanner(System.in);

        for (CurrencyExchange currency : CurrencyExchange.values())
        {
            currencyExchangeList.add(currency); // добавление валют в список
        }

        // проверка на то, что в списке нет дублирующихся кодов валют
        if (checkDuplicateCurrencyCodes(currencyExchangeList) != null)
        {
            System.out.println("Duplicate availability: ");
            printList(checkDuplicateCurrencyCodes(currencyExchangeList));

        }


        System.out.println("List of available currencies and their exchange rates to euro:");
        printList(currencyExchangeList); // вывод списка валют с курсами на экран

        System.out.println("Enter the number of the currency to be exchanged with ");
        int choice = -1;
        while (choice < 0 || choice > 5)
        {
            choice = scanner.nextInt();  // выбор пользователем валюты по номеру

            if (choice < 0 || choice > 5)
            {
                System.out.println("Invalid input! Try again please...");
            }
        }

        System.out.println("Input the amount of money in: " + currencyExchangeList.get(choice).getCurrency_codes());
            double amountOfMoney = scanner.nextDouble(); // ввод пользователем суммы для обмена

        // вывод на экран всей информации по обмену валют
        System.out.println(amountOfMoney + currencyExchangeList.get(choice).getCurrency_codes() + " <=> " + currencyExchanger(amountOfMoney, currencyExchangeList.get(choice).getCurrent_exchange()));
    }


    private static double currencyExchanger(double amountOfMoney, double currencyExchange)
    {
        return amountOfMoney * currencyExchange;
    }

    public static List<CurrencyExchange> checkDuplicateCurrencyCodes(List<CurrencyExchange> currencyExchangeList)
    {
        List<CurrencyExchange> duplicateList = new ArrayList<>();

        for (int i = 0; i < currencyExchangeList.size() / 2; i++)
        {
            for (int j = currencyExchangeList.size() / 2; j < currencyExchangeList.size(); j++)
            {
                if(currencyExchangeList.get(i).getCurrency_codes().equals(currencyExchangeList.get(j).getCurrency_codes()))
                {
                    duplicateList.add(currencyExchangeList.get(i));
                }
            }
        }
        return duplicateList;
    }



    private static void printList(List<CurrencyExchange> currencyExchangeList)
    {
        for (CurrencyExchange rate : currencyExchangeList)
        {
            System.out.println(rate.ordinal() + " => " + rate + " ");  // с порядковым номером
        }
        System.out.println("\n------------------------------------------------------------------------");
    }
}

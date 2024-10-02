package homework;

// Анна использует различные электроприборы в своем доме.
// У неё есть холодильник, который потребляет 150 Вт, и кондиционер с потреблением 2000 Вт.
// Анна хочет узнать, сколько она тратит на электроэнергию в месяц, если стоимость 1 кВт·ч
// составляет 0.15 евро.
// Сколько электроэнергии тратят холодильник и кондиционер вместе в час? (calculateHourlyConsumption)
// Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)

import java.util.Scanner;

public class ElectricalAppliancesInHome
{

    public static void main(String[] args)
    {
        double refrigerator = 0.150;  // холодильник
        double air_conditioner = 2.0;   // кондиционер
        double kWh = 0.15;            // стоимость кВт/час
        double calculateHourlyConsumption = 0;
        double calculateMonthlyCost = 0;
        int numberDays = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("\nInput the number (1 - 12) of the month 2024 for which you want to receive electricity calculation:\n ");
        System.out.println("January(1), February(2), March(3), April(4), May(5), June(6), July(7), August(8),");
        System.out.println("September(9), October(10), November(11), December(12)");

        switch (in.nextInt())
        {
            case 1 -> numberDays = 31;
            case 2 -> numberDays = 29;
            case 3 -> numberDays = 31;
            case 4 -> numberDays = 30;
            case 5 -> numberDays = 31;
            case 6 -> numberDays = 30;
            case 7 -> numberDays = 31;
            case 8 -> numberDays = 31;
            case 9 -> numberDays = 30;
            case 10 -> numberDays = 31;
            case 11 -> numberDays = 30;
            case 12 -> numberDays = 31;
        }

        calculateHourlyConsumption = (refrigerator + air_conditioner) * kWh;
        calculateMonthlyCost = calculateHourlyConsumption * numberDays;

        System.out.printf("A refrigerator and an air conditioner together consume: %.2f kWh\n", calculateHourlyConsumption);
        System.out.printf("Anna spends %.2f euros per month on electricity ", calculateMonthlyCost);

    }
}



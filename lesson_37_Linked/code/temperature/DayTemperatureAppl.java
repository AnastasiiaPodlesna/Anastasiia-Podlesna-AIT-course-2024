package temperature;

// Имеются результаты измерений температуры в городе за последнюю неделю октября и первую неделю ноября.
// Создайте класс DayTemperature c полями:
// LocalDate date; double temperature;
// Сформируйте два ArrayList и внесите в них данные измерений температуры.
// Рассчитайте среднюю температуру в городе за прошедшие две недели.
// В какой день была минимальная температура? В какой день максимальная?

import java.time.LocalDate;
import java.util.*;

public class DayTemperatureAppl
{
    private static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args)
    {
        List<DayTemperature> dayTempForLastWeekOfOct = new ArrayList<>();
        List<DayTemperature> dayTempForFirstWeekOfNov = new ArrayList<>();

        LocalDate startDayOct = LocalDate.of(2024, 10, 25);
        LocalDate startDayNov = LocalDate.of(2024, 11, 1);

        // создаем лист с данными за последнюю неделю октября
        dayTempForLastWeekOfOct.addAll(listFilling(startDayOct, 10, 18));
        System.out.println("Results of temperature measurements in the city for the last week of October:");
        printList(dayTempForLastWeekOfOct);

        // создаем лист с данными за первую неделю ноября
        dayTempForFirstWeekOfNov.addAll(listFilling(startDayNov, 0, 14));
        System.out.println("Results of temperature measurements in the city for the last week of first week of November:");
        printList(dayTempForFirstWeekOfNov);

        // создаем общий лист dayTempForTwoWeek
        List<DayTemperature> dayTempForTwoWeek = new ArrayList<>(dayTempForLastWeekOfOct);
        dayTempForTwoWeek.addAll(dayTempForFirstWeekOfNov);
        System.out.println("Results of temperature measurements in the city for the last two weeks:");
        printList(dayTempForTwoWeek);

        // находим среднюю температуру в городе за прошедшие две недели
        double averageTemp = averageTempForTwoWeeks(dayTempForTwoWeek);
        System.out.printf("The average temperature in the city for the past two weeks => %.2f ℃.", averageTemp);
        System.out.println("\n------------------------------------------------------------------------");

        // находим в какой день была минимальная температура, в какой день максимальная
        LocalDate minTempDay = findMinMaxTemp(dayTempForTwoWeek, 1);
        LocalDate maxTempDay = findMinMaxTemp(dayTempForTwoWeek, -1);
        System.out.println(minTempDay + " was the minimum temperature, " + maxTempDay + " was the maximum temperature");
    }

    private static LocalDate findMinMaxTemp(List<DayTemperature> dayTempForTwoWeek, int flag)
    {
        if (flag == 1)
        {
            dayTempForTwoWeek.sort(Comparator.comparing(DayTemperature::getTemperature));
        }
        else if (flag == -1)
        {
            dayTempForTwoWeek.sort(Comparator.comparing(DayTemperature::getTemperature).reversed());
        }
        return dayTempForTwoWeek.get(0).getDate();
    }

    private static double averageTempForTwoWeeks(List<DayTemperature> dayTempForTwoWeek)
    {
        int countTemp = 0;

        for (DayTemperature temperature : dayTempForTwoWeek)
        {
            countTemp += temperature.getTemperature();
        }
        return (double) countTemp / DAYS_IN_WEEK;
    }

    private static List<DayTemperature> listFilling(LocalDate startDay, int minTemp, int maxTemp)
    {
        List<DayTemperature> dayTemp = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < DAYS_IN_WEEK; i++)
        {
            dayTemp.add(new DayTemperature(startDay, random.nextInt(minTemp, maxTemp)));
            startDay = startDay.plusDays(1);

        }
        return dayTemp;
    }

    private static void printList(List<DayTemperature> dayTemp)
    {
        for (DayTemperature day: dayTemp)
        {
            System.out.println(day);
        }
        System.out.println("\n------------------------------------------------------------------------");
    }
}

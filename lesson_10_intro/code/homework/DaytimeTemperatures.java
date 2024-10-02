package homework;

// Собрать в массив данные о дневной температуре в вашем городе за прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class DaytimeTemperatures
{
    public static void main(String[] args)
    {
        int temperature[] = new int[7];
        Scanner in = new Scanner(System.in);
        int sum = 0;


//        LocalDate lastMonday = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY)); // текущий понедельник
//        LocalDate lastTuesday = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)); // текущий вторник
//        LocalDate lastThursday = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)); // текущий четверг
//
        LocalDate currentDATE = LocalDate.now(); // дата сегодняшняя гггг-мм-дд
        LocalDate lastDATE = currentDATE.minusWeeks(1); // вычли неделю - тот же день недели неделю ранее гггг-мм-дд

        LocalDate lastMonday = lastDATE.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));// понедельник на прошлой неделе
        LocalDate lastTuesday = lastMonday.plusDays(1);  // TUESDAY
        LocalDate lastThursday = lastMonday.plusDays(3);// THURSDAY

        for (int i = 0; i < temperature.length; i++)
        {
            LocalDate day = lastMonday.plusDays(i); // заполняем массив, нач. с прошлой недели (понедельника)
            System.out.print("Input temperature for " + day.getDayOfWeek() + " " + day + " ");
            temperature[i] = in.nextInt();
        }

        System.out.println("Thursday's temperature " + lastTuesday + " was: " + temperature[1] + " degrees Celsius.");
        System.out.println("Thursday's temperature " + lastThursday + " was: " + temperature[3] + " degrees Celsius.");

        for (int i = 0; i < temperature.length; i++)
        {
            sum = sum + temperature[i];
        }

        sum = sum / temperature.length;

        System.out.println("Last week's average temperature was " + sum + " degrees Celsius.");

    }
}
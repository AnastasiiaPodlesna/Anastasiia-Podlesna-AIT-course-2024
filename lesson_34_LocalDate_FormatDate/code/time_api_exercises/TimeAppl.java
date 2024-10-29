package time_api_exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeAppl
{
    public static void main(String[] args)
    {
        // how much time? ISO format YYYY-mm-DD
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDateTime lt = LocalDateTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate gagarin = LocalDate.of(1961, 04, 12);
        System.out.println(gagarin);
        System.out.println(gagarin.getDayOfWeek());

        System.out.println("-----------------------------------");
        System.out.println("Высокосный год? Is leap? ");
        int year = 2024;
        System.out.println(year + " is " + Year.isLeap(year));

        System.out.println("-----------------------------------");
        System.out.println(gagarin.isBefore(ld)); // true
        System.out.println(gagarin.isAfter(ld)); // false

        System.out.println("-----------------------------------");
        //LocalDate days = LocalDate.ofEpochDay(ChronoUnit.DAYS.between(gagarin, ld));

        long period = ChronoUnit.YEARS.between(gagarin, ld);
        System.out.println(period); // 63

        System.out.println("----------- Date Time Formatter ------------------------");

        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE; // ISO format YYYY-mm-DD
        String date = gagarin.format(df); // LocalDate (df)  to String (date)
        System.out.println(date);
        // change format
        df = DateTimeFormatter.BASIC_ISO_DATE;
        date = gagarin.format(df);
        System.out.println(date);

        System.out.println("-----------------------------------");
        df = DateTimeFormatter.ofPattern("dd/M/yy"); // делаем разные форматы
        date = gagarin.format(df);
        System.out.println(date);

        System.out.println("-----------------------------------");
        df = DateTimeFormatter.ofPattern("dd/MMMM/YYYY"); // делаем разные форматы
        date = gagarin.format(df);
        System.out.println(date);

        // задаем locale
        System.out.println("-----------------------------------");
        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.CHINA);
        date = gagarin.format(df);
        System.out.println(date);

        // parsing LocalDate from Date
        System.out.println("-----------------------------------");
        String stringDate = "29:10:2024";
        LocalDate result = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd:MM:yyyy]")); // в квадратных скобках могут разные форматы ([][][]...)
        System.out.println(result);


    }

}

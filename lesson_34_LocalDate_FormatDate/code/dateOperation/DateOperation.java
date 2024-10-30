package dateOperation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation
{

    public static int getAge (String birthday)//"12/04/1961","1961-11-28"
    {
        LocalDate localDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]")); // привели строку в ISO формат LocalDate
        int age = (int) ChronoUnit.YEARS.between(localDate, LocalDate.now());

        return age;
    }


    public static String[] sortStringDates(String[] dates)
    {
        DateString[] dateStrings = new DateString[dates.length];

        // преобразовываем строки в объекты DateString
        for (int i = 0; i < dates.length; i++)
        {
            String format = dates[i].contains("/") ? "dd/MM/yyyy" : "yyyy-MM-dd";
            dateStrings[i] = new DateString(dates[i], format);
        }

        // сортируем объекты DateString по LocalDate
        Arrays.sort(dateStrings, (a, b) -> a.toLocalDate().compareTo(b.toLocalDate()));

        // создаем отсортированный массив строк
        for (int i = 0; i < dateStrings.length; i++)
        {
            dates[i] = dateStrings[i].getDateString();
        }
        return dates;
    }

}

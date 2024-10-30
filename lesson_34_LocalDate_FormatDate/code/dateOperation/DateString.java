package dateOperation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateString
{
    private String dateString;
    private String format;

    public DateString(String dateString, String format)
    {
        this.dateString = dateString;
        this.format = format;
    }

    public String getDateString()
    {
        return dateString;
    }

    public LocalDate toLocalDate() // преобразование строки в LocalDate
    {
        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern(format));
    }

}

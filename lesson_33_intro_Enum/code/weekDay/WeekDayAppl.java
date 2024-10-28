package weekDay;

public class WeekDayAppl
{
    public static void main(String[] args)
    {
        WeekDay weekDay = WeekDay.TUE;
        int inDay = 35;

        System.out.println("\nThe сurrent day is " + weekDay.getName() + ", and in " + inDay +  " days it will be " + weekDay.findPlusDay(inDay).getName());
    }
}

package weekDay;

public enum WeekDay
{
    MON("Monday", 1), TUE("Tuesday", 2), WED("Wednesday", 3), THU("Thursday", 4), FRI("Friday", 5), SAT("Saturday", 6), SUN("Sunday", 7);

    private String name;
    private int dayNumber;

    WeekDay(String name, int dayNumber)
    {
        this.name = name;
        this.dayNumber = dayNumber;
    }

    public String getName()
    {
        return name;
    }

    public int getDayNumber()
    {
        return dayNumber;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("weekDay.WeekDay{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dayNumber=").append(dayNumber);
        sb.append('}');
        return sb.toString();
    }

    public WeekDay findPlusDay(int step)
    {
        WeekDay[] weekDays = WeekDay.values();
        return weekDays[(this.ordinal() + step) % weekDays.length];
    }

}

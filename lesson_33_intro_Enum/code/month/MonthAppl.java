package month;

public class MonthAppl
{
    public static void main(String[] args)
    {
        Month m = Month.AUG;
        System.out.println(m);

        m = m.plusMonth( 6);
        System.out.println(m);
    }

}

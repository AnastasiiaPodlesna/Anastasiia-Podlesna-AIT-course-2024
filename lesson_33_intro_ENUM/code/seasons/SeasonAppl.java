package seasons;

// Задать ENUM seasons - времена года (Summer, Autumn, Winter, Spring)
// Опробовать на нем методы:
// .values()
// .toString
// .ordinal()
// .valueOf()

public class SeasonAppl
{
    public static void main(String[] args)
    {
        Season[] seasons= Season.values();

        System.out.println("-------------------- values of Enum ------------------------");
        for (int i = 0; i < seasons.length; i++)
        {
            System.out.println(seasons[i]);
            System.out.println(seasons[i].getNumber() + " : " + seasons[i].getName());
        }

        System.out.println("--------------------------------------------------------------");

        // foreach
        for (Season s : seasons)
        {
            System.out.println(s.getName());
            System.out.println(s.getDuration());
        }

        System.out.println("------------ toString() --------------");
        String str = Season.AUTUMN.toString();
        System.out.println(str);

        System.out.println("------------ ordinal() --------------");
        int num = Season.AUTUMN.ordinal(); // индекс в массиве сезонов
        System.out.println(num);

        System.out.println("------------ valueOf() --------------");
        Season s = Season.valueOf("SPRING");
        System.out.println(s);
    }
}

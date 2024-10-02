package HomeWork;

public class Jack
{

public static void main(String[] args)
{
    System.out.println("'Дом, который построил Джек' \n" +
                           "              Самуил Маршак \n" );
    home();
    System.out.println("А это пшеница ");
    wheat();
    System.out.println("А это весёлая птица-синица,");
    bird();
    System.out.println("Вот кот,");
    cat();
    System.out.println("Вот пёс без хвоста,");
    dog();
    System.out.println("А это корова безрогая,");
    cow();
    System.out.println("А это старушка, седая и строгая,");
    granny();
    System.out.println("А это ленивый и толстый пастух,");
    shepherd();
    System.out.println("Вот два петуха,");
    roosters();
}

    public static void jackHouse()
    {
        System.out.println("В доме,\n" +
                "Который построил Джек.\n");
    }

    public static void home()
    {
        System.out.println("Вот дом,\n" +
                    "Который построил Джек.\n");
    }

    public static void wheat()
    {
        System.out.println("Которая в тёмном чулане хранится");
        jackHouse();
    }

    public static void bird()
    {
        System.out.println("Которая часто ворует пшеницу,");
        wheat();
    }

    public static void cat()
    {
        System.out.println("Который пугает и ловит синицу,");
        bird();
    }

    public static void dog()
    {
        System.out.println("Который за шиворот треплет кота,");
        cat();
    }

    public static void cow()
    {
        System.out.println("Лягнувшая старого пса без хвоста,");
        dog();
    }

    public static void granny()
    {
        System.out.println("Которая доит корову безрогую,");
        cow();
    }

    public static void shepherd()
    {
        System.out.println("Который бранится с коровницей строгою,");
        granny();
    }

    public static void roosters()
    {
        System.out.println("Которые будят того пастуха,");
        shepherd();
    }

}







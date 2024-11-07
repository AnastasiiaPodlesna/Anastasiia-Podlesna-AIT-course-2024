import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetString
{
    public static void main(String[] args)
    {
        TreeSet<String> rivers = new TreeSet<>(Arrays.asList("Volga", "Lech", "Rein", "Elbe", "Neva", "Dunau", "Isar"));

        System.out.println(rivers.size());
        System.out.println(rivers);

        System.out.println("-----------------------------------------");


        for (String str : rivers)
        {
            System.out.println();
        }
        System.out.println("-----------------------------------------");

        System.out.println(rivers.higher("Rein")); // Volga
        System.out.println(rivers.lower("Rein")); // Neva

        System.out.println("-----------------------------------------");
    }
}

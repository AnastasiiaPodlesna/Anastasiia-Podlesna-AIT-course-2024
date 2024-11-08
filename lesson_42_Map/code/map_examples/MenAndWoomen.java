package map_examples;

import java.util.HashMap;
import java.util.Map;

public class MenAndWoomen
{
    public static void main(String[] args)
    {
        Map<String, String> genderMap = new HashMap<>();
        genderMap.put("LK", "m");
        genderMap.put("AD", "m");
        genderMap.put("DM", "m");
        genderMap.put("GA", "f");
        genderMap.put("JR", "m");
        genderMap.put("OF", "f");
        genderMap.put("DV", "f");
        genderMap.put("GT", "f");

        // 1 option - проходим по Keys, KeySet

        int men = 0;
        for (String name : genderMap.keySet())
        {
            if (genderMap.get(name).equals("m"))
            {
                men++;
            }
        }

        int s = genderMap.size();
        int women = s - men;
        System.out.println("Men: " + men + ", woomwen " + women);


        // 2 option - проходим по values, values()

        for (String value : genderMap.values())
        {
            if(value.equals("f"))
            {
                women++;
            }
        }
        System.out.println(women);
    }
}

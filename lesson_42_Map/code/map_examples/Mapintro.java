package map_examples;

// сформируем Map - города и население

import java.util.*;

public class Mapintro
{
    public static void main(String[] args)
    {


        Map<String, Integer> cityMap = new TreeMap<>();

        cityMap.put("Hamburg", 1_800_000);
        cityMap.put("Berlin", 3_500_000);
        cityMap.put("Munich", 1_500_000);
        cityMap.put("Cologne", 1_080_000);
        cityMap.put("Ingolstadt", 140_000);
        cityMap.put("Augsburg", 350_000);
        cityMap.put("Isny", 14_835);
        cityMap.put("Odessa", 1_500_000);

        System.out.println(cityMap.size());  // 8
        System.out.println(cityMap.isEmpty()); // false

        System.out.println("-------------------------------------------");
        Integer population = cityMap.get("Berlin");
        System.out.println(population);

        population = cityMap.get("Augsburg");
        System.out.println(population);

        System.out.println("-------------------- containsKey-------------------");
        System.out.println(cityMap.containsKey("Isny")); // true
        System.out.println(cityMap.containsKey("Willich")); // false

        System.out.println("-------------------- total population -----------------");
        int totalPopulation = 0;
        List<Integer> tp = new ArrayList<>(cityMap.values());
        System.out.println(tp);
        for(Integer p: tp)
        {
            totalPopulation += p;
        }

        System.out.println("Total population: " + totalPopulation);

        System.out.println("-------------------- set of cities -----------------");

        Set<String> citySet = cityMap.keySet();
        citySet.forEach(System.out::println);

        System.out.println("-------------------- map -----------------");

              // аналоги

//        for (String key : cityMap.keySet())
//        {
//            System.out.println("Key: " + key + "value: " + cityMap.get(key));
//        }


        cityMap.forEach((key, value) -> System.out.println("Key: " + key + " value: " + value));

        cityMap.forEach((key, value) -> System.out.println(String.format("Key: %s value: %d", key, value)));








    }
}

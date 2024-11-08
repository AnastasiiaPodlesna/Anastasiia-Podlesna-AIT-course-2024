package map_examples.homework;

// Соберите в структуру Map порядка 20 стран, по несколько стран из разных континентов Земли. Подсчитайте количество стран на континентах из полученного списка.

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountriesAndContinents
{
    public static void main(String[] args)
    {
        // ключ - название континента, значение - список стран этого континента
        Map<String, List<String>> continentCountryMap = new HashMap<>();

        continentCountryMap.put("Europe", Arrays.asList("Germany", "France", "Italy", "Spain", "Poland"));

        continentCountryMap.put("Asia", Arrays.asList("Japan", "China", "India", "South Korea", "Thailand"));

        continentCountryMap.put("North America", Arrays.asList("United States", "Canada", "Mexico"));

        continentCountryMap.put("Africa", Arrays.asList("Nigeria", "Egypt", "South Africa", "Kenya"));


        continentCountryMap.forEach( (continent, countries) ->
        {
            System.out.print("Continent '" + continent + "' => countries " + countries);

            System.out.println(" :: " + countriesInContinentCounter(countries) + " pcs");
        }
        );
    }

    private static int countriesInContinentCounter(List<String> countries)
    {
        return countries.size();
    }
}

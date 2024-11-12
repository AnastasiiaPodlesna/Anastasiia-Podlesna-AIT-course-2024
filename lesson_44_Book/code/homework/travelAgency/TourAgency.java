package homework.travelAgency;

import java.util.Arrays;
import java.util.List;

    public class TourAgency
    {

        static class Tourist
        {
            private String name;
            private List<String> countriesVisited;

            public Tourist(String name, String... countries)
            {
                this.name = name;
                this.countriesVisited = Arrays.asList(countries);
            }

            public String getName()
            {
                return name;
            }

            public List<String> getCountriesVisited()
            {
                return countriesVisited;
            }
        }
}

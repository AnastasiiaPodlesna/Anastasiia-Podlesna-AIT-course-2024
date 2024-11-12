package homework.travelAgency;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TourAgencyAppl
{
    public static void main(String[] args)
    {
        // список туристов
        List<TourAgency.Tourist> tourists = getTourists();

        // 1. Какие страны наиболее популярны?
        Map<String, Long> countryPopularity = tourists.stream()
                .flatMap(tourist -> tourist.getCountriesVisited().stream()) // извлекаем все страны, посещенные туристами
                .filter(country -> Arrays.asList("Spain", "France", "Italy", "Greece", "Turkey", "Tunisia").contains(country)) // Фильтруем только страны Средиземноморья
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Считаем количество посещений каждой страны

        // Выводим наиболее популярные страны
        System.out.println("Most popular countries:");
        countryPopularity.forEach((country, count) -> System.out.println(country + ": " + count));

        // 2. Кто из клиентов посетил наибольшее количество стран?
        TourAgency.Tourist mostVisitedTourist = tourists.stream()
                .max(Comparator.comparingInt(tourist -> tourist.getCountriesVisited().size())) // находим туриста с наибольшим количеством стран или выбрасываем исключение, если не найден
                .orElseThrow(() -> new NoSuchElementException("No tourist found"));

        // Выводим туриста, который посетил наибольшее количество стран
        System.out.println("\nTourist who visited the most countries:");
        System.out.println(mostVisitedTourist.getName() + " visited " + mostVisitedTourist.getCountriesVisited().size() + " countries.");
    }

    // Метод, который возвращает список туристов
    private static List<TourAgency.Tourist> getTourists()
    {
        return List.of(
                new TourAgency.Tourist("Name", "C1", "C2", "C3"),
                new TourAgency.Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
                new TourAgency.Tourist("Bilbo Baggins", "Italy", "Spain", "Turkey"),
                new TourAgency.Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
                new TourAgency.Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
                new TourAgency.Tourist("Sergei_B", "Tunis", "Turkey", "China", "Vietnam"),
                new TourAgency.Tourist("Galina", "Italy", "France", "Italy"),
                new TourAgency.Tourist("Anatoly", "Montenegro", "Albania", "Greece", "Italy"),
                new TourAgency.Tourist("Andrii", "UK", "Ireland", "Spain"),
                new TourAgency.Tourist("Liubov", "Croatien", "Slovenien", "Spain", "France", "Egypt"),
                new TourAgency.Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
                new TourAgency.Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
                new TourAgency.Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
                new TourAgency.Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
                new TourAgency.Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
                new TourAgency.Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
                new TourAgency.Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
                new TourAgency.Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
                new TourAgency.Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
                new TourAgency.Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
                new TourAgency.Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
                new TourAgency.Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
                new TourAgency.Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                new TourAgency.Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
                new TourAgency.Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
                new TourAgency.Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
                new TourAgency.Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
                new TourAgency.Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );
    }


}

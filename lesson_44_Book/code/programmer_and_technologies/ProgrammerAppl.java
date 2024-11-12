package programmer_and_technologies;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProgrammerAppl
{
    public static void main(String[] args)
    {

        // data set
        List<Programmer> programmers = fillListProgrammers(); // новый объект
        // System.out.println(programmers);
        programmers.forEach(System.out::println);

        // print Technology
        System.out.println("========= List of technologies ==================");
        printTechnologies(programmers);

        System.out.println("========= Frequency, popular technologies ==================");
        // technology => frequency
        printTechnologiesByFrequency(programmers);

        System.out.println("========= Frequency, popular technologies, sorted ==================");
        printTechnologiesByFrequencySorted(programmers);

        System.out.println("============ Technology rating =========================");
        sortTechnologiesByFrequency(programmers);

        System.out.println("=================== Most Skilled Programmers ==================");
        printMostSkilledProgrammers(programmers);

    } // enf of main

    private static void printMostSkilledProgrammers(List<Programmer> programmers) {
        Map<Integer, List<Programmer>> skilledProgrammers = programmers.stream()
                .collect(Collectors.groupingBy(p -> p.getTechnology().size()));

        skilledProgrammers.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("-------------------------------------");
        // ищем max
        int max = skilledProgrammers.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        List<Programmer> champ = programmers.stream()
                .filter(programmer -> programmer.getTechnology().size() == max)
                .toList();
        System.out.println(champ);

    }


    private static void printTechnologiesByFrequencySorted(List<Programmer> programmers) {
        List<String> technologies = programmers.stream()
                .map(Programmer::getTechnology)
                .flatMap(List::stream)
                .distinct()
                .sorted().toList();
        technologies.forEach(System.out::println);
    }

    private static void sortTechnologiesByFrequency(List<Programmer>programmers) {
        // Map frequency => technology
        Map< String , Long > technologiesByFrequency = programmers.stream()
                .map(Programmer::getTechnology)  // получаем список технологий каждого программиста
                .flatMap(List::stream)           // объединяем списки в единый поток
                .collect(Collectors.groupingBy(   // группируем по названию технологии
                        technology -> technology,     // ключ - название технологии
                        Collectors.counting()         // считаем количество каждой технологии
                ));
        technologiesByFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue())) //
                .forEach(entry -> System.out.printf("Технология: %s, Частота: %d%n", entry.getKey(), entry.getValue()));
    }

    private static void printTechnologiesByFrequency(List<Programmer> programmers) {
        // Map frequency => technology
        Map<String, Long> technologiesByFrequency = programmers.stream()
                .map(Programmer::getTechnology)  // получаем список технологий каждого программиста
                .flatMap(List::stream)           // объединяем списки в единый поток
                .collect(Collectors.groupingBy(   // группируем по названию технологии
                        technology -> technology,     // ключ - название технологии
                        Collectors.counting()         // считаем количество каждой технологии
                ));
        System.out.println(technologiesByFrequency);

    }

    private static void printTechnologies(List<Programmer> programmers) {
        List<String> technologies = programmers.stream()
                .map(Programmer::getTechnology) // взяли списки с языками
                .flatMap(List::stream) // объединили в один список, чтобы работать с новым потоком
                // .distinct()// убрали дубликаты
                .sorted()
                .toList();
        System.out.println(technologies);
        // 2-й способ убрать дубли
        StreamSupport.stream(technologies.spliterator(), false)
                .distinct()
                .forEach(System.out::println);
    }

    private static List<Programmer> fillListProgrammers() {
        return List.of(
                new Programmer("Peter", List.of("C++", "Python", "Java", "Kotlin")),
                new Programmer("John", List.of("Python", "Java")),
                new Programmer("Helen", List.of("Kotlin", "Scala", "Java", "JavaScript")),
                new Programmer("Jakob", List.of("Python", "Go")),
                new Programmer("Mike", List.of("Fortran", "Algol", "PL-1"))
        );
    }
}
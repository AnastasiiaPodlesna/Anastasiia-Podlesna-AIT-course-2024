package homework.book;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BooksAppl
{
    private static List<String> types = Arrays.asList("History", "Roman", "Novella", "Tale", "Fantastic", "Adventure", "Fantasy");

    public static void main(String[] args)
    {
        List<Book> books = generateBooks(10); //  10 книг

        // вывод всех книг
        System.out.println("================ Library ===================");
        books.forEach(book -> System.out.println(book + " => " + book.getTypeAndCapacity().values() + " pgs"));

        // среднее количество страниц по всем книгам
        System.out.println("\n========= average number of pages in books =========");
        double averagePages = calculateAveragePages(books);
        System.out.println("Average pages: " + averagePages);

        // сортировка книг по количеству страниц
        System.out.println("\n========= Books sorted by pages =========");
        books.stream()
                .sorted(Comparator.comparingInt(b -> b.getTypeAndCapacity().values().stream().findFirst().get()))
                .forEach(book -> System.out.println(book + " => " + book.getTypeAndCapacity().values().stream().findFirst().get() + " pages"));

        // фильтрация книг с более чем 150 страницами
        System.out.println("\n========= Books with more than 150 pages =========");
        books.stream()
                .filter(book -> book.getTypeAndCapacity().values().stream().findFirst().get() > 150)
                .forEach(book -> System.out.println(book + " => " + book.getTypeAndCapacity().values().stream().findFirst().get() + " pages"));

        // группировка книг по жанру
        System.out.println("\n========= Grouped by genre =========");
        Map<String, List<Book>> booksByGenre = groupBooksByGenre(books);
        booksByGenre.forEach((genre, booksList) ->
        {
            System.out.println(genre + ":");
            booksList.forEach(book -> System.out.println("  " + book + " => " + book.getTypeAndCapacity().values().stream().findFirst().get() + " pages"));
        });

        // книга с максимальным количеством страниц
        Book maxPagesBook = getBookWithMaxPages(books);
        System.out.println("\n========= Book with the most pages =========");
        System.out.println(maxPagesBook + " => " + maxPagesBook.getTypeAndCapacity().values().stream().findFirst().get() + " pages");

        // книга с минимальным количеством страниц
        Book minPagesBook = getBookWithMinPages(books);
        System.out.println("\n========= Book with the least pages =========");
        System.out.println(minPagesBook + " => " + minPagesBook.getTypeAndCapacity().values().stream().findFirst().get() + " pages");
    }

//----------------------------------------------------------------------------------------
    // Метод для нахождения книги с максимальным количеством страниц
    private static Book getBookWithMaxPages(List<Book> books)
    {
        return books.stream()
            // Используем max() для поиска книги с наибольшим количеством страниц
            .max(Comparator.comparingInt(b -> b.getTypeAndCapacity().values().stream().findFirst().get()))
            // Если книги не найдены (пустой список), выбрасываем исключение
            .orElseThrow(() -> new NoSuchElementException("No books found"));
    }

    // Метод для нахождения книги с минимальным количеством страниц
    private static Book getBookWithMinPages(List<Book> books)
    {
        return books.stream()
            // Используем min() для поиска книги с наименьшим количеством страниц
            .min(Comparator.comparingInt(b -> b.getTypeAndCapacity().values().stream().findFirst().get()))
            // Если книги не найдены (пустой список), выбрасываем исключение
            .orElseThrow(() -> new NoSuchElementException("No books found"));
    }

    // группировка книг по жанрам
    private static Map<String, List<Book>> groupBooksByGenre(List<Book> books)
    {
        return books.stream()
                // каждый жанр является ключом в Map.
                .collect(Collectors.groupingBy(book -> book.getTypeAndCapacity().keySet()
                .stream().findFirst().get()));
    }

    private static double calculateAveragePages(List<Book> books)
    {
        return books.stream()
                // извлекаем количество страниц каждой книги, используя stream() по значениям Map
                .mapToInt(book -> book.getTypeAndCapacity().values().stream().findFirst().get())
                // Находим среднее значение через average()
                .average()
                // Если поток пустой, возвращаем 0 по умолчанию
                .orElse(0);
    }

    private static List<Book> generateBooks(int countBooks)
    {
        // List<Book> books = new ArrayList<>(); // список объектов;

        Random random = new Random();

//        for (int j = 1; j < countBooks; j++)
//        {
//            Map<String, Integer> typeAndCapacity = new HashMap<>(); // ключ - имя, значение - жанр и количество страниц
//
//            typeAndCapacity.put(types.get(random.nextInt(types.size())), random.nextInt(200) + 100); // количество страниц от 100 до 200
//
//            books.add(new Book("Book" + j + " ", typeAndCapacity));
//        }
//        return books;

        return IntStream.range(1, countBooks + 1)  // генерируем поток чисел от 1 до countBooks
                .mapToObj(j -> //преобразование каждого числа из потока в объект Book, создаем объект Map<String, Integer> для каждого числа и заполняем его случайными значениями (жанр и количество страниц).
                {
                    Map<String, Integer> typeAndCapacity = new HashMap<>();
                    typeAndCapacity.put(types.get(random.nextInt(types.size())), random.nextInt(200) + 100); // жанр и количество страниц
                    return new Book("Book" + j, typeAndCapacity);
                })
                .collect(Collectors.toList());  // собираем в список
    }

}

package classwork.book_library.test;

import classwork.book_library.controller.Library;
import classwork.book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library;
    Book[] books;
    int size = 0;

    @BeforeEach
    void setUp()
    {
        library = new Library(5);
        books = new Book[5];

        books[0] = new Book("1984", "Oruell", 1_111_111_111_110L, 2010);
        books[1] = new Book("T1", "A1", 1_111_111_111_111L, 2011);
        books[2] = new Book("T2", "A2", 1_111_111_111_112L, 2009);
        books[3] = new Book("T3", "A3", 1_111_111_111_113L, 2005);

        // TODO положить объекты в массив, кот. внутри библиотеки (объекта library)

        for (int i = 0; i < books.length - 1; i++) // у нас size = 4 книги, кот. кладем в библиотеку
        {
            library.addBook(books[i]);
        }
    }

    // addBookTest - метод типа boolean
    @Test  // - не добавлять null
    void addBookTest()
    {
        assertFalse(library.addBook(null));      // не добавлять null
        assertFalse(library.addBook(books[2]));  //  не добавлять дубликат
        // добавляем еще одну книгу
        Book newBook = new Book("T4","A4", 1_111_111_111_114L, 2024);
        assertTrue(library.addBook(newBook));
        assertEquals(5,library.size());
        // добавляем еще одну книгу, сверх возможности capacity
        Book oneMoreBook = new Book("T5","A5", 1_111_111_111_115L, 2025);
        assertFalse(library.addBook(oneMoreBook)); // нет места
    }


    @Test
    void findBookTest()
    {
        Book foundBook = library.findBook(1_111_111_111_110L);
        assertEquals(books[0], library.findBook(1_111_111_111_110L));
        assertNull(library.findBook(1_111_111_111_119L));  // find absent book
    }

    @Test
    void removeBookTest()
    {   // удаление существующий книги existed book
        assertEquals(books[0], library.removeBook(1_111_111_111_110L));
        assertEquals(3, library.size()); // проверка количества книг
        // удаление несуществующей книги absent book
        assertNull(library.removeBook(1_111_111_111_119L));
    }

    @Test
    void sizeTest()
    {
        assertEquals(4, library.size());
    }

    @Test
    void printBookTest()
    {
        System.out.println("------------------------------------------");
        library.printBook();
    }

}
package library.test;

import library.dao.Library;
import library.dao.LibraryImpl;
import library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImpTest
{

   Book[] books;
   Library library;

    @BeforeEach
    void setUp()
    {
        library = new LibraryImpl(5);
        books = new Book[5];

        books[0] = new Book(1_111_111_111_110L,"T0", "A0",2010, "G0");
        books[1] = new Book(1_111_111_111_111L,"T1", "A1",2011, "G1");
        books[2] = new Book(1_111_111_111_112L,"T2", "A2",2009, "G2");
        books[3] = new Book(1_111_111_111_113L,"T3", "A1",2005, "G3");

        // TODO положить объекты в массив, кот. внутри библиотеки (объекта library)

        for (int i = 0; i < books.length; i++) // у нас size = 4 книги, кот. кладем в библиотеку
        {
            library.addBook(books[i]);
        }
    }

    @Test
    void findBookTest()
    {
        Book foundBook = library.findBook(1_111_111_111_110L);
        assertEquals(books[0], library.findBook(1_111_111_111_110L));// книга есть в библиотеке
        assertNull(library.findBook(1_111_111_111_119L));  // нет книги, возвращает нуль
    }

    @Test
    void addDBookTest()
    {
        assertFalse(library.addBook(null));      // не добавлять null
        assertFalse(library.addBook(books[2]));  //  не добавлять дубликат
        // добавляем еще одну книгу
        Book newBook = new Book(1_111_111_111_115L,"T5", "A5",2005, "G5");
        assertTrue(library.addBook(newBook));
        // добавляем еще одну книгу, сверх возможности capacity
        Book oneMoreBook = new Book(1_111_111_111_118L,"T8", "A8",2008, "G8");
        assertFalse(library.addBook(oneMoreBook)); // нет места
    }

    @Test
    void uppdateBookTest()
    {
        Book newBook = new Book(1_111_111_111_115L,"T33", "A33",2005, "G33");
        assertTrue(library.uppdateBook(1_111_111_111_113L, newBook)); // нашли и заменили
        assertFalse(library.uppdateBook(1_111_111_111_118L, newBook));// не нашли, не заменили
    }

    @Test
    void deleteBookTest()
    {
        // удаление существующей книги existed book
        assertEquals(books[0], library.deleteBook(1_111_111_111_110L));
        // удаление несуществующей книги absent book
        assertNull(library.deleteBook(1_111_111_111_119L));
    }

    @Test
    void findAllBooksByAuthorTest()
    {
        Book[] allBooksByAuthor = {books[1], books[3]};

        assertArrayEquals(allBooksByAuthor, library.findAllBooksByAuthor("A1"));// есть книги с одним автором, сохраняем их в массив
        assertNull(library.findAllBooksByAuthor("A9")); // нет автора такого
    }
}
package library;

import library.dao.LibraryImpl;
import library.model.Book;

public class LibreryAppl
{
    public static void main(String[] args)
    {
        LibraryImpl library = new LibraryImpl(4);

        Book book1 = new Book(1_111_111_111_111L,"T1", "A1",2011, "G1");
        Book book2 = new Book(1_111_111_111_112L,"T2", "A2",2012, "G2");
        Book book3 = new Book(1_111_111_111_113L,"T3", "A3",2003, "G3");
        Book book4 = new Book(1_111_111_111_114L,"T4", "A1",2004, "G34");

        // кладем на склад
        book1.display();
        System.out.println(" => Book added: " + library.addBook(book1));
        book2.display();
        System.out.println(" => Book added: " + library.addBook(book2));
        book3.display();
        System.out.println(" => Book added: " + library.addBook(book3));
        book4.display();
        System.out.println(" => Book added: " + library.addBook(book4));
        System.out.println("---------------------------------------------------------------");

        // добавляем еще одну книгу (в библиотеке нет места)
        Book book5 = new Book(1_111_111_111_115L,"T5", "A5",2005, "G5");
        System.out.println("Editable Book: "); //  массив полон
        book5.display();
        System.out.println("\nlibrary is full! Attempt to add a book: " + library.addBook(book5));
        System.out.println("---------------------------------------------------------------");

        // поиск книги по isbn
        Book foundBook = library.findBook(1_111_111_111_112L);
        System.out.println("Found book with isbn: " + foundBook.getISBN() + " => ");
        if (foundBook != null)
        {
            foundBook.display();
            System.out.println("\nAttempt: book found ...");
        }
        else System.out.println("\nAttempt: book not found");
        System.out.println("---------------------------------------------------------------");

        // редактируем книгу
        Book uppdatedBook = new Book(1_111_111_111_116L,"T6", "A1",2011, "G6");
        System.out.println("Editable book: "); // редактируемая книга
        book2.display();
        boolean isUpdated = library.uppdateBook(book2.getISBN(), uppdatedBook);
        if (isUpdated)
        {
            System.out.println("\nUpdated book: " + uppdatedBook.getISBN() + " => ");
            uppdatedBook.display();
        }
        else System.out.println("\nEditable book not found...");
        System.out.println("\n---------------------------------------------------------------");

        // удаляем книгу
        Book deleteBook = library.deleteBook(book3.getISBN());
        if (deleteBook != null)
        {
            System.out.println("Book with isbn: " + deleteBook.getISBN() + " => ");
            book3.display();
            System.out.println("\n => DELETED...");
        }
        else System.out.println("Deleted book not found...\"");
        System.out.println("---------------------------------------------------------------");

        // добавляем еще одну книгу (в библиотеке есть место)
        Book book6 = new Book(1_111_111_111_118L,"T8", "A8",2006, "G8");
        System.out.println("Added book: ");
        book6.display();
        System.out.println("\nAttempt to add a book: " + library.addBook(book6));
        System.out.println("---------------------------------------------------------------");


        // печать книг с одним автором
        Book[] oneAuthorBooks = library.findAllBooksByAuthor("A1");
        for (int i = 0; i < oneAuthorBooks.length ; i++)
        {
            oneAuthorBooks[i].display();
            System.out.println("");
        }
    }
}

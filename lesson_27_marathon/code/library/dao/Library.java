package library.dao;

import library.model.Book;

public interface Library
{
    Book findBook(long isbn);  // найти книгу

    boolean addBook(Book book); // добавить книгу в библиотеку

    boolean uppdateBook(long isbn, Book updatedBook); // обновить данные о книге

    Book deleteBook(long isbn); // удалить книгу

    Book[] findAllBooksByAuthor(String author); //найти все книги по автору

    void display ();


}

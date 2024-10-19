package library.dao;

import homework.bmw.detail.model.Detail;
import library.model.Book;

import java.util.Arrays;
import java.util.Objects;


public class LibraryImpl implements Library
{
    private Book[] books; // массив фиксированной длины для хранения книг.
    private int size; // текущее количество книг
    private Book book;

    // конструктор
    public LibraryImpl(int capacity)
    {
        books = new Book[capacity]; // создаем массив с заданной емкостью (макс. кол-во книг)
        size = 0;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof LibraryImpl library)) return false;
        return Objects.deepEquals(books, library.books);
    }

    @Override
    public int hashCode()
    {
        return Arrays.hashCode(books);
    }
//--------------------------------------------------------------------------------------------

    @Override
    public Book findBook(long isbn)
    {
        for (int i = 0; i < size; i++)
        {
            if (books[i].getISBN() == isbn)
            {
                return books[i]; // нашли
            }
        }
        return null;  // не нашли
    }

    @Override
    public boolean addBook(Book book)
    {
        if (book == null || size == books.length || findBook(book.getISBN()) != null)
        {
            return false; // если книга пустышка или нет места в массиве для нее или она уже есть в массиве, тогда не добавляем
        }
        books[size] = book; // иначе добавляем деталь в массив
        size++;
        return true; // добавили
    }

    @Override
    public boolean uppdateBook(long isbn, Book updatedBook)
    {
        for (int i = 0; i < size; i++)
        {
            if (books[i].getISBN() == isbn)
            {
                books[i] = updatedBook; // обновляем
                return true; // получилось обновить
            }
        }
        return false; // не удалось обновить
    }

//    @Override  // второй вариант
//    public boolean uppdateBook(long isbn, Book updatedBook)
//    {
//        Book oldBook = findBook(isbn);
//        if ( oldBook == null)
//        {
//            return false; // не удалось обновить
//        }
//        oldBook = updatedBook;
//        return true;
//    }

    @Override
    public Book deleteBook(long isbn)
    {
        for (int i = 0; i < size; i++)
        {
            if (books[i].getISBN() == isbn)
            {
                Book victim = books[i];
                books[i] = books[size - 1]; // последнюю ставим на место удаляемой книги
                books[size - 1] = null; // затираем последний элемент массива
                size --;
                return victim;
            }
        }
        return null; // не удалили
    }

    @Override
    public Book[] findAllBooksByAuthor(String author)
    {
        int timeSize = countAllBooksByAuthor(author);

        if (timeSize == 0)
        {
            return null;
        }
        Book[] booksByAuthor = new Book[timeSize];

        for (int i = 0, j= 0; i < size; i++)
        {
            if (books[i].getAuthor() == author)
            {
               booksByAuthor[j] = books[i];
               j++;
            }
        }
        return booksByAuthor;
    }

    public int countAllBooksByAuthor(String author)
    {
        int timeCount = 0;

        for (int i = 0; i < size; i++)
        {
            if (books[i].getAuthor() == author)
            {
                timeCount++;
            }
        }
        return timeCount;
    }

    @Override
    public void display() {
        System.out.printf("ISBN: %s, title: %s, author: %s, year Of publishing: %d, genre: %s", book.getISBN(), book.getTitle(), book.getAuthor(), book.getYearOfPublishing(), book.getGenre());
    }
}

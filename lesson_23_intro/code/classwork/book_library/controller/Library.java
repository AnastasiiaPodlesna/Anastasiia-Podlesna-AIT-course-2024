package classwork.book_library.controller;

// Реализовать методы:
//- печать списка всех книг в библиотеке;
//- получение кол-ва книг в библиотеке;
//- поиска книги по ISBN;
//- добавление книги в библиотеку с учетом требований:
// - не добавлять null
// - не добавлять дубликат
// - не добавлять больше, чем может вместить в себя библиотека.
//- удаление книги из библиотеки.

import classwork.book_library.model.Book;

public class Library
{
    // fields
    private Book[] books;
    private int size; // текущее кол-во книг;

    // constructor

    public Library(int capacity)
    {
        this.books = new Book[capacity];
        this.size = 0;
    }

    // CRUD methods:

     public boolean addBook(Book book)
     {
         if (book == null)
         {
             return false;
         }
         if (size == books.length)
         {
             return false;
         }
         if (!(findBook(book.getIsbn()) == null))
         {
             return false;
         }

         books[size] = book; // ставим книгу в конец массива
         size ++;
         return true;
     }
     
     // size ++;
     public int size()
     {
         return size;
     }
     
     // print Books
     public void printBook()
     {
         for (int i = 0; i < size; i++)
         {
             System.out.println(books[i]);
         }
     }

    public Book findBook(long isbn)
     {
         for (int i = 0; i < size; i++)
         {
             if(books[i].getIsbn() == isbn)
             {
                 return books[i];
             }
         }
         return null;
     }

    public Book removeBook(long isbn)
    {
        for (int i = 0; i < size; i++)
        {
            if (books[i].getIsbn() == isbn)
            {
                Book victim = books[i];
                books[i] = books[size - 1]; // last book put instead victim
                books[size - 1] = null;// затираем последний элемент массива
                size --;
                return victim;
            }
        }
        return null;
    }



}

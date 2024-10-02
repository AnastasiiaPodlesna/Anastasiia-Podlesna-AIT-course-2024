package homework.books;

// Создайте класс Book с полями:
// - уникальный номер ISBN
// - название title
// - автор author
// - год издания yearOfPublishing
// - жанр genre
// В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display,
// который выводит информацию о книге. Создайте конструктор, в котором нет поля ISBN.
// Создайте конструктор, в котором есть только поля title, author и genre.

import homework.books.model.Book;

public class BookAppl
{
    public static void main(String[] args)
    {
        Book book1 = new Book("DIO3456821", "Gone with the wind", "Margaret Mitchell", 1936, "novel");
        Book book2 = new Book( "Little prince", "Marcel Proust", 1943, "tale");
        Book book3 = new Book( "The Master and Margarita", "Mikhail Bulgakov", "novel");

        System.out.println("---------------------------------------------------");
        book1.display();
        System.out.println("\n---------------------------------------------------");
        book2.display();
        System.out.println("\n---------------------------------------------------");
        book3.display();
        System.out.println("\n---------------------------------------------------");

    }
}

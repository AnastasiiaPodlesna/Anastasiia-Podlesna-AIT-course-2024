package homework.book;

// Создайте или возьмите из прошлого домашнего задания класс Book с полями: название - title автор
// - author год издания - year уникальный номер - ISBN В классе Book реализуйте конструктор, геттеры
// и сеттеры на все поля и метод display, который выводит информацию о книге. Создайте класс
// Dictionary, который расширяет класс Book. Предложите для него набор полей и переопределите метод
// display. В классе BookApl в методе main создайте несколько словарей и выведите информацию о них в
// консоль.

import homework.book.model.Dictionary;

class BookAppl
{
    public static void main(String[] args)
    {
         Dictionary dict1 = new Dictionary("DIO3456821", "English-Russian dictionary", "Jon Lennon", 1936, "dictionary", 2000, 85.00);
         Dictionary dict2 = new Dictionary("DI34000822", "German-Russian dictionary", "Jon Lennon", 1925, "dictionary", 1000, 65.00);


        System.out.println("-------------------------------------------------------------------------");
        dict1.display();
        System.out.println("\n-----------------------------------------------------------------------");
        dict2.display();
        System.out.println("\n-----------------------------------------------------------------------");
    }
}

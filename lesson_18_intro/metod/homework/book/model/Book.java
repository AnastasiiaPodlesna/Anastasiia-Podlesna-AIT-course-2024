package homework.book.model;

public class Book
{
    private String  ISBN;          // уникальный номер
    private String title;          // название
    private String author;         // автор
    private int yearOfPublishing;  // год издания
    private String genre;          // жанр

    public Book(String ISBN, String title, String author, int yearOfPublishing, String genre)
    {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public int getYearOfPublishing()
    {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing)
    {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public void display()
    {
        System.out.printf("ISBN: %s, title: %s, author: %s, year Of publishing: %d, genre: %s", ISBN, title, author, yearOfPublishing, genre);
    }

    
}

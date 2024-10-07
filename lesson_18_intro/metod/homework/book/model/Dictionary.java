package homework.book.model;

public class Dictionary extends Book
{
    private int book_circulation; // тираж
    private Double price;        //  цена

    public Dictionary(String ISBN,
            String title,
            String author,
            int yearOfPublishing,
            String genre,
            int book_circulation,
            Double price)
    {
        super(ISBN, title, author, yearOfPublishing, genre);
        this.book_circulation = book_circulation;
        this.price = price;
    }

    public int getBook_circulation()
    {
        return book_circulation;
    }

    public void setBook_circulation(int book_circulation)
    {
        this.book_circulation = book_circulation;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    @Override
    public void display()
    {
      System.out.printf("ISBN: %s, title: %s, author: %s, year Of publishing: %d, genre: %s, book circulation: %d, preice: %.2f ", getISBN(), getTitle(), getAuthor(), getYearOfPublishing(), getGenre(), getBook_circulation(), getPrice());
    }


}

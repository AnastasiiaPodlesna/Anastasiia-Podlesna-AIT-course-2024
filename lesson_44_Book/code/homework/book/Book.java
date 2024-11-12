package homework.book;

import java.util.Map;

public class Book
{
    private String title;
    private Map<String, Integer> typeAndCapacity;

    public Book(String title,
            Map<String, Integer> typeAndCapacity)
    {
        this.title = title;
        this.typeAndCapacity = typeAndCapacity;
    }

    public String getTitle()
    {
        return title;
    }

    public Map<String, Integer> getTypeAndCapacity()
    {
        return typeAndCapacity;
    }

    @Override
    public String toString()
    {
        return "Title '" + title + "' " + typeAndCapacity.entrySet().iterator().next().getKey();
    }
}



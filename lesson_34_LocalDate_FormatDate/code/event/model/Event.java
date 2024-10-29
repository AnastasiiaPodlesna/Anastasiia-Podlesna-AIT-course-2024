package event.model;

import java.time.LocalDate;
import java.util.Objects;

public class Event
{
    private int identifier;
    private String title;
    private String url;
    private LocalDate data;

    public Event(int identifier,
            String title,
            String url,
            LocalDate data)
    {
        this.identifier = identifier;
        this.title = title;
        this.url = url;
        this.data = data;
    }

    public int getIdentifier()
    {
        return identifier;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUrl()
    {
        return url;
    }

    public LocalDate getData()
    {
        return data;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return identifier == event.identifier;
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(identifier);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("event.model.Event{");
        sb.append("identifier=").append(identifier);
        sb.append(", title='").append(title).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }

}

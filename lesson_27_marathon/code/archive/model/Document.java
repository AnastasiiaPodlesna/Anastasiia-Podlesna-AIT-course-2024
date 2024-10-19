package archive.model;

import java.util.Objects;

public class Document
{
    public static final int ID_LENGTH = 7;

        // field
        private String title;
        private String type;
        private String author;
        private long id;

        //constructor
    public Document(String title,
            String type,
            String author,
            long id)
    {
        this.title = title;
        this.type = type;
        this.author = author;
        this.id = checkId(id);
    }

    public long getId()
        {
            return id;
        }

        // TODO предусмотреть защиту по поводу 10 цифр и в этом случае
        public void setId(long id)
        {
            if(checkId(id) > 0)
            {
                this.id = checkId(id);
            } else
                System.out.println("ID is not correct. ");;
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

        public String getType()
        {
            return type;
        }

        public void seType(int yearOfPublishing)
        {
            this.type = type;
        }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Document document)) return false;
        return id == document.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("documentArchive.model.Document{");
        sb.append("title='").append(title).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", id=").append(id);
        sb.append(", author='").append(author).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
    private long checkId(long id)
    {
        // проверка длины id по количеству цифр в этом числе
        if (countDigit(id)) {
            return id;
        }
        return -1; // сигнал того, что не верный id
    }

    private boolean countDigit(long id)
    {
        long temp = id; // переложили в отд. переменную, что бы не испортить значение id
        int count = 0;

        while ((temp != 0))
        {
            temp = temp / 10;
            count++;
        }
        return  count == ID_LENGTH;
    }

    public void display()
    {
        System.out.printf("title: %s, type: %s, author: %s, id: %d", title, type, author, id);
    }
}

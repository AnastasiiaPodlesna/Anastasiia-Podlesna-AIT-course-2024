package archive.dao;

import archive.model.Document;
import library.model.Book;

public class ArchiveImpl implements Archive
{
    private Document[] documents;
    private Document document;
    private int size;

    // конструктор
    public ArchiveImpl(int capacity)
    {
        documents = new Document[capacity]; // создаем массив с заданной емкостью
        size = 0;
    }

    //--------------------------------------------------------------------------------------------
    @Override
    public Document findDocument(long id)
    {
        for (int i = 0; i < size; i++)
        {
            if (documents[i].getId() == id)
            {
                return documents[i]; // нашли
            }
        }
        return null;  // не нашли
    }

    @Override
    public boolean addDocument(Document document)
    {
        if (document == null || size == documents.length || findDocument(document.getId()) != null)
        {
            return false; // если док. пустышка или нет места в массиве для него или он уже есть в массиве, тогда не добавляем
        }
        documents[size] = document; // иначе добавляем в массив
        size++;
        return true; // добавили
    }

    @Override
    public boolean uppdateDocument(long id, Document updatedDocument)
    {
        for (int i = 0; i < size; i++)
        {
            if (documents[i].getId() == id)
            {
                documents[i] = updatedDocument; // обновляем
                return true; // получилось обновить
            }
        }
        return false; // не удалось обновить
    }

    @Override
    public Document deleteDocument(long id)
    {
        for (int i = 0; i < size; i++)
        {
            if (documents[i].getId() == id)
            {
                Document victim = documents[i];
                documents[i] = documents[size - 1]; // последнюю ставим на место удаляемого документа
                documents[size - 1] = null; // затираем последний элемент массива
                size --;
                return victim;
            }
        }
        return null; // не удалили
    }

    @Override
    public Document[] findAllDocumentsByAuthor(String author)
    {
        int timeSize = countAllDocumentsByAuthor(author);

        if (timeSize == 0)
        {
            return null;
        }
        Document[] documentsByAuthor = new Document[timeSize];

        for (int i = 0, j= 0; i < size; i++)
        {
            if (documents[i].getAuthor() == author)
            {
                documentsByAuthor[j] = documents[i];
                j++;
            }
        }
        return documentsByAuthor;
    }

    public int countAllDocumentsByAuthor(String author)
    {
        int timeCount = 0;

        for (int i = 0; i < size; i++)
        {
            if (documents[i].getAuthor() == author)
            {
                timeCount++;
            }
        }
        return timeCount;
    }

    @Override
    public Document[] findAllDocumentsByTitle(String title)
    {
        int timeSize = countAllDocumentsByTitle(title);

        if (timeSize == 0)
        {
            return null;
        }
        Document[] documentsByTitle = new Document[timeSize];

        for (int i = 0, j= 0; i < size; i++)
        {
            if (documents[i].getTitle() == title)
            {
                documentsByTitle[j] = documents[i];
                j++;
            }
        }
        return documentsByTitle;

    }
    public int countAllDocumentsByTitle(String title)
    {
        int timeCount = 0;

        for (int i = 0; i < size; i++)
        {
            if (documents[i].getTitle() == title)
            {
                timeCount++;
            }
        }
        return timeCount;
    }

    @Override
    public void display()
    {
        System.out.printf("title: %s, type: %s, author: %s, id: %d", document.getTitle(), document.getType(), document.getAuthor(), document.getId());
    }
}

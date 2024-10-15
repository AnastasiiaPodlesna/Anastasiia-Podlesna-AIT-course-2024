package documentArchive.controller;

// Реализовать методы:
//- печать списка всех документов в библиотеке;
//- получение кол-ва документов в архиве;
//- поиска документов по ID;
//- добавление документа в архив с учетом требований:
// - не добавлять null
// - не добавлять дубликат
// - не добавлять больше, чем может вместить в себя архив.
//- удаление документа из архива.

import classwork.book_library.model.Book;
import documentArchive.model.Document;

public class Arhive
{
    // fields
    private Document[] documents;
    private int size; // текущее кол-во книг;

    // constructor


    public Arhive(int capacity)
    {
        this.documents = new Document[capacity];
    }

    // CRUD methods:

    public boolean addDocument(Document document)
    {
        if (document == null)
        {
            return false;
        }
        if (size == documents.length)
        {
            return false;
        }
        if (!(findDocument(document.getId()) == null))
        {
            return false;
        }

        documents[size] = document; // ставим документ в конец массива
        size ++;
        return true;
    }

    // size ++;
    public int size()
    {
        return size;
    }

    // print Documents
    public void printDocument()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.println(documents[i]);
        }
    }

    public Document findDocument(long id)
    {
        for (int i = 0; i < size; i++)
        {
            if(documents[i].getId() == id)
            {
                return documents[i];
            }
        }
        return null;
    }

    public Document removeDocument(long id)
    {
        for (int i = 0; i < size; i++)
        {
            if (documents[i].getId() == id)
            {
                Document victim = documents[i];
                documents[i] = documents[size - 1]; // last doc put instead victim
                documents[size - 1] = null;// затираем последний элемент массива
                size --;
                return victim;
            }
        }
        return null;
   }
}

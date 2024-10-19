package archive.dao;

import archive.model.Document;

public interface Archive
{
    Document findDocument(long id);

    boolean addDocument(Document document);

    boolean uppdateDocument(long id, Document document);

    Document deleteDocument(long id);

    Document[] findAllDocumentsByAuthor (String author);

    Document[] findAllDocumentsByTitle (String title);

    void display ();

}

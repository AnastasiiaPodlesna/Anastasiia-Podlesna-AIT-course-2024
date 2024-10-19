package archive;

import archive.dao.Archive;
import archive.dao.ArchiveImpl;
import archive.model.Document;

public class ArchiveAppl
{
    public static void main(String[] args) {

        Archive archive = new ArchiveImpl(4);
        Document[] documents = new Document[4];

        documents[0] = new Document("T0", "type0", "A0", 1100010L);
        documents[1] = new Document("T1", "type1", "A2", 1100001L);
        documents[2] = new Document("T3", "type2", "A2", 1100002L);
        documents[3] = new Document("T3", "type3", "A1", 1100003L);

        for (int i = 0; i < documents.length; i++)
        {
            documents[i].display();
            System.out.println(" => Document added: " + archive.addDocument(documents[i]));
        }

        // поиск по id
        Document foundDocument = archive.findDocument(1100010L);
        System.out.println("Found document with id: " + foundDocument.getId() + " => ");
        if (foundDocument != null)
        {
            foundDocument.display();
            System.out.println("\nAttempt: document found ...");
        }
        else System.out.println("\nAttempt: document not found");
        System.out.println("---------------------------------------------------------------");

        // редактируем
        Document uppdatedDocument = new Document("T6", "type1","A6", 1100010L);
        System.out.println("Editable document: "); // редактируемый документ
        documents[2].display();
        boolean isUpdated = archive.uppdateDocument(documents[2].getId(), uppdatedDocument);
        if (isUpdated)
        {
            System.out.println("\nUpdated document: " + uppdatedDocument.getId() + " => ");
            uppdatedDocument.display();
        }
        else System.out.println("\nEditable document not found...");
        System.out.println("\n---------------------------------------------------------------");

        // удаляем документ
        Document deleteDocument = archive.deleteDocument(documents[3].getId());
        if (deleteDocument != null)
        {
            System.out.println("Document with isbn: " + deleteDocument.getId() + " => ");
            documents[3].display();
            System.out.println("\n => DELETED...");
        }
        else System.out.println("Deleted document not found...\"");
        System.out.println("---------------------------------------------------------------");

        // добавляем еще один документ (в архиве есть место)
        documents[3] = new Document("T6", "type6", "A2", 1100006L);
        System.out.println("Added document: ");
        documents[3].display();
        System.out.println("\nAttempt to add document: " + archive.addDocument(documents[3]));
        System.out.println("---------------------------------------------------------------");


        // печать документов с одним автором
        Document[] oneAuthorDocuments = archive.findAllDocumentsByAuthor("A2");
        for (int i = 0; i < oneAuthorDocuments.length ; i++)
        {
            oneAuthorDocuments[i].display();
            System.out.println("");
        }
    }
}

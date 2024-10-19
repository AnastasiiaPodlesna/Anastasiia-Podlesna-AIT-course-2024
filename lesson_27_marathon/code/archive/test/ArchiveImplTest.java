package archive.test;

import archive.dao.Archive;
import archive.dao.ArchiveImpl;
import archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest
{
    Document[] documents;
    Archive archive;

    @BeforeEach
    void setUp()
    {
        archive = new ArchiveImpl(5);
        documents = new Document[5];

        documents[0] = new Document("T0", "type0", "A0", 1100010L);
        documents[1] = new Document("T1", "type1", "A1", 1100001L);
        documents[2] = new Document("T3", "type2", "A2", 1100002L);
        documents[3] = new Document("T3", "type3", "A1", 1100003L);

        for (int i = 0; i < documents.length; i++)
        {
            archive.addDocument(documents[i]);
        }
    }


    @Test
    void findDocumentTest()
    {
        Document foundDocument = archive.findDocument(1100001L);
        assertEquals(documents[1], foundDocument); // found
        assertNull(archive.findDocument(1234567L));
    }

    @Test
    void addDocumentTest()
    {
        assertFalse(archive.addDocument(null));      // не добавлять null
        assertFalse(archive.addDocument(documents[2]));  // не добавлять дубликат
        // добавляем еще документ
        Document newDocument = new Document("T4", "type4", "A0", 1100004L);
        assertTrue(archive.addDocument(newDocument));
        // добавляем еще документ, сверх возможности capacity
        Document oneMoreDocument = new Document("T5", "type5", "A5", 1100005L);
        assertFalse(archive.addDocument(oneMoreDocument)); // нет места
    }

    @Test
    void uppdateDocumentTest()
    {
        Document newDocument = new Document("T0", "type0", "A4", 1100001L);
        assertTrue(archive.uppdateDocument(1100001L, newDocument)); // нашли и заменили
        assertFalse(archive.uppdateDocument(1100007L, newDocument));// не нашли, не заменили
    }

    @Test
    void deleteDocumentTest()
    {
        // удаление существующего документа
        assertEquals(documents[1], archive.deleteDocument(1100001L));
        // удаление несуществующего документа
        assertNull(archive.deleteDocument(1100009L));
    }


    @Test
    void findAllDocumentsByAuthorTest()
    {
        Document[] allDocumentsByAuthor = {documents[1], documents[3]};

        assertArrayEquals(allDocumentsByAuthor, archive.findAllDocumentsByAuthor("A1"));// есть документы с одним автором, сохраняем их в массив
        assertNull(archive.findAllDocumentsByAuthor("A9")); // нет автора такого
    }

    @Test
    void findAllDocumentsByTitleTest()
    {
        Document[] allDocumentsByTitle = {documents[2], documents[3]};

        assertArrayEquals(allDocumentsByTitle, archive.findAllDocumentsByTitle("T3"));// есть документ с одним титлом, сохраняем их в массив
        assertNull(archive.findAllDocumentsByAuthor("A9")); // нет титла такого
    }
}
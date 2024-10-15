package documentArchive.test;

import classwork.book_library.controller.Library;
import classwork.book_library.model.Book;
import documentArchive.controller.Arhive;
import documentArchive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ArhiveTest
{
    Arhive arhive;
    Document[] documents;
    int size = 0;

    @BeforeEach
    void setUp()
    {
        arhive = new Arhive(5);
        documents = new Document[5];

        documents[0] = new Document("T0", "WORD", "Lomonosov",1_111_111_110L);
        documents[1] = new Document("T1", "EXCEL", "Marks",1_111_111_111L);
        documents[2] = new Document("T2", "NOTEPAD", "Engels",1_111_111_112L);
        documents[3] = new Document("T3", "WORD", "Scholz",1_111_111_113L);

        // TODO положить объекты в массив, кот. внутри библиотеки (объекта library)

        for (int i = 0; i < documents.length-1; i++) // у нас size = 4 документа, кот. кладем в архив
        {
            arhive.addDocument(documents[i]);
        }
    }

    @Test
    void addDocumentTest()  // addDocumentTest - метод типа boolean
    {
        assertFalse(arhive.addDocument(null));      // не добавлять null
        assertFalse(arhive.addDocument(documents[0]));  //  не добавлять дубликат
        // добавляем еще один документ
        Document newDocument = new Document("T4", "WORD", "Scholz",1_111_111_114L);
        assertTrue(arhive.addDocument(newDocument));
        assertEquals(5,arhive.size());
        // добавляем еще один документ, сверх возможности capacity
        Document oneMoreDocument = new Document("T5", "WORD", "Scholz",1_111_111_113L);
        assertFalse(arhive.addDocument(oneMoreDocument)); // нет места
    }

    @Test
    void sizeTest()
    {
        assertEquals(4, arhive.size());
    }

    @Test
    void printDocumentText()
    {
        System.out.println("------------------------------------------");
        arhive.printDocument();
    }

    @Test
    void findDocumentTest()
    {
        Document foundDocument = arhive.findDocument(1_111_111_110L);
        assertEquals(documents[0], arhive.findDocument(1_111_111_110L));
        assertNull(arhive.findDocument(1_111_111_119L));  // find absent book
    }

    @Test
    void removeBookTest()
    {
        // удаление существующего документа existed document
        assertEquals(documents[0], arhive.removeDocument(1_111_111_110L));
        assertEquals(3, arhive.size()); // проверка количества документов
        // удаление несуществующего документа absent document
        assertNull(arhive.removeDocument(1_111_111_119L));
    }
}
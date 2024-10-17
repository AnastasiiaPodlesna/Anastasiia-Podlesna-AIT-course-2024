package homework.bmw.detail.test;

import homework.bmw.detail.dao.Stock;
import homework.bmw.detail.dao.StockImpl;
import homework.bmw.detail.model.Detail;
import homework.bmw.detail.model.Gear;
import homework.bmw.detail.model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StockImplTest
{
    private Stock stock;
    private Detail[] details;

    @BeforeEach
    void setUp()
    {
        stock = new StockImpl(5); // создаем склад с емкостью 5 деталей
        details = new Detail[5];

        details[0] = new Gear(1000L, 15.5, "Steel", "BMW", 420, 44, 18);
        details[1] = new Gear(1001L, 16.5, "Steel", "BMW", 470, 44, 18);
        details[2] = new Gear(1002L, 18, "Steel", "BMW", 550, 44, 26);
        details[3] = new Lever(1003L, 400, "Steel","BMW", 1120, 1000);
        details[4] = new Lever(1004L, 450, "Steel","BMW", 1400, 1500);

        for (int i = 0; i < details.length; i++) // у нас size = 5 деталей, кот. кладем на склад
        {
            stock.addDetail(details[i]);
            System.out.println(details[i]);
        }
    }

    @Test
    void addDetail()
    {
        // добавляем деталь (дубликат), место в массиве есть
        Detail newDetail = new Gear(1000L, 15.5, "Steel", "BMW", 420, 44, 18);
        assertFalse(stock.addDetail(newDetail)); // эта деталь не должна добавляться

        // добавляем новую деталь, место в массиве есть
        Detail newDetail1 = new Gear(1005L, 15.5, "Steel", "BMW", 420, 44, 18);
        assertTrue(stock.addDetail(newDetail1)); // должна добавиться

        // добавляем новую деталь, места в массиве нет
        Detail newDetail2 = new Gear(1009L, 15.5, "Steel", "BMW", 420, 44, 18);
        assertFalse(stock.addDetail(newDetail2)); // Эта деталь не должна добавляться, массив полон
    }

    @Test
    void searchDetail()
    {
        // ищем деталь (которая есть в массиве)
        assertEquals(1002L, stock.searchDetail(1002L).getBarCode()); // находим

        // ищем деталь (которой нет в массиве)
        assertNull(stock.searchDetail(1012L)); // не находим
    }

    @Test
    void uppdateDetail()
    {
        //  редактируем деталь, которая есть в массиве
        Detail updatedDetail1 = new Gear(1002L, 15, "Steel", "BMW", 400, 40, 10);
        assertTrue(stock.uppdateDetail(1002L, updatedDetail1)); // обновилась

        //  редактируем деталь, которой нет в массиве
        Detail updatedDetail2 = new Gear(1025L, 15, "Steel", "BMW", 400, 40, 10);
        assertFalse(stock.uppdateDetail(1255L, updatedDetail2)); // не обновилась
    }

    @Test
    void deleteDetail()
    {
        // удаляем деталь, кот. в массиве есть
        Detail newDetail1 = new Gear(1002L, 15, "Steel", "BMW", 400, 40, 10);
        assertEquals(1002L, stock.deleteDetail(1002L).getBarCode()); // удалили

        // удаляем деталь, кот. в массиве нет
        assertNull(stock.searchDetail(1002L)); // нечего удалять, вернулся null
    }

    @Test
    void totalWeightAllDetails()
    {
        assertEquals(792.0, stock.averageWeightAllDetails()); // средняя масса всех деталей
    }

    @Test
    void averageWeightAllDetails()
    {
        assertEquals(3960.0, stock.totalWeightAllDetails()); // посчитали массу всех деталей
    }
}
package homework.bmw.detail.dao;

import classwork.book_library.model.Book;
import homework.bmw.detail.model.Detail;

import java.util.Arrays;
import java.util.Objects;

public class StockImpl implements Stock
{
    private Detail[] details; // массив фиксированной длины для хранения деталей.
    private int count; // текущее количество деталей

    // конструктор
    public StockImpl(int capacity)
    {
        details = new Detail[capacity]; // создаем массив с заданной емкостью (макс. кол-во деталей)
        count = 0;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof StockImpl stock)) return false;
        return Objects.deepEquals(details, stock.details);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(details);
    }
//--------------------------------------------------------------------------------------
    @Override
    public boolean addDetail(Detail detail)
    {
        if (detail == null || count >= details.length || searchDetail(detail.getBarCode()) != null)
    {
        return false; // если деталь пустышка или нет места в массиве для нее или она уже есть в массиве, тогда не добавляем
    }

        details[count] = detail; // иначе добавляем деталь в массив
        count++;
        return true; // добавили
    }

    @Override
    public Detail searchDetail(long barCode)
    {
        for (int i = 0; i < count; i++)
        {
            if (details[i] != null && details[i].getBarCode() == barCode)
            {
                return details[i]; // нашли
            }
        }
        return null; // не нашли
    }

    @Override
    public boolean uppdateDetail(long barCode, Detail updatedDetail)
    {
        for (int i = 0; i < count; i++)
        {
            if (details[i].getBarCode() == barCode)
            {
                details[i] = updatedDetail; // обновляем
                return true; // получилось обновить
            }
        }
        return false; // не удалось обновить
    }

    @Override
    public Detail deleteDetail(long barCode)
    {
        for (int i = 0; i < count; i++)
        {
            if (details[i].getBarCode() == barCode)
            {
                Detail victim = details[i];
                details[i] = details[count - 1]; // последнюю ставим на место удаляемой детали
                details[count - 1] = null; // затираем последний элемент массива
                count --;
                return victim;
            }
        }
        return null; // не удалили
    }

    @Override
    public Double totalWeightAllDetails()
    {
        double totalWeight = 0.0;
        for (int i = 0; i < count; i++)
        {
            totalWeight += details[i].getWeight();
        }
        return totalWeight;
    }

    @Override
    public Double averageWeightAllDetails()
    {
        if (count != 0)
        {
            return totalWeightAllDetails() / count;
        }
        return 0.0;
    }

}

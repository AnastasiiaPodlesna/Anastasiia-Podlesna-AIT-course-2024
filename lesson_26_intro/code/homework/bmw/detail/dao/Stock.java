package homework.bmw.detail.dao;

import homework.bmw.detail.model.Detail;

public interface Stock
{
    boolean addDetail(Detail detail); // добавить деталь на склад

    Detail searchDetail(long barCode); // найти деталь по barCode

    boolean uppdateDetail(long barCode, Detail updatedDetail); // обновить данные о детали

    Detail deleteDetail(long barCode); // удалить деталь

    Double totalWeightAllDetails(); // общая масса всех деталей на складе

    Double averageWeightAllDetails(); // средняя масса деталей на складе

}

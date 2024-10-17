package homework.bmw.detail;

import homework.bmw.detail.dao.Stock;
import homework.bmw.detail.dao.StockImpl;
import homework.bmw.detail.model.Detail;
import homework.bmw.detail.model.Gear;
import homework.bmw.detail.model.Lever;

public class FabricAppl
{
    public static void main(String[] args)
    {
        // склад с емкостью 5 деталей
        Stock stock = new StockImpl(3);

        //  детали
        Detail detail1 = new Gear(1000L, 15.5, "Steel", "BMW", 420, 44, 18);
        Detail detail2 = new Gear(1001L, 16.5, "Steel", "BMW", 470, 44, 18);
        Detail detail3 = new Lever(2000L, 400, "Steel", "BMW", 1120, 1000);

        // кладем детали на склад
        System.out.println("Detail1 added: " + stock.addDetail(detail1));
        System.out.println("Detail2 added: " + stock.addDetail(detail2));
        System.out.println("Detail3 added: " + stock.addDetail(detail3));
        System.out.println("---------------------------------------------------------------");


        // добавляем еще одну деталь (склад полон)
        Detail detail4 = new Gear(1002L, 18, "Steel", "BMW", 550, 44, 26);
        System.out.println("Detail4 added: " + stock.addDetail(detail4)); //  массив полон
        System.out.println("---------------------------------------------------------------");

        // поиск детали по barCode
        Detail searchDetail = stock.searchDetail(1000L);
        System.out.println("Found detail whis barcode: " + searchDetail.getBarCode() + " => " + searchDetail);
        System.out.println("---------------------------------------------------------------");

        // редактируем деталь
        Detail updatedDetail = new Gear(1000L, 15.5, "Aluminum", "BMW", 420, 44, 18);
        boolean isUpdated = stock.uppdateDetail(1000L, updatedDetail);
        System.out.println("Updated detail: " + updatedDetail.getBarCode() + " => " + isUpdated);
        System.out.println("---------------------------------------------------------------");

        // удаляем деталь
        Detail deleteDetail = stock.deleteDetail(1001L);
        System.out.println("Deleted detailwhis barcode: " + deleteDetail.getBarCode() + " => " + deleteDetail);
        System.out.println("---------------------------------------------------------------");

        // общая и средняя масса всех деталей
        System.out.printf("Total weight: %.2f ", stock.totalWeightAllDetails());
        System.out.printf("\nAverage weight: %.2f ", stock.averageWeightAllDetails());
        System.out.println("\n---------------------------------------------------------------");
    }

}

package exchange.currencyExchange.dao;

import exchange.currencyExchange.model.Transaction;

import java.time.LocalDate;
import java.util.List;

public interface Operations
{
   void mainMenu();
   Transaction addTrans(int num);
   Boolean removeTrans(int num);
   Transaction findTrans(int num);
   List<Transaction> findTransByDate(LocalDate dateFrom, LocalDate dateTo);
   List<Transaction> findTransByType(boolean type);
   int quantity();
   double calcRes(String name);
   double calcMarge(double sum);
   void printTrans();

}

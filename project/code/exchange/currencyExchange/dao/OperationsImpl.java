package exchange.currencyExchange.dao;

import exchange.currencyExchange.model.Transaction;

import java.time.LocalDate;
import java.util.List;

public class OperationsImpl implements Operations
{
  List<Transaction> transactions;

    public OperationsImpl(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public void mainMenu() {

    }

    @Override
    public Transaction addTrans(int num) {
        return null;
    }

    @Override
    public Boolean removeTrans(int num) {
        return null;
    }

    @Override
    public Transaction findTrans(int num) {
        return null;
    }

    @Override
    public List<Transaction> findTransByDate(LocalDate dateFrom,
            LocalDate dateTo) {
        return List.of();
    }

    @Override
    public List<Transaction> findTransByType(boolean type) {
        return List.of();
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double calcRes(String name) {
        return 0;
    }

    @Override
    public double calcMarge(double sum) {
        return 0;
    }

    @Override
    public void printTrans() {

    }
}

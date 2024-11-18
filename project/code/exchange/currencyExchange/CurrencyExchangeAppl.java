package exchange.currencyExchange;

import exchange.currencyExchange.dao.OperationsImpl;

public class CurrencyExchangeAppl {

    public static void main(String[] args)
    {
        OperationsImpl tryNow = new OperationsImpl(null);

        tryNow.mainMenu();
    }
}

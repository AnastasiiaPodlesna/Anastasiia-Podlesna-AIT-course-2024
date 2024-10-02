package classwork.bank_account;

import classwork.bank_account.model.BankAccount;

public class BankAppl
{
    public static void main(String[] args)
    {
        BankAccount account001 = new BankAccount(101L, "Anna Linth", "Bank#1", 1, 100);
        BankAccount account002 = new BankAccount(102L, "Jan Linth", "Bank#1", 1);
        BankAccount account003 = new BankAccount(103L, "Bank#1", 1, 1000000);

        account001.display();
        account002.display();
        account003.display();

        // toString
        // System.out.println(account001);

        account001.deposit(500);
        account001.display();

        account002.deposit(300);
        account002.display();

        account001.withdraw(500);
        account001.display();

        account001.withdraw(200); // если клиент хочет снять денег больше чем на балансе, ничего не происходит, балансе остается прежним
        account001.display();




    }
}

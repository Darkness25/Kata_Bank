import kataBank.Account;
import kataBank.Amount;
import kataBank.DateCreator;
import kataBank.Statement;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(new Statement());

        account.deposit(Amount.amountOf(1000), DateCreator.date("15/02/2021"));
        account.deposit(Amount.amountOf(2000), DateCreator.date("20/02/2021"));
        account.withdrawal(Amount.amountOf(500), DateCreator.date("30/03/2021"));

        account.printStatement(System.out);
    }
}

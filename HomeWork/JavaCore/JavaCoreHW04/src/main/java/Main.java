import exception.CustomIllegalArgumentException;
import exception.CustomInsufficientFundsException;
import model.CreditAccount;
import model.DebitAccount;
import transaction.Transaction;

public class Main {
    public static void main(String[] args) {
        try {
            DebitAccount debitAccount = DebitAccount.create(15000);
//            debitAccount.makeDebit(1000);
            debitAccount.printBalance();
//            debitAccount.makeWithdrawal(900);
//            debitAccount.printBalance();

            CreditAccount creditAccount = CreditAccount.create(0, 10000);
//            creditAccount.makeWithdrawal(10000);
            creditAccount.printBalance();
//            creditAccount.makeDebit(5000);
//            creditAccount.printBalance();
//            creditAccount.makeWithdrawal(10000);
//            creditAccount.printBalance();

            Transaction transaction = new Transaction();
            transaction.transact(debitAccount, creditAccount, 20000);
            debitAccount.printBalance();
            creditAccount.printBalance();

        } catch (CustomIllegalArgumentException ex){
            System.out.println("Попытка ввода отрицательного баланса");
        } catch (CustomInsufficientFundsException e) {
            System.out.printf("%s",
                    e.getMessage());
        }

    }
}

import exception.CustomIllegalArgumentException;
import exception.CustomInsufficientFundsException;
import model.CreditAccount;
import model.DebitAccount;

public class Main {
    public static void main(String[] args) {
        try {
            DebitAccount debitAccount = DebitAccount.create(5);
            debitAccount.makeDebit(1000);
            debitAccount.printBalance();
            debitAccount.makeWithdrawal(900);
            debitAccount.printBalance();

            CreditAccount creditAccount = CreditAccount.create(0);
            creditAccount.makeWithdrawal(6000);
            creditAccount.printBalance();
//            creditAccount.makeDebit(5000);
//            creditAccount.printBalance();
            creditAccount.makeWithdrawal(12000);
            creditAccount.printBalance();

        } catch (CustomIllegalArgumentException ex){
            System.out.println("Попытка ввода отрицательного баланса");
        } catch (CustomInsufficientFundsException e) {
            System.out.printf("%s Баланс = %d. Лимит = %d",
                    e.getMessage(), e.getFirstArgument(), e.getSecondArgument());
        }

    }
}

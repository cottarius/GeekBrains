package transaction;

import exception.CustomInsufficientFundsException;
import model.Account;

public class Transaction {

    public void transact(Account fromAccount, Account toAccount, int amount) throws CustomInsufficientFundsException {
        if (fromAccount.isCredit()) {
            if (fromAccount.getBalance() >= 0) {
                if (fromAccount.getBalance() + fromAccount.getLimit() >= amount) {
                    fromAccount.setBalance(fromAccount.getBalance() - amount);
                    toAccount.setBalance(toAccount.getBalance() + amount);
                } else {
                    throw new CustomInsufficientFundsException("Недостаточно средств для операции",
                            fromAccount.getBalance(), -fromAccount.getLimit());
                }
            }
            else {
                if(fromAccount.getLimit() - Math.abs(fromAccount.getBalance()) >= amount){
                    fromAccount.setBalance(fromAccount.getBalance() - amount);
                    toAccount.setBalance(toAccount.getBalance() + amount);
                } else {
                    throw new CustomInsufficientFundsException("Недостаточно средств для операции",
                            fromAccount.getBalance(), -fromAccount.getLimit());
                }
            }
        } else {
            if(fromAccount.getBalance() >= amount){
                fromAccount.setBalance(fromAccount.getBalance() - amount);
                toAccount.setBalance(toAccount.getBalance() + amount);
            } else {
                throw new CustomInsufficientFundsException(String.format("Недостаточно средств для операции. " +
                                "Баланс = %d", fromAccount.getBalance()));
            }
        }
    }
}

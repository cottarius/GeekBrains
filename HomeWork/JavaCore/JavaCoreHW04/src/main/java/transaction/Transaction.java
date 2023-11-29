package transaction;

import model.Account;

public class Transaction {

    public void transact (Account fromAccount, Account toAccount, int amount){
        if(fromAccount.getBalance() - amount > 0) {
            fromAccount.setBalance(fromAccount.getBalance() - amount);
            toAccount.setBalance(toAccount.getBalance() + amount);
        }
    }
}

package model;

import exception.CustomIllegalArgumentException;
import exception.CustomInsufficientFundsException;

public class CreditAccount extends Account {
    private final String typeOfAccount = "Credit Account";
    private final int limit;

    private CreditAccount(int balance) {
        super(balance);
        this.limit = 10000;
    }

    public static CreditAccount create(int balance) throws CustomIllegalArgumentException {
        if (balance >= 0) {
            return new CreditAccount(balance);
        } else {
            throw new CustomIllegalArgumentException("Попытка ввода отрицательного лимита");
        }
    }

    /**
     * Пополнение счёта
     * @param amount сумма внесения
     * @throws CustomIllegalArgumentException Попытка внести отрицательную сумму
     */
    public void makeDebit(int amount) throws CustomIllegalArgumentException {
        if (amount >= 0) {
            this.balance += amount;
        } else {
            throw new CustomIllegalArgumentException("Попытка внести отрицательную сумму");
        }
    }

    /**
     * Снятие денежных средств с кредитной карты
     * @param amount сумма снятия
     * @throws CustomInsufficientFundsException Превышен лимит кредитного счета
     */
    public void makeWithdrawal(int amount) throws CustomInsufficientFundsException {
        if (balance < 0) {
            if (limit - Math.abs(this.balance) > amount) {
                balance -= amount;
            } else {
                throw new CustomInsufficientFundsException(String.format("Превышен лимит \"%s\".", typeOfAccount),
                        balance, -limit);
            }
        } else {
            if(balance + limit > amount){
                balance -= amount;
            } else {
                throw new CustomInsufficientFundsException(String.format("Превышен лимит \"%s\".", typeOfAccount),
                        balance, -limit);
            }
        }
    }

    @Override
    public void printBalance() {
        System.out.printf("Баланс счета \"%s\" \"%d\" = %d\n",typeOfAccount, id, balance);
    }
}

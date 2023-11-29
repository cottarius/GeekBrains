package model;

import exception.*;
public class DebitAccount extends Account {
    private final String typeOfAccount = "Debit Account";

    private DebitAccount(int balance) {
        super(balance);
    }

    /**
     * Создание объекта класса
     * @param balance начальный баланс
     * @return объект класса
     * @throws CustomIllegalArgumentException ввод отрицательной суммы
     */
    public static DebitAccount create(int balance) throws CustomIllegalArgumentException {
        if(balance < 0){
            throw new CustomIllegalArgumentException("Попытка открытия счёта с отрицательной суммой!");
        }
        return new DebitAccount(balance);
    }

    // region Methods

    /**
     * Снятие денежных средств
     * @param amount сумма снятия
     * @throws CustomInsufficientFundsException недостаточно средств
     */
    public void makeWithdrawal(int amount) throws CustomInsufficientFundsException {
        if(amount < this.balance) {
            this.balance -= amount;
        } else {
            throw new CustomInsufficientFundsException("Недостаточно средств");
        }
    }

    /**
     * Внесение средств на счёт
     * @param amount сумма внесения
     * @throws CustomIllegalArgumentException Попытка внести нулевую или отрицательную сумму
     */
    public void makeDebit(int amount) throws CustomIllegalArgumentException {
        if(amount > 0) {
            this.balance += amount;
        } else {
            throw new CustomIllegalArgumentException("Попытка внести нулевую или отрицательную сумму");
        }
    }

    //endregion


    public int getBalance() {
        return balance;
    }

    @Override
    public void printBalance() {
        System.out.printf("Баланс счета \"%s\" \"%d\" = %d\n",typeOfAccount, id, balance);
    }
}

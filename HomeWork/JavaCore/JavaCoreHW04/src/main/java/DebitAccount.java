class DebitAccount extends Account{
    private final String type;

    private DebitAccount(int deposit) {
        super(deposit);
        this.type = "Debit Account";
    }


    /**
     * Создание объекта класса
     * @param deposit начальный баланс
     * @return объект класса
     * @throws CustomIllegalArgumentException ввод отрицательной суммы
     */
    public static DebitAccount create(int deposit) throws CustomIllegalArgumentException {
        if(deposit < 0){
            throw new CustomIllegalArgumentException("Попытка открытия счёта с отрицательной суммой!");
        }
        return new DebitAccount(deposit);
    }

    /**
     * Снятие денежных средств
     * @param amount сумма снятия
     */
    public void makeWithdrawal(int amount) throws CustomInsufficientFundsException {
        if(amount < super.deposit) {
            super.deposit -= amount;
        } else {
            throw new CustomInsufficientFundsException("Недостаточно средств");
        }
    }

    /**
     * Внесение средств на счёт
     * @param amount сумма внесения
     */
    public void makeDebit(int amount){
        setBalance(amount);
    }

}

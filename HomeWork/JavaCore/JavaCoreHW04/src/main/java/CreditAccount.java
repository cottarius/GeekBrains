import java.util.Random;

public class CreditAccount extends Account{
    private String type;
    private int limit;
    private CreditAccount(int balance, int limit) {
        super(balance);
        this.limit = limit;
        this.type = "CreditCard";
    }

//    private static CreditAccount create (int limit){
//
//        return new CreditAccount(limit);
//    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * Пополнение счёта
     * @param amount сумма внесения
     */
    public void depositing(int amount){

    }
    public void withdrawal(int amount){

    }
}

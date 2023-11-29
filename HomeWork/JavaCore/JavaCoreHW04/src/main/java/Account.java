import java.util.Random;

public abstract class Account {
    protected final int id;
    protected int deposit;
    private static final Random random = new Random();

    public Account(int deposit) {
        this.id = random.nextInt(100, 1000);
        this.deposit = deposit;
    }



    public int getId() {
        return id;
    }

    public int getBalance() {
        return deposit;
    }

    public void setBalance(int deposit) {
        this.deposit = deposit;
    }
    public void printBalance(){
        System.out.printf("Баланс счета %d - %d", id, deposit);
    }
}

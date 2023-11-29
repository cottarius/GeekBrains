package model;

import java.util.Random;

public abstract class Account {
    protected final int id;
    protected int balance;
    private static final Random random = new Random();

    public Account(int balance) {
        this.id = random.nextInt(100, 1000);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public abstract void printBalance();
}

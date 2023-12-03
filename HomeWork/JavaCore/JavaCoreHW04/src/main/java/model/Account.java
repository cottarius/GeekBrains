package model;

import java.util.Random;

public abstract class Account {
    protected final int id;
    protected int balance;
    protected int limit;
    protected boolean isCredit;
    private static final Random random = new Random();

    public Account(int balance, int limit) {
        this.id = random.nextInt(900, 1000);
        this.balance = balance;
        this.limit = limit;
        isCredit = false;
    }
    public Account(int balance){
        this.id = random.nextInt(900, 1000);
        this.balance = balance;
        limit = Integer.MAX_VALUE;
        isCredit = false;
    }

    public boolean isCredit() {
        return isCredit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setCredit(boolean credit) {
        isCredit = credit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public abstract void printBalance();
}

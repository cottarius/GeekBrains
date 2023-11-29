public class Main {
    public static void main(String[] args) {
        try {
            DebitAccount account1 = DebitAccount.create(5);
            account1.deposit = 234;
            Account account2 = DebitAccount.create(1000);
        } catch (CustomIllegalArgumentException ex){
            System.out.println("Попытка ввода отрицательного баланса");
        }

    }
}

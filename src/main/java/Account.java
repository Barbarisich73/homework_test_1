public abstract class Account {
    public int balance;

    public abstract boolean pay(int amount);

    public abstract boolean transfer(Account account, int amount);

    public abstract boolean addMoney(int amount);

}

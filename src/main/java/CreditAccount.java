public class CreditAccount extends Account {

    CreditAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean pay(int amount) {
        balance -= amount;
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (account.addMoney(amount)) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean addMoney(int amount) {
        if (balance + amount > 0) {
            return false;
        }
        balance += amount;
        return true;
    }
}

public class SavingAccount extends Account {

    SavingAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean pay(int amount) {
        return false;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (balance < amount) {
            return false;
        }
        if (account.addMoney(amount)) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean addMoney(int amount) {
        balance += amount;
        return true;
    }
}

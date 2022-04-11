public class CheckingAccount extends Account {

    CheckingAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean pay(int amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
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

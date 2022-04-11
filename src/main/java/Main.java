public class Main {

    public static void main(String[] args) {
        Account savingAccount = new SavingAccount(200);
        Account creditAccount = new CreditAccount(-300);
        Account checkingAccount = new CheckingAccount(1000);

        checkingAccount.transfer(creditAccount, 600);
        System.out.println("Баланс расчетного счета: " + checkingAccount.balance);
        System.out.println("Баланс кредитного счета: " + creditAccount.balance);
    }

}



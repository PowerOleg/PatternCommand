public class AddMoney implements Command{
    private BankAccount bankAccount;
    private int ammount;

    public AddMoney(BankAccount bankAccount, int ammount) {
        this.bankAccount = bankAccount;
        this.ammount = ammount;
    }

    @Override
    public void execute() {
        bankAccount.setBalance(bankAccount.getBalance()+ammount);
    }
}



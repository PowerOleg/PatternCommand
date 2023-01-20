//(важно)это операция у которой появилась функция execute
// и самое главное, что мы ТУТ прописываем что эта операция execute делает
//и для другой операции мы переопределяем это слово execute, т.е. слово одно а делает разное

public class WithdrawMoney implements Command {
    private BankAccount bankAccount;
    private int ammount;

    public WithdrawMoney(BankAccount bankAccount, int ammount) {
        this.bankAccount = bankAccount;
        this.ammount = ammount;
    }

    @Override
    public void execute() {
    bankAccount.setBalance(bankAccount.getBalance()-ammount);
    }
}

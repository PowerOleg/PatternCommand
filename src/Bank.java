////у нас одна кнопка command, но вся соль - какой функционал мы в нее закладываем


//это Main              ////у нас одна кнопка command, но вся соль - какой функционал мы в нее закладываем
public class Bank {
    private Command command;

    void operation(BankAccount bankAccount, int ammount){
        if (ammount < 0) {
            ammount = Math.abs(ammount);                                      //берем по модулю
            command = new WithdrawMoney(bankAccount, ammount);

        } else /* if (ammount > 0)*/ {
            command = new AddMoney(bankAccount, ammount);
        }
        command.execute();

    }

    public static void main(String[] args) {
    BankAccount bankAccount1 = new BankAccount("Andrew");
    BankAccount bankAccount2 = new BankAccount("Olga");

    Bank bank = new Bank();
    bank.operation(bankAccount1, 100);
    bank.operation(bankAccount2, 1000);
    bank.operation(bankAccount1, -1000);
    bank.operation(bankAccount2, -1000);

        System.out.printf("Balance %s = %s$\n", bankAccount1.getFullName(), bankAccount1.getBalance());
        System.out.printf("Balance %s = %s$\n", bankAccount2.getFullName(), bankAccount2.getBalance());

    }
}


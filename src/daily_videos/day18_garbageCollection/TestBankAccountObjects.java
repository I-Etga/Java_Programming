package daily_videos.day18_garbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.setInfo("Gadir", 123456789);
        System.out.println(bankAccount1);

        bankAccount1.balance = 5600;

        bankAccount1.deposit(-2000);

        bankAccount1.checkBalance();

        bankAccount1.withdraw(7000);

        bankAccount1.checkBalance();





    }
}

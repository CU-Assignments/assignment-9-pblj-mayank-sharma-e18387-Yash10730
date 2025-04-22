package hard;

public class TestTransaction {
    public static void main(String[] args) {
        BankService bankService = new BankServiceImpl();

        bankService.transferMoney(101, 102, 500.0); // successful
        bankService.transferMoney(101, 102, 10000.0); // should fail if insufficient balance
    }
}

public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts
        Account acc1 = new Account(1, 5000);
        Account acc2 = new Account(2, 4000);

        // Display initial balances
        System.out.println("Initial Balances:");
        System.out.println("Account 1: $" + acc1.getBalance());
        System.out.println("Account 2: $" + acc2.getBalance());

        // Transfer $1000 from acc1 to acc2
        acc1.transfer(acc2, 1000);

        // Display balances after transfer
        System.out.println("\nBalances after transfer:");
        System.out.println("Account 1: $" + acc1.getBalance());
        System.out.println("Account 2: $" + acc2.getBalance());
    }
}

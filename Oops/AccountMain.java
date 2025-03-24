package Oops;
import java.util.Scanner;
public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an account with an initial balance
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        Account account = new Account(initialBalance);

        // Deposit operation
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Withdraw operation
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final balance
        account.displayBalance();

        scanner.close();
    }
}

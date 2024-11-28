package banking.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = null;

        System.out.println("Welcome to the Banking App!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account ID: ");
                    String accountId = scanner.next();
                    account = new Account(accountId);
                    System.out.println("Account created successfully.");
                    break;
                case 2:
                    if (account != null) {
                        System.out.println("Current balance: " + account.getBalance());
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the Banking App. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
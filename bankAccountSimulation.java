import java.util.Scanner;

public class bankAccountSimulation {
    private static double balance = 0.0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Bank Account Simulation");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Thank you for using the Bank Account Simulation. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void createAccount() {
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        balance = initialBalance;
        System.out.println("Account created with initial balance: " + initialBalance);
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Amount deposited successfully. New balance: " + balance);
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + balance);
        }
    }

    private static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
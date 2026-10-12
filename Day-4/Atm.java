import java.util.Scanner;
class Account {
    private int balance;
    private long accountNo;
    private String name;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid deposit amount.");
            return;
        }

        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Current Balance: " + balance);
    }
}

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a1 = new Account();

        System.out.print("Enter Account No: ");
        a1.setAccountNo(sc.nextLong());

        sc.nextLine(); // Consume the newline

        System.out.print("Enter Name: ");
        a1.setName(sc.nextLine());

        System.out.print("Enter Initial Balance: ");
        a1.setBalance(sc.nextInt());

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    a1.deposit(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    a1.withdraw(sc.nextInt());
                    break;

                case 3:
                    System.out.println(
                        "Current Balance: " + a1.getBalance()
                    );
                    break;

                case 4:
                    a1.displayDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println(
                        "Invalid choice. Please try again."
                    );
            }

        } while (choice != 5);

        sc.close();
    }
}

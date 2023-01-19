
import java.util.Scanner;

public class Account {

private int id;
private double balance;
private static double annualIntrestRate;
private java.util.Date dateCreated;

public Account() {

}

public Account(int id) {
    this.id = id;
    balance = 100;
    dateCreated = new java.util.Date();

}

public void setAnnualIntrest(double intrest) {
    annualIntrestRate = intrest;

}

public void setBalance(double newBalance) {
    balance = newBalance;
}

public void setID(int newID) {
    id = newID;
}

public double getBalance() {
    return balance;
}
public int getID() {
    return id;
}

public java.util.Date getDate() {
    return dateCreated;
}

public static double getMonthlyIntrestRate() {

    return ((annualIntrestRate / 12) / 100);
}

public double getMonthlyIntrest() {
    return (balance * getMonthlyIntrestRate());
}

public double withDraw(double withDrawAmount) {
    return balance = balance - withDrawAmount;
}

public double deposit(double depositeAmount) {
    return balance = balance + depositeAmount;
}
public static void main(String[] args) {

    Account[] accounts = new Account[10];
    for (int i = 0; i < accounts.length; i++) {
        accounts[i] = new Account(i);
    }

    Scanner ob = new Scanner(System.in);

    System.out.print("Enter an ID: ");
    int enteredID = ob.nextInt();
    boolean shouldExit = false;

    while (true) {

        if (enteredID >9) {

            System.out.print("enter correct id: ");
            enteredID = ob.nextInt();



        }
		 if (enteredID == accounts[enteredID].getID()) {


            System.out.println("\nMain Menu: ");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");

            System.out.print("Enter a choice: ");
            int choice = ob.nextInt();

            if (choice == 1) {
                System.out.println("The balance is: " + accounts[enteredID].getBalance());
                continue;
            } else if (choice == 2) {
                System.out.print("Enter withdraw amount: ");
                int withdrawAmount = ob.nextInt();
                accounts[enteredID].withDraw(withdrawAmount);
                continue;
            } else if (choice == 3) {
                System.out.print("Enter deposit amount: ");
                int depositAmount = ob.nextInt();
                accounts[enteredID].deposit(depositAmount);
                continue;
            }

            shouldExit = false;
            while (!shouldExit) {
                if (choice == 4) {
                    System.out.print("Enter an ID: ");
                    enteredID = ob.nextInt();

                    shouldExit = true;


                }
				//to exits completely, just enter a negative number, it will show an error and you will be out of program
            }
        }


    }
}
}
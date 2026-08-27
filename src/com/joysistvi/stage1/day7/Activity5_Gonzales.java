package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class Activity5_Gonzales {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double balance = 5000.00;
        int choice;
        double depositAmount;
        double withdrawAmount;

        System.out.println("=== SIMPLE ATM MENU ===");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");

        System.out.print("Enter choice (1-4): ");
        choice = input.nextInt();

        switch (choice) {

                // Check balance
            case 1:
                System.out.println("Your current balance is: " + balance);
                break;

                // Deposit
            case 2:
                System.out.print("Enter amount to deposit: ");
                depositAmount = input.nextDouble();

                // Validation
                if (depositAmount > 0) {

                    balance = balance + depositAmount;

                    System.out.println(
                            "Deposit successful. New balance: " + balance
                    );

                } else {

                    System.out.println("Invalid deposit amount.");
                }

                break;

                // Withdraw
            case 3:
                System.out.print("Enter amount to withdraw: ");
                withdrawAmount = input.nextDouble();

                // Nested validation
                if (withdrawAmount > 0) {

                    if (withdrawAmount <= balance) {

                        balance = balance - withdrawAmount;

                        System.out.println(
                                "Withdrawal successful. New balance: " + balance
                        );

                    } else {

                        System.out.println(
                                "Insufficient balance. Your current balance is: " + balance
                        );
                    }

                } else {

                    System.out.println("Invalid withdrawal amount.");
                }

                break;

                // Exit
            case 4:
                System.out.println("Thank you for using Simple ATM. Goodbye!");
                break;

                // Invalid menu choice
            default:
                System.out.println("Invalid choice.");
        }

        input.close();


    }
}

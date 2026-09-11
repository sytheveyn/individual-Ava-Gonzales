package com.joysistvi.stage2.day17;

import java.util.Scanner;

public class Activity13_Gonzales_Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*************************************");
        System.out.println("*     User Account Registration     *");
        System.out.println("*************************************");

        System.out.println();

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Address: ");
        String address = input.nextLine();


        String email;

        do {

            System.out.print("Enter Email: ");
            email = input.nextLine();

            if (!Activity13_Gonzales_Account.isValidEmail(email)) {

                System.out.println("Invalid email. Example: ava@gmail.com");
            }

        } while (!Activity13_Gonzales_Account.isValidEmail(email));


        String password;

        do {

            System.out.print("Enter Password: ");
            password = input.nextLine();

            if (!Activity13_Gonzales_Account.isValidPassword(password)) {

                System.out.println("Invalid password. Use at least " + "8 characters, one letter, " + "and one number.");
            }

        } while (!Activity13_Gonzales_Account.isValidPassword(password));
        

        Activity13_Gonzales_Account user = new Activity13_Gonzales_Account(
                firstName,
                middleName,
                lastName,
                address,
                email,
                password
        );


        /*
        Getters are used because the fields
        inside UserAccount are private.
        */

        System.out.println();
        System.out.println("--- User Account Created ---");

        System.out.println("Full Name: " + user.getFullName());

        System.out.println("Address: " + user.getAddress());

        System.out.println("Email: " + user.getEmail());

        input.close();
    }

}

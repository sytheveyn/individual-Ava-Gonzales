package com.joysistvi.stage2.day17;

public class Activity13_Gonzales_Account {


    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;


    public Activity13_Gonzales_Account() {
    }


    public Activity13_Gonzales_Account(
            String firstName,
            String middleName,
            String lastName,
            String address,
            String email,
            String password
    ) {

        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setAddress(address);
        setEmail(email);
        setPassword(password);
    }


    // return information.

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    // Setters change information.

    public void setFirstName(String firstName) {
        this.firstName = firstName.trim();
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName.trim();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.trim();
    }

    public void setAddress(String address) {
        this.address = address.trim();
    }

    public void setEmail(String email) {

        if (!isValidEmail(email)) {throw new IllegalArgumentException("Invalid email format.");
        }

        this.email = email.trim();
    }

    public void setPassword(String password) {

        if (!isValidPassword(password)) {
            throw new IllegalArgumentException(
                    "Invalid password."
            );
        }

        this.password = password;
    }


    public String getFullName() {
        return firstName + " "
                + middleName + " "
                + lastName;
    }


    public static boolean isValidEmail(String email) {

        if (email == null || email.contains(" ")) {
            return false;
        }

        int atPosition = email.indexOf('@');
        int lastAtPosition = email.lastIndexOf('@');
        int dotPosition = email.lastIndexOf('.');

        return atPosition > 0
                && atPosition == lastAtPosition
                && dotPosition > atPosition + 1
                && dotPosition < email.length() - 1;
    }


    /*
    Password validation rules:

    1. At least 8 characters.
    2. At least one letter.
    3. At least one number.
    */

    public static boolean isValidPassword(String password) {

        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasLetter = false;
        boolean hasNumber = false;

        for (int index = 0;
             index < password.length();
             index++) {

            char character = password.charAt(index);

            if (Character.isLetter(character)) {hasLetter = true;
            }

            if (Character.isDigit(character)) {hasNumber = true;
            }
        }

        return hasLetter && hasNumber;
    }
}

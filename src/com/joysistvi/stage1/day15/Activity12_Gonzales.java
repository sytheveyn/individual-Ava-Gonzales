package com.joysistvi.stage1.day15;

public class Activity12_Gonzales {
    public static void main(String[] args) {
        int number = 7;
        String numberType = identifyOddOrEven(number);
        System.out.println(" " + number + " is " + numberType + ".");


        System.out.println("\n Printing my name 50 times:");
        printName50Times("Ava");

        double squareRootNumber = 81;
        double squareRoot = getSquareRoot(squareRootNumber);
        System.out.println("\n Square root of "
                + squareRootNumber + " = " + squareRoot);

        double base = 2;
        double exponent = 5;
        double power = getPower(base, exponent);
        System.out.println(base + " raised to " + exponent + " = " + power);

        int randomNumber = getRandomNumber();
        System.out.println("Random number from 1 to 100: "
                + randomNumber);

        double radius = 5;
        double area = getCircleArea(radius);
        System.out.printf("Area of a circle with radius %.1f = %.2f%n", radius, area);

        int age = 23;
        boolean voter = isVoter(age);

        if (voter) {System.out.println("Age " + age + ": Eligible to vote.");
        } else {
            System.out.println("Age " + age
                    + ": Not eligible to vote.");
        }

        String word = "Programming";
        int wordLength = getWordLength(word);
        System.out.println("Length of \"" + word + "\" = " + wordLength);


        String wordToReverse = "Java";
        String reversedWord = reverseWord(wordToReverse);
        System.out.println("Reverse of \"" + wordToReverse + "\" = \"" + reversedWord + "\"");


        System.out.println("Personal information:");
        printFullNameAndAge("Ava Julie Chua Gonzales", 23);
    }


    public static String identifyOddOrEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }


    public static void printName50Times(String name) {
        for (int count = 1; count <= 50; count++) {
            System.out.println(count + ". " + name);
        }
    }


    public static double getSquareRoot(double number) {
        return Math.sqrt(number);
    }


    public static double getPower(double base, double exponent) {
        return Math.pow(base, exponent);
    }


    public static int getRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }


    public static double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }


    public static boolean isVoter(int age) {
        return age >= 18;
    }


    public static int getWordLength(String word) {
        return word.length();
    }


    public static String reverseWord(String word) {
        String reversedWord = "";

        for (int index = word.length() - 1; index >= 0; index--) {
            reversedWord = reversedWord + word.charAt(index);
        }

        return reversedWord;
    }


    public static void printFullNameAndAge(String fullName, int age) {
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);



    }
}

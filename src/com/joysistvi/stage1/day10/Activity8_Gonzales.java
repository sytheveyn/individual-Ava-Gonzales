package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class Activity8_Gonzales {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];


        int sum = 0;

        System.out.println("Enter 5 numbers:");


        for (int i = 0; i < numbers.length; i++) {


            System.out.print("Number " + (i + 1) + ": ");

            numbers[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("You entered:");


        for (int i = 0; i < numbers.length; i++) {


            System.out.println("Index " + i + ": " + numbers[i]);


            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);


        int highest = numbers[0];
        int lowest = numbers[0];


        for (int i = 1; i < numbers.length; i++) {

            // Replace highest if the current value is bigger.
            if (numbers[i] > highest) {
                highest = numbers[i];
            }

            // Replace lowest if the current value is smaller.
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);


        input.close();



    }
}

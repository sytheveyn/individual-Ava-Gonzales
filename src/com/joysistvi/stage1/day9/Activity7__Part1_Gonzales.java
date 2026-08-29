package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7__Part1_Gonzales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a multiplication table: ");
        int table = input.nextInt();

        System.out.println("Multiplication Table of " + table);

        for (int multiplier = 1; multiplier <= 10; multiplier++) {

            int product = table * multiplier;

            System.out.println(
                    table + " * " + multiplier + " = " + product
            );
        }

        input.close();





    }
}

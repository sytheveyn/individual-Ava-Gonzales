package com.joysistvi.stage1.day9;

public class Activity7_Part2_Gonzales {

    public static void main(String[] args) {


        for (int i = 2; i <= 20; i++) { //outer loop


            for (int j = 2; j <= 20; j++) { //inner for loop
                int product = i * j;
                System.out.println(i + " * " + j + " = " + product);
            }

            System.out.println(); // new line
        }




    }
}


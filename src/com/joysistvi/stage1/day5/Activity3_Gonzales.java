package com.joysistvi.stage1.day5;

public class Activity3_Gonzales {
    public static void main(String[] args) {

        int age = 18;
        boolean hasValidId = true;

        String allowed = age >= 18 && hasValidId ? "Yes" : "No";
        System.out.println("Task 2 : Event Entry Check");
        System.out.println("Allowed to enter the event: " + allowed);
        //Allowed to enter the event : Yes / No

        boolean isWeekend = true;
        boolean isHoliday = false;

        boolean noClass = isWeekend && isHoliday;
        String classAnswer = noClass ? "Yes, no classes" : "No, there are classes";

        System.out.println("Task 3 : Event Entry Check");
        System.out.println("Are there classes today?" + " " + classAnswer);
        // Weekend && Holiday

        int score = 85;

        String result = (score > 75) ? "Passed" : "Failed";

        System.out.println("Task 4: Pass or Fail Check");
        System.out.println("Score: " + score);
        System.out.println("Result: " + result);
        //Passed or Failed

        int num = 10;
        int num2 = 25;

        int largerNumber = (num > num2) ? num : num2;
        System.out.println("Task 5: Larger Number Check");
        System.out.println("Number 1: " + num + ", Number 2: " + num2);
        System.out.println("The larger number is: " + largerNumber);




    }
}

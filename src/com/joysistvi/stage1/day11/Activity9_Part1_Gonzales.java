package com.joysistvi.stage1.day11;

import java.util.Scanner;

//Grades Average Report Generator (Multi - Dimensional Array)
public class Activity9_Part1_Gonzales {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("           Average Calculator");
        System.out.println("========================================");


        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = input.nextInt();

        input.nextLine();

        String[] subjectNames = new String[numberOfSubjects];

        System.out.println();
        System.out.println("Enter subject names:");

        // This loop receives every subject name.
        for (int subject = 0; subject < numberOfSubjects; subject++) {

            System.out.print("Subject " + (subject + 1) + ": ");

            subjectNames[subject] = input.nextLine();
        }

        /*
          Store the names of all students.

          Example:
          studentNames[0] = "Winter"
          studentNames[1] = "Summer"
         */

        String[] studentNames = new String[numberOfStudents];

        /*
         two-dimensional grades array.

         First position  = student
         Second position = subject

         grades[student][subject]
         */
        int[][] grades =
                new int[numberOfStudents][numberOfSubjects];

         //Store the calculated average of every student.
        double[] averages = new double[numberOfStudents];

        /*
         // outer loop : moves from one student to the next.
         */
        for (int student = 0; student < numberOfStudents; student++) {
            System.out.println();
            System.out.print("Name of Student " + (student + 1) + ": ");

            studentNames[student] = input.nextLine();

            System.out.println("Enter grades for each subject:");


            int sum = 0;

              //inner loop: Receives the current student's grade for every subject
            for (int subject = 0; subject < numberOfSubjects; subject++) {

                 // Display the current subject's name.
                System.out.print(subjectNames[subject] + ": ");


                 // Store the grade in the correct row and column of the two-dimensional array.
                grades[student][subject] =
                        input.nextInt();

                // Add the current grade to the student's sum.
                sum += grades[student][subject];
            }


            averages[student] = (double) sum / numberOfSubjects;
            input.nextLine();
        }



        //report title.
        System.out.println();
        System.out.println("========================================");
        System.out.println("             Grades Report");
        System.out.println("========================================");

        System.out.printf("%-15s", "Student");

        // to display subject name as a column title.
        for (int subject = 0; subject < numberOfSubjects; subject++) {

            System.out.printf("%-12s", subjectNames[subject]);
        }

        System.out.printf("%-12s%n", "Average");

        int reportWidth = 15 + (numberOfSubjects * 12) + 12;

        for (int line = 0; line < reportWidth; line++) {
            System.out.print("-");
        }

        System.out.println();

         //to display  information of every student.
        for (int student = 0; student < numberOfStudents; student++) {

            // to display Student's name.
            System.out.printf("%-15s", studentNames[student]);


            for (int subject = 0; subject < numberOfSubjects; subject++) {

                System.out.printf("%-12d", grades[student][subject]);
            }


            System.out.printf("%-12.2f%n", averages[student]);
        }

        input.close();





    }
}

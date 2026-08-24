package com.joysistvi.stage1.day4;

public class Activity2_Gonzales {

    public static void main(String[] args) {

        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;
        double percentage = 100;

        double foodAllowanceExpense = foodAllowance / income * percentage;
        double transportationExpense = transportation / income * percentage;
        double rentExpense = rent / income * percentage;
        double utilityBillExpense = utilityBill / income * percentage;

        double sumTotalExpense = foodAllowanceExpense + transportationExpense + rentExpense + utilityBillExpense;
        double remainingBalance = sumTotalExpense / income * percentage;

        System.out.println("Food Allowance:" + foodAllowanceExpense + "%");
        System.out.println("Transportation:" + transportationExpense + "%");
        System.out.println("Rent:" + rentExpense + "%");
        System.out.println("Utility Bill:" + utilityBillExpense + "%");

        System.out.println("Total Expense:" + remainingBalance + "%");
    }
}

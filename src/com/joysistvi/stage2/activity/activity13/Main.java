package com.joysistvi.stage2.activity13;

public class Main {
    public static void main(String[] args) {


        Employee[] employees = {
                new RegularEmployee("Ana", 15000),
                new SalesEmployee("Ben", 12000, 5000),
                new ContractualEmployee("Cruz", 160, 75)
        };


        for (Employee employee : employees) {
            employee.printPayslip();
        }
    }
}

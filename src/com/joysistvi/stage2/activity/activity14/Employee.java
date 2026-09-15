package com.joysistvi.stage2.activity14;

/*
Employee is an abstract parent class.

We cannot create a general Employee object because
every employee type has a different salary formula.
*/
public abstract class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    /*
    Abstract methods have no body here.

    Every child class is required to provide
    its own version of these methods.
    */
    public abstract double computeSalary();

    public abstract String getEmployeeType();

    public abstract double computeDeductions();

    /*
    Net salary = gross salary - deductions
    */
    public double computeNetSalary() {
        return computeSalary() - computeDeductions();
    }

    /*
    This is a concrete method because it already
    contains complete instructions.
    */
    public void printPayslip() {
        System.out.println(
                name + "'s gross salary: " + computeSalary()
                        + " (" + getEmployeeType() + ")"
        );

        System.out.println(
                "Deductions: " + computeDeductions()
        );

        System.out.println(
                "Net salary: " + computeNetSalary()
        );
    }
}

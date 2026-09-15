package com.joysistvi.stage2.activity14;

/*
SalesEmployee is an Employee and can receive a bonus.

It does not implement Auditable,
so it will not produce an audit log.
*/
public class SalesEmployee extends Employee
        implements Bonusable {

    private static final double TAX_RATE = 0.12;

    private double commission;

    public SalesEmployee(
            String name,
            double baseSalary,
            double commission
    ) {
        super(name, baseSalary);
        this.commission = commission;
    }

    /*
    Gross salary = base salary + commission
    */
    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }

    @Override
    public String getEmployeeType() {
        return "Sales Employee";
    }

    /*
    Deductions = gross salary × 12%
    */
    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    /*
    Bonus = commission × 10%
    */
    @Override
    public double computeBonus() {
        return commission * 0.10;
    }

    /*
    The employee receives a bonus only
    when the commission is greater than zero.
    */
    @Override
    public boolean isEligibleForBonus() {
        return commission > 0;
    }
}
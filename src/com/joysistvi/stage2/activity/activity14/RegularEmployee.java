package com.joysistvi.stage2.activity14;

/*
RegularEmployee is an Employee.

It can also receive a bonus and be audited.
*/
public class RegularEmployee extends Employee
        implements Bonusable, Auditable {

    private static final double ATTENDANCE_BONUS = 1000;
    private static final double TAX_RATE = 0.10;

    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    /*
    Gross salary = base salary + attendance bonus
    */
    @Override
    public double computeSalary() {
        return baseSalary + ATTENDANCE_BONUS;
    }

    @Override
    public String getEmployeeType() {
        return "Regular Employee";
    }

    /*
    Deductions = gross salary × 10%
    */
    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    /*
    Bonus = base salary × 5%
    */
    @Override
    public double computeBonus() {
        return baseSalary * 0.05;
    }

    /*
    A regular employee is always eligible
    to receive a bonus.
    */
    @Override
    public boolean isEligibleForBonus() {
        return true;
    }

    @Override
    public String generateEmployeeId() {
        return "REG-" + name.toUpperCase();
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println(
                "Audit log: " + employeeId + " salary computed."
        );
    }
}

package com.joysistvi.stage2.activity14;

/*
ContractualEmployee is an Employee and can be audited.

It does not implement Bonusable,
so it does not have bonus methods.
*/
public class ContractualEmployee extends Employee
        implements Auditable {

    private static final double TAX_RATE = 0.05;

    private int hoursWorked;
    private double hourlyRate;

    public ContractualEmployee(
            String name,
            int hoursWorked,
            double hourlyRate
    ) {
        /*
        Employee requires a base salary.

        We pass 0 because contractual salary
        uses hours worked and hourly rate.
        */
        super(name, 0);

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    /*
    Gross salary = hours worked × hourly rate
    */
    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getEmployeeType() {
        return "Contractual Employee";
    }

    /*
    Deductions = gross salary × 5%
    */
    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public String generateEmployeeId() {
        return "CON-" + name.toUpperCase();
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println(
                "Audit log: " + employeeId + " salary computed."
        );
    }
}

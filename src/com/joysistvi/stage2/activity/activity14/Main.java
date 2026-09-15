package com.joysistvi.stage2.activity14;

public class Main {

    public static void main(String[] args) {

        /*
        One Employee array can contain
        different Employee child objects.
        */
        Employee[] employees = {
                new RegularEmployee("Ana", 15000),
                new SalesEmployee("Ben", 12000, 5000),
                new ContractualEmployee("Cruz", 160, 75)
        };

        for (Employee employee : employees) {

            // Display gross salary, deductions, and net salary.
            employee.printPayslip();

            /*
            Check whether the current object
            has the Bonusable ability.
            */
            if (employee instanceof Bonusable) {

                /*
                Convert the Employee reference
                into a Bonusable reference.
                */
                Bonusable bonusableEmployee =
                        (Bonusable) employee;

                if (bonusableEmployee.isEligibleForBonus()) {
                    System.out.println(
                            "Bonus: "
                                    + bonusableEmployee.computeBonus()
                    );
                }
            }

            /*
            Check whether the current object
            has the Auditable ability.
            */
            if (employee instanceof Auditable) {

                Auditable auditableEmployee =
                        (Auditable) employee;

                String employeeId =
                        auditableEmployee.generateEmployeeId();

                auditableEmployee.logSalaryComputation(employeeId);
            }

            System.out.println(
                    "--------------------------------"
            );
        }
    }


}
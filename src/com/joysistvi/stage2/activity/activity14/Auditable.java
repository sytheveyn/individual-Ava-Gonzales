package com.joysistvi.stage2.activity14;

/*
Auditable represents the ability
to create an employee audit record.
*/
public interface Auditable {

    String generateEmployeeId();

    void logSalaryComputation(String employeeId);
}
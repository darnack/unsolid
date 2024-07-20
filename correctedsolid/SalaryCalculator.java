package com.example.demo.unsolid;

public class SalaryCalculator {

    public double calculateSalary(String name) {
        EmployeeOperations employeeOperations = new EmployeeManager();
        return employeeOperations.calculateSalary(name);
    }
}

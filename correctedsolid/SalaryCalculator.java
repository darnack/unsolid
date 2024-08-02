package com.example.demo.unsolid;

public class SalaryCalculator {

    public double calculateSalary(String name) {
        ISalaryOperations salary = new SalaryOperations();
        return salary.calculateSalary(name);
    }
}

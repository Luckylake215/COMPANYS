package com.company;
public class Operator implements EmployeePosition{
    private double finalSalary;
    private double totalSalary = 0;
    public double getFinalSalary() {
        return finalSalary;
    }
    @Override
    public double getCompanyIncome() {
        return 0;
    }
    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double basicSalary) {
        return finalSalary = basicSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}
package com.company;
import java.util.Random;

public class Manager implements EmployeePosition{
    private double finalSalary;
    private double companyIncome;
    private double totalSalary = 0;
    public Manager() {
        Random r = new Random();
        companyIncome = (r.nextInt(25000) + 115000);
    }
    public double getFinalSalary() {
        return finalSalary;
    }
    public double getCompanyIncome() {
        return companyIncome;
    }
    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double basicSalary) {
        return basicSalary + totalSalary * 0.05;
    }

    private Random rand = new Random();

}
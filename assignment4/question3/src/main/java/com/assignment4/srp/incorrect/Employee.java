package com.assignment4.srp.incorrect;

/**
 * Created by student on 2016/03/20.
 */
public class Employee {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /* Invalid section */
    public int calculateAnnualIncome()
    {
        return salary * 12;
    }
}

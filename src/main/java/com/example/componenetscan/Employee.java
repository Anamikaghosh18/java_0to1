package com.example.componenetscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int employee_id ;
    @Value("Anamika")
    private String first_name ;
    @Value("Ghosh")
    private String last_name ;
    @Value("#{10000*10}")
    private double salary;

    public int getEmployee_id() {
        return employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + employee_id + "\n name= " + first_name + "\n" +
                "salary = " + salary + "}";
    }
}

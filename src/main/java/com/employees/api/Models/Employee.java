package com.employees.api.Models;

public class Employee {
   private Long id;
    String name;
    String surname;
     double salary;
    String address;
     String department;

    public Employee(){}
public Employee(Long id, String name, String surname, double salary, String address, String department){
    this.id = id;
    this.name=name;
    this.surname=surname;
    this.address= address;
    this.department=department;
}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" +
                ", name=" +
                ", surname=" +
                ", salary=" +
                ", address=" +
                ", department=";
    }
}

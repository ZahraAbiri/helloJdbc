package ir.maktab58.model;

import java.util.ArrayList;

import java.util.List;

public class Department {
    private int id;
    private String name;
    private String phoneNumber;

  List<Employee> employees=new ArrayList<>();

    public Department() {
    }

    public Department(int id, String name, String phoneNumber, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.employees = employees;
    }

    public Department(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

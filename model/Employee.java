package ir.maktab58.model;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private String family;
    private String EmpId;
    private String birthDay;
    private String departmentName;


    public Employee() {
    }

    public Employee(int id, String name, String family, String empId, String birthDay, String departmentName) {
        this.id = id;
        this.name = name;
        this.family = family;
        EmpId = empId;
        this.birthDay = birthDay;
        this.departmentName = departmentName;

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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String empId) {
        EmpId = empId;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    }

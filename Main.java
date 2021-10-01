package ir.maktab58;

import ir.maktab58.dataAcsess.Database;
import ir.maktab58.model.Department;
import ir.maktab58.model.Employee;

import java.sql.*;

public class Main {


    public static void main(String[] args) throws SQLException {
        Database database = new Database();
        Employee employee = new Employee();
        Department department = new Department();
        employee.setName("sara");
        employee.setFamily("dara");
        employee.setEmpId("123654789852");
        employee.setBirthDay("12-3-5631");
        employee.setDepartmentName("AA");
        database.saveEmp(employee);
        department.setName("A");
        department.setPhoneNumber("09127878523");
        database.saveDep(department);

        department.setName("D");
        department.setId(1);
        database.updateDep(department);
        employee.setName("mahan");
        employee.setFamily("asadipor");
        employee.setId(1);
        database.updateEmp(employee);
        database.findAllDepartment();
        employee.setDepartmentName("AA");
        database.findEmployee(employee);


    }
}

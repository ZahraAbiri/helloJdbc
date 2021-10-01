package ir.maktab58.dataAcsess;

import ir.maktab58.model.Department;
import ir.maktab58.model.Employee;

import java.sql.*;


public class Database {
    String dbURL = "jdbc:mysql://localhost:3306/empdep";
    String username = "root";
    String password = "123qwe";
    Connection connection = null;

    public Database() throws SQLException {
        connection = DriverManager.getConnection(dbURL, username, password);
    }

    public void saveEmp(Employee employee) throws SQLException {
        if (connection != null) {
            String sql = String.format("INSERT INTO employees (name, family, empId, birthDay,departmentName) VALUES ('%S','%S','%S','%S','%S')",
                    employee.getName(), employee.getFamily(), employee.getEmpId(), employee.getBirthDay(), employee.getDepartmentName());
            PreparedStatement statement = connection.prepareStatement(sql);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            } else {
                System.out.println("A new user was not inserted successfully!");
            }
        }
    }

    public void saveDep(Department department) throws SQLException {
        if (connection != null) {
            String sql = String.format("INSERT INTO department (name, phoneNumber) VALUES ('%S','%S')",
                    department.getName(), department.getPhoneNumber());
            PreparedStatement statement = connection.prepareStatement(sql);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            } else {
                System.out.println("A new user was not inserted successfully!");
            }
        }
    }

    public void updateDep(Department department) throws SQLException {
        if (connection != null) {
            String sqlU = String.format("UPDATE department SET name ='%S' where id='%d'", department.getName(), department.getId());
            PreparedStatement statementU = connection.prepareStatement(sqlU);
            int rowsUpdated = statementU.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully!");
            } else {
                System.out.println("A new user was not inserted successfully!");
            }
        }
    }

    public void updateEmp(Employee employee) throws SQLException {
        if (connection != null) {
            String sqlU = String.format("UPDATE employees SET name ='%S',family='%S' where id='%d'",
                    employee.getName(), employee.getFamily(), employee.getId());
            PreparedStatement statementU = connection.prepareStatement(sqlU);
            int rowsUpdated = statementU.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully!");
            } else {
                System.out.println("A new user was not inserted successfully!");
            }
        }
    }

    public void findAllDepartment() throws SQLException {

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select dep.name from department dep");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
    }

    public void findEmployee(Employee employee) throws SQLException {
        String sqlU = String.format("select emp.name,emp.family from employees emp where emp.departmentName='%S'",
                employee.getDepartmentName());
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlU);
        while (resultSet.next()) {
            System.out.print(" name : " + resultSet.getString(1) + " , ");
            System.out.println(" family : " + resultSet.getString(2));

        }
    }

}

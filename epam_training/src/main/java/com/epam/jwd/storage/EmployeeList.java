package com.epam.jwd.storage;

import com.epam.jwd.entity.Employee;
import com.epam.jwd.entity.Job;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static EmployeeList employeeList;
    private final List<Employee> employees = new ArrayList<>();

    public static EmployeeList getInstance() {
        if (employeeList == null) {
            employeeList = new EmployeeList();
        }
        return employeeList;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public boolean searchBarista() {
        if (employees.isEmpty()) {
            return false;
        } else {
            for (Employee e :
                    employees) {
                if (e.getJob() == Job.Barista) {
                    return true;
                }
            }
        }
        return false;
    }
}
